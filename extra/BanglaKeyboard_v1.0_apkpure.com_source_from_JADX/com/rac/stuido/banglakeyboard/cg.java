package com.rac.stuido.banglakeyboard;

import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage.QuotaUpdater;

final class cg extends WebChromeClient {
    final /* synthetic */ Website239800 f2799a;

    private cg(Website239800 website239800) {
        this.f2799a = website239800;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        quotaUpdater.updateQuota(2 * j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        if (this.f2799a.f2565g) {
            callback.invoke(str, true, false);
        }
    }
}
