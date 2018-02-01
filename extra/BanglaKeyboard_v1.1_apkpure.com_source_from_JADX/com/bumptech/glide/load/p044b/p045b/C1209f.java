package com.bumptech.glide.load.p044b.p045b;

import android.content.Context;
import com.bumptech.glide.load.p044b.p045b.C1206d.C1205a;
import java.io.File;

public final class C1209f extends C1206d {

    class C12081 implements C1205a {
        final /* synthetic */ Context f3543a;
        final /* synthetic */ String f3544b;

        C12081(Context context, String str) {
            this.f3543a = context;
            this.f3544b = str;
        }

        public final File mo1351a() {
            File cacheDir = this.f3543a.getCacheDir();
            return cacheDir == null ? null : this.f3544b != null ? new File(cacheDir, this.f3544b) : cacheDir;
        }
    }

    public C1209f(Context context) {
        this(context, "image_manager_disk_cache");
    }

    private C1209f(Context context, String str) {
        super(new C12081(context, str));
    }
}
