package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

final class nv implements Runnable {
    final /* synthetic */ np f2012a;
    final /* synthetic */ nu f2013b;
    private final WeakReference f2014c = new WeakReference(this.f2012a);

    nv(nu nuVar, np npVar) {
        this.f2013b = nuVar;
        this.f2012a = npVar;
    }

    public final void run() {
        this.f2013b.f2009d = false;
        np npVar = (np) this.f2014c.get();
        if (npVar != null) {
            npVar.m2724b(this.f2013b.f2008c);
        }
    }
}
