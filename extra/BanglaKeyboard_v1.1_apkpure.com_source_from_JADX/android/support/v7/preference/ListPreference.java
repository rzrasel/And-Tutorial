package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.content.p015a.C0438c;
import android.support.v7.preference.C0935f.C0931a;
import android.support.v7.preference.C0935f.C0934d;
import android.support.v7.preference.Preference.BaseSavedState;
import android.text.TextUtils;
import android.util.AttributeSet;

public class ListPreference extends DialogPreference {
    CharSequence[] f2764g;
    CharSequence[] f2765h;
    String f2766i;
    private String f2767x;
    private boolean f2768y;

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C08991();
        String f2785a;

        static class C08991 implements Creator<SavedState> {
            C08991() {
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
            this.f2785a = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f2785a);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0438c.m1158a(context, C0931a.dialogPreferenceStyle, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, byte b) {
        super(context, attributeSet, i, (byte) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934d.ListPreference, i, 0);
        this.f2764g = C0438c.m1171c(obtainStyledAttributes, C0934d.ListPreference_entries, C0934d.ListPreference_android_entries);
        this.f2765h = C0438c.m1171c(obtainStyledAttributes, C0934d.ListPreference_entryValues, C0934d.ListPreference_android_entryValues);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0934d.Preference, i, 0);
        this.f2767x = C0438c.m1164a(obtainStyledAttributes, C0934d.Preference_summary, C0934d.Preference_android_summary);
        obtainStyledAttributes.recycle();
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
        mo860a(savedState.f2785a);
    }

    public final void mo860a(String str) {
        boolean z = !TextUtils.equals(this.f2766i, str);
        if (z || !this.f2768y) {
            this.f2766i = str;
            this.f2768y = true;
            m2597c(str);
            if (z) {
                mo862b();
            }
        }
    }

    public final int m2622b(String str) {
        if (!(str == null || this.f2765h == null)) {
            for (int length = this.f2765h.length - 1; length >= 0; length--) {
                if (this.f2765h[length].equals(str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    protected final Parcelable mo856d() {
        Parcelable d = super.mo856d();
        if (this.f2742r) {
            return d;
        }
        SavedState savedState = new SavedState(d);
        savedState.f2785a = this.f2766i;
        return savedState;
    }

    public final CharSequence mo861e() {
        int b = m2622b(this.f2766i);
        String str = (b < 0 || this.f2764g == null) ? null : this.f2764g[b];
        if (this.f2767x == null) {
            return super.mo861e();
        }
        String str2 = this.f2767x;
        Object[] objArr = new Object[1];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        return String.format(str2, objArr);
    }
}
