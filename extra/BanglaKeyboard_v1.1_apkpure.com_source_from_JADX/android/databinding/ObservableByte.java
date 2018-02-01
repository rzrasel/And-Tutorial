package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableByte extends C0002a implements Parcelable, Serializable {
    public static final Creator<ObservableByte> CREATOR = new C00031();
    private byte f2a;

    static class C00031 implements Creator<ObservableByte> {
        C00031() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableByte[i];
        }
    }

    public ObservableByte(byte b) {
        this.f2a = b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f2a);
    }
}
