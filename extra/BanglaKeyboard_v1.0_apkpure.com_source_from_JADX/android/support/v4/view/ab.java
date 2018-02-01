package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;

final class ab implements OnClickListener {
    final /* synthetic */ PagerTabStrip f162a;

    ab(PagerTabStrip pagerTabStrip) {
        this.f162a = pagerTabStrip;
    }

    public final void onClick(View view) {
        this.f162a.a.setCurrentItem(this.f162a.a.getCurrentItem() - 1);
    }
}
