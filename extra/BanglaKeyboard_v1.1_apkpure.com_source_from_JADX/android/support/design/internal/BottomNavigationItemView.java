package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.design.C0116a.C0108d;
import android.support.design.C0116a.C0109e;
import android.support.design.C0116a.C0110f;
import android.support.design.C0116a.C0112h;
import android.support.v4.content.C0392a;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.view.C0667p;
import android.support.v4.view.C0679r;
import android.support.v7.view.menu.C0119p.C0117a;
import android.support.v7.view.menu.C0967j;
import android.support.v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;

public class BottomNavigationItemView extends FrameLayout implements C0117a {
    private static final int[] f427a = new int[]{16842912};
    private final int f428b;
    private final int f429c;
    private final float f430d;
    private final float f431e;
    private boolean f432f;
    private ImageView f433g;
    private final TextView f434h;
    private final TextView f435i;
    private int f436j;
    private C0967j f437k;
    private ColorStateList f438l;

    public BottomNavigationItemView(Context context) {
        this(context, null);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f436j = -1;
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0108d.design_bottom_navigation_text_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0108d.design_bottom_navigation_active_text_size);
        this.f428b = resources.getDimensionPixelSize(C0108d.design_bottom_navigation_margin);
        this.f429c = dimensionPixelSize - dimensionPixelSize2;
        this.f430d = (((float) dimensionPixelSize2) * 1.0f) / ((float) dimensionPixelSize);
        this.f431e = (((float) dimensionPixelSize) * 1.0f) / ((float) dimensionPixelSize2);
        LayoutInflater.from(context).inflate(C0112h.design_bottom_navigation_item, this, true);
        setBackgroundResource(C0109e.design_bottom_navigation_item_background);
        this.f433g = (ImageView) findViewById(C0110f.icon);
        this.f434h = (TextView) findViewById(C0110f.smallLabel);
        this.f435i = (TextView) findViewById(C0110f.largeLabel);
    }

    public final void mo42a(C0967j c0967j) {
        this.f437k = c0967j;
        setCheckable(c0967j.isCheckable());
        setChecked(c0967j.isChecked());
        setEnabled(c0967j.isEnabled());
        setIcon(c0967j.getIcon());
        setTitle(c0967j.getTitle());
        setId(c0967j.getItemId());
        setContentDescription(c0967j.getContentDescription());
        TooltipCompat.setTooltipText(this, c0967j.getTooltipText());
    }

    public final boolean mo43a() {
        return false;
    }

    public C0967j getItemData() {
        return this.f437k;
    }

    public int getItemPosition() {
        return this.f436j;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f437k != null && this.f437k.isCheckable() && this.f437k.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f427a);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        this.f435i.setPivotX((float) (this.f435i.getWidth() / 2));
        this.f435i.setPivotY((float) this.f435i.getBaseline());
        this.f434h.setPivotX((float) (this.f434h.getWidth() / 2));
        this.f434h.setPivotY((float) this.f434h.getBaseline());
        LayoutParams layoutParams;
        if (this.f432f) {
            if (z) {
                layoutParams = (LayoutParams) this.f433g.getLayoutParams();
                layoutParams.gravity = 49;
                layoutParams.topMargin = this.f428b;
                this.f433g.setLayoutParams(layoutParams);
                this.f435i.setVisibility(0);
                this.f435i.setScaleX(1.0f);
                this.f435i.setScaleY(1.0f);
            } else {
                layoutParams = (LayoutParams) this.f433g.getLayoutParams();
                layoutParams.gravity = 17;
                layoutParams.topMargin = this.f428b;
                this.f433g.setLayoutParams(layoutParams);
                this.f435i.setVisibility(4);
                this.f435i.setScaleX(0.5f);
                this.f435i.setScaleY(0.5f);
            }
            this.f434h.setVisibility(4);
        } else if (z) {
            layoutParams = (LayoutParams) this.f433g.getLayoutParams();
            layoutParams.gravity = 49;
            layoutParams.topMargin = this.f428b + this.f429c;
            this.f433g.setLayoutParams(layoutParams);
            this.f435i.setVisibility(0);
            this.f434h.setVisibility(4);
            this.f435i.setScaleX(1.0f);
            this.f435i.setScaleY(1.0f);
            this.f434h.setScaleX(this.f430d);
            this.f434h.setScaleY(this.f430d);
        } else {
            layoutParams = (LayoutParams) this.f433g.getLayoutParams();
            layoutParams.gravity = 49;
            layoutParams.topMargin = this.f428b;
            this.f433g.setLayoutParams(layoutParams);
            this.f435i.setVisibility(4);
            this.f434h.setVisibility(0);
            this.f435i.setScaleX(this.f431e);
            this.f435i.setScaleY(this.f431e);
            this.f434h.setScaleX(1.0f);
            this.f434h.setScaleY(1.0f);
        }
        refreshDrawableState();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f434h.setEnabled(z);
        this.f435i.setEnabled(z);
        this.f433g.setEnabled(z);
        if (z) {
            C0679r.m1915a((View) this, C0667p.m1792a(getContext()));
        } else {
            C0679r.m1915a((View) this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C0366a.m1054g(drawable).mutate();
            C0366a.m1043a(drawable, this.f438l);
        }
        this.f433g.setImageDrawable(drawable);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f438l = colorStateList;
        if (this.f437k != null) {
            setIcon(this.f437k.getIcon());
        }
    }

    public void setItemBackground(int i) {
        C0679r.m1912a((View) this, i == 0 ? null : C0392a.getDrawable(getContext(), i));
    }

    public void setItemPosition(int i) {
        this.f436j = i;
    }

    public void setShiftingMode(boolean z) {
        this.f432f = z;
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f434h.setTextColor(colorStateList);
        this.f435i.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f434h.setText(charSequence);
        this.f435i.setText(charSequence);
    }
}
