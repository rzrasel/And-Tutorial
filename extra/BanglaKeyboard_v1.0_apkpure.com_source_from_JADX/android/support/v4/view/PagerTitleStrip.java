package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class PagerTitleStrip extends ViewGroup implements bk {
    private static final int[] f55n = new int[]{16842804, 16842901, 16842904, 16842927};
    private static final int[] f56o = new int[]{16843660};
    private static final ae f57q;
    ViewPager f58a;
    TextView f59b;
    TextView f60c;
    TextView f61d;
    int f62e;
    private int f63f = -1;
    private float f64g = -1.0f;
    private int f65h;
    private int f66i;
    private boolean f67j;
    private boolean f68k;
    private final ad f69l = new ad();
    private WeakReference f70m;
    private int f71p;

    static {
        if (VERSION.SDK_INT >= 14) {
            f57q = new ag();
        } else {
            f57q = new af();
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        boolean z = false;
        super(context, attributeSet);
        View textView = new TextView(context);
        this.f59b = textView;
        addView(textView);
        textView = new TextView(context);
        this.f60c = textView;
        addView(textView);
        textView = new TextView(context);
        this.f61d = textView;
        addView(textView);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f55n);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f59b.setTextAppearance(context, resourceId);
            this.f60c.setTextAppearance(context, resourceId);
            this.f61d.setTextAppearance(context, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f = (float) dimensionPixelSize;
            this.f59b.setTextSize(0, f);
            this.f60c.setTextSize(0, f);
            this.f61d.setTextSize(0, f);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            dimensionPixelSize = obtainStyledAttributes.getColor(2, 0);
            this.f59b.setTextColor(dimensionPixelSize);
            this.f60c.setTextColor(dimensionPixelSize);
            this.f61d.setTextColor(dimensionPixelSize);
        }
        this.f66i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f62e = this.f60c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f59b.setEllipsize(TruncateAt.END);
        this.f60c.setEllipsize(TruncateAt.END);
        this.f61d.setEllipsize(TruncateAt.END);
        if (resourceId != 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(resourceId, f56o);
            z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f59b);
            setSingleLineAllCaps(this.f60c);
            setSingleLineAllCaps(this.f61d);
        } else {
            this.f59b.setSingleLine();
            this.f60c.setSingleLine();
            this.f61d.setSingleLine();
        }
        this.f65h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        f57q.mo207a(textView);
    }

    void mo145a(int i, float f, boolean z) {
        if (i != this.f63f) {
            m59a(i, this.f58a.getAdapter());
        } else if (!z && f == this.f64g) {
            return;
        }
        this.f68k = true;
        int measuredWidth = this.f59b.getMeasuredWidth();
        int measuredWidth2 = this.f60c.getMeasuredWidth();
        int measuredWidth3 = this.f61d.getMeasuredWidth();
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
        int baseline = this.f59b.getBaseline();
        measuredWidth2 = this.f60c.getBaseline();
        i2 = this.f61d.getBaseline();
        int max = Math.max(Math.max(baseline, measuredWidth2), i2);
        baseline = max - baseline;
        measuredWidth2 = max - measuredWidth2;
        max -= i2;
        int measuredHeight = this.f61d.getMeasuredHeight() + max;
        i2 = Math.max(Math.max(this.f59b.getMeasuredHeight() + baseline, this.f60c.getMeasuredHeight() + measuredWidth2), measuredHeight);
        switch (this.f66i & 112) {
            case 16:
                height = (((height - paddingTop) - paddingBottom) - i2) / 2;
                i2 = height + baseline;
                baseline = height + measuredWidth2;
                measuredWidth2 = height + max;
                break;
            case 80:
                height = (height - paddingBottom) - i2;
                i2 = height + baseline;
                baseline = height + measuredWidth2;
                measuredWidth2 = height + max;
                break;
            default:
                i2 = paddingTop + baseline;
                baseline = paddingTop + measuredWidth2;
                measuredWidth2 = paddingTop + max;
                break;
        }
        this.f60c.layout(i3, baseline, i4, this.f60c.getMeasuredHeight() + baseline);
        baseline = Math.min(paddingLeft, (i3 - this.f65h) - measuredWidth);
        this.f59b.layout(baseline, i2, measuredWidth + baseline, this.f59b.getMeasuredHeight() + i2);
        baseline = Math.max((width - paddingRight) - measuredWidth3, this.f65h + i4);
        this.f61d.layout(baseline, measuredWidth2, baseline + measuredWidth3, this.f61d.getMeasuredHeight() + measuredWidth2);
        this.f64g = f;
        this.f68k = false;
    }

    final void m59a(int i, aa aaVar) {
        CharSequence charSequence = null;
        int count = aaVar != null ? aaVar.getCount() : 0;
        this.f67j = true;
        CharSequence pageTitle = (i <= 0 || aaVar == null) ? null : aaVar.getPageTitle(i - 1);
        this.f59b.setText(pageTitle);
        TextView textView = this.f60c;
        pageTitle = (aaVar == null || i >= count) ? null : aaVar.getPageTitle(i);
        textView.setText(pageTitle);
        if (i + 1 < count && aaVar != null) {
            charSequence = aaVar.getPageTitle(i + 1);
        }
        this.f61d.setText(charSequence);
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        count = MeasureSpec.makeMeasureSpec((int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f), Integer.MIN_VALUE);
        height = MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
        this.f59b.measure(count, height);
        this.f60c.measure(count, height);
        this.f61d.measure(count, height);
        this.f63f = i;
        if (!this.f68k) {
            mo145a(i, this.f64g, false);
        }
        this.f67j = false;
    }

    final void m60a(aa aaVar, aa aaVar2) {
        if (aaVar != null) {
            aaVar.unregisterDataSetObserver(this.f69l);
            this.f70m = null;
        }
        if (aaVar2 != null) {
            aaVar2.registerDataSetObserver(this.f69l);
            this.f70m = new WeakReference(aaVar2);
        }
        if (this.f58a != null) {
            this.f63f = -1;
            this.f64g = -1.0f;
            m59a(this.f58a.getCurrentItem(), aaVar2);
            requestLayout();
        }
    }

    int getMinHeight() {
        Drawable background = getBackground();
        return background != null ? background.getIntrinsicHeight() : 0;
    }

    public int getTextSpacing() {
        return this.f65h;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            aa adapter = viewPager.getAdapter();
            viewPager.m89a(this.f69l);
            viewPager.setOnAdapterChangeListener(this.f69l);
            this.f58a = viewPager;
            m60a(this.f70m != null ? (aa) this.f70m.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f58a != null) {
            m60a(this.f58a.getAdapter(), null);
            this.f58a.m89a(null);
            this.f58a.setOnAdapterChangeListener(null);
            this.f58a = null;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 0.0f;
        if (this.f58a != null) {
            if (this.f64g >= 0.0f) {
                f = this.f64g;
            }
            mo145a(this.f63f, f, true);
        }
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        mode = getMinHeight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = size2 - paddingTop;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec((int) (((float) size) * 0.8f), Integer.MIN_VALUE);
        i3 = MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        this.f59b.measure(makeMeasureSpec, i3);
        this.f60c.measure(makeMeasureSpec, i3);
        this.f61d.measure(makeMeasureSpec, i3);
        if (mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, Math.max(mode, this.f60c.getMeasuredHeight() + paddingTop));
        }
    }

    public void requestLayout() {
        if (!this.f67j) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f66i = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        this.f71p = ((int) (255.0f * f)) & 255;
        int i = (this.f71p << 24) | (this.f62e & 16777215);
        this.f59b.setTextColor(i);
        this.f61d.setTextColor(i);
    }

    public void setTextColor(int i) {
        this.f62e = i;
        this.f60c.setTextColor(i);
        int i2 = (this.f71p << 24) | (this.f62e & 16777215);
        this.f59b.setTextColor(i2);
        this.f61d.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f65h = i;
        requestLayout();
    }
}
