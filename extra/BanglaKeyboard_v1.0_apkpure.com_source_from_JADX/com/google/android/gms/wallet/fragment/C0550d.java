package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.lx;
import com.google.android.gms.p007a.C0190a;
import com.google.android.gms.p007a.C0207q;

final class C0550d implements C0190a {
    final lx f2510a;

    private C0550d(lx lxVar) {
        this.f2510a = lxVar;
    }

    public final View mo1172a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            return (View) C0207q.m864a(this.f2510a.mo942a(C0207q.m863a((Object) layoutInflater), C0207q.m863a((Object) viewGroup), bundle));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo1173a() {
        try {
            this.f2510a.mo943a();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo1174a(Activity activity, Bundle bundle, Bundle bundle2) {
        try {
            this.f2510a.mo946a(C0207q.m863a((Object) activity), (WalletFragmentOptions) bundle.getParcelable("extraWalletFragmentOptions"), bundle2);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo1175a(Bundle bundle) {
        try {
            this.f2510a.mo945a(bundle);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo1176b() {
        try {
            this.f2510a.mo950b();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo1177b(Bundle bundle) {
        try {
            this.f2510a.mo951b(bundle);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo1178c() {
        try {
            this.f2510a.mo952c();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo1179d() {
        try {
            this.f2510a.mo953d();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final void mo1180e() {
    }

    public final void mo1181f() {
    }

    public final void mo1182g() {
    }
}
