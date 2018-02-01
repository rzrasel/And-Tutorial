package com.bumptech.glide.load.p049c.p050a;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.p049c.C1250m;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1260p;
import com.bumptech.glide.load.p049c.C1283c;

public final class C1261d extends C1260p<ParcelFileDescriptor> implements C1254b<String> {

    public static class C1259a implements C1250m<String, ParcelFileDescriptor> {
        public final C1252l<String, ParcelFileDescriptor> mo1371a(Context context, C1283c c1283c) {
            return new C1261d(c1283c.m3374a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public C1261d(C1252l<Uri, ParcelFileDescriptor> c1252l) {
        super(c1252l);
    }
}
