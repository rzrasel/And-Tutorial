package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class ki implements OnClickListener {
    private /* synthetic */ JsPromptResult f6404a;
    private /* synthetic */ EditText f6405b;

    ki(JsPromptResult jsPromptResult, EditText editText) {
        this.f6404a = jsPromptResult;
        this.f6405b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f6404a.confirm(this.f6405b.getText().toString());
    }
}
