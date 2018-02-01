package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.app.BundleCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0557a.C0558a;
import android.support.v4.media.session.C0577b.C0579a;
import android.support.v4.media.session.C0581c.C0563a;
import android.support.v4.media.session.C0581c.C0580b;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class MediaControllerCompat {
    final C0561b f1734a;
    private final Token f1735b;
    private final HashSet<C0565a> f1736c = new HashSet();

    interface C0561b {
        boolean mo522a(KeyEvent keyEvent);
    }

    static class MediaControllerImplApi21 implements C0561b {
        protected final Object f1719a;
        final List<C0565a> f1720b = new ArrayList();
        C0577b f1721c;
        HashMap<C0565a, C0560a> f1722d = new HashMap();

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> f1717a;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21, Handler handler) {
                super(handler);
                this.f1717a = new WeakReference(mediaControllerImplApi21);
            }

            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f1717a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    mediaControllerImplApi21.f1721c = C0579a.m1555a(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                    if (mediaControllerImplApi21.f1721c != null) {
                        synchronized (mediaControllerImplApi21.f1720b) {
                            for (C0565a c0565a : mediaControllerImplApi21.f1720b) {
                                C0557a c0560a = new C0560a(c0565a);
                                mediaControllerImplApi21.f1722d.put(c0565a, c0560a);
                                c0565a.f1726b = true;
                                try {
                                    mediaControllerImplApi21.f1721c.mo539a(c0560a);
                                } catch (RemoteException e) {
                                }
                            }
                            mediaControllerImplApi21.f1720b.clear();
                        }
                    }
                }
            }
        }

        private static class C0560a extends C0559c {
            C0560a(C0565a c0565a) {
                super(c0565a);
            }

            public final void mo510a() {
                throw new AssertionError();
            }

            public final void mo512a(Bundle bundle) {
                throw new AssertionError();
            }

            public final void mo513a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            public final void mo514a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            public final void mo516a(CharSequence charSequence) {
                throw new AssertionError();
            }

            public final void mo518a(List<QueueItem> list) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, Token token) {
            this.f1719a = new MediaController(context, (MediaSession.Token) token.f1741a);
            if (this.f1719a == null) {
                throw new RemoteException();
            }
            this.f1721c = token.f1742b;
            if (this.f1721c == null) {
                ResultReceiver extraBinderRequestResultReceiver = new ExtraBinderRequestResultReceiver(this, new Handler());
                ((MediaController) this.f1719a).sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, extraBinderRequestResultReceiver);
            }
        }

        public final boolean mo522a(KeyEvent keyEvent) {
            return ((MediaController) this.f1719a).dispatchMediaButtonEvent(keyEvent);
        }
    }

    public static abstract class C0565a implements DeathRecipient {
        C0562a f1725a;
        boolean f1726b;
        private final Object f1727c;

        private static class C0559c extends C0558a {
            private final WeakReference<C0565a> f1718a;

            C0559c(C0565a c0565a) {
                this.f1718a = new WeakReference(c0565a);
            }

            public void mo510a() {
                C0565a c0565a = (C0565a) this.f1718a.get();
                if (c0565a != null) {
                    c0565a.m1438a(8, null, null);
                }
            }

            public final void mo511a(int i) {
                C0565a c0565a = (C0565a) this.f1718a.get();
                if (c0565a != null) {
                    c0565a.m1438a(9, Integer.valueOf(i), null);
                }
            }

            public void mo512a(Bundle bundle) {
                C0565a c0565a = (C0565a) this.f1718a.get();
                if (c0565a != null) {
                    c0565a.m1438a(7, bundle, null);
                }
            }

            public void mo513a(MediaMetadataCompat mediaMetadataCompat) {
                C0565a c0565a = (C0565a) this.f1718a.get();
                if (c0565a != null) {
                    c0565a.m1438a(3, mediaMetadataCompat, null);
                }
            }

            public void mo514a(ParcelableVolumeInfo parcelableVolumeInfo) {
                C0565a c0565a = (C0565a) this.f1718a.get();
                if (c0565a != null) {
                    c0565a.m1438a(4, parcelableVolumeInfo != null ? new C0569f(parcelableVolumeInfo.f1743a, parcelableVolumeInfo.f1744b, parcelableVolumeInfo.f1745c, parcelableVolumeInfo.f1746d, parcelableVolumeInfo.f1747e) : null, null);
                }
            }

            public final void mo515a(PlaybackStateCompat playbackStateCompat) {
                C0565a c0565a = (C0565a) this.f1718a.get();
                if (c0565a != null) {
                    c0565a.m1438a(2, playbackStateCompat, null);
                }
            }

            public void mo516a(CharSequence charSequence) {
                C0565a c0565a = (C0565a) this.f1718a.get();
                if (c0565a != null) {
                    c0565a.m1438a(6, charSequence, null);
                }
            }

            public final void mo517a(String str, Bundle bundle) {
                C0565a c0565a = (C0565a) this.f1718a.get();
                if (c0565a != null) {
                    c0565a.m1438a(1, str, bundle);
                }
            }

            public void mo518a(List<QueueItem> list) {
                C0565a c0565a = (C0565a) this.f1718a.get();
                if (c0565a != null) {
                    c0565a.m1438a(5, list, null);
                }
            }

            public final void mo519a(boolean z) {
                C0565a c0565a = (C0565a) this.f1718a.get();
                if (c0565a != null) {
                    c0565a.m1438a(10, Boolean.valueOf(z), null);
                }
            }

            public final void mo520b(int i) {
                C0565a c0565a = (C0565a) this.f1718a.get();
                if (c0565a != null) {
                    c0565a.m1438a(12, Integer.valueOf(i), null);
                }
            }

            public final void mo521b(boolean z) {
                C0565a c0565a = (C0565a) this.f1718a.get();
                if (c0565a != null) {
                    c0565a.m1438a(11, Boolean.valueOf(z), null);
                }
            }
        }

        private class C0562a extends Handler {
            boolean f1723a;

            public final void handleMessage(Message message) {
                if (this.f1723a) {
                    Object obj;
                    switch (message.what) {
                        case 1:
                            obj = message.obj;
                            message.getData();
                            return;
                        case 2:
                            obj = message.obj;
                            return;
                        case 3:
                            obj = message.obj;
                            return;
                        case 4:
                            obj = message.obj;
                            return;
                        case 5:
                            obj = message.obj;
                            return;
                        case 6:
                            obj = message.obj;
                            return;
                        case 7:
                            obj = message.obj;
                            return;
                        case 9:
                            ((Integer) message.obj).intValue();
                            return;
                        case 10:
                            ((Boolean) message.obj).booleanValue();
                            return;
                        case 11:
                            ((Boolean) message.obj).booleanValue();
                            return;
                        case 12:
                            ((Integer) message.obj).intValue();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        private static class C0564b implements C0563a {
            private final WeakReference<C0565a> f1724a;

            C0564b(C0565a c0565a) {
                this.f1724a = new WeakReference(c0565a);
            }

            public final void mo523a() {
                this.f1724a.get();
            }

            public final void mo524a(int i, int i2, int i3, int i4, int i5) {
                if (((C0565a) this.f1724a.get()) != null) {
                    C0569f c0569f = new C0569f(i, i2, i3, i4, i5);
                }
            }

            public final void mo525a(Object obj) {
                C0565a c0565a = (C0565a) this.f1724a.get();
                if (c0565a != null && !c0565a.f1726b) {
                    PlaybackStateCompat.m1444a(obj);
                }
            }

            public final void mo526a(List<?> list) {
                if (((C0565a) this.f1724a.get()) != null) {
                    QueueItem.m1440a(list);
                }
            }

            public final void mo527b() {
                C0565a c0565a = (C0565a) this.f1724a.get();
                if (c0565a != null && c0565a.f1726b) {
                    int i = VERSION.SDK_INT;
                }
            }

            public final void mo528b(Object obj) {
                if (((C0565a) this.f1724a.get()) != null) {
                    MediaMetadataCompat.m1382a(obj);
                }
            }

            public final void mo529c() {
                this.f1724a.get();
            }

            public final void mo530d() {
                this.f1724a.get();
            }
        }

        public C0565a() {
            if (VERSION.SDK_INT >= 21) {
                this.f1727c = new C0580b(new C0564b(this));
            } else {
                this.f1727c = new C0559c(this);
            }
        }

        final void m1438a(int i, Object obj, Bundle bundle) {
            if (this.f1725a != null) {
                Message obtainMessage = this.f1725a.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    static class C0566c extends MediaControllerImplApi21 {
        public C0566c(Context context, Token token) {
            super(context, token);
        }
    }

    static class C0567d extends C0566c {
        public C0567d(Context context, Token token) {
            super(context, token);
        }
    }

    static class C0568e implements C0561b {
        private C0577b f1728a;

        public C0568e(Token token) {
            this.f1728a = C0579a.m1555a((IBinder) token.f1741a);
        }

        public final boolean mo522a(KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.f1728a.mo544a(keyEvent);
            } catch (RemoteException e) {
            }
            return false;
        }
    }

    public static final class C0569f {
        private final int f1729a;
        private final int f1730b;
        private final int f1731c;
        private final int f1732d;
        private final int f1733e;

        C0569f(int i, int i2, int i3, int i4, int i5) {
            this.f1729a = i;
            this.f1730b = i2;
            this.f1731c = i3;
            this.f1732d = i4;
            this.f1733e = i5;
        }
    }

    public MediaControllerCompat(Context context, Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f1735b = token;
        if (VERSION.SDK_INT >= 24) {
            this.f1734a = new C0567d(context, token);
        } else if (VERSION.SDK_INT >= 23) {
            this.f1734a = new C0566c(context, token);
        } else if (VERSION.SDK_INT >= 21) {
            this.f1734a = new MediaControllerImplApi21(context, token);
        } else {
            this.f1734a = new C0568e(this.f1735b);
        }
    }
}
