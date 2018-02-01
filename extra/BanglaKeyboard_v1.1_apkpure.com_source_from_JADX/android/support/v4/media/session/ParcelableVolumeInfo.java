package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new C05731();
    public int f1743a;
    public int f1744b;
    public int f1745c;
    public int f1746d;
    public int f1747e;

    static class C05731 implements Creator<ParcelableVolumeInfo> {
        C05731() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1743a = parcel.readInt();
        this.f1745c = parcel.readInt();
        this.f1746d = parcel.readInt();
        this.f1747e = parcel.readInt();
        this.f1744b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1743a);
        parcel.writeInt(this.f1745c);
        parcel.writeInt(this.f1746d);
        parcel.writeInt(this.f1747e);
        parcel.writeInt(this.f1744b);
    }
}
