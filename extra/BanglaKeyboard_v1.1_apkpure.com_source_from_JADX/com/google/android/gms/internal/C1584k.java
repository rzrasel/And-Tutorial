package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C1518v;
import com.google.android.gms.common.internal.C1519x;
import com.google.android.gms.common.internal.C1520y;

@aqv
public final class C1584k extends C1518v<C1572q> {
    private int f6391f;

    public C1584k(Context context, Looper looper, C1519x c1519x, C1520y c1520y, int i) {
        super(context, looper, 8, c1519x, c1520y);
        this.f6391f = i;
    }

    protected final /* synthetic */ IInterface mo2189a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof C1572q ? (C1572q) queryLocalInterface : new C1647s(iBinder);
    }

    protected final String mo2190a() {
        return "com.google.android.gms.ads.service.START";
    }

    protected final String mo2191b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final C1572q mo2192j() {
        return (C1572q) super.m3901h();
    }
}
