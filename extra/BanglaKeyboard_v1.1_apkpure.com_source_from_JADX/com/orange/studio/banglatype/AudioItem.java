package com.orange.studio.banglatype;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class AudioItem implements Parcelable {
    public static final Creator<AudioItem> CREATOR = new C16741();

    static class C16741 implements Creator<AudioItem> {
        C16741() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AudioItem();
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AudioItem[i];
        }
    }

    private AudioItem() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }
}
