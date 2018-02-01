package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.formats.NativeAdOptions;

@aqv
public final class zzot extends zzbcc {
    public static final Creator<zzot> CREATOR = new afp();
    public final int f7787a;
    public final boolean f7788b;
    public final int f7789c;
    public final boolean f7790d;
    public final int f7791e;
    public final zzmd f7792f;

    public zzot(int i, boolean z, int i2, boolean z2, int i3, zzmd com_google_android_gms_internal_zzmd) {
        this.f7787a = i;
        this.f7788b = z;
        this.f7789c = i2;
        this.f7790d = z2;
        this.f7791e = i3;
        this.f7792f = com_google_android_gms_internal_zzmd;
    }

    public zzot(NativeAdOptions nativeAdOptions) {
        this(3, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzmd(nativeAdOptions.getVideoOptions()) : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 1, this.f7787a);
        li.m5963a(parcel, 2, this.f7788b);
        li.m5956a(parcel, 3, this.f7789c);
        li.m5963a(parcel, 4, this.f7790d);
        li.m5956a(parcel, 5, this.f7791e);
        li.m5960a(parcel, 6, this.f7792f, i);
        li.m5967b(parcel, a);
    }
}
