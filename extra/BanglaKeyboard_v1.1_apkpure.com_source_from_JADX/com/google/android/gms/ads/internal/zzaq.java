package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.zzbcc;

@aqv
public final class zzaq extends zzbcc {
    public static final Creator<zzaq> CREATOR = new zzar();
    private String f4352a;
    public final boolean zzapy;
    public final boolean zzapz;
    public final boolean zzaqb;
    public final float zzaqc;
    public final int zzaqd;
    public final boolean zzaqe;

    zzaq(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4) {
        this.zzapy = z;
        this.zzapz = z2;
        this.f4352a = str;
        this.zzaqb = z3;
        this.zzaqc = f;
        this.zzaqd = i;
        this.zzaqe = z4;
    }

    public zzaq(boolean z, boolean z2, boolean z3, float f, int i, boolean z4) {
        this(z, z2, null, z3, f, i, z4);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5963a(parcel, 2, this.zzapy);
        li.m5963a(parcel, 3, this.zzapz);
        li.m5961a(parcel, 4, this.f4352a);
        li.m5963a(parcel, 5, this.zzaqb);
        li.m5955a(parcel, 6, this.zzaqc);
        li.m5956a(parcel, 7, this.zzaqd);
        li.m5963a(parcel, 8, this.zzaqe);
        li.m5967b(parcel, a);
    }
}
