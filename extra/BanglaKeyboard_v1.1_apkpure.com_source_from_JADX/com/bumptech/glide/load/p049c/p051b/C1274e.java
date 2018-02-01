package com.bumptech.glide.load.p049c.p051b;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.p049c.C1250m;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1257n;
import com.bumptech.glide.load.p049c.C1283c;
import java.io.InputStream;

public final class C1274e extends C1257n<InputStream> implements C1267d<Integer> {

    public static class C1273a implements C1250m<Integer, InputStream> {
        public final C1252l<Integer, InputStream> mo1371a(Context context, C1283c c1283c) {
            return new C1274e(context, c1283c.m3374a(Uri.class, InputStream.class));
        }
    }

    public C1274e(Context context, C1252l<Uri, InputStream> c1252l) {
        super(context, (C1252l) c1252l);
    }
}
