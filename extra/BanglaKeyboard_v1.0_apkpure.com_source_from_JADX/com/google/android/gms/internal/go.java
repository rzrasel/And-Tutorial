package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class go implements OnClickListener {
    final /* synthetic */ JsResult f1492a;

    go(JsResult jsResult) {
        this.f1492a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1492a.confirm();
    }
}
