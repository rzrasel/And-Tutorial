package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

@TargetApi(19)
public class gn extends gl {
    public final boolean mo2113a(View view) {
        return view.isAttachedToWindow();
    }

    public final LayoutParams mo2115d() {
        return new LayoutParams(-1, -1);
    }
}
