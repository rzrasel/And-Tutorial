package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.C0656d;
import android.support.v4.view.C0679r;
import android.support.v7.p021a.C0780a.C0773d;
import android.support.v7.p021a.C0780a.C0776g;
import android.support.v7.view.menu.C0121o.C0803a;
import android.support.v7.widget.MenuItemHoverListener;
import android.support.v7.widget.MenuPopupWindow;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

final class C0961e extends C0960m implements C0121o, OnKeyListener, OnDismissListener {
    private OnDismissListener f3014A;
    final Handler f3015a;
    final List<C0958a> f3016b = new ArrayList();
    View f3017c;
    boolean f3018d;
    private final Context f3019f;
    private final int f3020g;
    private final int f3021h;
    private final int f3022i;
    private final boolean f3023j;
    private final List<C0131h> f3024k = new LinkedList();
    private final OnGlobalLayoutListener f3025l = new C09541(this);
    private final OnAttachStateChangeListener f3026m = new C09552(this);
    private final MenuItemHoverListener f3027n = new C09573(this);
    private int f3028o = 0;
    private int f3029p = 0;
    private View f3030q;
    private int f3031r;
    private boolean f3032s;
    private boolean f3033t;
    private int f3034u;
    private int f3035v;
    private boolean f3036w;
    private boolean f3037x;
    private C0803a f3038y;
    private ViewTreeObserver f3039z;

    class C09541 implements OnGlobalLayoutListener {
        final /* synthetic */ C0961e f3003a;

        C09541(C0961e c0961e) {
            this.f3003a = c0961e;
        }

        public final void onGlobalLayout() {
            if (this.f3003a.isShowing() && this.f3003a.f3016b.size() > 0 && !((C0958a) this.f3003a.f3016b.get(0)).f3010a.isModal()) {
                View view = this.f3003a.f3017c;
                if (view == null || !view.isShown()) {
                    this.f3003a.dismiss();
                    return;
                }
                for (C0958a c0958a : this.f3003a.f3016b) {
                    c0958a.f3010a.show();
                }
            }
        }
    }

    class C09552 implements OnAttachStateChangeListener {
        final /* synthetic */ C0961e f3004a;

        C09552(C0961e c0961e) {
            this.f3004a = c0961e;
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (this.f3004a.f3039z != null) {
                if (!this.f3004a.f3039z.isAlive()) {
                    this.f3004a.f3039z = view.getViewTreeObserver();
                }
                this.f3004a.f3039z.removeGlobalOnLayoutListener(this.f3004a.f3025l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class C09573 implements MenuItemHoverListener {
        final /* synthetic */ C0961e f3009a;

        C09573(C0961e c0961e) {
            this.f3009a = c0961e;
        }

        public final void onItemHoverEnter(final C0131h c0131h, final MenuItem menuItem) {
            int i;
            this.f3009a.f3015a.removeCallbacksAndMessages(null);
            int size = this.f3009a.f3016b.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (c0131h == ((C0958a) this.f3009a.f3016b.get(i2)).f3011b) {
                    i = i2;
                    break;
                }
            }
            i = -1;
            if (i != -1) {
                i++;
                final C0958a c0958a = i < this.f3009a.f3016b.size() ? (C0958a) this.f3009a.f3016b.get(i) : null;
                this.f3009a.f3015a.postAtTime(new Runnable(this) {
                    final /* synthetic */ C09573 f3008d;

                    public final void run() {
                        if (c0958a != null) {
                            this.f3008d.f3009a.f3018d = true;
                            c0958a.f3011b.m260b(false);
                            this.f3008d.f3009a.f3018d = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            c0131h.m257a(menuItem, null, 4);
                        }
                    }
                }, c0131h, SystemClock.uptimeMillis() + 200);
            }
        }

        public final void onItemHoverExit(C0131h c0131h, MenuItem menuItem) {
            this.f3009a.f3015a.removeCallbacksAndMessages(c0131h);
        }
    }

    private static class C0958a {
        public final MenuPopupWindow f3010a;
        public final C0131h f3011b;
        public final int f3012c;

        public C0958a(MenuPopupWindow menuPopupWindow, C0131h c0131h, int i) {
            this.f3010a = menuPopupWindow;
            this.f3011b = c0131h;
            this.f3012c = i;
        }
    }

    public C0961e(Context context, View view, int i, int i2, boolean z) {
        this.f3019f = context;
        this.f3030q = view;
        this.f3021h = i;
        this.f3022i = i2;
        this.f3023j = z;
        this.f3036w = false;
        this.f3031r = m2788b();
        Resources resources = context.getResources();
        this.f3020g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0773d.abc_config_prefDialogWidth));
        this.f3015a = new Handler();
    }

    private int m2788b() {
        return C0679r.m1932e(this.f3030q) == 1 ? 0 : 1;
    }

    private void m2790c(C0131h c0131h) {
        int i;
        int i2;
        View view;
        C0958a c0958a;
        LayoutInflater from = LayoutInflater.from(this.f3019f);
        Object c0964g = new C0964g(c0131h, from, this.f3023j);
        if (!isShowing() && this.f3036w) {
            c0964g.f3054c = true;
        } else if (isShowing()) {
            c0964g.f3054c = C0960m.m2776b(c0131h);
        }
        int a = C0960m.m2774a(c0964g, null, this.f3019f, this.f3020g);
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f3019f, null, this.f3021h, this.f3022i);
        menuPopupWindow.setHoverListener(this.f3027n);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.f3030q);
        menuPopupWindow.setDropDownGravity(this.f3029p);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        menuPopupWindow.setAdapter(c0964g);
        menuPopupWindow.setContentWidth(a);
        menuPopupWindow.setDropDownGravity(this.f3029p);
        if (this.f3016b.size() > 0) {
            MenuItem menuItem;
            View view2;
            C0958a c0958a2 = (C0958a) this.f3016b.get(this.f3016b.size() - 1);
            C0131h c0131h2 = c0958a2.f3011b;
            int size = c0131h2.size();
            for (i = 0; i < size; i++) {
                MenuItem item = c0131h2.getItem(i);
                if (item.hasSubMenu() && c0131h == item.getSubMenu()) {
                    menuItem = item;
                    break;
                }
            }
            menuItem = null;
            if (menuItem == null) {
                view2 = null;
            } else {
                C0964g c0964g2;
                ListView listView = c0958a2.f3010a.getListView();
                ListAdapter adapter = listView.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    c0964g2 = (C0964g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    c0964g2 = (C0964g) adapter;
                }
                int count = c0964g2.getCount();
                for (int i3 = 0; i3 < count; i3++) {
                    if (menuItem == c0964g2.m2804a(i3)) {
                        i2 = i3;
                        break;
                    }
                }
                i2 = -1;
                if (i2 == -1) {
                    view2 = null;
                } else {
                    i2 = (i2 + i) - listView.getFirstVisiblePosition();
                    view2 = (i2 < 0 || i2 >= listView.getChildCount()) ? null : listView.getChildAt(i2);
                }
            }
            view = view2;
            c0958a = c0958a2;
        } else {
            view = null;
            c0958a = null;
        }
        if (view != null) {
            menuPopupWindow.setTouchModal(false);
            menuPopupWindow.setEnterTransition(null);
            ListView listView2 = ((C0958a) this.f3016b.get(this.f3016b.size() - 1)).f3010a.getListView();
            int[] iArr = new int[2];
            listView2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f3017c.getWindowVisibleDisplayFrame(rect);
            if (this.f3031r == 1) {
                if ((listView2.getWidth() + iArr[0]) + a <= rect.right) {
                    i2 = 1;
                }
                i2 = 0;
            } else {
                if (iArr[0] - a < 0) {
                    i2 = 1;
                }
                i2 = 0;
            }
            c0964g = i2 == 1 ? 1 : null;
            this.f3031r = i2;
            if (VERSION.SDK_INT >= 26) {
                menuPopupWindow.setAnchorView(view);
                i = 0;
                i2 = 0;
            } else {
                iArr = new int[2];
                this.f3030q.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            int width = (this.f3029p & 5) == 5 ? c0964g != null ? i + a : i - view.getWidth() : c0964g != null ? view.getWidth() + i : i - a;
            menuPopupWindow.setHorizontalOffset(width);
            menuPopupWindow.setOverlapAnchor(true);
            menuPopupWindow.setVerticalOffset(i2);
        } else {
            if (this.f3032s) {
                menuPopupWindow.setHorizontalOffset(this.f3034u);
            }
            if (this.f3033t) {
                menuPopupWindow.setVerticalOffset(this.f3035v);
            }
            menuPopupWindow.setEpicenterBounds(this.f3013e);
        }
        this.f3016b.add(new C0958a(menuPopupWindow, c0131h, this.f3031r));
        menuPopupWindow.show();
        ViewGroup listView3 = menuPopupWindow.getListView();
        listView3.setOnKeyListener(this);
        if (c0958a == null && this.f3037x && c0131h.f494f != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0776g.abc_popup_menu_header_item_layout, listView3, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(c0131h.f494f);
            listView3.addHeaderView(frameLayout, null, false);
            menuPopupWindow.show();
        }
    }

    public final void mo920a(int i) {
        if (this.f3028o != i) {
            this.f3028o = i;
            this.f3029p = C0656d.m1743a(i, C0679r.m1932e(this.f3030q));
        }
    }

    public final void mo921a(C0131h c0131h) {
        c0131h.m253a((C0121o) this, this.f3019f);
        if (isShowing()) {
            m2790c(c0131h);
        } else {
            this.f3024k.add(c0131h);
        }
    }

    public final void mo922a(View view) {
        if (this.f3030q != view) {
            this.f3030q = view;
            this.f3029p = C0656d.m1743a(this.f3028o, C0679r.m1932e(this.f3030q));
        }
    }

    public final void mo923a(OnDismissListener onDismissListener) {
        this.f3014A = onDismissListener;
    }

    public final void mo924a(boolean z) {
        this.f3036w = z;
    }

    protected final boolean mo925a() {
        return false;
    }

    public final void mo926b(int i) {
        this.f3032s = true;
        this.f3034u = i;
    }

    public final void mo927b(boolean z) {
        this.f3037x = z;
    }

    public final void mo928c(int i) {
        this.f3033t = true;
        this.f3035v = i;
    }

    public final void dismiss() {
        int size = this.f3016b.size();
        if (size > 0) {
            C0958a[] c0958aArr = (C0958a[]) this.f3016b.toArray(new C0958a[size]);
            for (size--; size >= 0; size--) {
                C0958a c0958a = c0958aArr[size];
                if (c0958a.f3010a.isShowing()) {
                    c0958a.f3010a.dismiss();
                }
            }
        }
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final ListView getListView() {
        return this.f3016b.isEmpty() ? null : ((C0958a) this.f3016b.get(this.f3016b.size() - 1)).f3010a.getListView();
    }

    public final boolean isShowing() {
        return this.f3016b.size() > 0 && ((C0958a) this.f3016b.get(0)).f3010a.isShowing();
    }

    public final void onCloseMenu(C0131h c0131h, boolean z) {
        int size = this.f3016b.size();
        int i = 0;
        while (i < size) {
            if (c0131h == ((C0958a) this.f3016b.get(i)).f3011b) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f3016b.size()) {
                ((C0958a) this.f3016b.get(i2)).f3011b.m260b(false);
            }
            C0958a c0958a = (C0958a) this.f3016b.remove(i);
            c0958a.f3011b.m259b((C0121o) this);
            if (this.f3018d) {
                c0958a.f3010a.setExitTransition(null);
                c0958a.f3010a.setAnimationStyle(0);
            }
            c0958a.f3010a.dismiss();
            i = this.f3016b.size();
            if (i > 0) {
                this.f3031r = ((C0958a) this.f3016b.get(i - 1)).f3012c;
            } else {
                this.f3031r = m2788b();
            }
            if (i == 0) {
                dismiss();
                if (this.f3038y != null) {
                    this.f3038y.onCloseMenu(c0131h, true);
                }
                if (this.f3039z != null) {
                    if (this.f3039z.isAlive()) {
                        this.f3039z.removeGlobalOnLayoutListener(this.f3025l);
                    }
                    this.f3039z = null;
                }
                this.f3017c.removeOnAttachStateChangeListener(this.f3026m);
                this.f3014A.onDismiss();
            } else if (z) {
                ((C0958a) this.f3016b.get(0)).f3011b.m260b(false);
            }
        }
    }

    public final void onDismiss() {
        C0958a c0958a;
        int size = this.f3016b.size();
        for (int i = 0; i < size; i++) {
            c0958a = (C0958a) this.f3016b.get(i);
            if (!c0958a.f3010a.isShowing()) {
                break;
            }
        }
        c0958a = null;
        if (c0958a != null) {
            c0958a.f3011b.m260b(false);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    public final Parcelable onSaveInstanceState() {
        return null;
    }

    public final boolean onSubMenuSelected(C0146u c0146u) {
        for (C0958a c0958a : this.f3016b) {
            if (c0146u == c0958a.f3011b) {
                c0958a.f3010a.getListView().requestFocus();
                return true;
            }
        }
        if (!c0146u.hasVisibleItems()) {
            return false;
        }
        mo921a((C0131h) c0146u);
        if (this.f3038y != null) {
            this.f3038y.onOpenSubMenu(c0146u);
        }
        return true;
    }

    public final void setCallback(C0803a c0803a) {
        this.f3038y = c0803a;
    }

    public final void show() {
        if (!isShowing()) {
            for (C0131h c : this.f3024k) {
                m2790c(c);
            }
            this.f3024k.clear();
            this.f3017c = this.f3030q;
            if (this.f3017c != null) {
                Object obj = this.f3039z == null ? 1 : null;
                this.f3039z = this.f3017c.getViewTreeObserver();
                if (obj != null) {
                    this.f3039z.addOnGlobalLayoutListener(this.f3025l);
                }
                this.f3017c.addOnAttachStateChangeListener(this.f3026m);
            }
        }
    }

    public final void updateMenuView(boolean z) {
        for (C0958a c0958a : this.f3016b) {
            C0960m.m2775a(c0958a.f3010a.getListView().getAdapter()).notifyDataSetChanged();
        }
    }
}
