package com.google.android.gms.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.gms.ads.C0176a;
import com.google.android.gms.ads.C0220d;
import com.google.android.gms.ads.doubleclick.C0221a;
import com.google.android.gms.ads.p009c.C0218a;

public final class ag {
    public final br f905a;
    public final C0401p f906b;
    public C0176a f907c;
    public C0398v f908d;
    public C0220d[] f909e;
    public String f910f;
    public ViewGroup f911g;
    public C0221a f912h;
    public C0218a f913i;

    public ag(ViewGroup viewGroup) {
        this(viewGroup, null, false, C0401p.m2751a());
    }

    public ag(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, C0401p.m2751a());
    }

    private ag(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C0401p c0401p) {
        this.f905a = new br();
        this.f911g = viewGroup;
        this.f906b = c0401p;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                an anVar = new an(context, attributeSet);
                this.f909e = anVar.m1649a(z);
                this.f910f = anVar.m1648a();
                if (viewGroup.isInEditMode()) {
                    fz.m2032a(viewGroup, new ak(context, this.f909e[0]), "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                fz.m2034a(viewGroup, new ak(context, C0220d.f420a), e.getMessage(), e.getMessage());
            }
        }
    }

    public final C0220d m1633a() {
        try {
            if (this.f908d != null) {
                return this.f908d.mo989i().m1644a();
            }
        } catch (Throwable e) {
            gb.m2070a("Failed to get the current AdSize.", e);
        }
        return this.f909e != null ? this.f909e[0] : null;
    }

    public final void m1634a(C0176a c0176a) {
        try {
            this.f907c = c0176a;
            if (this.f908d != null) {
                this.f908d.mo977a(c0176a != null ? new C0396m(c0176a) : null);
            }
        } catch (Throwable e) {
            gb.m2070a("Failed to set the AdListener.", e);
        }
    }

    public final void m1635a(String str) {
        if (this.f910f != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f910f = str;
    }

    public final void m1636a(C0220d... c0220dArr) {
        if (this.f909e != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        m1637b(c0220dArr);
    }

    public final void m1637b(C0220d... c0220dArr) {
        this.f909e = c0220dArr;
        try {
            if (this.f908d != null) {
                this.f908d.mo974a(new ak(this.f911g.getContext(), this.f909e));
            }
        } catch (Throwable e) {
            gb.m2070a("Failed to set the ad size.", e);
        }
        this.f911g.requestLayout();
    }
}
