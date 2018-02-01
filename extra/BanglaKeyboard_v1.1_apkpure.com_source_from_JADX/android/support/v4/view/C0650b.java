package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class C0650b {
    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private C0644a mSubUiVisibilityListener;
    private C0645b mVisibilityListener;

    public interface C0644a {
        void onSubUiVisibilityChanged(boolean z);
    }

    public interface C0645b {
        void mo933a();
    }

    public C0650b(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.mVisibilityListener != null && overridesItemVisibility()) {
            C0645b c0645b = this.mVisibilityListener;
            isVisible();
            c0645b.mo933a();
        }
    }

    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    public void setSubUiVisibilityListener(C0644a c0644a) {
        this.mSubUiVisibilityListener = c0644a;
    }

    public void setVisibilityListener(C0645b c0645b) {
        if (!(this.mVisibilityListener == null || c0645b == null)) {
            Log.w(TAG, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.mVisibilityListener = c0645b;
    }

    public void subUiVisibilityChanged(boolean z) {
        if (this.mSubUiVisibilityListener != null) {
            this.mSubUiVisibilityListener.onSubUiVisibilityChanged(z);
        }
    }
}
