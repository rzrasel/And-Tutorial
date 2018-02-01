package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C0176a;
import com.google.android.gms.ads.C0220d;
import com.google.android.gms.internal.ag;

public final class SearchAdView extends ViewGroup {
    private final ag f432a;

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f432a = new ag(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f432a = new ag(this, attributeSet, false);
    }

    public final C0176a getAdListener() {
        return this.f432a.f907c;
    }

    public final C0220d getAdSize() {
        return this.f432a.m1633a();
    }

    public final String getAdUnitId() {
        return this.f432a.f910f;
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
        this.f432a.m1634a(c0176a);
    }

    public final void setAdSize(C0220d c0220d) {
        this.f432a.m1636a(c0220d);
    }

    public final void setAdUnitId(String str) {
        this.f432a.m1635a(str);
    }
}
