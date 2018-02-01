package com.google.android.gms.internal;

import android.view.View;

final class ye implements Runnable {
    private /* synthetic */ View f7493a;
    private /* synthetic */ yd f7494b;

    ye(yd ydVar, View view) {
        this.f7494b = ydVar;
        this.f7493a = view;
    }

    public final void run() {
        yd ydVar = this.f7494b;
        View view = this.f7493a;
        try {
            xw xwVar = new xw(ydVar.f7481e, ydVar.f7482f, ydVar.f7483g, ydVar.f7484h, ydVar.f7485i, ydVar.f7486j, ydVar.f7487k);
            yh a = ydVar.m7029a(view, xwVar);
            xwVar.m7004c();
            if (a.f7501a != 0 || a.f7502b != 0) {
                if (a.f7502b != 0 || xwVar.f7439b != 0) {
                    if (a.f7502b != 0 || !ydVar.f7479c.m7006a(xwVar)) {
                        xx xxVar = ydVar.f7479c;
                        synchronized (xxVar.f7454a) {
                            if (xxVar.f7456c.size() >= 10) {
                                new StringBuilder(41).append("Queue is full, current size = ").append(xxVar.f7456c.size());
                                id.m5372a(3);
                                xxVar.f7456c.remove(0);
                            }
                            int i = xxVar.f7455b;
                            xxVar.f7455b = i + 1;
                            xwVar.f7440c = i;
                            xxVar.f7456c.add(xwVar);
                        }
                    }
                }
            }
        } catch (Throwable e) {
            id.m5372a(6);
            ydVar.f7480d.mo2018a(e, "ContentFetchTask.fetchContent");
        }
    }
}
