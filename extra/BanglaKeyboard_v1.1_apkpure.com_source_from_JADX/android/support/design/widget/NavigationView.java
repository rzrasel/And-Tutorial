package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0116a.C0112h;
import android.support.design.C0116a.C0114j;
import android.support.design.C0116a.C0115k;
import android.support.design.internal.C0133b;
import android.support.design.internal.C0145c;
import android.support.design.internal.C0145c.C0137b;
import android.support.design.internal.NavigationMenuView;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.v4.content.C0392a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0679r;
import android.support.v4.view.C0696z;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p023c.p024a.C0862b;
import android.support.v7.view.C0944g;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0131h.C0155a;
import android.support.v7.view.menu.C0967j;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] f758e = new int[]{16842912};
    private static final int[] f759f = new int[]{-16842910};
    public final C0145c f760c;
    C0189a f761d;
    private final C0133b f762g;
    private int f763h;
    private MenuInflater f764i;

    class C01871 implements C0155a {
        final /* synthetic */ NavigationView f756a;

        C01871(NavigationView navigationView) {
            this.f756a = navigationView;
        }

        public final boolean onMenuItemSelected(C0131h c0131h, MenuItem menuItem) {
            return this.f756a.f761d != null && this.f756a.f761d.onNavigationItemSelected(menuItem);
        }

        public final void onMenuModeChange(C0131h c0131h) {
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C01881();
        public Bundle f757a;

        static class C01881 implements ClassLoaderCreator<SavedState> {
            C01881() {
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
            this.f757a = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f757a);
        }
    }

    public interface C0189a {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        boolean z;
        super(context, attributeSet, i);
        this.f760c = new C0145c();
        C0260o.m694a(context);
        this.f762g = new C0133b(context);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0115k.NavigationView, i, C0114j.Widget_Design_NavigationView);
        C0679r.m1912a((View) this, obtainStyledAttributes.getDrawable(C0115k.NavigationView_android_background));
        if (obtainStyledAttributes.hasValue(C0115k.NavigationView_elevation)) {
            C0679r.m1905a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C0115k.NavigationView_elevation, 0));
        }
        C0679r.m1926b((View) this, obtainStyledAttributes.getBoolean(C0115k.NavigationView_android_fitsSystemWindows, false));
        this.f763h = obtainStyledAttributes.getDimensionPixelSize(C0115k.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateList = obtainStyledAttributes.hasValue(C0115k.NavigationView_itemIconTint) ? obtainStyledAttributes.getColorStateList(C0115k.NavigationView_itemIconTint) : m514a(16842808);
        if (obtainStyledAttributes.hasValue(C0115k.NavigationView_itemTextAppearance)) {
            resourceId = obtainStyledAttributes.getResourceId(C0115k.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            resourceId = 0;
            z = false;
        }
        ColorStateList colorStateList2 = null;
        if (obtainStyledAttributes.hasValue(C0115k.NavigationView_itemTextColor)) {
            colorStateList2 = obtainStyledAttributes.getColorStateList(C0115k.NavigationView_itemTextColor);
        }
        if (!z && r5 == null) {
            colorStateList2 = m514a(16842806);
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(C0115k.NavigationView_itemBackground);
        this.f762g.mo73a(new C01871(this));
        this.f760c.f526d = 1;
        this.f760c.initForMenu(context, this.f762g);
        this.f760c.m280a(colorStateList);
        if (z) {
            this.f760c.m279a(resourceId);
        }
        this.f760c.m283b(colorStateList2);
        this.f760c.m281a(drawable);
        this.f762g.m252a(this.f760c);
        C0145c c0145c = this.f760c;
        if (c0145c.f523a == null) {
            c0145c.f523a = (NavigationMenuView) c0145c.f528f.inflate(C0112h.design_navigation_menu, this, false);
            if (c0145c.f527e == null) {
                c0145c.f527e = new C0137b(c0145c);
            }
            c0145c.f524b = (LinearLayout) c0145c.f528f.inflate(C0112h.design_navigation_item_header, c0145c.f523a, false);
            c0145c.f523a.setAdapter(c0145c.f527e);
        }
        addView(c0145c.f523a);
        if (obtainStyledAttributes.hasValue(C0115k.NavigationView_menu)) {
            int resourceId2 = obtainStyledAttributes.getResourceId(C0115k.NavigationView_menu, 0);
            this.f760c.m282a(true);
            getMenuInflater().inflate(resourceId2, this.f762g);
            this.f760c.m282a(false);
            this.f760c.updateMenuView(false);
        }
        if (obtainStyledAttributes.hasValue(C0115k.NavigationView_headerLayout)) {
            resourceId2 = obtainStyledAttributes.getResourceId(C0115k.NavigationView_headerLayout, 0);
            c0145c = this.f760c;
            c0145c.f524b.addView(c0145c.f528f.inflate(resourceId2, c0145c.f524b, false));
            c0145c.f523a.setPadding(0, 0, 0, c0145c.f523a.getPaddingBottom());
        }
        obtainStyledAttributes.recycle();
    }

    private ColorStateList m514a(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C0862b.m2513a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0770a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{f759f, f758e, EMPTY_STATE_SET}, new int[]{a.getColorForState(f759f, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.f764i == null) {
            this.f764i = new C0944g(getContext());
        }
        return this.f764i;
    }

    protected final void mo164a(C0696z c0696z) {
        C0145c c0145c = this.f760c;
        int b = c0696z.m1995b();
        if (c0145c.f534l != b) {
            c0145c.f534l = b;
            if (c0145c.f524b.getChildCount() == 0) {
                c0145c.f523a.setPadding(0, c0145c.f534l, 0, c0145c.f523a.getPaddingBottom());
            }
        }
        C0679r.m1922b(c0145c.f524b, c0696z);
    }

    public int getHeaderCount() {
        return this.f760c.f524b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f760c.f533k;
    }

    public ColorStateList getItemIconTintList() {
        return this.f760c.f532j;
    }

    public ColorStateList getItemTextColor() {
        return this.f760c.f531i;
    }

    public Menu getMenu() {
        return this.f762g;
    }

    protected void onMeasure(int i, int i2) {
        switch (MeasureSpec.getMode(i)) {
            case Integer.MIN_VALUE:
                i = MeasureSpec.makeMeasureSpec(Math.min(MeasureSpec.getSize(i), this.f763h), 1073741824);
                break;
            case 0:
                i = MeasureSpec.makeMeasureSpec(this.f763h, 1073741824);
                break;
        }
        super.onMeasure(i, i2);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f762g.m258b(savedState.f757a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f757a = new Bundle();
        this.f762g.m250a(savedState.f757a);
        return savedState;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f762g.findItem(i);
        if (findItem != null) {
            this.f760c.f527e.m277a((C0967j) findItem);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f760c.m281a(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0392a.getDrawable(getContext(), i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f760c.m280a(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.f760c.m279a(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f760c.m283b(colorStateList);
    }

    public void setNavigationItemSelectedListener(C0189a c0189a) {
        this.f761d = c0189a;
    }
}
