package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.je;

public final class RealTimeMessage implements Parcelable {
    public static final Creator CREATOR = new C0345a();
    private final String f807a;
    private final byte[] f808b;
    private final int f809c;

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    private RealTimeMessage(String str, byte[] bArr, int i) {
        this.f807a = (String) je.m2473a((Object) str);
        this.f808b = (byte[]) ((byte[]) je.m2473a((Object) bArr)).clone();
        this.f809c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f807a);
        parcel.writeByteArray(this.f808b);
        parcel.writeInt(this.f809c);
    }
}
