package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@aqv
public final class xx {
    final Object f7454a = new Object();
    int f7455b;
    List<xw> f7456c = new LinkedList();

    public final xw m7005a() {
        xw xwVar = null;
        int i = 0;
        synchronized (this.f7454a) {
            if (this.f7456c.size() == 0) {
                id.m5372a(3);
                return null;
            } else if (this.f7456c.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (xw xwVar2 : this.f7456c) {
                    xw xwVar3;
                    int i4;
                    int i5 = xwVar2.f7442e;
                    if (i5 > i2) {
                        i = i5;
                        xwVar3 = xwVar2;
                        i4 = i3;
                    } else {
                        i4 = i;
                        xwVar3 = xwVar;
                        i = i2;
                    }
                    i3++;
                    i2 = i;
                    xwVar = xwVar3;
                    i = i4;
                }
                this.f7456c.remove(i);
                return xwVar;
            } else {
                xwVar2 = (xw) this.f7456c.get(0);
                synchronized (xwVar2.f7438a) {
                    xwVar2.f7442e -= 100;
                }
                return xwVar2;
            }
        }
    }

    public final boolean m7006a(xw xwVar) {
        boolean z;
        synchronized (this.f7454a) {
            if (this.f7456c.contains(xwVar)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean m7007b(xw xwVar) {
        synchronized (this.f7454a) {
            Iterator it = this.f7456c.iterator();
            while (it.hasNext()) {
                xw xwVar2 = (xw) it.next();
                if (!((Boolean) zzbv.zzen().m4217a(ado.f4877P)).booleanValue() || zzbv.zzee().m5338a()) {
                    if (((Boolean) zzbv.zzen().m4217a(ado.f4879R)).booleanValue() && !zzbv.zzee().m5342b() && xwVar != xwVar2 && xwVar2.f7445h.equals(xwVar.f7445h)) {
                        it.remove();
                        return true;
                    }
                } else if (xwVar != xwVar2 && xwVar2.f7443f.equals(xwVar.f7443f)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }
}
