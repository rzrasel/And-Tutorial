package android.support.v7.view.menu;

import android.content.Context;
import android.os.Parcelable;

public interface C0121o {

    public interface C0803a {
        void onCloseMenu(C0131h c0131h, boolean z);

        boolean onOpenSubMenu(C0131h c0131h);
    }

    boolean collapseItemActionView(C0131h c0131h, C0967j c0967j);

    boolean expandItemActionView(C0131h c0131h, C0967j c0967j);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, C0131h c0131h);

    void onCloseMenu(C0131h c0131h, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(C0146u c0146u);

    void setCallback(C0803a c0803a);

    void updateMenuView(boolean z);
}
