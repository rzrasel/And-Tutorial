package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@aqv
public class iy<T> implements it<T> {
    private final Object f4078a = new Object();
    private int f4079b = 0;
    private BlockingQueue<iz> f4080c = new LinkedBlockingQueue();
    private T f4081d;

    public int getStatus() {
        return this.f4079b;
    }

    public void reject() {
        synchronized (this.f4078a) {
            if (this.f4079b != 0) {
                throw new UnsupportedOperationException();
            }
            this.f4079b = -1;
            for (iz izVar : this.f4080c) {
                izVar.f6267b.mo1479a();
            }
            this.f4080c.clear();
        }
    }

    public void zza(ix<T> ixVar, iv ivVar) {
        synchronized (this.f4078a) {
            if (this.f4079b == 1) {
                ixVar.mo1472a(this.f4081d);
            } else if (this.f4079b == -1) {
                ivVar.mo1479a();
            } else if (this.f4079b == 0) {
                this.f4080c.add(new iz(ixVar, ivVar));
            }
        }
    }

    public void zzf(T t) {
        synchronized (this.f4078a) {
            if (this.f4079b != 0) {
                throw new UnsupportedOperationException();
            }
            this.f4081d = t;
            this.f4079b = 1;
            for (iz izVar : this.f4080c) {
                izVar.f6266a.mo1472a(t);
            }
            this.f4080c.clear();
        }
    }
}
