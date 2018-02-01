package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.acf;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.id;

@aqv
public final class SearchAdView extends ViewGroup {
    private final acf f4505a;

    public SearchAdView(Context context) {
        super(context);
        this.f4505a = new acf(this);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4505a = new acf((ViewGroup) this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4505a = new acf((ViewGroup) this, attributeSet, false);
    }

    public final void destroy() {
        this.f4505a.m4108a();
    }

    public final AdListener getAdListener() {
        return this.f4505a.f4802c;
    }

    public final AdSize getAdSize() {
        return this.f4505a.m4117b();
    }

    public final String getAdUnitId() {
        return this.f4505a.m4119c();
    }

    public final void loadAd(DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (AdSize.SEARCH.equals(getAdSize())) {
            this.f4505a.m4112a(dynamicHeightSearchAdRequest.f4474a.f4490a);
            return;
        }
        throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
    }

    public final void loadAd(SearchAdRequest searchAdRequest) {
        this.f4505a.m4112a(searchAdRequest.f4490a);
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
        this.f4505a.m4120d();
    }

    public final void resume() {
        this.f4505a.m4121e();
    }

    public final void setAdListener(AdListener adListener) {
        this.f4505a.m4109a(adListener);
    }

    public final void setAdSize(AdSize adSize) {
        this.f4505a.m4115a(adSize);
    }

    public final void setAdUnitId(String str) {
        this.f4505a.m4114a(str);
    }
}
