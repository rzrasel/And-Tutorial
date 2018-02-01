package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.C1538g;
import java.lang.reflect.InvocationTargetException;

public final class lk {
    private static Context f6569a;
    private static Boolean f6570b;

    public static synchronized boolean m5972a(Context context) {
        boolean booleanValue;
        synchronized (lk.class) {
            Context applicationContext = context.getApplicationContext();
            if (f6569a == null || f6570b == null || f6569a != applicationContext) {
                f6570b = null;
                if (C1538g.m3947g()) {
                    try {
                        f6570b = (Boolean) PackageManager.class.getDeclaredMethod("isInstantApp", new Class[0]).invoke(applicationContext.getPackageManager(), new Object[0]);
                    } catch (NoSuchMethodException e) {
                        f6570b = Boolean.valueOf(false);
                        f6569a = applicationContext;
                        booleanValue = f6570b.booleanValue();
                        return booleanValue;
                    } catch (InvocationTargetException e2) {
                        f6570b = Boolean.valueOf(false);
                        f6569a = applicationContext;
                        booleanValue = f6570b.booleanValue();
                        return booleanValue;
                    } catch (IllegalAccessException e3) {
                        f6570b = Boolean.valueOf(false);
                        f6569a = applicationContext;
                        booleanValue = f6570b.booleanValue();
                        return booleanValue;
                    }
                }
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f6570b = Boolean.valueOf(true);
                } catch (ClassNotFoundException e4) {
                    f6570b = Boolean.valueOf(false);
                }
                f6569a = applicationContext;
                booleanValue = f6570b.booleanValue();
            } else {
                booleanValue = f6570b.booleanValue();
            }
        }
        return booleanValue;
    }
}
