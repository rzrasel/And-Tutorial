package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p006a.p007a.C0366a;
import android.support.v4.view.C0650b;
import android.support.v4.view.C0650b.C0644a;
import android.support.v7.p021a.C0780a.C0770a;
import android.support.v7.p021a.C0780a.C0776g;
import android.support.v7.view.C0936a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.C0948b;
import android.support.v7.view.menu.C0119p;
import android.support.v7.view.menu.C0119p.C0117a;
import android.support.v7.view.menu.C0121o.C0803a;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0146u;
import android.support.v7.view.menu.C0951b;
import android.support.v7.view.menu.C0959s;
import android.support.v7.view.menu.C0967j;
import android.support.v7.view.menu.C0976n;
import android.support.v7.widget.ActionMenuView.ActionMenuChildView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

class ActionMenuPresenter extends C0951b implements C0644a {
    private static final String TAG = "ActionMenuPresenter";
    private final SparseBooleanArray mActionButtonGroups = new SparseBooleanArray();
    ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    OverflowMenuButton mOverflowButton;
    OverflowPopup mOverflowPopup;
    private Drawable mPendingOverflowIcon;
    private boolean mPendingOverflowIconSet;
    private ActionMenuPopupCallback mPopupCallback;
    final PopupPresenterCallback mPopupPresenterCallback = new PopupPresenterCallback();
    OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private View mScrapActionButtonView;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    private class ActionButtonSubmenu extends C0976n {
        public ActionButtonSubmenu(Context context, C0146u c0146u, View view) {
            super(context, c0146u, view, false, C0770a.actionOverflowMenuStyle);
            if (!((C0967j) c0146u.getItem()).m2823f()) {
                setAnchorView(ActionMenuPresenter.this.mOverflowButton == null ? (View) ActionMenuPresenter.this.mMenuView : ActionMenuPresenter.this.mOverflowButton);
            }
            setPresenterCallback(ActionMenuPresenter.this.mPopupPresenterCallback);
        }

        protected void onDismiss() {
            ActionMenuPresenter.this.mActionButtonPopup = null;
            ActionMenuPresenter.this.mOpenSubMenuId = 0;
            super.onDismiss();
        }
    }

    private class ActionMenuPopupCallback extends C0948b {
        ActionMenuPopupCallback() {
        }

        public C0959s getPopup() {
            return ActionMenuPresenter.this.mActionButtonPopup != null ? ActionMenuPresenter.this.mActionButtonPopup.getPopup() : null;
        }
    }

    private class OpenOverflowRunnable implements Runnable {
        private OverflowPopup mPopup;

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.mPopup = overflowPopup;
        }

        public void run() {
            if (ActionMenuPresenter.this.mMenu != null) {
                C0131h access$400 = ActionMenuPresenter.this.mMenu;
                if (access$400.f490b != null) {
                    access$400.f490b.onMenuModeChange(access$400);
                }
            }
            View view = (View) ActionMenuPresenter.this.mMenuView;
            if (!(view == null || view.getWindowToken() == null || !this.mPopup.tryShow())) {
                ActionMenuPresenter.this.mOverflowPopup = this.mPopup;
            }
            ActionMenuPresenter.this.mPostedOpenRunnable = null;
        }
    }

    private class OverflowMenuButton extends AppCompatImageView implements ActionMenuChildView {
        private final float[] mTempPts = new float[2];

        public OverflowMenuButton(Context context) {
            super(context, null, C0770a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.setTooltipText(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this, ActionMenuPresenter.this) {
                public C0959s getPopup() {
                    return ActionMenuPresenter.this.mOverflowPopup == null ? null : ActionMenuPresenter.this.mOverflowPopup.getPopup();
                }

                public boolean onForwardingStarted() {
                    ActionMenuPresenter.this.showOverflowMenu();
                    return true;
                }

                public boolean onForwardingStopped() {
                    if (ActionMenuPresenter.this.mPostedOpenRunnable != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.hideOverflowMenu();
                    return true;
                }
            });
        }

        public boolean needsDividerAfter() {
            return false;
        }

        public boolean needsDividerBefore() {
            return false;
        }

        public boolean performClick() {
            if (!super.performClick()) {
                playSoundEffect(0);
                ActionMenuPresenter.this.showOverflowMenu();
            }
            return true;
        }

        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                width = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                height = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0366a.m1042a(background, width - max, height - max, width + max, height + max);
            }
            return frame;
        }
    }

    private class OverflowPopup extends C0976n {
        public OverflowPopup(Context context, C0131h c0131h, View view, boolean z) {
            super(context, c0131h, view, z, C0770a.actionOverflowMenuStyle);
            setGravity(8388613);
            setPresenterCallback(ActionMenuPresenter.this.mPopupPresenterCallback);
        }

        protected void onDismiss() {
            if (ActionMenuPresenter.this.mMenu != null) {
                ActionMenuPresenter.this.mMenu.close();
            }
            ActionMenuPresenter.this.mOverflowPopup = null;
            super.onDismiss();
        }
    }

    private class PopupPresenterCallback implements C0803a {
        PopupPresenterCallback() {
        }

        public void onCloseMenu(C0131h c0131h, boolean z) {
            if (c0131h instanceof C0146u) {
                c0131h.mo79k().m260b(false);
            }
            C0803a callback = ActionMenuPresenter.this.getCallback();
            if (callback != null) {
                callback.onCloseMenu(c0131h, z);
            }
        }

        public boolean onOpenSubMenu(C0131h c0131h) {
            if (c0131h == null) {
                return false;
            }
            ActionMenuPresenter.this.mOpenSubMenuId = ((C0146u) c0131h).getItem().getItemId();
            C0803a callback = ActionMenuPresenter.this.getCallback();
            return callback != null ? callback.onOpenSubMenu(c0131h) : false;
        }
    }

    private static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C09891();
        public int openSubMenuId;

        static class C09891 implements Creator<SavedState> {
            C09891() {
            }

            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.openSubMenuId);
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C0776g.abc_action_menu_layout, C0776g.abc_action_menu_item_layout);
    }

    private View findViewForItem(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0117a) && ((C0117a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public void bindItemView(C0967j c0967j, C0117a c0117a) {
        c0117a.mo42a(c0967j);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) c0117a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.mMenuView);
        if (this.mPopupCallback == null) {
            this.mPopupCallback = new ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.mPopupCallback);
    }

    public boolean dismissPopupMenus() {
        return hideOverflowMenu() | hideSubMenus();
    }

    public boolean filterLeftoverView(ViewGroup viewGroup, int i) {
        return viewGroup.getChildAt(i) == this.mOverflowButton ? false : super.filterLeftoverView(viewGroup, i);
    }

    public boolean flagActionItems() {
        int size;
        ArrayList arrayList;
        int i;
        if (this.mMenu != null) {
            ArrayList h = this.mMenu.m270h();
            size = h.size();
            arrayList = h;
        } else {
            size = 0;
            arrayList = null;
        }
        int i2 = this.mMaxItems;
        int i3 = this.mActionItemWidthLimit;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        int i4 = 0;
        int i5 = 0;
        Object obj = null;
        int i6 = 0;
        while (i6 < size) {
            C0967j c0967j = (C0967j) arrayList.get(i6);
            if (c0967j.m2825h()) {
                i4++;
            } else if (c0967j.m2824g()) {
                i5++;
            } else {
                obj = 1;
            }
            i = (this.mExpandedActionViewsExclusive && c0967j.isActionViewExpanded()) ? 0 : i2;
            i6++;
            i2 = i;
        }
        if (this.mReserveOverflow && (r4 != null || i4 + i5 > i2)) {
            i2--;
        }
        i6 = i2 - i4;
        SparseBooleanArray sparseBooleanArray = this.mActionButtonGroups;
        sparseBooleanArray.clear();
        i = 0;
        if (this.mStrictWidthLimit) {
            i = i3 / this.mMinCellSize;
            i5 = ((i3 % this.mMinCellSize) / i) + this.mMinCellSize;
        } else {
            i5 = 0;
        }
        int i7 = 0;
        i2 = 0;
        int i8 = i;
        while (i7 < size) {
            c0967j = (C0967j) arrayList.get(i7);
            int i9;
            if (c0967j.m2825h()) {
                View itemView = getItemView(c0967j, this.mScrapActionButtonView, viewGroup);
                if (this.mScrapActionButtonView == null) {
                    this.mScrapActionButtonView = itemView;
                }
                if (this.mStrictWidthLimit) {
                    i8 -= ActionMenuView.measureChildForCells(itemView, i5, i8, makeMeasureSpec, 0);
                } else {
                    itemView.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i4 = itemView.getMeasuredWidth();
                i9 = i3 - i4;
                if (i2 != 0) {
                    i4 = i2;
                }
                i2 = c0967j.getGroupId();
                if (i2 != 0) {
                    sparseBooleanArray.put(i2, true);
                }
                c0967j.m2819c(true);
                i = i9;
                i2 = i6;
            } else if (c0967j.m2824g()) {
                boolean z;
                int groupId = c0967j.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId);
                boolean z3 = (i6 > 0 || z2) && i3 > 0 && (!this.mStrictWidthLimit || i8 > 0);
                if (z3) {
                    View itemView2 = getItemView(c0967j, this.mScrapActionButtonView, viewGroup);
                    if (this.mScrapActionButtonView == null) {
                        this.mScrapActionButtonView = itemView2;
                    }
                    boolean z4;
                    if (this.mStrictWidthLimit) {
                        int measureChildForCells = ActionMenuView.measureChildForCells(itemView2, i5, i8, makeMeasureSpec, 0);
                        i9 = i8 - measureChildForCells;
                        if (measureChildForCells == 0) {
                            i8 = 0;
                        } else {
                            z4 = z3;
                        }
                        i4 = i9;
                    } else {
                        itemView2.measure(makeMeasureSpec, makeMeasureSpec);
                        boolean z5 = z3;
                        i4 = i8;
                        z4 = z5;
                    }
                    i9 = itemView2.getMeasuredWidth();
                    i3 -= i9;
                    if (i2 == 0) {
                        i2 = i9;
                    }
                    if (this.mStrictWidthLimit) {
                        z = i8 & (i3 >= 0 ? 1 : 0);
                        i9 = i2;
                        i2 = i4;
                    } else {
                        z = i8 & (i3 + i2 > 0 ? 1 : 0);
                        i9 = i2;
                        i2 = i4;
                    }
                } else {
                    z = z3;
                    i9 = i2;
                    i2 = i8;
                }
                if (z && groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                    i8 = i6;
                } else if (z2) {
                    sparseBooleanArray.put(groupId, false);
                    i4 = i6;
                    for (i6 = 0; i6 < i7; i6++) {
                        C0967j c0967j2 = (C0967j) arrayList.get(i6);
                        if (c0967j2.getGroupId() == groupId) {
                            if (c0967j2.m2823f()) {
                                i4++;
                            }
                            c0967j2.m2819c(false);
                        }
                    }
                    i8 = i4;
                } else {
                    i8 = i6;
                }
                if (z) {
                    i8--;
                }
                c0967j.m2819c(z);
                i4 = i9;
                i = i3;
                int i10 = i2;
                i2 = i8;
                i8 = i10;
            } else {
                c0967j.m2819c(false);
                i4 = i2;
                i = i3;
                i2 = i6;
            }
            i7++;
            i3 = i;
            i6 = i2;
            i2 = i4;
        }
        return true;
    }

    public View getItemView(C0967j c0967j, View view, ViewGroup viewGroup) {
        View actionView = c0967j.getActionView();
        if (actionView == null || c0967j.m2826i()) {
            actionView = super.getItemView(c0967j, view, viewGroup);
        }
        actionView.setVisibility(c0967j.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public C0119p getMenuView(ViewGroup viewGroup) {
        C0119p c0119p = this.mMenuView;
        C0119p menuView = super.getMenuView(viewGroup);
        if (c0119p != menuView) {
            ((ActionMenuView) menuView).setPresenter(this);
        }
        return menuView;
    }

    public Drawable getOverflowIcon() {
        return this.mOverflowButton != null ? this.mOverflowButton.getDrawable() : this.mPendingOverflowIconSet ? this.mPendingOverflowIcon : null;
    }

    public boolean hideOverflowMenu() {
        if (this.mPostedOpenRunnable == null || this.mMenuView == null) {
            C0976n c0976n = this.mOverflowPopup;
            if (c0976n == null) {
                return false;
            }
            c0976n.dismiss();
            return true;
        }
        ((View) this.mMenuView).removeCallbacks(this.mPostedOpenRunnable);
        this.mPostedOpenRunnable = null;
        return true;
    }

    public boolean hideSubMenus() {
        if (this.mActionButtonPopup == null) {
            return false;
        }
        this.mActionButtonPopup.dismiss();
        return true;
    }

    public void initForMenu(Context context, C0131h c0131h) {
        boolean z = true;
        super.initForMenu(context, c0131h);
        Resources resources = context.getResources();
        C0936a a = C0936a.m2719a(context);
        if (!this.mReserveOverflowSet) {
            if (VERSION.SDK_INT < 19 && ViewConfiguration.get(a.f2878a).hasPermanentMenuKey()) {
                z = false;
            }
            this.mReserveOverflow = z;
        }
        if (!this.mWidthLimitSet) {
            this.mWidthLimit = a.f2878a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.mMaxItemsSet) {
            this.mMaxItems = a.m2720a();
        }
        int i = this.mWidthLimit;
        if (this.mReserveOverflow) {
            if (this.mOverflowButton == null) {
                this.mOverflowButton = new OverflowMenuButton(this.mSystemContext);
                if (this.mPendingOverflowIconSet) {
                    this.mOverflowButton.setImageDrawable(this.mPendingOverflowIcon);
                    this.mPendingOverflowIcon = null;
                    this.mPendingOverflowIconSet = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.mOverflowButton.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.mOverflowButton.getMeasuredWidth();
        } else {
            this.mOverflowButton = null;
        }
        this.mActionItemWidthLimit = i;
        this.mMinCellSize = (int) (56.0f * resources.getDisplayMetrics().density);
        this.mScrapActionButtonView = null;
    }

    public boolean isOverflowMenuShowPending() {
        return this.mPostedOpenRunnable != null || isOverflowMenuShowing();
    }

    public boolean isOverflowMenuShowing() {
        return this.mOverflowPopup != null && this.mOverflowPopup.isShowing();
    }

    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    public void onCloseMenu(C0131h c0131h, boolean z) {
        dismissPopupMenus();
        super.onCloseMenu(c0131h, z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.mMaxItemsSet) {
            this.mMaxItems = C0936a.m2719a(this.mContext).m2720a();
        }
        if (this.mMenu != null) {
            this.mMenu.mo81a(true);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.openSubMenuId > 0) {
                MenuItem findItem = this.mMenu.findItem(savedState.openSubMenuId);
                if (findItem != null) {
                    onSubMenuSelected((C0146u) findItem.getSubMenu());
                }
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState();
        savedState.openSubMenuId = this.mOpenSubMenuId;
        return savedState;
    }

    public boolean onSubMenuSelected(C0146u c0146u) {
        if (!c0146u.hasVisibleItems()) {
            return false;
        }
        C0146u c0146u2 = c0146u;
        while (c0146u2.f538l != this.mMenu) {
            c0146u2 = (C0146u) c0146u2.f538l;
        }
        View findViewForItem = findViewForItem(c0146u2.getItem());
        if (findViewForItem == null) {
            return false;
        }
        boolean z;
        this.mOpenSubMenuId = c0146u.getItem().getItemId();
        int size = c0146u.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0146u.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        z = false;
        this.mActionButtonPopup = new ActionButtonSubmenu(this.mContext, c0146u, findViewForItem);
        this.mActionButtonPopup.setForceShowIcon(z);
        this.mActionButtonPopup.show();
        super.onSubMenuSelected(c0146u);
        return true;
    }

    public void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
        } else if (this.mMenu != null) {
            this.mMenu.m260b(false);
        }
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.mExpandedActionViewsExclusive = z;
    }

    public void setItemLimit(int i) {
        this.mMaxItems = i;
        this.mMaxItemsSet = true;
    }

    public void setMenuView(ActionMenuView actionMenuView) {
        this.mMenuView = actionMenuView;
        actionMenuView.initialize(this.mMenu);
    }

    public void setOverflowIcon(Drawable drawable) {
        if (this.mOverflowButton != null) {
            this.mOverflowButton.setImageDrawable(drawable);
            return;
        }
        this.mPendingOverflowIconSet = true;
        this.mPendingOverflowIcon = drawable;
    }

    public void setReserveOverflow(boolean z) {
        this.mReserveOverflow = z;
        this.mReserveOverflowSet = true;
    }

    public void setWidthLimit(int i, boolean z) {
        this.mWidthLimit = i;
        this.mStrictWidthLimit = z;
        this.mWidthLimitSet = true;
    }

    public boolean shouldIncludeItem(int i, C0967j c0967j) {
        return c0967j.m2823f();
    }

    public boolean showOverflowMenu() {
        if (!this.mReserveOverflow || isOverflowMenuShowing() || this.mMenu == null || this.mMenuView == null || this.mPostedOpenRunnable != null || this.mMenu.m272j().isEmpty()) {
            return false;
        }
        this.mPostedOpenRunnable = new OpenOverflowRunnable(new OverflowPopup(this.mContext, this.mMenu, this.mOverflowButton, true));
        ((View) this.mMenuView).post(this.mPostedOpenRunnable);
        super.onSubMenuSelected(null);
        return true;
    }

    public void updateMenuView(boolean z) {
        int i;
        int i2 = 1;
        int i3 = 0;
        super.updateMenuView(z);
        ((View) this.mMenuView).requestLayout();
        if (this.mMenu != null) {
            C0131h c0131h = this.mMenu;
            c0131h.m271i();
            ArrayList arrayList = c0131h.f492d;
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                C0650b c0650b = ((C0967j) arrayList.get(i)).f3079d;
                if (c0650b != null) {
                    c0650b.setSubUiVisibilityListener(this);
                }
            }
        }
        ArrayList j = this.mMenu != null ? this.mMenu.m272j() : null;
        if (this.mReserveOverflow && j != null) {
            i = j.size();
            if (i == 1) {
                i3 = !((C0967j) j.get(0)).isActionViewExpanded() ? 1 : 0;
            } else {
                if (i <= 0) {
                    i2 = 0;
                }
                i3 = i2;
            }
        }
        if (i3 != 0) {
            if (this.mOverflowButton == null) {
                this.mOverflowButton = new OverflowMenuButton(this.mSystemContext);
            }
            ViewGroup viewGroup = (ViewGroup) this.mOverflowButton.getParent();
            if (viewGroup != this.mMenuView) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.mOverflowButton);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.mMenuView;
                actionMenuView.addView(this.mOverflowButton, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else if (this.mOverflowButton != null && this.mOverflowButton.getParent() == this.mMenuView) {
            ((ViewGroup) this.mMenuView).removeView(this.mOverflowButton);
        }
        ((ActionMenuView) this.mMenuView).setOverflowReserved(this.mReserveOverflow);
    }
}
