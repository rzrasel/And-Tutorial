package com.google.android.gms.internal;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class na {
    protected static volatile zn f6667a = null;
    private static final ConditionVariable f6668d = new ConditionVariable();
    private static volatile Random f6669e = null;
    protected volatile Boolean f6670b;
    private np f6671c;

    public na(np npVar) {
        this.f6671c = npVar;
        npVar.f6729c.execute(new nb(this));
    }

    public static int m6031a() {
        try {
            return VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : m6034c().nextInt();
        } catch (RuntimeException e) {
            return m6034c().nextInt();
        }
    }

    private static Random m6034c() {
        if (f6669e == null) {
            synchronized (na.class) {
                if (f6669e == null) {
                    f6669e = new Random();
                }
            }
        }
        return f6669e;
    }

    public final void m6035a(int i, int i2, long j) {
        try {
            f6668d.block();
            if (this.f6670b.booleanValue() && f6667a != null) {
                vb kvVar = new kv();
                kvVar.f6412a = this.f6671c.f6727a.getPackageName();
                kvVar.f6413b = Long.valueOf(j);
                zo a = f6667a.m7069a(vb.m5895a(kvVar));
                a.f7556a = i2;
                a.f7557b = i;
                a.m7070a();
            }
        } catch (Exception e) {
        }
    }
}
