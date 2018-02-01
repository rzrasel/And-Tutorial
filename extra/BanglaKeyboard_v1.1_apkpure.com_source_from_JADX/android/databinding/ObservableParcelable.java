package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableParcelable<T extends Parcelable> extends C0010g<T> implements Parcelable, Serializable {
    public static final Creator<ObservableParcelable> CREATOR = new C00091();

    static class C00091 implements Creator<ObservableParcelable> {
        C00091() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(getClass().getClassLoader()));
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ObservableParcelable[i];
        }
    }

    public ObservableParcelable(T t) {
        super(t);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f8a, 0);
    }
}
