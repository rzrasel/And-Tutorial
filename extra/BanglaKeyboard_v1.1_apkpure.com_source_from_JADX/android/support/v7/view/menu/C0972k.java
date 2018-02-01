package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p010b.p011a.C0427b;
import android.support.v4.view.C0650b;
import android.support.v7.view.C0937c;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class C0972k extends C0953c<C0427b> implements MenuItem {
    public Method f3103e;

    class C0968a extends C0650b {
        final ActionProvider f3098a;
        final /* synthetic */ C0972k f3099b;

        public C0968a(C0972k c0972k, Context context, ActionProvider actionProvider) {
            this.f3099b = c0972k;
            super(context);
            this.f3098a = actionProvider;
        }

        public boolean hasSubMenu() {
            return this.f3098a.hasSubMenu();
        }

        public View onCreateActionView() {
            return this.f3098a.onCreateActionView();
        }

        public boolean onPerformDefaultAction() {
            return this.f3098a.onPerformDefaultAction();
        }

        public void onPrepareSubMenu(SubMenu subMenu) {
            this.f3098a.onPrepareSubMenu(this.f3099b.m2773a(subMenu));
        }
    }

    static class C0969b extends FrameLayout implements C0937c {
        final CollapsibleActionView f3100a;

        C0969b(View view) {
            super(view.getContext());
            this.f3100a = (CollapsibleActionView) view;
            addView(view);
        }

        public final void onActionViewCollapsed() {
            this.f3100a.onActionViewCollapsed();
        }

        public final void onActionViewExpanded() {
            this.f3100a.onActionViewExpanded();
        }
    }

    private class C0970c extends C0952d<OnActionExpandListener> implements OnActionExpandListener {
        final /* synthetic */ C0972k f3101a;

        C0970c(C0972k c0972k, OnActionExpandListener onActionExpandListener) {
            this.f3101a = c0972k;
            super(onActionExpandListener);
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((OnActionExpandListener) this.d).onMenuItemActionCollapse(this.f3101a.m2772a(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((OnActionExpandListener) this.d).onMenuItemActionExpand(this.f3101a.m2772a(menuItem));
        }
    }

    private class C0971d extends C0952d<OnMenuItemClickListener> implements OnMenuItemClickListener {
        final /* synthetic */ C0972k f3102a;

        C0971d(C0972k c0972k, OnMenuItemClickListener onMenuItemClickListener) {
            this.f3102a = c0972k;
            super(onMenuItemClickListener);
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.d).onMenuItemClick(this.f3102a.m2772a(menuItem));
        }
    }

    C0972k(Context context, C0427b c0427b) {
        super(context, c0427b);
    }

    C0968a mo945a(ActionProvider actionProvider) {
        return new C0968a(this, this.a, actionProvider);
    }

    public boolean collapseActionView() {
        return ((C0427b) this.d).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0427b) this.d).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0650b a = ((C0427b) this.d).mo897a();
        return a instanceof C0968a ? ((C0968a) a).f3098a : null;
    }

    public View getActionView() {
        View actionView = ((C0427b) this.d).getActionView();
        return actionView instanceof C0969b ? (View) ((C0969b) actionView).f3100a : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((C0427b) this.d).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((C0427b) this.d).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((C0427b) this.d).getContentDescription();
    }

    public int getGroupId() {
        return ((C0427b) this.d).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0427b) this.d).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((C0427b) this.d).getIconTintList();
    }

    public Mode getIconTintMode() {
        return ((C0427b) this.d).getIconTintMode();
    }

    public Intent getIntent() {
        return ((C0427b) this.d).getIntent();
    }

    public int getItemId() {
        return ((C0427b) this.d).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0427b) this.d).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((C0427b) this.d).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((C0427b) this.d).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0427b) this.d).getOrder();
    }

    public SubMenu getSubMenu() {
        return m2773a(((C0427b) this.d).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0427b) this.d).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0427b) this.d).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((C0427b) this.d).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((C0427b) this.d).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0427b) this.d).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0427b) this.d).isCheckable();
    }

    public boolean isChecked() {
        return ((C0427b) this.d).isChecked();
    }

    public boolean isEnabled() {
        return ((C0427b) this.d).isEnabled();
    }

    public boolean isVisible() {
        return ((C0427b) this.d).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0427b) this.d).mo895a(actionProvider != null ? mo945a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0427b) this.d).setActionView(i);
        View actionView = ((C0427b) this.d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0427b) this.d).setActionView(new C0969b(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0969b(view);
        }
        ((C0427b) this.d).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0427b) this.d).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0427b) this.d).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0427b) this.d).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0427b) this.d).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0427b) this.d).mo896a(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0427b) this.d).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0427b) this.d).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0427b) this.d).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0427b) this.d).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C0427b) this.d).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0427b) this.d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0427b) this.d).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0427b) this.d).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((C0427b) this.d).setOnActionExpandListener(onActionExpandListener != null ? new C0970c(this, onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((C0427b) this.d).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0971d(this, onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0427b) this.d).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0427b) this.d).setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0427b) this.d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0427b) this.d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0427b) this.d).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0427b) this.d).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0427b) this.d).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0427b) this.d).mo898b(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0427b) this.d).setVisible(z);
    }
}
