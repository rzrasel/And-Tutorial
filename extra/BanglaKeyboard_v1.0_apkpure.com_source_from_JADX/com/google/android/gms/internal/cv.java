package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;

public final class cv extends FrameLayout implements OnClickListener {
    private final Activity f1155a;
    private final ImageButton f1156b;

    public cv(Activity activity, int i) {
        super(activity);
        this.f1155a = activity;
        setOnClickListener(this);
        this.f1156b = new ImageButton(activity);
        this.f1156b.setImageResource(17301527);
        this.f1156b.setBackgroundColor(0);
        this.f1156b.setOnClickListener(this);
        this.f1156b.setPadding(0, 0, 0, 0);
        int a = fz.m2028a((Context) activity, i);
        addView(this.f1156b, new LayoutParams(a, a, 17));
    }

    public final void m1840a(boolean z) {
        this.f1156b.setVisibility(z ? 4 : 0);
    }

    public final void onClick(View view) {
        this.f1155a.finish();
    }
}
