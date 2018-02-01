package android.support.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.C0679r;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

final class au {
    static final Property<View, Float> f1306a = new Property<View, Float>(Float.class, "translationAlpha") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(au.m922c((View) obj));
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            au.m916a((View) obj, ((Float) obj2).floatValue());
        }
    };
    static final Property<View, Rect> f1307b = new Property<View, Rect>(Rect.class, "clipBounds") {
        public final /* synthetic */ Object get(Object obj) {
            return C0679r.m1900A((View) obj);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C0679r.m1911a((View) obj, (Rect) obj2);
        }
    };
    private static final ba f1308c;
    private static Field f1309d;
    private static boolean f1310e;

    static {
        if (VERSION.SDK_INT >= 22) {
            f1308c = new az();
        } else if (VERSION.SDK_INT >= 21) {
            f1308c = new ay();
        } else if (VERSION.SDK_INT >= 19) {
            f1308c = new ax();
        } else if (VERSION.SDK_INT >= 18) {
            f1308c = new aw();
        } else {
            f1308c = new av();
        }
    }

    static at m915a(View view) {
        return f1308c.mo241a(view);
    }

    static void m916a(View view, float f) {
        f1308c.mo242a(view, f);
    }

    static void m917a(View view, int i) {
        if (!f1310e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1309d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f1310e = true;
        }
        if (f1309d != null) {
            try {
                f1309d.setInt(view, (f1309d.getInt(view) & -13) | i);
            } catch (IllegalAccessException e2) {
            }
        }
    }

    static void m918a(View view, int i, int i2, int i3, int i4) {
        f1308c.mo243a(view, i, i2, i3, i4);
    }

    static void m919a(View view, Matrix matrix) {
        f1308c.mo244a(view, matrix);
    }

    static be m920b(View view) {
        return f1308c.mo245b(view);
    }

    static void m921b(View view, Matrix matrix) {
        f1308c.mo246b(view, matrix);
    }

    static float m922c(View view) {
        return f1308c.mo247c(view);
    }

    static void m923c(View view, Matrix matrix) {
        f1308c.mo248c(view, matrix);
    }

    static void m924d(View view) {
        f1308c.mo249d(view);
    }

    static void m925e(View view) {
        f1308c.mo250e(view);
    }
}
