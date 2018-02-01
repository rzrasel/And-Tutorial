package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.zzbv;

@aqv
public final class et extends Handler {
    public et(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Throwable e) {
            zzbv.zzee().m5336a(e, "AdMobHandler.handleMessage");
        }
    }
}
