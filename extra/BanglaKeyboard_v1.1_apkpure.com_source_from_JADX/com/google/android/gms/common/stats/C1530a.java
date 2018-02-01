package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C1532a;
import java.util.Collections;
import java.util.List;

public final class C1530a {
    private static final Object f4650a = new Object();
    private static volatile C1530a f4651b;
    private static boolean f4652c = false;
    private final List<String> f4653d = Collections.EMPTY_LIST;
    private final List<String> f4654e = Collections.EMPTY_LIST;
    private final List<String> f4655f = Collections.EMPTY_LIST;
    private final List<String> f4656g = Collections.EMPTY_LIST;

    private C1530a() {
    }

    public static C1530a m3927a() {
        if (f4651b == null) {
            synchronized (f4650a) {
                if (f4651b == null) {
                    f4651b = new C1530a();
                }
            }
        }
        return f4651b;
    }

    public static boolean m3928a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : C1532a.m3929a(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
