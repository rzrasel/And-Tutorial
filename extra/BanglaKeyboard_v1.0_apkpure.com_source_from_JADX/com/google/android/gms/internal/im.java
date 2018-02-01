package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;

public final class im implements Callback {
    private static final Object f1821a = new Object();
    private static im f1822b;
    private final Context f1823c;
    private final HashMap f1824d = new HashMap();
    private final Handler f1825e;

    private im(Context context) {
        this.f1825e = new Handler(context.getMainLooper(), this);
        this.f1823c = context.getApplicationContext();
    }

    public static im m2397a(Context context) {
        synchronized (f1821a) {
            if (f1822b == null) {
                f1822b = new im(context.getApplicationContext());
            }
        }
        return f1822b;
    }

    public final boolean m2399a(String str, C0372if c0372if) {
        boolean z;
        synchronized (this.f1824d) {
            in inVar = (in) this.f1824d.get(str);
            if (inVar != null) {
                this.f1825e.removeMessages(0, inVar);
                if (!inVar.m2402b(c0372if)) {
                    inVar.m2401a(c0372if);
                    switch (inVar.f1829d) {
                        case 1:
                            c0372if.onServiceConnected(inVar.f1832g, inVar.f1831f);
                            break;
                        case 2:
                            inVar.f1830e = this.f1823c.bindService(new Intent(str).setPackage("com.google.android.gms"), inVar.f1827b, 129);
                            break;
                        default:
                            break;
                    }
                }
                throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + str);
            }
            inVar = new in(this, str);
            inVar.m2401a(c0372if);
            inVar.f1830e = this.f1823c.bindService(new Intent(str).setPackage("com.google.android.gms"), inVar.f1827b, 129);
            this.f1824d.put(str, inVar);
            z = inVar.f1830e;
        }
        return z;
    }

    public final void m2400b(String str, C0372if c0372if) {
        synchronized (this.f1824d) {
            in inVar = (in) this.f1824d.get(str);
            if (inVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service action: " + str);
            } else if (inVar.m2402b(c0372if)) {
                inVar.f1828c.remove(c0372if);
                if (inVar.f1828c.isEmpty()) {
                    this.f1825e.sendMessageDelayed(this.f1825e.obtainMessage(0, inVar), 5000);
                }
            } else {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + str);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                in inVar = (in) message.obj;
                synchronized (this.f1824d) {
                    if (inVar.f1828c.isEmpty()) {
                        this.f1823c.unbindService(inVar.f1827b);
                        this.f1824d.remove(inVar.f1826a);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
