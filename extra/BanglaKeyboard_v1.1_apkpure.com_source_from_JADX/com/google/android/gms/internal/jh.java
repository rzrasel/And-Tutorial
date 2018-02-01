package com.google.android.gms.internal;

import android.view.View;

final class jh implements Runnable {
    private /* synthetic */ View f6311a;
    private /* synthetic */ dq f6312b;
    private /* synthetic */ int f6313c;
    private /* synthetic */ jg f6314d;

    jh(jg jgVar, View view, dq dqVar, int i) {
        this.f6314d = jgVar;
        this.f6311a = view;
        this.f6312b = dqVar;
        this.f6313c = i;
    }

    public final void run() {
        this.f6314d.m5718a(this.f6311a, this.f6312b, this.f6313c - 1);
    }
}
