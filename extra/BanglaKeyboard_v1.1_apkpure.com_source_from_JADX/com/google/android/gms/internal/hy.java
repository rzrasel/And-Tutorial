package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.zzbv;

@aqv
public final class hy {
    Activity f6233a;
    private final View f6234b;
    private boolean f6235c;
    private boolean f6236d;
    private boolean f6237e;
    private OnGlobalLayoutListener f6238f;
    private OnScrollChangedListener f6239g;

    public hy(Activity activity, View view, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.f6233a = activity;
        this.f6234b = view;
        this.f6238f = onGlobalLayoutListener;
        this.f6239g = onScrollChangedListener;
    }

    private final void m5606e() {
        if (!this.f6235c) {
            if (this.f6238f != null) {
                if (this.f6233a != null) {
                    zzbv.zzea();
                    gb.m5444a(this.f6233a, this.f6238f);
                }
                zzbv.zzey();
                ja.m5655a(this.f6234b, this.f6238f);
            }
            if (this.f6239g != null) {
                if (this.f6233a != null) {
                    zzbv.zzea();
                    gb.m5445a(this.f6233a, this.f6239g);
                }
                zzbv.zzey();
                ja.m5656a(this.f6234b, this.f6239g);
            }
            this.f6235c = true;
        }
    }

    private final void m5607f() {
        if (this.f6233a != null && this.f6235c) {
            if (!(this.f6238f == null || this.f6233a == null)) {
                zzbv.zzec().mo2107a(this.f6233a, this.f6238f);
            }
            if (!(this.f6239g == null || this.f6233a == null)) {
                zzbv.zzea();
                gb.m5470b(this.f6233a, this.f6239g);
            }
            this.f6235c = false;
        }
    }

    public final void m5608a() {
        this.f6237e = true;
        if (this.f6236d) {
            m5606e();
        }
    }

    public final void m5609b() {
        this.f6237e = false;
        m5607f();
    }

    public final void m5610c() {
        this.f6236d = true;
        if (this.f6237e) {
            m5606e();
        }
    }

    public final void m5611d() {
        this.f6236d = false;
        m5607f();
    }
}
