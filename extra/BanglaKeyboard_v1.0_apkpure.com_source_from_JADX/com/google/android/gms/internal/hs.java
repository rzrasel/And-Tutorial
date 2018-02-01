package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class hs implements SafeParcelable {
    public static final lh CREATOR = new lh();
    public final int f1647a;
    public final String f1648b;
    public final String f1649c;

    public hs(int i, String str, String str2) {
        this.f1647a = i;
        this.f1648b = str;
        this.f1649c = str2;
    }

    public int describeContents() {
        lh lhVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hs)) {
            return false;
        }
        hs hsVar = (hs) obj;
        return this.f1649c.equals(hsVar.f1649c) && this.f1648b.equals(hsVar.f1648b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1648b, this.f1649c});
    }

    public String toString() {
        return jb.m2469a(this).m2471a("clientPackageName", this.f1648b).m2471a("locale", this.f1649c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        lh lhVar = CREATOR;
        lh.m2536a(this, parcel);
    }
}
