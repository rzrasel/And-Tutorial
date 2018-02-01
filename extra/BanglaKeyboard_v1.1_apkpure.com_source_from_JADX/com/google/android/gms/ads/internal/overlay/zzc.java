package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.zzbcc;

@aqv
public final class zzc extends zzbcc {
    public static final Creator<zzc> CREATOR = new zzb();
    private String f4224a;
    private String f4225b;
    public final Intent intent;
    public final String mimeType;
    public final String packageName;
    public final String url;
    public final String zzcfa;
    public final String zzcfb;

    public zzc(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f4224a = str;
        this.url = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.zzcfa = str5;
        this.zzcfb = str6;
        this.f4225b = str7;
        this.intent = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5961a(parcel, 2, this.f4224a);
        li.m5961a(parcel, 3, this.url);
        li.m5961a(parcel, 4, this.mimeType);
        li.m5961a(parcel, 5, this.packageName);
        li.m5961a(parcel, 6, this.zzcfa);
        li.m5961a(parcel, 7, this.zzcfb);
        li.m5961a(parcel, 8, this.f4225b);
        li.m5960a(parcel, 9, this.intent, i);
        li.m5967b(parcel, a);
    }
}
