package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class kh implements OnClickListener {
    private /* synthetic */ JsPromptResult f6403a;

    kh(JsPromptResult jsPromptResult) {
        this.f6403a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6403a.cancel();
    }
}
