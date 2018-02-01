package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

@Deprecated
public final class C0680s {
    private static Method f1986a;

    static {
        if (VERSION.SDK_INT == 25) {
            try {
                f1986a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception e) {
            }
        }
    }

    public static float m1954a(ViewConfiguration viewConfiguration, Context context) {
        return VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : C0680s.m1956c(viewConfiguration, context);
    }

    public static float m1955b(ViewConfiguration viewConfiguration, Context context) {
        return VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : C0680s.m1956c(viewConfiguration, context);
    }

    private static float m1956c(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 25 && f1986a != null) {
            try {
                return (float) ((Integer) f1986a.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception e) {
            }
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(16842829, typedValue, true) ? typedValue.getDimension(context.getResources().getDisplayMetrics()) : 0.0f;
    }
}
