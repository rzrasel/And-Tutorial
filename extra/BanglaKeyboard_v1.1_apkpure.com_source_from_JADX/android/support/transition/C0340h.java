package android.support.transition;

import android.graphics.Matrix;
import android.support.transition.C0337i.C0335a;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class C0340h implements C0337i {
    static Class<?> f1338a;
    static Method f1339b;
    static boolean f1340c;
    static Method f1341d;
    static boolean f1342e;
    private static boolean f1343f;
    private final View f1344g;

    static class C0339a implements C0335a {
        C0339a() {
        }

        public final C0337i mo254a(View view, ViewGroup viewGroup, Matrix matrix) {
            if (!C0340h.f1340c) {
                try {
                    C0340h.m977a();
                    Method declaredMethod = C0340h.f1338a.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                    C0340h.f1339b = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                }
                C0340h.f1340c = true;
            }
            if (C0340h.f1339b != null) {
                try {
                    return new C0340h((View) C0340h.f1339b.invoke(null, new Object[]{view, viewGroup, matrix}));
                } catch (IllegalAccessException e2) {
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException(e3.getCause());
                }
            }
            return null;
        }

        public final void mo255a(View view) {
            if (!C0340h.f1342e) {
                try {
                    C0340h.m977a();
                    Method declaredMethod = C0340h.f1338a.getDeclaredMethod("removeGhost", new Class[]{View.class});
                    C0340h.f1341d = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                }
                C0340h.f1342e = true;
            }
            if (C0340h.f1341d != null) {
                try {
                    C0340h.f1341d.invoke(null, new Object[]{view});
                } catch (IllegalAccessException e2) {
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException(e3.getCause());
                }
            }
        }
    }

    private C0340h(View view) {
        this.f1344g = view;
    }

    static void m977a() {
        if (!f1343f) {
            try {
                f1338a = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e) {
            }
            f1343f = true;
        }
    }

    public final void mo256a(ViewGroup viewGroup, View view) {
    }

    public final void setVisibility(int i) {
        this.f1344g.setVisibility(i);
    }
}
