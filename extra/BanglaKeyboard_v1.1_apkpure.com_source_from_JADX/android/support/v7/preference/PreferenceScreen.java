package android.support.v7.preference;

import android.content.Context;
import android.support.v4.content.p015a.C0438c;
import android.support.v7.preference.C0927c.C0913b;
import android.support.v7.preference.C0935f.C0931a;
import android.util.AttributeSet;

public final class PreferenceScreen extends PreferenceGroup {
    boolean f2820b = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0438c.m1158a(context, C0931a.preferenceScreenStyle, 16842891));
    }

    protected final void mo853a() {
        if (this.f2740p == null && this.f2741q == null && mo873i() != 0) {
            C0913b c0913b = this.f2735k.f2863g;
            if (c0913b != null) {
                c0913b.mo880a();
            }
        }
    }

    protected final boolean mo874j() {
        return false;
    }
}
