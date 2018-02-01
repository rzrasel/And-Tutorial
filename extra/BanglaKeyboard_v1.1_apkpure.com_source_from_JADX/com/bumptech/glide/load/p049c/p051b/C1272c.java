package com.bumptech.glide.load.p049c.p051b;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.p049c.C1250m;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1253b;
import com.bumptech.glide.load.p049c.C1283c;
import java.io.File;
import java.io.InputStream;

public final class C1272c extends C1253b<InputStream> implements C1267d<File> {

    public static class C1271a implements C1250m<File, InputStream> {
        public final C1252l<File, InputStream> mo1371a(Context context, C1283c c1283c) {
            return new C1272c(c1283c.m3374a(Uri.class, InputStream.class));
        }
    }

    public C1272c(C1252l<Uri, InputStream> c1252l) {
        super(c1252l);
    }
}
