package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.design.C0116a.C0108d;
import android.support.transition.AutoTransition;
import android.support.transition.TransitionSet;
import android.support.v4.p018f.C0498k.C0495a;
import android.support.v4.p018f.C0498k.C0497c;
import android.support.v4.view.C0679r;
import android.support.v4.view.p020b.C0648b;
import android.support.v7.view.menu.C0119p;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0967j;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class BottomNavigationMenuView extends ViewGroup implements C0119p {
    final TransitionSet f440a;
    BottomNavigationItemView[] f441b;
    int f442c;
    int f443d;
    BottomNavigationPresenter f444e;
    C0131h f445f;
    private final int f446g;
    private final int f447h;
    private final int f448i;
    private final int f449j;
    private final OnClickListener f450k;
    private final C0495a<BottomNavigationItemView> f451l;
    private boolean f452m;
    private ColorStateList f453n;
    private ColorStateList f454o;
    private int f455p;
    private int[] f456q;

    class C01181 implements OnClickListener {
        final /* synthetic */ BottomNavigationMenuView f439a;

        C01181(BottomNavigationMenuView bottomNavigationMenuView) {
            this.f439a = bottomNavigationMenuView;
        }

        public final void onClick(View view) {
            MenuItem itemData = ((BottomNavigationItemView) view).getItemData();
            if (!this.f439a.f445f.m257a(itemData, this.f439a.f444e, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public BottomNavigationMenuView(Context context) {
        this(context, null);
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f451l = new C0497c(5);
        this.f452m = true;
        this.f442c = 0;
        this.f443d = 0;
        Resources resources = getResources();
        this.f446g = resources.getDimensionPixelSize(C0108d.design_bottom_navigation_item_max_width);
        this.f447h = resources.getDimensionPixelSize(C0108d.design_bottom_navigation_item_min_width);
        this.f448i = resources.getDimensionPixelSize(C0108d.design_bottom_navigation_active_item_max_width);
        this.f449j = resources.getDimensionPixelSize(C0108d.design_bottom_navigation_height);
        this.f440a = new AutoTransition();
        this.f440a.m754a(0);
        this.f440a.m764c(115);
        this.f440a.m760b(new C0648b());
        this.f440a.m761b(new C0149e());
        this.f450k = new C01181(this);
        this.f456q = new int[5];
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) this.f451l.mo485a();
        return bottomNavigationItemView == null ? new BottomNavigationItemView(getContext()) : bottomNavigationItemView;
    }

    public final void m232a() {
        removeAllViews();
        if (this.f441b != null) {
            for (Object a : this.f441b) {
                this.f451l.mo486a(a);
            }
        }
        if (this.f445f.size() == 0) {
            this.f442c = 0;
            this.f443d = 0;
            this.f441b = null;
            return;
        }
        this.f441b = new BottomNavigationItemView[this.f445f.size()];
        this.f452m = this.f445f.size() > 3;
        for (int i = 0; i < this.f445f.size(); i++) {
            this.f444e.f459b = true;
            this.f445f.getItem(i).setCheckable(true);
            this.f444e.f459b = false;
            View newItem = getNewItem();
            this.f441b[i] = newItem;
            newItem.setIconTintList(this.f453n);
            newItem.setTextColor(this.f454o);
            newItem.setItemBackground(this.f455p);
            newItem.setShiftingMode(this.f452m);
            newItem.mo42a((C0967j) this.f445f.getItem(i));
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.f450k);
            addView(newItem);
        }
        this.f443d = Math.min(this.f445f.size() - 1, this.f443d);
        this.f445f.getItem(this.f443d).setChecked(true);
    }

    public ColorStateList getIconTintList() {
        return this.f453n;
    }

    public int getItemBackgroundRes() {
        return this.f455p;
    }

    public ColorStateList getItemTextColor() {
        return this.f454o;
    }

    public int getSelectedItemId() {
        return this.f442c;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void initialize(C0131h c0131h) {
        this.f445f = c0131h;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C0679r.m1932e(this) == 1) {
                    childAt.layout((i5 - i7) - childAt.getMeasuredWidth(), 0, i5 - i7, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int min;
        int size = MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f449j, 1073741824);
        int min2;
        if (this.f452m) {
            i3 = childCount - 1;
            min = Math.min(size - (this.f447h * i3), this.f448i);
            min2 = Math.min((size - min) / i3, this.f446g);
            size = (size - min) - (i3 * min2);
            int i4 = 0;
            while (i4 < childCount) {
                this.f456q[i4] = i4 == this.f443d ? min : min2;
                if (size > 0) {
                    int[] iArr = this.f456q;
                    iArr[i4] = iArr[i4] + 1;
                    i3 = size - 1;
                } else {
                    i3 = size;
                }
                i4++;
                size = i3;
            }
        } else {
            min2 = Math.min(size / (childCount == 0 ? 1 : childCount), this.f448i);
            i3 = size - (min2 * childCount);
            for (min = 0; min < childCount; min++) {
                this.f456q[min] = min2;
                if (i3 > 0) {
                    int[] iArr2 = this.f456q;
                    iArr2[min] = iArr2[min] + 1;
                    i3--;
                }
            }
        }
        i3 = 0;
        for (min = 0; min < childCount; min++) {
            View childAt = getChildAt(min);
            if (childAt.getVisibility() != 8) {
                childAt.measure(MeasureSpec.makeMeasureSpec(this.f456q[min], 1073741824), makeMeasureSpec);
                childAt.getLayoutParams().width = childAt.getMeasuredWidth();
                i3 += childAt.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i3, MeasureSpec.makeMeasureSpec(i3, 1073741824), 0), View.resolveSizeAndState(this.f449j, makeMeasureSpec, 0));
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f453n = colorStateList;
        if (this.f441b != null) {
            for (BottomNavigationItemView iconTintList : this.f441b) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f455p = i;
        if (this.f441b != null) {
            for (BottomNavigationItemView itemBackground : this.f441b) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f454o = colorStateList;
        if (this.f441b != null) {
            for (BottomNavigationItemView textColor : this.f441b) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f444e = bottomNavigationPresenter;
    }
}
