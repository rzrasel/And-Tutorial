package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0656d;
import android.support.v4.view.C0679r;
import android.support.v7.p021a.C0780a.C0775f;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    private static int resolveMinimumHeight(View view) {
        View view2 = view;
        while (true) {
            int k = C0679r.m1938k(view2);
            if (k <= 0) {
                if (!(view2 instanceof ViewGroup)) {
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) view2;
                if (viewGroup.getChildCount() != 1) {
                    break;
                }
                view2 = viewGroup.getChildAt(0);
            } else {
                return k;
            }
        }
        return 0;
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    private boolean tryOnMeasure(int i, int i2) {
        int id;
        int measuredHeight;
        int i3;
        int i4;
        int combineMeasuredStates;
        int i5;
        View view = null;
        View view2 = null;
        int childCount = getChildCount();
        int i6 = 0;
        View view3 = null;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                id = childAt.getId();
                if (id == C0775f.topPanel) {
                    View view4 = view2;
                    view2 = childAt;
                    childAt = view4;
                } else if (id == C0775f.buttonPanel) {
                    view2 = view;
                } else if (id != C0775f.contentPanel && id != C0775f.customPanel) {
                    return false;
                } else {
                    if (view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                    childAt = view2;
                    view2 = view;
                }
            } else {
                childAt = view2;
                view2 = view;
            }
            i6++;
            view = view2;
            view2 = childAt;
        }
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i);
        id = 0;
        i6 = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            i6 += view.getMeasuredHeight();
            id = View.combineMeasuredStates(0, view.getMeasuredState());
        }
        int i7 = 0;
        if (view2 != null) {
            view2.measure(i, 0);
            i7 = resolveMinimumHeight(view2);
            measuredHeight = view2.getMeasuredHeight() - i7;
            i6 += i7;
            id = View.combineMeasuredStates(id, view2.getMeasuredState());
            i3 = measuredHeight;
        } else {
            i3 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : MeasureSpec.makeMeasureSpec(Math.max(0, size - i6), mode));
            measuredHeight = view3.getMeasuredHeight();
            i6 += measuredHeight;
            id = View.combineMeasuredStates(id, view3.getMeasuredState());
            i4 = measuredHeight;
        } else {
            i4 = 0;
        }
        measuredHeight = size - i6;
        if (view2 != null) {
            i6 -= i7;
            i3 = Math.min(measuredHeight, i3);
            if (i3 > 0) {
                measuredHeight -= i3;
                i7 += i3;
            }
            view2.measure(i, MeasureSpec.makeMeasureSpec(i7, 1073741824));
            i7 = view2.getMeasuredHeight() + i6;
            combineMeasuredStates = View.combineMeasuredStates(id, view2.getMeasuredState());
            int i8 = measuredHeight;
            measuredHeight = i7;
            i7 = i8;
        } else {
            i7 = measuredHeight;
            combineMeasuredStates = id;
            measuredHeight = i6;
        }
        if (view3 == null || i7 <= 0) {
            i5 = measuredHeight;
            measuredHeight = combineMeasuredStates;
        } else {
            measuredHeight -= i4;
            view3.measure(i, MeasureSpec.makeMeasureSpec(i7 + i4, mode));
            i8 = measuredHeight + view3.getMeasuredHeight();
            measuredHeight = View.combineMeasuredStates(combineMeasuredStates, view3.getMeasuredState());
            i5 = i8;
        }
        combineMeasuredStates = 0;
        for (i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                combineMeasuredStates = Math.max(combineMeasuredStates, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(combineMeasuredStates + (getPaddingLeft() + getPaddingRight()), i, measuredHeight), View.resolveSizeAndState(i5, i2, 0));
        if (mode2 != 1073741824) {
            forceUniformWidth(childCount, i2);
        }
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        i5 = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i6 = gravity & 8388615;
        switch (gravity & 112) {
            case 16:
                i5 = (((i4 - i2) - i5) / 2) + getPaddingTop();
                break;
            case 80:
                i5 = ((getPaddingTop() + i4) - i2) - i5;
                break;
            default:
                i5 = getPaddingTop();
                break;
        }
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        int i7 = i5;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int i9;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
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
                i7 = layoutParams.topMargin + (hasDividerBeforeChildAt(i8) ? i7 + intrinsicHeight : i7);
                setChildFrame(childAt, i9, i7, measuredWidth, measuredHeight);
                i7 += layoutParams.bottomMargin + measuredHeight;
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        if (!tryOnMeasure(i, i2)) {
            super.onMeasure(i, i2);
        }
    }
}
