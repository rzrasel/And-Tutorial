package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.je;
import com.google.android.gms.maps.model.C0488l;
import com.google.android.gms.maps.p013a.C0425m;
import com.google.android.gms.p007a.C0190a;
import com.google.android.gms.p007a.C0207q;

final class C0441d implements C0190a {
    final C0425m f2103a;
    private final ViewGroup f2104b;
    private View f2105c;

    public C0441d(ViewGroup viewGroup, C0425m c0425m) {
        this.f2103a = (C0425m) je.m2473a((Object) c0425m);
        this.f2104b = (ViewGroup) je.m2473a((Object) viewGroup);
    }

    public final View mo1172a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    public final void mo1173a() {
    }

    public final void mo1174a(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    public final void mo1175a(Bundle bundle) {
        try {
            this.f2103a.mo1132a(bundle);
            this.f2105c = (View) C0207q.m864a(this.f2103a.mo1138f());
            this.f2104b.removeAllViews();
            this.f2104b.addView(this.f2105c);
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1176b() {
        try {
            this.f2103a.mo1133b();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1177b(Bundle bundle) {
        try {
            this.f2103a.mo1134b(bundle);
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1178c() {
        try {
            this.f2103a.mo1135c();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1179d() {
    }

    public final void mo1180e() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    public final void mo1181f() {
        try {
            this.f2103a.mo1136d();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1182g() {
        try {
            this.f2103a.mo1137e();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }
}
