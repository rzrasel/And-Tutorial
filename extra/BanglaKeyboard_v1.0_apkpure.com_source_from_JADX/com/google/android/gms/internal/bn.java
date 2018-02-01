package com.google.android.gms.internal;

import com.google.android.gms.p007a.C0207q;

final class bn implements Runnable {
    final /* synthetic */ bl f1079a;
    final /* synthetic */ bm f1080b;

    bn(bm bmVar, bl blVar) {
        this.f1080b = bmVar;
        this.f1079a = blVar;
    }

    public final void run() {
        synchronized (this.f1080b.f1072e) {
            if (this.f1080b.f1075h != -2) {
                return;
            }
            this.f1080b.f1074g = this.f1080b.m1705a();
            if (this.f1080b.f1074g == null) {
                this.f1080b.mo831a(4);
                return;
            }
            this.f1079a.m1698a(this.f1080b);
            bm bmVar = this.f1080b;
            by byVar = this.f1079a;
            try {
                if (bmVar.f1073f.f1224d < 4100000) {
                    if (bmVar.f1070c.f938e) {
                        bmVar.f1074g.mo834a(C0207q.m863a(bmVar.f1071d), bmVar.f1069b, bmVar.f1068a.f1055f, byVar);
                    } else {
                        bmVar.f1074g.mo836a(C0207q.m863a(bmVar.f1071d), bmVar.f1070c, bmVar.f1069b, bmVar.f1068a.f1055f, byVar);
                    }
                }
                if (bmVar.f1070c.f938e) {
                    bmVar.f1074g.mo835a(C0207q.m863a(bmVar.f1071d), bmVar.f1069b, bmVar.f1068a.f1055f, bmVar.f1068a.f1050a, byVar);
                } else {
                    bmVar.f1074g.mo837a(C0207q.m863a(bmVar.f1071d), bmVar.f1070c, bmVar.f1069b, bmVar.f1068a.f1055f, bmVar.f1068a.f1050a, byVar);
                }
            } catch (Throwable e) {
                gb.m2070a("Could not request ad from mediation adapter.", e);
                bmVar.mo831a(5);
            }
        }
    }
}
