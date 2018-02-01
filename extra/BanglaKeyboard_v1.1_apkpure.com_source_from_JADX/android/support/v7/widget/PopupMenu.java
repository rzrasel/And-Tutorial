package android.support.v7.widget;

import android.content.Context;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.view.C0944g;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0131h.C0155a;
import android.support.v7.view.menu.C0959s;
import android.support.v7.view.menu.C0976n;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnTouchListener;

public class PopupMenu {
    private final View mAnchor;
    private final Context mContext;
    private OnTouchListener mDragListener;
    private final C0131h mMenu;
    OnMenuItemClickListener mMenuItemClickListener;
    OnDismissListener mOnDismissListener;
    final C0976n mPopup;

    class C10311 implements C0155a {
        C10311() {
        }

        public boolean onMenuItemSelected(C0131h c0131h, MenuItem menuItem) {
            return PopupMenu.this.mMenuItemClickListener != null ? PopupMenu.this.mMenuItemClickListener.onMenuItemClick(menuItem) : false;
        }

        public void onMenuModeChange(C0131h c0131h) {
        }
    }

    class C10322 implements android.widget.PopupWindow.OnDismissListener {
        C10322() {
        }

        public void onDismiss() {
            if (PopupMenu.this.mOnDismissListener != null) {
                PopupMenu.this.mOnDismissListener.onDismiss(PopupMenu.this);
            }
        }
    }

    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public PopupMenu(Context context, View view) {
        this(context, view, 0);
    }

    public PopupMenu(Context context, View view, int i) {
        this(context, view, i, C0770a.popupMenuStyle, 0);
    }

    public PopupMenu(Context context, View view, int i, int i2, int i3) {
        this.mContext = context;
        this.mAnchor = view;
        this.mMenu = new C0131h(context);
        this.mMenu.mo73a(new C10311());
        this.mPopup = new C0976n(context, this.mMenu, view, false, i2, i3);
        this.mPopup.setGravity(i);
        this.mPopup.setOnDismissListener(new C10322());
    }

    public void dismiss() {
        this.mPopup.dismiss();
    }

    public OnTouchListener getDragToOpenListener() {
        if (this.mDragListener == null) {
            this.mDragListener = new ForwardingListener(this.mAnchor) {
                public C0959s getPopup() {
                    return PopupMenu.this.mPopup.getPopup();
                }

                protected boolean onForwardingStarted() {
                    PopupMenu.this.show();
                    return true;
                }

                protected boolean onForwardingStopped() {
                    PopupMenu.this.dismiss();
                    return true;
                }
            };
        }
        return this.mDragListener;
    }

    public int getGravity() {
        return this.mPopup.getGravity();
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public MenuInflater getMenuInflater() {
        return new C0944g(this.mContext);
    }

    public void inflate(int i) {
        getMenuInflater().inflate(i, this.mMenu);
    }

    public void setGravity(int i) {
        this.mPopup.setGravity(i);
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mMenuItemClickListener = onMenuItemClickListener;
    }

    public void show() {
        this.mPopup.show();
    }
}
