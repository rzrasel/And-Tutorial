package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.C0119p.C0117a;
import android.support.v7.view.menu.C0121o.C0803a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class C0951b implements C0121o {
    private C0803a mCallback;
    public Context mContext;
    private int mId;
    protected LayoutInflater mInflater;
    private int mItemLayoutRes;
    public C0131h mMenu;
    private int mMenuLayoutRes;
    public C0119p mMenuView;
    public Context mSystemContext;
    protected LayoutInflater mSystemInflater;

    public C0951b(Context context, int i, int i2) {
        this.mSystemContext = context;
        this.mSystemInflater = LayoutInflater.from(context);
        this.mMenuLayoutRes = i;
        this.mItemLayoutRes = i2;
    }

    protected void addItemView(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.mMenuView).addView(view, i);
    }

    public abstract void bindItemView(C0967j c0967j, C0117a c0117a);

    public boolean collapseItemActionView(C0131h c0131h, C0967j c0967j) {
        return false;
    }

    public C0117a createItemView(ViewGroup viewGroup) {
        return (C0117a) this.mSystemInflater.inflate(this.mItemLayoutRes, viewGroup, false);
    }

    public boolean expandItemActionView(C0131h c0131h, C0967j c0967j) {
        return false;
    }

    public boolean filterLeftoverView(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public boolean flagActionItems() {
        return false;
    }

    public C0803a getCallback() {
        return this.mCallback;
    }

    public int getId() {
        return this.mId;
    }

    public View getItemView(C0967j c0967j, View view, ViewGroup viewGroup) {
        C0117a createItemView = view instanceof C0117a ? (C0117a) view : createItemView(viewGroup);
        bindItemView(c0967j, createItemView);
        return (View) createItemView;
    }

    public C0119p getMenuView(ViewGroup viewGroup) {
        if (this.mMenuView == null) {
            this.mMenuView = (C0119p) this.mSystemInflater.inflate(this.mMenuLayoutRes, viewGroup, false);
            this.mMenuView.initialize(this.mMenu);
            updateMenuView(true);
        }
        return this.mMenuView;
    }

    public void initForMenu(Context context, C0131h c0131h) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(this.mContext);
        this.mMenu = c0131h;
    }

    public void onCloseMenu(C0131h c0131h, boolean z) {
        if (this.mCallback != null) {
            this.mCallback.onCloseMenu(c0131h, z);
        }
    }

    public boolean onSubMenuSelected(C0146u c0146u) {
        return this.mCallback != null ? this.mCallback.onOpenSubMenu(c0146u) : false;
    }

    public void setCallback(C0803a c0803a) {
        this.mCallback = c0803a;
    }

    public void setId(int i) {
        this.mId = i;
    }

    public boolean shouldIncludeItem(int i, C0967j c0967j) {
        return true;
    }

    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup != null) {
            int i;
            if (this.mMenu != null) {
                this.mMenu.m271i();
                ArrayList h = this.mMenu.m270h();
                int size = h.size();
                int i2 = 0;
                i = 0;
                while (i2 < size) {
                    int i3;
                    C0967j c0967j = (C0967j) h.get(i2);
                    if (shouldIncludeItem(i, c0967j)) {
                        View childAt = viewGroup.getChildAt(i);
                        C0967j itemData = childAt instanceof C0117a ? ((C0117a) childAt).getItemData() : null;
                        View itemView = getItemView(c0967j, childAt, viewGroup);
                        if (c0967j != itemData) {
                            itemView.setPressed(false);
                            itemView.jumpDrawablesToCurrentState();
                        }
                        if (itemView != childAt) {
                            addItemView(itemView, i);
                        }
                        i3 = i + 1;
                    } else {
                        i3 = i;
                    }
                    i2++;
                    i = i3;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!filterLeftoverView(viewGroup, i)) {
                    i++;
                }
            }
        }
    }
}
