package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;

public final class bm implements bp {
    final bi f1068a;
    final ah f1069b;
    final ak f1070c;
    final Context f1071d;
    final Object f1072e = new Object();
    final dx f1073f;
    bv f1074g;
    int f1075h = -2;
    private final String f1076i;
    private final bs f1077j;
    private final long f1078k;

    public bm(Context context, String str, bs bsVar, bj bjVar, bi biVar, ah ahVar, ak akVar, dx dxVar) {
        this.f1071d = context;
        this.f1076i = str;
        this.f1077j = bsVar;
        this.f1078k = bjVar.f1057b != -1 ? bjVar.f1057b : 10000;
        this.f1068a = biVar;
        this.f1069b = ahVar;
        this.f1070c = akVar;
        this.f1073f = dxVar;
    }

    public final bo m1704a(long j) {
        bo boVar;
        synchronized (this.f1072e) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bl blVar = new bl();
            fz.f1434a.post(new bn(this, blVar));
            long j2 = this.f1078k;
            while (this.f1075h == -2) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = j2 - (elapsedRealtime2 - elapsedRealtime);
                elapsedRealtime2 = 60000 - (elapsedRealtime2 - j);
                if (j3 <= 0 || elapsedRealtime2 <= 0) {
                    gb.m2071a(4);
                    this.f1075h = 3;
                } else {
                    try {
                        this.f1072e.wait(Math.min(j3, elapsedRealtime2));
                    } catch (InterruptedException e) {
                        this.f1075h = -1;
                    }
                }
            }
            boVar = new bo(this.f1068a, this.f1074g, this.f1076i, blVar, this.f1075h);
        }
        return boVar;
    }

    final bv m1705a() {
        "Instantiating mediation adapter: " + this.f1076i;
        gb.m2071a(4);
        try {
            return this.f1077j.mo832a(this.f1076i);
        } catch (RemoteException e) {
            "Could not instantiate mediation adapter: " + this.f1076i;
            gb.m2071a(3);
            return null;
        }
    }

    public final void mo831a(int i) {
        synchronized (this.f1072e) {
            this.f1075h = i;
            this.f1072e.notify();
        }
    }
}
