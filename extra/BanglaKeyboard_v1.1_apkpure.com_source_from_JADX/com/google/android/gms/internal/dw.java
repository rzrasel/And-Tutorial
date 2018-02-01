package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.Callable;

final /* synthetic */ class dw implements Callable {
    private final du f5937a;
    private final Context f5938b;

    dw(du duVar, Context context) {
        this.f5937a = duVar;
        this.f5938b = context;
    }

    public final Object call() {
        return (String) this.f5937a.m5291a("getAppInstanceId", this.f5938b);
    }
}
