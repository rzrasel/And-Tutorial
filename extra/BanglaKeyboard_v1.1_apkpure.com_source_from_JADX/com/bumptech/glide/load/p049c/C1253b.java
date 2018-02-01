package com.bumptech.glide.load.p049c;

import android.net.Uri;
import com.bumptech.glide.load.p043a.C1165c;
import java.io.File;

public class C1253b<T> implements C1252l<File, T> {
    private final C1252l<Uri, T> f3639a;

    public C1253b(C1252l<Uri, T> c1252l) {
        this.f3639a = c1252l;
    }

    public final /* synthetic */ C1165c mo1372a(Object obj, int i, int i2) {
        return this.f3639a.mo1372a(Uri.fromFile((File) obj), i, i2);
    }
}
