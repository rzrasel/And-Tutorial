package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.VideoOptions;

@aqv
public final class zzmd extends zzbcc {
    public static final Creator<zzmd> CREATOR = new acy();
    public final boolean f7785a;
    public final boolean f7786b;

    public zzmd(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested());
    }

    public zzmd(boolean z, boolean z2) {
        this.f7785a = z;
        this.f7786b = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5963a(parcel, 2, this.f7785a);
        li.m5963a(parcel, 3, this.f7786b);
        li.m5967b(parcel, a);
    }
}
