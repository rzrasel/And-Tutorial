package com.google.android.gms.p007a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.common.C0250h;

final class C0198g implements OnClickListener {
    final /* synthetic */ Context f403a;
    final /* synthetic */ int f404b;

    C0198g(Context context, int i) {
        this.f403a = context;
        this.f404b = i;
    }

    public final void onClick(View view) {
        Context context = this.f403a;
        Context context2 = this.f403a;
        context.startActivity(C0250h.m1003a(this.f404b));
    }
}
