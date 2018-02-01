package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class UserAddressRequest implements SafeParcelable {
    public static final Creator CREATOR = new C0350a();
    List f856a;
    private final int f857b;

    UserAddressRequest() {
        this.f857b = 1;
    }

    UserAddressRequest(int i, List list) {
        this.f857b = i;
        this.f856a = list;
    }

    public final int m1605a() {
        return this.f857b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0350a.m1606a(this, parcel);
    }
}
