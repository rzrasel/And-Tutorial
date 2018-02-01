package com.google.android.gms.common.internal;

import android.util.Log;

public abstract class aa<TListener> {
    private TListener f4541a;
    private boolean f4542b = false;
    private /* synthetic */ C1518v f4543c;

    public aa(C1518v c1518v, TListener tListener) {
        this.f4543c = c1518v;
        this.f4541a = tListener;
    }

    protected abstract void mo1657a(TListener tListener);

    public final void m3819b() {
        synchronized (this) {
            Object obj = this.f4541a;
            if (this.f4542b) {
                String valueOf = String.valueOf(this);
                Log.w("GmsClient", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Callback proxy ").append(valueOf).append(" being reused. This is not safe.").toString());
            }
        }
        if (obj != null) {
            try {
                mo1657a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f4542b = true;
        }
        m3820c();
    }

    public final void m3820c() {
        m3821d();
        synchronized (this.f4543c.f4603r) {
            this.f4543c.f4603r.remove(this);
        }
    }

    public final void m3821d() {
        synchronized (this) {
            this.f4541a = null;
        }
    }
}
