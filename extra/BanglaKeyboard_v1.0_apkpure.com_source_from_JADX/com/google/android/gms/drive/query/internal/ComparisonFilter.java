package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.C0294a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.C0312a;

public class ComparisonFilter implements SafeParcelable, C0312a {
    public static final C0315a CREATOR = new C0315a();
    final Operator f667a;
    final MetadataBundle f668b;
    final int f669c;
    final C0294a f670d;

    ComparisonFilter(int i, Operator operator, MetadataBundle metadataBundle) {
        this.f669c = i;
        this.f667a = operator;
        this.f668b = metadataBundle;
        this.f670d = C0319e.m1134a(metadataBundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0315a.m1130a(this, parcel, i);
    }
}
