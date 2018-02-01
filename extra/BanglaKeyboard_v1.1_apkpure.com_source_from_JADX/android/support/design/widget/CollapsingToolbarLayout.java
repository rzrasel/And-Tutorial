package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.C0116a.C0110f;
import android.support.design.C0116a.C0114j;
import android.support.design.C0116a.C0115k;
import android.support.design.widget.AppBarLayout.C0154a;
import android.support.v4.content.C0392a;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.p014c.C0429a;
import android.support.v4.p018f.C0493i;
import android.support.v4.view.C0127n;
import android.support.v4.view.C0679r;
import android.support.v4.view.C0696z;
import android.support.v7.p021a.C0780a.C0778i;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

public class CollapsingToolbarLayout extends FrameLayout {
    final C0238f f666a;
    Drawable f667b;
    int f668c;
    C0696z f669d;
    private boolean f670e;
    private int f671f;
    private Toolbar f672g;
    private View f673h;
    private View f674i;
    private int f675j;
    private int f676k;
    private int f677l;
    private int f678m;
    private final Rect f679n;
    private boolean f680o;
    private boolean f681p;
    private Drawable f682q;
    private int f683r;
    private boolean f684s;
    private ValueAnimator f685t;
    private long f686u;
    private int f687v;
    private C0154a f688w;

    class C01691 implements C0127n {
        final /* synthetic */ CollapsingToolbarLayout f661a;

        C01691(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f661a = collapsingToolbarLayout;
        }

        public final C0696z mo61a(View view, C0696z c0696z) {
            View view2 = this.f661a;
            C0696z c0696z2 = null;
            if (C0679r.m1945r(view2)) {
                c0696z2 = c0696z;
            }
            if (!C0493i.m1286a(view2.f669d, c0696z2)) {
                view2.f669d = c0696z2;
                view2.requestLayout();
            }
            return c0696z.m1999f();
        }
    }

    class C01702 implements AnimatorUpdateListener {
        final /* synthetic */ CollapsingToolbarLayout f662a;

        C01702(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f662a = collapsingToolbarLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f662a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static class LayoutParams extends android.widget.FrameLayout.LayoutParams {
        int f663a = 0;
        float f664b = 0.5f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.CollapsingToolbarLayout_Layout);
            this.f663a = obtainStyledAttributes.getInt(C0115k.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.f664b = obtainStyledAttributes.getFloat(C0115k.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private class C0171a implements C0154a {
        final /* synthetic */ CollapsingToolbarLayout f665a;

        C0171a(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f665a = collapsingToolbarLayout;
        }

        public final void mo144a(int i) {
            this.f665a.f668c = i;
            int b = this.f665a.f669d != null ? this.f665a.f669d.m1995b() : 0;
            int childCount = this.f665a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f665a.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C0262q a = CollapsingToolbarLayout.m449a(childAt);
                switch (layoutParams.f663a) {
                    case 1:
                        a.m698a(C0429a.m1144a(-i, 0, this.f665a.m454b(childAt)));
                        break;
                    case 2:
                        a.m698a(Math.round(layoutParams.f664b * ((float) (-i))));
                        break;
                    default:
                        break;
                }
            }
            this.f665a.m453a();
            if (this.f665a.f667b != null && b > 0) {
                C0679r.m1928c(this.f665a);
            }
            this.f665a.f666a.m624a(((float) Math.abs(i)) / ((float) ((this.f665a.getHeight() - C0679r.m1938k(this.f665a)) - b)));
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f670e = true;
        this.f679n = new Rect();
        this.f687v = -1;
        C0260o.m694a(context);
        this.f666a = new C0238f(this);
        this.f666a.m630a(C0215a.f919e);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.CollapsingToolbarLayout, i, C0114j.Widget_Design_CollapsingToolbar);
        this.f666a.m625a(obtainStyledAttributes.getInt(C0115k.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.f666a.m634b(obtainStyledAttributes.getInt(C0115k.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0115k.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f678m = dimensionPixelSize;
        this.f677l = dimensionPixelSize;
        this.f676k = dimensionPixelSize;
        this.f675j = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(C0115k.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f675j = obtainStyledAttributes.getDimensionPixelSize(C0115k.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (obtainStyledAttributes.hasValue(C0115k.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f677l = obtainStyledAttributes.getDimensionPixelSize(C0115k.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (obtainStyledAttributes.hasValue(C0115k.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f676k = obtainStyledAttributes.getDimensionPixelSize(C0115k.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (obtainStyledAttributes.hasValue(C0115k.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f678m = obtainStyledAttributes.getDimensionPixelSize(C0115k.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f680o = obtainStyledAttributes.getBoolean(C0115k.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(obtainStyledAttributes.getText(C0115k.CollapsingToolbarLayout_title));
        this.f666a.m638d(C0114j.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.f666a.m637c(C0778i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (obtainStyledAttributes.hasValue(C0115k.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.f666a.m638d(obtainStyledAttributes.getResourceId(C0115k.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (obtainStyledAttributes.hasValue(C0115k.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.f666a.m637c(obtainStyledAttributes.getResourceId(C0115k.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.f687v = obtainStyledAttributes.getDimensionPixelSize(C0115k.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.f686u = (long) obtainStyledAttributes.getInt(C0115k.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(obtainStyledAttributes.getDrawable(C0115k.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(C0115k.CollapsingToolbarLayout_statusBarScrim));
        this.f671f = obtainStyledAttributes.getResourceId(C0115k.CollapsingToolbarLayout_toolbarId, -1);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        C0679r.m1914a((View) this, new C01691(this));
    }

    static C0262q m449a(View view) {
        C0262q c0262q = (C0262q) view.getTag(C0110f.view_offset_helper);
        if (c0262q != null) {
            return c0262q;
        }
        c0262q = new C0262q(view);
        view.setTag(C0110f.view_offset_helper, c0262q);
        return c0262q;
    }

    private void m450b() {
        if (this.f670e) {
            View view;
            this.f672g = null;
            this.f673h = null;
            if (this.f671f != -1) {
                this.f672g = (Toolbar) findViewById(this.f671f);
                if (this.f672g != null) {
                    view = this.f672g;
                    CollapsingToolbarLayout parent = view.getParent();
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = parent;
                        }
                        parent = parent.getParent();
                    }
                    this.f673h = view;
                }
            }
            if (this.f672g == null) {
                Toolbar toolbar;
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    view = getChildAt(i);
                    if (view instanceof Toolbar) {
                        toolbar = (Toolbar) view;
                        break;
                    }
                }
                toolbar = null;
                this.f672g = toolbar;
            }
            m452c();
            this.f670e = false;
        }
    }

    private static int m451c(View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            return view.getHeight();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        return marginLayoutParams.bottomMargin + (view.getHeight() + marginLayoutParams.topMargin);
    }

    private void m452c() {
        if (!(this.f680o || this.f674i == null)) {
            ViewParent parent = this.f674i.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f674i);
            }
        }
        if (this.f680o && this.f672g != null) {
            if (this.f674i == null) {
                this.f674i = new View(getContext());
            }
            if (this.f674i.getParent() == null) {
                this.f672g.addView(this.f674i, -1, -1);
            }
        }
    }

    final void m453a() {
        if (this.f682q != null || this.f667b != null) {
            setScrimsShown(getHeight() + this.f668c < getScrimVisibleHeightTrigger());
        }
    }

    final int m454b(View view) {
        return ((getHeight() - m449a(view).f1081a) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m450b();
        if (this.f672g == null && this.f682q != null && this.f683r > 0) {
            this.f682q.mutate().setAlpha(this.f683r);
            this.f682q.draw(canvas);
        }
        if (this.f680o && this.f681p) {
            this.f666a.m628a(canvas);
        }
        if (this.f667b != null && this.f683r > 0) {
            int b = this.f669d != null ? this.f669d.m1995b() : 0;
            if (b > 0) {
                this.f667b.setBounds(0, -this.f668c, getWidth(), b - this.f668c);
                this.f667b.mutate().setAlpha(this.f683r);
                this.f667b.draw(canvas);
            }
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f682q != null && this.f683r > 0) {
            z = (this.f673h == null || this.f673h == this) ? view == this.f672g : view == this.f673h;
            if (z) {
                this.f682q.mutate().setAlpha(this.f683r);
                this.f682q.draw(canvas);
                z = true;
                return super.drawChild(canvas, view, j) || z;
            }
        }
        z = false;
        if (!super.drawChild(canvas, view, j)) {
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        int i = 0;
        Drawable drawable = this.f667b;
        if (drawable != null && drawable.isStateful()) {
            i = drawable.setState(drawableState) | 0;
        }
        drawable = this.f682q;
        if (drawable != null && drawable.isStateful()) {
            i |= drawable.setState(drawableState);
        }
        if (this.f666a != null) {
            i |= this.f666a.m632a(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    protected /* synthetic */ android.widget.FrameLayout.LayoutParams m7545generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.f666a.f982c;
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f666a.m623a();
    }

    public Drawable getContentScrim() {
        return this.f682q;
    }

    public int getExpandedTitleGravity() {
        return this.f666a.f981b;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f678m;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f677l;
    }

    public int getExpandedTitleMarginStart() {
        return this.f675j;
    }

    public int getExpandedTitleMarginTop() {
        return this.f676k;
    }

    public Typeface getExpandedTitleTypeface() {
        C0238f c0238f = this.f666a;
        return c0238f.f987h != null ? c0238f.f987h : Typeface.DEFAULT;
    }

    int getScrimAlpha() {
        return this.f683r;
    }

    public long getScrimAnimationDuration() {
        return this.f686u;
    }

    public int getScrimVisibleHeightTrigger() {
        if (this.f687v >= 0) {
            return this.f687v;
        }
        int b = this.f669d != null ? this.f669d.m1995b() : 0;
        int k = C0679r.m1938k(this);
        return k > 0 ? Math.min(b + (k * 2), getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f667b;
    }

    public CharSequence getTitle() {
        return this.f680o ? this.f666a.f988i : null;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            C0679r.m1926b((View) this, C0679r.m1945r((View) parent));
            if (this.f688w == null) {
                this.f688w = new C0171a(this);
            }
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            C0154a c0154a = this.f688w;
            if (appBarLayout.f611d == null) {
                appBarLayout.f611d = new ArrayList();
            }
            if (!(c0154a == null || appBarLayout.f611d.contains(c0154a))) {
                appBarLayout.f611d.add(c0154a);
            }
            C0679r.m1944q(this);
        }
    }

    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        if (this.f688w != null && (parent instanceof AppBarLayout)) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            C0154a c0154a = this.f688w;
            if (!(appBarLayout.f611d == null || c0154a == null)) {
                appBarLayout.f611d.remove(c0154a);
            }
        }
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int b;
        int i5;
        int i6 = 1;
        int i7 = 0;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f669d != null) {
            b = this.f669d.m1995b();
            int childCount = getChildCount();
            for (i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C0679r.m1945r(childAt) && childAt.getTop() < b) {
                    C0679r.m1924b(childAt, b);
                }
            }
        }
        if (this.f680o && this.f674i != null) {
            boolean z2 = C0679r.m1901B(this.f674i) && this.f674i.getVisibility() == 0;
            this.f681p = z2;
            if (this.f681p) {
                if (C0679r.m1932e(this) != 1) {
                    i6 = 0;
                }
                b = m454b(this.f673h != null ? this.f673h : this.f672g);
                C0261p.m695a((ViewGroup) this, this.f674i, this.f679n);
                this.f666a.m635b(this.f679n.left + (i6 != 0 ? this.f672g.getTitleMarginEnd() : this.f672g.getTitleMarginStart()), this.f672g.getTitleMarginTop() + (this.f679n.top + b), (i6 != 0 ? this.f672g.getTitleMarginStart() : this.f672g.getTitleMarginEnd()) + this.f679n.right, (b + this.f679n.bottom) - this.f672g.getTitleMarginBottom());
                this.f666a.m626a(i6 != 0 ? this.f677l : this.f675j, this.f679n.top + this.f676k, (i3 - i) - (i6 != 0 ? this.f675j : this.f677l), (i4 - i2) - this.f678m);
                this.f666a.m633b();
            }
        }
        i5 = getChildCount();
        while (i7 < i5) {
            m449a(getChildAt(i7)).m697a();
            i7++;
        }
        if (this.f672g != null) {
            if (this.f680o && TextUtils.isEmpty(this.f666a.f988i)) {
                this.f666a.m631a(this.f672g.getTitle());
            }
            if (this.f673h == null || this.f673h == this) {
                setMinimumHeight(m451c(this.f672g));
            } else {
                setMinimumHeight(m451c(this.f673h));
            }
        }
        m453a();
    }

    protected void onMeasure(int i, int i2) {
        m450b();
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i2);
        int b = this.f669d != null ? this.f669d.m1995b() : 0;
        if (mode == 0 && b > 0) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(b + getMeasuredHeight(), 1073741824));
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f682q != null) {
            this.f682q.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f666a.m634b(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f666a.m637c(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f666a.m627a(colorStateList);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C0238f c0238f = this.f666a;
        if (C0238f.m614a(c0238f.f986g, typeface)) {
            c0238f.f986g = typeface;
            c0238f.m633b();
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = null;
        if (this.f682q != drawable) {
            if (this.f682q != null) {
                this.f682q.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f682q = drawable2;
            if (this.f682q != null) {
                this.f682q.setBounds(0, 0, getWidth(), getHeight());
                this.f682q.setCallback(this);
                this.f682q.setAlpha(this.f683r);
            }
            C0679r.m1928c(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C0392a.getDrawable(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f666a.m625a(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f678m = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f677l = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f675j = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f676k = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f666a.m638d(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f666a.m636b(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C0238f c0238f = this.f666a;
        if (C0238f.m614a(c0238f.f987h, typeface)) {
            c0238f.f987h = typeface;
            c0238f.m633b();
        }
    }

    void setScrimAlpha(int i) {
        if (i != this.f683r) {
            if (!(this.f682q == null || this.f672g == null)) {
                C0679r.m1928c(this.f672g);
            }
            this.f683r = i;
            C0679r.m1928c(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f686u = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f687v != i) {
            this.f687v = i;
            m453a();
        }
    }

    public void setScrimsShown(boolean z) {
        int i = 255;
        int i2 = (!C0679r.m1952y(this) || isInEditMode()) ? 0 : 1;
        if (this.f684s != z) {
            if (i2 != 0) {
                i2 = z ? 255 : 0;
                m450b();
                if (this.f685t == null) {
                    this.f685t = new ValueAnimator();
                    this.f685t.setDuration(this.f686u);
                    this.f685t.setInterpolator(i2 > this.f683r ? C0215a.f917c : C0215a.f918d);
                    this.f685t.addUpdateListener(new C01702(this));
                } else if (this.f685t.isRunning()) {
                    this.f685t.cancel();
                }
                this.f685t.setIntValues(new int[]{this.f683r, i2});
                this.f685t.start();
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f684s = z;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = null;
        if (this.f667b != drawable) {
            if (this.f667b != null) {
                this.f667b.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f667b = drawable2;
            if (this.f667b != null) {
                if (this.f667b.isStateful()) {
                    this.f667b.setState(getDrawableState());
                }
                C0366a.m1049b(this.f667b, C0679r.m1932e(this));
                this.f667b.setVisible(getVisibility() == 0, false);
                this.f667b.setCallback(this);
                this.f667b.setAlpha(this.f683r);
            }
            C0679r.m1928c(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C0392a.getDrawable(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f666a.m631a(charSequence);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f680o) {
            this.f680o = z;
            m452c();
            requestLayout();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (!(this.f667b == null || this.f667b.isVisible() == z)) {
            this.f667b.setVisible(z, false);
        }
        if (this.f682q != null && this.f682q.isVisible() != z) {
            this.f682q.setVisible(z, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f682q || drawable == this.f667b;
    }
}
