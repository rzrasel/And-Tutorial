package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.je;
import com.google.android.gms.maps.model.C0488l;
import com.google.android.gms.maps.p013a.C0413y;
import com.google.android.gms.p007a.C0190a;
import com.google.android.gms.p007a.C0207q;

final class C0447j implements C0190a {
    final C0413y f2115a;
    private final ViewGroup f2116b;
    private View f2117c;

    public C0447j(ViewGroup viewGroup, C0413y c0413y) {
        this.f2115a = (C0413y) je.m2473a((Object) c0413y);
        this.f2116b = (ViewGroup) je.m2473a((Object) viewGroup);
    }

    public final View mo1172a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
    }

    public final void mo1173a() {
    }

    public final void mo1174a(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
    }

    public final void mo1175a(Bundle bundle) {
        try {
            this.f2115a.mo1007a(bundle);
            this.f2117c = (View) C0207q.m864a(this.f2115a.mo1013f());
            this.f2116b.removeAllViews();
            this.f2116b.addView(this.f2117c);
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1176b() {
        try {
            this.f2115a.mo1008b();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1177b(Bundle bundle) {
        try {
            this.f2115a.mo1009b(bundle);
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1178c() {
        try {
            this.f2115a.mo1010c();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1179d() {
    }

    public final void mo1180e() {
        throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
    }

    public final void mo1181f() {
        try {
            this.f2115a.mo1011d();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }

    public final void mo1182g() {
        try {
            this.f2115a.mo1012e();
        } catch (RemoteException e) {
            throw new C0488l(e);
        }
    }
}
