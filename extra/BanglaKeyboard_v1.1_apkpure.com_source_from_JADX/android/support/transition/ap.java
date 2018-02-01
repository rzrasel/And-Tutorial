package android.support.transition;

import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class ap extends ao {
    private static Method f1298a;
    private static boolean f1299b;

    ap() {
    }

    public final am mo239a(ViewGroup viewGroup) {
        return new al(viewGroup);
    }

    public final void mo240a(ViewGroup viewGroup, boolean z) {
        if (!f1299b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f1298a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            f1299b = true;
        }
        if (f1298a != null) {
            try {
                f1298a.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
            }
        }
    }
}
