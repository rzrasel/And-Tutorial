package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.an;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    static final ad f232a;
    private int f233b;
    private int f234c;
    private Drawable f235d;
    private Drawable f236e;
    private final int f237f;
    private boolean f238g;
    private View f239h;
    private float f240i;
    private float f241j;
    private int f242k;
    private boolean f243l;
    private int f244m;
    private float f245n;
    private float f246o;
    private ab f247p;
    private final aq f248q;
    private boolean f249r;
    private boolean f250s;
    private final Rect f251t;
    private final ArrayList f252u;

    public class LayoutParams extends MarginLayoutParams {
        private static final int[] f226e = new int[]{16843137};
        public float f227a = 0.0f;
        boolean f228b;
        boolean f229c;
        Paint f230d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f226e);
            this.f227a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new ac();
        boolean f231a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f231a = parcel.readInt() != 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f231a ? 1 : 0);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 17) {
            f232a = new ag();
        } else if (i >= 16) {
            f232a = new af();
        } else {
            f232a = new ae();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f233b = -858993460;
        this.f250s = true;
        this.f251t = new Rect();
        this.f252u = new ArrayList();
        float f = context.getResources().getDisplayMetrics().density;
        this.f237f = (int) ((32.0f * f) + 0.5f);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        an.m330a((View) this, new C0124y(this));
        an.m335b(this, 1);
        this.f248q = aq.m617a((ViewGroup) this, 0.5f, new aa());
        this.f248q.m631a(f * 400.0f);
    }

    static /* synthetic */ void m542a(SlidingPaneLayout slidingPaneLayout, int i) {
        if (slidingPaneLayout.f239h == null) {
            slidingPaneLayout.f240i = 0.0f;
            return;
        }
        boolean e = slidingPaneLayout.m554e();
        LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f239h.getLayoutParams();
        int width = slidingPaneLayout.f239h.getWidth();
        if (e) {
            i = (slidingPaneLayout.getWidth() - i) - width;
        }
        slidingPaneLayout.f240i = ((float) (i - ((e ? layoutParams.rightMargin : layoutParams.leftMargin) + (e ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft())))) / ((float) slidingPaneLayout.f242k);
        if (slidingPaneLayout.f244m != 0) {
            slidingPaneLayout.m549b(slidingPaneLayout.f240i);
        }
        if (layoutParams.f229c) {
            slidingPaneLayout.m544a(slidingPaneLayout.f239h, slidingPaneLayout.f240i, slidingPaneLayout.f233b);
        }
        View view = slidingPaneLayout.f239h;
        if (slidingPaneLayout.f247p != null) {
            ab abVar = slidingPaneLayout.f247p;
            float f = slidingPaneLayout.f240i;
        }
    }

    private void m544a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (16777215 & i);
            if (layoutParams.f230d == null) {
                layoutParams.f230d = new Paint();
            }
            layoutParams.f230d.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
            if (an.m338e(view) != 2) {
                an.m328a(view, 2, layoutParams.f230d);
            }
            m551c(view);
        } else if (an.m338e(view) != 0) {
            if (layoutParams.f230d != null) {
                layoutParams.f230d.setColorFilter(null);
            }
            Runnable c0125z = new C0125z(this, view);
            this.f252u.add(c0125z);
            an.m331a((View) this, c0125z);
        }
    }

    private boolean m545a(float f) {
        if (!this.f238g) {
            return false;
        }
        int width;
        LayoutParams layoutParams = (LayoutParams) this.f239h.getLayoutParams();
        if (m554e()) {
            width = (int) (((float) getWidth()) - ((((float) (layoutParams.rightMargin + getPaddingRight())) + (((float) this.f242k) * f)) + ((float) this.f239h.getWidth())));
        } else {
            width = (int) (((float) (layoutParams.leftMargin + getPaddingLeft())) + (((float) this.f242k) * f));
        }
        if (!this.f248q.m636a(this.f239h, width, this.f239h.getTop())) {
            return false;
        }
        m562c();
        an.m336c(this);
        return true;
    }

    private void m549b(float f) {
        Object obj;
        int childCount;
        int i;
        View childAt;
        int i2;
        boolean e = m554e();
        LayoutParams layoutParams = (LayoutParams) this.f239h.getLayoutParams();
        if (layoutParams.f229c) {
            if ((e ? layoutParams.rightMargin : layoutParams.leftMargin) <= 0) {
                obj = 1;
                childCount = getChildCount();
                for (i = 0; i < childCount; i++) {
                    childAt = getChildAt(i);
                    if (childAt != this.f239h) {
                        i2 = (int) ((1.0f - this.f241j) * ((float) this.f244m));
                        this.f241j = f;
                        i2 -= (int) ((1.0f - f) * ((float) this.f244m));
                        if (e) {
                            i2 = -i2;
                        }
                        childAt.offsetLeftAndRight(i2);
                        if (obj == null) {
                            m544a(childAt, e ? this.f241j - 1.0f : 1.0f - this.f241j, this.f234c);
                        }
                    }
                }
            }
        }
        obj = null;
        childCount = getChildCount();
        for (i = 0; i < childCount; i++) {
            childAt = getChildAt(i);
            if (childAt != this.f239h) {
                i2 = (int) ((1.0f - this.f241j) * ((float) this.f244m));
                this.f241j = f;
                i2 -= (int) ((1.0f - f) * ((float) this.f244m));
                if (e) {
                    i2 = -i2;
                }
                childAt.offsetLeftAndRight(i2);
                if (obj == null) {
                    if (e) {
                    }
                    m544a(childAt, e ? this.f241j - 1.0f : 1.0f - this.f241j, this.f234c);
                }
            }
        }
    }

    private void m551c(View view) {
        f232a.mo279a(this, view);
    }

    private boolean m553d() {
        if (!this.f250s && !m545a(0.0f)) {
            return false;
        }
        this.f249r = false;
        return true;
    }

    private boolean m554e() {
        return an.m339f(this) == 1;
    }

    final void m558a() {
        if (this.f247p != null) {
            ab abVar = this.f247p;
        }
        sendAccessibilityEvent(32);
    }

    final void m559a(View view) {
        int left;
        int right;
        int top;
        int bottom;
        int childCount;
        int i;
        View childAt;
        boolean e = m554e();
        int width = e ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = e ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view != null) {
            Object obj;
            if (an.m341h(view)) {
                obj = 1;
            } else {
                if (VERSION.SDK_INT < 18) {
                    Drawable background = view.getBackground();
                    if (background != null) {
                        obj = background.getOpacity() == -1 ? 1 : null;
                    }
                }
                obj = null;
            }
            if (obj != null) {
                left = view.getLeft();
                right = view.getRight();
                top = view.getTop();
                bottom = view.getBottom();
                childCount = getChildCount();
                i = 0;
                while (i < childCount) {
                    childAt = getChildAt(i);
                    if (childAt != view) {
                        int i2 = (Math.max(e ? paddingLeft : width, childAt.getLeft()) >= left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(e ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4;
                        childAt.setVisibility(i2);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
        bottom = 0;
        top = 0;
        right = 0;
        left = 0;
        childCount = getChildCount();
        i = 0;
        while (i < childCount) {
            childAt = getChildAt(i);
            if (childAt != view) {
                if (e) {
                }
                if (e) {
                }
                if (Math.max(e ? paddingLeft : width, childAt.getLeft()) >= left) {
                }
                childAt.setVisibility(i2);
                i++;
            } else {
                return;
            }
        }
    }

    final void m560b() {
        if (this.f247p != null) {
            ab abVar = this.f247p;
        }
        sendAccessibilityEvent(32);
    }

    final boolean m561b(View view) {
        if (view == null) {
            return false;
        }
        return this.f238g && ((LayoutParams) view.getLayoutParams()).f229c && this.f240i > 0.0f;
    }

    final void m562c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.f248q.m645g()) {
            return;
        }
        if (this.f238g) {
            an.m336c(this);
        } else {
            this.f248q.m644f();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = m554e() ? this.f236e : this.f235d;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int right;
            int i;
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (m554e()) {
                right = childAt.getRight();
                i = right + intrinsicWidth;
            } else {
                i = childAt.getLeft();
                right = i - intrinsicWidth;
            }
            drawable.setBounds(right, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save(2);
        if (!(!this.f238g || layoutParams.f228b || this.f239h == null)) {
            canvas.getClipBounds(this.f251t);
            if (m554e()) {
                this.f251t.left = Math.max(this.f251t.left, this.f239h.getRight());
            } else {
                this.f251t.right = Math.min(this.f251t.right, this.f239h.getLeft());
            }
            canvas.clipRect(this.f251t);
        }
        if (VERSION.SDK_INT < 11) {
            if (layoutParams.f229c && this.f240i > 0.0f) {
                if (!view.isDrawingCacheEnabled()) {
                    view.setDrawingCacheEnabled(true);
                }
                Bitmap drawingCache = view.getDrawingCache();
                if (drawingCache != null) {
                    canvas.drawBitmap(drawingCache, (float) view.getLeft(), (float) view.getTop(), layoutParams.f230d);
                    z = false;
                    canvas.restoreToCount(save);
                    return z;
                }
                "drawChild: child view " + view + " returned null drawing cache";
            } else if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
        }
        z = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return z;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f234c;
    }

    public int getParallaxDistance() {
        return this.f244m;
    }

    public int getSliderFadeColor() {
        return this.f233b;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f250s = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f250s = true;
        int size = this.f252u.size();
        for (int i = 0; i < size; i++) {
            ((C0125z) this.f252u.get(i)).run();
        }
        this.f252u.clear();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r2 = 0;
        r1 = 1;
        r3 = android.support.v4.view.C0097w.m490a(r7);
        r0 = r6.f238g;
        if (r0 != 0) goto L_0x002d;
    L_0x000a:
        if (r3 != 0) goto L_0x002d;
    L_0x000c:
        r0 = r6.getChildCount();
        if (r0 <= r1) goto L_0x002d;
    L_0x0012:
        r0 = r6.getChildAt(r1);
        if (r0 == 0) goto L_0x002d;
    L_0x0018:
        r4 = r6.f248q;
        r4 = r7.getX();
        r4 = (int) r4;
        r5 = r7.getY();
        r5 = (int) r5;
        r0 = android.support.v4.widget.aq.m626b(r0, r4, r5);
        if (r0 != 0) goto L_0x0041;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r6.f249r = r0;
    L_0x002d:
        r0 = r6.f238g;
        if (r0 == 0) goto L_0x0037;
    L_0x0031:
        r0 = r6.f243l;
        if (r0 == 0) goto L_0x0043;
    L_0x0035:
        if (r3 == 0) goto L_0x0043;
    L_0x0037:
        r0 = r6.f248q;
        r0.m643e();
        r2 = super.onInterceptTouchEvent(r7);
    L_0x0040:
        return r2;
    L_0x0041:
        r0 = r2;
        goto L_0x002b;
    L_0x0043:
        r0 = 3;
        if (r3 == r0) goto L_0x0048;
    L_0x0046:
        if (r3 != r1) goto L_0x004e;
    L_0x0048:
        r0 = r6.f248q;
        r0.m643e();
        goto L_0x0040;
    L_0x004e:
        switch(r3) {
            case 0: goto L_0x005e;
            case 1: goto L_0x0051;
            case 2: goto L_0x0082;
            default: goto L_0x0051;
        };
    L_0x0051:
        r0 = r2;
    L_0x0052:
        r3 = r6.f248q;
        r3 = r3.m635a(r7);
        if (r3 != 0) goto L_0x005c;
    L_0x005a:
        if (r0 == 0) goto L_0x0040;
    L_0x005c:
        r2 = r1;
        goto L_0x0040;
    L_0x005e:
        r6.f243l = r2;
        r0 = r7.getX();
        r3 = r7.getY();
        r6.f245n = r0;
        r6.f246o = r3;
        r4 = r6.f248q;
        r4 = r6.f239h;
        r0 = (int) r0;
        r3 = (int) r3;
        r0 = android.support.v4.widget.aq.m626b(r4, r0, r3);
        if (r0 == 0) goto L_0x0051;
    L_0x0078:
        r0 = r6.f239h;
        r0 = r6.m561b(r0);
        if (r0 == 0) goto L_0x0051;
    L_0x0080:
        r0 = r1;
        goto L_0x0052;
    L_0x0082:
        r0 = r7.getX();
        r3 = r7.getY();
        r4 = r6.f245n;
        r0 = r0 - r4;
        r0 = java.lang.Math.abs(r0);
        r4 = r6.f246o;
        r3 = r3 - r4;
        r3 = java.lang.Math.abs(r3);
        r4 = r6.f248q;
        r4 = r4.m642d();
        r4 = (float) r4;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0051;
    L_0x00a3:
        r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0051;
    L_0x00a7:
        r0 = r6.f248q;
        r0.m643e();
        r6.f243l = r1;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SlidingPaneLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean e = m554e();
        if (e) {
            this.f248q.m632a(2);
        } else {
            this.f248q.m632a(1);
        }
        int i6 = i3 - i;
        int paddingRight = e ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = e ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f250s) {
            float f = (this.f238g && this.f249r) ? 1.0f : 0.0f;
            this.f240i = f;
        }
        int i7 = 0;
        int i8 = paddingRight;
        while (i7 < childCount) {
            int i9;
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int i10;
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int i11 = 0;
                if (layoutParams.f228b) {
                    int min = (Math.min(paddingRight, (i6 - paddingLeft) - this.f237f) - i8) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f242k = min;
                    i9 = e ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.f229c = ((i8 + i9) + min) + (measuredWidth / 2) > i6 - paddingLeft;
                    i5 = (int) (((float) min) * this.f240i);
                    i10 = i8 + (i9 + i5);
                    this.f240i = ((float) i5) / ((float) this.f242k);
                } else {
                    i5 = (!this.f238g || this.f244m == 0) ? 0 : (int) ((1.0f - this.f240i) * ((float) this.f244m));
                    i11 = i5;
                    i10 = paddingRight;
                }
                if (e) {
                    i9 = (i6 - i10) + i11;
                    i5 = i9 - measuredWidth;
                } else {
                    i5 = i10 - i11;
                    i9 = i5 + measuredWidth;
                }
                childAt.layout(i5, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                i5 = childAt.getWidth() + paddingRight;
                i9 = i10;
            } else {
                i5 = paddingRight;
                i9 = i8;
            }
            i7++;
            paddingRight = i5;
            i8 = i9;
        }
        if (this.f250s) {
            if (this.f238g) {
                if (this.f244m != 0) {
                    m549b(this.f240i);
                }
                if (((LayoutParams) this.f239h.getLayoutParams()).f229c) {
                    m544a(this.f239h, this.f240i, this.f233b);
                }
            } else {
                for (i5 = 0; i5 < childCount; i5++) {
                    m544a(getChildAt(i5), 0.0f, this.f233b);
                }
            }
            m559a(this.f239h);
        }
        this.f250s = false;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int makeMeasureSpec;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            if (mode2 == 0) {
                if (!isInEditMode()) {
                    throw new IllegalStateException("Height must not be UNSPECIFIED");
                } else if (mode2 == 0) {
                    i3 = Integer.MIN_VALUE;
                    i4 = size;
                    size = 300;
                }
            }
            i3 = mode2;
            i4 = size;
            size = size2;
        } else if (isInEditMode()) {
            if (mode != Integer.MIN_VALUE && mode == 0) {
                i3 = mode2;
                i4 = 300;
                size = size2;
            }
            i3 = mode2;
            i4 = size;
            size = size2;
        } else {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        }
        switch (i3) {
            case Integer.MIN_VALUE:
                mode2 = 0;
                size2 = (size - getPaddingTop()) - getPaddingBottom();
                break;
            case 1073741824:
                mode2 = (size - getPaddingTop()) - getPaddingBottom();
                size2 = mode2;
                break;
            default:
                mode2 = 0;
                size2 = -1;
                break;
        }
        boolean z = false;
        int paddingLeft = (i4 - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f239h = null;
        int i5 = 0;
        int i6 = paddingLeft;
        int i7 = mode2;
        float f = 0.0f;
        while (i5 < childCount) {
            float f2;
            boolean z2;
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f229c = false;
                mode2 = i6;
                mode = i7;
                f2 = f;
                z2 = z;
            } else {
                if (layoutParams.f227a > 0.0f) {
                    f += layoutParams.f227a;
                    if (layoutParams.width == 0) {
                        mode2 = i6;
                        mode = i7;
                        f2 = f;
                        z2 = z;
                    }
                }
                mode = layoutParams.leftMargin + layoutParams.rightMargin;
                mode = layoutParams.width == -2 ? MeasureSpec.makeMeasureSpec(paddingLeft - mode, Integer.MIN_VALUE) : layoutParams.width == -1 ? MeasureSpec.makeMeasureSpec(paddingLeft - mode, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                makeMeasureSpec = layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(size2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                childAt.measure(mode, makeMeasureSpec);
                mode = childAt.getMeasuredWidth();
                makeMeasureSpec = childAt.getMeasuredHeight();
                if (i3 == Integer.MIN_VALUE && makeMeasureSpec > i7) {
                    i7 = Math.min(makeMeasureSpec, size2);
                }
                makeMeasureSpec = i6 - mode;
                boolean z3 = makeMeasureSpec < 0;
                layoutParams.f228b = z3;
                z3 |= z;
                if (layoutParams.f228b) {
                    this.f239h = childAt;
                }
                mode2 = makeMeasureSpec;
                f2 = f;
                z2 = z3;
                mode = i7;
            }
            i5++;
            z = z2;
            i7 = mode;
            i6 = mode2;
            f = f2;
        }
        if (z || f > 0.0f) {
            int i8 = paddingLeft - this.f237f;
            for (i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getVisibility() != 8) {
                    layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8) {
                        Object obj = (layoutParams.width != 0 || layoutParams.f227a <= 0.0f) ? null : 1;
                        makeMeasureSpec = obj != null ? 0 : childAt2.getMeasuredWidth();
                        if (!z || childAt2 == this.f239h) {
                            if (layoutParams.f227a > 0.0f) {
                                mode = layoutParams.width == 0 ? layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(size2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                if (z) {
                                    mode2 = paddingLeft - (layoutParams.rightMargin + layoutParams.leftMargin);
                                    i5 = MeasureSpec.makeMeasureSpec(mode2, 1073741824);
                                    if (makeMeasureSpec != mode2) {
                                        childAt2.measure(i5, mode);
                                    }
                                } else {
                                    childAt2.measure(MeasureSpec.makeMeasureSpec(((int) ((layoutParams.f227a * ((float) Math.max(0, i6))) / f)) + makeMeasureSpec, 1073741824), mode);
                                }
                            }
                        } else if (layoutParams.width < 0 && (makeMeasureSpec > i8 || layoutParams.f227a > 0.0f)) {
                            mode2 = obj != null ? layoutParams.height == -2 ? MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : layoutParams.height == -1 ? MeasureSpec.makeMeasureSpec(size2, 1073741824) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            childAt2.measure(MeasureSpec.makeMeasureSpec(i8, 1073741824), mode2);
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i4, (getPaddingTop() + i7) + getPaddingBottom());
        this.f238g = z;
        if (this.f248q.m630a() != 0 && !z) {
            this.f248q.m644f();
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        View view;
        if (savedState.f231a) {
            view = this.f239h;
            if (this.f250s || m545a(1.0f)) {
                this.f249r = true;
            }
        } else {
            view = this.f239h;
            m553d();
        }
        this.f249r = savedState.f231a;
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        boolean z = this.f238g ? !this.f238g || this.f240i == 1.0f : this.f249r;
        savedState.f231a = z;
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f250s = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f238g) {
            return super.onTouchEvent(motionEvent);
        }
        this.f248q.m640b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & 255) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f245n = x;
                this.f246o = y;
                break;
            case 1:
                if (m561b(this.f239h)) {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                    float f = x - this.f245n;
                    float f2 = y - this.f246o;
                    int d = this.f248q.m642d();
                    if ((f * f) + (f2 * f2) < ((float) (d * d))) {
                        aq aqVar = this.f248q;
                        if (aq.m626b(this.f239h, (int) x, (int) y)) {
                            View view = this.f239h;
                            m553d();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f238g) {
            this.f249r = view == this.f239h;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.f234c = i;
    }

    public void setPanelSlideListener(ab abVar) {
        this.f247p = abVar;
    }

    public void setParallaxDistance(int i) {
        this.f244m = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f235d = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f236e = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(getResources().getDrawable(i));
    }

    public void setSliderFadeColor(int i) {
        this.f233b = i;
    }
}
