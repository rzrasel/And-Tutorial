package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.C0247f;
import com.google.android.gms.maps.model.C0488l;
import com.google.android.gms.maps.p013a.ci;
import com.google.android.gms.p007a.C0191b;
import com.google.android.gms.p007a.C0192r;
import com.google.android.gms.p007a.C0207q;

final class C0499n extends C0191b {
    protected C0192r f2237d;
    private final Fragment f2238e;
    private Activity f2239f;

    C0499n(Fragment fragment) {
        this.f2238e = fragment;
    }

    static /* synthetic */ void m3569a(C0499n c0499n, Activity activity) {
        c0499n.f2239f = activity;
        c0499n.m3570g();
    }

    private void m3570g() {
        if (this.f2239f != null && this.f2237d != null && this.f387a == null) {
            try {
                C0443f.m3172a(this.f2239f);
                this.f2237d.mo663a(new C0450m(this.f2238e, ci.m2947a(this.f2239f).mo1040c(C0207q.m863a(this.f2239f))));
            } catch (RemoteException e) {
                throw new C0488l(e);
            } catch (C0247f e2) {
            }
        }
    }

    protected final void mo1183a(C0192r c0192r) {
        this.f2237d = c0192r;
        m3570g();
    }
}
