package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableFloat extends C0002a implements Parcelable, Serializable {
    public static final Creator<ObservableFloat> CREATOR = new C00061();
    private float f5a;

    static class C00061 implements Creator<ObservableFloat> {
        C00061() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableFloat[i];
        }
    }

    public ObservableFloat(float f) {
        this.f5a = f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f5a);
    }
}
