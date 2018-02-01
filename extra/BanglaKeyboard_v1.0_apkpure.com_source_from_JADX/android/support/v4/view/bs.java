package android.support.v4.view;

import android.support.v4.view.ViewPager.LayoutParams;
import android.view.View;
import java.util.Comparator;

final class bs implements Comparator {
    bs() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        LayoutParams layoutParams = (LayoutParams) ((View) obj).getLayoutParams();
        LayoutParams layoutParams2 = (LayoutParams) ((View) obj2).getLayoutParams();
        return layoutParams.f88a != layoutParams2.f88a ? layoutParams.f88a ? 1 : -1 : layoutParams.f92e - layoutParams2.f92e;
    }
}
