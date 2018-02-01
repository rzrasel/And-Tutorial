package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzbv;

final class gs implements OnClickListener {
    private /* synthetic */ String f6161a;
    private /* synthetic */ gq f6162b;

    gs(gq gqVar, String str) {
        this.f6162b = gqVar;
        this.f6161a = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbv.zzea();
        gb.m5446a(this.f6162b.f6148a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.f6161a), "Share via"));
    }
}
