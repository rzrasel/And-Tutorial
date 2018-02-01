package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.C1164h.C1152b;
import com.bumptech.glide.load.p049c.C1252l;
import com.bumptech.glide.load.resource.p055e.C1372e;
import com.bumptech.glide.manager.C1375g;
import com.bumptech.glide.manager.C1387m;
import com.bumptech.glide.p038e.C1112e;

public final class C1101d<ModelType, DataType, ResourceType> extends C1088c<ModelType, DataType, ResourceType, ResourceType> {
    private final C1252l<ModelType, DataType> f3301g;
    private final Class<DataType> f3302h;
    private final Class<ResourceType> f3303i;
    private final C1152b f3304j;

    C1101d(Context context, C1113e c1113e, Class<ModelType> cls, C1252l<ModelType, DataType> c1252l, Class<DataType> cls2, Class<ResourceType> cls3, C1387m c1387m, C1375g c1375g, C1152b c1152b) {
        super(context, cls, new C1112e(c1252l, C1372e.m3558b(), c1113e.m3031a((Class) cls2, (Class) cls3)), cls3, c1113e, c1387m, c1375g);
        this.f3301g = c1252l;
        this.f3302h = cls2;
        this.f3303i = cls3;
        this.f3304j = c1152b;
    }
}
