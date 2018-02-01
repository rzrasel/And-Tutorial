package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

public final class C0659e {
    static final C0657b f1961a;
    private static Field f1962b;
    private static boolean f1963c;

    static class C0657b {
        C0657b() {
        }

        public void mo633a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                C0659e.m1747a(layoutInflater, (Factory2) factory);
            } else {
                C0659e.m1747a(layoutInflater, factory2);
            }
        }
    }

    static class C0658a extends C0657b {
        C0658a() {
        }

        public final void mo633a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1961a = new C0658a();
        } else {
            f1961a = new C0657b();
        }
    }

    static void m1747a(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f1963c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f1962b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ").append(LayoutInflater.class.getName()).append("; inflation may have unexpected results.");
            }
            f1963c = true;
        }
        if (f1962b != null) {
            try {
                f1962b.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ").append(layoutInflater).append("; inflation may have unexpected results.");
            }
        }
    }

    public static void m1748b(LayoutInflater layoutInflater, Factory2 factory2) {
        f1961a.mo633a(layoutInflater, factory2);
    }
}
