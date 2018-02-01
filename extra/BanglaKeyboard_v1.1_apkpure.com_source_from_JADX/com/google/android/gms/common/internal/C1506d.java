package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.stats.C1530a;
import java.util.HashMap;

final class C1506d extends C1504b implements Callback {
    private final HashMap<C1505c, C1507e> f4561a = new HashMap();
    private final Context f4562b;
    private final Handler f4563c;
    private final C1530a f4564d;
    private final long f4565e;
    private final long f4566f;

    C1506d(Context context) {
        this.f4562b = context.getApplicationContext();
        this.f4563c = new Handler(context.getMainLooper(), this);
        this.f4564d = C1530a.m3927a();
        this.f4565e = 5000;
        this.f4566f = 300000;
    }

    protected final boolean mo1660a(C1505c c1505c, ServiceConnection serviceConnection) {
        boolean z;
        C1516t.m3861a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f4561a) {
            C1507e c1507e = (C1507e) this.f4561a.get(c1505c);
            if (c1507e != null) {
                this.f4563c.removeMessages(0, c1505c);
                if (!c1507e.m3850b(serviceConnection)) {
                    c1507e.m3848a(serviceConnection);
                    switch (c1507e.f4568b) {
                        case 1:
                            serviceConnection.onServiceConnected(c1507e.f4572f, c1507e.f4570d);
                            break;
                        case 2:
                            c1507e.m3847a();
                            break;
                        default:
                            break;
                    }
                }
                String valueOf = String.valueOf(c1505c);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(valueOf).toString());
            }
            c1507e = new C1507e(this, c1505c);
            c1507e.m3848a(serviceConnection);
            c1507e.m3847a();
            this.f4561a.put(c1505c, c1507e);
            z = c1507e.f4569c;
        }
        return z;
    }

    protected final void mo1661b(C1505c c1505c, ServiceConnection serviceConnection) {
        C1516t.m3861a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f4561a) {
            C1507e c1507e = (C1507e) this.f4561a.get(c1505c);
            String valueOf;
            if (c1507e == null) {
                valueOf = String.valueOf(c1505c);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Nonexistent connection status for service config: ").append(valueOf).toString());
            } else if (c1507e.m3850b(serviceConnection)) {
                c1507e.f4567a.remove(serviceConnection);
                if (c1507e.m3849b()) {
                    this.f4563c.sendMessageDelayed(this.f4563c.obtainMessage(0, c1505c), this.f4565e);
                }
            } else {
                valueOf = String.valueOf(c1505c);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(valueOf).toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        C1505c c1505c;
        C1507e c1507e;
        switch (message.what) {
            case 0:
                synchronized (this.f4561a) {
                    c1505c = (C1505c) message.obj;
                    c1507e = (C1507e) this.f4561a.get(c1505c);
                    if (c1507e != null && c1507e.m3849b()) {
                        if (c1507e.f4569c) {
                            c1507e.f4573g.f4563c.removeMessages(1, c1507e.f4571e);
                            c1507e.f4573g.f4562b.unbindService(c1507e);
                            c1507e.f4569c = false;
                            c1507e.f4568b = 2;
                        }
                        this.f4561a.remove(c1505c);
                    }
                }
                return true;
            case 1:
                synchronized (this.f4561a) {
                    c1505c = (C1505c) message.obj;
                    c1507e = (C1507e) this.f4561a.get(c1505c);
                    if (c1507e != null && c1507e.f4568b == 3) {
                        String valueOf = String.valueOf(c1505c);
                        Log.wtf("GmsClientSupervisor", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Timeout waiting for ServiceConnection callback ").append(valueOf).toString(), new Exception());
                        ComponentName componentName = c1507e.f4572f;
                        if (componentName == null) {
                            componentName = c1505c.f4558b;
                        }
                        c1507e.onServiceDisconnected(componentName == null ? new ComponentName(c1505c.f4557a, "unknown") : componentName);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
