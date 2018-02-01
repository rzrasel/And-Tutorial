package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class kf implements OnClickListener {
    private /* synthetic */ JsResult f6401a;

    kf(JsResult jsResult) {
        this.f6401a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6401a.confirm();
    }
}
