package android.support.v4.widget;

import android.database.DataSetObserver;

final class C0107f extends DataSetObserver {
    final /* synthetic */ C0105d f334a;

    private C0107f(C0105d c0105d) {
        this.f334a = c0105d;
    }

    public final void onChanged() {
        this.f334a.mDataValid = true;
        this.f334a.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        this.f334a.mDataValid = false;
        this.f334a.notifyDataSetInvalidated();
    }
}
