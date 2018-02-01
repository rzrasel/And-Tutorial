package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public class C0329d implements Creator {
    static void m1261a(PlayerEntity playerEntity, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1073a(parcel, 1, playerEntity.mo726b(), false);
        C0261c.m1082b(parcel, 1000, playerEntity.m1246k());
        C0261c.m1073a(parcel, 2, playerEntity.mo727c(), false);
        C0261c.m1072a(parcel, 3, playerEntity.mo728d(), i, false);
        C0261c.m1072a(parcel, 4, playerEntity.mo730f(), i, false);
        C0261c.m1069a(parcel, 5, playerEntity.mo732h());
        C0261c.m1082b(parcel, 6, playerEntity.mo734j());
        C0261c.m1069a(parcel, 7, playerEntity.mo733i());
        C0261c.m1073a(parcel, 8, playerEntity.mo729e(), false);
        C0261c.m1073a(parcel, 9, playerEntity.mo731g(), false);
        C0261c.m1081b(parcel, a);
    }

    public PlayerEntity mo737a(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 2:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    uri = (Uri) C0259a.m1040a(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) C0259a.m1040a(parcel, readInt, Uri.CREATOR);
                    break;
                case 5:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 6:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 7:
                    j2 = C0259a.m1049g(parcel, readInt);
                    break;
                case 8:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 9:
                    str4 = C0259a.m1054l(parcel, readInt);
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
            return new PlayerEntity(i, str, str2, uri, uri2, j, i2, j2, str3, str4);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo737a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new PlayerEntity[i];
    }
}
