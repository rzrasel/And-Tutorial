package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class hi implements SafeParcelable {
    public static final ld CREATOR = new ld();
    final int f1574a;
    private final String f1575b;
    private final String f1576c;

    hi(int i, String str, String str2) {
        this.f1574a = i;
        this.f1575b = str;
        this.f1576c = str2;
    }

    public final String m2155a() {
        return this.f1575b;
    }

    public final String m2156b() {
        return this.f1576c;
    }

    public int describeContents() {
        ld ldVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof hi)) {
            return false;
        }
        hi hiVar = (hi) obj;
        return jb.m2470a(this.f1575b, hiVar.f1575b) && jb.m2470a(this.f1576c, hiVar.f1576c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1575b, this.f1576c});
    }

    public String toString() {
        return jb.m2469a(this).m2471a("mPlaceId", this.f1575b).m2471a("mTag", this.f1576c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        ld ldVar = CREATOR;
        ld.m2532a(this, parcel);
    }
}
