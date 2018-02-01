package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.p015a.C0438c;
import android.support.v7.preference.C0935f.C0931a;
import android.support.v7.preference.C0935f.C0934d;
import android.util.AttributeSet;

public abstract class DialogPreference extends Preference {
    CharSequence f2757a;
    CharSequence f2758b;
    Drawable f2759c;
    CharSequence f2760d;
    CharSequence f2761e;
    int f2762f;

    public interface C0896a {
        Preference mo879a(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0438c.m1158a(context, C0931a.dialogPreferenceStyle, 16842897));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934d.DialogPreference, i, 0);
        this.f2757a = C0438c.m1164a(obtainStyledAttributes, C0934d.DialogPreference_dialogTitle, C0934d.DialogPreference_android_dialogTitle);
        if (this.f2757a == null) {
            this.f2757a = this.f2738n;
        }
        this.f2758b = C0438c.m1164a(obtainStyledAttributes, C0934d.DialogPreference_dialogMessage, C0934d.DialogPreference_android_dialogMessage);
        int i2 = C0934d.DialogPreference_dialogIcon;
        int i3 = C0934d.DialogPreference_android_dialogIcon;
        Drawable drawable = obtainStyledAttributes.getDrawable(i2);
        if (drawable == null) {
            drawable = obtainStyledAttributes.getDrawable(i3);
        }
        this.f2759c = drawable;
        this.f2760d = C0438c.m1164a(obtainStyledAttributes, C0934d.DialogPreference_positiveButtonText, C0934d.DialogPreference_android_positiveButtonText);
        this.f2761e = C0438c.m1164a(obtainStyledAttributes, C0934d.DialogPreference_negativeButtonText, C0934d.DialogPreference_android_negativeButtonText);
        this.f2762f = C0438c.m1159a(obtainStyledAttributes, C0934d.DialogPreference_dialogLayout, C0934d.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    protected void mo853a() {
        C0927c c0927c = this.f2735k;
        if (c0927c.f2862f != null) {
            c0927c.f2862f.mo882b(this);
        }
    }
}
