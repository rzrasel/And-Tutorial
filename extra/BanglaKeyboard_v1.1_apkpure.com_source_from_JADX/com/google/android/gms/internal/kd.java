package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

final class kd implements OnCancelListener {
    private /* synthetic */ JsResult f6399a;

    kd(JsResult jsResult) {
        this.f6399a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f6399a.cancel();
    }
}
