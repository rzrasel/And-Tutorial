package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.search.SearchAdRequest;

@aqv
public final class zzlz extends zzbcc {
    public static final Creator<zzlz> CREATOR = new acw();
    public final String f7771a;
    private int f7772b;
    private int f7773c;
    private int f7774d;
    private int f7775e;
    private int f7776f;
    private int f7777g;
    private int f7778h;
    private int f7779i;
    private String f7780j;
    private int f7781k;
    private String f7782l;
    private int f7783m;
    private int f7784n;

    zzlz(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, int i9, String str2, int i10, int i11, String str3) {
        this.f7772b = i;
        this.f7773c = i2;
        this.f7774d = i3;
        this.f7775e = i4;
        this.f7776f = i5;
        this.f7777g = i6;
        this.f7778h = i7;
        this.f7779i = i8;
        this.f7780j = str;
        this.f7781k = i9;
        this.f7782l = str2;
        this.f7783m = i10;
        this.f7784n = i11;
        this.f7771a = str3;
    }

    public zzlz(SearchAdRequest searchAdRequest) {
        this.f7772b = searchAdRequest.getAnchorTextColor();
        this.f7773c = searchAdRequest.getBackgroundColor();
        this.f7774d = searchAdRequest.getBackgroundGradientBottom();
        this.f7775e = searchAdRequest.getBackgroundGradientTop();
        this.f7776f = searchAdRequest.getBorderColor();
        this.f7777g = searchAdRequest.getBorderThickness();
        this.f7778h = searchAdRequest.getBorderType();
        this.f7779i = searchAdRequest.getCallButtonColor();
        this.f7780j = searchAdRequest.getCustomChannels();
        this.f7781k = searchAdRequest.getDescriptionTextColor();
        this.f7782l = searchAdRequest.getFontFace();
        this.f7783m = searchAdRequest.getHeaderTextColor();
        this.f7784n = searchAdRequest.getHeaderTextSize();
        this.f7771a = searchAdRequest.getQuery();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 2, this.f7772b);
        li.m5956a(parcel, 3, this.f7773c);
        li.m5956a(parcel, 4, this.f7774d);
        li.m5956a(parcel, 5, this.f7775e);
        li.m5956a(parcel, 6, this.f7776f);
        li.m5956a(parcel, 7, this.f7777g);
        li.m5956a(parcel, 8, this.f7778h);
        li.m5956a(parcel, 9, this.f7779i);
        li.m5961a(parcel, 10, this.f7780j);
        li.m5956a(parcel, 11, this.f7781k);
        li.m5961a(parcel, 12, this.f7782l);
        li.m5956a(parcel, 13, this.f7783m);
        li.m5956a(parcel, 14, this.f7784n);
        li.m5961a(parcel, 15, this.f7771a);
        li.m5967b(parcel, a);
    }
}
