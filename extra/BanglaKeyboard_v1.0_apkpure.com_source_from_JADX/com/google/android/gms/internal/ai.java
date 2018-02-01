package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.C0176a;
import com.google.android.gms.ads.doubleclick.C0221a;
import com.google.android.gms.ads.p009c.C0218a;

public final class ai {
    public final br f926a;
    public final Context f927b;
    public final C0401p f928c;
    public C0176a f929d;
    public C0398v f930e;
    public String f931f;
    public C0221a f932g;
    public C0218a f933h;

    public ai(Context context) {
        this(context, C0401p.m2751a());
    }

    private ai(Context context, C0401p c0401p) {
        this.f926a = new br();
        this.f927b = context;
        this.f928c = c0401p;
    }

    public final void m1638a(String str) {
        if (this.f930e == null) {
            throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + str + " is called.");
        }
    }

    public final boolean m1639a() {
        boolean z = false;
        try {
            if (this.f930e != null) {
                z = this.f930e.mo983c();
            }
        } catch (Throwable e) {
            gb.m2070a("Failed to check if ad is ready.", e);
        }
        return z;
    }
}
