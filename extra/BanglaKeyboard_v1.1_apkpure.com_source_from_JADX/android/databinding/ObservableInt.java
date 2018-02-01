package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableInt extends C0002a implements Parcelable, Serializable {
    public static final Creator<ObservableInt> CREATOR = new C00071();
    public int f6a;

    static class C00071 implements Creator<ObservableInt> {
        C00071() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableInt[i];
        }
    }

    public ObservableInt(int i) {
        this.f6a = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6a);
    }
}
