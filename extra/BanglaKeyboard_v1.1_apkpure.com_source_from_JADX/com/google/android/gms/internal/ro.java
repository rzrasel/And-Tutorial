package com.google.android.gms.internal;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;

public final class ro extends rs {
    private final View f7053d;

    public ro(np npVar, String str, String str2, kz kzVar, int i, View view) {
        super(npVar, str, str2, kzVar, i, 57);
        this.f7053d = view;
    }

    protected final void mo2232a() {
        if (this.f7053d != null) {
            DisplayMetrics displayMetrics = this.a.m6083a().getResources().getDisplayMetrics();
            boolean booleanValue = ((Boolean) zzbv.zzen().m4217a(ado.bv)).booleanValue();
            qe qeVar = new qe((String) this.c.invoke(null, new Object[]{this.f7053d, displayMetrics, Boolean.valueOf(booleanValue)}));
            lb lbVar = new lb();
            lbVar.f6550a = qeVar.f6993a;
            lbVar.f6551b = qeVar.f6994b;
            lbVar.f6552c = qeVar.f6995c;
            this.b.f6441L = lbVar;
        }
    }
}
