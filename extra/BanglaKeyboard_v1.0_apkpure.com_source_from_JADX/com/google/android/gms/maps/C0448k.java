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
import com.google.android.gms.maps.p013a.C0422j;
import com.google.android.gms.maps.p013a.ch;
import com.google.android.gms.p007a.C0190a;
import com.google.android.gms.p007a.C0207q;

final class C0448k implements C0190a {
    private final Fragment f2118a;
    private final C0422j f2119b;

    public C0448k(Fragment fragment, C0422j c0422j) {
        this.f2119b = (C0422j) je.m2473a((Object) c0422j);
        this.f2118a = (Fragment) je.m2473a((Object) fragment);
    }

    public final View mo1172a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            return (View) C0207q.m864a(this.f2119b.mo1120a(C0207q.m863a((Object) layoutInflater), C0207q.m863a((Object) viewGroup), bundle));
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1173a() {
    }

    public final void mo1174a(Activity activity, Bundle bundle, Bundle bundle2) {
        try {
            this.f2119b.mo1123a(C0207q.m863a((Object) activity), (GoogleMapOptions) bundle.getParcelable("MapOptions"), bundle2);
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
        Bundle arguments = this.f2118a.getArguments();
        if (arguments != null && arguments.containsKey("MapOptions")) {
            ch.m2946a(bundle, "MapOptions", arguments.getParcelable("MapOptions"));
        }
        this.f2119b.mo1122a(bundle);
    }

    public final void mo1176b() {
        try {
            this.f2119b.mo1124b();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1177b(Bundle bundle) {
        try {
            this.f2119b.mo1125b(bundle);
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1178c() {
        try {
            this.f2119b.mo1126c();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1179d() {
    }

    public final void mo1180e() {
        try {
            this.f2119b.mo1127d();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1181f() {
        try {
            this.f2119b.mo1128e();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1182g() {
        try {
            this.f2119b.mo1129f();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }
}
