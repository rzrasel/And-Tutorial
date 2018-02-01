package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class rs implements Callable {
    protected final np f7024a;
    protected final kz f7025b;
    protected Method f7026c;
    private String f7027d = getClass().getSimpleName();
    private String f7028e;
    private String f7029f;
    private int f7030g;
    private int f7031h;

    public rs(np npVar, String str, String str2, kz kzVar, int i, int i2) {
        this.f7024a = npVar;
        this.f7028e = str;
        this.f7029f = str2;
        this.f7025b = kzVar;
        this.f7030g = i;
        this.f7031h = i2;
    }

    protected abstract void mo2232a();

    public Void mo2233b() {
        try {
            long nanoTime = System.nanoTime();
            this.f7026c = this.f7024a.m6084a(this.f7028e, this.f7029f);
            if (this.f7026c != null) {
                mo2232a();
                na naVar = this.f7024a.f6735i;
                if (!(naVar == null || this.f7030g == Integer.MIN_VALUE)) {
                    naVar.m6035a(this.f7031h, this.f7030g, (System.nanoTime() - nanoTime) / 1000);
                }
            }
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e2) {
        }
        return null;
    }

    public /* synthetic */ Object call() {
        return mo2233b();
    }
}
