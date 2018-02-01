package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class fq extends BroadcastReceiver {
    private fq() {
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            fo.f1408b = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            fo.f1408b = false;
        }
    }
}
