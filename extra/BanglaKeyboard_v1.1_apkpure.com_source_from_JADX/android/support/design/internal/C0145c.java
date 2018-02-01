package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.C0116a.C0108d;
import android.support.design.C0116a.C0112h;
import android.support.v4.view.C0679r;
import android.support.v7.view.menu.C0121o;
import android.support.v7.view.menu.C0121o.C0803a;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0146u;
import android.support.v7.view.menu.C0967j;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public final class C0145c implements C0121o {
    public NavigationMenuView f523a;
    public LinearLayout f524b;
    C0131h f525c;
    public int f526d;
    public C0137b f527e;
    public LayoutInflater f528f;
    int f529g;
    boolean f530h;
    public ColorStateList f531i;
    public ColorStateList f532j;
    public Drawable f533k;
    public int f534l;
    int f535m;
    final OnClickListener f536n = new C01341(this);
    private C0803a f537o;

    class C01341 implements OnClickListener {
        final /* synthetic */ C0145c f514a;

        C01341(C0145c c0145c) {
            this.f514a = c0145c;
        }

        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            this.f514a.m282a(true);
            MenuItem itemData = navigationMenuItemView.getItemData();
            boolean a = this.f514a.f525c.m257a(itemData, this.f514a, 0);
            if (itemData != null && itemData.isCheckable() && a) {
                this.f514a.f527e.m277a(itemData);
            }
            this.f514a.m282a(false);
            this.f514a.updateMenuView(false);
        }
    }

    private static abstract class C0135j extends ViewHolder {
        public C0135j(View view) {
            super(view);
        }
    }

    private static class C0136a extends C0135j {
        public C0136a(View view) {
            super(view);
        }
    }

    private class C0137b extends Adapter<C0135j> {
        final ArrayList<C0138d> f515a = new ArrayList();
        boolean f516b;
        final /* synthetic */ C0145c f517c;
        private C0967j f518d;

        public C0137b(C0145c c0145c) {
            this.f517c = c0145c;
            m276a();
        }

        private void m275a(int i, int i2) {
            while (i < i2) {
                ((C0141f) this.f515a.get(i)).f522b = true;
                i++;
            }
        }

        final void m276a() {
            if (!this.f516b) {
                this.f516b = true;
                this.f515a.clear();
                this.f515a.add(new C0139c());
                int i = -1;
                int i2 = 0;
                boolean z = false;
                int size = this.f517c.f525c.m270h().size();
                int i3 = 0;
                while (i3 < size) {
                    int i4;
                    C0967j c0967j = (C0967j) this.f517c.f525c.m270h().get(i3);
                    if (c0967j.isChecked()) {
                        m277a(c0967j);
                    }
                    if (c0967j.isCheckable()) {
                        c0967j.m2814a(false);
                    }
                    int i5;
                    if (c0967j.hasSubMenu()) {
                        SubMenu subMenu = c0967j.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f515a.add(new C0140e(this.f517c.f535m, 0));
                            }
                            this.f515a.add(new C0141f(c0967j));
                            Object obj = null;
                            int size2 = this.f515a.size();
                            int size3 = subMenu.size();
                            for (i5 = 0; i5 < size3; i5++) {
                                C0967j c0967j2 = (C0967j) subMenu.getItem(i5);
                                if (c0967j2.isVisible()) {
                                    if (obj == null && c0967j2.getIcon() != null) {
                                        obj = 1;
                                    }
                                    if (c0967j2.isCheckable()) {
                                        c0967j2.m2814a(false);
                                    }
                                    if (c0967j.isChecked()) {
                                        m277a(c0967j);
                                    }
                                    this.f515a.add(new C0141f(c0967j2));
                                }
                            }
                            if (obj != null) {
                                m275a(size2, this.f515a.size());
                            }
                        }
                        i4 = i;
                    } else {
                        int size4;
                        boolean z2;
                        i5 = c0967j.getGroupId();
                        if (i5 != i) {
                            size4 = this.f515a.size();
                            z2 = c0967j.getIcon() != null;
                            if (i3 != 0) {
                                size4++;
                                this.f515a.add(new C0140e(this.f517c.f535m, this.f517c.f535m));
                            }
                        } else if (z || c0967j.getIcon() == null) {
                            z2 = z;
                            size4 = i2;
                        } else {
                            z2 = true;
                            m275a(i2, this.f515a.size());
                            size4 = i2;
                        }
                        C0141f c0141f = new C0141f(c0967j);
                        c0141f.f522b = z2;
                        this.f515a.add(c0141f);
                        z = z2;
                        i2 = size4;
                        i4 = i5;
                    }
                    i3++;
                    i = i4;
                }
                this.f516b = false;
            }
        }

        public final void m277a(C0967j c0967j) {
            if (this.f518d != c0967j && c0967j.isCheckable()) {
                if (this.f518d != null) {
                    this.f518d.setChecked(false);
                }
                this.f518d = c0967j;
                c0967j.setChecked(true);
            }
        }

        public final Bundle m278b() {
            Bundle bundle = new Bundle();
            if (this.f518d != null) {
                bundle.putInt("android:menu:checked", this.f518d.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f515a.size();
            for (int i = 0; i < size; i++) {
                C0138d c0138d = (C0138d) this.f515a.get(i);
                if (c0138d instanceof C0141f) {
                    C0967j c0967j = ((C0141f) c0138d).f521a;
                    View actionView = c0967j != null ? c0967j.getActionView() : null;
                    if (actionView != null) {
                        SparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(c0967j.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public final int getItemCount() {
            return this.f515a.size();
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getItemViewType(int i) {
            C0138d c0138d = (C0138d) this.f515a.get(i);
            if (c0138d instanceof C0140e) {
                return 2;
            }
            if (c0138d instanceof C0139c) {
                return 3;
            }
            if (c0138d instanceof C0141f) {
                return ((C0141f) c0138d).f521a.hasSubMenu() ? 1 : 0;
            } else {
                throw new RuntimeException("Unknown item type.");
            }
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            C0135j c0135j = (C0135j) viewHolder;
            switch (getItemViewType(i)) {
                case 0:
                    View view = (NavigationMenuItemView) c0135j.itemView;
                    view.setIconTintList(this.f517c.f532j);
                    if (this.f517c.f530h) {
                        view.setTextAppearance(this.f517c.f529g);
                    }
                    if (this.f517c.f531i != null) {
                        view.setTextColor(this.f517c.f531i);
                    }
                    C0679r.m1912a(view, this.f517c.f533k != null ? this.f517c.f533k.getConstantState().newDrawable() : null);
                    C0141f c0141f = (C0141f) this.f515a.get(i);
                    view.setNeedsEmptyIcon(c0141f.f522b);
                    view.mo42a(c0141f.f521a);
                    return;
                case 1:
                    ((TextView) c0135j.itemView).setText(((C0141f) this.f515a.get(i)).f521a.getTitle());
                    return;
                case 2:
                    C0140e c0140e = (C0140e) this.f515a.get(i);
                    c0135j.itemView.setPadding(0, c0140e.f519a, 0, c0140e.f520b);
                    return;
                default:
                    return;
            }
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new C0142g(this.f517c.f528f, viewGroup, this.f517c.f536n);
                case 1:
                    return new C0144i(this.f517c.f528f, viewGroup);
                case 2:
                    return new C0143h(this.f517c.f528f, viewGroup);
                case 3:
                    return new C0136a(this.f517c.f524b);
                default:
                    return null;
            }
        }

        public final /* synthetic */ void onViewRecycled(ViewHolder viewHolder) {
            C0135j c0135j = (C0135j) viewHolder;
            if (c0135j instanceof C0142g) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) c0135j.itemView;
                if (navigationMenuItemView.f472e != null) {
                    navigationMenuItemView.f472e.removeAllViews();
                }
                navigationMenuItemView.f471d.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    private interface C0138d {
    }

    private static class C0139c implements C0138d {
        C0139c() {
        }
    }

    private static class C0140e implements C0138d {
        final int f519a;
        final int f520b;

        public C0140e(int i, int i2) {
            this.f519a = i;
            this.f520b = i2;
        }
    }

    private static class C0141f implements C0138d {
        final C0967j f521a;
        boolean f522b;

        C0141f(C0967j c0967j) {
            this.f521a = c0967j;
        }
    }

    private static class C0142g extends C0135j {
        public C0142g(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(C0112h.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class C0143h extends C0135j {
        public C0143h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0112h.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class C0144i extends C0135j {
        public C0144i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0112h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    public final void m279a(int i) {
        this.f529g = i;
        this.f530h = true;
        updateMenuView(false);
    }

    public final void m280a(ColorStateList colorStateList) {
        this.f532j = colorStateList;
        updateMenuView(false);
    }

    public final void m281a(Drawable drawable) {
        this.f533k = drawable;
        updateMenuView(false);
    }

    public final void m282a(boolean z) {
        if (this.f527e != null) {
            this.f527e.f516b = z;
        }
    }

    public final void m283b(ColorStateList colorStateList) {
        this.f531i = colorStateList;
        updateMenuView(false);
    }

    public final boolean collapseItemActionView(C0131h c0131h, C0967j c0967j) {
        return false;
    }

    public final boolean expandItemActionView(C0131h c0131h, C0967j c0967j) {
        return false;
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final int getId() {
        return this.f526d;
    }

    public final void initForMenu(Context context, C0131h c0131h) {
        this.f528f = LayoutInflater.from(context);
        this.f525c = c0131h;
        this.f535m = context.getResources().getDimensionPixelOffset(C0108d.design_navigation_separator_vertical_padding);
    }

    public final void onCloseMenu(C0131h c0131h, boolean z) {
        if (this.f537o != null) {
            this.f537o.onCloseMenu(c0131h, z);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i = 0;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f523a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C0138d c0138d;
                C0967j c0967j;
                C0137b c0137b = this.f527e;
                int i2 = bundle2.getInt("android:menu:checked", 0);
                if (i2 != 0) {
                    c0137b.f516b = true;
                    int size = c0137b.f515a.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        c0138d = (C0138d) c0137b.f515a.get(i3);
                        if (c0138d instanceof C0141f) {
                            c0967j = ((C0141f) c0138d).f521a;
                            if (c0967j != null && c0967j.getItemId() == i2) {
                                c0137b.m277a(c0967j);
                                break;
                            }
                        }
                    }
                    c0137b.f516b = false;
                    c0137b.m276a();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = c0137b.f515a.size();
                    while (i < size2) {
                        c0138d = (C0138d) c0137b.f515a.get(i);
                        if (c0138d instanceof C0141f) {
                            c0967j = ((C0141f) c0138d).f521a;
                            if (c0967j != null) {
                                View actionView = c0967j.getActionView();
                                if (actionView != null) {
                                    ParcelableSparseArray parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(c0967j.getItemId());
                                    if (parcelableSparseArray != null) {
                                        actionView.restoreHierarchyState(parcelableSparseArray);
                                    }
                                }
                            }
                        }
                        i++;
                    }
                }
            }
            sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray != null) {
                this.f524b.restoreHierarchyState(sparseParcelableArray);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        if (VERSION.SDK_INT < 11) {
            return null;
        }
        Parcelable bundle = new Bundle();
        if (this.f523a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f523a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.f527e != null) {
            bundle.putBundle("android:menu:adapter", this.f527e.m278b());
        }
        if (this.f524b == null) {
            return bundle;
        }
        sparseArray = new SparseArray();
        this.f524b.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("android:menu:header", sparseArray);
        return bundle;
    }

    public final boolean onSubMenuSelected(C0146u c0146u) {
        return false;
    }

    public final void setCallback(C0803a c0803a) {
        this.f537o = c0803a;
    }

    public final void updateMenuView(boolean z) {
        if (this.f527e != null) {
            C0137b c0137b = this.f527e;
            c0137b.m276a();
            c0137b.notifyDataSetChanged();
        }
    }
}
