package com.bumptech.glide.load.resource.p053c;

import android.content.Context;
import com.bumptech.glide.load.C1249b;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p044b.p046a.C1187c;
import com.bumptech.glide.load.p049c.C1298o;
import com.bumptech.glide.load.resource.p052b.C1309c;
import com.bumptech.glide.p038e.C1107b;
import java.io.File;
import java.io.InputStream;

public final class C1343c implements C1107b<InputStream, C1342b> {
    private final C1355i f3775a;
    private final C1357j f3776b;
    private final C1298o f3777c;
    private final C1309c<C1342b> f3778d = new C1309c(this.f3775a);

    public C1343c(Context context, C1187c c1187c) {
        this.f3775a = new C1355i(context, c1187c);
        this.f3776b = new C1357j(c1187c);
        this.f3777c = new C1298o();
    }

    public final C1301e<File, C1342b> mo1291a() {
        return this.f3778d;
    }

    public final C1301e<InputStream, C1342b> mo1292b() {
        return this.f3775a;
    }

    public final C1249b<InputStream> mo1293c() {
        return this.f3777c;
    }

    public final C1302f<C1342b> mo1294d() {
        return this.f3776b;
    }
}
