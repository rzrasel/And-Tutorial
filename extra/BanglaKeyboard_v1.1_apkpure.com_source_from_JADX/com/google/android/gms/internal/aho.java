package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;

public final class aho extends ahh {
    private final OnPublisherAdViewLoadedListener f5110a;

    public aho(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.f5110a = onPublisherAdViewLoadedListener;
    }

    public final void mo1864a(abc com_google_android_gms_internal_abc, C1398a c1398a) {
        if (com_google_android_gms_internal_abc != null && c1398a != null) {
            PublisherAdView publisherAdView = new PublisherAdView((Context) C1401c.m3585a(c1398a));
            try {
                if (com_google_android_gms_internal_abc.zzbx() instanceof zs) {
                    zs zsVar = (zs) com_google_android_gms_internal_abc.zzbx();
                    publisherAdView.setAdListener(zsVar != null ? zsVar.f7563a : null);
                }
            } catch (Throwable e) {
                id.m5371a("Failed to get ad listener.", e);
            }
            try {
                if (com_google_android_gms_internal_abc.zzbw() instanceof aaa) {
                    aaa com_google_android_gms_internal_aaa = (aaa) com_google_android_gms_internal_abc.zzbw();
                    publisherAdView.setAppEventListener(com_google_android_gms_internal_aaa != null ? com_google_android_gms_internal_aaa.f4703a : null);
                }
            } catch (Throwable e2) {
                id.m5371a("Failed to get app event listener.", e2);
            }
            hz.f6240a.post(new ahp(this, publisherAdView, com_google_android_gms_internal_abc));
        }
    }
}
