package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.AppEventListener;

@aqv
public final class aaa extends abi {
    final AppEventListener f4703a;

    public aaa(AppEventListener appEventListener) {
        this.f4703a = appEventListener;
    }

    public final void mo1683a(String str, String str2) {
        this.f4703a.onAppEvent(str, str2);
    }
}
