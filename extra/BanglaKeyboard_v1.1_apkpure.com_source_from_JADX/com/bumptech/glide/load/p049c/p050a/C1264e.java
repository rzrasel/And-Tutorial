package com.bumptech.glide.load.p049c.p050a;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.p043a.C1165c;
import com.bumptech.glide.load.p043a.C1168d;
import com.bumptech.glide.load.p043a.C1170e;
import com.bumptech.glide.load.p049c.C1250m;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1263q;
import com.bumptech.glide.load.p049c.C1283c;
import com.bumptech.glide.load.p049c.C1284d;

public final class C1264e extends C1263q<ParcelFileDescriptor> implements C1254b<Uri> {

    public static class C1262a implements C1250m<Uri, ParcelFileDescriptor> {
        public final C1252l<Uri, ParcelFileDescriptor> mo1371a(Context context, C1283c c1283c) {
            return new C1264e(context, c1283c.m3374a(C1284d.class, ParcelFileDescriptor.class));
        }
    }

    public C1264e(Context context, C1252l<C1284d, ParcelFileDescriptor> c1252l) {
        super(context, c1252l);
    }

    protected final C1165c<ParcelFileDescriptor> mo1373a(Context context, Uri uri) {
        return new C1170e(context, uri);
    }

    protected final C1165c<ParcelFileDescriptor> mo1374a(Context context, String str) {
        return new C1168d(context.getApplicationContext().getAssets(), str);
    }
}
