package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ConflictEvent;

public class OnEventResponse implements SafeParcelable {
    public static final Creator CREATOR = new C0271d();
    final int f619a;
    final int f620b;
    final ChangeEvent f621c;
    final ConflictEvent f622d;

    OnEventResponse(int i, int i2, ChangeEvent changeEvent, ConflictEvent conflictEvent) {
        this.f619a = i;
        this.f620b = i2;
        this.f621c = changeEvent;
        this.f622d = conflictEvent;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0271d.m1092a(this, parcel, i);
    }
}
