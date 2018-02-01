package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class gn implements OnClickListener {
    final /* synthetic */ JsResult f1491a;

    gn(JsResult jsResult) {
        this.f1491a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1491a.cancel();
    }
}
