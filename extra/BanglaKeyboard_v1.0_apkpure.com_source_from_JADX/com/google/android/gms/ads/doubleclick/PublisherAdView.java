package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C0176a;
import com.google.android.gms.ads.C0220d;
import com.google.android.gms.internal.C0403r;
import com.google.android.gms.internal.ag;
import com.google.android.gms.internal.gb;

public final class PublisherAdView extends ViewGroup {
    private final ag f430a;

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f430a = new ag(this, attributeSet, true);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f430a = new ag(this, attributeSet, true);
    }

    public final C0176a getAdListener() {
        return this.f430a.f907c;
    }

    public final C0220d getAdSize() {
        return this.f430a.m1633a();
    }

    public final C0220d[] getAdSizes() {
        return this.f430a.f909e;
    }

    public final String getAdUnitId() {
        return this.f430a.f910f;
    }

    public final C0221a getAppEventListener() {
        return this.f430a.f912h;
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
        int measuredWidth;
        int i3 = 0;
        View childAt = getChildAt(0);
        C0220d adSize = getAdSize();
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        } else if (adSize != null) {
            Context context = getContext();
            measuredWidth = adSize.m922b(context);
            i3 = adSize.m920a(context);
        } else {
            measuredWidth = 0;
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public final void setAdListener(C0176a c0176a) {
        this.f430a.m1634a(c0176a);
    }

    public final void setAdSizes(C0220d... c0220dArr) {
        if (c0220dArr == null || c0220dArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f430a.m1637b(c0220dArr);
    }

    public final void setAdUnitId(String str) {
        this.f430a.m1635a(str);
    }

    public final void setAppEventListener(C0221a c0221a) {
        ag agVar = this.f430a;
        try {
            agVar.f912h = c0221a;
            if (agVar.f908d != null) {
                agVar.f908d.mo973a(c0221a != null ? new C0403r(c0221a) : null);
            }
        } catch (Throwable e) {
            gb.m2070a("Failed to set the AppEventListener.", e);
        }
    }
}
