package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

final class C0349p {
    private static final C0350s f1352a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f1352a = new C0352r();
        } else {
            f1352a = new C0351q();
        }
    }

    static <T> ObjectAnimator m994a(T t, Property<T, PointF> property, Path path) {
        return f1352a.mo261a(t, property, path);
    }
}
