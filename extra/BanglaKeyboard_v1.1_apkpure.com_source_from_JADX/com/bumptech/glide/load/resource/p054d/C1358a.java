package com.bumptech.glide.load.resource.p054d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p044b.C1241l;
import com.bumptech.glide.load.resource.p053c.C1342b;

public class C1358a {
    public final C1241l<C1342b> f3810a;
    public final C1241l<Bitmap> f3811b;

    public C1358a(C1241l<Bitmap> c1241l, C1241l<C1342b> c1241l2) {
        if (c1241l != null && c1241l2 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        } else if (c1241l == null && c1241l2 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        } else {
            this.f3811b = c1241l;
            this.f3810a = c1241l2;
        }
    }
}
