package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;

public final class C0349a implements Creator {
    static void m1604a(GameRequestEntity gameRequestEntity, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1072a(parcel, 1, gameRequestEntity.mo767e(), i, false);
        C0261c.m1082b(parcel, 1000, gameRequestEntity.m1581b());
        C0261c.m1072a(parcel, 2, gameRequestEntity.mo768f(), i, false);
        C0261c.m1076a(parcel, 3, gameRequestEntity.mo769g());
        C0261c.m1073a(parcel, 4, gameRequestEntity.mo766d(), false);
        C0261c.m1083b(parcel, 5, gameRequestEntity.mo774l(), false);
        C0261c.m1082b(parcel, 7, gameRequestEntity.mo770h());
        C0261c.m1069a(parcel, 9, gameRequestEntity.mo771i());
        C0261c.m1069a(parcel, 10, gameRequestEntity.mo772j());
        C0261c.m1070a(parcel, 11, gameRequestEntity.m1582c());
        C0261c.m1082b(parcel, 12, gameRequestEntity.mo773k());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        byte[] bArr = null;
        String str = null;
        ArrayList arrayList = null;
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    gameEntity = (GameEntity) C0259a.m1040a(parcel, readInt, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) C0259a.m1040a(parcel, readInt, PlayerEntity.CREATOR);
                    break;
                case 3:
                    bArr = C0259a.m1057o(parcel, readInt);
                    break;
                case 4:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 5:
                    arrayList = C0259a.m1044c(parcel, readInt, PlayerEntity.CREATOR);
                    break;
                case 7:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 9:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 10:
                    j2 = C0259a.m1049g(parcel, readInt);
                    break;
                case 11:
                    bundle = C0259a.m1056n(parcel, readInt);
                    break;
                case 12:
                    i3 = C0259a.m1048f(parcel, readInt);
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
            return new GameRequestEntity(i, gameEntity, playerEntity, bArr, str, arrayList, i2, j, j2, bundle, i3);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GameRequestEntity[i];
    }
}
