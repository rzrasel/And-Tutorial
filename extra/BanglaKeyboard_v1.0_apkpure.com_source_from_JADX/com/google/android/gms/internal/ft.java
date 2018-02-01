package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class ft implements OnClickListener {
    final /* synthetic */ String f1419a;
    final /* synthetic */ fr f1420b;

    ft(fr frVar, String str) {
        this.f1420b = frVar;
        this.f1419a = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1420b.f1412a.startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.f1419a), "Share via"));
    }
}
