package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@aqv
public final class jx extends MutableContextWrapper {
    Activity f6374a;
    Context f6375b;
    private Context f6376c;

    public jx(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Object getSystemService(String str) {
        return this.f6375b.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.f6376c = context.getApplicationContext();
        this.f6374a = context instanceof Activity ? (Activity) context : null;
        this.f6375b = context;
        super.setBaseContext(this.f6376c);
    }

    public final void startActivity(Intent intent) {
        if (this.f6374a != null) {
            this.f6374a.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f6376c.startActivity(intent);
    }
}
