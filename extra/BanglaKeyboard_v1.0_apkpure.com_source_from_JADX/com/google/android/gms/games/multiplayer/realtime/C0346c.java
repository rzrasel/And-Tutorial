package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public class C0346c implements Creator {
    static void m1502a(RoomEntity roomEntity, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1073a(parcel, 1, roomEntity.mo791b(), false);
        C0261c.m1082b(parcel, 1000, roomEntity.m1489j());
        C0261c.m1073a(parcel, 2, roomEntity.mo792c(), false);
        C0261c.m1069a(parcel, 3, roomEntity.mo793d());
        C0261c.m1082b(parcel, 4, roomEntity.mo794e());
        C0261c.m1073a(parcel, 5, roomEntity.mo795f(), false);
        C0261c.m1082b(parcel, 6, roomEntity.mo796g());
        C0261c.m1070a(parcel, 7, roomEntity.mo797h());
        C0261c.m1083b(parcel, 8, roomEntity.mo764k(), false);
        C0261c.m1082b(parcel, 9, roomEntity.mo798i());
        C0261c.m1081b(parcel, a);
    }

    public RoomEntity mo799a(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int a = C0259a.m1038a(parcel);
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        int i4 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 2:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 4:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 5:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 7:
                    bundle = C0259a.m1056n(parcel, readInt);
                    break;
                case 8:
                    arrayList = C0259a.m1044c(parcel, readInt, ParticipantEntity.CREATOR);
                    break;
                case 9:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 1000:
                    i4 = C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new RoomEntity(i4, str3, str2, j, i3, str, i2, bundle, arrayList, i);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo799a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new RoomEntity[i];
    }
}
