package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.preference.Preference.BaseSavedState;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public abstract class TwoStatePreference extends Preference {
    protected boolean f2751a;
    boolean f2752b;
    private CharSequence f2753c;
    private CharSequence f2754d;
    private boolean f2755e;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C09201();
        boolean f2841a;

        static class C09201 implements Creator<SavedState> {
            C09201() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            boolean z = true;
            super(parcel);
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f2841a = z;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2841a ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
    }

    protected final Object mo852a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    protected final void mo853a() {
        super.mo853a();
        boolean z = !this.f2751a;
        Boolean.valueOf(z);
        mo857d(z);
    }

    protected final void mo854a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.mo854a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo854a(savedState.getSuperState());
        mo857d(savedState.f2841a);
    }

    public final void m2607a(CharSequence charSequence) {
        this.f2753c = charSequence;
        if (this.f2751a) {
            mo862b();
        }
    }

    protected final void m2608b(C0930e c0930e) {
        m2609b(c0930e.m2715a(16908304));
    }

    protected final void m2609b(View view) {
        int i = 0;
        if (view instanceof TextView) {
            int i2;
            TextView textView = (TextView) view;
            int i3 = 1;
            if (this.f2751a && !TextUtils.isEmpty(this.f2753c)) {
                textView.setText(this.f2753c);
                i3 = 0;
            } else if (!(this.f2751a || TextUtils.isEmpty(this.f2754d))) {
                textView.setText(this.f2754d);
                i3 = 0;
            }
            if (i3 != 0) {
                CharSequence e = mo861e();
                if (!TextUtils.isEmpty(e)) {
                    textView.setText(e);
                    i2 = 0;
                    if (i2 != 0) {
                        i = 8;
                    }
                    if (i != textView.getVisibility()) {
                        textView.setVisibility(i);
                    }
                }
            }
            i2 = i3;
            if (i2 != 0) {
                i = 8;
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    public final void m2610b(CharSequence charSequence) {
        this.f2754d = charSequence;
        if (!this.f2751a) {
            mo862b();
        }
    }

    public final boolean mo855c() {
        boolean z = this.f2752b ? this.f2751a : !this.f2751a;
        return z || super.mo855c();
    }

    protected final Parcelable mo856d() {
        Parcelable d = super.mo856d();
        if (this.f2742r) {
            return d;
        }
        SavedState savedState = new SavedState(d);
        savedState.f2841a = this.f2751a;
        return savedState;
    }

    public final void mo857d(boolean z) {
        boolean z2 = this.f2751a != z;
        if (z2 || !this.f2755e) {
            this.f2751a = z;
            this.f2755e = true;
            m2598c(z);
            if (z2) {
                mo869a(mo855c());
                mo862b();
            }
        }
    }
}
