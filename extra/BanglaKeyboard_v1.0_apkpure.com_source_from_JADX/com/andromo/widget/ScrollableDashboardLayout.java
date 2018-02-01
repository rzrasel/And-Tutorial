package com.andromo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class ScrollableDashboardLayout extends ViewGroup {
    private boolean f352a = true;
    private int f353b = 2;
    private Rect f354c = new Rect(m725a(14.0f), m725a(14.0f), m725a(14.0f), m725a(14.0f));
    private int f355d = 2;
    private int f356e = 6;
    private int f357f = 3;
    private int f358g = m725a(160.0f);
    private int f359h = 0;
    private int f360i = 0;
    private int f361j = m725a(6.0f);
    private int f362k = m725a(20.0f);
    private boolean f363l = false;

    public ScrollableDashboardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        m727a(context, attributeSet);
    }

    public ScrollableDashboardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m727a(context, attributeSet);
    }

    private int m725a(float f) {
        return Math.round(getContext().getResources().getDisplayMetrics().density * f);
    }

    private int m726a(int i, int i2, int i3) {
        int i4 = i > this.f357f ? this.f355d : 1;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = i4; i6 <= this.f356e; i6++) {
            int i7 = ((i - 1) / i6) + 1;
            int i8 = (i2 - (this.f359h * i6)) / (i6 + 1);
            int max = (Math.max(i3, (this.f360i * i7) + ((i7 - 1) * this.f362k)) - (this.f360i * i7)) / (i7 + 1);
            int abs = Math.abs(max - i8);
            if (i7 * i6 != i) {
                if (this.f352a) {
                    abs *= (i7 * i6) - i;
                }
                abs *= this.f353b;
            }
            if (abs < i5 && i8 >= 0 && max >= 0) {
                if (i7 == 1) {
                    return i6;
                }
                i4 = i6;
                i5 = abs;
            }
        }
        return i4;
    }

    private void m727a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0171b.ScrollableDashboardLayout);
        this.f355d = obtainStyledAttributes.getInt(0, this.f355d);
        this.f356e = obtainStyledAttributes.getInt(1, this.f356e);
        this.f357f = obtainStyledAttributes.getInt(2, this.f357f);
        this.f353b = obtainStyledAttributes.getInt(12, this.f353b);
        this.f354c = new Rect(obtainStyledAttributes.getDimensionPixelOffset(3, this.f354c.left), obtainStyledAttributes.getDimensionPixelOffset(4, this.f354c.top), obtainStyledAttributes.getDimensionPixelOffset(5, this.f354c.right), obtainStyledAttributes.getDimensionPixelOffset(6, this.f354c.bottom));
        this.f358g = obtainStyledAttributes.getDimensionPixelSize(7, this.f358g);
        this.f361j = obtainStyledAttributes.getDimensionPixelSize(8, this.f361j);
        this.f362k = obtainStyledAttributes.getDimensionPixelSize(9, this.f362k);
        this.f352a = obtainStyledAttributes.getBoolean(11, this.f352a);
        this.f363l = obtainStyledAttributes.getBoolean(10, this.f363l);
        obtainStyledAttributes.recycle();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = ((i3 - i) - this.f354c.left) - this.f354c.right;
        int i7 = ((i4 - i2) - this.f354c.top) - this.f354c.bottom;
        int childCount = getChildCount();
        int i8 = 0;
        for (i5 = 0; i5 < childCount; i5++) {
            if (getChildAt(i5).getVisibility() != 8) {
                i8++;
            }
        }
        if (i8 != 0) {
            int a = m726a(i8, i6, i7);
            int i9 = ((i8 - 1) / a) + 1;
            int i10 = (i7 - (this.f360i * i9)) / (i9 + 1);
            int max = Math.max(0, (i6 - (this.f359h * a)) / (a + 1));
            int max2 = Math.max(0, i10);
            Object obj = (!this.f363l || i9 <= 0 || i9 * a == i8) ? null : 1;
            if (obj != null) {
                i8 %= a;
                i8 = ((i6 - (this.f359h * i8)) - ((i8 + 1) * max)) / 2;
            } else {
                i8 = 0;
            }
            int i11 = (i6 - ((a + 1) * max)) / a;
            int i12 = (i7 - ((i9 + 1) * max2)) / i9;
            i10 = 0;
            i7 = 0;
            while (i7 < childCount) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8) {
                    int i13 = i10 / a;
                    i5 = i10 % a;
                    int i14;
                    int i15;
                    if (obj == null || i13 != i9 - 1) {
                        i14 = (i11 * i5) + (this.f354c.left + ((i5 + 1) * max));
                        i15 = (i12 * i13) + (this.f354c.top + ((i13 + 1) * max2));
                        i6 = (max == 0 && i5 == a - 1) ? i3 - this.f354c.right : i14 + i11;
                        i5 = (max2 == 0 && i13 == i9 - 1) ? i4 - this.f354c.top : i15 + i12;
                        childAt.layout(i14, i15, i6, i5);
                    } else {
                        i14 = ((this.f354c.left + ((i5 + 1) * max)) + (i11 * i5)) + i8;
                        i15 = (i12 * i13) + (this.f354c.top + ((i13 + 1) * max2));
                        i6 = (max == 0 && i5 == a - 1) ? (i3 - this.f354c.right) - i8 : i14 + i11;
                        i5 = (max2 == 0 && i13 == i9 - 1) ? i4 - this.f354c.top : i15 + i12;
                        childAt.layout(i14, i15, i6, i5);
                    }
                    i5 = i10 + 1;
                } else {
                    i5 = i10;
                }
                i7++;
                i10 = i5;
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        this.f359h = 0;
        this.f360i = 0;
        int size = (MeasureSpec.getSize(i) - this.f354c.left) - this.f354c.right;
        int max = Math.max(0, (MeasureSpec.getSize(i2) - this.f354c.top) - this.f354c.bottom);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(max, 0);
        int childCount = getChildCount();
        int i4 = 0;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                i4++;
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                this.f359h = Math.max(this.f359h, childAt.getMeasuredWidth());
                this.f360i = Math.max(this.f360i, childAt.getMeasuredHeight());
            }
        }
        if (i4 == 0) {
            setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
            return;
        }
        i3 = i4 > this.f357f ? this.f355d : 1;
        i3 = (size - ((i3 - 1) * this.f361j)) / i3;
        if (this.f358g > 0 && i3 > this.f358g) {
            i3 = this.f358g;
        }
        if (this.f359h > i3) {
            this.f359h = 0;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            for (i3 = 0; i3 < childCount; i3++) {
                childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                    this.f359h = Math.max(this.f359h, childAt.getMeasuredWidth());
                    this.f360i = Math.max(this.f360i, childAt.getMeasuredHeight());
                }
            }
            i3 = this.f359h;
        }
        i4 = ((i4 - 1) / m726a(i4, size, max)) + 1;
        i3 = Math.max(MeasureSpec.getSize(i2), ((((i4 - 1) * this.f362k) + (this.f360i * i4)) + this.f354c.top) + this.f354c.bottom);
        size = MeasureSpec.makeMeasureSpec(this.f359h, 1073741824);
        max = MeasureSpec.makeMeasureSpec(this.f360i, 1073741824);
        for (i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(size, max);
            }
        }
        setMeasuredDimension(resolveSize(this.f359h, i), resolveSize(i3, i2));
    }

    public void setAllowSingleColumnUpTo(int i) {
        this.f357f = i;
    }

    public void setCenterLastRow(boolean z) {
        this.f363l = z;
    }

    public void setMargins(Rect rect) {
        this.f354c = rect;
    }

    public void setMaxColumnWidth(int i) {
        this.f358g = i;
    }

    public void setMaxColumns(int i) {
        this.f356e = i;
    }

    public void setMinColumns(int i) {
        this.f355d = i;
    }

    public void setMinHorizontalGap(int i) {
        this.f361j = i;
    }

    public void setMinVerticalGap(int i) {
        this.f362k = i;
    }

    public void setPreferFullerLastRows(boolean z) {
        this.f352a = z;
    }

    public void setUnevenGridPenaltyMultiplier(int i) {
        this.f353b = i;
    }
}
