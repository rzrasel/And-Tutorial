package com.google.android.gms.internal;

import android.os.RemoteException;

public final class zo {
    int f7556a;
    int f7557b;
    int[] f7558c;
    private final byte[] f7559d;
    private /* synthetic */ zn f7560e;

    private zo(zn znVar, byte[] bArr) {
        this.f7560e = znVar;
        this.f7559d = bArr;
    }

    public final synchronized void m7070a() {
        try {
            if (this.f7560e.f7555b) {
                this.f7560e.f7554a.mo2311a(this.f7559d);
                this.f7560e.f7554a.mo2309a(this.f7556a);
                this.f7560e.f7554a.mo2313b(this.f7557b);
                this.f7560e.f7554a.mo2312a(this.f7558c);
                this.f7560e.f7554a.mo2308a();
            }
        } catch (RemoteException e) {
            es.m5373a();
        }
    }
}
