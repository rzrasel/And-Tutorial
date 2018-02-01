package com.google.android.gms.plus;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public final class C0502c extends FrameLayout {
    public C0502c(Context context, int i) {
        int i2;
        int i3 = 24;
        super(context);
        View button = new Button(context);
        button.setEnabled(false);
        C0503g c0505e = new C0505e(getContext(), (byte) 0);
        if (!c0505e.mo1312a()) {
            c0505e = new C0506f(getContext(), (byte) 0);
        }
        if (!c0505e.mo1312a()) {
            c0505e = new C0504d(getContext(), (byte) 0);
        }
        button.setBackgroundDrawable(c0505e.mo1311a(i));
        Point point = new Point();
        switch (i) {
            case 0:
                i2 = 14;
                break;
            case 1:
                i3 = 32;
                i2 = 20;
                break;
            case 2:
                i3 = 50;
                i2 = 20;
                break;
            default:
                i3 = 38;
                i2 = 24;
                break;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, (float) i3, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) i2, displayMetrics);
        point.x = (int) (((double) applyDimension) + 0.5d);
        point.y = (int) (((double) applyDimension2) + 0.5d);
        addView(button, new LayoutParams(point.x, point.y, 17));
    }
}
