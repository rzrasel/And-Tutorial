package com.rac.stuido.banglakeyboard;

import android.graphics.drawable.Drawable;

final class aw implements Runnable {
    final /* synthetic */ au f2666a;
    final /* synthetic */ Drawable f2667b;
    final /* synthetic */ av f2668c;

    aw(av avVar, au auVar, Drawable drawable) {
        this.f2668c = avVar;
        this.f2666a = auVar;
        this.f2667b = drawable;
    }

    public final void run() {
        if (this.f2666a.f2663b != null) {
            this.f2666a.f2663b.mo1366a(this.f2667b);
        }
    }
}
