package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;

@aqv
public final class eo {
    public final Object f6058a;
    public int f6059b;
    public int f6060c;
    public final ej f6061d;
    public final String f6062e;

    private eo(ej ejVar, String str) {
        this.f6058a = new Object();
        this.f6061d = ejVar;
        this.f6062e = str;
    }

    public eo(String str) {
        this(zzbv.zzee(), str);
    }

    public final Bundle m5367a() {
        Bundle bundle;
        synchronized (this.f6058a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f6059b);
            bundle.putInt("pmnll", this.f6060c);
        }
        return bundle;
    }
}
