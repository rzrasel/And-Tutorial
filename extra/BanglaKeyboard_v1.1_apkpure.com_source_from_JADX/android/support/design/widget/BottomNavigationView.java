package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0116a.C0107c;
import android.support.design.C0116a.C0108d;
import android.support.design.C0116a.C0114j;
import android.support.design.C0116a.C0115k;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.design.internal.C0132a;
import android.support.v4.content.C0392a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0679r;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p023c.p024a.C0862b;
import android.support.v7.view.C0944g;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0131h.C0155a;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

public class BottomNavigationView extends FrameLayout {
    private static final int[] f620a = new int[]{16842912};
    private static final int[] f621b = new int[]{-16842910};
    private final C0131h f622c;
    private final BottomNavigationMenuView f623d;
    private final BottomNavigationPresenter f624e;
    private MenuInflater f625f;
    private C0159b f626g;
    private C0158a f627h;

    class C01561 implements C0155a {
        final /* synthetic */ BottomNavigationView f618a;

        C01561(BottomNavigationView bottomNavigationView) {
            this.f618a = bottomNavigationView;
        }

        public final boolean onMenuItemSelected(C0131h c0131h, MenuItem menuItem) {
            if (this.f618a.f627h == null || menuItem.getItemId() != this.f618a.getSelectedItemId()) {
                return (this.f618a.f626g == null || this.f618a.f626g.m407a()) ? false : true;
            } else {
                this.f618a.f627h;
                return true;
            }
        }

        public final void onMenuModeChange(C0131h c0131h) {
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C01571();
        Bundle f619a;

        static class C01571 implements ClassLoaderCreator<SavedState> {
            C01571() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f619a = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f619a);
        }
    }

    public interface C0158a {
    }

    public interface C0159b {
        boolean m407a();
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f624e = new BottomNavigationPresenter();
        C0260o.m694a(context);
        this.f622c = new C0132a(context);
        this.f623d = new BottomNavigationMenuView(context);
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f623d.setLayoutParams(layoutParams);
        this.f624e.f458a = this.f623d;
        this.f624e.f460c = 1;
        this.f623d.setPresenter(this.f624e);
        this.f622c.m252a(this.f624e);
        this.f624e.initForMenu(getContext(), this.f622c);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0115k.BottomNavigationView, i, C0114j.Widget_Design_BottomNavigationView);
        if (obtainStyledAttributes.hasValue(C0115k.BottomNavigationView_itemIconTint)) {
            this.f623d.setIconTintList(obtainStyledAttributes.getColorStateList(C0115k.BottomNavigationView_itemIconTint));
        } else {
            this.f623d.setIconTintList(m408a());
        }
        if (obtainStyledAttributes.hasValue(C0115k.BottomNavigationView_itemTextColor)) {
            this.f623d.setItemTextColor(obtainStyledAttributes.getColorStateList(C0115k.BottomNavigationView_itemTextColor));
        } else {
            this.f623d.setItemTextColor(m408a());
        }
        if (obtainStyledAttributes.hasValue(C0115k.BottomNavigationView_elevation)) {
            C0679r.m1905a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C0115k.BottomNavigationView_elevation, 0));
        }
        this.f623d.setItemBackgroundRes(obtainStyledAttributes.getResourceId(C0115k.BottomNavigationView_itemBackground, 0));
        if (obtainStyledAttributes.hasValue(C0115k.BottomNavigationView_menu)) {
            int resourceId = obtainStyledAttributes.getResourceId(C0115k.BottomNavigationView_menu, 0);
            this.f624e.f459b = true;
            getMenuInflater().inflate(resourceId, this.f622c);
            this.f624e.f459b = false;
            this.f624e.updateMenuView(true);
        }
        obtainStyledAttributes.recycle();
        addView(this.f623d, layoutParams);
        if (VERSION.SDK_INT < 21) {
            View view = new View(context);
            view.setBackgroundColor(C0392a.getColor(context, C0107c.design_bottom_navigation_shadow_color));
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C0108d.design_bottom_navigation_shadow_height)));
            addView(view);
        }
        this.f622c.mo73a(new C01561(this));
    }

    private ColorStateList m408a() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList a = C0862b.m2513a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0770a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{f621b, f620a, EMPTY_STATE_SET}, new int[]{a.getColorForState(f621b, defaultColor), i, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.f625f == null) {
            this.f625f = new C0944g(getContext());
        }
        return this.f625f;
    }

    public int getItemBackgroundResource() {
        return this.f623d.getItemBackgroundRes();
    }

    public ColorStateList getItemIconTintList() {
        return this.f623d.getIconTintList();
    }

    public ColorStateList getItemTextColor() {
        return this.f623d.getItemTextColor();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f622c;
    }

    public int getSelectedItemId() {
        return this.f623d.getSelectedItemId();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f622c.m258b(savedState.f619a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f619a = new Bundle();
        this.f622c.m250a(savedState.f619a);
        return savedState;
    }

    public void setItemBackgroundResource(int i) {
        this.f623d.setItemBackgroundRes(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f623d.setIconTintList(colorStateList);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f623d.setItemTextColor(colorStateList);
    }

    public void setOnNavigationItemReselectedListener(C0158a c0158a) {
        this.f627h = c0158a;
    }

    public void setOnNavigationItemSelectedListener(C0159b c0159b) {
        this.f626g = c0159b;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f622c.findItem(i);
        if (findItem != null && !this.f622c.m257a(findItem, this.f624e, 0)) {
            findItem.setChecked(true);
        }
    }
}
