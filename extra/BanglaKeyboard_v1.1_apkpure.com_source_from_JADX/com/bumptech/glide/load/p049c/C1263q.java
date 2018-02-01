package com.bumptech.glide.load.p049c;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.p043a.C1165c;

public abstract class C1263q<T> implements C1252l<Uri, T> {
    private final Context f3643a;
    private final C1252l<C1284d, T> f3644b;

    public C1263q(Context context, C1252l<C1284d, T> c1252l) {
        this.f3643a = context;
        this.f3644b = c1252l;
    }

    public abstract C1165c<T> mo1373a(Context context, Uri uri);

    public abstract C1165c<T> mo1374a(Context context, String str);

    public final /* synthetic */ C1165c mo1372a(Object obj, int i, int i2) {
        Uri uri = (Uri) obj;
        String scheme = uri.getScheme();
        Object obj2 = ("file".equals(scheme) || "content".equals(scheme) || "android.resource".equals(scheme)) ? 1 : null;
        if (obj2 == null) {
            return this.f3644b != null ? ("http".equals(scheme) || "https".equals(scheme)) ? this.f3644b.mo1372a(new C1284d(uri.toString()), i, i2) : null : null;
        } else {
            if (!C1265a.m3358a(uri)) {
                return mo1373a(this.f3643a, uri);
            }
            return mo1374a(this.f3643a, C1265a.m3359b(uri));
        }
    }
}
