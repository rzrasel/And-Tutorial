package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.p015a.C0438c;
import android.support.v7.preference.C0935f.C0931a;
import android.support.v7.preference.C0935f.C0934d;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class CheckBoxPreference extends TwoStatePreference {
    private final C0895a f2756c;

    private class C0895a implements OnCheckedChangeListener {
        final /* synthetic */ CheckBoxPreference f2715a;

        private C0895a(CheckBoxPreference checkBoxPreference) {
            this.f2715a = checkBoxPreference;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Boolean.valueOf(z);
            this.f2715a.mo857d(z);
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0438c.m1158a(context, C0931a.checkBoxPreferenceStyle, 16842895));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private CheckBoxPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
        this.f2756c = new C0895a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934d.CheckBoxPreference, i, 0);
        m2607a(C0438c.m1164a(obtainStyledAttributes, C0934d.CheckBoxPreference_summaryOn, C0934d.CheckBoxPreference_android_summaryOn));
        m2610b(C0438c.m1164a(obtainStyledAttributes, C0934d.CheckBoxPreference_summaryOff, C0934d.CheckBoxPreference_android_summaryOff));
        this.f2752b = C0438c.m1165a(obtainStyledAttributes, C0934d.CheckBoxPreference_disableDependentsState, C0934d.CheckBoxPreference_android_disableDependentsState, false);
        obtainStyledAttributes.recycle();
    }

    private void m2614c(View view) {
        if (view instanceof CompoundButton) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (view instanceof CompoundButton) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f2756c);
        }
    }

    public final void mo858a(C0930e c0930e) {
        super.mo858a(c0930e);
        m2614c(c0930e.m2715a(16908289));
        m2608b(c0930e);
    }

    protected final void mo859a(View view) {
        super.mo859a(view);
        if (((AccessibilityManager) this.f2734j.getSystemService("accessibility")).isEnabled()) {
            m2614c(view.findViewById(16908289));
            m2609b(view.findViewById(16908304));
        }
    }
}
