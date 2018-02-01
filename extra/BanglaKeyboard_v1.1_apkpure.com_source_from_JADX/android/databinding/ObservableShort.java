package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableShort extends C0002a implements Parcelable, Serializable {
    public static final Creator<ObservableShort> CREATOR = new C00111();
    private short f9a;

    static class C00111 implements Creator<ObservableShort> {
        C00111() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableShort[i];
        }
    }

    public ObservableShort(short s) {
        this.f9a = s;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9a);
    }
}
