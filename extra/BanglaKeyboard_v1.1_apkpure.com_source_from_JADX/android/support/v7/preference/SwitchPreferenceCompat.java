package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.p015a.C0438c;
import android.support.v7.preference.C0935f.C0931a;
import android.support.v7.preference.C0935f.C0932b;
import android.support.v7.preference.C0935f.C0934d;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class SwitchPreferenceCompat extends TwoStatePreference {
    private final C0919a f2838c;
    private CharSequence f2839d;
    private CharSequence f2840e;

    private class C0919a implements OnCheckedChangeListener {
        final /* synthetic */ SwitchPreferenceCompat f2837a;

        private C0919a(SwitchPreferenceCompat switchPreferenceCompat) {
            this.f2837a = switchPreferenceCompat;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Boolean.valueOf(z);
            this.f2837a.mo857d(z);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0931a.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
        this.f2838c = new C0919a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934d.SwitchPreferenceCompat, i, 0);
        m2607a(C0438c.m1164a(obtainStyledAttributes, C0934d.SwitchPreferenceCompat_summaryOn, C0934d.SwitchPreferenceCompat_android_summaryOn));
        m2610b(C0438c.m1164a(obtainStyledAttributes, C0934d.SwitchPreferenceCompat_summaryOff, C0934d.SwitchPreferenceCompat_android_summaryOff));
        this.f2839d = C0438c.m1164a(obtainStyledAttributes, C0934d.SwitchPreferenceCompat_switchTextOn, C0934d.SwitchPreferenceCompat_android_switchTextOn);
        mo862b();
        this.f2840e = C0438c.m1164a(obtainStyledAttributes, C0934d.SwitchPreferenceCompat_switchTextOff, C0934d.SwitchPreferenceCompat_android_switchTextOff);
        mo862b();
        this.f2752b = C0438c.m1165a(obtainStyledAttributes, C0934d.SwitchPreferenceCompat_disableDependentsState, C0934d.SwitchPreferenceCompat_android_disableDependentsState, false);
        obtainStyledAttributes.recycle();
    }

    private void m2697c(View view) {
        if (view instanceof SwitchCompat) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (view instanceof SwitchCompat) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f2839d);
            switchCompat.setTextOff(this.f2840e);
            switchCompat.setOnCheckedChangeListener(this.f2838c);
        }
    }

    public final void mo858a(C0930e c0930e) {
        super.mo858a(c0930e);
        m2697c(c0930e.m2715a(C0932b.switchWidget));
        m2608b(c0930e);
    }

    protected final void mo859a(View view) {
        super.mo859a(view);
        if (((AccessibilityManager) this.f2734j.getSystemService("accessibility")).isEnabled()) {
            m2697c(view.findViewById(C0932b.switchWidget));
            m2609b(view.findViewById(16908304));
        }
    }
}
