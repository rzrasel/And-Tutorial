package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.internal.li;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new C1531b();
    private int f4635a;
    private final long f4636b;
    private int f4637c;
    private final String f4638d;
    private final String f4639e;
    private final String f4640f;
    private final int f4641g;
    private final List<String> f4642h;
    private final String f4643i;
    private final long f4644j;
    private int f4645k;
    private final String f4646l;
    private final float f4647m;
    private final long f4648n;
    private long f4649o = -1;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.f4635a = i;
        this.f4636b = j;
        this.f4637c = i2;
        this.f4638d = str;
        this.f4639e = str3;
        this.f4640f = str5;
        this.f4641g = i3;
        this.f4642h = list;
        this.f4643i = str2;
        this.f4644j = j2;
        this.f4645k = i4;
        this.f4646l = str4;
        this.f4647m = f;
        this.f4648n = j3;
    }

    public final long mo1665a() {
        return this.f4636b;
    }

    public final int mo1666b() {
        return this.f4637c;
    }

    public final long mo1667c() {
        return this.f4649o;
    }

    public final String mo1668d() {
        String str = "\t";
        String str2 = this.f4638d;
        String str3 = "\t";
        int i = this.f4641g;
        String str4 = "\t";
        String join = this.f4642h == null ? "" : TextUtils.join(",", this.f4642h);
        String str5 = "\t";
        int i2 = this.f4645k;
        String str6 = "\t";
        String str7 = this.f4639e == null ? "" : this.f4639e;
        String str8 = "\t";
        String str9 = this.f4646l == null ? "" : this.f4646l;
        String str10 = "\t";
        float f = this.f4647m;
        String str11 = "\t";
        String str12 = this.f4640f == null ? "" : this.f4640f;
        return new StringBuilder(((((((((((((String.valueOf(str).length() + 37) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(join).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()) + String.valueOf(str8).length()) + String.valueOf(str9).length()) + String.valueOf(str10).length()) + String.valueOf(str11).length()) + String.valueOf(str12).length()).append(str).append(str2).append(str3).append(i).append(str4).append(join).append(str5).append(i2).append(str6).append(str7).append(str8).append(str9).append(str10).append(f).append(str11).append(str12).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 1, this.f4635a);
        li.m5957a(parcel, 2, mo1665a());
        li.m5961a(parcel, 4, this.f4638d);
        li.m5956a(parcel, 5, this.f4641g);
        li.m5962a(parcel, 6, this.f4642h);
        li.m5957a(parcel, 8, this.f4644j);
        li.m5961a(parcel, 10, this.f4639e);
        li.m5956a(parcel, 11, mo1666b());
        li.m5961a(parcel, 12, this.f4643i);
        li.m5961a(parcel, 13, this.f4646l);
        li.m5956a(parcel, 14, this.f4645k);
        li.m5955a(parcel, 15, this.f4647m);
        li.m5957a(parcel, 16, this.f4648n);
        li.m5961a(parcel, 17, this.f4640f);
        li.m5967b(parcel, a);
    }
}
