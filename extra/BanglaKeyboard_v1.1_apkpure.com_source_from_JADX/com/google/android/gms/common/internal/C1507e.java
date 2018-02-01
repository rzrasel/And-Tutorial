package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.C1530a;
import java.util.HashSet;
import java.util.Set;

final class C1507e implements ServiceConnection {
    final Set<ServiceConnection> f4567a = new HashSet();
    int f4568b = 2;
    boolean f4569c;
    IBinder f4570d;
    final C1505c f4571e;
    ComponentName f4572f;
    /* synthetic */ C1506d f4573g;

    public C1507e(C1506d c1506d, C1505c c1505c) {
        this.f4573g = c1506d;
        this.f4571e = c1505c;
    }

    public final void m3847a() {
        this.f4568b = 3;
        this.f4573g.f4564d;
        this.f4569c = C1530a.m3928a(this.f4573g.f4562b, this.f4571e.m3839a(), this, this.f4571e.f4559c);
        if (this.f4569c) {
            this.f4573g.f4563c.sendMessageDelayed(this.f4573g.f4563c.obtainMessage(1, this.f4571e), this.f4573g.f4566f);
            return;
        }
        this.f4568b = 2;
        try {
            this.f4573g.f4564d;
            this.f4573g.f4562b.unbindService(this);
        } catch (IllegalArgumentException e) {
        }
    }

    public final void m3848a(ServiceConnection serviceConnection) {
        this.f4573g.f4564d;
        this.f4573g.f4562b;
        this.f4571e.m3839a();
        this.f4567a.add(serviceConnection);
    }

    public final boolean m3849b() {
        return this.f4567a.isEmpty();
    }

    public final boolean m3850b(ServiceConnection serviceConnection) {
        return this.f4567a.contains(serviceConnection);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f4573g.f4561a) {
            this.f4573g.f4563c.removeMessages(1, this.f4571e);
            this.f4570d = iBinder;
            this.f4572f = componentName;
            for (ServiceConnection onServiceConnected : this.f4567a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f4568b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f4573g.f4561a) {
            this.f4573g.f4563c.removeMessages(1, this.f4571e);
            this.f4570d = null;
            this.f4572f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f4567a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f4568b = 2;
        }
    }
}
