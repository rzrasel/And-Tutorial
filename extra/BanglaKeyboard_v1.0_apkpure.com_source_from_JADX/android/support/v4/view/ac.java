package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;

final class ac implements OnClickListener {
    final /* synthetic */ PagerTabStrip f163a;

    ac(PagerTabStrip pagerTabStrip) {
        this.f163a = pagerTabStrip;
    }

    public final void onClick(View view) {
        this.f163a.a.setCurrentItem(this.f163a.a.getCurrentItem() + 1);
    }
}
