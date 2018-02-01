package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.p002a.C0049a;
import android.support.v4.view.p002a.C0056h;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class C0075a {
    private static final C0076d f159b;
    private static final Object f160c = f159b.mo228a();
    final Object f161a = f159b.mo229a(this);

    static {
        if (VERSION.SDK_INT >= 16) {
            f159b = new C0081e();
        } else if (VERSION.SDK_INT >= 14) {
            f159b = new C0078b();
        } else {
            f159b = new C0077g();
        }
    }

    public static C0056h m298a(View view) {
        return f159b.mo227a(f160c, view);
    }

    public static void m299a(View view, int i) {
        f159b.mo230a(f160c, view, i);
    }

    public static void m300a(View view, AccessibilityEvent accessibilityEvent) {
        f159b.mo237d(f160c, view, accessibilityEvent);
    }

    public static void m301c(View view, AccessibilityEvent accessibilityEvent) {
        f159b.mo236c(f160c, view, accessibilityEvent);
    }

    final Object m302a() {
        return this.f161a;
    }

    public void mo239a(View view, C0049a c0049a) {
        f159b.mo231a(f160c, view, c0049a);
    }

    public boolean mo240a(View view, int i, Bundle bundle) {
        return f159b.mo232a(f160c, view, i, bundle);
    }

    public boolean mo285a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f159b.mo234a(f160c, viewGroup, view, accessibilityEvent);
    }

    public boolean mo286b(View view, AccessibilityEvent accessibilityEvent) {
        return f159b.mo233a(f160c, view, accessibilityEvent);
    }

    public void mo241d(View view, AccessibilityEvent accessibilityEvent) {
        f159b.mo235b(f160c, view, accessibilityEvent);
    }
}
