package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.p015a.C0438c;
import android.support.v4.p018f.C0477m;
import android.support.v7.preference.C0935f.C0934d;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;

public abstract class PreferenceGroup extends Preference {
    List<Preference> f2796a;
    private boolean f2797b;
    private int f2798c;
    private boolean f2799d;
    private final C0477m<String, Long> f2800e;
    private final Handler f2801f;
    private final Runnable f2802g;

    class C09151 implements Runnable {
        final /* synthetic */ PreferenceGroup f2819a;

        C09151(PreferenceGroup preferenceGroup) {
            this.f2819a = preferenceGroup;
        }

        public final void run() {
            synchronized (this) {
                this.f2819a.f2800e.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
        this.f2797b = true;
        this.f2798c = 0;
        this.f2799d = false;
        this.f2800e = new C0477m();
        this.f2801f = new Handler();
        this.f2802g = new C09151(this);
        this.f2796a = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934d.PreferenceGroup, i, 0);
        this.f2797b = C0438c.m1165a(obtainStyledAttributes, C0934d.PreferenceGroup_orderingFromXml, C0934d.PreferenceGroup_orderingFromXml, true);
        obtainStyledAttributes.recycle();
    }

    public final Preference m2659a(CharSequence charSequence) {
        if (TextUtils.equals(this.f2739o, charSequence)) {
            return this;
        }
        int i = mo873i();
        for (int i2 = 0; i2 < i; i2++) {
            Preference b = m2662b(i2);
            String str = b.f2739o;
            if (str != null && str.equals(charSequence)) {
                return b;
            }
            if (b instanceof PreferenceGroup) {
                b = ((PreferenceGroup) b).m2659a(charSequence);
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    protected final void mo868a(Bundle bundle) {
        super.mo868a(bundle);
        int i = mo873i();
        for (int i2 = 0; i2 < i; i2++) {
            m2662b(i2).mo868a(bundle);
        }
    }

    public final void mo869a(boolean z) {
        super.mo869a(z);
        int i = mo873i();
        for (int i2 = 0; i2 < i; i2++) {
            m2662b(i2).m2595b(z);
        }
    }

    public final Preference m2662b(int i) {
        return (Preference) this.f2796a.get(i);
    }

    protected final void mo870b(Bundle bundle) {
        super.mo870b(bundle);
        int i = mo873i();
        for (int i2 = 0; i2 < i; i2++) {
            m2662b(i2).mo870b(bundle);
        }
    }

    public final void mo871g() {
        super.mo871g();
        this.f2799d = true;
        int i = mo873i();
        for (int i2 = 0; i2 < i; i2++) {
            m2662b(i2).mo871g();
        }
    }

    public final void mo872h() {
        int i = 0;
        super.mo872h();
        this.f2799d = false;
        int i2 = mo873i();
        while (i < i2) {
            m2662b(i).mo872h();
            i++;
        }
    }

    public final int mo873i() {
        return this.f2796a.size();
    }

    protected boolean mo874j() {
        return true;
    }
}
