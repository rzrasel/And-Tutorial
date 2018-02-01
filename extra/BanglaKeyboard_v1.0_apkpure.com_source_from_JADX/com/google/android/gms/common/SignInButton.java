package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.internal.fs;
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jf;
import com.google.android.gms.p007a.C0209t;

public final class SignInButton extends FrameLayout implements OnClickListener {
    private int f467a;
    private int f468b;
    private View f469c;
    private OnClickListener f470d;

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f470d = null;
        m962a(0, 0);
    }

    private void m962a(int i, int i2) {
        boolean z = true;
        boolean z2 = i >= 0 && i < 3;
        je.m2477a(z2, "Unknown button size " + i);
        if (i2 < 0 || i2 >= 2) {
            z = false;
        }
        je.m2477a(z, "Unknown color scheme " + i2);
        this.f467a = i;
        this.f468b = i2;
        Context context = getContext();
        if (this.f469c != null) {
            removeView(this.f469c);
        }
        try {
            this.f469c = jf.m2480a(context, this.f467a, this.f468b);
        } catch (C0209t e) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.f467a;
            int i4 = this.f468b;
            View fsVar = new fs(context);
            fsVar.m2015a(context.getResources(), i3, i4);
            this.f469c = fsVar;
        }
        addView(this.f469c);
        this.f469c.setEnabled(isEnabled());
        this.f469c.setOnClickListener(this);
    }

    public final void onClick(View view) {
        if (this.f470d != null && view == this.f469c) {
            this.f470d.onClick(this);
        }
    }

    public final void setColorScheme(int i) {
        m962a(this.f467a, i);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f469c.setEnabled(z);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f470d = onClickListener;
        if (this.f469c != null) {
            this.f469c.setOnClickListener(this);
        }
    }

    public final void setSize(int i) {
        m962a(i, this.f468b);
    }
}
