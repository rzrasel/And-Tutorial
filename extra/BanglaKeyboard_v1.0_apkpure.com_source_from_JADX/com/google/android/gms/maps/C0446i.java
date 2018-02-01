package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.C0247f;
import com.google.android.gms.maps.model.C0488l;
import com.google.android.gms.maps.p013a.ci;
import com.google.android.gms.p007a.C0191b;
import com.google.android.gms.p007a.C0192r;
import com.google.android.gms.p007a.C0207q;

final class C0446i extends C0191b {
    protected C0192r f2111d;
    private final ViewGroup f2112e;
    private final Context f2113f;
    private final StreetViewPanoramaOptions f2114g = null;

    C0446i(ViewGroup viewGroup, Context context) {
        this.f2112e = viewGroup;
        this.f2113f = context;
    }

    protected final void mo1183a(C0192r c0192r) {
        this.f2111d = c0192r;
        m3176g();
    }

    public final void m3176g() {
        if (this.f2111d != null && this.f387a == null) {
            try {
                this.f2111d.mo663a(new C0447j(this.f2112e, ci.m2947a(this.f2113f).mo1035a(C0207q.m863a(this.f2113f), this.f2114g)));
            } catch (RemoteException e) {
                throw new C0488l(e);
            } catch (C0247f e2) {
            }
        }
    }
}
