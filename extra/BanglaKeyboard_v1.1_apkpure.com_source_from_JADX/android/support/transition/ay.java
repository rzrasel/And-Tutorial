package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ay extends ax {
    private static Method f1316a;
    private static boolean f1317b;
    private static Method f1318c;
    private static boolean f1319d;
    private static Method f1320e;
    private static boolean f1321f;

    ay() {
    }

    public final void mo244a(View view, Matrix matrix) {
        if (!f1317b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f1316a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            f1317b = true;
        }
        if (f1316a != null) {
            try {
                f1316a.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    public final void mo246b(View view, Matrix matrix) {
        if (!f1319d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f1318c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            f1319d = true;
        }
        if (f1318c != null) {
            try {
                f1318c.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    public final void mo248c(View view, Matrix matrix) {
        if (!f1321f) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setAnimationMatrix", new Class[]{Matrix.class});
                f1320e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            f1321f = true;
        }
        if (f1320e != null) {
            try {
                f1320e.invoke(view, new Object[]{matrix});
            } catch (InvocationTargetException e2) {
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }
}
