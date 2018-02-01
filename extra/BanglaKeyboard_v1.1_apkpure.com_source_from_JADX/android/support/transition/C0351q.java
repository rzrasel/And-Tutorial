package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

final class C0351q implements C0350s {
    C0351q() {
    }

    public final <T> ObjectAnimator mo261a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofFloat(t, new C0353t(property, path), new float[]{0.0f, 1.0f});
    }
}
