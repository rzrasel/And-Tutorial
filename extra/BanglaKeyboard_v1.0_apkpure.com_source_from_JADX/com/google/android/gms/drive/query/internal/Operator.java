package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Operator implements SafeParcelable {
    public static final Creator CREATOR = new C0324j();
    public static final Operator f694a = new Operator("=");
    public static final Operator f695b = new Operator("<");
    public static final Operator f696c = new Operator("<=");
    public static final Operator f697d = new Operator(">");
    public static final Operator f698e = new Operator(">=");
    public static final Operator f699f = new Operator("and");
    public static final Operator f700g = new Operator("or");
    public static final Operator f701h = new Operator("not");
    public static final Operator f702i = new Operator("contains");
    final String f703j;
    final int f704k;

    Operator(int i, String str) {
        this.f704k = i;
        this.f703j = str;
    }

    private Operator(String str) {
        this(1, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Operator operator = (Operator) obj;
        return this.f703j == null ? operator.f703j == null : this.f703j.equals(operator.f703j);
    }

    public int hashCode() {
        return (this.f703j == null ? 0 : this.f703j.hashCode()) + 31;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0324j.m1139a(this, parcel);
    }
}
