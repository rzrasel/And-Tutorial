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

final class C0442e extends C0191b {
    protected C0192r f2106d;
    private final ViewGroup f2107e;
    private final Context f2108f;
    private final GoogleMapOptions f2109g;

    C0442e(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f2107e = viewGroup;
        this.f2108f = context;
        this.f2109g = googleMapOptions;
    }

    protected final void mo1183a(C0192r c0192r) {
        this.f2106d = c0192r;
        m3171g();
    }

    public final void m3171g() {
        if (this.f2106d != null && this.f387a == null) {
            try {
                this.f2106d.mo663a(new C0441d(this.f2107e, ci.m2947a(this.f2108f).mo1034a(C0207q.m863a(this.f2108f), this.f2109g)));
            } catch (RemoteException e) {
                throw new C0488l(e);
            } catch (C0247f e2) {
            }
        }
    }
}
