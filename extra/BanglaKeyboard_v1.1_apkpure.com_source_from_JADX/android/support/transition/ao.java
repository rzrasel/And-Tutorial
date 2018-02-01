package android.support.transition;

import android.animation.LayoutTransition;
import android.support.transition.C0359y.C0358a;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ao implements aq {
    private static LayoutTransition f1293a;
    private static Field f1294b;
    private static boolean f1295c;
    private static Method f1296d;
    private static boolean f1297e;

    class C03251 extends LayoutTransition {
        final /* synthetic */ ao f1292a;

        C03251(ao aoVar) {
            this.f1292a = aoVar;
        }

        public final boolean isChangingLayout() {
            return true;
        }
    }

    ao() {
    }

    public am mo239a(ViewGroup viewGroup) {
        return (ak) ar.m892c(viewGroup);
    }

    public void mo240a(ViewGroup viewGroup, boolean z) {
        int i = 0;
        if (f1293a == null) {
            LayoutTransition c03251 = new C03251(this);
            f1293a = c03251;
            c03251.setAnimator(2, null);
            f1293a.setAnimator(0, null);
            f1293a.setAnimator(1, null);
            f1293a.setAnimator(3, null);
            f1293a.setAnimator(4, null);
        }
        LayoutTransition layoutTransition;
        if (z) {
            layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    if (!f1297e) {
                        try {
                            Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                            f1296d = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                        }
                        f1297e = true;
                    }
                    if (f1296d != null) {
                        try {
                            f1296d.invoke(layoutTransition, new Object[0]);
                        } catch (IllegalAccessException e2) {
                        } catch (InvocationTargetException e3) {
                        }
                    }
                }
                if (layoutTransition != f1293a) {
                    viewGroup.setTag(C0358a.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f1293a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f1295c) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f1294b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
            }
            f1295c = true;
        }
        if (f1294b != null) {
            try {
                i = f1294b.getBoolean(viewGroup);
                if (i != 0) {
                    f1294b.setBoolean(viewGroup, false);
                }
            } catch (IllegalAccessException e5) {
            }
        }
        if (i != 0) {
            viewGroup.requestLayout();
        }
        layoutTransition = (LayoutTransition) viewGroup.getTag(C0358a.transition_layout_save);
        if (layoutTransition != null) {
            viewGroup.setTag(C0358a.transition_layout_save, null);
            viewGroup.setLayoutTransition(layoutTransition);
        }
    }
}
