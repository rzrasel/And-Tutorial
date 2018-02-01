package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public class C0333b implements Creator {
    static void m1331a(ExtendedGameEntity extendedGameEntity, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1072a(parcel, 1, extendedGameEntity.m1296m(), i, false);
        C0261c.m1082b(parcel, 1000, extendedGameEntity.m1295l());
        C0261c.m1082b(parcel, 2, extendedGameEntity.mo741d());
        C0261c.m1075a(parcel, 3, extendedGameEntity.mo742e());
        C0261c.m1082b(parcel, 4, extendedGameEntity.mo743f());
        C0261c.m1069a(parcel, 5, extendedGameEntity.mo744g());
        C0261c.m1069a(parcel, 6, extendedGameEntity.mo745h());
        C0261c.m1073a(parcel, 7, extendedGameEntity.mo746i(), false);
        C0261c.m1069a(parcel, 8, extendedGameEntity.mo747j());
        C0261c.m1073a(parcel, 9, extendedGameEntity.mo748k(), false);
        C0261c.m1083b(parcel, 10, extendedGameEntity.mo740c(), false);
        C0261c.m1081b(parcel, a);
    }

    public ExtendedGameEntity mo753a(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        long j3 = 0;
        String str2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    gameEntity = (GameEntity) C0259a.m1040a(parcel, readInt, GameEntity.CREATOR);
                    break;
                case 2:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 3:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 4:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 5:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 6:
                    j2 = C0259a.m1049g(parcel, readInt);
                    break;
                case 7:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 8:
                    j3 = C0259a.m1049g(parcel, readInt);
                    break;
                case 9:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 10:
                    arrayList = C0259a.m1044c(parcel, readInt, GameBadgeEntity.CREATOR);
                    break;
                case 1000:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ExtendedGameEntity(i, gameEntity, i2, z, i3, j, j2, str, j3, str2, arrayList);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo753a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new ExtendedGameEntity[i];
    }
}
