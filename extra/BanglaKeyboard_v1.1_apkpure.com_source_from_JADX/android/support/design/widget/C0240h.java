package android.support.design.widget;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import java.lang.reflect.Method;

final class C0240h {
    private static Method f1008a;
    private static boolean f1009b;

    static boolean m643a(DrawableContainer drawableContainer, ConstantState constantState) {
        if (!f1009b) {
            try {
                Method declaredMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainerState.class});
                f1008a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            f1009b = true;
        }
        if (f1008a != null) {
            try {
                f1008a.invoke(drawableContainer, new Object[]{constantState});
                return true;
            } catch (Exception e2) {
            }
        }
        return false;
    }
}
