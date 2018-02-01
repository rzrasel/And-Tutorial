package android.support.v4.p000a;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class C0003d implements ClassLoaderCreator {
    private final C0002c f1a;

    public C0003d(C0002c c0002c) {
        this.f1a = c0002c;
    }

    public final Object createFromParcel(Parcel parcel) {
        return this.f1a.mo242a(parcel, null);
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f1a.mo242a(parcel, classLoader);
    }

    public final Object[] newArray(int i) {
        return this.f1a.mo243a(i);
    }
}
