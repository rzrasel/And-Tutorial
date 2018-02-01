package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(18)
public class gl extends gk {
    public boolean mo2113a(View view) {
        return super.mo2113a(view) || view.getWindowId() != null;
    }

    public final int mo2114c() {
        return 14;
    }
}
