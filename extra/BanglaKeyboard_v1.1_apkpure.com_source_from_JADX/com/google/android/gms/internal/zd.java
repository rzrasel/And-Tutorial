package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C1518v;
import com.google.android.gms.common.internal.C1519x;
import com.google.android.gms.common.internal.C1520y;

@aqv
public final class zd extends C1518v<zg> {
    zd(Context context, Looper looper, C1519x c1519x, C1520y c1520y) {
        super(context, looper, 123, c1519x, c1520y);
    }

    protected final /* synthetic */ IInterface mo2189a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof zg ? (zg) queryLocalInterface : new zh(iBinder);
    }

    protected final String mo2190a() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    protected final String mo2191b() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    public final zg mo2192j() {
        return (zg) super.m3901h();
    }
}
