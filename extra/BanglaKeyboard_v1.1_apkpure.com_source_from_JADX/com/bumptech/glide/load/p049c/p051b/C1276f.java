package com.bumptech.glide.load.p049c.p051b;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.C1113e;
import com.bumptech.glide.load.p049c.C1250m;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1260p;
import com.bumptech.glide.load.p049c.C1283c;
import java.io.InputStream;

public final class C1276f extends C1260p<InputStream> implements C1267d<String> {

    public static class C1275a implements C1250m<String, InputStream> {
        public final C1252l<String, InputStream> mo1371a(Context context, C1283c c1283c) {
            return new C1276f(c1283c.m3374a(Uri.class, InputStream.class));
        }
    }

    public C1276f(Context context) {
        this(C1113e.m3024a(Uri.class, context));
    }

    public C1276f(C1252l<Uri, InputStream> c1252l) {
        super(c1252l);
    }
}
