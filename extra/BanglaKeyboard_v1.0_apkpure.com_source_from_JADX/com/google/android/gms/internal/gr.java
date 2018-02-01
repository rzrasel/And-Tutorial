package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class gr implements OnClickListener {
    final /* synthetic */ JsPromptResult f1495a;
    final /* synthetic */ EditText f1496b;

    gr(JsPromptResult jsPromptResult, EditText editText) {
        this.f1495a = jsPromptResult;
        this.f1496b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1495a.confirm(this.f1496b.getText().toString());
    }
}
