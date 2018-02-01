package com.google.android.gms.internal;

import android.util.Log;

public abstract class ia {
    final /* synthetic */ hy f1657a;
    private Object f1658b;
    private boolean f1659c = false;

    public ia(hy hyVar, Object obj) {
        this.f1657a = hyVar;
        this.f1658b = obj;
    }

    public final void m2182a() {
        synchronized (this) {
            Object obj = this.f1658b;
            if (this.f1659c) {
                Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                mo902a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f1659c = true;
        }
        m2184b();
    }

    protected abstract void mo902a(Object obj);

    public final void m2184b() {
        m2185c();
        synchronized (this.f1657a.f1255g) {
            this.f1657a.f1255g.remove(this);
        }
    }

    public final void m2185c() {
        synchronized (this) {
            this.f1658b = null;
        }
    }
}
