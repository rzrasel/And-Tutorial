package android.support.transition;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ax extends aw {
    private static Method f1312a;
    private static boolean f1313b;
    private static Method f1314c;
    private static boolean f1315d;

    ax() {
    }

    public final void mo242a(View view, float f) {
        if (!f1313b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f1312a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            f1313b = true;
        }
        if (f1312a != null) {
            try {
                f1312a.invoke(view, new Object[]{Float.valueOf(f)});
                return;
            } catch (IllegalAccessException e2) {
                return;
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        view.setAlpha(f);
    }

    public final float mo247c(View view) {
        if (!f1315d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f1314c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            f1315d = true;
        }
        if (f1314c != null) {
            try {
                return ((Float) f1314c.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        return super.mo247c(view);
    }

    public final void mo249d(View view) {
    }

    public final void mo250e(View view) {
    }
}
