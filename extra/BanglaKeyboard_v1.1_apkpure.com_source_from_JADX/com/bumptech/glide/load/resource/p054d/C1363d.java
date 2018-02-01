package com.bumptech.glide.load.resource.p054d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.resource.p053c.C1342b;
import java.io.OutputStream;

public final class C1363d implements C1302f<C1358a> {
    private final C1302f<Bitmap> f3821a;
    private final C1302f<C1342b> f3822b;
    private String f3823c;

    public C1363d(C1302f<Bitmap> c1302f, C1302f<C1342b> c1302f2) {
        this.f3821a = c1302f;
        this.f3822b = c1302f2;
    }

    public final String mo1376a() {
        if (this.f3823c == null) {
            this.f3823c = this.f3821a.mo1376a() + this.f3822b.mo1376a();
        }
        return this.f3823c;
    }

    public final /* bridge */ /* synthetic */ boolean mo1377a(Object obj, OutputStream outputStream) {
        C1358a c1358a = (C1358a) ((C1241l) obj).mo1367a();
        C1241l c1241l = c1358a.f3811b;
        return c1241l != null ? this.f3821a.mo1377a(c1241l, outputStream) : this.f3822b.mo1377a(c1358a.f3810a, outputStream);
    }
}
