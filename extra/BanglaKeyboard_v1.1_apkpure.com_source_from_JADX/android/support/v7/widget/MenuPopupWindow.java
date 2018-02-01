package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0964g;
import android.support.v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class MenuPopupWindow extends ListPopupWindow implements MenuItemHoverListener {
    private static final String TAG = "MenuPopupWindow";
    private static Method sSetTouchModalMethod;
    private MenuItemHoverListener mHoverListener;

    public static class MenuDropDownListView extends DropDownListView {
        final int mAdvanceKey;
        private MenuItemHoverListener mHoverListener;
        private MenuItem mHoveredMenuItem;
        final int mRetreatKey;

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.mAdvanceKey = 22;
                this.mRetreatKey = 21;
                return;
            }
            this.mAdvanceKey = 21;
            this.mRetreatKey = 22;
        }

        public void clearSelection() {
            setSelection(-1);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public /* bridge */ /* synthetic */ boolean onForwardedEvent(MotionEvent motionEvent, int i) {
            return super.onForwardedEvent(motionEvent, i);
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            if (this.mHoverListener != null) {
                int headersCount;
                C0964g c0964g;
                MenuItem a;
                MenuItem menuItem;
                C0131h c0131h;
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0964g = (C0964g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    c0964g = (C0964g) adapter;
                }
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        headersCount = pointToPosition - headersCount;
                        if (headersCount >= 0 && headersCount < c0964g.getCount()) {
                            a = c0964g.m2804a(headersCount);
                            menuItem = this.mHoveredMenuItem;
                            if (menuItem != a) {
                                c0131h = c0964g.f3053b;
                                if (menuItem != null) {
                                    this.mHoverListener.onItemHoverExit(c0131h, menuItem);
                                }
                                this.mHoveredMenuItem = a;
                                if (a != null) {
                                    this.mHoverListener.onItemHoverEnter(c0131h, a);
                                }
                            }
                        }
                    }
                }
                a = null;
                menuItem = this.mHoveredMenuItem;
                if (menuItem != a) {
                    c0131h = c0964g.f3053b;
                    if (menuItem != null) {
                        this.mHoverListener.onItemHoverExit(c0131h, menuItem);
                    }
                    this.mHoveredMenuItem = a;
                    if (a != null) {
                        this.mHoverListener.onItemHoverEnter(c0131h, a);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.mAdvanceKey) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.mRetreatKey) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0964g) getAdapter()).f3053b.m260b(false);
                return true;
            }
        }

        public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
            this.mHoverListener = menuItemHoverListener;
        }
    }

    static {
        try {
            sSetTouchModalMethod = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    DropDownListView createDropDownListView(Context context, boolean z) {
        DropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    public void onItemHoverEnter(C0131h c0131h, MenuItem menuItem) {
        if (this.mHoverListener != null) {
            this.mHoverListener.onItemHoverEnter(c0131h, menuItem);
        }
    }

    public void onItemHoverExit(C0131h c0131h, MenuItem menuItem) {
        if (this.mHoverListener != null) {
            this.mHoverListener.onItemHoverExit(c0131h, menuItem);
        }
    }

    public void setEnterTransition(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.mPopup.setEnterTransition((Transition) obj);
        }
    }

    public void setExitTransition(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.mPopup.setExitTransition((Transition) obj);
        }
    }

    public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
        this.mHoverListener = menuItemHoverListener;
    }

    public void setTouchModal(boolean z) {
        if (sSetTouchModalMethod != null) {
            try {
                sSetTouchModalMethod.invoke(this.mPopup, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e) {
            }
        }
    }
}
