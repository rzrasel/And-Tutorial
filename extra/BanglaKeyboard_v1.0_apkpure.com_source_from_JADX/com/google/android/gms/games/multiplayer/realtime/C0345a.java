package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C0345a implements Creator {
    C0345a() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RealTimeMessage(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RealTimeMessage[i];
    }
}
