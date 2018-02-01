package android.support.v7.app;

import android.content.res.Resources;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

final class C0839m {
    private static Field f2535a;
    private static boolean f2536b;
    private static Class f2537c;
    private static boolean f2538d;
    private static Field f2539e;
    private static boolean f2540f;
    private static Field f2541g;
    private static boolean f2542h;

    static boolean m2424a(Resources resources) {
        if (!f2536b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2535a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f2536b = true;
        }
        if (f2535a != null) {
            Map map;
            try {
                map = (Map) f2535a.get(resources);
            } catch (IllegalAccessException e2) {
                map = null;
            }
            if (map != null) {
                map.clear();
                return true;
            }
        }
        return false;
    }

    private static boolean m2425a(Object obj) {
        if (!f2538d) {
            try {
                f2537c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
            }
            f2538d = true;
        }
        if (f2537c == null) {
            return false;
        }
        if (!f2540f) {
            try {
                Field declaredField = f2537c.getDeclaredField("mUnthemedEntries");
                f2539e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
            }
            f2540f = true;
        }
        if (f2539e == null) {
            return false;
        }
        LongSparseArray longSparseArray;
        try {
            longSparseArray = (LongSparseArray) f2539e.get(obj);
        } catch (IllegalAccessException e3) {
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }

    static boolean m2426b(Resources resources) {
        if (!f2536b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2535a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f2536b = true;
        }
        Object obj = null;
        if (f2535a != null) {
            try {
                obj = f2535a.get(resources);
            } catch (IllegalAccessException e2) {
            }
        }
        return (obj == null || obj == null || !C0839m.m2425a(obj)) ? false : true;
    }

    static boolean m2427c(Resources resources) {
        Object obj = null;
        if (!f2542h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f2541g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f2542h = true;
        }
        if (f2541g == null) {
            return false;
        }
        Object obj2;
        try {
            obj2 = f2541g.get(resources);
        } catch (IllegalAccessException e2) {
            obj2 = obj;
        }
        if (obj2 == null) {
            return false;
        }
        if (!f2536b) {
            try {
                Field declaredField2 = obj2.getClass().getDeclaredField("mDrawableCache");
                f2535a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e3) {
            }
            f2536b = true;
        }
        if (f2535a != null) {
            try {
                obj = f2535a.get(obj2);
            } catch (IllegalAccessException e4) {
            }
        }
        return obj != null && C0839m.m2425a(obj);
    }
}
