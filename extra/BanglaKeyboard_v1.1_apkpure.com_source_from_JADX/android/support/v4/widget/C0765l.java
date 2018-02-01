package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.TextView;
import java.lang.reflect.Field;

public final class C0765l {
    static final C0759f f2266a;

    static class C0759f {
        private static Field f2262a;
        private static boolean f2263b;
        private static Field f2264c;
        private static boolean f2265d;

        C0759f() {
        }

        private static int m2177a(Field field, TextView textView) {
            try {
                return field.getInt(textView);
            } catch (IllegalAccessException e) {
                new StringBuilder("Could not retrieve value of ").append(field.getName()).append(" field.");
                return -1;
            }
        }

        private static Field m2178a(String str) {
            Field field = null;
            try {
                field = TextView.class.getDeclaredField(str);
                field.setAccessible(true);
                return field;
            } catch (NoSuchFieldException e) {
                new StringBuilder("Could not retrieve ").append(str).append(" field.");
                return field;
            }
        }

        public int mo725a(TextView textView) {
            if (!f2265d) {
                f2264c = C0759f.m2178a("mMaxMode");
                f2265d = true;
            }
            if (f2264c != null && C0759f.m2177a(f2264c, textView) == 1) {
                if (!f2263b) {
                    f2262a = C0759f.m2178a("mMaximum");
                    f2263b = true;
                }
                if (f2262a != null) {
                    return C0759f.m2177a(f2262a, textView);
                }
            }
            return -1;
        }

        public void mo728a(TextView textView, int i) {
            textView.setTextAppearance(textView.getContext(), i);
        }

        public void mo726a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }

        public Drawable[] mo727b(TextView textView) {
            return textView.getCompoundDrawables();
        }
    }

    static class C0760a extends C0759f {
        C0760a() {
        }

        public final int mo725a(TextView textView) {
            return textView.getMaxLines();
        }
    }

    static class C0761b extends C0760a {
        C0761b() {
        }

        public void mo726a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            Object obj = textView.getLayoutDirection() == 1 ? 1 : null;
            Drawable drawable5 = obj != null ? drawable3 : drawable;
            if (obj == null) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }

        public Drawable[] mo727b(TextView textView) {
            int i = 1;
            if (textView.getLayoutDirection() != 1) {
                i = 0;
            }
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (i != 0) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
    }

    static class C0762c extends C0761b {
        C0762c() {
        }

        public final void mo726a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        public final Drawable[] mo727b(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
    }

    static class C0763d extends C0762c {
        C0763d() {
        }

        public final void mo728a(TextView textView, int i) {
            textView.setTextAppearance(i);
        }
    }

    static class C0764e extends C0763d {
        C0764e() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f2266a = new C0764e();
        } else if (VERSION.SDK_INT >= 23) {
            f2266a = new C0763d();
        } else if (VERSION.SDK_INT >= 18) {
            f2266a = new C0762c();
        } else if (VERSION.SDK_INT >= 17) {
            f2266a = new C0761b();
        } else if (VERSION.SDK_INT >= 16) {
            f2266a = new C0760a();
        } else {
            f2266a = new C0759f();
        }
    }

    public static int m2189a(TextView textView) {
        return f2266a.mo725a(textView);
    }

    public static void m2190a(TextView textView, int i) {
        f2266a.mo728a(textView, i);
    }

    public static void m2191a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        f2266a.mo726a(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static Drawable[] m2192b(TextView textView) {
        return f2266a.mo727b(textView);
    }
}
