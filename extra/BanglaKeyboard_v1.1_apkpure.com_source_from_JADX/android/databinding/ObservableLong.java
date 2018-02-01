package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableLong extends C0002a implements Parcelable, Serializable {
    public static final Creator<ObservableLong> CREATOR = new C00081();
    private long f7a;

    static class C00081 implements Creator<ObservableLong> {
        C00081() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableLong[i];
        }
    }

    public ObservableLong(long j) {
        this.f7a = j;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7a);
    }
}
