package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C1516t;

@aqv
public final class acz {
    private final Context f4846a;

    public acz(Context context) {
        C1516t.m3861a((Object) context, (Object) "Context can not be null");
        this.f4846a = context;
    }

    public final boolean m4185a() {
        if (((Boolean) ht.m5600a(new ada())).booleanValue()) {
            if (lm.m5976a(this.f4846a).f6571a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                return true;
            }
        }
        return false;
    }

    final boolean m4186a(Intent intent) {
        C1516t.m3861a((Object) intent, (Object) "Intent can not be null");
        return !this.f4846a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @TargetApi(14)
    public final boolean m4187b() {
        return m4186a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
