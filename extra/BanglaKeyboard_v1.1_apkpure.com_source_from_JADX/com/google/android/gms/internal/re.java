package com.google.android.gms.internal;

import java.util.concurrent.Callable;

public final class re implements Callable {
    private final np f7040a;
    private final kz f7041b;

    public re(np npVar, kz kzVar) {
        this.f7040a = npVar;
        this.f7041b = kzVar;
    }

    private final Void m6494a() {
        if (this.f7040a.f6734h != null) {
            this.f7040a.f6734h.get();
        }
        vb vbVar = this.f7040a.f6733g;
        if (vbVar != null) {
            try {
                synchronized (this.f7041b) {
                    vb vbVar2 = this.f7041b;
                    byte[] a = vb.m5895a(vbVar);
                    vb.m5894a(vbVar2, a, a.length);
                }
            } catch (va e) {
            }
        }
        return null;
    }

    public final /* synthetic */ Object call() {
        return m6494a();
    }
}
