package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

final class C0121v implements C0120u {
    C0121v() {
    }

    public final Object mo297a(Context context, Interpolator interpolator) {
        return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
    }

    public final void mo298a(Object obj, int i, int i2, int i3, int i4, int i5) {
        ((Scroller) obj).startScroll(i, i2, i3, i4, i5);
    }

    public final boolean mo299a(Object obj) {
        return ((Scroller) obj).isFinished();
    }

    public final int mo300b(Object obj) {
        return ((Scroller) obj).getCurrX();
    }

    public final int mo301c(Object obj) {
        return ((Scroller) obj).getCurrY();
    }

    public final boolean mo302d(Object obj) {
        return ((Scroller) obj).computeScrollOffset();
    }

    public final void mo303e(Object obj) {
        ((Scroller) obj).abortAnimation();
    }

    public final int mo304f(Object obj) {
        return ((Scroller) obj).getFinalX();
    }

    public final int mo305g(Object obj) {
        return ((Scroller) obj).getFinalY();
    }
}
