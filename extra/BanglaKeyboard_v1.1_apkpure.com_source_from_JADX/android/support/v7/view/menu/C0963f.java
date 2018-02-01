package android.support.v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.C0823c.C0822a;
import android.support.v7.p021a.C0780a.C0776g;
import android.support.v7.view.menu.C0119p.C0117a;
import android.support.v7.view.menu.C0121o.C0803a;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

public final class C0963f implements C0121o, OnItemClickListener {
    Context f3042a;
    public LayoutInflater f3043b;
    C0131h f3044c;
    public ExpandedMenuView f3045d;
    int f3046e;
    int f3047f;
    int f3048g;
    public C0962a f3049h;
    private C0803a f3050i;
    private int f3051j;

    private class C0962a extends BaseAdapter {
        final /* synthetic */ C0963f f3040a;
        private int f3041b = -1;

        public C0962a(C0963f c0963f) {
            this.f3040a = c0963f;
            m2800a();
        }

        private void m2800a() {
            C0967j c0967j = this.f3040a.f3044c.f498j;
            if (c0967j != null) {
                ArrayList j = this.f3040a.f3044c.m272j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (((C0967j) j.get(i)) == c0967j) {
                        this.f3041b = i;
                        return;
                    }
                }
            }
            this.f3041b = -1;
        }

        public final C0967j m2801a(int i) {
            ArrayList j = this.f3040a.f3044c.m272j();
            int i2 = this.f3040a.f3046e + i;
            if (this.f3041b >= 0 && i2 >= this.f3041b) {
                i2++;
            }
            return (C0967j) j.get(i2);
        }

        public final int getCount() {
            int size = this.f3040a.f3044c.m272j().size() - this.f3040a.f3046e;
            return this.f3041b < 0 ? size : size - 1;
        }

        public final /* synthetic */ Object getItem(int i) {
            return m2801a(i);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = view == null ? this.f3040a.f3043b.inflate(this.f3040a.f3048g, viewGroup, false) : view;
            ((C0117a) inflate).mo42a(m2801a(i));
            return inflate;
        }

        public final void notifyDataSetChanged() {
            m2800a();
            super.notifyDataSetChanged();
        }
    }

    private C0963f(int i) {
        this.f3048g = i;
        this.f3047f = 0;
    }

    public C0963f(Context context, int i) {
        this(i);
        this.f3042a = context;
        this.f3043b = LayoutInflater.from(this.f3042a);
    }

    public final ListAdapter m2802a() {
        if (this.f3049h == null) {
            this.f3049h = new C0962a(this);
        }
        return this.f3049h;
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
        return this.f3051j;
    }

    public final void initForMenu(Context context, C0131h c0131h) {
        if (this.f3047f != 0) {
            this.f3042a = new ContextThemeWrapper(context, this.f3047f);
            this.f3043b = LayoutInflater.from(this.f3042a);
        } else if (this.f3042a != null) {
            this.f3042a = context;
            if (this.f3043b == null) {
                this.f3043b = LayoutInflater.from(this.f3042a);
            }
        }
        this.f3044c = c0131h;
        if (this.f3049h != null) {
            this.f3049h.notifyDataSetChanged();
        }
    }

    public final void onCloseMenu(C0131h c0131h, boolean z) {
        if (this.f3050i != null) {
            this.f3050i.onCloseMenu(c0131h, z);
        }
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f3044c.m257a(this.f3049h.m2801a(i), (C0121o) this, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f3045d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public final Parcelable onSaveInstanceState() {
        if (this.f3045d == null) {
            return null;
        }
        Parcelable bundle = new Bundle();
        SparseArray sparseArray = new SparseArray();
        if (this.f3045d != null) {
            this.f3045d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    public final boolean onSubMenuSelected(C0146u c0146u) {
        if (!c0146u.hasVisibleItems()) {
            return false;
        }
        C0965i c0965i = new C0965i(c0146u);
        C0131h c0131h = c0965i.f3058a;
        C0822a c0822a = new C0822a(c0131h.f489a);
        c0965i.f3060c = new C0963f(c0822a.f2505a.f2330a, C0776g.abc_list_menu_item_layout);
        c0965i.f3060c.setCallback(c0965i);
        c0965i.f3058a.m252a(c0965i.f3060c);
        c0822a.f2505a.f2349t = c0965i.f3060c.m2802a();
        c0822a.f2505a.f2350u = c0965i;
        View view = c0131h.f496h;
        if (view != null) {
            c0822a.f2505a.f2336g = view;
        } else {
            c0822a.m2391a(c0131h.f495g).m2392a(c0131h.f494f);
        }
        c0822a.f2505a.f2347r = c0965i;
        c0965i.f3059b = c0822a.m2394a();
        c0965i.f3059b.setOnDismissListener(c0965i);
        LayoutParams attributes = c0965i.f3059b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        c0965i.f3059b.show();
        if (this.f3050i != null) {
            this.f3050i.onOpenSubMenu(c0146u);
        }
        return true;
    }

    public final void setCallback(C0803a c0803a) {
        this.f3050i = c0803a;
    }

    public final void updateMenuView(boolean z) {
        if (this.f3049h != null) {
            this.f3049h.notifyDataSetChanged();
        }
    }
}
