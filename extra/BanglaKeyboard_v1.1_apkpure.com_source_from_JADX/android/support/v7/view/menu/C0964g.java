package android.support.v7.view.menu;

import android.support.v7.p021a.C0780a.C0776g;
import android.support.v7.view.menu.C0119p.C0117a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class C0964g extends BaseAdapter {
    static final int f3052a = C0776g.abc_popup_menu_item_layout;
    public C0131h f3053b;
    boolean f3054c;
    private int f3055d = -1;
    private final boolean f3056e;
    private final LayoutInflater f3057f;

    public C0964g(C0131h c0131h, LayoutInflater layoutInflater, boolean z) {
        this.f3056e = z;
        this.f3057f = layoutInflater;
        this.f3053b = c0131h;
        m2803a();
    }

    private void m2803a() {
        C0967j c0967j = this.f3053b.f498j;
        if (c0967j != null) {
            ArrayList j = this.f3053b.m272j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (((C0967j) j.get(i)) == c0967j) {
                    this.f3055d = i;
                    return;
                }
            }
        }
        this.f3055d = -1;
    }

    public final C0967j m2804a(int i) {
        ArrayList j = this.f3056e ? this.f3053b.m272j() : this.f3053b.m270h();
        if (this.f3055d >= 0 && i >= this.f3055d) {
            i++;
        }
        return (C0967j) j.get(i);
    }

    public final int getCount() {
        ArrayList j = this.f3056e ? this.f3053b.m272j() : this.f3053b.m270h();
        return this.f3055d < 0 ? j.size() : j.size() - 1;
    }

    public final /* synthetic */ Object getItem(int i) {
        return m2804a(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = view == null ? this.f3057f.inflate(f3052a, viewGroup, false) : view;
        C0117a c0117a = (C0117a) inflate;
        if (this.f3054c) {
            ((ListMenuItemView) inflate).setForceShowIcon(true);
        }
        c0117a.mo42a(m2804a(i));
        return inflate;
    }

    public final void notifyDataSetChanged() {
        m2803a();
        super.notifyDataSetChanged();
    }
}
