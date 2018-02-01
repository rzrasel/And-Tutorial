package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jb;
import java.util.Arrays;

public final class WebImage implements SafeParcelable {
    public static final Creator CREATOR = new C0258h();
    private final int f535a;
    private final Uri f536b;
    private final int f537c;
    private final int f538d;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f535a = i;
        this.f536b = uri;
        this.f537c = i2;
        this.f538d = i3;
    }

    final int m1022a() {
        return this.f535a;
    }

    public final Uri m1023b() {
        return this.f536b;
    }

    public final int m1024c() {
        return this.f537c;
    }

    public final int m1025d() {
        return this.f538d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return jb.m2470a(this.f536b, webImage.f536b) && this.f537c == webImage.f537c && this.f538d == webImage.f538d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f536b, Integer.valueOf(this.f537c), Integer.valueOf(this.f538d)});
    }

    public final String toString() {
        return String.format("Image %dx%d %s", new Object[]{Integer.valueOf(this.f537c), Integer.valueOf(this.f538d), this.f536b.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0258h.m1037a(this, parcel, i);
    }
}
