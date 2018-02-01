package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

final class gm implements OnCancelListener {
    final /* synthetic */ JsResult f1490a;

    gm(JsResult jsResult) {
        this.f1490a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f1490a.cancel();
    }
}
