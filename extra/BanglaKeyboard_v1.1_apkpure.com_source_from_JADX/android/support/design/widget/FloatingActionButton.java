package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.C0116a.C0108d;
import android.support.design.C0116a.C0114j;
import android.support.design.C0116a.C0115k;
import android.support.design.widget.C0248i.C0181c;
import android.support.design.widget.C0248i.C02411;
import android.support.design.widget.C0248i.C02422;
import android.support.design.widget.C0248i.C02433;
import android.support.design.widget.CoordinatorLayout.C0174a;
import android.support.design.widget.CoordinatorLayout.C0176c;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.view.C0679r;
import android.support.v7.widget.AppCompatImageHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

@C0174a(a = Behavior.class)
public class FloatingActionButton extends VisibilityAwareImageButton {
    int f741a;
    boolean f742b;
    final Rect f743c;
    private ColorStateList f744d;
    private Mode f745e;
    private int f746f;
    private int f747g;
    private int f748h;
    private int f749i;
    private final Rect f750j;
    private AppCompatImageHelper f751k;
    private C0248i f752l;

    public static class Behavior extends android.support.design.widget.CoordinatorLayout.Behavior<FloatingActionButton> {
        private Rect f736a;
        private C0183a f737b;
        private boolean f738c;

        public Behavior() {
            this.f738c = true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.FloatingActionButton_Behavior_Layout);
            this.f738c = obtainStyledAttributes.getBoolean(C0115k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        private boolean m491a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m493a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f736a == null) {
                this.f736a = new Rect();
            }
            Rect rect = this.f736a;
            C0261p.m695a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m513b(this.f737b);
            } else {
                floatingActionButton.m512a(this.f737b);
            }
            return true;
        }

        private boolean m492a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            int i2;
            int i3 = 0;
            List a = coordinatorLayout.m481a((View) floatingActionButton);
            int size = a.size();
            for (i2 = 0; i2 < size; i2++) {
                View view = (View) a.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m494b(view) && m495b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m491a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m484a((View) floatingActionButton, i);
            Rect rect = floatingActionButton.f743c;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0176c c0176c = (C0176c) floatingActionButton.getLayoutParams();
                i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - c0176c.rightMargin ? rect.right : floatingActionButton.getLeft() <= c0176c.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - c0176c.bottomMargin) {
                    i3 = rect.bottom;
                } else if (floatingActionButton.getTop() <= c0176c.topMargin) {
                    i3 = -rect.top;
                }
                if (i3 != 0) {
                    C0679r.m1924b((View) floatingActionButton, i3);
                }
                if (i2 != 0) {
                    C0679r.m1929c(floatingActionButton, i2);
                }
            }
            return true;
        }

        private boolean m493a(View view, FloatingActionButton floatingActionButton) {
            return !this.f738c ? false : ((C0176c) floatingActionButton.getLayoutParams()).f697f != view.getId() ? false : floatingActionButton.getUserSetVisibility() == 0;
        }

        private static boolean m494b(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            return layoutParams instanceof C0176c ? ((C0176c) layoutParams).f692a instanceof BottomSheetBehavior : false;
        }

        private boolean m495b(View view, FloatingActionButton floatingActionButton) {
            if (!m493a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < ((C0176c) floatingActionButton.getLayoutParams()).topMargin + (floatingActionButton.getHeight() / 2)) {
                floatingActionButton.m513b(this.f737b);
            } else {
                floatingActionButton.m512a(this.f737b);
            }
            return true;
        }

        public final void mo157a(C0176c c0176c) {
            if (c0176c.f699h == 0) {
                c0176c.f699h = 80;
            }
        }

        public final /* synthetic */ boolean mo107a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m491a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (m494b(view2)) {
                m495b(view2, floatingActionButton);
            }
            return false;
        }

        public final /* synthetic */ boolean mo158a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f743c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    public static abstract class C0183a {
    }

    private class C0185b implements C0184l {
        final /* synthetic */ FloatingActionButton f739a;

        C0185b(FloatingActionButton floatingActionButton) {
            this.f739a = floatingActionButton;
        }

        public final float mo159a() {
            return ((float) this.f739a.getSizeDimension()) / 2.0f;
        }

        public final void mo160a(int i, int i2, int i3, int i4) {
            this.f739a.f743c.set(i, i2, i3, i4);
            this.f739a.setPadding(this.f739a.f741a + i, this.f739a.f741a + i2, this.f739a.f741a + i3, this.f739a.f741a + i4);
        }

        public final void mo161a(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public final boolean mo162b() {
            return this.f739a.f742b;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f743c = new Rect();
        this.f750j = new Rect();
        C0260o.m694a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0115k.FloatingActionButton, i, C0114j.Widget_Design_FloatingActionButton);
        this.f744d = obtainStyledAttributes.getColorStateList(C0115k.FloatingActionButton_backgroundTint);
        this.f745e = C0263r.m700a(obtainStyledAttributes.getInt(C0115k.FloatingActionButton_backgroundTintMode, -1));
        this.f747g = obtainStyledAttributes.getColor(C0115k.FloatingActionButton_rippleColor, 0);
        this.f748h = obtainStyledAttributes.getInt(C0115k.FloatingActionButton_fabSize, -1);
        this.f746f = obtainStyledAttributes.getDimensionPixelSize(C0115k.FloatingActionButton_borderWidth, 0);
        float dimension = obtainStyledAttributes.getDimension(C0115k.FloatingActionButton_elevation, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C0115k.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f742b = obtainStyledAttributes.getBoolean(C0115k.FloatingActionButton_useCompatPadding, false);
        obtainStyledAttributes.recycle();
        this.f751k = new AppCompatImageHelper(this);
        this.f751k.loadFromAttributes(attributeSet, i);
        this.f749i = (int) getResources().getDimension(C0108d.design_fab_image_size);
        getImpl().mo191a(this.f744d, this.f745e, this.f747g, this.f746f);
        getImpl().m652a(dimension);
        C0248i impl = getImpl();
        if (impl.f1038j != dimension2) {
            impl.f1038j = dimension2;
            impl.mo189a(impl.f1037i, dimension2);
        }
    }

    private static int m509a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(i, size);
            case 1073741824:
                return size;
            default:
                return i;
        }
    }

    private C0181c m511c(final C0183a c0183a) {
        return c0183a == null ? null : new C0181c(this) {
            final /* synthetic */ FloatingActionButton f735b;
        };
    }

    private C0248i getImpl() {
        if (this.f752l == null) {
            this.f752l = VERSION.SDK_INT >= 21 ? new C0250j(this, new C0185b(this)) : new C0248i(this, new C0185b(this));
        }
        return this.f752l;
    }

    final void m512a(C0183a c0183a) {
        boolean z = true;
        C0248i impl = getImpl();
        C0181c c = m511c(c0183a);
        if (impl.f1039o.getVisibility() != 0) {
            if (impl.f1030b != 2) {
                z = false;
            }
        } else if (impl.f1030b == 1) {
            z = false;
        }
        if (!z) {
            impl.f1039o.animate().cancel();
            if (impl.m666i()) {
                impl.f1030b = 2;
                if (impl.f1039o.getVisibility() != 0) {
                    impl.f1039o.setAlpha(0.0f);
                    impl.f1039o.setScaleY(0.0f);
                    impl.f1039o.setScaleX(0.0f);
                }
                impl.f1039o.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(C0215a.f918d).setListener(new C02422(impl, c));
                return;
            }
            impl.f1039o.m508a(0, false);
            impl.f1039o.setAlpha(1.0f);
            impl.f1039o.setScaleY(1.0f);
            impl.f1039o.setScaleX(1.0f);
        }
    }

    final void m513b(C0183a c0183a) {
        int i;
        C0248i impl = getImpl();
        C0181c c = m511c(c0183a);
        boolean z;
        if (impl.f1039o.getVisibility() == 0) {
            if (impl.f1030b == 1) {
                i = 1;
            } else {
                z = false;
            }
        } else if (impl.f1030b != 2) {
            i = 1;
        } else {
            z = false;
        }
        if (i == 0) {
            impl.f1039o.animate().cancel();
            if (impl.m666i()) {
                impl.f1030b = 1;
                impl.f1039o.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(C0215a.f917c).setListener(new C02411(impl, c));
                return;
            }
            impl.f1039o.m508a(4, false);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo193a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f744d;
    }

    public Mode getBackgroundTintMode() {
        return this.f745e;
    }

    public float getCompatElevation() {
        return getImpl().mo188a();
    }

    public Drawable getContentBackground() {
        return getImpl().f1036h;
    }

    public int getRippleColor() {
        return this.f747g;
    }

    public int getSize() {
        return this.f748h;
    }

    int getSizeDimension() {
        int i = this.f748h;
        while (true) {
            Resources resources = getResources();
            switch (i) {
                case -1:
                    i = Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? 1 : 0;
                case 1:
                    return resources.getDimensionPixelSize(C0108d.design_fab_size_mini);
                default:
                    return resources.getDimensionPixelSize(C0108d.design_fab_size_normal);
            }
        }
    }

    public boolean getUseCompatPadding() {
        return this.f742b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo194b();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0248i impl = getImpl();
        if (impl.mo197e()) {
            if (impl.f1041q == null) {
                impl.f1041q = new C02433(impl);
            }
            impl.f1039o.getViewTreeObserver().addOnPreDrawListener(impl.f1041q);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0248i impl = getImpl();
        if (impl.f1041q != null) {
            impl.f1039o.getViewTreeObserver().removeOnPreDrawListener(impl.f1041q);
            impl.f1041q = null;
        }
    }

    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f741a = (sizeDimension - this.f749i) / 2;
        getImpl().m661d();
        sizeDimension = Math.min(m509a(sizeDimension, i), m509a(sizeDimension, i2));
        setMeasuredDimension((this.f743c.left + sizeDimension) + this.f743c.right, (sizeDimension + this.f743c.top) + this.f743c.bottom);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                boolean z;
                Rect rect = this.f750j;
                if (C0679r.m1952y(this)) {
                    rect.set(0, 0, getWidth(), getHeight());
                    rect.left += this.f743c.left;
                    rect.top += this.f743c.top;
                    rect.right -= this.f743c.right;
                    rect.bottom -= this.f743c.bottom;
                    z = true;
                } else {
                    z = false;
                }
                if (z && !this.f750j.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f744d != colorStateList) {
            this.f744d = colorStateList;
            C0248i impl = getImpl();
            if (impl.f1033e != null) {
                C0366a.m1043a(impl.f1033e, colorStateList);
            }
            if (impl.f1035g != null) {
                impl.f1035g.m609a(colorStateList);
            }
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f745e != mode) {
            this.f745e = mode;
            C0248i impl = getImpl();
            if (impl.f1033e != null) {
                C0366a.m1046a(impl.f1033e, mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        getImpl().m652a(f);
    }

    public void setImageResource(int i) {
        this.f751k.setImageResource(i);
    }

    public void setRippleColor(int i) {
        if (this.f747g != i) {
            this.f747g = i;
            getImpl().mo190a(i);
        }
    }

    public void setSize(int i) {
        if (i != this.f748h) {
            this.f748h = i;
            requestLayout();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f742b != z) {
            this.f742b = z;
            getImpl().mo196c();
        }
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }
}
