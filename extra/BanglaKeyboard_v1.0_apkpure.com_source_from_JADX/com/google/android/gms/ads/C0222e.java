package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.C0360do;
import com.google.android.gms.internal.C0396m;
import com.google.android.gms.internal.C0397n;
import com.google.android.gms.internal.C0398v;
import com.google.android.gms.internal.C0401p;
import com.google.android.gms.internal.C0403r;
import com.google.android.gms.internal.ae;
import com.google.android.gms.internal.ai;
import com.google.android.gms.internal.ak;
import com.google.android.gms.internal.gb;

public final class C0222e {
    private final ai f431a;

    public C0222e(Context context) {
        this.f431a = new ai(context);
    }

    public final void m923a(C0176a c0176a) {
        ai aiVar = this.f431a;
        try {
            aiVar.f929d = c0176a;
            if (aiVar.f930e != null) {
                aiVar.f930e.mo977a(c0176a != null ? new C0396m(c0176a) : null);
            }
        } catch (Throwable e) {
            gb.m2070a("Failed to set the AdListener.", e);
        }
    }

    public final void m924a(C0217b c0217b) {
        ai aiVar = this.f431a;
        ae a = c0217b.m916a();
        try {
            if (aiVar.f930e == null) {
                String str = "loadAd";
                if (aiVar.f931f == null) {
                    aiVar.m1638a(str);
                }
                aiVar.f930e = C0397n.m2658a(aiVar.f927b, new ak(), aiVar.f931f, aiVar.f926a);
                if (aiVar.f929d != null) {
                    aiVar.f930e.mo977a(new C0396m(aiVar.f929d));
                }
                if (aiVar.f932g != null) {
                    aiVar.f930e.mo973a(new C0403r(aiVar.f932g));
                }
                if (aiVar.f933h != null) {
                    aiVar.f930e.mo975a(new C0360do(aiVar.f933h));
                }
            }
            C0398v c0398v = aiVar.f930e;
            C0401p c0401p = aiVar.f928c;
            if (c0398v.mo981a(C0401p.m2750a(aiVar.f927b, a))) {
                aiVar.f926a.m1712a(a.m1630i());
                aiVar.f926a.m1713b(a.m1631j());
            }
        } catch (Throwable e) {
            gb.m2070a("Failed to load ad.", e);
        }
    }

    public final void m925a(String str) {
        ai aiVar = this.f431a;
        if (aiVar.f931f != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        aiVar.f931f = str;
    }

    public final boolean m926a() {
        return this.f431a.m1639a();
    }

    public final void m927b() {
        ai aiVar = this.f431a;
        try {
            aiVar.m1638a("show");
            aiVar.f930e.mo986f();
        } catch (Throwable e) {
            gb.m2070a("Failed to show interstitial.", e);
        }
    }
}
