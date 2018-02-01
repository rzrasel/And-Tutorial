package android.support.v4.view;

import android.database.DataSetObserver;

final class ad extends DataSetObserver implements bn, bo {
    final /* synthetic */ PagerTitleStrip f164a;
    private int f165b;

    private ad(PagerTitleStrip pagerTitleStrip) {
        this.f164a = pagerTitleStrip;
    }

    public final void mo203a() {
        float f = 0.0f;
        if (this.f165b == 0) {
            this.f164a.m59a(this.f164a.f58a.getCurrentItem(), this.f164a.f58a.getAdapter());
            if (this.f164a.f64g >= 0.0f) {
                f = this.f164a.f64g;
            }
            this.f164a.mo145a(this.f164a.f58a.getCurrentItem(), f, true);
        }
    }

    public final void mo204a(int i) {
        this.f165b = i;
    }

    public final void mo205a(int i, float f) {
        if (f > 0.5f) {
            i++;
        }
        this.f164a.mo145a(i, f, false);
    }

    public final void mo206a(aa aaVar, aa aaVar2) {
        this.f164a.m60a(aaVar, aaVar2);
    }

    public final void onChanged() {
        float f = 0.0f;
        this.f164a.m59a(this.f164a.f58a.getCurrentItem(), this.f164a.f58a.getAdapter());
        if (this.f164a.f64g >= 0.0f) {
            f = this.f164a.f64g;
        }
        this.f164a.mo145a(this.f164a.f58a.getCurrentItem(), f, true);
    }
}
