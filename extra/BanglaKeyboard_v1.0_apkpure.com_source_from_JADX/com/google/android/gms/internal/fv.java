package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class fv implements SafeParcelable {
    public static final ji CREATOR = new ji();
    private final int f1422a;
    private final fx f1423b;

    fv(int i, fx fxVar) {
        this.f1422a = i;
        this.f1423b = fxVar;
    }

    private fv(fx fxVar) {
        this.f1422a = 1;
        this.f1423b = fxVar;
    }

    public static fv m2016a(jq jqVar) {
        if (jqVar instanceof fx) {
            return new fv((fx) jqVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    final int m2017a() {
        return this.f1422a;
    }

    final fx m2018b() {
        return this.f1423b;
    }

    public final jq m2019c() {
        if (this.f1423b != null) {
            return this.f1423b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public int describeContents() {
        ji jiVar = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ji jiVar = CREATOR;
        ji.m2484a(this, parcel, i);
    }
}
