package com.bumptech.glide.load.p049c.p051b;

import android.content.Context;
import com.bumptech.glide.load.p049c.C1250m;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1280r;
import com.bumptech.glide.load.p049c.C1283c;
import com.bumptech.glide.load.p049c.C1284d;
import java.io.InputStream;
import java.net.URL;

public final class C1281h extends C1280r<InputStream> {

    public static class C1279a implements C1250m<URL, InputStream> {
        public final C1252l<URL, InputStream> mo1371a(Context context, C1283c c1283c) {
            return new C1281h(c1283c.m3374a(C1284d.class, InputStream.class));
        }
    }

    public C1281h(C1252l<C1284d, InputStream> c1252l) {
        super(c1252l);
    }
}
