package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.fe;
import java.util.ArrayList;

final class C0334a extends C0333b {
    C0334a() {
    }

    public final ExtendedGameEntity mo753a(Parcel parcel) {
        if (GamesDowngradeableSafeParcel.m1166b(fe.m1165z()) || fe.m1164b(ExtendedGameEntity.class.getCanonicalName())) {
            return super.mo753a(parcel);
        }
        GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
        int readInt = parcel.readInt();
        boolean z = parcel.readInt() == 1;
        int readInt2 = parcel.readInt();
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        String readString = parcel.readString();
        long readLong3 = parcel.readLong();
        String readString2 = parcel.readString();
        int readInt3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt3);
        for (int i = 0; i < readInt3; i++) {
            arrayList.add(GameBadgeEntity.CREATOR.mo755a(parcel));
        }
        return new ExtendedGameEntity(1, gameEntity, readInt, z, readInt2, readLong, readLong2, readString, readLong3, readString2, arrayList);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo753a(parcel);
    }
}
