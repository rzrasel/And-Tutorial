package com.bumptech.glide.load.p049c.p050a;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.p049c.C1250m;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1253b;
import com.bumptech.glide.load.p049c.C1283c;
import java.io.File;

public final class C1255a extends C1253b<ParcelFileDescriptor> implements C1254b<File> {

    public static class C1251a implements C1250m<File, ParcelFileDescriptor> {
        public final C1252l<File, ParcelFileDescriptor> mo1371a(Context context, C1283c c1283c) {
            return new C1255a(c1283c.m3374a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public C1255a(C1252l<Uri, ParcelFileDescriptor> c1252l) {
        super(c1252l);
    }
}
