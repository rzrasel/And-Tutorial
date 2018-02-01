package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.fe;

final class C0328a extends C0327b {
    C0328a() {
    }

    public final GameEntity mo735a(Parcel parcel) {
        if (GamesDowngradeableSafeParcel.m1166b(fe.m1165z()) || fe.m1164b(GameEntity.class.getCanonicalName())) {
            return super.mo735a(parcel);
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        Uri parse = readString7 == null ? null : Uri.parse(readString7);
        readString7 = parcel.readString();
        Uri parse2 = readString7 == null ? null : Uri.parse(readString7);
        readString7 = parcel.readString();
        return new GameEntity(3, readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString7 == null ? null : Uri.parse(readString7), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo735a(parcel);
    }
}
