package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C0233a;
import com.google.android.gms.common.C0236e;
import java.util.ArrayList;
import java.util.Iterator;

public final class ij {
    final il f1814a;
    final ArrayList f1815b = new ArrayList();
    final ArrayList f1816c = new ArrayList();
    boolean f1817d = false;
    final ArrayList f1818e = new ArrayList();
    final Handler f1819f;

    public ij(Looper looper, il ilVar) {
        this.f1814a = ilVar;
        this.f1819f = new ik(this, looper);
    }

    public final void m2396a(C0233a c0233a) {
        this.f1819f.removeMessages(1);
        synchronized (this.f1818e) {
            Iterator it = new ArrayList(this.f1818e).iterator();
            while (it.hasNext()) {
                C0236e c0236e = (C0236e) it.next();
                if (!this.f1814a.mo883h()) {
                    return;
                } else if (this.f1818e.contains(c0236e)) {
                    c0236e.mo879a(c0233a);
                }
            }
        }
    }
}
