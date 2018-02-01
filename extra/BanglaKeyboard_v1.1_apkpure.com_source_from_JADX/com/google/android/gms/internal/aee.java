package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.p056a.C1401c;

@aqv
public final class aee implements CustomRenderedAd {
    private final aef f4957a;

    public aee(aef com_google_android_gms_internal_aef) {
        this.f4957a = com_google_android_gms_internal_aef;
    }

    public final String getBaseUrl() {
        try {
            return this.f4957a.mo1737a();
        } catch (Throwable e) {
            id.m5371a("Could not delegate getBaseURL to CustomRenderedAd", e);
            return null;
        }
    }

    public final String getContent() {
        try {
            return this.f4957a.mo1739b();
        } catch (Throwable e) {
            id.m5371a("Could not delegate getContent to CustomRenderedAd", e);
            return null;
        }
    }

    public final void onAdRendered(View view) {
        try {
            this.f4957a.mo1738a(view != null ? C1401c.m3584a((Object) view) : null);
        } catch (Throwable e) {
            id.m5371a("Could not delegate onAdRendered to CustomRenderedAd", e);
        }
    }

    public final void recordClick() {
        try {
            this.f4957a.mo1740c();
        } catch (Throwable e) {
            id.m5371a("Could not delegate recordClick to CustomRenderedAd", e);
        }
    }

    public final void recordImpression() {
        try {
            this.f4957a.mo1741d();
        } catch (Throwable e) {
            id.m5371a("Could not delegate recordImpression to CustomRenderedAd", e);
        }
    }
}
