package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class C0346m implements C0344n {
    private static Method f1349a;
    private static boolean f1350b;

    C0346m() {
    }

    public final void mo258a(ImageView imageView) {
    }

    public final void mo259a(ImageView imageView, Animator animator) {
    }

    public final void mo260a(ImageView imageView, Matrix matrix) {
        if (!f1350b) {
            try {
                Method declaredMethod = ImageView.class.getDeclaredMethod("animateTransform", new Class[]{Matrix.class});
                f1349a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            f1350b = true;
        }
        if (f1349a != null) {
            try {
                f1349a.invoke(imageView, new Object[]{matrix});
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }
}
