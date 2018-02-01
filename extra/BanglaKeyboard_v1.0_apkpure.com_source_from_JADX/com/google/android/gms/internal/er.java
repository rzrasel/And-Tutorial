package com.google.android.gms.internal;

import android.content.Context;

final class er implements Runnable {
    final /* synthetic */ Context f1290a;
    final /* synthetic */ cx f1291b;
    final /* synthetic */ eu f1292c;
    final /* synthetic */ gk f1293d;
    final /* synthetic */ String f1294e;

    er(Context context, cx cxVar, eu euVar, gk gkVar, String str) {
        this.f1290a = context;
        this.f1291b = cxVar;
        this.f1292c = euVar;
        this.f1293d = gkVar;
        this.f1294e = str;
    }

    public final void run() {
        ge a = ge.m2081a(this.f1290a, new ak(), false, false, null, this.f1291b.f1167k);
        a.setWillNotDraw(true);
        eu euVar = this.f1292c;
        synchronized (euVar.f1297a) {
            euVar.f1298b = a;
        }
        gi f = a.m2097f();
        f.m2121a("/invalidRequest", this.f1292c.f1302f);
        f.m2121a("/loadAdURL", this.f1292c.f1303g);
        f.m2121a("/log", aq.f1005g);
        f.m2119a(this.f1293d);
        gb.m2071a(3);
        a.loadUrl(this.f1294e);
    }
}
