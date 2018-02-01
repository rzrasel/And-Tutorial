package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.PublisherAdView;

final class ahp implements Runnable {
    private /* synthetic */ PublisherAdView f5111a;
    private /* synthetic */ abc f5112b;
    private /* synthetic */ aho f5113c;

    ahp(aho com_google_android_gms_internal_aho, PublisherAdView publisherAdView, abc com_google_android_gms_internal_abc) {
        this.f5113c = com_google_android_gms_internal_aho;
        this.f5111a = publisherAdView;
        this.f5112b = com_google_android_gms_internal_abc;
    }

    public final void run() {
        if (this.f5111a.zza(this.f5112b)) {
            this.f5113c.f5110a.onPublisherAdViewLoaded(this.f5111a);
        } else {
            id.m5370a("Could not bind ad manager");
        }
    }
}
