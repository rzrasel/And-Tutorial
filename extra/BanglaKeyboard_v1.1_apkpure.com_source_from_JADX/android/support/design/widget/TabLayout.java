package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.C0116a.C0108d;
import android.support.design.C0116a.C0112h;
import android.support.design.C0116a.C0114j;
import android.support.design.C0116a.C0115k;
import android.support.v4.p018f.C0498k.C0495a;
import android.support.v4.p018f.C0498k.C0496b;
import android.support.v4.p018f.C0498k.C0497c;
import android.support.v4.view.C0404o;
import android.support.v4.view.C0667p;
import android.support.v4.view.C0679r;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0196d;
import android.support.v4.view.ViewPager.C0204e;
import android.support.v4.view.ViewPager.C0600a;
import android.support.v4.widget.C0765l;
import android.support.v7.app.ActionBar.C0781a;
import android.support.v7.p021a.C0780a.C0779j;
import android.support.v7.p023c.p024a.C0862b;
import android.support.v7.widget.TooltipCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@C0600a
public class TabLayout extends HorizontalScrollView {
    private static final C0495a<C0203e> f834n = new C0497c(16);
    private DataSetObserver f835A;
    private C0205f f836B;
    private C0197a f837C;
    private boolean f838D;
    private final C0495a<C0206g> f839E;
    int f840a;
    int f841b;
    int f842c;
    int f843d;
    int f844e;
    ColorStateList f845f;
    float f846g;
    float f847h;
    final int f848i;
    int f849j;
    int f850k;
    int f851l;
    ViewPager f852m;
    private final ArrayList<C0203e> f853o;
    private C0203e f854p;
    private final C0202d f855q;
    private final int f856r;
    private final int f857s;
    private final int f858t;
    private int f859u;
    private C0198b f860v;
    private final ArrayList<C0198b> f861w;
    private C0198b f862x;
    private ValueAnimator f863y;
    private C0404o f864z;

    class C01951 implements AnimatorUpdateListener {
        final /* synthetic */ TabLayout f794a;

        C01951(TabLayout tabLayout) {
            this.f794a = tabLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f794a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class C0197a implements C0196d {
        boolean f795a;
        final /* synthetic */ TabLayout f796b;

        C0197a(TabLayout tabLayout) {
            this.f796b = tabLayout;
        }

        public final void mo167a(ViewPager viewPager, C0404o c0404o, C0404o c0404o2) {
            if (this.f796b.f852m == viewPager) {
                this.f796b.m576a(c0404o2, this.f795a);
            }
        }
    }

    public interface C0198b {
        void mo171a(C0203e c0203e);
    }

    private class C0199c extends DataSetObserver {
        final /* synthetic */ TabLayout f797a;

        C0199c(TabLayout tabLayout) {
            this.f797a = tabLayout;
        }

        public final void onChanged() {
            this.f797a.m572a();
        }

        public final void onInvalidated() {
            this.f797a.m572a();
        }
    }

    private class C0202d extends LinearLayout {
        int f805a = -1;
        float f806b;
        ValueAnimator f807c;
        final /* synthetic */ TabLayout f808d;
        private int f809e;
        private final Paint f810f;
        private int f811g = -1;
        private int f812h = -1;
        private int f813i = -1;

        C0202d(TabLayout tabLayout, Context context) {
            this.f808d = tabLayout;
            super(context);
            setWillNotDraw(false);
            this.f810f = new Paint();
        }

        final void m541a() {
            int i;
            int i2;
            View childAt = getChildAt(this.f805a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (this.f806b > 0.0f && this.f805a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f805a + 1);
                    i2 = (int) ((((float) i2) * (1.0f - this.f806b)) + (this.f806b * ((float) childAt2.getLeft())));
                    i = (int) ((((float) i) * (1.0f - this.f806b)) + (((float) childAt2.getRight()) * this.f806b));
                }
            }
            m543a(i2, i);
        }

        final void m542a(int i) {
            if (this.f810f.getColor() != i) {
                this.f810f.setColor(i);
                C0679r.m1928c(this);
            }
        }

        final void m543a(int i, int i2) {
            if (i != this.f812h || i2 != this.f813i) {
                this.f812h = i;
                this.f813i = i2;
                C0679r.m1928c(this);
            }
        }

        final void m544b(int i) {
            if (this.f809e != i) {
                this.f809e = i;
                C0679r.m1928c(this);
            }
        }

        final void m545b(final int i, int i2) {
            if (this.f807c != null && this.f807c.isRunning()) {
                this.f807c.cancel();
            }
            Object obj = C0679r.m1932e(this) == 1 ? 1 : null;
            View childAt = getChildAt(i);
            if (childAt == null) {
                m541a();
                return;
            }
            int i3;
            int i4;
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.f805a) <= 1) {
                i3 = this.f812h;
                i4 = this.f813i;
            } else {
                int b = this.f808d.m578b(24);
                if (i < this.f805a) {
                    if (obj == null) {
                        i4 = right + b;
                        i3 = i4;
                    }
                } else if (obj != null) {
                    i4 = right + b;
                    i3 = i4;
                }
                i4 = left - b;
                i3 = i4;
            }
            if (i3 != left || i4 != right) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f807c = valueAnimator;
                valueAnimator.setInterpolator(C0215a.f916b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(new AnimatorUpdateListener(this) {
                    final /* synthetic */ C0202d f802e;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        this.f802e.m543a(C0215a.m595a(i3, left, animatedFraction), C0215a.m595a(i4, right, animatedFraction));
                    }
                });
                valueAnimator.addListener(new AnimatorListenerAdapter(this) {
                    final /* synthetic */ C0202d f804b;

                    public final void onAnimationEnd(Animator animator) {
                        this.f804b.f805a = i;
                        this.f804b.f806b = 0.0f;
                    }
                });
                valueAnimator.start();
            }
        }

        public final void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.f812h >= 0 && this.f813i > this.f812h) {
                canvas.drawRect((float) this.f812h, (float) (getHeight() - this.f809e), (float) this.f813i, (float) getHeight(), this.f810f);
            }
        }

        protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f807c == null || !this.f807c.isRunning()) {
                m541a();
                return;
            }
            this.f807c.cancel();
            m545b(this.f805a, Math.round(((float) this.f807c.getDuration()) * (1.0f - this.f807c.getAnimatedFraction())));
        }

        protected final void onMeasure(int i, int i2) {
            boolean z = false;
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824 && this.f808d.f851l == 1 && this.f808d.f850k == 1) {
                int childCount = getChildCount();
                int i3 = 0;
                int i4 = 0;
                while (i3 < childCount) {
                    View childAt = getChildAt(i3);
                    i3++;
                    i4 = childAt.getVisibility() == 0 ? Math.max(i4, childAt.getMeasuredWidth()) : i4;
                }
                if (i4 > 0) {
                    if (i4 * childCount <= getMeasuredWidth() - (this.f808d.m578b(16) * 2)) {
                        i3 = 0;
                        while (i3 < childCount) {
                            boolean z2;
                            LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                            if (layoutParams.width == i4 && layoutParams.weight == 0.0f) {
                                z2 = z;
                            } else {
                                layoutParams.width = i4;
                                layoutParams.weight = 0.0f;
                                z2 = true;
                            }
                            i3++;
                            z = z2;
                        }
                    } else {
                        this.f808d.f850k = 0;
                        this.f808d.m577a(false);
                        z = true;
                    }
                    if (z) {
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f811g != i) {
                requestLayout();
                this.f811g = i;
            }
        }
    }

    public static final class C0203e {
        Object f814a;
        Drawable f815b;
        CharSequence f816c;
        CharSequence f817d;
        int f818e = -1;
        View f819f;
        TabLayout f820g;
        C0206g f821h;

        C0203e() {
        }

        public final C0203e m546a(CharSequence charSequence) {
            this.f816c = charSequence;
            m548b();
            return this;
        }

        public final void m547a() {
            if (this.f820g == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            this.f820g.m574a(this);
        }

        final void m548b() {
            if (this.f821h != null) {
                this.f821h.m556a();
            }
        }
    }

    public static class C0205f implements C0204e {
        int f822a;
        int f823b;
        private final WeakReference<TabLayout> f824c;

        public C0205f(TabLayout tabLayout) {
            this.f824c = new WeakReference(tabLayout);
        }

        public final void mo168a(int i) {
            this.f822a = this.f823b;
            this.f823b = i;
        }

        public final void mo169a(int i, float f) {
            boolean z = false;
            TabLayout tabLayout = (TabLayout) this.f824c.get();
            if (tabLayout != null) {
                boolean z2 = this.f823b != 2 || this.f822a == 1;
                if (!(this.f823b == 2 && this.f822a == 0)) {
                    z = true;
                }
                tabLayout.m573a(i, f, z2, z);
            }
        }

        public final void mo170b(int i) {
            TabLayout tabLayout = (TabLayout) this.f824c.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                boolean z = this.f823b == 0 || (this.f823b == 2 && this.f822a == 0);
                tabLayout.m575a(tabLayout.m571a(i), z);
            }
        }
    }

    class C0206g extends LinearLayout {
        final /* synthetic */ TabLayout f825a;
        private C0203e f826b;
        private TextView f827c;
        private ImageView f828d;
        private View f829e;
        private TextView f830f;
        private ImageView f831g;
        private int f832h = 2;

        public C0206g(TabLayout tabLayout, Context context) {
            this.f825a = tabLayout;
            super(context);
            if (tabLayout.f848i != 0) {
                C0679r.m1912a((View) this, C0862b.m2514b(context, tabLayout.f848i));
            }
            C0679r.m1925b(this, tabLayout.f840a, tabLayout.f841b, tabLayout.f842c, tabLayout.f843d);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C0679r.m1915a((View) this, C0667p.m1792a(getContext()));
        }

        private void m555a(TextView textView, ImageView imageView) {
            CharSequence charSequence = null;
            Drawable drawable = this.f826b != null ? this.f826b.f815b : null;
            CharSequence charSequence2 = this.f826b != null ? this.f826b.f816c : null;
            CharSequence charSequence3 = this.f826b != null ? this.f826b.f817d : null;
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(charSequence3);
            }
            int i = !TextUtils.isEmpty(charSequence2) ? 1 : 0;
            if (textView != null) {
                if (i != 0) {
                    textView.setText(charSequence2);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
                textView.setContentDescription(charSequence3);
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                int b = (i == 0 || imageView.getVisibility() != 0) ? 0 : this.f825a.m578b(8);
                if (b != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = b;
                    imageView.requestLayout();
                }
            }
            if (i == 0) {
                charSequence = charSequence3;
            }
            TooltipCompat.setTooltipText(this, charSequence);
        }

        final void m556a() {
            boolean z;
            C0203e c0203e = this.f826b;
            View view = c0203e != null ? c0203e.f819f : null;
            if (view != null) {
                C0206g parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        parent.removeView(view);
                    }
                    addView(view);
                }
                this.f829e = view;
                if (this.f827c != null) {
                    this.f827c.setVisibility(8);
                }
                if (this.f828d != null) {
                    this.f828d.setVisibility(8);
                    this.f828d.setImageDrawable(null);
                }
                this.f830f = (TextView) view.findViewById(16908308);
                if (this.f830f != null) {
                    this.f832h = C0765l.m2189a(this.f830f);
                }
                this.f831g = (ImageView) view.findViewById(16908294);
            } else {
                if (this.f829e != null) {
                    removeView(this.f829e);
                    this.f829e = null;
                }
                this.f830f = null;
                this.f831g = null;
            }
            if (this.f829e == null) {
                if (this.f828d == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C0112h.design_layout_tab_icon, this, false);
                    addView(imageView, 0);
                    this.f828d = imageView;
                }
                if (this.f827c == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0112h.design_layout_tab_text, this, false);
                    addView(textView);
                    this.f827c = textView;
                    this.f832h = C0765l.m2189a(this.f827c);
                }
                C0765l.m2190a(this.f827c, this.f825a.f844e);
                if (this.f825a.f845f != null) {
                    this.f827c.setTextColor(this.f825a.f845f);
                }
                m555a(this.f827c, this.f828d);
            } else if (!(this.f830f == null && this.f831g == null)) {
                m555a(this.f830f, this.f831g);
            }
            if (c0203e != null) {
                if (c0203e.f820g == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                if (c0203e.f820g.getSelectedTabPosition() == c0203e.f818e) {
                    z = true;
                    setSelected(z);
                }
            }
            z = false;
            setSelected(z);
        }

        final void m557a(C0203e c0203e) {
            if (c0203e != this.f826b) {
                this.f826b = c0203e;
                m556a();
            }
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0781a.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0781a.class.getName());
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMeasure(int r9, int r10) {
            /*
            r8 = this;
            r3 = 0;
            r1 = 1;
            r0 = android.view.View.MeasureSpec.getSize(r9);
            r2 = android.view.View.MeasureSpec.getMode(r9);
            r4 = r8.f825a;
            r4 = r4.getTabMaxWidth();
            if (r4 <= 0) goto L_0x0020;
        L_0x0012:
            if (r2 == 0) goto L_0x0016;
        L_0x0014:
            if (r0 <= r4) goto L_0x0020;
        L_0x0016:
            r0 = r8.f825a;
            r0 = r0.f849j;
            r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
            r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2);
        L_0x0020:
            super.onMeasure(r9, r10);
            r0 = r8.f827c;
            if (r0 == 0) goto L_0x009d;
        L_0x0027:
            r8.getResources();
            r0 = r8.f825a;
            r2 = r0.f846g;
            r0 = r8.f832h;
            r4 = r8.f828d;
            if (r4 == 0) goto L_0x009e;
        L_0x0034:
            r4 = r8.f828d;
            r4 = r4.getVisibility();
            if (r4 != 0) goto L_0x009e;
        L_0x003c:
            r0 = r1;
        L_0x003d:
            r4 = r8.f827c;
            r4 = r4.getTextSize();
            r5 = r8.f827c;
            r5 = r5.getLineCount();
            r6 = r8.f827c;
            r6 = android.support.v4.widget.C0765l.m2189a(r6);
            r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r7 != 0) goto L_0x0057;
        L_0x0053:
            if (r6 < 0) goto L_0x009d;
        L_0x0055:
            if (r0 == r6) goto L_0x009d;
        L_0x0057:
            r6 = r8.f825a;
            r6 = r6.f851l;
            if (r6 != r1) goto L_0x008e;
        L_0x005d:
            r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r4 <= 0) goto L_0x008e;
        L_0x0061:
            if (r5 != r1) goto L_0x008e;
        L_0x0063:
            r4 = r8.f827c;
            r4 = r4.getLayout();
            if (r4 == 0) goto L_0x008d;
        L_0x006b:
            r5 = r4.getLineWidth(r3);
            r4 = r4.getPaint();
            r4 = r4.getTextSize();
            r4 = r2 / r4;
            r4 = r4 * r5;
            r5 = r8.getMeasuredWidth();
            r6 = r8.getPaddingLeft();
            r5 = r5 - r6;
            r6 = r8.getPaddingRight();
            r5 = r5 - r6;
            r5 = (float) r5;
            r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
            if (r4 <= 0) goto L_0x008e;
        L_0x008d:
            r1 = r3;
        L_0x008e:
            if (r1 == 0) goto L_0x009d;
        L_0x0090:
            r1 = r8.f827c;
            r1.setTextSize(r3, r2);
            r1 = r8.f827c;
            r1.setMaxLines(r0);
            super.onMeasure(r9, r10);
        L_0x009d:
            return;
        L_0x009e:
            r4 = r8.f827c;
            if (r4 == 0) goto L_0x003d;
        L_0x00a2:
            r4 = r8.f827c;
            r4 = r4.getLineCount();
            if (r4 <= r1) goto L_0x003d;
        L_0x00aa:
            r2 = r8.f825a;
            r2 = r2.f847h;
            goto L_0x003d;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.g.onMeasure(int, int):void");
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f826b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f826b.m547a();
            return true;
        }

        public final void setSelected(boolean z) {
            Object obj = isSelected() != z ? 1 : null;
            super.setSelected(z);
            if (obj != null && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.f827c != null) {
                this.f827c.setSelected(z);
            }
            if (this.f828d != null) {
                this.f828d.setSelected(z);
            }
            if (this.f829e != null) {
                this.f829e.setSelected(z);
            }
        }
    }

    public static class C0207h implements C0198b {
        private final ViewPager f833a;

        public C0207h(ViewPager viewPager) {
            this.f833a = viewPager;
        }

        public final void mo171a(C0203e c0203e) {
            this.f833a.setCurrentItem(c0203e.f818e);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f853o = new ArrayList();
        this.f849j = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f861w = new ArrayList();
        this.f839E = new C0496b(12);
        C0260o.m694a(context);
        setHorizontalScrollBarEnabled(false);
        this.f855q = new C0202d(this, context);
        super.addView(this.f855q, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.TabLayout, i, C0114j.Widget_Design_TabLayout);
        this.f855q.m544b(obtainStyledAttributes.getDimensionPixelSize(C0115k.TabLayout_tabIndicatorHeight, 0));
        this.f855q.m542a(obtainStyledAttributes.getColor(C0115k.TabLayout_tabIndicatorColor, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0115k.TabLayout_tabPadding, 0);
        this.f843d = dimensionPixelSize;
        this.f842c = dimensionPixelSize;
        this.f841b = dimensionPixelSize;
        this.f840a = dimensionPixelSize;
        this.f840a = obtainStyledAttributes.getDimensionPixelSize(C0115k.TabLayout_tabPaddingStart, this.f840a);
        this.f841b = obtainStyledAttributes.getDimensionPixelSize(C0115k.TabLayout_tabPaddingTop, this.f841b);
        this.f842c = obtainStyledAttributes.getDimensionPixelSize(C0115k.TabLayout_tabPaddingEnd, this.f842c);
        this.f843d = obtainStyledAttributes.getDimensionPixelSize(C0115k.TabLayout_tabPaddingBottom, this.f843d);
        this.f844e = obtainStyledAttributes.getResourceId(C0115k.TabLayout_tabTextAppearance, C0114j.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.f844e, C0779j.TextAppearance);
        try {
            this.f846g = (float) obtainStyledAttributes2.getDimensionPixelSize(C0779j.TextAppearance_android_textSize, 0);
            this.f845f = obtainStyledAttributes2.getColorStateList(C0779j.TextAppearance_android_textColor);
            if (obtainStyledAttributes.hasValue(C0115k.TabLayout_tabTextColor)) {
                this.f845f = obtainStyledAttributes.getColorStateList(C0115k.TabLayout_tabTextColor);
            }
            if (obtainStyledAttributes.hasValue(C0115k.TabLayout_tabSelectedTextColor)) {
                dimensionPixelSize = obtainStyledAttributes.getColor(C0115k.TabLayout_tabSelectedTextColor, 0);
                int defaultColor = this.f845f.getDefaultColor();
                r3 = new int[2][];
                int[] iArr = new int[]{SELECTED_STATE_SET, dimensionPixelSize};
                r3[1] = EMPTY_STATE_SET;
                iArr[1] = defaultColor;
                this.f845f = new ColorStateList(r3, iArr);
            }
            this.f856r = obtainStyledAttributes.getDimensionPixelSize(C0115k.TabLayout_tabMinWidth, -1);
            this.f857s = obtainStyledAttributes.getDimensionPixelSize(C0115k.TabLayout_tabMaxWidth, -1);
            this.f848i = obtainStyledAttributes.getResourceId(C0115k.TabLayout_tabBackground, 0);
            this.f859u = obtainStyledAttributes.getDimensionPixelSize(C0115k.TabLayout_tabContentStart, 0);
            this.f851l = obtainStyledAttributes.getInt(C0115k.TabLayout_tabMode, 1);
            this.f850k = obtainStyledAttributes.getInt(C0115k.TabLayout_tabGravity, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f847h = (float) resources.getDimensionPixelSize(C0108d.design_tab_text_size_2line);
            this.f858t = resources.getDimensionPixelSize(C0108d.design_tab_scrollable_min_width);
            m570d();
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    private int m559a(int i, float f) {
        int i2 = 0;
        if (this.f851l != 0) {
            return 0;
        }
        View childAt = this.f855q.getChildAt(i);
        View childAt2 = i + 1 < this.f855q.getChildCount() ? this.f855q.getChildAt(i + 1) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        i2 = (int) ((((float) (i2 + width)) * 0.5f) * f);
        return C0679r.m1932e(this) == 0 ? i2 + left : left - i2;
    }

    private void m560a(C0198b c0198b) {
        if (!this.f861w.contains(c0198b)) {
            this.f861w.add(c0198b);
        }
    }

    private void m561a(C0203e c0203e, int i) {
        c0203e.f818e = i;
        this.f853o.add(i, c0203e);
        int size = this.f853o.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ((C0203e) this.f853o.get(i2)).f818e = i2;
        }
    }

    private void m562a(ViewPager viewPager, boolean z) {
        if (this.f852m != null) {
            if (this.f836B != null) {
                ViewPager viewPager2 = this.f852m;
                C0205f c0205f = this.f836B;
                if (viewPager2.f1857d != null) {
                    viewPager2.f1857d.remove(c0205f);
                }
            }
            if (this.f837C != null) {
                this.f852m.m1602b(this.f837C);
            }
        }
        if (this.f862x != null) {
            m566b(this.f862x);
            this.f862x = null;
        }
        if (viewPager != null) {
            this.f852m = viewPager;
            if (this.f836B == null) {
                this.f836B = new C0205f(this);
            }
            C0205f c0205f2 = this.f836B;
            c0205f2.f823b = 0;
            c0205f2.f822a = 0;
            c0205f2 = this.f836B;
            if (viewPager.f1857d == null) {
                viewPager.f1857d = new ArrayList();
            }
            viewPager.f1857d.add(c0205f2);
            this.f862x = new C0207h(viewPager);
            m560a(this.f862x);
            C0404o adapter = viewPager.getAdapter();
            if (adapter != null) {
                m576a(adapter, true);
            }
            if (this.f837C == null) {
                this.f837C = new C0197a(this);
            }
            this.f837C.f795a = true;
            viewPager.m1600a(this.f837C);
            setScrollPosition$4867b5c2(viewPager.getCurrentItem());
        } else {
            this.f852m = null;
            m576a(null, false);
        }
        this.f838D = z;
    }

    private void m563a(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            C0203e b = m565b();
            if (tabItem.f791a != null) {
                b.m546a(tabItem.f791a);
            }
            if (tabItem.f792b != null) {
                b.f815b = tabItem.f792b;
                b.m548b();
            }
            if (tabItem.f793c != 0) {
                b.f819f = LayoutInflater.from(b.f821h.getContext()).inflate(tabItem.f793c, b.f821h, false);
                b.m548b();
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                b.f817d = tabItem.getContentDescription();
                b.m548b();
            }
            m567b(b, this.f853o.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void m564a(LayoutParams layoutParams) {
        if (this.f851l == 1 && this.f850k == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private C0203e m565b() {
        C0203e c0203e = (C0203e) f834n.mo485a();
        C0203e c0203e2 = c0203e == null ? new C0203e() : c0203e;
        c0203e2.f820g = this;
        C0206g c0206g = this.f839E != null ? (C0206g) this.f839E.mo485a() : null;
        if (c0206g == null) {
            c0206g = new C0206g(this, getContext());
        }
        c0206g.m557a(c0203e2);
        c0206g.setFocusable(true);
        c0206g.setMinimumWidth(getTabMinWidth());
        c0203e2.f821h = c0206g;
        return c0203e2;
    }

    private void m566b(C0198b c0198b) {
        this.f861w.remove(c0198b);
    }

    private void m567b(C0203e c0203e, boolean z) {
        int size = this.f853o.size();
        if (c0203e.f820g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        m561a(c0203e, size);
        View view = c0203e.f821h;
        C0202d c0202d = this.f855q;
        int i = c0203e.f818e;
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m564a(layoutParams);
        c0202d.addView(view, i, layoutParams);
        if (z) {
            c0203e.m547a();
        }
    }

    private void m568c() {
        if (this.f863y == null) {
            this.f863y = new ValueAnimator();
            this.f863y.setInterpolator(C0215a.f916b);
            this.f863y.setDuration(300);
            this.f863y.addUpdateListener(new C01951(this));
        }
    }

    private void m569c(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C0679r.m1952y(this)) {
                int i2;
                C0202d c0202d = this.f855q;
                int childCount = c0202d.getChildCount();
                for (i2 = 0; i2 < childCount; i2++) {
                    if (c0202d.getChildAt(i2).getWidth() <= 0) {
                        i2 = 1;
                        break;
                    }
                }
                i2 = 0;
                if (i2 == 0) {
                    if (getScrollX() != m559a(i, 0.0f)) {
                        m568c();
                        this.f863y.setIntValues(new int[]{i2, r3});
                        this.f863y.start();
                    }
                    this.f855q.m545b(i, 300);
                    return;
                }
            }
            setScrollPosition$4867b5c2(i);
        }
    }

    private void m570d() {
        C0679r.m1925b(this.f855q, this.f851l == 0 ? Math.max(0, this.f859u - this.f840a) : 0, 0, 0, 0);
        switch (this.f851l) {
            case 0:
                this.f855q.setGravity(8388611);
                break;
            case 1:
                this.f855q.setGravity(1);
                break;
        }
        m577a(true);
    }

    private int getDefaultHeight() {
        Object obj;
        int size = this.f853o.size();
        for (int i = 0; i < size; i++) {
            C0203e c0203e = (C0203e) this.f853o.get(i);
            if (c0203e != null && c0203e.f815b != null && !TextUtils.isEmpty(c0203e.f816c)) {
                obj = 1;
                break;
            }
        }
        obj = null;
        return obj != null ? 72 : 48;
    }

    private float getScrollPosition() {
        C0202d c0202d = this.f855q;
        return c0202d.f806b + ((float) c0202d.f805a);
    }

    private int getTabMinWidth() {
        return this.f856r != -1 ? this.f856r : this.f851l == 0 ? this.f858t : 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f855q.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setScrollPosition$4867b5c2(int i) {
        m573a(i, 0.0f, true, true);
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f855q.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.f855q.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    public final C0203e m571a(int i) {
        return (i < 0 || i >= getTabCount()) ? null : (C0203e) this.f853o.get(i);
    }

    final void m572a() {
        int childCount;
        for (childCount = this.f855q.getChildCount() - 1; childCount >= 0; childCount--) {
            C0206g c0206g = (C0206g) this.f855q.getChildAt(childCount);
            this.f855q.removeViewAt(childCount);
            if (c0206g != null) {
                c0206g.m557a(null);
                c0206g.setSelected(false);
                this.f839E.mo486a(c0206g);
            }
            requestLayout();
        }
        Iterator it = this.f853o.iterator();
        while (it.hasNext()) {
            C0203e c0203e = (C0203e) it.next();
            it.remove();
            c0203e.f820g = null;
            c0203e.f821h = null;
            c0203e.f814a = null;
            c0203e.f815b = null;
            c0203e.f816c = null;
            c0203e.f817d = null;
            c0203e.f818e = -1;
            c0203e.f819f = null;
            f834n.mo486a(c0203e);
        }
        this.f854p = null;
        if (this.f864z != null) {
            int i;
            childCount = this.f864z.getCount();
            for (i = 0; i < childCount; i++) {
                m567b(m565b().m546a(this.f864z.getPageTitle(i)), false);
            }
            if (this.f852m != null && childCount > 0) {
                i = this.f852m.getCurrentItem();
                if (i != getSelectedTabPosition() && i < getTabCount()) {
                    m575a(m571a(i), true);
                }
            }
        }
    }

    final void m573a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f855q.getChildCount()) {
            if (z2) {
                C0202d c0202d = this.f855q;
                if (c0202d.f807c != null && c0202d.f807c.isRunning()) {
                    c0202d.f807c.cancel();
                }
                c0202d.f805a = i;
                c0202d.f806b = f;
                c0202d.m541a();
            }
            if (this.f863y != null && this.f863y.isRunning()) {
                this.f863y.cancel();
            }
            scrollTo(m559a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    final void m574a(C0203e c0203e) {
        m575a(c0203e, true);
    }

    final void m575a(C0203e c0203e, boolean z) {
        C0203e c0203e2 = this.f854p;
        int i;
        if (c0203e2 != c0203e) {
            i = c0203e != null ? c0203e.f818e : -1;
            if (z) {
                if ((c0203e2 == null || c0203e2.f818e == -1) && i != -1) {
                    setScrollPosition$4867b5c2(i);
                } else {
                    m569c(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            if (c0203e2 != null) {
                for (i = this.f861w.size() - 1; i >= 0; i--) {
                    this.f861w.get(i);
                }
            }
            this.f854p = c0203e;
            if (c0203e != null) {
                for (int size = this.f861w.size() - 1; size >= 0; size--) {
                    ((C0198b) this.f861w.get(size)).mo171a(c0203e);
                }
            }
        } else if (c0203e2 != null) {
            for (i = this.f861w.size() - 1; i >= 0; i--) {
                this.f861w.get(i);
            }
            m569c(c0203e.f818e);
        }
    }

    final void m576a(C0404o c0404o, boolean z) {
        if (!(this.f864z == null || this.f835A == null)) {
            this.f864z.unregisterDataSetObserver(this.f835A);
        }
        this.f864z = c0404o;
        if (z && c0404o != null) {
            if (this.f835A == null) {
                this.f835A = new C0199c(this);
            }
            c0404o.registerDataSetObserver(this.f835A);
        }
        m572a();
    }

    final void m577a(boolean z) {
        for (int i = 0; i < this.f855q.getChildCount(); i++) {
            View childAt = this.f855q.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m564a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        m563a(view);
    }

    public void addView(View view, int i) {
        m563a(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m563a(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m563a(view);
    }

    final int m578b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        return this.f854p != null ? this.f854p.f818e : -1;
    }

    public int getTabCount() {
        return this.f853o.size();
    }

    public int getTabGravity() {
        return this.f850k;
    }

    int getTabMaxWidth() {
        return this.f849j;
    }

    public int getTabMode() {
        return this.f851l;
    }

    public ColorStateList getTabTextColors() {
        return this.f845f;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f852m == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m562a((ViewPager) parent, true);
            }
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f838D) {
            setupWithViewPager(null);
            this.f838D = false;
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 1;
        int b = (m578b(getDefaultHeight()) + getPaddingTop()) + getPaddingBottom();
        switch (MeasureSpec.getMode(i2)) {
            case Integer.MIN_VALUE:
                i2 = MeasureSpec.makeMeasureSpec(Math.min(b, MeasureSpec.getSize(i2)), 1073741824);
                break;
            case 0:
                i2 = MeasureSpec.makeMeasureSpec(b, 1073741824);
                break;
        }
        b = MeasureSpec.getSize(i);
        if (MeasureSpec.getMode(i) != 0) {
            this.f849j = this.f857s > 0 ? this.f857s : b - m578b(56);
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            switch (this.f851l) {
                case 0:
                    if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                        b = 0;
                        break;
                    } else {
                        b = 1;
                        break;
                    }
                case 1:
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        i3 = 0;
                    }
                    b = i3;
                    break;
                default:
                    b = 0;
                    break;
            }
            if (b != 0) {
                childAt.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(C0198b c0198b) {
        if (this.f860v != null) {
            m566b(this.f860v);
        }
        this.f860v = c0198b;
        if (c0198b != null) {
            m560a(c0198b);
        }
    }

    void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m568c();
        this.f863y.addListener(animatorListener);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f855q.m542a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f855q.m544b(i);
    }

    public void setTabGravity(int i) {
        if (this.f850k != i) {
            this.f850k = i;
            m570d();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f851l) {
            this.f851l = i;
            m570d();
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f845f != colorStateList) {
            this.f845f = colorStateList;
            int size = this.f853o.size();
            for (int i = 0; i < size; i++) {
                ((C0203e) this.f853o.get(i)).m548b();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C0404o c0404o) {
        m576a(c0404o, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m562a(viewPager, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
