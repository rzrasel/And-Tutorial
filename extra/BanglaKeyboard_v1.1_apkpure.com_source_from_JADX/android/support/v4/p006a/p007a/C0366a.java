package android.support.v4.p006a.p007a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class C0366a {
    static final C0361e f1365a;

    static class C0361e {
        C0361e() {
        }

        public int mo263a(Drawable drawable) {
            return 0;
        }

        public void mo269a(Drawable drawable, float f, float f2) {
        }

        public void mo270a(Drawable drawable, int i, int i2, int i3, int i4) {
        }

        public void mo271a(Drawable drawable, ColorStateList colorStateList) {
            if (drawable instanceof C0060f) {
                ((C0060f) drawable).setTintList(colorStateList);
            }
        }

        public void mo272a(Drawable drawable, Theme theme) {
        }

        public void mo273a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }

        public void mo274a(Drawable drawable, Mode mode) {
            if (drawable instanceof C0060f) {
                ((C0060f) drawable).setTintMode(mode);
            }
        }

        public void mo265a(Drawable drawable, boolean z) {
        }

        public boolean mo264a(Drawable drawable, int i) {
            return false;
        }

        public void mo275b(Drawable drawable, int i) {
            if (drawable instanceof C0060f) {
                ((C0060f) drawable).setTint(i);
            }
        }

        public boolean mo266b(Drawable drawable) {
            return false;
        }

        public Drawable mo267c(Drawable drawable) {
            return !(drawable instanceof C0060f) ? new C0370c(drawable) : drawable;
        }

        public int mo268d(Drawable drawable) {
            return 0;
        }

        public boolean mo276e(Drawable drawable) {
            return false;
        }

        public ColorFilter mo277f(Drawable drawable) {
            return null;
        }

        public void mo278g(Drawable drawable) {
            drawable.clearColorFilter();
        }
    }

    static class C0362a extends C0361e {
        private static Method f1361a;
        private static boolean f1362b;
        private static Method f1363c;
        private static boolean f1364d;

        C0362a() {
        }

        public int mo263a(Drawable drawable) {
            if (!f1364d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f1363c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                }
                f1364d = true;
            }
            if (f1363c != null) {
                try {
                    return ((Integer) f1363c.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    f1363c = null;
                }
            }
            return 0;
        }

        public boolean mo264a(Drawable drawable, int i) {
            if (!f1362b) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f1361a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                }
                f1362b = true;
            }
            if (f1361a != null) {
                try {
                    f1361a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception e2) {
                    f1361a = null;
                }
            }
            return false;
        }
    }

    static class C0363b extends C0362a {
        C0363b() {
        }

        public final void mo265a(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }

        public final boolean mo266b(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        public Drawable mo267c(Drawable drawable) {
            return !(drawable instanceof C0060f) ? new C0372d(drawable) : drawable;
        }

        public final int mo268d(Drawable drawable) {
            return drawable.getAlpha();
        }
    }

    static class C0364c extends C0363b {
        C0364c() {
        }

        public final void mo269a(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        public final void mo270a(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        public final void mo271a(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public final void mo272a(Drawable drawable, Theme theme) {
            drawable.applyTheme(theme);
        }

        public final void mo273a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public final void mo274a(Drawable drawable, Mode mode) {
            drawable.setTintMode(mode);
        }

        public final void mo275b(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        public Drawable mo267c(Drawable drawable) {
            return !(drawable instanceof C0060f) ? new C0374e(drawable) : drawable;
        }

        public final boolean mo276e(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public final ColorFilter mo277f(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public void mo278g(Drawable drawable) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                mo278g(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof C0367b) {
                mo278g(((C0367b) drawable).mo280a());
            } else if (drawable instanceof DrawableContainer) {
                DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        Drawable child = drawableContainerState.getChild(i);
                        if (child != null) {
                            mo278g(child);
                        }
                    }
                }
            }
        }
    }

    static class C0365d extends C0364c {
        C0365d() {
        }

        public final int mo263a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        public final boolean mo264a(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }

        public final Drawable mo267c(Drawable drawable) {
            return drawable;
        }

        public final void mo278g(Drawable drawable) {
            drawable.clearColorFilter();
        }
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            f1365a = new C0365d();
        } else if (VERSION.SDK_INT >= 21) {
            f1365a = new C0364c();
        } else if (VERSION.SDK_INT >= 19) {
            f1365a = new C0363b();
        } else if (VERSION.SDK_INT >= 17) {
            f1365a = new C0362a();
        } else {
            f1365a = new C0361e();
        }
    }

    public static void m1039a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void m1040a(Drawable drawable, float f, float f2) {
        f1365a.mo269a(drawable, f, f2);
    }

    public static void m1041a(Drawable drawable, int i) {
        f1365a.mo275b(drawable, i);
    }

    public static void m1042a(Drawable drawable, int i, int i2, int i3, int i4) {
        f1365a.mo270a(drawable, i, i2, i3, i4);
    }

    public static void m1043a(Drawable drawable, ColorStateList colorStateList) {
        f1365a.mo271a(drawable, colorStateList);
    }

    public static void m1044a(Drawable drawable, Theme theme) {
        f1365a.mo272a(drawable, theme);
    }

    public static void m1045a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        f1365a.mo273a(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static void m1046a(Drawable drawable, Mode mode) {
        f1365a.mo274a(drawable, mode);
    }

    public static void m1047a(Drawable drawable, boolean z) {
        f1365a.mo265a(drawable, z);
    }

    public static boolean m1048b(Drawable drawable) {
        return f1365a.mo266b(drawable);
    }

    public static boolean m1049b(Drawable drawable, int i) {
        return f1365a.mo264a(drawable, i);
    }

    public static int m1050c(Drawable drawable) {
        return f1365a.mo268d(drawable);
    }

    public static boolean m1051d(Drawable drawable) {
        return f1365a.mo276e(drawable);
    }

    public static ColorFilter m1052e(Drawable drawable) {
        return f1365a.mo277f(drawable);
    }

    public static void m1053f(Drawable drawable) {
        f1365a.mo278g(drawable);
    }

    public static Drawable m1054g(Drawable drawable) {
        return f1365a.mo267c(drawable);
    }

    public static <T extends Drawable> T m1055h(Drawable drawable) {
        return drawable instanceof C0367b ? ((C0367b) drawable).mo280a() : drawable;
    }

    public static int m1056i(Drawable drawable) {
        return f1365a.mo263a(drawable);
    }
}
