package com.google.android.gms.internal;

import android.database.ContentObserver;
import android.os.Handler;

final class wn extends ContentObserver {
    private /* synthetic */ wk f7362a;

    public wn(wk wkVar, Handler handler) {
        this.f7362a = wkVar;
        super(handler);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.f7362a.m6930a();
    }
}
