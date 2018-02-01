package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;

@aqv
public abstract class aoy extends eq {
    protected final ape f5528a;
    protected final Context f5529b;
    protected final Object f5530c = new Object();
    protected final Object f5531d = new Object();
    protected final ef f5532f;
    protected zzaao f5533g;

    protected aoy(Context context, ef efVar, ape com_google_android_gms_internal_ape) {
        super((byte) 0);
        this.f5529b = context;
        this.f5532f = efVar;
        this.f5533g = efVar.f5979b;
        this.f5528a = com_google_android_gms_internal_ape;
    }

    protected abstract ee mo2010a(int i);

    public final void mo1475a() {
        int i;
        synchronized (this.f5530c) {
            id.m5372a(3);
            int i2 = this.f5532f.f5982e;
            try {
                mo2011a(SystemClock.elapsedRealtime());
            } catch (apc e) {
                i = e.f5542a;
                if (i == 3 || i == -1) {
                    e.getMessage();
                    id.m5372a(4);
                } else {
                    id.m5370a(e.getMessage());
                }
                if (this.f5533g == null) {
                    this.f5533g = new zzaao(i);
                } else {
                    this.f5533g = new zzaao(i, this.f5533g.f7664j);
                }
                gb.f6131a.post(new aoz(this));
                i2 = i;
            }
            gb.f6131a.post(new apb(this, mo2010a(i2)));
        }
    }

    protected abstract void mo2011a(long j);

    public void mo1476b() {
    }
}
