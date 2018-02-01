package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

class C0122w implements C0120u {
    C0122w() {
    }

    public final Object mo297a(Context context, Interpolator interpolator) {
        return interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    public final void mo298a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((OverScroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    public final boolean mo299a(Object obj) {
        return ((OverScroller) obj).isFinished();
    }

    public final int mo300b(Object obj) {
        return ((OverScroller) obj).getCurrX();
    }

    public final int mo301c(Object obj) {
        return ((OverScroller) obj).getCurrY();
    }

    public final boolean mo302d(Object obj) {
        return ((OverScroller) obj).computeScrollOffset();
    }

    public final void mo303e(Object obj) {
        ((OverScroller) obj).abortAnimation();
    }

    public final int mo304f(Object obj) {
        return ((OverScroller) obj).getFinalX();
    }

    public final int mo305g(Object obj) {
        return ((OverScroller) obj).getFinalY();
    }
}
