package com.rac.stuido.banglakeyboard;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class av implements Runnable {
    final /* synthetic */ aq f2665a;

    private av(aq aqVar) {
        this.f2665a = aqVar;
    }

    public final void run() {
        synchronized (this) {
            while (this.f2665a.f2653b.size() > 0) {
                au auVar = (au) this.f2665a.f2653b.remove(0);
                if (auVar != null) {
                    if (!this.f2665a.f2652a.mo1369b(auVar.f2662a) || this.f2665a.f2652a.mo1367a(auVar.f2662a) == null) {
                        Context context = this.f2665a.f2657f != null ? (Context) this.f2665a.f2657f.get() : null;
                        TypedArray typedArray = this.f2665a.f2658g != null ? (TypedArray) this.f2665a.f2658g.get() : null;
                        if (typedArray == null && context != null) {
                            this.f2665a.m3923a(context.getResources());
                            if (this.f2665a.f2658g != null) {
                                typedArray = (TypedArray) this.f2665a.f2658g.get();
                            }
                        }
                        if (context != null && typedArray != null && auVar != null && auVar.f2662a >= 0 && auVar.f2662a < 16777215 && auVar.f2662a < typedArray.length()) {
                            try {
                                Drawable drawable = typedArray.getDrawable(auVar.f2662a);
                                if (drawable != null) {
                                    this.f2665a.f2652a.mo1368a(auVar.f2662a, drawable);
                                    this.f2665a.f2654c.post(new aw(this, auVar, drawable));
                                }
                            } catch (NotFoundException e) {
                            }
                        }
                    } else {
                        this.f2665a.f2654c.post(new ax(this, auVar));
                    }
                }
            }
        }
    }
}
