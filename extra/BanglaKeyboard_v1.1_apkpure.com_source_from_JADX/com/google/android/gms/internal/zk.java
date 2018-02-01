package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@aqv
public final class zk {
    public boolean f7544a;
    public final boolean f7545b;
    int f7546c;
    private HashMap<String, Long> f7547d;
    private final zn f7548e;
    private zp f7549f;
    private final int f7550g;
    private zl f7551h;

    public zk() {
        this.f7544a = false;
        this.f7546c = 0;
        this.f7545b = false;
        this.f7548e = new zn();
        this.f7549f = new zp();
        this.f7550g = 0;
        m7064c();
    }

    public zk(zn znVar, boolean z) {
        this.f7544a = false;
        this.f7546c = 0;
        this.f7548e = znVar;
        this.f7547d = new HashMap();
        this.f7545b = z;
        this.f7550g = ((Integer) zzbv.zzen().m4217a(ado.cF)).intValue();
        this.f7549f = new zp();
        m7064c();
        zzbv.zzer().m5596a();
    }

    private final synchronized void m7064c() {
    }

    private static int[] m7065d() {
        int i = 0;
        List<String> b = ado.m4221b();
        List arrayList = new ArrayList();
        for (String split : b) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Integer.valueOf(valueOf));
                } catch (NumberFormatException e) {
                    es.m5373a();
                }
            }
        }
        int[] iArr = new int[arrayList.size()];
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            iArr[i2] = ((Integer) obj).intValue();
            i2++;
        }
        return iArr;
    }

    final synchronized void m7066a() {
        zo a = this.f7548e.m7069a(vb.m5895a(this.f7549f));
        a.f7558c = m7065d();
        a.m7070a();
    }

    public final synchronized void m7067a(zm zmVar) {
        if (this.f7545b) {
            zmVar.mo1469a(this.f7549f);
        }
        if (this.f7544a && this.f7545b) {
            m7068b();
        }
    }

    public final synchronized void m7068b() {
        Handler handler = zzbv.zzer().f6213a;
        Object zlVar = new zl(this, this.f7546c + 1);
        handler.postDelayed(zlVar, (long) this.f7550g);
        this.f7546c++;
        if (this.f7551h != null) {
            handler.removeCallbacks(this.f7551h);
        }
        this.f7551h = zlVar;
    }
}
