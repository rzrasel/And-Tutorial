package android.support.v4.widget;

import android.support.v4.widget.DrawerLayout.LayoutParams;
import android.view.View;

final class C0113n implements Runnable {
    final /* synthetic */ C0112m f343a;

    C0113n(C0112m c0112m) {
        this.f343a = c0112m;
    }

    public final void run() {
        View view;
        int i;
        int i2 = 0;
        C0112m c0112m = this.f343a;
        int b = c0112m.f340b.m637b();
        boolean z = c0112m.f339a == 3;
        if (z) {
            View b2 = c0112m.f341c.m535b(3);
            if (b2 != null) {
                i2 = -b2.getWidth();
            }
            i2 += b;
            view = b2;
            i = i2;
        } else {
            i2 = c0112m.f341c.getWidth() - b;
            view = c0112m.f341c.m535b(5);
            i = i2;
        }
        if (view == null) {
            return;
        }
        if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && c0112m.f341c.m529a(view) == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            c0112m.f340b.m636a(view, i, view.getTop());
            layoutParams.f197c = true;
            c0112m.f341c.invalidate();
            c0112m.m659b();
            c0112m.f341c.m540e();
        }
    }
}
