package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class zzahj extends BroadcastReceiver {
    private /* synthetic */ gb f7705a;

    private zzahj(gb gbVar) {
        this.f7705a = gbVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f7705a.f6136f = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f7705a.f6136f = false;
        }
    }
}
