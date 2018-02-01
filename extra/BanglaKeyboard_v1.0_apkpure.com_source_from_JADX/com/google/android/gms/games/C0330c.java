package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.fe;

final class C0330c extends C0329d {
    C0330c() {
    }

    public final PlayerEntity mo737a(Parcel parcel) {
        if (GamesDowngradeableSafeParcel.m1166b(fe.m1165z()) || fe.m1164b(PlayerEntity.class.getCanonicalName())) {
            return super.mo737a(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        return new PlayerEntity(4, readString, readString2, readString3 == null ? null : Uri.parse(readString3), readString4 == null ? null : Uri.parse(readString4), parcel.readLong(), -1, -1, null, null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo737a(parcel);
    }
}
