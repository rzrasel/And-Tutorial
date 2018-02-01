package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager.C0196d;
import android.support.v4.view.ViewPager.C0204e;
import android.support.v4.view.ViewPager.C0600a;
import android.support.v4.widget.C0765l;
import android.text.TextUtils.TruncateAt;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

@C0600a
public class PagerTitleStrip extends ViewGroup {
    private static final int[] f1775n = new int[]{16842804, 16842901, 16842904, 16842927};
    private static final int[] f1776o = new int[]{16843660};
    ViewPager f1777a;
    TextView f1778b;
    TextView f1779c;
    TextView f1780d;
    float f1781e = -1.0f;
    int f1782f;
    private int f1783g = -1;
    private int f1784h;
    private int f1785i;
    private boolean f1786j;
    private boolean f1787k;
    private final C0593a f1788l = new C0593a(this);
    private WeakReference<C0404o> f1789m;
    private int f1790p;

    private class C0593a extends DataSetObserver implements C0196d, C0204e {
        final /* synthetic */ PagerTitleStrip f1807a;
        private int f1808b;

        C0593a(PagerTitleStrip pagerTitleStrip) {
            this.f1807a = pagerTitleStrip;
        }

        public final void mo168a(int i) {
            this.f1808b = i;
        }

        public final void mo169a(int i, float f) {
            if (f > 0.5f) {
                i++;
            }
            this.f1807a.mo581a(i, f, false);
        }

        public final void mo167a(ViewPager viewPager, C0404o c0404o, C0404o c0404o2) {
            this.f1807a.m1565a(c0404o, c0404o2);
        }

        public final void mo170b(int i) {
            float f = 0.0f;
            if (this.f1808b == 0) {
                this.f1807a.m1564a(this.f1807a.f1777a.getCurrentItem(), this.f1807a.f1777a.getAdapter());
                if (this.f1807a.f1781e >= 0.0f) {
                    f = this.f1807a.f1781e;
                }
                this.f1807a.mo581a(this.f1807a.f1777a.getCurrentItem(), f, true);
            }
        }

        public final void onChanged() {
            float f = 0.0f;
            this.f1807a.m1564a(this.f1807a.f1777a.getCurrentItem(), this.f1807a.f1777a.getAdapter());
            if (this.f1807a.f1781e >= 0.0f) {
                f = this.f1807a.f1781e;
            }
            this.f1807a.mo581a(this.f1807a.f1777a.getCurrentItem(), f, true);
        }
    }

    private static class C0594b extends SingleLineTransformationMethod {
        private Locale f1809a;

        C0594b(Context context) {
            this.f1809a = context.getResources().getConfiguration().locale;
        }

        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            return transformation != null ? transformation.toString().toUpperCase(this.f1809a) : null;
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        boolean z = false;
        super(context, attributeSet);
        View textView = new TextView(context);
        this.f1778b = textView;
        addView(textView);
        textView = new TextView(context);
        this.f1779c = textView;
        addView(textView);
        textView = new TextView(context);
        this.f1780d = textView;
        addView(textView);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1775n);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C0765l.m2190a(this.f1778b, resourceId);
            C0765l.m2190a(this.f1779c, resourceId);
            C0765l.m2190a(this.f1780d, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f = (float) dimensionPixelSize;
            this.f1778b.setTextSize(0, f);
            this.f1779c.setTextSize(0, f);
            this.f1780d.setTextSize(0, f);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            dimensionPixelSize = obtainStyledAttributes.getColor(2, 0);
            this.f1778b.setTextColor(dimensionPixelSize);
            this.f1779c.setTextColor(dimensionPixelSize);
            this.f1780d.setTextColor(dimensionPixelSize);
        }
        this.f1785i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f1782f = this.f1779c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f1778b.setEllipsize(TruncateAt.END);
        this.f1779c.setEllipsize(TruncateAt.END);
        this.f1780d.setEllipsize(TruncateAt.END);
        if (resourceId != 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(resourceId, f1776o);
            z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f1778b);
            setSingleLineAllCaps(this.f1779c);
            setSingleLineAllCaps(this.f1780d);
        } else {
            this.f1778b.setSingleLine();
            this.f1779c.setSingleLine();
            this.f1780d.setSingleLine();
        }
        this.f1784h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C0594b(textView.getContext()));
    }

    void mo581a(int i, float f, boolean z) {
        if (i != this.f1783g) {
            m1564a(i, this.f1777a.getAdapter());
        } else if (!z && f == this.f1781e) {
            return;
        }
        this.f1787k = true;
        int measuredWidth = this.f1778b.getMeasuredWidth();
        int measuredWidth2 = this.f1779c.getMeasuredWidth();
        int measuredWidth3 = this.f1780d.getMeasuredWidth();
        int i2 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i3 = paddingRight + i2;
        int i4 = (width - (paddingLeft + i2)) - i3;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        i3 = ((width - i3) - ((int) (f2 * ((float) i4)))) - i2;
        i4 = i3 + measuredWidth2;
        int baseline = this.f1778b.getBaseline();
        measuredWidth2 = this.f1779c.getBaseline();
        i2 = this.f1780d.getBaseline();
        int max = Math.max(Math.max(baseline, measuredWidth2), i2);
        baseline = max - baseline;
        measuredWidth2 = max - measuredWidth2;
        max -= i2;
        int measuredHeight = this.f1780d.getMeasuredHeight() + max;
        i2 = Math.max(Math.max(this.f1778b.getMeasuredHeight() + baseline, this.f1779c.getMeasuredHeight() + measuredWidth2), measuredHeight);
        switch (this.f1785i & 112) {
            case 16:
                height = (((height - paddingTop) - paddingBottom) - i2) / 2;
                i2 = height + baseline;
                measuredWidth2 += height;
                baseline = height + max;
                break;
            case 80:
                height = (height - paddingBottom) - i2;
                i2 = height + baseline;
                measuredWidth2 += height;
                baseline = height + max;
                break;
            default:
                i2 = paddingTop + baseline;
                measuredWidth2 += paddingTop;
                baseline = paddingTop + max;
                break;
        }
        this.f1779c.layout(i3, measuredWidth2, i4, this.f1779c.getMeasuredHeight() + measuredWidth2);
        measuredWidth2 = Math.min(paddingLeft, (i3 - this.f1784h) - measuredWidth);
        this.f1778b.layout(measuredWidth2, i2, measuredWidth + measuredWidth2, this.f1778b.getMeasuredHeight() + i2);
        measuredWidth2 = Math.max((width - paddingRight) - measuredWidth3, this.f1784h + i4);
        this.f1780d.layout(measuredWidth2, baseline, measuredWidth2 + measuredWidth3, this.f1780d.getMeasuredHeight() + baseline);
        this.f1781e = f;
        this.f1787k = false;
    }

    final void m1564a(int i, C0404o c0404o) {
        CharSequence charSequence = null;
        int count = c0404o != null ? c0404o.getCount() : 0;
        this.f1786j = true;
        CharSequence pageTitle = (i <= 0 || c0404o == null) ? null : c0404o.getPageTitle(i - 1);
        this.f1778b.setText(pageTitle);
        TextView textView = this.f1779c;
        pageTitle = (c0404o == null || i >= count) ? null : c0404o.getPageTitle(i);
        textView.setText(pageTitle);
        if (i + 1 < count && c0404o != null) {
            charSequence = c0404o.getPageTitle(i + 1);
        }
        this.f1780d.setText(charSequence);
        count = MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f1778b.measure(count, makeMeasureSpec);
        this.f1779c.measure(count, makeMeasureSpec);
        this.f1780d.measure(count, makeMeasureSpec);
        this.f1783g = i;
        if (!this.f1787k) {
            mo581a(i, this.f1781e, false);
        }
        this.f1786j = false;
    }

    final void m1565a(C0404o c0404o, C0404o c0404o2) {
        if (c0404o != null) {
            c0404o.unregisterDataSetObserver(this.f1788l);
            this.f1789m = null;
        }
        if (c0404o2 != null) {
            c0404o2.registerDataSetObserver(this.f1788l);
            this.f1789m = new WeakReference(c0404o2);
        }
        if (this.f1777a != null) {
            this.f1783g = -1;
            this.f1781e = -1.0f;
            m1564a(this.f1777a.getCurrentItem(), c0404o2);
            requestLayout();
        }
    }

    int getMinHeight() {
        Drawable background = getBackground();
        return background != null ? background.getIntrinsicHeight() : 0;
    }

    public int getTextSpacing() {
        return this.f1784h;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            C0404o adapter = viewPager.getAdapter();
            viewPager.m1598a(this.f1788l);
            viewPager.m1600a(this.f1788l);
            this.f1777a = viewPager;
            m1565a(this.f1789m != null ? (C0404o) this.f1789m.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1777a != null) {
            m1565a(this.f1777a.getAdapter(), null);
            this.f1777a.m1598a(null);
            this.f1777a.m1602b(this.f1788l);
            this.f1777a = null;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 0.0f;
        if (this.f1777a != null) {
            if (this.f1781e >= 0.0f) {
                f = this.f1781e;
            }
            mo581a(this.f1783g, f, true);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int size = MeasureSpec.getSize(i);
        int childMeasureSpec2 = getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
        this.f1778b.measure(childMeasureSpec2, childMeasureSpec);
        this.f1779c.measure(childMeasureSpec2, childMeasureSpec);
        this.f1780d.measure(childMeasureSpec2, childMeasureSpec);
        if (MeasureSpec.getMode(i2) == 1073741824) {
            paddingTop = MeasureSpec.getSize(i2);
        } else {
            paddingTop = Math.max(getMinHeight(), paddingTop + this.f1779c.getMeasuredHeight());
        }
        setMeasuredDimension(size, View.resolveSizeAndState(paddingTop, i2, this.f1779c.getMeasuredState() << 16));
    }

    public void requestLayout() {
        if (!this.f1786j) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f1785i = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        this.f1790p = ((int) (255.0f * f)) & 255;
        int i = (this.f1790p << 24) | (this.f1782f & 16777215);
        this.f1778b.setTextColor(i);
        this.f1780d.setTextColor(i);
    }

    public void setTextColor(int i) {
        this.f1782f = i;
        this.f1779c.setTextColor(i);
        int i2 = (this.f1790p << 24) | (this.f1782f & 16777215);
        this.f1778b.setTextColor(i2);
        this.f1780d.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f1784h = i;
        requestLayout();
    }
}
