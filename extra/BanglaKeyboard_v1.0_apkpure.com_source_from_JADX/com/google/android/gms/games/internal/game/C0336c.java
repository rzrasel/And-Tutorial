package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.fe;

final class C0336c extends C0335d {
    C0336c() {
    }

    public final GameBadgeEntity mo755a(Parcel parcel) {
        if (GamesDowngradeableSafeParcel.m1166b(fe.m1165z()) || fe.m1164b(GameBadgeEntity.class.getCanonicalName())) {
            return super.mo755a(parcel);
        }
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        return new GameBadgeEntity(1, readInt, readString, readString2, readString3 == null ? null : Uri.parse(readString3));
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo755a(parcel);
    }
}
