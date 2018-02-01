package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;

public final class io implements ServiceConnection {
    final /* synthetic */ in f1834a;

    public io(in inVar) {
        this.f1834a = inVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1834a.f1833h.f1824d) {
            this.f1834a.f1831f = iBinder;
            this.f1834a.f1832g = componentName;
            Iterator it = this.f1834a.f1828c.iterator();
            while (it.hasNext()) {
                ((C0372if) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f1834a.f1829d = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1834a.f1833h.f1824d) {
            this.f1834a.f1831f = null;
            this.f1834a.f1832g = componentName;
            Iterator it = this.f1834a.f1828c.iterator();
            while (it.hasNext()) {
                ((C0372if) it.next()).onServiceDisconnected(componentName);
            }
            this.f1834a.f1829d = 2;
        }
    }
}
