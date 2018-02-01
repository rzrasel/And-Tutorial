package com.google.android.gms.tagmanager;

import java.util.List;

final class bh implements Runnable {
    final /* synthetic */ List f2353a;
    final /* synthetic */ long f2354b;
    final /* synthetic */ bg f2355c;

    bh(bg bgVar, List list, long j) {
        this.f2355c = bgVar;
        this.f2353a = list;
        this.f2354b = j;
    }

    public final void run() {
        this.f2355c.m3695b(this.f2353a, this.f2354b);
    }
}
