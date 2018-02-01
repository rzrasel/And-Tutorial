package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.p009c.C0218a;
import com.google.android.gms.internal.C0360do;
import com.google.android.gms.internal.C0396m;
import com.google.android.gms.internal.C0397n;
import com.google.android.gms.internal.C0398v;
import com.google.android.gms.internal.C0401p;
import com.google.android.gms.internal.C0403r;
import com.google.android.gms.internal.ae;
import com.google.android.gms.internal.ag;
import com.google.android.gms.internal.ak;
import com.google.android.gms.internal.gb;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0207q;

public final class AdView extends ViewGroup {
    private final ag f414a;

    public AdView(Context context) {
        super(context);
        this.f414a = new ag(this);
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f414a = new ag(this, attributeSet, false);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f414a = new ag(this, attributeSet, false);
    }

    public final void m895a() {
        ag agVar = this.f414a;
        try {
            if (agVar.f908d != null) {
                agVar.f908d.mo982b();
            }
        } catch (Throwable e) {
            gb.m2070a("Failed to destroy AdView.", e);
        }
    }

    public final void m896a(C0217b c0217b) {
        ag agVar = this.f414a;
        ae a = c0217b.m916a();
        if (agVar.f908d == null) {
            if ((agVar.f909e == null || agVar.f910f == null) && agVar.f908d == null) {
                throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
            }
            try {
                Context context = agVar.f911g.getContext();
                agVar.f908d = C0397n.m2658a(context, new ak(context, agVar.f909e), agVar.f910f, agVar.f905a);
                if (agVar.f907c != null) {
                    agVar.f908d.mo977a(new C0396m(agVar.f907c));
                }
                if (agVar.f912h != null) {
                    agVar.f908d.mo973a(new C0403r(agVar.f912h));
                }
                if (agVar.f913i != null) {
                    agVar.f908d.mo975a(new C0360do(agVar.f913i));
                }
                try {
                    C0204n a2 = agVar.f908d.mo972a();
                    if (a2 != null) {
                        agVar.f911g.addView((View) C0207q.m864a(a2));
                    }
                } catch (Throwable e) {
                    gb.m2070a("Failed to get an ad frame.", e);
                }
            } catch (Throwable e2) {
                gb.m2070a("Failed to load ad.", e2);
                return;
            }
        }
        C0398v c0398v = agVar.f908d;
        C0401p c0401p = agVar.f906b;
        if (c0398v.mo981a(C0401p.m2750a(agVar.f911g.getContext(), a))) {
            agVar.f905a.m1712a(a.m1630i());
            agVar.f905a.m1713b(a.m1631j());
        }
    }

    public final void m897b() {
        ag agVar = this.f414a;
        try {
            if (agVar.f908d != null) {
                agVar.f908d.mo984d();
            }
        } catch (Throwable e) {
            gb.m2070a("Failed to call pause.", e);
        }
    }

    public final void m898c() {
        ag agVar = this.f414a;
        try {
            if (agVar.f908d != null) {
                agVar.f908d.mo985e();
            }
        } catch (Throwable e) {
            gb.m2070a("Failed to call resume.", e);
        }
    }

    public final C0176a getAdListener() {
        return this.f414a.f907c;
    }

    public final C0220d getAdSize() {
        return this.f414a.m1633a();
    }

    public final String getAdUnitId() {
        return this.f414a.f910f;
    }

    public final C0218a getInAppPurchaseListener() {
        return this.f414a.f913i;
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
        this.f414a.m1634a(c0176a);
    }

    public final void setAdSize(C0220d c0220d) {
        this.f414a.m1636a(c0220d);
    }

    public final void setAdUnitId(String str) {
        this.f414a.m1635a(str);
    }

    public final void setInAppPurchaseListener(C0218a c0218a) {
        ag agVar = this.f414a;
        try {
            agVar.f913i = c0218a;
            if (agVar.f908d != null) {
                agVar.f908d.mo975a(c0218a != null ? new C0360do(c0218a) : null);
            }
        } catch (Throwable e) {
            gb.m2070a("Failed to set the InAppPurchaseListener.", e);
        }
    }
}
