package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.gms.ads.internal.zzbv;

final class gr implements OnClickListener {
    private /* synthetic */ int f6157a;
    private /* synthetic */ int f6158b;
    private /* synthetic */ int f6159c;
    private /* synthetic */ gq f6160d;

    gr(gq gqVar, int i, int i2, int i3) {
        this.f6160d = gqVar;
        this.f6157a = i;
        this.f6158b = i2;
        this.f6159c = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == this.f6157a) {
            this.f6160d.m5565b();
            return;
        }
        if (i == this.f6158b) {
            if (((Boolean) zzbv.zzen().m4217a(ado.ct)).booleanValue()) {
                gq gqVar = this.f6160d;
                id.m5372a(3);
                fv.m5425a(new gv(gqVar));
                return;
            }
        }
        if (i == this.f6159c) {
            if (((Boolean) zzbv.zzen().m4217a(ado.cu)).booleanValue()) {
                gqVar = this.f6160d;
                id.m5372a(3);
                fv.m5425a(new gw(gqVar));
            }
        }
    }
}
