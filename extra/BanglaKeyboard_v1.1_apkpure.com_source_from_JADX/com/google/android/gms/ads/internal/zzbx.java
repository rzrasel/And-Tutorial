package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.hy;
import com.google.android.gms.internal.jf;
import java.util.ArrayList;
import java.util.List;

public final class zzbx extends ViewSwitcher {
    private final gq f4446a;
    private final hy f4447b;
    private boolean f4448c = true;

    public zzbx(Context context, String str, String str2, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.f4446a = new gq(context);
        this.f4446a.f6150c = str;
        this.f4446a.f6151d = str2;
        if (context instanceof Activity) {
            this.f4447b = new hy((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.f4447b = new hy(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.f4447b.m5608a();
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4447b != null) {
            this.f4447b.m5610c();
        }
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f4447b != null) {
            this.f4447b.m5611d();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f4448c) {
            this.f4446a.m5564a(motionEvent);
        }
        return false;
    }

    public final void removeAllViews() {
        int i;
        int i2 = 0;
        List arrayList = new ArrayList();
        for (i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof jf)) {
                arrayList.add((jf) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = (ArrayList) arrayList;
        i = arrayList2.size();
        while (i2 < i) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((jf) obj).destroy();
        }
    }

    public final gq zzfg() {
        return this.f4446a;
    }

    public final void zzfh() {
        es.m5373a();
        if (this.f4447b != null) {
            this.f4447b.m5609b();
        }
    }

    public final void zzfi() {
        es.m5373a();
        this.f4448c = true;
    }

    public final void zzfj() {
        es.m5373a();
        this.f4448c = false;
    }
}
