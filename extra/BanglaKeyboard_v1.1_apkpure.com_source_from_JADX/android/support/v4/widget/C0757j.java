package android.support.v4.widget;

import android.os.Build.VERSION;
import android.support.v4.view.C0656d;
import android.support.v4.view.C0679r;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class C0757j {
    static final C0753d f2261a;

    static class C0753d {
        private static Method f2258a;
        private static boolean f2259b;

        C0753d() {
        }

        public void mo722a(PopupWindow popupWindow, int i) {
            if (!f2259b) {
                try {
                    Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                    f2258a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception e) {
                }
                f2259b = true;
            }
            if (f2258a != null) {
                try {
                    f2258a.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                }
            }
        }

        public void mo719a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((C0656d.m1743a(i3, C0679r.m1932e(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        public void mo720a(PopupWindow popupWindow, boolean z) {
        }

        public boolean mo721a(PopupWindow popupWindow) {
            return false;
        }
    }

    static class C0754a extends C0753d {
        C0754a() {
        }

        public final void mo719a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    static class C0755b extends C0754a {
        private static Field f2260a;

        static {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f2260a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
        }

        C0755b() {
        }

        public void mo720a(PopupWindow popupWindow, boolean z) {
            if (f2260a != null) {
                try {
                    f2260a.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                }
            }
        }

        public boolean mo721a(PopupWindow popupWindow) {
            if (f2260a != null) {
                try {
                    return ((Boolean) f2260a.get(popupWindow)).booleanValue();
                } catch (IllegalAccessException e) {
                }
            }
            return false;
        }
    }

    static class C0756c extends C0755b {
        C0756c() {
        }

        public final void mo722a(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }

        public final void mo720a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        public final boolean mo721a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            f2261a = new C0756c();
        } else if (VERSION.SDK_INT >= 21) {
            f2261a = new C0755b();
        } else if (VERSION.SDK_INT >= 19) {
            f2261a = new C0754a();
        } else {
            f2261a = new C0753d();
        }
    }

    public static void m2173a(PopupWindow popupWindow, int i) {
        f2261a.mo722a(popupWindow, i);
    }

    public static void m2174a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f2261a.mo719a(popupWindow, view, i, i2, i3);
    }

    public static void m2175a(PopupWindow popupWindow, boolean z) {
        f2261a.mo720a(popupWindow, z);
    }

    public static boolean m2176a(PopupWindow popupWindow) {
        return f2261a.mo721a(popupWindow);
    }
}
