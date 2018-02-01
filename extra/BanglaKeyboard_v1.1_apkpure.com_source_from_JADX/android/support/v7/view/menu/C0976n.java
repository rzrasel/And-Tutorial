package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.C0656d;
import android.support.v4.view.C0679r;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p021a.C0780a.C0773d;
import android.support.v7.view.menu.C0121o.C0803a;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

public class C0976n {
    private static final int TOUCH_EPICENTER_SIZE_DP = 48;
    private View mAnchorView;
    private final Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private final OnDismissListener mInternalOnDismissListener;
    private final C0131h mMenu;
    private OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private C0960m mPopup;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private C0803a mPresenterCallback;

    class C09751 implements OnDismissListener {
        final /* synthetic */ C0976n f3106a;

        C09751(C0976n c0976n) {
            this.f3106a = c0976n;
        }

        public final void onDismiss() {
            this.f3106a.onDismiss();
        }
    }

    public C0976n(Context context, C0131h c0131h) {
        this(context, c0131h, null, false, C0770a.popupMenuStyle, 0);
    }

    public C0976n(Context context, C0131h c0131h, View view) {
        this(context, c0131h, view, false, C0770a.popupMenuStyle, 0);
    }

    public C0976n(Context context, C0131h c0131h, View view, boolean z, int i) {
        this(context, c0131h, view, z, i, 0);
    }

    public C0976n(Context context, C0131h c0131h, View view, boolean z, int i, int i2) {
        this.mDropDownGravity = 8388611;
        this.mInternalOnDismissListener = new C09751(this);
        this.mContext = context;
        this.mMenu = c0131h;
        this.mAnchorView = view;
        this.mOverflowOnly = z;
        this.mPopupStyleAttr = i;
        this.mPopupStyleRes = i2;
    }

    private C0960m createPopup() {
        Display defaultDisplay = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        C0960m c0961e = (Math.min(point.x, point.y) >= this.mContext.getResources().getDimensionPixelSize(C0773d.abc_cascading_menus_min_smallest_width) ? 1 : null) != null ? new C0961e(this.mContext, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly) : new C0981t(this.mContext, this.mMenu, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        c0961e.mo921a(this.mMenu);
        c0961e.mo923a(this.mInternalOnDismissListener);
        c0961e.mo922a(this.mAnchorView);
        c0961e.setCallback(this.mPresenterCallback);
        c0961e.mo924a(this.mForceShowIcon);
        c0961e.mo920a(this.mDropDownGravity);
        return c0961e;
    }

    private void showPopup(int i, int i2, boolean z, boolean z2) {
        C0960m popup = getPopup();
        popup.mo927b(z2);
        if (z) {
            if ((C0656d.m1743a(this.mDropDownGravity, C0679r.m1932e(this.mAnchorView)) & 7) == 5) {
                i += this.mAnchorView.getWidth();
            }
            popup.mo926b(i);
            popup.mo928c(i2);
            int i3 = (int) ((this.mContext.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            popup.f3013e = new Rect(i - i3, i2 - i3, i + i3, i3 + i2);
        }
        popup.show();
    }

    public void dismiss() {
        if (isShowing()) {
            this.mPopup.dismiss();
        }
    }

    public int getGravity() {
        return this.mDropDownGravity;
    }

    public C0960m getPopup() {
        if (this.mPopup == null) {
            this.mPopup = createPopup();
        }
        return this.mPopup;
    }

    public boolean isShowing() {
        return this.mPopup != null && this.mPopup.isShowing();
    }

    public void onDismiss() {
        this.mPopup = null;
        if (this.mOnDismissListener != null) {
            this.mOnDismissListener.onDismiss();
        }
    }

    public void setAnchorView(View view) {
        this.mAnchorView = view;
    }

    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
        if (this.mPopup != null) {
            this.mPopup.mo924a(z);
        }
    }

    public void setGravity(int i) {
        this.mDropDownGravity = i;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setPresenterCallback(C0803a c0803a) {
        this.mPresenterCallback = c0803a;
        if (this.mPopup != null) {
            this.mPopup.setCallback(c0803a);
        }
    }

    public void show() {
        if (!tryShow()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void show(int i, int i2) {
        if (!tryShow(i, i2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean tryShow() {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        showPopup(0, 0, false, false);
        return true;
    }

    public boolean tryShow(int i, int i2) {
        if (isShowing()) {
            return true;
        }
        if (this.mAnchorView == null) {
            return false;
        }
        showPopup(i, i2, true, true);
        return true;
    }
}
