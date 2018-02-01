package com.orange.studio.banglatype;

import android.content.Context;
import android.content.Intent;

public final class C1719c implements Runnable {
    private final Context f8294a;
    private final Intent f8295b;

    public C1719c(Context context, Intent intent) {
        this.f8294a = context;
        this.f8295b = intent;
    }

    public final void run() {
        this.f8294a.startActivity(this.f8295b);
    }
}
