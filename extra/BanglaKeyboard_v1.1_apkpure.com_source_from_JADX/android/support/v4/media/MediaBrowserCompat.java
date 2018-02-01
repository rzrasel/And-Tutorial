package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.C0552a.C0504a;
import android.support.v4.media.C0552a.C0521c;
import android.support.v4.media.C0552a.C0550b;
import android.support.v4.media.C0552a.C0551d;
import android.support.v4.media.C0554b.C0523a;
import android.support.v4.media.C0554b.C0553b;
import android.support.v4.media.session.C0577b;
import android.support.v4.media.session.C0577b.C0579a;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.support.v4.p018f.C0478a;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

public final class MediaBrowserCompat {
    static final boolean f1618a = Log.isLoggable("MediaBrowserCompat", 3);
    public final C0508d f1619b;

    private static class CustomActionResultReceiver extends ResultReceiver {
        private final Bundle f1571d;
        private final C0507c f1572e;

        protected final void mo487a(int i, Bundle bundle) {
            if (this.f1572e != null) {
                switch (i) {
                    case -1:
                    case 0:
                    case 1:
                        return;
                    default:
                        Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f1571d + ", resultData=" + bundle + ")");
                        return;
                }
            }
        }
    }

    private static class ItemReceiver extends ResultReceiver {
        protected final void mo487a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i == 0 && bundle != null && bundle.containsKey("media_item")) {
                bundle.getParcelable("media_item");
            }
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new C05011();
        private final int f1573a;
        private final MediaDescriptionCompat f1574b;

        static class C05011 implements Creator<MediaItem> {
            C05011() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new MediaItem[i];
            }
        }

        MediaItem(Parcel parcel) {
            this.f1573a = parcel.readInt();
            this.f1574b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        private MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (TextUtils.isEmpty(mediaDescriptionCompat.f1694a)) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            } else {
                this.f1573a = i;
                this.f1574b = mediaDescriptionCompat;
            }
        }

        public static List<MediaItem> m1312a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            List<MediaItem> arrayList = new ArrayList(list.size());
            for (Object next : list) {
                Object obj;
                if (next == null || VERSION.SDK_INT < 21) {
                    obj = null;
                } else {
                    obj = new MediaItem(MediaDescriptionCompat.m1381a(((android.media.browse.MediaBrowser.MediaItem) next).getDescription()), ((android.media.browse.MediaBrowser.MediaItem) next).getFlags());
                }
                arrayList.add(obj);
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("MediaItem{");
            stringBuilder.append("mFlags=").append(this.f1573a);
            stringBuilder.append(", mDescription=").append(this.f1574b);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1573a);
            this.f1574b.writeToParcel(parcel, i);
        }
    }

    private static class SearchResultReceiver extends ResultReceiver {
        protected final void mo487a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i == 0 && bundle != null && bundle.containsKey("search_results")) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                if (parcelableArray != null) {
                    List arrayList = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaItem) parcelable);
                    }
                }
            }
        }
    }

    private static class C0502a extends Handler {
        private final WeakReference<C0509i> f1575a;
        private WeakReference<Messenger> f1576b;

        C0502a(C0509i c0509i) {
            this.f1575a = new WeakReference(c0509i);
        }

        final void m1314a(Messenger messenger) {
            this.f1576b = new WeakReference(messenger);
        }

        public final void handleMessage(Message message) {
            if (this.f1576b != null && this.f1576b.get() != null && this.f1575a.get() != null) {
                Bundle data = message.getData();
                data.setClassLoader(MediaSessionCompat.class.getClassLoader());
                C0509i c0509i = (C0509i) this.f1575a.get();
                Messenger messenger = (Messenger) this.f1576b.get();
                try {
                    switch (message.what) {
                        case 1:
                            c0509i.mo494a(messenger, data.getString("data_media_item_id"), (Token) data.getParcelable("data_media_session_token"), data.getBundle("data_root_hints"));
                            return;
                        case 2:
                            c0509i.mo492a(messenger);
                            return;
                        case 3:
                            String string = data.getString("data_media_item_id");
                            data.getParcelableArrayList("data_media_item_list");
                            c0509i.mo493a(messenger, string, data.getBundle("data_options"));
                            return;
                        default:
                            Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                            return;
                    }
                } catch (BadParcelableException e) {
                    if (message.what == 1) {
                        c0509i.mo492a(messenger);
                    }
                }
                if (message.what == 1) {
                    c0509i.mo492a(messenger);
                }
            }
        }
    }

    public static class C0506b {
        final Object f1578a;
        C0503a f1579b;

        interface C0503a {
            void mo491a();

            void mo495b();
        }

        private class C0505b implements C0504a {
            final /* synthetic */ C0506b f1577a;

            C0505b(C0506b c0506b) {
                this.f1577a = c0506b;
            }

            public final void mo488a() {
                if (this.f1577a.f1579b != null) {
                    this.f1577a.f1579b.mo491a();
                }
                this.f1577a.mo507a();
            }

            public final void mo489b() {
                if (this.f1577a.f1579b != null) {
                    this.f1577a.f1579b.mo495b();
                }
                this.f1577a.mo508b();
            }

            public final void mo490c() {
                this.f1577a.mo509c();
            }
        }

        public C0506b() {
            if (VERSION.SDK_INT >= 21) {
                this.f1578a = new C0550b(new C0505b(this));
            } else {
                this.f1578a = null;
            }
        }

        public void mo507a() {
        }

        public void mo508b() {
        }

        public void mo509c() {
        }
    }

    public static abstract class C0507c {
    }

    interface C0508d {
        void mo496c();

        void mo497d();

        Token mo498e();
    }

    interface C0509i {
        void mo492a(Messenger messenger);

        void mo493a(Messenger messenger, String str, Bundle bundle);

        void mo494a(Messenger messenger, String str, Token token, Bundle bundle);
    }

    static class C0510e implements C0503a, C0508d, C0509i {
        final Context f1580a;
        protected final Object f1581b;
        protected final Bundle f1582c;
        protected final C0502a f1583d = new C0502a(this);
        protected C0519j f1584e;
        protected Messenger f1585f;
        private final C0478a<String, C0520k> f1586g = new C0478a();
        private Token f1587h;

        public C0510e(Context context, ComponentName componentName, C0506b c0506b) {
            this.f1580a = context;
            Bundle bundle = new Bundle();
            bundle.putInt("extra_client_version", 1);
            this.f1582c = new Bundle(bundle);
            c0506b.f1579b = this;
            this.f1581b = new MediaBrowser(context, componentName, (ConnectionCallback) c0506b.f1578a, this.f1582c);
        }

        public final void mo491a() {
            Bundle extras = ((MediaBrowser) this.f1581b).getExtras();
            if (extras != null) {
                IBinder binder = BundleCompat.getBinder(extras, "extra_messenger");
                if (binder != null) {
                    this.f1584e = new C0519j(binder, this.f1582c);
                    this.f1585f = new Messenger(this.f1583d);
                    this.f1583d.m1314a(this.f1585f);
                    try {
                        C0519j c0519j = this.f1584e;
                        Messenger messenger = this.f1585f;
                        Bundle bundle = new Bundle();
                        bundle.putBundle("data_root_hints", c0519j.f1609a);
                        c0519j.m1352a(6, bundle, messenger);
                    } catch (RemoteException e) {
                    }
                }
                C0577b a = C0579a.m1555a(BundleCompat.getBinder(extras, "extra_session_binder"));
                if (a != null) {
                    this.f1587h = Token.m1442a(((MediaBrowser) this.f1581b).getSessionToken(), a);
                }
            }
        }

        public final void mo492a(Messenger messenger) {
        }

        public final void mo493a(Messenger messenger, String str, Bundle bundle) {
            if (this.f1585f == messenger) {
                C0520k c0520k = (C0520k) this.f1586g.get(str);
                if (c0520k == null) {
                    boolean z = MediaBrowserCompat.f1618a;
                } else {
                    c0520k.m1353a(this.f1580a, bundle);
                }
            }
        }

        public final void mo494a(Messenger messenger, String str, Token token, Bundle bundle) {
        }

        public final void mo495b() {
            this.f1584e = null;
            this.f1585f = null;
            this.f1587h = null;
            this.f1583d.m1314a(null);
        }

        public final void mo496c() {
            ((MediaBrowser) this.f1581b).connect();
        }

        public final void mo497d() {
            if (!(this.f1584e == null || this.f1585f == null)) {
                try {
                    this.f1584e.m1352a(7, null, this.f1585f);
                } catch (RemoteException e) {
                }
            }
            ((MediaBrowser) this.f1581b).disconnect();
        }

        public final Token mo498e() {
            if (this.f1587h == null) {
                this.f1587h = Token.m1441a(((MediaBrowser) this.f1581b).getSessionToken());
            }
            return this.f1587h;
        }
    }

    static class C0511f extends C0510e {
        public C0511f(Context context, ComponentName componentName, C0506b c0506b) {
            super(context, componentName, c0506b);
        }
    }

    static class C0512g extends C0511f {
        public C0512g(Context context, ComponentName componentName, C0506b c0506b) {
            super(context, componentName, c0506b);
        }
    }

    static class C0518h implements C0508d, C0509i {
        final Context f1596a;
        final ComponentName f1597b;
        final C0506b f1598c;
        final Bundle f1599d;
        final C0502a f1600e = new C0502a(this);
        int f1601f = 1;
        C0517a f1602g;
        C0519j f1603h;
        Messenger f1604i;
        private final C0478a<String, C0520k> f1605j = new C0478a();
        private String f1606k;
        private Token f1607l;
        private Bundle f1608m;

        class C05131 implements Runnable {
            final /* synthetic */ C0518h f1588a;

            C05131(C0518h c0518h) {
                this.f1588a = c0518h;
            }

            public final void run() {
                if (this.f1588a.f1601f != 0) {
                    this.f1588a.f1601f = 2;
                    if (MediaBrowserCompat.f1618a && this.f1588a.f1602g != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + this.f1588a.f1602g);
                    } else if (this.f1588a.f1603h != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + this.f1588a.f1603h);
                    } else if (this.f1588a.f1604i != null) {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + this.f1588a.f1604i);
                    } else {
                        Intent intent = new Intent("android.media.browse.MediaBrowserService");
                        intent.setComponent(this.f1588a.f1597b);
                        this.f1588a.f1602g = new C0517a(this.f1588a);
                        boolean z = false;
                        try {
                            z = this.f1588a.f1596a.bindService(intent, this.f1588a.f1602g, 1);
                        } catch (Exception e) {
                            new StringBuilder("Failed binding to service ").append(this.f1588a.f1597b);
                        }
                        if (!z) {
                            this.f1588a.m1344a();
                            this.f1588a.f1598c.mo509c();
                        }
                        if (MediaBrowserCompat.f1618a) {
                            this.f1588a.m1348b();
                        }
                    }
                }
            }
        }

        class C05142 implements Runnable {
            final /* synthetic */ C0518h f1589a;

            C05142(C0518h c0518h) {
                this.f1589a = c0518h;
            }

            public final void run() {
                if (this.f1589a.f1604i != null) {
                    try {
                        this.f1589a.f1603h.m1352a(2, null, this.f1589a.f1604i);
                    } catch (RemoteException e) {
                        Log.w("MediaBrowserCompat", "RemoteException during connect for " + this.f1589a.f1597b);
                    }
                }
                int i = this.f1589a.f1601f;
                this.f1589a.m1344a();
                if (i != 0) {
                    this.f1589a.f1601f = i;
                }
                if (MediaBrowserCompat.f1618a) {
                    this.f1589a.m1348b();
                }
            }
        }

        private class C0517a implements ServiceConnection {
            final /* synthetic */ C0518h f1595a;

            C0517a(C0518h c0518h) {
                this.f1595a = c0518h;
            }

            private void m1340a(Runnable runnable) {
                if (Thread.currentThread() == this.f1595a.f1600e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    this.f1595a.f1600e.post(runnable);
                }
            }

            final boolean m1341a(String str) {
                if (this.f1595a.f1602g == this && this.f1595a.f1601f != 0 && this.f1595a.f1601f != 1) {
                    return true;
                }
                if (!(this.f1595a.f1601f == 0 || this.f1595a.f1601f == 1)) {
                    new StringBuilder().append(str).append(" for ").append(this.f1595a.f1597b).append(" with mServiceConnection=").append(this.f1595a.f1602g).append(" this=").append(this);
                }
                return false;
            }

            public final void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                m1340a(new Runnable(this) {
                    final /* synthetic */ C0517a f1592c;

                    public final void run() {
                        if (MediaBrowserCompat.f1618a) {
                            new StringBuilder("MediaServiceConnection.onServiceConnected name=").append(componentName).append(" binder=").append(iBinder);
                            this.f1592c.f1595a.m1348b();
                        }
                        if (this.f1592c.m1341a("onServiceConnected")) {
                            this.f1592c.f1595a.f1603h = new C0519j(iBinder, this.f1592c.f1595a.f1599d);
                            this.f1592c.f1595a.f1604i = new Messenger(this.f1592c.f1595a.f1600e);
                            this.f1592c.f1595a.f1600e.m1314a(this.f1592c.f1595a.f1604i);
                            this.f1592c.f1595a.f1601f = 2;
                            try {
                                if (MediaBrowserCompat.f1618a) {
                                    this.f1592c.f1595a.m1348b();
                                }
                                C0519j c0519j = this.f1592c.f1595a.f1603h;
                                Context context = this.f1592c.f1595a.f1596a;
                                Messenger messenger = this.f1592c.f1595a.f1604i;
                                Bundle bundle = new Bundle();
                                bundle.putString("data_package_name", context.getPackageName());
                                bundle.putBundle("data_root_hints", c0519j.f1609a);
                                c0519j.m1352a(1, bundle, messenger);
                            } catch (RemoteException e) {
                                Log.w("MediaBrowserCompat", "RemoteException during connect for " + this.f1592c.f1595a.f1597b);
                                if (MediaBrowserCompat.f1618a) {
                                    this.f1592c.f1595a.m1348b();
                                }
                            }
                        }
                    }
                });
            }

            public final void onServiceDisconnected(final ComponentName componentName) {
                m1340a(new Runnable(this) {
                    final /* synthetic */ C0517a f1594b;

                    public final void run() {
                        if (MediaBrowserCompat.f1618a) {
                            new StringBuilder("MediaServiceConnection.onServiceDisconnected name=").append(componentName).append(" this=").append(this).append(" mServiceConnection=").append(this.f1594b.f1595a.f1602g);
                            this.f1594b.f1595a.m1348b();
                        }
                        if (this.f1594b.m1341a("onServiceDisconnected")) {
                            this.f1594b.f1595a.f1603h = null;
                            this.f1594b.f1595a.f1604i = null;
                            this.f1594b.f1595a.f1600e.m1314a(null);
                            this.f1594b.f1595a.f1601f = 4;
                            this.f1594b.f1595a.f1598c.mo508b();
                        }
                    }
                });
            }
        }

        public C0518h(Context context, ComponentName componentName, C0506b c0506b) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (c0506b == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            } else {
                this.f1596a = context;
                this.f1597b = componentName;
                this.f1598c = c0506b;
                this.f1599d = null;
            }
        }

        private static String m1342a(int i) {
            switch (i) {
                case 0:
                    return "CONNECT_STATE_DISCONNECTING";
                case 1:
                    return "CONNECT_STATE_DISCONNECTED";
                case 2:
                    return "CONNECT_STATE_CONNECTING";
                case 3:
                    return "CONNECT_STATE_CONNECTED";
                case 4:
                    return "CONNECT_STATE_SUSPENDED";
                default:
                    return "UNKNOWN/" + i;
            }
        }

        private boolean m1343a(Messenger messenger, String str) {
            if (this.f1604i == messenger && this.f1601f != 0 && this.f1601f != 1) {
                return true;
            }
            if (!(this.f1601f == 0 || this.f1601f == 1)) {
                new StringBuilder().append(str).append(" for ").append(this.f1597b).append(" with mCallbacksMessenger=").append(this.f1604i).append(" this=").append(this);
            }
            return false;
        }

        final void m1344a() {
            if (this.f1602g != null) {
                this.f1596a.unbindService(this.f1602g);
            }
            this.f1601f = 1;
            this.f1602g = null;
            this.f1603h = null;
            this.f1604i = null;
            this.f1600e.m1314a(null);
            this.f1606k = null;
            this.f1607l = null;
        }

        public final void mo492a(Messenger messenger) {
            new StringBuilder("onConnectFailed for ").append(this.f1597b);
            if (!m1343a(messenger, "onConnectFailed")) {
                return;
            }
            if (this.f1601f != 2) {
                Log.w("MediaBrowserCompat", "onConnect from service while mState=" + C0518h.m1342a(this.f1601f) + "... ignoring");
                return;
            }
            m1344a();
            this.f1598c.mo509c();
        }

        public final void mo493a(Messenger messenger, String str, Bundle bundle) {
            if (m1343a(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.f1618a) {
                    new StringBuilder("onLoadChildren for ").append(this.f1597b).append(" id=").append(str);
                }
                C0520k c0520k = (C0520k) this.f1605j.get(str);
                if (c0520k == null) {
                    boolean z = MediaBrowserCompat.f1618a;
                } else {
                    c0520k.m1353a(this.f1596a, bundle);
                }
            }
        }

        public final void mo494a(Messenger messenger, String str, Token token, Bundle bundle) {
            if (!m1343a(messenger, "onConnect")) {
                return;
            }
            if (this.f1601f != 2) {
                Log.w("MediaBrowserCompat", "onConnect from service while mState=" + C0518h.m1342a(this.f1601f) + "... ignoring");
                return;
            }
            this.f1606k = str;
            this.f1607l = token;
            this.f1608m = bundle;
            this.f1601f = 3;
            if (MediaBrowserCompat.f1618a) {
                m1348b();
            }
            this.f1598c.mo507a();
            try {
                for (Entry entry : this.f1605j.entrySet()) {
                    String str2 = (String) entry.getKey();
                    C0520k c0520k = (C0520k) entry.getValue();
                    List list = c0520k.f1611a;
                    List list2 = c0520k.f1612b;
                    for (int i = 0; i < list.size(); i++) {
                        C0519j c0519j = this.f1603h;
                        IBinder iBinder = ((C0525l) list.get(i)).f1615a;
                        Bundle bundle2 = (Bundle) list2.get(i);
                        Messenger messenger2 = this.f1604i;
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("data_media_item_id", str2);
                        BundleCompat.putBinder(bundle3, "data_callback_token", iBinder);
                        bundle3.putBundle("data_options", bundle2);
                        c0519j.m1352a(3, bundle3, messenger2);
                    }
                }
            } catch (RemoteException e) {
            }
        }

        final void m1348b() {
            new StringBuilder("  mServiceComponent=").append(this.f1597b);
            new StringBuilder("  mCallback=").append(this.f1598c);
            new StringBuilder("  mRootHints=").append(this.f1599d);
            new StringBuilder("  mState=").append(C0518h.m1342a(this.f1601f));
            new StringBuilder("  mServiceConnection=").append(this.f1602g);
            new StringBuilder("  mServiceBinderWrapper=").append(this.f1603h);
            new StringBuilder("  mCallbacksMessenger=").append(this.f1604i);
            new StringBuilder("  mRootId=").append(this.f1606k);
            new StringBuilder("  mMediaSessionToken=").append(this.f1607l);
        }

        public final void mo496c() {
            if (this.f1601f == 0 || this.f1601f == 1) {
                this.f1601f = 2;
                this.f1600e.post(new C05131(this));
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + C0518h.m1342a(this.f1601f) + ")");
        }

        public final void mo497d() {
            this.f1601f = 0;
            this.f1600e.post(new C05142(this));
        }

        public final Token mo498e() {
            if ((this.f1601f == 3 ? 1 : null) != null) {
                return this.f1607l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f1601f + ")");
        }
    }

    private static class C0519j {
        Bundle f1609a;
        private Messenger f1610b;

        public C0519j(IBinder iBinder, Bundle bundle) {
            this.f1610b = new Messenger(iBinder);
            this.f1609a = bundle;
        }

        final void m1352a(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f1610b.send(obtain);
        }
    }

    private static class C0520k {
        final List<C0525l> f1611a = new ArrayList();
        final List<Bundle> f1612b = new ArrayList();

        public final C0525l m1353a(Context context, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            for (int i = 0; i < this.f1612b.size(); i++) {
                if (C0555c.m1383a((Bundle) this.f1612b.get(i), bundle)) {
                    return (C0525l) this.f1611a.get(i);
                }
            }
            return null;
        }
    }

    public static abstract class C0525l {
        final IBinder f1615a;
        WeakReference<C0520k> f1616b;
        private final Object f1617c;

        private class C0522a implements C0521c {
            final /* synthetic */ C0525l f1613a;

            C0522a(C0525l c0525l) {
                this.f1613a = c0525l;
            }

            public final void mo499a(List<?> list) {
                C0520k c0520k = this.f1613a.f1616b == null ? null : (C0520k) this.f1613a.f1616b.get();
                if (c0520k == null) {
                    MediaItem.m1312a(list);
                    return;
                }
                List a = MediaItem.m1312a(list);
                List list2 = c0520k.f1611a;
                List list3 = c0520k.f1612b;
                for (int i = 0; i < list2.size(); i++) {
                    Bundle bundle = (Bundle) list3.get(i);
                    if (!(bundle == null || a == null)) {
                        int i2 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                        int i3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                        if (i2 != -1 || i3 != -1) {
                            int i4 = i3 * i2;
                            int i5 = i4 + i3;
                            if (i2 < 0 || i3 <= 0 || i4 >= a.size()) {
                                List list4 = Collections.EMPTY_LIST;
                            } else {
                                if (i5 > a.size()) {
                                    i5 = a.size();
                                }
                                a.subList(i4, i5);
                            }
                        }
                    }
                }
            }
        }

        private class C0524b extends C0522a implements C0523a {
            final /* synthetic */ C0525l f1614b;

            C0524b(C0525l c0525l) {
                this.f1614b = c0525l;
                super(c0525l);
            }

            public final void mo500b(List<?> list) {
                MediaItem.m1312a(list);
            }
        }

        public C0525l() {
            if (VERSION.SDK_INT >= 26) {
                this.f1617c = new C0553b(new C0524b(this));
                this.f1615a = null;
            } else if (VERSION.SDK_INT >= 21) {
                this.f1617c = new C0551d(new C0522a(this));
                this.f1615a = new Binder();
            } else {
                this.f1617c = null;
                this.f1615a = new Binder();
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0506b c0506b) {
        if (VERSION.SDK_INT >= 26) {
            this.f1619b = new C0512g(context, componentName, c0506b);
        } else if (VERSION.SDK_INT >= 23) {
            this.f1619b = new C0511f(context, componentName, c0506b);
        } else if (VERSION.SDK_INT >= 21) {
            this.f1619b = new C0510e(context, componentName, c0506b);
        } else {
            this.f1619b = new C0518h(context, componentName, c0506b);
        }
    }
}
