package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableDouble extends C0002a implements Parcelable, Serializable {
    public static final Creator<ObservableDouble> CREATOR = new C00051();
    private double f4a;

    static class C00051 implements Creator<ObservableDouble> {
        C00051() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableDouble[i];
        }
    }

    public ObservableDouble(double d) {
        this.f4a = d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f4a);
    }
}
