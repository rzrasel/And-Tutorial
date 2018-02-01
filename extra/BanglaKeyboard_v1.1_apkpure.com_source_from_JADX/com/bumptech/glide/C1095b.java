package com.bumptech.glide;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.C1164h.C1152b;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.p049c.C1288f;
import com.bumptech.glide.load.p049c.C1289g;
import com.bumptech.glide.load.resource.p040a.C1136b;
import com.bumptech.glide.load.resource.p054d.C1358a;
import com.bumptech.glide.manager.C1375g;
import com.bumptech.glide.manager.C1387m;
import com.bumptech.glide.p038e.C1108f;
import com.bumptech.glide.p038e.C1112e;
import java.io.InputStream;

public final class C1095b<ModelType> extends C1089a<ModelType> {
    private final C1252l<ModelType, InputStream> f3244g;
    private final C1252l<ModelType, ParcelFileDescriptor> f3245h;
    private final C1152b f3246i;

    C1095b(Class<ModelType> cls, C1252l<ModelType, InputStream> c1252l, C1252l<ModelType, ParcelFileDescriptor> c1252l2, Context context, C1113e c1113e, C1387m c1387m, C1375g c1375g, C1152b c1152b) {
        C1108f c1108f;
        Class cls2 = C1358a.class;
        Class cls3 = C1136b.class;
        if (c1252l == null && c1252l2 == null) {
            c1108f = null;
        } else {
            c1108f = new C1112e(new C1288f(c1252l, c1252l2), c1113e.f3327d.m3556a(cls2, cls3), c1113e.m3031a(C1289g.class, cls2));
        }
        super(context, cls, c1108f, c1113e, c1387m, c1375g);
        this.f3244g = c1252l;
        this.f3245h = c1252l2;
        this.f3246i = c1152b;
    }
}
