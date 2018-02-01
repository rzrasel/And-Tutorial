package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.C0294a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.C0312a;

public class FieldOnlyFilter implements SafeParcelable, C0312a {
    public static final Creator CREATOR = new C0316b();
    final MetadataBundle f671a;
    final int f672b;
    private final C0294a f673c;

    FieldOnlyFilter(int i, MetadataBundle metadataBundle) {
        this.f672b = i;
        this.f671a = metadataBundle;
        this.f673c = C0319e.m1134a(metadataBundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0316b.m1131a(this, parcel, i);
    }
}
