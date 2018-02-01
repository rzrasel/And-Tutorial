package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0116a.C0108d;
import android.support.design.C0116a.C0110f;
import android.support.design.C0116a.C0115k;
import android.support.design.widget.C0191b.C0129b;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SnackbarContentLayout extends LinearLayout implements C0129b {
    private TextView f484a;
    private Button f485b;
    private int f486c;
    private int f487d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.SnackbarLayout);
        this.f486c = obtainStyledAttributes.getDimensionPixelSize(C0115k.SnackbarLayout_android_maxWidth, -1);
        this.f487d = obtainStyledAttributes.getDimensionPixelSize(C0115k.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    private boolean m240a(int i, int i2, int i3) {
        boolean z = false;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        }
        if (this.f484a.getPaddingTop() == i2 && this.f484a.getPaddingBottom() == i3) {
            return z;
        }
        View view = this.f484a;
        if (C0679r.m1947t(view)) {
            C0679r.m1925b(view, C0679r.m1935h(view), i2, C0679r.m1936i(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
        return true;
    }

    public final void mo62a() {
        this.f484a.setAlpha(0.0f);
        this.f484a.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (this.f485b.getVisibility() == 0) {
            this.f485b.setAlpha(0.0f);
            this.f485b.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }

    public final void mo63b() {
        this.f484a.setAlpha(1.0f);
        this.f484a.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (this.f485b.getVisibility() == 0) {
            this.f485b.setAlpha(1.0f);
            this.f485b.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }

    public Button getActionView() {
        return this.f485b;
    }

    public TextView getMessageView() {
        return this.f484a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f484a = (TextView) findViewById(C0110f.snackbar_text);
        this.f485b = (Button) findViewById(C0110f.snackbar_action);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f486c > 0 && getMeasuredWidth() > this.f486c) {
            i = MeasureSpec.makeMeasureSpec(this.f486c, 1073741824);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0108d.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0108d.design_snackbar_padding_vertical);
        int i3 = this.f484a.getLayout().getLineCount() > 1 ? 1 : 0;
        if (i3 == 0 || this.f487d <= 0 || this.f485b.getMeasuredWidth() <= this.f487d) {
            if (i3 == 0) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (m240a(0, dimensionPixelSize, dimensionPixelSize)) {
                dimensionPixelSize = 1;
            }
            dimensionPixelSize = 0;
        } else {
            if (m240a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                dimensionPixelSize = 1;
            }
            dimensionPixelSize = 0;
        }
        if (dimensionPixelSize != 0) {
            super.onMeasure(i, i2);
        }
    }
}
