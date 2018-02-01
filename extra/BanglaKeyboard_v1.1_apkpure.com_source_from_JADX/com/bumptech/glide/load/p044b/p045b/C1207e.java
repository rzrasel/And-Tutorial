package com.bumptech.glide.load.p044b.p045b;

import android.util.Log;
import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.load.p044b.p045b.C1200a.C1179b;
import com.bumptech.glide.load.p044b.p045b.C1204c.C1202a;
import com.bumptech.glide.p032a.C1084a;
import com.bumptech.glide.p032a.C1084a.C1081a;
import com.bumptech.glide.p032a.C1084a.C1083c;
import java.io.File;

public final class C1207e implements C1200a {
    private static C1207e f3537a = null;
    private final C1204c f3538b = new C1204c();
    private final C1216j f3539c;
    private final File f3540d;
    private final int f3541e;
    private C1084a f3542f;

    private C1207e(File file, int i) {
        this.f3540d = file;
        this.f3541e = i;
        this.f3539c = new C1216j();
    }

    private synchronized C1084a m3277a() {
        if (this.f3542f == null) {
            this.f3542f = C1084a.m2851a(this.f3540d, (long) this.f3541e);
        }
        return this.f3542f;
    }

    public static synchronized C1200a m3278a(File file, int i) {
        C1200a c1200a;
        synchronized (C1207e.class) {
            if (f3537a == null) {
                f3537a = new C1207e(file, i);
            }
            c1200a = f3537a;
        }
        return c1200a;
    }

    public final File mo1347a(C1145c c1145c) {
        File file = null;
        try {
            C1083c a = m3277a().m2870a(this.f3539c.m3301a(c1145c));
            if (a != null) {
                file = a.m2850a();
            }
        } catch (Throwable e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            }
        }
        return file;
    }

    public final void mo1348a(C1145c c1145c, C1179b c1179b) {
        C1202a c1202a;
        String a = this.f3539c.m3301a(c1145c);
        C1204c c1204c = this.f3538b;
        synchronized (c1204c) {
            c1202a = (C1202a) c1204c.f3533a.get(c1145c);
            if (c1202a == null) {
                c1202a = c1204c.f3534b.m3273a();
                c1204c.f3533a.put(c1145c, c1202a);
            }
            c1202a.f3531b++;
        }
        c1202a.f3530a.lock();
        C1081a b;
        try {
            b = m3277a().m2871b(a);
            if (b != null) {
                if (c1179b.mo1333a(b.m2843a())) {
                    b.m2844b();
                }
                b.m2846d();
            }
            this.f3538b.m3274a(c1145c);
        } catch (Throwable e) {
            try {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
                this.f3538b.m3274a(c1145c);
            } catch (Throwable th) {
                this.f3538b.m3274a(c1145c);
            }
        } catch (Throwable th2) {
            b.m2846d();
        }
    }

    public final void mo1349b(C1145c c1145c) {
        try {
            m3277a().m2872c(this.f3539c.m3301a(c1145c));
        } catch (Throwable e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to delete from disk cache", e);
            }
        }
    }
}
