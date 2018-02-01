package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class ad implements ServiceConnection {
    private final int f4546a;
    private /* synthetic */ C1518v f4547b;

    public ad(C1518v c1518v, int i) {
        this.f4547b = c1518v;
        this.f4546a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            C1518v.m3874a(this.f4547b);
            return;
        }
        synchronized (this.f4547b.f4600o) {
            C1511o c1511o;
            C1518v c1518v = this.f4547b;
            if (iBinder == null) {
                c1511o = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                c1511o = (queryLocalInterface == null || !(queryLocalInterface instanceof C1511o)) ? new C1512p(iBinder) : (C1511o) queryLocalInterface;
            }
            c1518v.f4601p = c1511o;
        }
        this.f4547b.m3892a(0, this.f4546a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f4547b.f4600o) {
            this.f4547b.f4601p = null;
        }
        this.f4547b.f4588c.sendMessage(this.f4547b.f4588c.obtainMessage(6, this.f4546a, 1));
    }
}
