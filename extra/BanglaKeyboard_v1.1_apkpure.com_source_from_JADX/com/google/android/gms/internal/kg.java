package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

final class kg implements OnCancelListener {
    private /* synthetic */ JsPromptResult f6402a;

    kg(JsPromptResult jsPromptResult) {
        this.f6402a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f6402a.cancel();
    }
}
