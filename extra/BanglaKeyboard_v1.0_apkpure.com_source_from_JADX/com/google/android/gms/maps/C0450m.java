package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.je;
import com.google.android.gms.maps.model.C0488l;
import com.google.android.gms.maps.p013a.C0434v;
import com.google.android.gms.maps.p013a.ch;
import com.google.android.gms.p007a.C0190a;
import com.google.android.gms.p007a.C0207q;

final class C0450m implements C0190a {
    private final Fragment f2123a;
    private final C0434v f2124b;

    public C0450m(Fragment fragment, C0434v c0434v) {
        this.f2124b = (C0434v) je.m2473a((Object) c0434v);
        this.f2123a = (Fragment) je.m2473a((Object) fragment);
    }

    public final View mo1172a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            return (View) C0207q.m864a(this.f2124b.mo1161a(C0207q.m863a((Object) layoutInflater), C0207q.m863a((Object) viewGroup), bundle));
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1173a() {
    }

    public final void mo1174a(Activity activity, Bundle bundle, Bundle bundle2) {
        try {
            this.f2124b.mo1164a(C0207q.m863a((Object) activity), null, bundle2);
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1175a(Bundle bundle) {
        if (bundle == null) {
            try {
                bundle = new Bundle();
            } catch (RemoteException e) {
                throw new C0488l(e);
            }
        }
        Bundle arguments = this.f2123a.getArguments();
        if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
            ch.m2946a(bundle, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
        }
        this.f2124b.mo1163a(bundle);
    }

    public final void mo1176b() {
        try {
            this.f2124b.mo1165b();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1177b(Bundle bundle) {
        try {
            this.f2124b.mo1166b(bundle);
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1178c() {
        try {
            this.f2124b.mo1167c();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1179d() {
    }

    public final void mo1180e() {
        try {
            this.f2124b.mo1168d();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1181f() {
        try {
            this.f2124b.mo1169e();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1182g() {
        try {
            this.f2124b.mo1170f();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }
}
