package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.aab;
import com.google.android.gms.internal.aah;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.agc;
import com.google.android.gms.internal.id;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;

public class NativeAdView extends FrameLayout {
    private final FrameLayout f3954a;
    private final agc f3955b = m3600a();

    public NativeAdView(Context context) {
        super(context);
        this.f3954a = m3599a(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3954a = m3599a(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3954a = m3599a(context);
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3954a = m3599a(context);
    }

    private final FrameLayout m3599a(Context context) {
        View frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final agc m3600a() {
        C1516t.m3861a(this.f3954a, (Object) "createDelegate must be called after mOverlayFrame has been created");
        aab b = aak.m4023b();
        Context context = this.f3954a.getContext();
        return (agc) aab.m3997a(context, false, new aah(b, this, this.f3954a, context));
    }

    protected final View m3601a(String str) {
        try {
            C1398a a = this.f3955b.mo1714a(str);
            if (a != null) {
                return (View) C1401c.m3585a(a);
            }
        } catch (RemoteException e) {
            id.m5372a(6);
        }
        return null;
    }

    protected final void m3602a(String str, View view) {
        try {
            this.f3955b.mo1718a(str, C1401c.m3584a((Object) view));
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f3954a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f3954a != view) {
            super.bringChildToFront(this.f3954a);
        }
    }

    public void destroy() {
        try {
            this.f3955b.mo1715a();
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    public AdChoicesView getAdChoicesView() {
        View a = m3601a("1098");
        return a instanceof AdChoicesView ? (AdChoicesView) a : null;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f3955b != null) {
            try {
                this.f3955b.mo1717a(C1401c.m3584a((Object) view), i);
            } catch (RemoteException e) {
                id.m5372a(6);
            }
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f3954a);
    }

    public void removeView(View view) {
        if (this.f3954a != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        m3602a("1098", adChoicesView);
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.f3955b.mo1716a((C1398a) nativeAd.zzbf());
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }
}
