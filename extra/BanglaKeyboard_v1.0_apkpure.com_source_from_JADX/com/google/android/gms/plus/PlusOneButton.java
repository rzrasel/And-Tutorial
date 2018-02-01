package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.jg;
import com.google.android.gms.plus.internal.C0511e;

public final class PlusOneButton extends FrameLayout {
    private View f2240a;
    private int f2241b;
    private int f2242c;
    private String f2243d;
    private int f2244e;
    private C0500b f2245f;

    public PlusOneButton(Context context, AttributeSet attributeSet) {
        int i = 2;
        super(context, attributeSet);
        String a = jg.m2483a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, "PlusOneButton");
        int i2 = "SMALL".equalsIgnoreCase(a) ? 0 : "MEDIUM".equalsIgnoreCase(a) ? 1 : "TALL".equalsIgnoreCase(a) ? 2 : 3;
        this.f2241b = i2;
        a = jg.m2483a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeSet, "PlusOneButton");
        if (!"INLINE".equalsIgnoreCase(a)) {
            i = "NONE".equalsIgnoreCase(a) ? 0 : 1;
        }
        this.f2242c = i;
        this.f2244e = -1;
        m3573a(getContext());
        if (!isInEditMode()) {
        }
    }

    private void m3573a(Context context) {
        if (this.f2240a != null) {
            removeView(this.f2240a);
        }
        this.f2240a = C0511e.m3594a(context, this.f2241b, this.f2242c, this.f2243d, this.f2244e);
        setOnPlusOneClickListener(this.f2245f);
        addView(this.f2240a);
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2240a.layout(0, 0, i3 - i, i4 - i2);
    }

    protected final void onMeasure(int i, int i2) {
        View view = this.f2240a;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void setAnnotation(int i) {
        this.f2242c = i;
        m3573a(getContext());
    }

    public final void setOnPlusOneClickListener(C0500b c0500b) {
        this.f2245f = c0500b;
        this.f2240a.setOnClickListener(new C0501a(this, c0500b));
    }

    public final void setSize(int i) {
        this.f2241b = i;
        m3573a(getContext());
    }
}
