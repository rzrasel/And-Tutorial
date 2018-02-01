package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.C0229b;
import com.google.android.gms.C0230c;
import com.google.android.gms.C0263d;

public final class fs extends Button {
    public fs(Context context) {
        this(context, null);
    }

    public fs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    private static int m2014a(int i, int i2, int i3) {
        switch (i) {
            case 0:
                return i2;
            case 1:
                return i3;
            default:
                throw new IllegalStateException("Unknown color scheme: " + i);
        }
    }

    public final void m2015a(Resources resources, int i, int i2) {
        int a;
        boolean z = true;
        boolean z2 = i >= 0 && i < 3;
        je.m2477a(z2, "Unknown button size " + i);
        if (i2 < 0 || i2 >= 2) {
            z = false;
        }
        je.m2477a(z, "Unknown color scheme " + i2);
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int) ((f * 48.0f) + 0.5f));
        setMinWidth((int) ((f * 48.0f) + 0.5f));
        switch (i) {
            case 0:
            case 1:
                a = m2014a(i2, C0230c.common_signin_btn_text_dark, C0230c.common_signin_btn_text_light);
                break;
            case 2:
                a = m2014a(i2, C0230c.common_signin_btn_icon_dark, C0230c.common_signin_btn_icon_light);
                break;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
        if (a == -1) {
            throw new IllegalStateException("Could not find background resource!");
        }
        setBackgroundDrawable(resources.getDrawable(a));
        setTextColor(resources.getColorStateList(m2014a(i2, C0229b.common_signin_btn_text_dark, C0229b.common_signin_btn_text_light)));
        switch (i) {
            case 0:
                setText(resources.getString(C0263d.common_signin_button_text));
                return;
            case 1:
                setText(resources.getString(C0263d.common_signin_button_text_long));
                return;
            case 2:
                setText(null);
                return;
            default:
                throw new IllegalStateException("Unknown button size: " + i);
        }
    }
}
