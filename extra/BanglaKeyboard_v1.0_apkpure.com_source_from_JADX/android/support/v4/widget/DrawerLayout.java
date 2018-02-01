package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.C0088n;
import android.support.v4.view.C0092r;
import android.support.v4.view.an;
import android.support.v4.view.bb;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

public class DrawerLayout extends ViewGroup {
    private static final int[] f202a = new int[]{16842931};
    private final C0110j f203b;
    private int f204c;
    private int f205d;
    private float f206e;
    private Paint f207f;
    private final aq f208g;
    private final aq f209h;
    private final C0112m f210i;
    private final C0112m f211j;
    private int f212k;
    private boolean f213l;
    private boolean f214m;
    private int f215n;
    private int f216o;
    private boolean f217p;
    private boolean f218q;
    private C0005k f219r;
    private float f220s;
    private float f221t;
    private Drawable f222u;
    private Drawable f223v;
    private CharSequence f224w;
    private CharSequence f225x;

    public class LayoutParams extends MarginLayoutParams {
        public int f195a = 0;
        float f196b;
        boolean f197c;
        boolean f198d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f202a);
            this.f195a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f195a = layoutParams.f195a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new C0111l();
        int f199a = 0;
        int f200b = 0;
        int f201c = 0;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f199a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f199a);
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f203b = new C0110j(this);
        this.f205d = -1728053248;
        this.f207f = new Paint();
        this.f214m = true;
        float f = getResources().getDisplayMetrics().density;
        this.f204c = (int) ((64.0f * f) + 0.5f);
        f *= 400.0f;
        this.f210i = new C0112m(this, 3);
        this.f211j = new C0112m(this, 5);
        this.f208g = aq.m617a((ViewGroup) this, 1.0f, this.f210i);
        this.f208g.m632a(1);
        this.f208g.m631a(f);
        this.f210i.f340b = this.f208g;
        this.f209h = aq.m617a((ViewGroup) this, 1.0f, this.f211j);
        this.f209h.m632a(2);
        this.f209h.m631a(f);
        this.f211j.f340b = this.f209h;
        setFocusableInTouchMode(true);
        an.m335b(this, 1);
        an.m330a((View) this, new C0109i(this));
        bb.m426a(this);
    }

    private void m518a(int i, int i2) {
        int a = C0088n.m471a(i2, an.m339f(this));
        if (a == 3) {
            this.f215n = i;
        } else if (a == 5) {
            this.f216o = i;
        }
        if (i != 0) {
            (a == 3 ? this.f208g : this.f209h).m643e();
        }
        View b;
        switch (i) {
            case 1:
                b = m535b(a);
                if (b != null) {
                    m541e(b);
                    return;
                }
                return;
            case 2:
                b = m535b(a);
                if (b != null) {
                    m527h(b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void m519a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m522d(childAt) && (!z || layoutParams.f197c)) {
                i = m534a(childAt, 3) ? i | this.f208g.m636a(childAt, -childAt.getWidth(), childAt.getTop()) : i | this.f209h.m636a(childAt, getWidth(), childAt.getTop());
                layoutParams.f197c = false;
            }
        }
        this.f210i.m652a();
        this.f211j.m652a();
        if (i != 0) {
            invalidate();
        }
    }

    static float m520b(View view) {
        return ((LayoutParams) view.getLayoutParams()).f196b;
    }

    private static String m521c(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    static boolean m522d(View view) {
        return (C0088n.m471a(((LayoutParams) view.getLayoutParams()).f195a, an.m339f(view)) & 7) != 0;
    }

    static /* synthetic */ boolean m523f(View view) {
        return (an.m337d(view) == 4 || an.m337d(view) == 2) ? false : true;
    }

    private View m525g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m522d(childAt) && m528i(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    private static boolean m526g(View view) {
        return ((LayoutParams) view.getLayoutParams()).f195a == 0;
    }

    private void m527h(View view) {
        if (m522d(view)) {
            if (this.f214m) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.f196b = 1.0f;
                layoutParams.f198d = true;
            } else if (m534a(view, 3)) {
                this.f208g.m636a(view, 0, view.getTop());
            } else {
                this.f209h.m636a(view, getWidth() - view.getWidth(), view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    private static boolean m528i(View view) {
        if (m522d(view)) {
            return ((LayoutParams) view.getLayoutParams()).f196b > 0.0f;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    public final int m529a(View view) {
        int c = m537c(view);
        return c == 3 ? this.f215n : c == 5 ? this.f216o : 0;
    }

    public final CharSequence m530a(int i) {
        int a = C0088n.m471a(i, an.m339f(this));
        return a == 3 ? this.f224w : a == 5 ? this.f225x : null;
    }

    public final void m531a() {
        View b = m535b(8388611);
        if (b == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m521c(8388611));
        }
        m527h(b);
    }

    final void m532a(int i, View view) {
        int a = this.f208g.m630a();
        int a2 = this.f209h.m630a();
        a = (a == 1 || a2 == 1) ? 1 : (a == 2 || a2 == 2) ? 2 : 0;
        if (view != null && i == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            View childAt;
            if (layoutParams.f196b == 0.0f) {
                layoutParams = (LayoutParams) view.getLayoutParams();
                if (layoutParams.f198d) {
                    layoutParams.f198d = false;
                    if (this.f219r != null) {
                        this.f219r.onDrawerClosed(view);
                    }
                    childAt = getChildAt(0);
                    if (childAt != null) {
                        an.m335b(childAt, 1);
                    }
                    an.m335b(view, 4);
                    if (hasWindowFocus()) {
                        childAt = getRootView();
                        if (childAt != null) {
                            childAt.sendAccessibilityEvent(32);
                        }
                    }
                }
            } else if (layoutParams.f196b == 1.0f) {
                layoutParams = (LayoutParams) view.getLayoutParams();
                if (!layoutParams.f198d) {
                    layoutParams.f198d = true;
                    if (this.f219r != null) {
                        this.f219r.onDrawerOpened(view);
                    }
                    childAt = getChildAt(0);
                    if (childAt != null) {
                        an.m335b(childAt, 4);
                    }
                    an.m335b(view, 1);
                    sendAccessibilityEvent(32);
                    view.requestFocus();
                }
            }
        }
        if (a != this.f212k) {
            this.f212k = a;
            if (this.f219r != null) {
                this.f219r.onDrawerStateChanged(a);
            }
        }
    }

    final void m533a(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f196b) {
            layoutParams.f196b = f;
            if (this.f219r != null) {
                this.f219r.onDrawerSlide(view, f);
            }
        }
    }

    final boolean m534a(View view, int i) {
        return (m537c(view) & i) == i;
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (i > 0 || (i < 0 && getChildCount() > 0)) {
            an.m335b(view, 4);
            an.m330a(view, this.f203b);
        } else {
            an.m335b(view, 1);
        }
        super.addView(view, i, layoutParams);
    }

    final View m535b(int i) {
        int a = C0088n.m471a(i, an.m339f(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m537c(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    public final void m536b() {
        View b = m535b(8388611);
        if (b == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m521c(8388611));
        }
        m541e(b);
    }

    final int m537c(View view) {
        return C0088n.m471a(((LayoutParams) view.getLayoutParams()).f195a, an.m339f(this));
    }

    public final boolean m538c() {
        View b = m535b(8388611);
        if (b == null) {
            return false;
        }
        if (m522d(b)) {
            return ((LayoutParams) b.getLayoutParams()).f198d;
        }
        throw new IllegalArgumentException("View " + b + " is not a drawer");
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f196b);
        }
        this.f206e = f;
        if ((this.f208g.m645g() | this.f209h.m645g()) != 0) {
            an.m336c(this);
        }
    }

    public final boolean m539d() {
        View b = m535b(8388611);
        return b != null ? m528i(b) : false;
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int right;
        int height = getHeight();
        boolean g = m526g(view);
        int i = 0;
        int width = getWidth();
        int save = canvas.save();
        if (g) {
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    Object obj = background != null ? background.getOpacity() == -1 ? 1 : null : null;
                    if (obj != null && m522d(childAt) && childAt.getHeight() >= height) {
                        if (m534a(childAt, 3)) {
                            right = childAt.getRight();
                            if (right <= i) {
                                right = i;
                            }
                            i = right;
                            right = width;
                        } else {
                            right = childAt.getLeft();
                            if (right < width) {
                            }
                        }
                        i2++;
                        width = right;
                    }
                }
                right = width;
                i2++;
                width = right;
            }
            canvas.clipRect(i, 0, width, getHeight());
        }
        right = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.f206e > 0.0f && g) {
            this.f207f.setColor((((int) (((float) ((this.f205d & -16777216) >>> 24)) * this.f206e)) << 24) | (this.f205d & 16777215));
            canvas.drawRect((float) i, 0.0f, (float) right, (float) getHeight(), this.f207f);
        } else if (this.f222u != null && m534a(view, 3)) {
            right = this.f222u.getIntrinsicWidth();
            i = view.getRight();
            r2 = Math.max(0.0f, Math.min(((float) i) / ((float) this.f208g.m637b()), 1.0f));
            this.f222u.setBounds(i, view.getTop(), right + i, view.getBottom());
            this.f222u.setAlpha((int) (255.0f * r2));
            this.f222u.draw(canvas);
        } else if (this.f223v != null && m534a(view, 5)) {
            right = this.f223v.getIntrinsicWidth();
            i = view.getLeft();
            r2 = Math.max(0.0f, Math.min(((float) (getWidth() - i)) / ((float) this.f209h.m637b()), 1.0f));
            this.f223v.setBounds(i - right, view.getTop(), i, view.getBottom());
            this.f223v.setAlpha((int) (255.0f * r2));
            this.f223v.draw(canvas);
        }
        return drawChild;
    }

    final void m540e() {
        int i = 0;
        if (!this.f218q) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            while (i < childCount) {
                getChildAt(i).dispatchTouchEvent(obtain);
                i++;
            }
            obtain.recycle();
            this.f218q = true;
        }
    }

    public final void m541e(View view) {
        if (m522d(view)) {
            if (this.f214m) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                layoutParams.f196b = 0.0f;
                layoutParams.f198d = false;
            } else if (m534a(view, 3)) {
                this.f208g.m636a(view, -view.getWidth(), view.getTop());
            } else {
                this.f209h.m636a(view, getWidth(), view.getTop());
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f214m = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f214m = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        r0 = android.support.v4.view.C0097w.m490a(r8);
        r3 = r7.f208g;
        r3 = r3.m635a(r8);
        r4 = r7.f209h;
        r4 = r4.m635a(r8);
        r3 = r3 | r4;
        switch(r0) {
            case 0: goto L_0x0039;
            case 1: goto L_0x0074;
            case 2: goto L_0x0060;
            case 3: goto L_0x0074;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r2;
    L_0x0017:
        if (r3 != 0) goto L_0x0037;
    L_0x0019:
        if (r0 != 0) goto L_0x0037;
    L_0x001b:
        r4 = r7.getChildCount();
        r3 = r2;
    L_0x0020:
        if (r3 >= r4) goto L_0x0080;
    L_0x0022:
        r0 = r7.getChildAt(r3);
        r0 = r0.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        r0 = r0.f197c;
        if (r0 == 0) goto L_0x007c;
    L_0x0030:
        r0 = r1;
    L_0x0031:
        if (r0 != 0) goto L_0x0037;
    L_0x0033:
        r0 = r7.f218q;
        if (r0 == 0) goto L_0x0038;
    L_0x0037:
        r2 = r1;
    L_0x0038:
        return r2;
    L_0x0039:
        r0 = r8.getX();
        r4 = r8.getY();
        r7.f220s = r0;
        r7.f221t = r4;
        r5 = r7.f206e;
        r6 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x0082;
    L_0x004c:
        r5 = r7.f208g;
        r0 = (int) r0;
        r4 = (int) r4;
        r0 = r5.m638b(r0, r4);
        r0 = m526g(r0);
        if (r0 == 0) goto L_0x0082;
    L_0x005a:
        r0 = r1;
    L_0x005b:
        r7.f217p = r2;
        r7.f218q = r2;
        goto L_0x0017;
    L_0x0060:
        r0 = r7.f208g;
        r0 = r0.m646h();
        if (r0 == 0) goto L_0x0016;
    L_0x0068:
        r0 = r7.f210i;
        r0.m652a();
        r0 = r7.f211j;
        r0.m652a();
        r0 = r2;
        goto L_0x0017;
    L_0x0074:
        r7.m519a(r1);
        r7.f217p = r2;
        r7.f218q = r2;
        goto L_0x0016;
    L_0x007c:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0020;
    L_0x0080:
        r0 = r2;
        goto L_0x0031;
    L_0x0082:
        r0 = r2;
        goto L_0x005b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (m525g() != null) {
                C0092r.m477c(keyEvent);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View g = m525g();
        if (g != null && m529a(g) == 0) {
            m519a(false);
        }
        return g != null;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f213l = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m526g(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int i7;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m534a(childAt, 3)) {
                        i7 = ((int) (((float) measuredWidth) * layoutParams.f196b)) + (-measuredWidth);
                        f = ((float) (measuredWidth + i7)) / ((float) measuredWidth);
                    } else {
                        i7 = i5 - ((int) (((float) measuredWidth) * layoutParams.f196b));
                        f = ((float) (i5 - i7)) / ((float) measuredWidth);
                    }
                    Object obj = f != layoutParams.f196b ? 1 : null;
                    int i8;
                    switch (layoutParams.f195a & 112) {
                        case 16:
                            int i9 = i4 - i2;
                            i8 = (i9 - measuredHeight) / 2;
                            if (i8 < layoutParams.topMargin) {
                                i8 = layoutParams.topMargin;
                            } else if (i8 + measuredHeight > i9 - layoutParams.bottomMargin) {
                                i8 = (i9 - layoutParams.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
                            break;
                        case 80:
                            i8 = i4 - i2;
                            childAt.layout(i7, (i8 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i8 - layoutParams.bottomMargin);
                            break;
                        default:
                            childAt.layout(i7, layoutParams.topMargin, measuredWidth + i7, measuredHeight + layoutParams.topMargin);
                            break;
                    }
                    if (obj != null) {
                        m533a(childAt, f);
                    }
                    int i10 = layoutParams.f196b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i10) {
                        childAt.setVisibility(i10);
                    }
                }
            }
        }
        this.f213l = false;
        this.f214m = false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r11, int r12) {
        /*
        r10 = this;
        r1 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.getMode(r11);
        r4 = android.view.View.MeasureSpec.getMode(r12);
        r2 = android.view.View.MeasureSpec.getSize(r11);
        r0 = android.view.View.MeasureSpec.getSize(r12);
        if (r3 != r9) goto L_0x001a;
    L_0x0018:
        if (r4 == r9) goto L_0x00e4;
    L_0x001a:
        r5 = r10.isInEditMode();
        if (r5 == 0) goto L_0x006a;
    L_0x0020:
        if (r3 == r6) goto L_0x0025;
    L_0x0022:
        if (r3 != 0) goto L_0x0025;
    L_0x0024:
        r2 = r1;
    L_0x0025:
        if (r4 == r6) goto L_0x00e4;
    L_0x0027:
        if (r4 != 0) goto L_0x00e4;
    L_0x0029:
        r10.setMeasuredDimension(r2, r1);
        r4 = r10.getChildCount();
        r0 = 0;
        r3 = r0;
    L_0x0032:
        if (r3 >= r4) goto L_0x00e3;
    L_0x0034:
        r5 = r10.getChildAt(r3);
        r0 = r5.getVisibility();
        r6 = 8;
        if (r0 == r6) goto L_0x0066;
    L_0x0040:
        r0 = r5.getLayoutParams();
        r0 = (android.support.v4.widget.DrawerLayout.LayoutParams) r0;
        r6 = m526g(r5);
        if (r6 == 0) goto L_0x0072;
    L_0x004c:
        r6 = r0.leftMargin;
        r6 = r2 - r6;
        r7 = r0.rightMargin;
        r6 = r6 - r7;
        r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9);
        r7 = r0.topMargin;
        r7 = r1 - r7;
        r0 = r0.bottomMargin;
        r0 = r7 - r0;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9);
        r5.measure(r6, r0);
    L_0x0066:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0032;
    L_0x006a:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "DrawerLayout must be measured with MeasureSpec.EXACTLY.";
        r0.<init>(r1);
        throw r0;
    L_0x0072:
        r6 = m522d(r5);
        if (r6 == 0) goto L_0x00be;
    L_0x0078:
        r6 = r10.m537c(r5);
        r6 = r6 & 7;
        r7 = r6 & 0;
        if (r7 == 0) goto L_0x00a1;
    L_0x0082:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Child drawer has absolute gravity ";
        r1.<init>(r2);
        r2 = m521c(r6);
        r1 = r1.append(r2);
        r2 = " but this DrawerLayout already has a drawer view along that edge";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00a1:
        r6 = r10.f204c;
        r7 = r0.leftMargin;
        r6 = r6 + r7;
        r7 = r0.rightMargin;
        r6 = r6 + r7;
        r7 = r0.width;
        r6 = getChildMeasureSpec(r11, r6, r7);
        r7 = r0.topMargin;
        r8 = r0.bottomMargin;
        r7 = r7 + r8;
        r0 = r0.height;
        r0 = getChildMeasureSpec(r12, r7, r0);
        r5.measure(r6, r0);
        goto L_0x0066;
    L_0x00be:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Child ";
        r1.<init>(r2);
        r1 = r1.append(r5);
        r2 = " at index ";
        r1 = r1.append(r2);
        r1 = r1.append(r3);
        r2 = " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00e3:
        return;
    L_0x00e4:
        r1 = r0;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onMeasure(int, int):void");
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f199a != 0) {
            View b = m535b(savedState.f199a);
            if (b != null) {
                m527h(b);
            }
        }
        m518a(savedState.f200b, 3);
        m518a(savedState.f201c, 5);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m522d(childAt)) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f198d) {
                    savedState.f199a = layoutParams.f195a;
                    break;
                }
            }
        }
        savedState.f200b = this.f215n;
        savedState.f201c = this.f216o;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f208g.m640b(motionEvent);
        this.f209h.m640b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & 255) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f220s = x;
                this.f221t = y;
                this.f217p = false;
                this.f218q = false;
                break;
            case 1:
                boolean z;
                x = motionEvent.getX();
                y = motionEvent.getY();
                View b = this.f208g.m638b((int) x, (int) y);
                if (b != null && m526g(b)) {
                    x -= this.f220s;
                    y -= this.f221t;
                    int d = this.f208g.m642d();
                    if ((x * x) + (y * y) < ((float) (d * d))) {
                        View view;
                        int childCount = getChildCount();
                        for (d = 0; d < childCount; d++) {
                            View childAt = getChildAt(d);
                            if (((LayoutParams) childAt.getLayoutParams()).f198d) {
                                view = childAt;
                                if (view != null) {
                                    z = m529a(view) != 2;
                                    m519a(z);
                                    this.f217p = false;
                                    break;
                                }
                            }
                        }
                        view = null;
                        if (view != null) {
                            if (m529a(view) != 2) {
                            }
                            m519a(z);
                            this.f217p = false;
                        }
                    }
                }
                z = true;
                m519a(z);
                this.f217p = false;
            case 3:
                m519a(true);
                this.f217p = false;
                this.f218q = false;
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f217p = z;
        if (z) {
            m519a(true);
        }
    }

    public void requestLayout() {
        if (!this.f213l) {
            super.requestLayout();
        }
    }

    public void setDrawerListener(C0005k c0005k) {
        this.f219r = c0005k;
    }

    public void setDrawerLockMode(int i) {
        m518a(i, 3);
        m518a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f205d = i;
        invalidate();
    }
}
