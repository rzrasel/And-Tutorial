package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public final class C0501a implements OnClickListener, C0500b {
    final /* synthetic */ PlusOneButton f2246a;
    private final C0500b f2247b;

    public C0501a(PlusOneButton plusOneButton, C0500b c0500b) {
        this.f2246a = plusOneButton;
        this.f2247b = c0500b;
    }

    public final void mo1310a(Intent intent) {
        Context context = this.f2246a.getContext();
        if ((context instanceof Activity) && intent != null) {
            ((Activity) context).startActivityForResult(intent, this.f2246a.f2244e);
        }
    }

    public final void onClick(View view) {
        Intent intent = (Intent) this.f2246a.f2240a.getTag();
        if (this.f2247b != null) {
            this.f2247b.mo1310a(intent);
        } else {
            mo1310a(intent);
        }
    }
}
