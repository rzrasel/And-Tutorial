package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

final class C0354u {
    private static final C0355x f1359a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f1359a = new C0357w();
        } else {
            f1359a = new C0356v();
        }
    }

    static PropertyValuesHolder m998a(Property<?, PointF> property, Path path) {
        return f1359a.mo262a(property, path);
    }
}
