package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

final class C0356v implements C0355x {
    C0356v() {
    }

    public final PropertyValuesHolder mo262a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofFloat(new C0353t(property, path), new float[]{0.0f, 1.0f});
    }
}
