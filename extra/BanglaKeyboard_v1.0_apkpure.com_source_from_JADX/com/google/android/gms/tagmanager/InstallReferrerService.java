package com.google.android.gms.tagmanager;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.CampaignTrackingService;

public final class InstallReferrerService extends IntentService {
    CampaignTrackingService f2268a;
    Context f2269b;

    public InstallReferrerService() {
        super("InstallReferrerService");
    }

    protected final void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        Context applicationContext = this.f2269b != null ? this.f2269b : getApplicationContext();
        C0534s.m3727a(applicationContext, stringExtra);
        if (this.f2268a == null) {
            this.f2268a = new CampaignTrackingService();
        }
        CampaignTrackingService campaignTrackingService = this.f2268a;
        CampaignTrackingService.m943a(applicationContext, intent);
    }
}
