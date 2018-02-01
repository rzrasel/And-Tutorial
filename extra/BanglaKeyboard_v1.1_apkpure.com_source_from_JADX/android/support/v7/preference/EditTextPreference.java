package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.content.p015a.C0438c;
import android.support.v7.preference.C0935f.C0931a;
import android.support.v7.preference.Preference.BaseSavedState;
import android.text.TextUtils;
import android.util.AttributeSet;

public class EditTextPreference extends DialogPreference {
    String f2774g;

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C08981();
        String f2773a;

        static class C08981 implements Creator<SavedState> {
            C08981() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2773a = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2773a);
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0438c.m1158a(context, C0931a.editTextPreferenceStyle, 16842898));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private EditTextPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
    }

    protected final Object mo852a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    protected final void mo854a(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.mo854a(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo854a(savedState.getSuperState());
        mo860a(savedState.f2773a);
    }

    public final void mo860a(String str) {
        boolean c = mo855c();
        this.f2774g = str;
        m2597c(str);
        boolean c2 = mo855c();
        if (c2 != c) {
            mo869a(c2);
        }
    }

    public final boolean mo855c() {
        return TextUtils.isEmpty(this.f2774g) || super.mo855c();
    }

    protected final Parcelable mo856d() {
        Parcelable d = super.mo856d();
        if (this.f2742r) {
            return d;
        }
        SavedState savedState = new SavedState(d);
        savedState.f2773a = this.f2774g;
        return savedState;
    }
}
