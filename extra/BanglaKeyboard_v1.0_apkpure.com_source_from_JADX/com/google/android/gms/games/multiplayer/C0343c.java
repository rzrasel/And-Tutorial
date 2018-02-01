package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.fe;

final class C0343c extends C0342d {
    C0343c() {
    }

    public final ParticipantEntity mo789a(Parcel parcel) {
        Object obj = 1;
        if (GamesDowngradeableSafeParcel.m1166b(fe.m1165z()) || fe.m1164b(ParticipantEntity.class.getCanonicalName())) {
            return super.mo789a(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        Uri parse = readString3 == null ? null : Uri.parse(readString3);
        String readString4 = parcel.readString();
        Uri parse2 = readString4 == null ? null : Uri.parse(readString4);
        int readInt = parcel.readInt();
        String readString5 = parcel.readString();
        boolean z = parcel.readInt() > 0;
        if (parcel.readInt() <= 0) {
            obj = null;
        }
        return new ParticipantEntity(3, readString, readString2, parse, parse2, readInt, readString5, z, obj != null ? (PlayerEntity) PlayerEntity.CREATOR.createFromParcel(parcel) : null, 7, null, null, null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo789a(parcel);
    }
}
