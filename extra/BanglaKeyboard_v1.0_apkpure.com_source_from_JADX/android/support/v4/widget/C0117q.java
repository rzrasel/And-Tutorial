package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

final class C0117q implements C0115r {
    C0117q() {
    }

    public final Object mo288a(Context context) {
        return new EdgeEffect(context);
    }

    public final void mo289a(Object obj, int i, int i2) {
        ((EdgeEffect) obj).setSize(i, i2);
    }

    public final boolean mo290a(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    public final boolean mo291a(Object obj, float f) {
        ((EdgeEffect) obj).onPull(f);
        return true;
    }

    public final boolean mo292a(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }

    public final void mo293b(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    public final boolean mo294c(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }
}
