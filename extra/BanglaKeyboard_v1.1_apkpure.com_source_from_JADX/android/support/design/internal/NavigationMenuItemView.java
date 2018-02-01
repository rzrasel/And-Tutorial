package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.design.C0116a.C0108d;
import android.support.design.C0116a.C0109e;
import android.support.design.C0116a.C0110f;
import android.support.design.C0116a.C0112h;
import android.support.v4.content.p015a.C0437b;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.view.C0122a;
import android.support.v4.view.C0679r;
import android.support.v4.view.p019a.C0626b;
import android.support.v4.widget.C0765l;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.view.menu.C0119p.C0117a;
import android.support.v7.view.menu.C0967j;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView extends ForegroundLinearLayout implements C0117a {
    private static final int[] f469f = new int[]{16842912};
    boolean f470c;
    final CheckedTextView f471d;
    FrameLayout f472e;
    private final int f473g;
    private boolean f474h;
    private C0967j f475i;
    private ColorStateList f476j;
    private boolean f477k;
    private Drawable f478l;
    private final C0122a f479m;

    class C01231 extends C0122a {
        final /* synthetic */ NavigationMenuItemView f468a;

        C01231(NavigationMenuItemView navigationMenuItemView) {
            this.f468a = navigationMenuItemView;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0626b c0626b) {
            super.onInitializeAccessibilityNodeInfo(view, c0626b);
            c0626b.m1689a(this.f468a.f470c);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f479m = new C01231(this);
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0112h.design_navigation_menu_item, this, true);
        this.f473g = context.getResources().getDimensionPixelSize(C0108d.design_navigation_icon_size);
        this.f471d = (CheckedTextView) findViewById(C0110f.design_menu_item_text);
        this.f471d.setDuplicateParentStateEnabled(true);
        C0679r.m1913a(this.f471d, this.f479m);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f472e == null) {
                this.f472e = (FrameLayout) ((ViewStub) findViewById(C0110f.design_menu_item_action_area_stub)).inflate();
            }
            this.f472e.removeAllViews();
            this.f472e.addView(view);
        }
    }

    public final void mo42a(C0967j c0967j) {
        this.f475i = c0967j;
        setVisibility(c0967j.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            Drawable stateListDrawable;
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C0770a.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f469f, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            C0679r.m1912a((View) this, stateListDrawable);
        }
        setCheckable(c0967j.isCheckable());
        setChecked(c0967j.isChecked());
        setEnabled(c0967j.isEnabled());
        setTitle(c0967j.getTitle());
        setIcon(c0967j.getIcon());
        setActionView(c0967j.getActionView());
        setContentDescription(c0967j.getContentDescription());
        TooltipCompat.setTooltipText(this, c0967j.getTooltipText());
        boolean z = this.f475i.getTitle() == null && this.f475i.getIcon() == null && this.f475i.getActionView() != null;
        if (z) {
            this.f471d.setVisibility(8);
            if (this.f472e != null) {
                LayoutParams layoutParams = (LayoutParams) this.f472e.getLayoutParams();
                layoutParams.width = -1;
                this.f472e.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f471d.setVisibility(0);
        if (this.f472e != null) {
            layoutParams = (LayoutParams) this.f472e.getLayoutParams();
            layoutParams.width = -2;
            this.f472e.setLayoutParams(layoutParams);
        }
    }

    public final boolean mo43a() {
        return false;
    }

    public C0967j getItemData() {
        return this.f475i;
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f475i != null && this.f475i.isCheckable() && this.f475i.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f469f);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f470c != z) {
            this.f470c = z;
            this.f479m.sendAccessibilityEvent(this.f471d, ItemAnimator.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f471d.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f477k) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0366a.m1054g(drawable).mutate();
                C0366a.m1043a(drawable, this.f476j);
            }
            drawable.setBounds(0, 0, this.f473g, this.f473g);
        } else if (this.f474h) {
            if (this.f478l == null) {
                this.f478l = C0437b.m1156a(getResources(), C0109e.navigation_empty_icon, getContext().getTheme());
                if (this.f478l != null) {
                    this.f478l.setBounds(0, 0, this.f473g, this.f473g);
                }
            }
            drawable = this.f478l;
        }
        C0765l.m2191a(this.f471d, drawable, null, null, null);
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f476j = colorStateList;
        this.f477k = this.f476j != null;
        if (this.f475i != null) {
            setIcon(this.f475i.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f474h = z;
    }

    public void setTextAppearance(int i) {
        C0765l.m2190a(this.f471d, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f471d.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f471d.setText(charSequence);
    }
}
