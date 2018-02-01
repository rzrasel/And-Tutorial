package com.rac.stuido.banglakeyboard;

import android.graphics.drawable.Drawable;

final class ax implements Runnable {
    final /* synthetic */ au f2669a;
    final /* synthetic */ av f2670b;

    ax(av avVar, au auVar) {
        this.f2670b = avVar;
        this.f2669a = auVar;
    }

    public final void run() {
        if (this.f2669a.f2663b != null) {
            Drawable a = this.f2670b.f2665a.f2652a.mo1367a(this.f2669a.f2662a);
            if (a != null) {
                this.f2669a.f2663b.mo1366a(a);
            }
        }
    }
}
