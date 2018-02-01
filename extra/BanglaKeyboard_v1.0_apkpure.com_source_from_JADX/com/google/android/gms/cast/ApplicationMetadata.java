package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class ApplicationMetadata implements SafeParcelable {
    public static final Creator CREATOR = new C0231a();
    String f451a;
    String f452b;
    List f453c;
    List f454d;
    String f455e;
    Uri f456f;
    private final int f457g;

    private ApplicationMetadata() {
        this.f457g = 1;
        this.f453c = new ArrayList();
        this.f454d = new ArrayList();
    }

    ApplicationMetadata(int i, String str, String str2, List list, List list2, String str3, Uri uri) {
        this.f457g = i;
        this.f451a = str;
        this.f452b = str2;
        this.f453c = list;
        this.f454d = list2;
        this.f455e = str3;
        this.f456f = uri;
    }

    final int m947a() {
        return this.f457g;
    }

    public final String m948b() {
        return this.f451a;
    }

    public final String m949c() {
        return this.f452b;
    }

    public final String m950d() {
        return this.f455e;
    }

    public final int describeContents() {
        return 0;
    }

    public final Uri m951e() {
        return this.f456f;
    }

    public final List m952f() {
        return this.f453c;
    }

    public final String toString() {
        return this.f452b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0231a.m960a(this, parcel, i);
    }
}
