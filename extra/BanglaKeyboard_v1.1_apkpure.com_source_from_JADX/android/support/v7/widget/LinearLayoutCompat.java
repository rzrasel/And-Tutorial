package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.C0656d;
import android.support.v4.view.C0679r;
import android.support.v7.p021a.C0780a.C0779j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public static class LayoutParams extends MarginLayoutParams {
        public int gravity;
        public float weight;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = -1;
            this.weight = 0.0f;
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2);
            this.gravity = -1;
            this.weight = f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0779j.LinearLayoutCompat_Layout);
            this.weight = obtainStyledAttributes.getFloat(C0779j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.gravity = obtainStyledAttributes.getInt(C0779j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
            this.weight = layoutParams.weight;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = -1;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0779j.LinearLayoutCompat, i, 0);
        int i2 = obtainStyledAttributes.getInt(C0779j.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        i2 = obtainStyledAttributes.getInt(C0779j.LinearLayoutCompat_android_gravity, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = obtainStyledAttributes.getBoolean(C0779j.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(C0779j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(C0779j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(C0779j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(C0779j.LinearLayoutCompat_divider));
        this.mShowDividers = obtainStyledAttributes.getInt(C0779j.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(C0779j.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    void drawDividersHorizontal(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i = 0;
        while (i < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, isLayoutRtl ? layoutParams.rightMargin + virtualChildAt.getRight() : (virtualChildAt.getLeft() - layoutParams.leftMargin) - this.mDividerWidth);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            int paddingLeft;
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                paddingLeft = isLayoutRtl ? getPaddingLeft() : (getWidth() - getPaddingRight()) - this.mDividerWidth;
            } else {
                layoutParams = (LayoutParams) virtualChildAt2.getLayoutParams();
                paddingLeft = isLayoutRtl ? (virtualChildAt2.getLeft() - layoutParams.leftMargin) - this.mDividerWidth : layoutParams.rightMargin + virtualChildAt2.getRight();
            }
            drawVerticalDivider(canvas, paddingLeft);
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        int i = 0;
        while (i < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LayoutParams) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            int height;
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                height = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt2.getLayoutParams();
                height = layoutParams.bottomMargin + virtualChildAt2.getBottom();
            }
            drawHorizontalDivider(canvas, height);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new LayoutParams(-2, -2) : this.mOrientation == 1 ? new LayoutParams(-1, -2) : null;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getBaseline() {
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.mBaselineAlignedChildIndex) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.mBaselineAlignedChildIndex);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i;
            int i2 = this.mBaselineChildTop;
            if (this.mOrientation == 1) {
                i = this.mGravity & 112;
                if (i != 48) {
                    switch (i) {
                        case 16:
                            i = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2);
                            break;
                        case 80:
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                            break;
                    }
                }
            }
            i = i2;
            return (((LayoutParams) childAt.getLayoutParams()).topMargin + i) + baseline;
        } else if (this.mBaselineAlignedChildIndex == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        } else {
            if (i == getChildCount()) {
                return (this.mShowDividers & 4) != 0;
            } else {
                if ((this.mShowDividers & 2) == 0) {
                    return false;
                }
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    if (getChildAt(i2).getVisibility() != 8) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    void layoutHorizontal(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i7 = i4 - i2;
        int paddingBottom = i7 - getPaddingBottom();
        int paddingBottom2 = (i7 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        i7 = this.mGravity & 8388615;
        int i8 = this.mGravity & 112;
        boolean z = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        switch (C0656d.m1743a(i7, C0679r.m1932e(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.mTotalLength) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.mTotalLength;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (isLayoutRtl) {
            i5 = -1;
            i6 = virtualChildCount - 1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i9 = 0;
        while (i9 < virtualChildCount) {
            int i10 = i6 + (i5 * i9);
            View virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i10);
                i7 = i9;
            } else if (virtualChildAt.getVisibility() != 8) {
                int i11;
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                i7 = (!z || layoutParams.height == -1) ? -1 : virtualChildAt.getBaseline();
                int i12 = layoutParams.gravity;
                if (i12 < 0) {
                    i12 = i8;
                }
                switch (i12 & 112) {
                    case 16:
                        i11 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        break;
                    case 48:
                        i11 = paddingTop + layoutParams.topMargin;
                        if (i7 != -1) {
                            i11 += iArr[1] - i7;
                            break;
                        }
                        break;
                    case 80:
                        i11 = (paddingBottom - measuredHeight) - layoutParams.bottomMargin;
                        if (i7 != -1) {
                            i11 -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - i7);
                            break;
                        }
                        break;
                    default:
                        i11 = paddingTop;
                        break;
                }
                paddingLeft = (hasDividerBeforeChildAt(i10) ? this.mDividerWidth + paddingLeft : paddingLeft) + layoutParams.leftMargin;
                setChildFrame(virtualChildAt, paddingLeft + getLocationOffset(virtualChildAt), i11, measuredWidth, measuredHeight);
                paddingLeft += (layoutParams.rightMargin + measuredWidth) + getNextLocationOffset(virtualChildAt);
                i7 = getChildrenSkipCount(virtualChildAt, i10) + i9;
            } else {
                i7 = i9;
            }
            i9 = i7 + 1;
        }
    }

    void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i6 = this.mGravity & 8388615;
        switch (this.mGravity & 112) {
            case 16:
                i5 = getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
                break;
            case 80:
                i5 = ((getPaddingTop() + i4) - i2) - this.mTotalLength;
                break;
            default:
                i5 = getPaddingTop();
                break;
        }
        int i7 = 0;
        int i8 = i5;
        while (i7 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i7);
            if (virtualChildAt == null) {
                i8 += measureNullChild(i7);
                i5 = i7;
            } else if (virtualChildAt.getVisibility() != 8) {
                int i9;
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                i5 = layoutParams.gravity;
                if (i5 < 0) {
                    i5 = i6;
                }
                switch (C0656d.m1743a(i5, C0679r.m1932e(this)) & 7) {
                    case 1:
                        i9 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                        break;
                    case 5:
                        i9 = (paddingRight - measuredWidth) - layoutParams.rightMargin;
                        break;
                    default:
                        i9 = paddingLeft + layoutParams.leftMargin;
                        break;
                }
                int i10 = (hasDividerBeforeChildAt(i7) ? this.mDividerHeight + i8 : i8) + layoutParams.topMargin;
                setChildFrame(virtualChildAt, i9, i10 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                i8 = i10 + ((layoutParams.bottomMargin + measuredHeight) + getNextLocationOffset(virtualChildAt));
                i5 = getChildrenSkipCount(virtualChildAt, i7) + i7;
            } else {
                i5 = i7;
            }
            i7 = i5 + 1;
        }
    }

    void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    void measureHorizontal(int i, int i2) {
        int i3;
        int i4;
        int measuredHeight;
        int i5;
        int i6;
        int i7;
        View virtualChildAt;
        LayoutParams layoutParams;
        this.mTotalLength = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        Object obj = 1;
        float f = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj2 = null;
        Object obj3 = null;
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z = this.mBaselineAligned;
        boolean z2 = this.mUseLargestChild;
        Object obj4 = mode == 1073741824 ? 1 : null;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        while (i13 < virtualChildCount) {
            View virtualChildAt2 = getVirtualChildAt(i13);
            if (virtualChildAt2 == null) {
                this.mTotalLength += measureNullChild(i13);
            } else {
                Object obj5;
                Object obj6;
                int i14;
                float f2;
                if (virtualChildAt2.getVisibility() != 8) {
                    if (hasDividerBeforeChildAt(i13)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                    float f3 = f + layoutParams2.weight;
                    if (mode == 1073741824 && layoutParams2.width == 0 && layoutParams2.weight > 0.0f) {
                        if (obj4 != null) {
                            this.mTotalLength += layoutParams2.leftMargin + layoutParams2.rightMargin;
                        } else {
                            i3 = this.mTotalLength;
                            this.mTotalLength = Math.max(i3, (layoutParams2.leftMargin + i3) + layoutParams2.rightMargin);
                        }
                        if (z) {
                            i3 = MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt2.measure(i3, i3);
                        } else {
                            obj3 = 1;
                        }
                    } else {
                        i3 = Integer.MIN_VALUE;
                        if (layoutParams2.width == 0 && layoutParams2.weight > 0.0f) {
                            i3 = 0;
                            layoutParams2.width = -2;
                        }
                        int i15 = i3;
                        measureChildBeforeLayout(virtualChildAt2, i13, i, f3 == 0.0f ? this.mTotalLength : 0, i2, 0);
                        if (i15 != Integer.MIN_VALUE) {
                            layoutParams2.width = i15;
                        }
                        i3 = virtualChildAt2.getMeasuredWidth();
                        if (obj4 != null) {
                            this.mTotalLength += ((layoutParams2.leftMargin + i3) + layoutParams2.rightMargin) + getNextLocationOffset(virtualChildAt2);
                        } else {
                            int i16 = this.mTotalLength;
                            this.mTotalLength = Math.max(i16, (((i16 + i3) + layoutParams2.leftMargin) + layoutParams2.rightMargin) + getNextLocationOffset(virtualChildAt2));
                        }
                        if (z2) {
                            i12 = Math.max(i3, i12);
                        }
                    }
                    Object obj7 = null;
                    if (mode2 == 1073741824 || layoutParams2.height != -1) {
                        obj5 = obj2;
                    } else {
                        obj5 = 1;
                        obj7 = 1;
                    }
                    i4 = layoutParams2.bottomMargin + layoutParams2.topMargin;
                    measuredHeight = virtualChildAt2.getMeasuredHeight() + i4;
                    int combineMeasuredStates = View.combineMeasuredStates(i9, virtualChildAt2.getMeasuredState());
                    if (z) {
                        i9 = virtualChildAt2.getBaseline();
                        if (i9 != -1) {
                            i5 = ((((layoutParams2.gravity < 0 ? this.mGravity : layoutParams2.gravity) & 112) >> 4) & -2) >> 1;
                            iArr[i5] = Math.max(iArr[i5], i9);
                            iArr2[i5] = Math.max(iArr2[i5], measuredHeight - i9);
                        }
                    }
                    i9 = Math.max(i8, measuredHeight);
                    Object obj8 = (obj == null || layoutParams2.height != -1) ? null : 1;
                    if (layoutParams2.weight > 0.0f) {
                        i3 = obj7 != null ? i4 : measuredHeight;
                        obj6 = obj8;
                        measuredHeight = Math.max(i11, i3);
                        i14 = i10;
                        f2 = f3;
                        i3 = i12;
                        i12 = combineMeasuredStates;
                        obj2 = obj5;
                        obj5 = obj3;
                        i6 = i9;
                    } else {
                        if (obj7 == null) {
                            i4 = measuredHeight;
                        }
                        i3 = Math.max(i10, i4);
                        obj6 = obj8;
                        measuredHeight = i11;
                        i14 = i3;
                        f2 = f3;
                        i3 = i12;
                        i12 = combineMeasuredStates;
                        obj2 = obj5;
                        obj5 = obj3;
                        i6 = i9;
                    }
                } else {
                    i3 = i12;
                    f2 = f;
                    obj6 = obj;
                    measuredHeight = i11;
                    i14 = i10;
                    obj5 = obj3;
                    i12 = i9;
                    i6 = i8;
                }
                i13 += getChildrenSkipCount(virtualChildAt2, i13);
                obj = obj6;
                i11 = measuredHeight;
                i10 = i14;
                i9 = i12;
                i8 = i6;
                i12 = i3;
                obj3 = obj5;
                f = f2;
            }
            i13++;
        }
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int max = (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i8 : Math.max(i8, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z2 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = 0;
            i7 = 0;
            while (i7 < virtualChildCount) {
                virtualChildAt = getVirtualChildAt(i7);
                if (virtualChildAt == null) {
                    this.mTotalLength += measureNullChild(i7);
                    i3 = i7;
                } else if (virtualChildAt.getVisibility() == 8) {
                    i3 = getChildrenSkipCount(virtualChildAt, i7) + i7;
                } else {
                    layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    if (obj4 != null) {
                        this.mTotalLength = ((layoutParams.rightMargin + (layoutParams.leftMargin + i12)) + getNextLocationOffset(virtualChildAt)) + this.mTotalLength;
                        i3 = i7;
                    } else {
                        i5 = this.mTotalLength;
                        this.mTotalLength = Math.max(i5, (layoutParams.rightMargin + ((i5 + i12) + layoutParams.leftMargin)) + getNextLocationOffset(virtualChildAt));
                        i3 = i7;
                    }
                }
                i7 = i3 + 1;
            }
        }
        this.mTotalLength += getPaddingLeft() + getPaddingRight();
        i8 = View.resolveSizeAndState(Math.max(this.mTotalLength, getSuggestedMinimumWidth()), i, 0);
        i5 = (16777215 & i8) - this.mTotalLength;
        View virtualChildAt3;
        if (obj3 != null || (i5 != 0 && f > 0.0f)) {
            if (this.mWeightSum > 0.0f) {
                f = this.mWeightSum;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            max = -1;
            this.mTotalLength = 0;
            float f4 = f;
            Object obj9 = obj;
            i12 = i10;
            i4 = i9;
            int i17 = 0;
            while (i17 < virtualChildCount) {
                float f5;
                Object obj10;
                virtualChildAt3 = getVirtualChildAt(i17);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    f5 = f4;
                    i7 = i5;
                    i16 = i12;
                    obj10 = obj9;
                    i5 = i4;
                    i4 = max;
                } else {
                    float f6;
                    layoutParams = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f7 = layoutParams.weight;
                    if (f7 > 0.0f) {
                        i7 = (int) ((((float) i5) * f7) / f4);
                        f7 = f4 - f7;
                        i5 -= i7;
                        i6 = getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + layoutParams.topMargin) + layoutParams.bottomMargin, layoutParams.height);
                        if (layoutParams.width != 0 || mode != 1073741824) {
                            i7 += virtualChildAt3.getMeasuredWidth();
                            if (i7 < 0) {
                                i7 = 0;
                            }
                            virtualChildAt = virtualChildAt3;
                        } else if (i7 > 0) {
                            virtualChildAt = virtualChildAt3;
                        } else {
                            i7 = 0;
                            virtualChildAt = virtualChildAt3;
                        }
                        virtualChildAt.measure(MeasureSpec.makeMeasureSpec(i7, 1073741824), i6);
                        i6 = View.combineMeasuredStates(i4, virtualChildAt3.getMeasuredState() & -16777216);
                        f6 = f7;
                        measuredHeight = i5;
                    } else {
                        measuredHeight = i5;
                        i6 = i4;
                        f6 = f4;
                    }
                    if (obj4 != null) {
                        this.mTotalLength += ((virtualChildAt3.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin) + getNextLocationOffset(virtualChildAt3);
                    } else {
                        i7 = this.mTotalLength;
                        this.mTotalLength = Math.max(i7, (((virtualChildAt3.getMeasuredWidth() + i7) + layoutParams.leftMargin) + layoutParams.rightMargin) + getNextLocationOffset(virtualChildAt3));
                    }
                    Object obj11 = (mode2 == 1073741824 || layoutParams.height != -1) ? null : 1;
                    i13 = layoutParams.topMargin + layoutParams.bottomMargin;
                    i5 = virtualChildAt3.getMeasuredHeight() + i13;
                    max = Math.max(max, i5);
                    i13 = Math.max(i12, obj11 != null ? i13 : i5);
                    obj11 = (obj9 == null || layoutParams.height != -1) ? null : 1;
                    if (z) {
                        i16 = virtualChildAt3.getBaseline();
                        if (i16 != -1) {
                            i3 = ((((layoutParams.gravity < 0 ? this.mGravity : layoutParams.gravity) & 112) >> 4) & -2) >> 1;
                            iArr[i3] = Math.max(iArr[i3], i16);
                            iArr2[i3] = Math.max(iArr2[i3], i5 - i16);
                        }
                    }
                    f5 = f6;
                    i16 = i13;
                    i5 = i6;
                    obj10 = obj11;
                    i4 = max;
                    i7 = measuredHeight;
                }
                i17++;
                obj9 = obj10;
                i12 = i16;
                max = i4;
                i4 = i5;
                f4 = f5;
                i5 = i7;
            }
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                max = Math.max(max, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            obj = obj9;
            i3 = i12;
            i9 = i4;
            i7 = max;
        } else {
            i7 = Math.max(i10, i11);
            if (z2 && mode != 1073741824) {
                for (i13 = 0; i13 < virtualChildCount; i13++) {
                    virtualChildAt3 = getVirtualChildAt(i13);
                    if (!(virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8 || ((LayoutParams) virtualChildAt3.getLayoutParams()).weight <= 0.0f)) {
                        virtualChildAt3.measure(MeasureSpec.makeMeasureSpec(i12, 1073741824), MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = i7;
            i7 = max;
        }
        if (obj != null || mode2 == 1073741824) {
            i3 = i7;
        }
        setMeasuredDimension((-16777216 & i9) | i8, View.resolveSizeAndState(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i9 << 16));
        if (obj2 != null) {
            forceUniformHeight(virtualChildCount, i);
        }
    }

    int measureNullChild(int i) {
        return 0;
    }

    void measureVertical(int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        int i7;
        View virtualChildAt;
        this.mTotalLength = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        Object obj2 = 1;
        float f = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj3 = null;
        Object obj4 = null;
        int i12 = this.mBaselineAlignedChildIndex;
        boolean z = this.mUseLargestChild;
        int i13 = Integer.MIN_VALUE;
        int i14 = 0;
        while (i14 < virtualChildCount) {
            int i15;
            int measuredWidth;
            View virtualChildAt2 = getVirtualChildAt(i14);
            if (virtualChildAt2 == null) {
                this.mTotalLength += measureNullChild(i14);
            } else {
                Object obj5;
                float f2;
                if (virtualChildAt2.getVisibility() != 8) {
                    if (hasDividerBeforeChildAt(i14)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt2.getLayoutParams();
                    float f3 = f + layoutParams.weight;
                    if (mode2 == 1073741824 && layoutParams.height == 0 && layoutParams.weight > 0.0f) {
                        i3 = this.mTotalLength;
                        this.mTotalLength = Math.max(i3, (layoutParams.topMargin + i3) + layoutParams.bottomMargin);
                        obj4 = 1;
                    } else {
                        i3 = Integer.MIN_VALUE;
                        if (layoutParams.height == 0 && layoutParams.weight > 0.0f) {
                            i3 = 0;
                            layoutParams.height = -2;
                        }
                        i4 = i3;
                        measureChildBeforeLayout(virtualChildAt2, i14, i, 0, i2, f3 == 0.0f ? this.mTotalLength : 0);
                        if (i4 != Integer.MIN_VALUE) {
                            layoutParams.height = i4;
                        }
                        i3 = virtualChildAt2.getMeasuredHeight();
                        int i16 = this.mTotalLength;
                        this.mTotalLength = Math.max(i16, (((i16 + i3) + layoutParams.topMargin) + layoutParams.bottomMargin) + getNextLocationOffset(virtualChildAt2));
                        if (z) {
                            i13 = Math.max(i3, i13);
                        }
                    }
                    if (i12 >= 0 && i12 == i14 + 1) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (i14 >= i12 || layoutParams.weight <= 0.0f) {
                        Object obj6 = null;
                        if (mode == 1073741824 || layoutParams.width != -1) {
                            obj5 = obj3;
                        } else {
                            obj5 = 1;
                            obj6 = 1;
                        }
                        i15 = layoutParams.rightMargin + layoutParams.leftMargin;
                        measuredWidth = virtualChildAt2.getMeasuredWidth() + i15;
                        i8 = Math.max(i8, measuredWidth);
                        int combineMeasuredStates = View.combineMeasuredStates(i9, virtualChildAt2.getMeasuredState());
                        Object obj7 = (obj2 == null || layoutParams.width != -1) ? null : 1;
                        if (layoutParams.weight > 0.0f) {
                            i3 = obj6 != null ? i15 : measuredWidth;
                            obj = obj7;
                            measuredWidth = Math.max(i11, i3);
                            i5 = i10;
                            f2 = f3;
                            i3 = i13;
                            i13 = combineMeasuredStates;
                            obj3 = obj5;
                            obj5 = obj4;
                            i6 = i8;
                        } else {
                            if (obj6 == null) {
                                i15 = measuredWidth;
                            }
                            i3 = Math.max(i10, i15);
                            obj = obj7;
                            measuredWidth = i11;
                            i5 = i3;
                            f2 = f3;
                            i3 = i13;
                            i13 = combineMeasuredStates;
                            obj3 = obj5;
                            obj5 = obj4;
                            i6 = i8;
                        }
                    } else {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                }
                i3 = i13;
                f2 = f;
                obj = obj2;
                measuredWidth = i11;
                i5 = i10;
                obj5 = obj4;
                i13 = i9;
                i6 = i8;
                i14 += getChildrenSkipCount(virtualChildAt2, i14);
                obj2 = obj;
                i11 = measuredWidth;
                i10 = i5;
                i9 = i13;
                i8 = i6;
                i13 = i3;
                obj4 = obj5;
                f = f2;
            }
            i14++;
        }
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerHeight;
        }
        if (z && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.mTotalLength = 0;
            i7 = 0;
            while (i7 < virtualChildCount) {
                virtualChildAt = getVirtualChildAt(i7);
                if (virtualChildAt == null) {
                    this.mTotalLength += measureNullChild(i7);
                    i3 = i7;
                } else if (virtualChildAt.getVisibility() == 8) {
                    i3 = getChildrenSkipCount(virtualChildAt, i7) + i7;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i17 = this.mTotalLength;
                    this.mTotalLength = Math.max(i17, (layoutParams2.bottomMargin + ((i17 + i13) + layoutParams2.topMargin)) + getNextLocationOffset(virtualChildAt));
                    i3 = i7;
                }
                i7 = i3 + 1;
            }
        }
        this.mTotalLength += getPaddingTop() + getPaddingBottom();
        i4 = View.resolveSizeAndState(Math.max(this.mTotalLength, getSuggestedMinimumHeight()), i2, 0);
        i14 = (16777215 & i4) - this.mTotalLength;
        if (obj4 != null || (i14 != 0 && f > 0.0f)) {
            if (this.mWeightSum > 0.0f) {
                f = this.mWeightSum;
            }
            this.mTotalLength = 0;
            Object obj8 = obj2;
            i6 = i10;
            i5 = i9;
            int i18 = i8;
            int i19 = 0;
            int i20 = i14;
            float f4 = f;
            i16 = i20;
            while (i19 < virtualChildCount) {
                float f5;
                View virtualChildAt3 = getVirtualChildAt(i19);
                if (virtualChildAt3.getVisibility() != 8) {
                    layoutParams2 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f6 = layoutParams2.weight;
                    if (f6 > 0.0f) {
                        View view;
                        i7 = (int) ((((float) i16) * f6) / f4);
                        f6 = f4 - f6;
                        measuredWidth = i16 - i7;
                        i14 = getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + layoutParams2.leftMargin) + layoutParams2.rightMargin, layoutParams2.width);
                        if (layoutParams2.height != 0 || mode2 != 1073741824) {
                            i7 += virtualChildAt3.getMeasuredHeight();
                            if (i7 < 0) {
                                i7 = 0;
                            }
                            view = virtualChildAt3;
                        } else if (i7 > 0) {
                            view = virtualChildAt3;
                        } else {
                            i7 = 0;
                            view = virtualChildAt3;
                        }
                        view.measure(i14, MeasureSpec.makeMeasureSpec(i7, 1073741824));
                        i14 = measuredWidth;
                        i16 = View.combineMeasuredStates(i5, virtualChildAt3.getMeasuredState() & -256);
                        f5 = f6;
                    } else {
                        f5 = f4;
                        i14 = i16;
                        i16 = i5;
                    }
                    i15 = layoutParams2.leftMargin + layoutParams2.rightMargin;
                    measuredWidth = virtualChildAt3.getMeasuredWidth() + i15;
                    i5 = Math.max(i18, measuredWidth);
                    Object obj9 = (mode == 1073741824 || layoutParams2.width != -1) ? null : 1;
                    if (obj9 == null) {
                        i15 = measuredWidth;
                    }
                    measuredWidth = Math.max(i6, i15);
                    obj = (obj8 == null || layoutParams2.width != -1) ? null : 1;
                    i13 = this.mTotalLength;
                    this.mTotalLength = Math.max(i13, (layoutParams2.bottomMargin + ((virtualChildAt3.getMeasuredHeight() + i13) + layoutParams2.topMargin)) + getNextLocationOffset(virtualChildAt3));
                    i3 = measuredWidth;
                    i17 = i5;
                } else {
                    f5 = f4;
                    obj = obj8;
                    i3 = i6;
                    i17 = i18;
                    i14 = i16;
                    i16 = i5;
                }
                i19++;
                obj8 = obj;
                i6 = i3;
                i5 = i16;
                i18 = i17;
                i16 = i14;
                f4 = f5;
            }
            this.mTotalLength += getPaddingTop() + getPaddingBottom();
            obj2 = obj8;
            i3 = i6;
            i9 = i5;
            i7 = i18;
        } else {
            i6 = Math.max(i10, i11);
            if (z && mode2 != 1073741824) {
                for (i7 = 0; i7 < virtualChildCount; i7++) {
                    virtualChildAt = getVirtualChildAt(i7);
                    if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || ((LayoutParams) virtualChildAt.getLayoutParams()).weight <= 0.0f)) {
                        virtualChildAt.measure(MeasureSpec.makeMeasureSpec(virtualChildAt.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i13, 1073741824));
                    }
                }
            }
            i3 = i6;
            i7 = i8;
        }
        if (obj2 != null || mode == 1073741824) {
            i3 = i7;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i9), i4);
        if (obj3 != null) {
            forceUniformWidth(virtualChildCount, i2);
        }
    }

    protected void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.mBaselineAlignedChildIndex = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.mGravity = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((this.mGravity & 8388615) != i2) {
            this.mGravity = i2 | (this.mGravity & -8388616);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.mGravity & 112) != i2) {
            this.mGravity = i2 | (this.mGravity & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
