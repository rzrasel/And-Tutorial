package android.support.v4.media;

import android.app.Service;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.support.v4.p018f.C0478a;
import android.support.v4.p018f.C0494j;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {
    static final boolean f1681a = Log.isLoggable("MBServiceCompat", 3);
    final C0478a<IBinder, C0532b> f1682b = new C0478a();
    C0532b f1683c;
    final C0545g f1684d = new C0545g(this);
    Token f1685e;

    public static class C0526c<T> {
        private boolean f1620a;
        final Object f1621e;
        boolean f1622f;
        boolean f1623g;
        int f1624h;

        C0526c(Object obj) {
            this.f1621e = obj;
        }

        void mo501a() {
        }

        void mo502b() {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f1621e);
        }

        public final void m1360c() {
            if (this.f1622f || this.f1623g) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f1621e);
            }
            this.f1622f = true;
            mo501a();
        }

        final boolean m1361d() {
            return this.f1620a || this.f1622f || this.f1623g;
        }
    }

    class C05282 extends C0526c<MediaItem> {
        final /* synthetic */ ResultReceiver f1629a;
        final /* synthetic */ MediaBrowserServiceCompat f1630b;

        C05282(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            this.f1630b = mediaBrowserServiceCompat;
            this.f1629a = resultReceiver;
            super(obj);
        }

        final /* synthetic */ void mo501a() {
            if ((this.f1624h & 2) != 0) {
                this.f1629a.m1309b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", null);
            this.f1629a.m1309b(0, bundle);
        }
    }

    class C05293 extends C0526c<List<MediaItem>> {
        final /* synthetic */ ResultReceiver f1631a;
        final /* synthetic */ MediaBrowserServiceCompat f1632b;

        C05293(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            this.f1632b = mediaBrowserServiceCompat;
            this.f1631a = resultReceiver;
            super(obj);
        }

        final /* synthetic */ void mo501a() {
            this.f1631a.m1309b(-1, null);
        }
    }

    class C05304 extends C0526c<Bundle> {
        final /* synthetic */ ResultReceiver f1633a;
        final /* synthetic */ MediaBrowserServiceCompat f1634b;

        C05304(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
            this.f1634b = mediaBrowserServiceCompat;
            this.f1633a = resultReceiver;
            super(obj);
        }

        final /* synthetic */ void mo501a() {
            this.f1633a.m1309b(0, null);
        }

        final void mo502b() {
            this.f1633a.m1309b(-1, null);
        }
    }

    public static final class C0531a {
        final String f1635a;
        final Bundle f1636b;
    }

    private static class C0532b {
        String f1637a;
        Bundle f1638b;
        C0543e f1639c;
        C0531a f1640d;
        HashMap<String, List<C0494j<IBinder, Bundle>>> f1641e = new HashMap();

        C0532b() {
        }
    }

    private class C0542d {
        final /* synthetic */ MediaBrowserServiceCompat f1677a;

        class C05331 implements Runnable {
            final /* synthetic */ C0543e f1642a;
            final /* synthetic */ String f1643b;
            final /* synthetic */ Bundle f1644c;
            final /* synthetic */ int f1645d;
            final /* synthetic */ C0542d f1646e;

            C05331(C0542d c0542d, C0543e c0543e, String str, Bundle bundle, int i) {
                this.f1646e = c0542d;
                this.f1642a = c0543e;
                this.f1643b = str;
                this.f1644c = bundle;
                this.f1645d = i;
            }

            public final void run() {
                IBinder a = this.f1642a.mo503a();
                this.f1646e.f1677a.f1682b.remove(a);
                C0532b c0532b = new C0532b();
                c0532b.f1637a = this.f1643b;
                c0532b.f1638b = this.f1644c;
                c0532b.f1639c = this.f1642a;
                c0532b.f1640d = this.f1646e.f1677a.m1379a();
                if (c0532b.f1640d == null) {
                    new StringBuilder("No root for client ").append(this.f1643b).append(" from service ").append(getClass().getName());
                    try {
                        this.f1642a.mo506b();
                        return;
                    } catch (RemoteException e) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f1643b);
                        return;
                    }
                }
                try {
                    this.f1646e.f1677a.f1682b.put(a, c0532b);
                    if (this.f1646e.f1677a.f1685e != null) {
                        this.f1642a.mo504a(c0532b.f1640d.f1635a, this.f1646e.f1677a.f1685e, c0532b.f1640d.f1636b);
                    }
                } catch (RemoteException e2) {
                    Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.f1643b);
                    this.f1646e.f1677a.f1682b.remove(a);
                }
            }
        }

        class C05342 implements Runnable {
            final /* synthetic */ C0543e f1647a;
            final /* synthetic */ C0542d f1648b;

            C05342(C0542d c0542d, C0543e c0543e) {
                this.f1648b = c0542d;
                this.f1647a = c0543e;
            }

            public final void run() {
                this.f1648b.f1677a.f1682b.remove(this.f1647a.mo503a());
            }
        }

        class C05353 implements Runnable {
            final /* synthetic */ C0543e f1649a;
            final /* synthetic */ String f1650b;
            final /* synthetic */ IBinder f1651c;
            final /* synthetic */ Bundle f1652d;
            final /* synthetic */ C0542d f1653e;

            C05353(C0542d c0542d, C0543e c0543e, String str, IBinder iBinder, Bundle bundle) {
                this.f1653e = c0542d;
                this.f1649a = c0543e;
                this.f1650b = str;
                this.f1651c = iBinder;
                this.f1652d = bundle;
            }

            public final void run() {
                C0532b c0532b = (C0532b) this.f1653e.f1677a.f1682b.get(this.f1649a.mo503a());
                if (c0532b == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f1650b);
                } else {
                    this.f1653e.f1677a.m1380a(this.f1650b, c0532b, this.f1651c, this.f1652d);
                }
            }
        }

        class C05364 implements Runnable {
            final /* synthetic */ C0543e f1654a;
            final /* synthetic */ String f1655b;
            final /* synthetic */ IBinder f1656c;
            final /* synthetic */ C0542d f1657d;

            C05364(C0542d c0542d, C0543e c0543e, String str, IBinder iBinder) {
                this.f1657d = c0542d;
                this.f1654a = c0543e;
                this.f1655b = str;
                this.f1656c = iBinder;
            }

            public final void run() {
                C0532b c0532b = (C0532b) this.f1657d.f1677a.f1682b.get(this.f1654a.mo503a());
                if (c0532b == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f1655b);
                } else if (!MediaBrowserServiceCompat.m1377a(this.f1655b, c0532b, this.f1656c)) {
                    Log.w("MBServiceCompat", "removeSubscription called for " + this.f1655b + " which is not subscribed");
                }
            }
        }

        class C05375 implements Runnable {
            final /* synthetic */ C0543e f1658a;
            final /* synthetic */ String f1659b;
            final /* synthetic */ ResultReceiver f1660c;
            final /* synthetic */ C0542d f1661d;

            C05375(C0542d c0542d, C0543e c0543e, String str, ResultReceiver resultReceiver) {
                this.f1661d = c0542d;
                this.f1658a = c0543e;
                this.f1659b = str;
                this.f1660c = resultReceiver;
            }

            public final void run() {
                C0532b c0532b = (C0532b) this.f1661d.f1677a.f1682b.get(this.f1658a.mo503a());
                if (c0532b == null) {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f1659b);
                    return;
                }
                MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f1661d.f1677a;
                String str = this.f1659b;
                C0526c c05282 = new C05282(mediaBrowserServiceCompat, str, this.f1660c);
                mediaBrowserServiceCompat.f1683c = c0532b;
                c05282.f1624h = 2;
                c05282.m1360c();
                mediaBrowserServiceCompat.f1683c = null;
                if (!c05282.m1361d()) {
                    throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
                }
            }
        }

        class C05386 implements Runnable {
            final /* synthetic */ C0543e f1662a;
            final /* synthetic */ Bundle f1663b;
            final /* synthetic */ C0542d f1664c;

            C05386(C0542d c0542d, C0543e c0543e, Bundle bundle) {
                this.f1664c = c0542d;
                this.f1662a = c0543e;
                this.f1663b = bundle;
            }

            public final void run() {
                IBinder a = this.f1662a.mo503a();
                this.f1664c.f1677a.f1682b.remove(a);
                C0532b c0532b = new C0532b();
                c0532b.f1639c = this.f1662a;
                c0532b.f1638b = this.f1663b;
                this.f1664c.f1677a.f1682b.put(a, c0532b);
            }
        }

        class C05397 implements Runnable {
            final /* synthetic */ C0543e f1665a;
            final /* synthetic */ C0542d f1666b;

            C05397(C0542d c0542d, C0543e c0543e) {
                this.f1666b = c0542d;
                this.f1665a = c0543e;
            }

            public final void run() {
                this.f1666b.f1677a.f1682b.remove(this.f1665a.mo503a());
            }
        }

        class C05408 implements Runnable {
            final /* synthetic */ C0543e f1667a;
            final /* synthetic */ String f1668b;
            final /* synthetic */ Bundle f1669c;
            final /* synthetic */ ResultReceiver f1670d;
            final /* synthetic */ C0542d f1671e;

            C05408(C0542d c0542d, C0543e c0543e, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f1671e = c0542d;
                this.f1667a = c0543e;
                this.f1668b = str;
                this.f1669c = bundle;
                this.f1670d = resultReceiver;
            }

            public final void run() {
                C0532b c0532b = (C0532b) this.f1671e.f1677a.f1682b.get(this.f1667a.mo503a());
                if (c0532b == null) {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f1668b);
                    return;
                }
                MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f1671e.f1677a;
                String str = this.f1668b;
                C0526c c05293 = new C05293(mediaBrowserServiceCompat, str, this.f1670d);
                mediaBrowserServiceCompat.f1683c = c0532b;
                c05293.f1624h = 4;
                c05293.m1360c();
                mediaBrowserServiceCompat.f1683c = null;
                if (!c05293.m1361d()) {
                    throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
                }
            }
        }

        class C05419 implements Runnable {
            final /* synthetic */ C0543e f1672a;
            final /* synthetic */ String f1673b;
            final /* synthetic */ Bundle f1674c;
            final /* synthetic */ ResultReceiver f1675d;
            final /* synthetic */ C0542d f1676e;

            C05419(C0542d c0542d, C0543e c0543e, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f1676e = c0542d;
                this.f1672a = c0543e;
                this.f1673b = str;
                this.f1674c = bundle;
                this.f1675d = resultReceiver;
            }

            public final void run() {
                C0532b c0532b = (C0532b) this.f1676e.f1677a.f1682b.get(this.f1672a.mo503a());
                if (c0532b == null) {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f1673b + ", extras=" + this.f1674c);
                    return;
                }
                MediaBrowserServiceCompat mediaBrowserServiceCompat = this.f1676e.f1677a;
                String str = this.f1673b;
                Bundle bundle = this.f1674c;
                C0526c c05304 = new C05304(mediaBrowserServiceCompat, str, this.f1675d);
                mediaBrowserServiceCompat.f1683c = c0532b;
                if (c05304.f1622f || c05304.f1623g) {
                    throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + c05304.f1621e);
                }
                c05304.f1623g = true;
                c05304.mo502b();
                mediaBrowserServiceCompat.f1683c = null;
                if (!c05304.m1361d()) {
                    throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
                }
            }
        }

        C0542d(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f1677a = mediaBrowserServiceCompat;
        }
    }

    private interface C0543e {
        IBinder mo503a();

        void mo504a(String str, Token token, Bundle bundle);

        void mo505a(String str, List<MediaItem> list, Bundle bundle);

        void mo506b();
    }

    private static class C0544f implements C0543e {
        final Messenger f1678a;

        C0544f(Messenger messenger) {
            this.f1678a = messenger;
        }

        private void m1371a(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            this.f1678a.send(obtain);
        }

        public final IBinder mo503a() {
            return this.f1678a.getBinder();
        }

        public final void mo504a(String str, Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 1);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m1371a(1, bundle2);
        }

        public final void mo505a(String str, List<MediaItem> list, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            m1371a(3, bundle2);
        }

        public final void mo506b() {
            m1371a(2, null);
        }
    }

    private final class C0545g extends Handler {
        final /* synthetic */ MediaBrowserServiceCompat f1679a;
        private final C0542d f1680b = new C0542d(this.f1679a);

        C0545g(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f1679a = mediaBrowserServiceCompat;
        }

        private void m1376a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public final void handleMessage(Message message) {
            Object obj = null;
            Bundle data = message.getData();
            C0542d c0542d;
            String string;
            Bundle bundle;
            C0543e c0544f;
            C0542d c0542d2;
            Object string2;
            ResultReceiver resultReceiver;
            switch (message.what) {
                case 1:
                    c0542d = this.f1680b;
                    string = data.getString("data_package_name");
                    int i = data.getInt("data_calling_uid");
                    bundle = data.getBundle("data_root_hints");
                    c0544f = new C0544f(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = c0542d.f1677a;
                    if (string != null) {
                        String[] packagesForUid = mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i);
                        int length = packagesForUid.length;
                        int i2 = 0;
                        while (i2 < length) {
                            if (packagesForUid[i2].equals(string)) {
                                obj = 1;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (obj == null) {
                        throw new IllegalArgumentException("Package/uid mismatch: uid=" + i + " package=" + string);
                    }
                    c0542d.f1677a.f1684d.m1376a(new C05331(c0542d, c0544f, string, bundle, i));
                    return;
                case 2:
                    c0542d2 = this.f1680b;
                    c0542d2.f1677a.f1684d.m1376a(new C05342(c0542d2, new C0544f(message.replyTo)));
                    return;
                case 3:
                    c0542d = this.f1680b;
                    string = data.getString("data_media_item_id");
                    IBinder binder = BundleCompat.getBinder(data, "data_callback_token");
                    Bundle bundle2 = data.getBundle("data_options");
                    c0542d.f1677a.f1684d.m1376a(new C05353(c0542d, new C0544f(message.replyTo), string, binder, bundle2));
                    return;
                case 4:
                    c0542d2 = this.f1680b;
                    String string3 = data.getString("data_media_item_id");
                    IBinder binder2 = BundleCompat.getBinder(data, "data_callback_token");
                    c0542d2.f1677a.f1684d.m1376a(new C05364(c0542d2, new C0544f(message.replyTo), string3, binder2));
                    return;
                case 5:
                    c0542d = this.f1680b;
                    string2 = data.getString("data_media_item_id");
                    ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                    c0544f = new C0544f(message.replyTo);
                    if (!TextUtils.isEmpty(string2) && resultReceiver2 != null) {
                        c0542d.f1677a.f1684d.m1376a(new C05375(c0542d, c0544f, string2, resultReceiver2));
                        return;
                    }
                    return;
                case 6:
                    c0542d2 = this.f1680b;
                    c0542d2.f1677a.f1684d.m1376a(new C05386(c0542d2, new C0544f(message.replyTo), data.getBundle("data_root_hints")));
                    return;
                case 7:
                    c0542d2 = this.f1680b;
                    c0542d2.f1677a.f1684d.m1376a(new C05397(c0542d2, new C0544f(message.replyTo)));
                    return;
                case 8:
                    c0542d = this.f1680b;
                    string2 = data.getString("data_search_query");
                    bundle = data.getBundle("data_search_extras");
                    resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    c0544f = new C0544f(message.replyTo);
                    if (!TextUtils.isEmpty(string2) && resultReceiver != null) {
                        c0542d.f1677a.f1684d.m1376a(new C05408(c0542d, c0544f, string2, bundle, resultReceiver));
                        return;
                    }
                    return;
                case 9:
                    c0542d = this.f1680b;
                    string2 = data.getString("data_custom_action");
                    bundle = data.getBundle("data_custom_action_extras");
                    resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                    c0544f = new C0544f(message.replyTo);
                    if (!TextUtils.isEmpty(string2) && resultReceiver != null) {
                        c0542d.f1677a.f1684d.m1376a(new C05419(c0542d, c0544f, string2, bundle, resultReceiver));
                        return;
                    }
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 1\n  Client version: " + message.arg1);
                    return;
            }
        }

        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            return super.sendMessageAtTime(message, j);
        }
    }

    static boolean m1377a(String str, C0532b c0532b, IBinder iBinder) {
        if (iBinder == null) {
            return c0532b.f1641e.remove(str) != null;
        } else {
            boolean z;
            List list = (List) c0532b.f1641e.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                z = false;
                while (it.hasNext()) {
                    if (iBinder == ((C0494j) it.next()).f1558a) {
                        it.remove();
                        z = true;
                    }
                }
                if (list.size() == 0) {
                    c0532b.f1641e.remove(str);
                }
            } else {
                z = false;
            }
            return z;
        }
    }

    static List<MediaItem> m1378b() {
        return null;
    }

    public abstract C0531a m1379a();

    final void m1380a(String str, C0532b c0532b, IBinder iBinder, Bundle bundle) {
        List list = (List) c0532b.f1641e.get(str);
        List<C0494j> arrayList = list == null ? new ArrayList() : list;
        for (C0494j c0494j : arrayList) {
            if (iBinder == c0494j.f1558a && C0555c.m1383a(bundle, (Bundle) c0494j.f1559b)) {
                return;
            }
        }
        arrayList.add(new C0494j(iBinder, bundle));
        c0532b.f1641e.put(str, arrayList);
        final C0532b c0532b2 = c0532b;
        final String str2 = str;
        final Bundle bundle2 = bundle;
        C0526c c05271 = new C0526c<List<MediaItem>>(this, str) {
            final /* synthetic */ MediaBrowserServiceCompat f1628d;

            final /* synthetic */ void mo501a() {
                if (this.f1628d.f1682b.get(c0532b2.f1639c.mo503a()) == c0532b2) {
                    if ((this.f1624h & 1) != 0) {
                        MediaBrowserServiceCompat.m1378b();
                    }
                    try {
                        c0532b2.f1639c.mo505a(str2, null, bundle2);
                    } catch (RemoteException e) {
                        Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + c0532b2.f1637a);
                    }
                } else if (MediaBrowserServiceCompat.f1681a) {
                    new StringBuilder("Not sending onLoadChildren result for connection that has been disconnected. pkg=").append(c0532b2.f1637a).append(" id=").append(str2);
                }
            }
        };
        this.f1683c = c0532b;
        if (bundle != null) {
            c05271.f1624h = 1;
        }
        this.f1683c = null;
        if (!c05271.m1361d()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + c0532b.f1637a + " id=" + str);
        }
    }
}
