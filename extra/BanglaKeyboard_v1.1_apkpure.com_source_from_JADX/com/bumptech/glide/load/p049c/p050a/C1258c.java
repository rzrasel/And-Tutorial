package com.bumptech.glide.load.p049c.p050a;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.p049c.C1250m;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1257n;
import com.bumptech.glide.load.p049c.C1283c;

public final class C1258c extends C1257n<ParcelFileDescriptor> implements C1254b<Integer> {

    public static class C1256a implements C1250m<Integer, ParcelFileDescriptor> {
        public final C1252l<Integer, ParcelFileDescriptor> mo1371a(Context context, C1283c c1283c) {
            return new C1258c(context, c1283c.m3374a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public C1258c(Context context, C1252l<Uri, ParcelFileDescriptor> c1252l) {
        super(context, (C1252l) c1252l);
    }
}
