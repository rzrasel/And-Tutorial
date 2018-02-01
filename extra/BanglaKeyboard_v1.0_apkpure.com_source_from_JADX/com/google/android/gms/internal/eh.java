package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.C0236e;
import com.google.android.gms.common.C0241d;

public final class eh extends hy {
    final int f1260a;

    public eh(Context context, C0241d c0241d, C0236e c0236e, int i) {
        super(context, c0241d, c0236e, new String[0]);
        this.f1260a = i;
    }

    protected final /* synthetic */ IInterface mo884a(IBinder iBinder) {
        return eo.m1941a(iBinder);
    }

    protected final String mo885a() {
        return "com.google.android.gms.ads.service.START";
    }

    protected final void mo886a(it itVar, id idVar) {
        itVar.mo921g(idVar, this.f1260a, this.f1251b.getPackageName(), new Bundle());
    }

    protected final String mo887b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final en m1932c() {
        if (mo882e()) {
            return (en) this.f1253d;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
}
