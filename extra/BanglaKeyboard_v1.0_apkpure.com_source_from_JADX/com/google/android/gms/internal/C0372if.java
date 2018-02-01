package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class C0372if implements ServiceConnection {
    final /* synthetic */ hy f1722a;

    C0372if(hy hyVar) {
        this.f1722a = hyVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1722a.m1922b(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f1722a.f1252c.sendMessage(this.f1722a.f1252c.obtainMessage(4, Integer.valueOf(1)));
    }
}
