package com.google.android.gms.internal;

public final class ajz<T> {
    public final T f5218a;
    public final mf f5219b;
    public final C1569b f5220c;
    public boolean f5221d;

    ajz(C1569b c1569b) {
        this.f5221d = false;
        this.f5218a = null;
        this.f5219b = null;
        this.f5220c = c1569b;
    }

    private ajz(T t, mf mfVar) {
        this.f5221d = false;
        this.f5218a = t;
        this.f5219b = mfVar;
        this.f5220c = null;
    }

    public static <T> ajz<T> m4618a(T t, mf mfVar) {
        return new ajz(t, mfVar);
    }
}
