package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

final class in {
    final String f1826a;
    final io f1827b = new io(this);
    final HashSet f1828c = new HashSet();
    int f1829d = 0;
    boolean f1830e;
    IBinder f1831f;
    ComponentName f1832g;
    final /* synthetic */ im f1833h;

    public in(im imVar, String str) {
        this.f1833h = imVar;
        this.f1826a = str;
    }

    public final void m2401a(C0372if c0372if) {
        this.f1828c.add(c0372if);
    }

    public final boolean m2402b(C0372if c0372if) {
        return this.f1828c.contains(c0372if);
    }
}
