package com.bumptech.glide.load.p049c;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.p043a.C1165c;

public class C1257n<T> implements C1252l<Integer, T> {
    private final C1252l<Uri, T> f3640a;
    private final Resources f3641b;

    public C1257n(Context context, C1252l<Uri, T> c1252l) {
        this(context.getResources(), (C1252l) c1252l);
    }

    private C1257n(Resources resources, C1252l<Uri, T> c1252l) {
        this.f3641b = resources;
        this.f3640a = c1252l;
    }

    private C1165c<T> m3347a(Integer num, int i, int i2) {
        Object parse;
        try {
            parse = Uri.parse("android.resource://" + this.f3641b.getResourcePackageName(num.intValue()) + '/' + this.f3641b.getResourceTypeName(num.intValue()) + '/' + this.f3641b.getResourceEntryName(num.intValue()));
        } catch (Throwable e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            }
            parse = null;
        }
        return parse != null ? this.f3640a.mo1372a(parse, i, i2) : null;
    }
}
