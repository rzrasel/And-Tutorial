package android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class C0021e {
    private static C0019c f20a = new C0019c();
    private static C0020d f21b = null;

    static <T extends C0043k> T m18a() {
        return null;
    }

    static <T extends C0043k> T m19a(C0020d c0020d, View view, int i) {
        return C0019c.m17a(c0020d, view, i);
    }

    public static <T extends C0043k> T m20a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        return C0019c.m17a(f21b, layoutInflater.inflate(i, viewGroup, false), i);
    }
}
