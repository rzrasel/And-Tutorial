package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public final class C0348a implements Creator {
    static void m1574a(TurnBasedMatchEntity turnBasedMatchEntity, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1072a(parcel, 1, turnBasedMatchEntity.mo801b(), i, false);
        C0261c.m1073a(parcel, 2, turnBasedMatchEntity.mo802c(), false);
        C0261c.m1073a(parcel, 3, turnBasedMatchEntity.mo803d(), false);
        C0261c.m1069a(parcel, 4, turnBasedMatchEntity.mo804e());
        C0261c.m1073a(parcel, 5, turnBasedMatchEntity.mo809j(), false);
        C0261c.m1069a(parcel, 6, turnBasedMatchEntity.mo810l());
        C0261c.m1073a(parcel, 7, turnBasedMatchEntity.mo811m(), false);
        C0261c.m1082b(parcel, 8, turnBasedMatchEntity.mo805f());
        C0261c.m1082b(parcel, 10, turnBasedMatchEntity.mo808i());
        C0261c.m1082b(parcel, 11, turnBasedMatchEntity.mo813o());
        C0261c.m1076a(parcel, 12, turnBasedMatchEntity.mo812n());
        C0261c.m1083b(parcel, 13, turnBasedMatchEntity.mo764k(), false);
        C0261c.m1073a(parcel, 14, turnBasedMatchEntity.mo814p(), false);
        C0261c.m1076a(parcel, 15, turnBasedMatchEntity.mo815q());
        C0261c.m1070a(parcel, 17, turnBasedMatchEntity.mo817s());
        C0261c.m1082b(parcel, 16, turnBasedMatchEntity.mo816r());
        C0261c.m1082b(parcel, 1000, turnBasedMatchEntity.m1550w());
        C0261c.m1075a(parcel, 19, turnBasedMatchEntity.mo819u());
        C0261c.m1082b(parcel, 18, turnBasedMatchEntity.mo806g());
        C0261c.m1073a(parcel, 21, turnBasedMatchEntity.mo820v(), false);
        C0261c.m1073a(parcel, 20, turnBasedMatchEntity.mo807h(), false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        String str = null;
        String str2 = null;
        long j = 0;
        String str3 = null;
        long j2 = 0;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        byte[] bArr = null;
        ArrayList arrayList = null;
        String str5 = null;
        byte[] bArr2 = null;
        int i5 = 0;
        Bundle bundle = null;
        int i6 = 0;
        boolean z = false;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    gameEntity = (GameEntity) C0259a.m1040a(parcel, readInt, GameEntity.CREATOR);
                    break;
                case 2:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 5:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    j2 = C0259a.m1049g(parcel, readInt);
                    break;
                case 7:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                case 8:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 10:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 11:
                    i4 = C0259a.m1048f(parcel, readInt);
                    break;
                case 12:
                    bArr = C0259a.m1057o(parcel, readInt);
                    break;
                case 13:
                    arrayList = C0259a.m1044c(parcel, readInt, ParticipantEntity.CREATOR);
                    break;
                case 14:
                    str5 = C0259a.m1054l(parcel, readInt);
                    break;
                case 15:
                    bArr2 = C0259a.m1057o(parcel, readInt);
                    break;
                case 16:
                    i5 = C0259a.m1048f(parcel, readInt);
                    break;
                case 17:
                    bundle = C0259a.m1056n(parcel, readInt);
                    break;
                case 18:
                    i6 = C0259a.m1048f(parcel, readInt);
                    break;
                case 19:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 20:
                    str6 = C0259a.m1054l(parcel, readInt);
                    break;
                case 21:
                    str7 = C0259a.m1054l(parcel, readInt);
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
            return new TurnBasedMatchEntity(i, gameEntity, str, str2, j, str3, j2, str4, i2, i3, i4, bArr, arrayList, str5, bArr2, i5, bundle, i6, z, str6, str7);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TurnBasedMatchEntity[i];
    }
}
