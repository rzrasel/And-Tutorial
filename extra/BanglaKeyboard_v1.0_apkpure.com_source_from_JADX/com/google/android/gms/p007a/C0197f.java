package com.google.android.gms.p007a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

final class C0197f implements C0194j {
    final /* synthetic */ FrameLayout f398a;
    final /* synthetic */ LayoutInflater f399b;
    final /* synthetic */ ViewGroup f400c;
    final /* synthetic */ Bundle f401d;
    final /* synthetic */ C0191b f402e;

    C0197f(C0191b c0191b, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f402e = c0191b;
        this.f398a = frameLayout;
        this.f399b = layoutInflater;
        this.f400c = viewGroup;
        this.f401d = bundle;
    }

    public final int mo664a() {
        return 2;
    }

    public final void mo665b() {
        this.f398a.removeAllViews();
        this.f398a.addView(this.f402e.f387a.mo1172a(this.f399b, this.f400c, this.f401d));
    }
}
