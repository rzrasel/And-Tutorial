package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.C0300g;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.C0312a;

public class InFilter implements SafeParcelable, C0312a {
    public static final C0320f CREATOR = new C0320f();
    final MetadataBundle f685a;
    final int f686b;
    private final C0300g f687c;

    InFilter(int i, MetadataBundle metadataBundle) {
        this.f686b = i;
        this.f685a = metadataBundle;
        this.f687c = (C0300g) C0319e.m1134a(metadataBundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0320f.m1135a(this, parcel, i);
    }
}
