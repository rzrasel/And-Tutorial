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

final class C0449l extends C0191b {
    protected C0192r f2120d;
    private final Fragment f2121e;
    private Activity f2122f;

    C0449l(Fragment fragment) {
        this.f2121e = fragment;
    }

    static /* synthetic */ void m3199a(C0449l c0449l, Activity activity) {
        c0449l.f2122f = activity;
        c0449l.m3200g();
    }

    private void m3200g() {
        if (this.f2122f != null && this.f2120d != null && this.f387a == null) {
            try {
                C0443f.m3172a(this.f2122f);
                this.f2120d.mo663a(new C0448k(this.f2121e, ci.m2947a(this.f2122f).mo1038b(C0207q.m863a(this.f2122f))));
            } catch (RemoteException e) {
                throw new C0488l(e);
            } catch (C0247f e2) {
            }
        }
    }

    protected final void mo1183a(C0192r c0192r) {
        this.f2120d = c0192r;
        m3200g();
    }
}
