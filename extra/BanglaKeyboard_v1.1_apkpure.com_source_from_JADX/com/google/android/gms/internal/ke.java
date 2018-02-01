package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class ke implements OnClickListener {
    private /* synthetic */ JsResult f6400a;

    ke(JsResult jsResult) {
        this.f6400a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6400a.cancel();
    }
}
