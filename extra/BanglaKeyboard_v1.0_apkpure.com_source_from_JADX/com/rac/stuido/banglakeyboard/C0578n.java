package com.rac.stuido.banglakeyboard;

import android.database.DataSetObserver;

final class C0578n extends DataSetObserver {
    final /* synthetic */ ActivityChooserView f2830a;

    C0578n(ActivityChooserView activityChooserView) {
        this.f2830a = activityChooserView;
    }

    public final void onChanged() {
        super.onChanged();
        this.f2830a.f2515b.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        super.onInvalidated();
        this.f2830a.f2515b.notifyDataSetInvalidated();
    }
}
