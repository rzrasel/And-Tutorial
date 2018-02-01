package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.abc;
import com.google.android.gms.internal.acf;
import com.google.android.gms.internal.ael;
import com.google.android.gms.internal.id;

public final class PublisherAdView extends ViewGroup {
    private final acf f3942a;

    public PublisherAdView(Context context) {
        super(context);
        this.f3942a = new acf(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3942a = new acf((ViewGroup) this, attributeSet, true);
        C1516t.m3861a((Object) context, (Object) "Context cannot be null");
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3942a = new acf((ViewGroup) this, attributeSet, true);
    }

    public final void destroy() {
        this.f3942a.m4108a();
    }

    public final AdListener getAdListener() {
        return this.f3942a.f4802c;
    }

    public final AdSize getAdSize() {
        return this.f3942a.m4117b();
    }

    public final AdSize[] getAdSizes() {
        return this.f3942a.f4803d;
    }

    public final String getAdUnitId() {
        return this.f3942a.m4119c();
    }

    public final AppEventListener getAppEventListener() {
        return this.f3942a.f4804e;
    }

    public final String getMediationAdapterClassName() {
        return this.f3942a.m4122f();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.f3942a.f4807h;
    }

    public final VideoController getVideoController() {
        return this.f3942a.f4801b;
    }

    public final VideoOptions getVideoOptions() {
        return this.f3942a.f4808i;
    }

    public final boolean isLoading() {
        return this.f3942a.m4123g();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f3942a.m4112a(publisherAdRequest.zzaz());
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    protected final void onMeasure(int i, int i2) {
        int widthInPixels;
        int i3 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            AdSize adSize;
            AdSize adSize2 = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                id.m5372a(6);
                adSize = adSize2;
            }
            if (adSize != null) {
                Context context = getContext();
                widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
            } else {
                widthInPixels = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            widthInPixels = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(widthInPixels, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public final void pause() {
        this.f3942a.m4120d();
    }

    public final void recordManualImpression() {
        acf com_google_android_gms_internal_acf = this.f3942a;
        if (!com_google_android_gms_internal_acf.f4800a.getAndSet(true)) {
            try {
                if (com_google_android_gms_internal_acf.f4806g != null) {
                    com_google_android_gms_internal_acf.f4806g.zzbn();
                }
            } catch (Throwable e) {
                id.m5371a("Failed to record impression.", e);
            }
        }
    }

    public final void resume() {
        this.f3942a.m4121e();
    }

    public final void setAdListener(AdListener adListener) {
        this.f3942a.m4109a(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f3942a.m4118b(adSizeArr);
    }

    public final void setAdUnitId(String str) {
        this.f3942a.m4114a(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.f3942a.m4111a(appEventListener);
    }

    public final void setCorrelator(Correlator correlator) {
        acf com_google_android_gms_internal_acf = this.f3942a;
        com_google_android_gms_internal_acf.f4805f = correlator;
        try {
            if (com_google_android_gms_internal_acf.f4806g != null) {
                com_google_android_gms_internal_acf.f4806g.zza(com_google_android_gms_internal_acf.f4805f == null ? null : com_google_android_gms_internal_acf.f4805f.zzba());
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set correlator.", e);
        }
    }

    public final void setManualImpressionsEnabled(boolean z) {
        acf com_google_android_gms_internal_acf = this.f3942a;
        com_google_android_gms_internal_acf.f4809j = z;
        try {
            if (com_google_android_gms_internal_acf.f4806g != null) {
                com_google_android_gms_internal_acf.f4806g.setManualImpressionsEnabled(com_google_android_gms_internal_acf.f4809j);
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set manual impressions.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        acf com_google_android_gms_internal_acf = this.f3942a;
        com_google_android_gms_internal_acf.f4807h = onCustomRenderedAdLoadedListener;
        try {
            if (com_google_android_gms_internal_acf.f4806g != null) {
                com_google_android_gms_internal_acf.f4806g.zza(onCustomRenderedAdLoadedListener != null ? new ael(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (Throwable e) {
            id.m5371a("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.f3942a.m4110a(videoOptions);
    }

    public final boolean zza(abc com_google_android_gms_internal_abc) {
        return this.f3942a.m4116a(com_google_android_gms_internal_abc);
    }
}
