package android.support.design.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.transition.ae;
import android.support.v7.view.menu.C0121o;
import android.support.v7.view.menu.C0121o.C0803a;
import android.support.v7.view.menu.C0131h;
import android.support.v7.view.menu.C0146u;
import android.support.v7.view.menu.C0967j;
import android.view.MenuItem;
import android.view.ViewGroup;

public final class BottomNavigationPresenter implements C0121o {
    public BottomNavigationMenuView f458a;
    public boolean f459b = false;
    public int f460c;
    private C0131h f461d;

    static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C01201();
        int f457a;

        static class C01201 implements Creator<SavedState> {
            C01201() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f457a = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f457a);
        }
    }

    public final boolean collapseItemActionView(C0131h c0131h, C0967j c0967j) {
        return false;
    }

    public final boolean expandItemActionView(C0131h c0131h, C0967j c0967j) {
        return false;
    }

    public final boolean flagActionItems() {
        return false;
    }

    public final int getId() {
        return this.f460c;
    }

    public final void initForMenu(Context context, C0131h c0131h) {
        this.f458a.initialize(this.f461d);
        this.f461d = c0131h;
    }

    public final void onCloseMenu(C0131h c0131h, boolean z) {
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            BottomNavigationMenuView bottomNavigationMenuView = this.f458a;
            int i = ((SavedState) parcelable).f457a;
            int size = bottomNavigationMenuView.f445f.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = bottomNavigationMenuView.f445f.getItem(i2);
                if (i == item.getItemId()) {
                    bottomNavigationMenuView.f442c = i;
                    bottomNavigationMenuView.f443d = i2;
                    item.setChecked(true);
                    return;
                }
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState();
        savedState.f457a = this.f458a.getSelectedItemId();
        return savedState;
    }

    public final boolean onSubMenuSelected(C0146u c0146u) {
        return false;
    }

    public final void setCallback(C0803a c0803a) {
    }

    public final void updateMenuView(boolean z) {
        if (!this.f459b) {
            if (z) {
                this.f458a.m232a();
                return;
            }
            ViewGroup viewGroup = this.f458a;
            int size = viewGroup.f445f.size();
            if (size != viewGroup.f441b.length) {
                viewGroup.m232a();
                return;
            }
            int i = viewGroup.f442c;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = viewGroup.f445f.getItem(i2);
                if (item.isChecked()) {
                    viewGroup.f442c = item.getItemId();
                    viewGroup.f443d = i2;
                }
            }
            if (i != viewGroup.f442c) {
                ae.m886a(viewGroup, viewGroup.f440a);
            }
            for (i = 0; i < size; i++) {
                viewGroup.f444e.f459b = true;
                viewGroup.f441b[i].mo42a((C0967j) viewGroup.f445f.getItem(i));
                viewGroup.f444e.f459b = false;
            }
        }
    }
}
