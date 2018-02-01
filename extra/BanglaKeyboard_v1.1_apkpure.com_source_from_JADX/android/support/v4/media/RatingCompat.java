package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new C05491();
    private final int f1709a;
    private final float f1710b;

    static class C05491 implements Creator<RatingCompat> {
        C05491() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f1709a = i;
        this.f1710b = f;
    }

    public final int describeContents() {
        return this.f1709a;
    }

    public final String toString() {
        return "Rating:style=" + this.f1709a + " rating=" + (this.f1710b < 0.0f ? "unrated" : String.valueOf(this.f1710b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1709a);
        parcel.writeFloat(this.f1710b);
    }
}
