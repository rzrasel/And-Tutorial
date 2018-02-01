package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.p021a.C0780a.C0773d;
import android.support.v7.p021a.C0780a.C0776g;
import android.support.v7.view.menu.C0121o.C0803a;
import android.support.v7.widget.MenuPopupWindow;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class C0981t extends C0960m implements C0121o, OnKeyListener, OnItemClickListener, OnDismissListener {
    final MenuPopupWindow f3109a;
    View f3110b;
    private final Context f3111c;
    private final C0131h f3112d;
    private final C0964g f3113f;
    private final boolean f3114g;
    private final int f3115h;
    private final int f3116i;
    private final int f3117j;
    private final OnGlobalLayoutListener f3118k = new C09791(this);
    private final OnAttachStateChangeListener f3119l = new C09802(this);
    private OnDismissListener f3120m;
    private View f3121n;
    private C0803a f3122o;
    private ViewTreeObserver f3123p;
    private boolean f3124q;
    private boolean f3125r;
    private int f3126s;
    private int f3127t = 0;
    private boolean f3128u;

    class C09791 implements OnGlobalLayoutListener {
        final /* synthetic */ C0981t f3107a;

        C09791(C0981t c0981t) {
            this.f3107a = c0981t;
        }

        public final void onGlobalLayout() {
            if (this.f3107a.isShowing() && !this.f3107a.f3109a.isModal()) {
                View view = this.f3107a.f3110b;
                if (view == null || !view.isShown()) {
                    this.f3107a.dismiss();
                } else {
                    this.f3107a.f3109a.show();
                }
            }
        }
    }

    class C09802 implements OnAttachStateChangeListener {
        final /* synthetic */ C0981t f3108a;

        C09802(C0981t c0981t) {
            this.f3108a = c0981t;
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (this.f3108a.f3123p != null) {
                if (!this.f3108a.f3123p.isAlive()) {
                    this.f3108a.f3123p = view.getViewTreeObserver();
                }
                this.f3108a.f3123p.removeGlobalOnLayoutListener(this.f3108a.f3118k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0981t(Context context, C0131h c0131h, View view, int i, int i2, boolean z) {
        this.f3111c = context;
        this.f3112d = c0131h;
        this.f3114g = z;
        this.f3113f = new C0964g(c0131h, LayoutInflater.from(context), this.f3114g);
        this.f3116i = i;
        this.f3117j = i2;
        Resources resources = context.getResources();
        this.f3115h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0773d.abc_config_prefDialogWidth));
        this.f3121n = view;
        this.f3109a = new MenuPopupWindow(this.f3111c, null, this.f3116i, this.f3117j);
        c0131h.m253a((C0121o) this, context);
    }

    public final void mo920a(int i) {
        this.f3127t = i;
    }

    public final void mo921a(C0131h c0131h) {
    }

    public final void mo922a(View view) {
        this.f3121n = view;
    }

    public final void mo923a(OnDismissListener onDismissListener) {
        this.f3120m = onDismissListener;
    }

    public final void mo924a(boolean z) {
        this.f3113f.f3054c = z;
    }

    public final void mo926b(int i) {
        this.f3109a.setHorizontalOffset(i);
    }

    public final void mo927b(boolean z) {
        this.f3128u = z;
    }

    public final void mo928c(int i) {
        this.f3109a.setVerticalOffset(i);
    }

    public final void dismiss() {
        if (isShowing()) {
            this.f3109a.dismiss();
        }
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final ListView getListView() {
        return this.f3109a.getListView();
    }

    public final boolean isShowing() {
        return !this.f3124q && this.f3109a.isShowing();
    }

    public final void onCloseMenu(C0131h c0131h, boolean z) {
        if (c0131h == this.f3112d) {
            dismiss();
            if (this.f3122o != null) {
                this.f3122o.onCloseMenu(c0131h, z);
            }
        }
    }

    public final void onDismiss() {
        this.f3124q = true;
        this.f3112d.close();
        if (this.f3123p != null) {
            if (!this.f3123p.isAlive()) {
                this.f3123p = this.f3110b.getViewTreeObserver();
            }
            this.f3123p.removeGlobalOnLayoutListener(this.f3118k);
            this.f3123p = null;
        }
        this.f3110b.removeOnAttachStateChangeListener(this.f3119l);
        if (this.f3120m != null) {
            this.f3120m.onDismiss();
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
        if (c0146u.hasVisibleItems()) {
            C0976n c0976n = new C0976n(this.f3111c, c0146u, this.f3110b, this.f3114g, this.f3116i, this.f3117j);
            c0976n.setPresenterCallback(this.f3122o);
            c0976n.setForceShowIcon(C0960m.m2776b((C0131h) c0146u));
            c0976n.setGravity(this.f3127t);
            c0976n.setOnDismissListener(this.f3120m);
            this.f3120m = null;
            this.f3112d.m260b(false);
            if (c0976n.tryShow(this.f3109a.getHorizontalOffset(), this.f3109a.getVerticalOffset())) {
                if (this.f3122o != null) {
                    this.f3122o.onOpenSubMenu(c0146u);
                }
                return true;
            }
        }
        return false;
    }

    public final void setCallback(C0803a c0803a) {
        this.f3122o = c0803a;
    }

    public final void show() {
        boolean z = true;
        if (!isShowing()) {
            if (this.f3124q || this.f3121n == null) {
                z = false;
            } else {
                this.f3110b = this.f3121n;
                this.f3109a.setOnDismissListener(this);
                this.f3109a.setOnItemClickListener(this);
                this.f3109a.setModal(true);
                View view = this.f3110b;
                boolean z2 = this.f3123p == null;
                this.f3123p = view.getViewTreeObserver();
                if (z2) {
                    this.f3123p.addOnGlobalLayoutListener(this.f3118k);
                }
                view.addOnAttachStateChangeListener(this.f3119l);
                this.f3109a.setAnchorView(view);
                this.f3109a.setDropDownGravity(this.f3127t);
                if (!this.f3125r) {
                    this.f3126s = C0960m.m2774a(this.f3113f, null, this.f3111c, this.f3115h);
                    this.f3125r = true;
                }
                this.f3109a.setContentWidth(this.f3126s);
                this.f3109a.setInputMethodMode(2);
                this.f3109a.setEpicenterBounds(this.f3013e);
                this.f3109a.show();
                ViewGroup listView = this.f3109a.getListView();
                listView.setOnKeyListener(this);
                if (this.f3128u && this.f3112d.f494f != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f3111c).inflate(C0776g.abc_popup_menu_header_item_layout, listView, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f3112d.f494f);
                    }
                    frameLayout.setEnabled(false);
                    listView.addHeaderView(frameLayout, null, false);
                }
                this.f3109a.setAdapter(this.f3113f);
                this.f3109a.show();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void updateMenuView(boolean z) {
        this.f3125r = false;
        if (this.f3113f != null) {
            this.f3113f.notifyDataSetChanged();
        }
    }
}
