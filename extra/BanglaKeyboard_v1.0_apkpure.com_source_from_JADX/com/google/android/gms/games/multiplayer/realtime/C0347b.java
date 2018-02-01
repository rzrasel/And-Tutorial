package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.fe;
import java.util.ArrayList;

final class C0347b extends C0346c {
    C0347b() {
    }

    public final RoomEntity mo799a(Parcel parcel) {
        if (GamesDowngradeableSafeParcel.m1166b(fe.m1165z()) || fe.m1164b(RoomEntity.class.getCanonicalName())) {
            return super.mo799a(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        String readString3 = parcel.readString();
        int readInt2 = parcel.readInt();
        Bundle readBundle = parcel.readBundle();
        int readInt3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt3);
        for (int i = 0; i < readInt3; i++) {
            arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }
        return new RoomEntity(2, readString, readString2, readLong, readInt, readString3, readInt2, readBundle, arrayList, -1);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo799a(parcel);
    }
}
