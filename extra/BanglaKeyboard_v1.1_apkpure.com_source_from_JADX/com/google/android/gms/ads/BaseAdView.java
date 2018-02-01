package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.acf;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.zq;

class BaseAdView extends ViewGroup {
    protected final acf f3929a;

    public BaseAdView(Context context, int i) {
        super(context);
        this.f3929a = new acf(this, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f3929a = new acf((ViewGroup) this, attributeSet, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f3929a = new acf((ViewGroup) this, attributeSet, i2);
    }

    public void destroy() {
        this.f3929a.m4108a();
    }

    public AdListener getAdListener() {
        return this.f3929a.f4802c;
    }

    public AdSize getAdSize() {
        return this.f3929a.m4117b();
    }

    public String getAdUnitId() {
        return this.f3929a.m4119c();
    }

    public String getMediationAdapterClassName() {
        return this.f3929a.m4122f();
    }

    public boolean isLoading() {
        return this.f3929a.m4123g();
    }

    public void loadAd(AdRequest adRequest) {
        this.f3929a.m4112a(adRequest.zzaz());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    protected void onMeasure(int i, int i2) {
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

    public void pause() {
        this.f3929a.m4120d();
    }

    public void resume() {
        this.f3929a.m4121e();
    }

    public void setAdListener(AdListener adListener) {
        this.f3929a.m4109a(adListener);
        if (adListener == null) {
            this.f3929a.m4113a(null);
            this.f3929a.m4111a(null);
            return;
        }
        if (adListener instanceof zq) {
            this.f3929a.m4113a((zq) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.f3929a.m4111a((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.f3929a.m4115a(adSize);
    }

    public void setAdUnitId(String str) {
        this.f3929a.m4114a(str);
    }
}
