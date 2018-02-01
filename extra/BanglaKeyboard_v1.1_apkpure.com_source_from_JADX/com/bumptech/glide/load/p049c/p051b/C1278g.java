package com.bumptech.glide.load.p049c.p051b;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.p043a.C1165c;
import com.bumptech.glide.load.p043a.C1174h;
import com.bumptech.glide.load.p043a.C1175i;
import com.bumptech.glide.load.p049c.C1250m;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1263q;
import com.bumptech.glide.load.p049c.C1283c;
import com.bumptech.glide.load.p049c.C1284d;
import java.io.InputStream;

public final class C1278g extends C1263q<InputStream> implements C1267d<Uri> {

    public static class C1277a implements C1250m<Uri, InputStream> {
        public final C1252l<Uri, InputStream> mo1371a(Context context, C1283c c1283c) {
            return new C1278g(context, c1283c.m3374a(C1284d.class, InputStream.class));
        }
    }

    public C1278g(Context context, C1252l<C1284d, InputStream> c1252l) {
        super(context, c1252l);
    }

    protected final C1165c<InputStream> mo1373a(Context context, Uri uri) {
        return new C1175i(context, uri);
    }

    protected final C1165c<InputStream> mo1374a(Context context, String str) {
        return new C1174h(context.getApplicationContext().getAssets(), str);
    }
}
