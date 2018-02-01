package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.C1483a;
import com.google.android.gms.common.C1490d;
import com.google.android.gms.common.C1493g;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.common.stats.C1530a;
import com.google.android.gms.internal.wf;
import com.google.android.gms.internal.wg;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AdvertisingIdClient {
    private final Context mContext;
    private C1490d zzalw;
    private wf zzalx;
    private boolean zzaly;
    private Object zzalz;
    private zza zzama;
    private long zzamb;

    public static final class Info {
        private final String zzamh;
        private final boolean zzami;

        public Info(String str, boolean z) {
            this.zzamh = str;
            this.zzami = z;
        }

        public final String getId() {
            return this.zzamh;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzami;
        }

        public final String toString() {
            String str = this.zzamh;
            return new StringBuilder(String.valueOf(str).length() + 7).append("{").append(str).append("}").append(this.zzami).toString();
        }
    }

    static class zza extends Thread {
        private WeakReference<AdvertisingIdClient> zzamd;
        private long zzame;
        CountDownLatch zzamf = new CountDownLatch(1);
        boolean zzamg = false;

        public zza(AdvertisingIdClient advertisingIdClient, long j) {
            this.zzamd = new WeakReference(advertisingIdClient);
            this.zzame = j;
            start();
        }

        private final void disconnect() {
            AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.zzamd.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.zzamg = true;
            }
        }

        public final void run() {
            try {
                if (!this.zzamf.await(this.zzame, TimeUnit.MILLISECONDS)) {
                    disconnect();
                }
            } catch (InterruptedException e) {
                disconnect();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false);
    }

    public AdvertisingIdClient(Context context, long j, boolean z) {
        this.zzalz = new Object();
        C1516t.m3860a((Object) context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.mContext = context;
        } else {
            this.mContext = context;
        }
        this.zzaly = false;
        this.zzamb = j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdvertisingIdInfo(android.content.Context r6) {
        /*
        r4 = 0;
        r0 = new com.google.android.gms.ads.identifier.zzd;
        r0.<init>(r6);
        r1 = "gads:ad_id_app_context:enabled";
        r1 = r0.getBoolean(r1, r4);
        r2 = "gads:ad_id_app_context:ping_ratio";
        r3 = 0;
        r2 = r0.getFloat(r2, r3);
        r3 = "gads:ad_id_use_shared_preference:enabled";
        r0 = r0.getBoolean(r3, r4);
        if (r0 == 0) goto L_0x0026;
    L_0x001b:
        r0 = com.google.android.gms.ads.identifier.zzb.zze(r6);
        r0 = r0.getInfo();
        if (r0 == 0) goto L_0x0026;
    L_0x0025:
        return r0;
    L_0x0026:
        r3 = new com.google.android.gms.ads.identifier.AdvertisingIdClient;
        r4 = -1;
        r3.<init>(r6, r4, r1);
        r0 = 0;
        r3.start(r0);	 Catch:{ Throwable -> 0x003d }
        r0 = r3.getInfo();	 Catch:{ Throwable -> 0x003d }
        r4 = 0;
        r3.zza(r0, r1, r2, r4);	 Catch:{ Throwable -> 0x003d }
        r3.finish();
        goto L_0x0025;
    L_0x003d:
        r0 = move-exception;
        r4 = 0;
        r3.zza(r4, r1, r2, r0);	 Catch:{ all -> 0x0043 }
        throw r0;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        r3.finish();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(android.content.Context):com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final void start(boolean z) {
        C1516t.m3869c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzaly) {
                finish();
            }
            this.zzalw = zzd(this.mContext);
            this.zzalx = zza(this.mContext, this.zzalw);
            this.zzaly = true;
            if (z) {
                zzbi();
            }
        }
    }

    private static wf zza(Context context, C1490d c1490d) {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C1516t.m3869c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
            if (c1490d.f4529a) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            c1490d.f4529a = true;
            IBinder iBinder = (IBinder) c1490d.f4530b.poll(10000, timeUnit);
            if (iBinder != null) {
                return wg.m6909a(iBinder);
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            IOException iOException = new IOException(th);
        }
    }

    private final boolean zza(Info info, boolean z, float f, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        Map hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : "0");
        if (info != null) {
            hashMap.put("limit_ad_tracking", info.isLimitAdTrackingEnabled() ? "1" : "0");
        }
        if (!(info == null || info.getId() == null)) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        new zza(this, hashMap).start();
        return true;
    }

    private final void zzbi() {
        synchronized (this.zzalz) {
            if (this.zzama != null) {
                this.zzama.zzamf.countDown();
                try {
                    this.zzama.join();
                } catch (InterruptedException e) {
                }
            }
            if (this.zzamb > 0) {
                this.zzama = new zza(this, this.zzamb);
            }
        }
    }

    private static C1490d zzd(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            C1493g.m3805a();
            switch (C1493g.m3804a(context)) {
                case 0:
                case 2:
                    Object c1490d = new C1490d();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        C1530a.m3927a();
                        context.getClass().getName();
                        if (C1530a.m3928a(context, intent, c1490d, 1)) {
                            return c1490d;
                        }
                        throw new IOException("Connection failure");
                    } catch (Throwable th) {
                        IOException iOException = new IOException(th);
                    }
                default:
                    throw new IOException("Google Play services not available");
            }
        } catch (NameNotFoundException e) {
            throw new C1483a();
        }
    }

    protected void finalize() {
        finish();
        super.finalize();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
        r2 = this;
        r0 = "Calling this from your main thread can lead to deadlock";
        com.google.android.gms.common.internal.C1516t.m3869c(r0);
        monitor-enter(r2);
        r0 = r2.mContext;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x000e;
    L_0x000a:
        r0 = r2.zzalw;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
    L_0x000f:
        return;
    L_0x0010:
        r0 = r2.zzaly;	 Catch:{ Throwable -> 0x002c }
        if (r0 == 0) goto L_0x001e;
    L_0x0014:
        com.google.android.gms.common.stats.C1530a.m3927a();	 Catch:{ Throwable -> 0x002c }
        r0 = r2.mContext;	 Catch:{ Throwable -> 0x002c }
        r1 = r2.zzalw;	 Catch:{ Throwable -> 0x002c }
        r0.unbindService(r1);	 Catch:{ Throwable -> 0x002c }
    L_0x001e:
        r0 = 0;
        r2.zzaly = r0;	 Catch:{ all -> 0x0029 }
        r0 = 0;
        r2.zzalx = r0;	 Catch:{ all -> 0x0029 }
        r0 = 0;
        r2.zzalw = r0;	 Catch:{ all -> 0x0029 }
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        goto L_0x000f;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        throw r0;
    L_0x002c:
        r0 = move-exception;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.finish():void");
    }

    public Info getInfo() {
        Info info;
        C1516t.m3869c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzaly) {
                synchronized (this.zzalz) {
                    if (this.zzama == null || !this.zzama.zzamg) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    start(false);
                    if (!this.zzaly) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    throw new IOException("Remote exception");
                } catch (Throwable e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C1516t.m3860a(this.zzalw);
            C1516t.m3860a(this.zzalx);
            info = new Info(this.zzalx.mo2315a(), this.zzalx.mo2316b());
        }
        zzbi();
        return info;
    }

    public void start() {
        start(true);
    }
}
