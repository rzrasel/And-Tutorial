package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;

@aqv
public final class xy {
    public final Object f7457a = new Object();
    public ya f7458b = null;
    public boolean f7459c = false;

    public final Activity m7008a() {
        Activity activity;
        synchronized (this.f7457a) {
            if (this.f7458b != null) {
                activity = this.f7458b.f7466a;
            } else {
                activity = null;
            }
        }
        return activity;
    }

    public final void m7009a(yc ycVar) {
        synchronized (this.f7457a) {
            if (((Boolean) zzbv.zzen().m4217a(ado.au)).booleanValue()) {
                if (this.f7458b == null) {
                    this.f7458b = new ya();
                }
                ya yaVar = this.f7458b;
                synchronized (yaVar.f7468c) {
                    yaVar.f7469d.add(ycVar);
                }
                return;
            }
        }
    }

    public final Context m7010b() {
        Context context;
        synchronized (this.f7457a) {
            if (this.f7458b != null) {
                context = this.f7458b.f7467b;
            } else {
                context = null;
            }
        }
        return context;
    }
}
