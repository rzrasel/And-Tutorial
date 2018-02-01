package android.support.v4.view;

import android.database.DataSetObserver;

final class bq extends DataSetObserver {
    final /* synthetic */ ViewPager f179a;

    private bq(ViewPager viewPager) {
        this.f179a = viewPager;
    }

    public final void onChanged() {
        this.f179a.m90a();
    }

    public final void onInvalidated() {
        this.f179a.m90a();
    }
}
