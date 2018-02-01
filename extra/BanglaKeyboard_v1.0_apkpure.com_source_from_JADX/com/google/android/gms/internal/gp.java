package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

final class gp implements OnCancelListener {
    final /* synthetic */ JsPromptResult f1493a;

    gp(JsPromptResult jsPromptResult) {
        this.f1493a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f1493a.cancel();
    }
}
