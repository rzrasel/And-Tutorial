package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

@TargetApi(19)
@aqv
public final class api extends apf {
    private Object f5548e = new Object();
    private PopupWindow f5549f;
    private boolean f5550g = false;

    api(Context context, ef efVar, jf jfVar, ape com_google_android_gms_internal_ape) {
        super(context, efVar, jfVar, com_google_android_gms_internal_ape);
    }

    private final void m5027c() {
        synchronized (this.f5548e) {
            this.f5550g = true;
            if ((this.a instanceof Activity) && ((Activity) this.a).isDestroyed()) {
                this.f5549f = null;
            }
            if (this.f5549f != null) {
                if (this.f5549f.isShowing()) {
                    this.f5549f.dismiss();
                }
                this.f5549f = null;
            }
        }
    }

    protected final void mo2008a(int i) {
        m5027c();
        super.mo2008a(i);
    }

    protected final void mo2009b() {
        Window window = this.a instanceof Activity ? ((Activity) this.a).getWindow() : null;
        if (window != null && window.getDecorView() != null && !((Activity) this.a).isDestroyed()) {
            View frameLayout = new FrameLayout(this.a);
            frameLayout.setLayoutParams(new LayoutParams(-1, -1));
            jf jfVar = this.b;
            if (jfVar == null) {
                throw null;
            }
            frameLayout.addView((View) jfVar, -1, -1);
            synchronized (this.f5548e) {
                if (this.f5550g) {
                    return;
                }
                this.f5549f = new PopupWindow(frameLayout, 1, 1, false);
                this.f5549f.setOutsideTouchable(true);
                this.f5549f.setClippingEnabled(false);
                id.m5372a(3);
                try {
                    this.f5549f.showAtLocation(window.getDecorView(), 0, -1, -1);
                } catch (Exception e) {
                    this.f5549f = null;
                }
            }
        }
    }

    public final void mo1473f() {
        m5027c();
        super.mo1473f();
    }
}
