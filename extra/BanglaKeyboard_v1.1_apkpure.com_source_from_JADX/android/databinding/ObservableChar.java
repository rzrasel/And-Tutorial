package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableChar extends C0002a implements Parcelable, Serializable {
    public static final Creator<ObservableChar> CREATOR = new C00041();
    private char f3a;

    static class C00041 implements Creator<ObservableChar> {
        C00041() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableChar[i];
        }
    }

    public ObservableChar(char c) {
        this.f3a = c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3a);
    }
}
