package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

abstract class C0960m implements C0121o, C0959s, OnItemClickListener {
    Rect f3013e;

    C0960m() {
    }

    protected static int m2774a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        ViewGroup viewGroup2 = viewGroup;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i3 = itemViewType;
                view = null;
            }
            ViewGroup frameLayout = viewGroup2 == null ? new FrameLayout(context) : viewGroup2;
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth <= i4) {
                measuredWidth = i4;
            }
            i2++;
            i4 = measuredWidth;
            viewGroup2 = frameLayout;
        }
        return i4;
    }

    protected static C0964g m2775a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0964g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0964g) listAdapter;
    }

    protected static boolean m2776b(C0131h c0131h) {
        int size = c0131h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0131h.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public abstract void mo920a(int i);

    public abstract void mo921a(C0131h c0131h);

    public abstract void mo922a(View view);

    public abstract void mo923a(OnDismissListener onDismissListener);

    public abstract void mo924a(boolean z);

    protected boolean mo925a() {
        return true;
    }

    public abstract void mo926b(int i);

    public abstract void mo927b(boolean z);

    public abstract void mo928c(int i);

    public boolean collapseItemActionView(C0131h c0131h, C0967j c0967j) {
        return false;
    }

    public boolean expandItemActionView(C0131h c0131h, C0967j c0967j) {
        return false;
    }

    public int getId() {
        return 0;
    }

    public void initForMenu(Context context, C0131h c0131h) {
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0960m.m2775a(listAdapter).f3053b.m257a((MenuItem) listAdapter.getItem(i), (C0121o) this, mo925a() ? 0 : 4);
    }
}
