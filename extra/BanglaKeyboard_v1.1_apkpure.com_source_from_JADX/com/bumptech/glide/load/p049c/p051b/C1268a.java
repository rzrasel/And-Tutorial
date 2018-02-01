package com.bumptech.glide.load.p049c.p051b;

import android.content.Context;
import com.bumptech.glide.load.p043a.C1165c;
import com.bumptech.glide.load.p043a.C1173f;
import com.bumptech.glide.load.p049c.C1250m;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1283c;
import com.bumptech.glide.load.p049c.C1284d;
import com.bumptech.glide.load.p049c.C1297k;
import com.bumptech.glide.load.p049c.C1297k.C1296a;
import java.io.InputStream;

public final class C1268a implements C1267d<C1284d> {
    private final C1297k<C1284d, C1284d> f3647a;

    public static class C1266a implements C1250m<C1284d, InputStream> {
        private final C1297k<C1284d, C1284d> f3646a = new C1297k(500);

        public final C1252l<C1284d, InputStream> mo1371a(Context context, C1283c c1283c) {
            return new C1268a(this.f3646a);
        }
    }

    public C1268a() {
        this(null);
    }

    public C1268a(C1297k<C1284d, C1284d> c1297k) {
        this.f3647a = c1297k;
    }

    public final /* synthetic */ C1165c mo1372a(Object obj, int i, int i2) {
        C1284d c1284d = (C1284d) obj;
        if (this.f3647a != null) {
            C1297k c1297k = this.f3647a;
            Object a = C1296a.m3391a(c1284d);
            Object b = c1297k.f3684a.m3143b(a);
            a.m3392a();
            C1284d c1284d2 = (C1284d) b;
            if (c1284d2 == null) {
                c1297k = this.f3647a;
                c1297k.f3684a.m3144b(C1296a.m3391a(c1284d), c1284d);
            } else {
                c1284d = c1284d2;
            }
        }
        return new C1173f(c1284d);
    }
}
