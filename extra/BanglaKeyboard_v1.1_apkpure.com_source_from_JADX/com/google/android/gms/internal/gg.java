package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;

@TargetApi(9)
public class gg extends gf {
    public gg() {
        super();
    }

    public final int mo2095a() {
        return 6;
    }

    public boolean mo2096a(Request request) {
        request.setShowRunningNotification(true);
        return true;
    }

    public final int mo2097b() {
        return 7;
    }
}
