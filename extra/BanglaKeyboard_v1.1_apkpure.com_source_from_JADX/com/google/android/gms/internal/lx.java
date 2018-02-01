package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.C1518v;
import com.google.android.gms.common.internal.C1519x;
import com.google.android.gms.common.internal.C1520y;

public final class lx extends C1518v<ma> {
    public lx(Context context, Looper looper, C1519x c1519x, C1520y c1520y) {
        super(context, looper, 116, c1519x, c1520y);
    }

    protected final /* synthetic */ IInterface mo2189a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof ma ? (ma) queryLocalInterface : new mb(iBinder);
    }

    protected final String mo2190a() {
        return "com.google.android.gms.gass.START";
    }

    protected final String mo2191b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public final ma mo2192j() {
        return (ma) super.m3901h();
    }
}
