package com.rac.stuido.banglakeyboard;

import android.database.DataSetObserver;

final class C0580p extends DataSetObserver {
    final /* synthetic */ ActivityChooserView f2832a;

    C0580p(ActivityChooserView activityChooserView) {
        this.f2832a = activityChooserView;
    }

    public final void onChanged() {
        super.onChanged();
        ActivityChooserView.m3829c(this.f2832a);
    }
}
