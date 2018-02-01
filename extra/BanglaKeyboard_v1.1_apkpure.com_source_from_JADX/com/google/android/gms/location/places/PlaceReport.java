package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1514r;
import com.google.android.gms.common.internal.C1515s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.zzbcc;
import java.util.Arrays;

public class PlaceReport extends zzbcc implements ReflectedParcelable {
    public static final Creator<PlaceReport> CREATOR = new C1660a();
    private int f7796a;
    private final String f7797b;
    private final String f7798c;
    private final String f7799d;

    PlaceReport(int i, String str, String str2, String str3) {
        this.f7796a = i;
        this.f7797b = str;
        this.f7798c = str2;
        this.f7799d = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return C1514r.m3858a(this.f7797b, placeReport.f7797b) && C1514r.m3858a(this.f7798c, placeReport.f7798c) && C1514r.m3858a(this.f7799d, placeReport.f7799d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7797b, this.f7798c, this.f7799d});
    }

    public String toString() {
        C1515s a = C1514r.m3857a(this);
        a.m3859a("placeId", this.f7797b);
        a.m3859a("tag", this.f7798c);
        if (!"unknown".equals(this.f7799d)) {
            a.m3859a("source", this.f7799d);
        }
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 1, this.f7796a);
        li.m5961a(parcel, 2, this.f7797b);
        li.m5961a(parcel, 3, this.f7798c);
        li.m5961a(parcel, 4, this.f7799d);
        li.m5967b(parcel, a);
    }
}
