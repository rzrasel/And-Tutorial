package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public final class C0739d {
    private static final C0736c f2251a;

    static class C0736c {
        private static Field f2249a;
        private static boolean f2250b;

        C0736c() {
        }

        public Drawable mo707a(CompoundButton compoundButton) {
            if (!f2250b) {
                try {
                    Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    f2249a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                }
                f2250b = true;
            }
            if (f2249a != null) {
                try {
                    return (Drawable) f2249a.get(compoundButton);
                } catch (IllegalAccessException e2) {
                    f2249a = null;
                }
            }
            return null;
        }

        public void mo705a(CompoundButton compoundButton, ColorStateList colorStateList) {
            if (compoundButton instanceof C0766m) {
                ((C0766m) compoundButton).setSupportButtonTintList(colorStateList);
            }
        }

        public void mo706a(CompoundButton compoundButton, Mode mode) {
            if (compoundButton instanceof C0766m) {
                ((C0766m) compoundButton).setSupportButtonTintMode(mode);
            }
        }
    }

    static class C0737a extends C0736c {
        C0737a() {
        }

        public final void mo705a(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        public final void mo706a(CompoundButton compoundButton, Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    static class C0738b extends C0737a {
        C0738b() {
        }

        public final Drawable mo707a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            f2251a = new C0738b();
        } else if (VERSION.SDK_INT >= 21) {
            f2251a = new C0737a();
        } else {
            f2251a = new C0736c();
        }
    }

    public static Drawable m2139a(CompoundButton compoundButton) {
        return f2251a.mo707a(compoundButton);
    }

    public static void m2140a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f2251a.mo705a(compoundButton, colorStateList);
    }

    public static void m2141a(CompoundButton compoundButton, Mode mode) {
        f2251a.mo706a(compoundButton, mode);
    }
}
