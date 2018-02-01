package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C0246e;
import com.google.android.gms.common.data.DataHolder;

public final class PlayerRef extends C0246e implements Player {
    private final C0331e f742c;

    public PlayerRef(DataHolder dataHolder, int i) {
        this(dataHolder, i, null);
    }

    public PlayerRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        this.f742c = new C0331e(str);
    }

    private Player m1247k() {
        return new PlayerEntity(this);
    }

    public final /* synthetic */ Object mo701a() {
        return m1247k();
    }

    public final String mo726b() {
        return m998e(this.f742c.f743a);
    }

    public final String mo727c() {
        return m998e(this.f742c.f744b);
    }

    public final Uri mo728d() {
        return m1000g(this.f742c.f745c);
    }

    public final int describeContents() {
        return 0;
    }

    public final String mo729e() {
        return m998e(this.f742c.f746d);
    }

    public final boolean equals(Object obj) {
        return PlayerEntity.m1231a(this, obj);
    }

    public final Uri mo730f() {
        return m1000g(this.f742c.f747e);
    }

    public final String mo731g() {
        return m998e(this.f742c.f748f);
    }

    public final long mo732h() {
        return m995b(this.f742c.f749g);
    }

    public final int hashCode() {
        return PlayerEntity.m1230a((Player) this);
    }

    public final long mo733i() {
        return !a_(this.f742c.f751i) ? -1 : m995b(this.f742c.f751i);
    }

    public final int mo734j() {
        return m996c(this.f742c.f750h);
    }

    public final String toString() {
        return PlayerEntity.m1234b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) m1247k()).writeToParcel(parcel, i);
    }
}
