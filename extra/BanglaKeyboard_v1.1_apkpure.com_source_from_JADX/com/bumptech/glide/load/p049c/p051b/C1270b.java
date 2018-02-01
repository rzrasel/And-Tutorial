package com.bumptech.glide.load.p049c.p051b;

import android.content.Context;
import com.bumptech.glide.load.p043a.C1165c;
import com.bumptech.glide.load.p043a.C1167b;
import com.bumptech.glide.load.p049c.C1250m;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1283c;
import java.io.InputStream;

public final class C1270b implements C1267d<byte[]> {
    private final String f3648a;

    public static class C1269a implements C1250m<byte[], InputStream> {
        public final C1252l<byte[], InputStream> mo1371a(Context context, C1283c c1283c) {
            return new C1270b();
        }
    }

    public C1270b() {
        this("");
    }

    @Deprecated
    private C1270b(String str) {
        this.f3648a = str;
    }

    public final /* synthetic */ C1165c mo1372a(Object obj, int i, int i2) {
        return new C1167b((byte[]) obj, this.f3648a);
    }
}
