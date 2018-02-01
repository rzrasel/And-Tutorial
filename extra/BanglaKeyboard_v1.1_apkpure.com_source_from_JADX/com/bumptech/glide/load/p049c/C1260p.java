package com.bumptech.glide.load.p049c;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.p043a.C1165c;
import java.io.File;

public class C1260p<T> implements C1252l<String, T> {
    private final C1252l<Uri, T> f3642a;

    public C1260p(C1252l<Uri, T> c1252l) {
        this.f3642a = c1252l;
    }

    private static Uri m3350a(String str) {
        return Uri.fromFile(new File(str));
    }

    public final /* synthetic */ C1165c mo1372a(Object obj, int i, int i2) {
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Object a;
        if (str.startsWith("/")) {
            a = C1260p.m3350a(str);
        } else {
            a = Uri.parse(str);
            if (a.getScheme() == null) {
                a = C1260p.m3350a(str);
            }
        }
        return this.f3642a.mo1372a(a, i, i2);
    }
}
