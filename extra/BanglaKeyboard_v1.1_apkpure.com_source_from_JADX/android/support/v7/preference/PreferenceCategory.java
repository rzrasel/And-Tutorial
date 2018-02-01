package android.support.v7.preference;

import android.content.Context;
import android.support.v4.content.p015a.C0438c;
import android.support.v4.view.p019a.C0626b;
import android.support.v4.view.p019a.C0626b.C0625l;
import android.support.v7.preference.C0935f.C0931a;
import android.util.AttributeSet;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0438c.m1158a(context, C0931a.preferenceCategoryStyle, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private PreferenceCategory(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
    }

    public final void mo875a(C0626b c0626b) {
        super.mo875a(c0626b);
        Object e = C0626b.f1916a.mo606e(c0626b.f1917b);
        C0625l c0625l = e == null ? null : new C0625l(e);
        if (c0625l != null) {
            c0626b.m1688a(C0625l.m1681a(C0626b.f1916a.mo603c(c0625l.f1915a), C0626b.f1916a.mo605d(c0625l.f1915a), C0626b.f1916a.mo597a(c0625l.f1915a), C0626b.f1916a.mo601b(c0625l.f1915a), true, C0626b.f1916a.mo612e(c0625l.f1915a)));
        }
    }

    public final boolean mo855c() {
        return !super.mo876f();
    }

    public final boolean mo876f() {
        return false;
    }
}
