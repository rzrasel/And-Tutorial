package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class gq implements OnClickListener {
    final /* synthetic */ JsPromptResult f1494a;

    gq(JsPromptResult jsPromptResult) {
        this.f1494a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1494a.cancel();
    }
}
