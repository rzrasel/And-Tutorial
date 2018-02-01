package android.support.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.percent.C0276b.C0275a;
import android.support.v4.view.C0660f;
import android.support.v4.view.C0679r;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

@Deprecated
public final class C0274a {
    private final ViewGroup f1110a;

    @Deprecated
    public interface C0271b {
        C0272a mo205a();
    }

    @Deprecated
    public static class C0272a {
        public float f1098a = -1.0f;
        public float f1099b = -1.0f;
        public float f1100c = -1.0f;
        public float f1101d = -1.0f;
        public float f1102e = -1.0f;
        public float f1103f = -1.0f;
        public float f1104g = -1.0f;
        public float f1105h = -1.0f;
        public float f1106i;
        final C0273c f1107j = new C0273c();

        public final void m733a(LayoutParams layoutParams) {
            if (!this.f1107j.f1109b) {
                layoutParams.width = this.f1107j.width;
            }
            if (!this.f1107j.f1108a) {
                layoutParams.height = this.f1107j.height;
            }
            this.f1107j.f1109b = false;
            this.f1107j.f1108a = false;
        }

        public final void m734a(LayoutParams layoutParams, int i, int i2) {
            boolean z = false;
            this.f1107j.width = layoutParams.width;
            this.f1107j.height = layoutParams.height;
            boolean z2 = (this.f1107j.f1109b || this.f1107j.width == 0) && this.f1098a < 0.0f;
            if ((this.f1107j.f1108a || this.f1107j.height == 0) && this.f1099b < 0.0f) {
                z = true;
            }
            if (this.f1098a >= 0.0f) {
                layoutParams.width = Math.round(((float) i) * this.f1098a);
            }
            if (this.f1099b >= 0.0f) {
                layoutParams.height = Math.round(((float) i2) * this.f1099b);
            }
            if (this.f1106i >= 0.0f) {
                if (z2) {
                    layoutParams.width = Math.round(((float) layoutParams.height) * this.f1106i);
                    this.f1107j.f1109b = true;
                }
                if (z) {
                    layoutParams.height = Math.round(((float) layoutParams.width) / this.f1106i);
                    this.f1107j.f1108a = true;
                }
            }
        }

        public final String toString() {
            return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", new Object[]{Float.valueOf(this.f1098a), Float.valueOf(this.f1099b), Float.valueOf(this.f1100c), Float.valueOf(this.f1101d), Float.valueOf(this.f1102e), Float.valueOf(this.f1103f), Float.valueOf(this.f1104g), Float.valueOf(this.f1105h)});
        }
    }

    static class C0273c extends MarginLayoutParams {
        private boolean f1108a;
        private boolean f1109b;

        public C0273c() {
            super(0, 0);
        }
    }

    public C0274a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("host must be non-null");
        }
        this.f1110a = viewGroup;
    }

    public static C0272a m739a(Context context, AttributeSet attributeSet) {
        C0272a c0272a = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0275a.PercentLayout_Layout);
        float fraction = obtainStyledAttributes.getFraction(C0275a.PercentLayout_Layout_layout_widthPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            c0272a = new C0272a();
            c0272a.f1098a = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(C0275a.PercentLayout_Layout_layout_heightPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (c0272a == null) {
                c0272a = new C0272a();
            }
            c0272a.f1099b = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(C0275a.PercentLayout_Layout_layout_marginPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (c0272a == null) {
                c0272a = new C0272a();
            }
            c0272a.f1100c = fraction;
            c0272a.f1101d = fraction;
            c0272a.f1102e = fraction;
            c0272a.f1103f = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(C0275a.PercentLayout_Layout_layout_marginLeftPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (c0272a == null) {
                c0272a = new C0272a();
            }
            c0272a.f1100c = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(C0275a.PercentLayout_Layout_layout_marginTopPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (c0272a == null) {
                c0272a = new C0272a();
            }
            c0272a.f1101d = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(C0275a.PercentLayout_Layout_layout_marginRightPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (c0272a == null) {
                c0272a = new C0272a();
            }
            c0272a.f1102e = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(C0275a.PercentLayout_Layout_layout_marginBottomPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (c0272a == null) {
                c0272a = new C0272a();
            }
            c0272a.f1103f = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(C0275a.PercentLayout_Layout_layout_marginStartPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (c0272a == null) {
                c0272a = new C0272a();
            }
            c0272a.f1104g = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(C0275a.PercentLayout_Layout_layout_marginEndPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (c0272a == null) {
                c0272a = new C0272a();
            }
            c0272a.f1105h = fraction;
        }
        fraction = obtainStyledAttributes.getFraction(C0275a.PercentLayout_Layout_layout_aspectRatio, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            if (c0272a == null) {
                c0272a = new C0272a();
            }
            c0272a.f1106i = fraction;
        }
        obtainStyledAttributes.recycle();
        return c0272a;
    }

    public static void m740a(LayoutParams layoutParams, TypedArray typedArray, int i, int i2) {
        layoutParams.width = typedArray.getLayoutDimension(i, 0);
        layoutParams.height = typedArray.getLayoutDimension(i2, 0);
    }

    public final void m741a() {
        int childCount = this.f1110a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = this.f1110a.getChildAt(i).getLayoutParams();
            if (layoutParams instanceof C0271b) {
                C0272a a = ((C0271b) layoutParams).mo205a();
                if (a != null) {
                    if (layoutParams instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        a.m733a(marginLayoutParams);
                        marginLayoutParams.leftMargin = a.f1107j.leftMargin;
                        marginLayoutParams.topMargin = a.f1107j.topMargin;
                        marginLayoutParams.rightMargin = a.f1107j.rightMargin;
                        marginLayoutParams.bottomMargin = a.f1107j.bottomMargin;
                        C0660f.m1750a(marginLayoutParams, C0660f.m1749a(a.f1107j));
                        C0660f.m1752b(marginLayoutParams, C0660f.m1751b(a.f1107j));
                    } else {
                        a.m733a(layoutParams);
                    }
                }
            }
        }
    }

    public final void m742a(int i, int i2) {
        int size = (MeasureSpec.getSize(i) - this.f1110a.getPaddingLeft()) - this.f1110a.getPaddingRight();
        int size2 = (MeasureSpec.getSize(i2) - this.f1110a.getPaddingTop()) - this.f1110a.getPaddingBottom();
        int childCount = this.f1110a.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f1110a.getChildAt(i3);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof C0271b) {
                C0272a a = ((C0271b) layoutParams).mo205a();
                if (a != null) {
                    if (layoutParams instanceof MarginLayoutParams) {
                        Object obj;
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        a.m734a(marginLayoutParams, size, size2);
                        a.f1107j.leftMargin = marginLayoutParams.leftMargin;
                        a.f1107j.topMargin = marginLayoutParams.topMargin;
                        a.f1107j.rightMargin = marginLayoutParams.rightMargin;
                        a.f1107j.bottomMargin = marginLayoutParams.bottomMargin;
                        C0660f.m1750a(a.f1107j, C0660f.m1749a(marginLayoutParams));
                        C0660f.m1752b(a.f1107j, C0660f.m1751b(marginLayoutParams));
                        if (a.f1100c >= 0.0f) {
                            marginLayoutParams.leftMargin = Math.round(((float) size) * a.f1100c);
                        }
                        if (a.f1101d >= 0.0f) {
                            marginLayoutParams.topMargin = Math.round(((float) size2) * a.f1101d);
                        }
                        if (a.f1102e >= 0.0f) {
                            marginLayoutParams.rightMargin = Math.round(((float) size) * a.f1102e);
                        }
                        if (a.f1103f >= 0.0f) {
                            marginLayoutParams.bottomMargin = Math.round(((float) size2) * a.f1103f);
                        }
                        if (a.f1104g >= 0.0f) {
                            C0660f.m1750a(marginLayoutParams, Math.round(((float) size) * a.f1104g));
                            obj = 1;
                        } else {
                            obj = null;
                        }
                        if (a.f1105h >= 0.0f) {
                            C0660f.m1752b(marginLayoutParams, Math.round(((float) size) * a.f1105h));
                            obj = 1;
                        }
                        if (!(obj == null || childAt == null)) {
                            int e = C0679r.m1932e(childAt);
                            if (VERSION.SDK_INT >= 17) {
                                marginLayoutParams.resolveLayoutDirection(e);
                            }
                        }
                    } else {
                        a.m734a(layoutParams, size, size2);
                    }
                }
            }
        }
    }

    public final boolean m743b() {
        int childCount = this.f1110a.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f1110a.getChildAt(i);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof C0271b) {
                C0272a a = ((C0271b) layoutParams).mo205a();
                if (a != null) {
                    boolean z2;
                    Object obj = ((childAt.getMeasuredWidthAndState() & -16777216) == 16777216 && a.f1098a >= 0.0f && a.f1107j.width == -2) ? 1 : null;
                    if (obj != null) {
                        layoutParams.width = -2;
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    Object obj2 = ((childAt.getMeasuredHeightAndState() & -16777216) == 16777216 && a.f1099b >= 0.0f && a.f1107j.height == -2) ? 1 : null;
                    if (obj2 != null) {
                        layoutParams.height = -2;
                        z = true;
                    } else {
                        z = z2;
                    }
                }
            }
        }
        return z;
    }
}
