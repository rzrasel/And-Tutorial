package com.google.android.gms.internal;

import com.google.android.gms.ads.p003b.C0215d;
import com.google.android.gms.ads.p003b.C0216f;

public final class cf implements C0215d, C0216f {
    private final by f1123a;

    public cf(by byVar) {
        this.f1123a = byVar;
    }

    public final void mo847a() {
        je.m2475a("onAdLoaded must be called on the main UI thread.");
        gb.m2071a(3);
        try {
            this.f1123a.mo830e();
        } catch (Throwable e) {
            gb.m2070a("Could not call onAdLoaded.", e);
        }
    }

    public final void mo848a(int i) {
        je.m2475a("onAdFailedToLoad must be called on the main UI thread.");
        "Adapter called onAdFailedToLoad with error. " + i;
        gb.m2071a(3);
        try {
            this.f1123a.mo826a(i);
        } catch (Throwable e) {
            gb.m2070a("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void mo849b() {
        je.m2475a("onAdOpened must be called on the main UI thread.");
        gb.m2071a(3);
        try {
            this.f1123a.mo829d();
        } catch (Throwable e) {
            gb.m2070a("Could not call onAdOpened.", e);
        }
    }

    public final void mo850b(int i) {
        je.m2475a("onAdFailedToLoad must be called on the main UI thread.");
        "Adapter called onAdFailedToLoad with error " + i + ".";
        gb.m2071a(3);
        try {
            this.f1123a.mo826a(i);
        } catch (Throwable e) {
            gb.m2070a("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void mo851c() {
        je.m2475a("onAdClosed must be called on the main UI thread.");
        gb.m2071a(3);
        try {
            this.f1123a.mo827b();
        } catch (Throwable e) {
            gb.m2070a("Could not call onAdClosed.", e);
        }
    }

    public final void mo852d() {
        je.m2475a("onAdLeftApplication must be called on the main UI thread.");
        gb.m2071a(3);
        try {
            this.f1123a.mo828c();
        } catch (Throwable e) {
            gb.m2070a("Could not call onAdLeftApplication.", e);
        }
    }

    public final void mo853e() {
        je.m2475a("onClick must be called on the main UI thread.");
        gb.m2071a(3);
        try {
            this.f1123a.mo825a();
        } catch (Throwable e) {
            gb.m2070a("Could not call onAdClicked.", e);
        }
    }

    public final void mo854f() {
        je.m2475a("onAdLoaded must be called on the main UI thread.");
        gb.m2071a(3);
        try {
            this.f1123a.mo830e();
        } catch (Throwable e) {
            gb.m2070a("Could not call onAdLoaded.", e);
        }
    }

    public final void mo855g() {
        je.m2475a("onAdOpened must be called on the main UI thread.");
        gb.m2071a(3);
        try {
            this.f1123a.mo829d();
        } catch (Throwable e) {
            gb.m2070a("Could not call onAdOpened.", e);
        }
    }

    public final void mo856h() {
        je.m2475a("onAdClosed must be called on the main UI thread.");
        gb.m2071a(3);
        try {
            this.f1123a.mo827b();
        } catch (Throwable e) {
            gb.m2070a("Could not call onAdClosed.", e);
        }
    }

    public final void mo857i() {
        je.m2475a("onAdLeftApplication must be called on the main UI thread.");
        gb.m2071a(3);
        try {
            this.f1123a.mo828c();
        } catch (Throwable e) {
            gb.m2070a("Could not call onAdLeftApplication.", e);
        }
    }
}
