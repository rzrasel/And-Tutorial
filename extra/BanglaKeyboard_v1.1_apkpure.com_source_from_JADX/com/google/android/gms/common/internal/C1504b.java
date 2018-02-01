package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;

public abstract class C1504b {
    private static final Object f4555a = new Object();
    private static C1504b f4556b;

    public static C1504b m3835a(Context context) {
        synchronized (f4555a) {
            if (f4556b == null) {
                f4556b = new C1506d(context.getApplicationContext());
            }
        }
        return f4556b;
    }

    public final void m3836a(String str, String str2, int i, ServiceConnection serviceConnection) {
        mo1661b(new C1505c(str, str2, i), serviceConnection);
    }

    protected abstract boolean mo1660a(C1505c c1505c, ServiceConnection serviceConnection);

    protected abstract void mo1661b(C1505c c1505c, ServiceConnection serviceConnection);
}
