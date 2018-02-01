package com.google.android.gms.p007a;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

public final class C0210u extends C0202l {
    private Fragment f412a;

    private C0210u(Fragment fragment) {
        this.f412a = fragment;
    }

    public static C0210u m867a(Fragment fragment) {
        return fragment != null ? new C0210u(fragment) : null;
    }

    public final C0204n mo666a() {
        return C0207q.m863a(this.f412a.getActivity());
    }

    public final void mo667a(Intent intent) {
        this.f412a.startActivity(intent);
    }

    public final void mo668a(Intent intent, int i) {
        this.f412a.startActivityForResult(intent, i);
    }

    public final void mo669a(C0204n c0204n) {
        this.f412a.registerForContextMenu((View) C0207q.m864a(c0204n));
    }

    public final void mo670a(boolean z) {
        this.f412a.setHasOptionsMenu(z);
    }

    public final Bundle mo671b() {
        return this.f412a.getArguments();
    }

    public final void mo672b(C0204n c0204n) {
        this.f412a.unregisterForContextMenu((View) C0207q.m864a(c0204n));
    }

    public final void mo673b(boolean z) {
        this.f412a.setMenuVisibility(z);
    }

    public final int mo674c() {
        return this.f412a.getId();
    }

    public final void mo675c(boolean z) {
        this.f412a.setRetainInstance(z);
    }

    public final C0201k mo676d() {
        return C0210u.m867a(this.f412a.getParentFragment());
    }

    public final void mo677d(boolean z) {
        this.f412a.setUserVisibleHint(z);
    }

    public final C0204n mo678e() {
        return C0207q.m863a(this.f412a.getResources());
    }

    public final boolean mo679f() {
        return this.f412a.getRetainInstance();
    }

    public final String mo680g() {
        return this.f412a.getTag();
    }

    public final C0201k mo681h() {
        return C0210u.m867a(this.f412a.getTargetFragment());
    }

    public final int mo682i() {
        return this.f412a.getTargetRequestCode();
    }

    public final boolean mo683j() {
        return this.f412a.getUserVisibleHint();
    }

    public final C0204n mo684k() {
        return C0207q.m863a(this.f412a.getView());
    }

    public final boolean mo685l() {
        return this.f412a.isAdded();
    }

    public final boolean mo686m() {
        return this.f412a.isDetached();
    }

    public final boolean mo687n() {
        return this.f412a.isHidden();
    }

    public final boolean mo688o() {
        return this.f412a.isInLayout();
    }

    public final boolean mo689p() {
        return this.f412a.isRemoving();
    }

    public final boolean mo690q() {
        return this.f412a.isResumed();
    }

    public final boolean mo691r() {
        return this.f412a.isVisible();
    }
}
