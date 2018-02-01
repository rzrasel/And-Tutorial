package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.fe;
import java.util.ArrayList;

final class C0341a extends C0340b {
    C0341a() {
    }

    public final InvitationEntity mo787a(Parcel parcel) {
        if (GamesDowngradeableSafeParcel.m1166b(fe.m1165z()) || fe.m1164b(InvitationEntity.class.getCanonicalName())) {
            return super.mo787a(parcel);
        }
        GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
        String readString = parcel.readString();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        ParticipantEntity participantEntity = (ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel);
        int readInt2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt2);
        for (int i = 0; i < readInt2; i++) {
            arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
        }
        return new InvitationEntity(2, gameEntity, readString, readLong, readInt, participantEntity, arrayList, -1, 0);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo787a(parcel);
    }
}
