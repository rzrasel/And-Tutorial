package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

final class gf extends MutableContextWrapper {
    private Activity f1467a;
    private Context f1468b;

    public gf(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final void setBaseContext(Context context) {
        this.f1468b = context.getApplicationContext();
        this.f1467a = context instanceof Activity ? (Activity) context : null;
        super.setBaseContext(this.f1468b);
    }

    public final void startActivity(Intent intent) {
        if (this.f1467a != null) {
            this.f1467a.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f1468b.startActivity(intent);
    }
}
