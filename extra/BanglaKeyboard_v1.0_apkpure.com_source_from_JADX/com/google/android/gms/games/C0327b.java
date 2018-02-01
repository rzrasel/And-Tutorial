package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public class C0327b implements Creator {
    static void m1258a(GameEntity gameEntity, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1073a(parcel, 1, gameEntity.mo702b(), false);
        C0261c.m1073a(parcel, 2, gameEntity.mo703c(), false);
        C0261c.m1073a(parcel, 3, gameEntity.mo704d(), false);
        C0261c.m1073a(parcel, 4, gameEntity.mo705e(), false);
        C0261c.m1073a(parcel, 5, gameEntity.mo706f(), false);
        C0261c.m1073a(parcel, 6, gameEntity.mo707g(), false);
        C0261c.m1072a(parcel, 7, gameEntity.mo708h(), i, false);
        C0261c.m1072a(parcel, 8, gameEntity.mo710j(), i, false);
        C0261c.m1072a(parcel, 9, gameEntity.mo712l(), i, false);
        C0261c.m1075a(parcel, 10, gameEntity.mo714n());
        C0261c.m1075a(parcel, 11, gameEntity.mo717q());
        C0261c.m1073a(parcel, 12, gameEntity.mo718r(), false);
        C0261c.m1082b(parcel, 13, gameEntity.mo719s());
        C0261c.m1082b(parcel, 14, gameEntity.mo720t());
        C0261c.m1082b(parcel, 15, gameEntity.mo721u());
        C0261c.m1075a(parcel, 17, gameEntity.mo723w());
        C0261c.m1075a(parcel, 16, gameEntity.mo722v());
        C0261c.m1082b(parcel, 1000, gameEntity.m1196x());
        C0261c.m1073a(parcel, 19, gameEntity.mo711k(), false);
        C0261c.m1073a(parcel, 18, gameEntity.mo709i(), false);
        C0261c.m1075a(parcel, 21, gameEntity.mo715o());
        C0261c.m1073a(parcel, 20, gameEntity.mo713m(), false);
        C0261c.m1075a(parcel, 22, gameEntity.mo716p());
        C0261c.m1081b(parcel, a);
    }

    public GameEntity mo735a(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean z = false;
        boolean z2 = false;
        String str7 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        boolean z6 = false;
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
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                case 5:
                    str5 = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    str6 = C0259a.m1054l(parcel, readInt);
                    break;
                case 7:
                    uri = (Uri) C0259a.m1040a(parcel, readInt, Uri.CREATOR);
                    break;
                case 8:
                    uri2 = (Uri) C0259a.m1040a(parcel, readInt, Uri.CREATOR);
                    break;
                case 9:
                    uri3 = (Uri) C0259a.m1040a(parcel, readInt, Uri.CREATOR);
                    break;
                case 10:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 11:
                    z2 = C0259a.m1046d(parcel, readInt);
                    break;
                case 12:
                    str7 = C0259a.m1054l(parcel, readInt);
                    break;
                case 13:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 14:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 15:
                    i4 = C0259a.m1048f(parcel, readInt);
                    break;
                case 16:
                    z3 = C0259a.m1046d(parcel, readInt);
                    break;
                case 17:
                    z4 = C0259a.m1046d(parcel, readInt);
                    break;
                case 18:
                    str8 = C0259a.m1054l(parcel, readInt);
                    break;
                case 19:
                    str9 = C0259a.m1054l(parcel, readInt);
                    break;
                case 20:
                    str10 = C0259a.m1054l(parcel, readInt);
                    break;
                case 21:
                    z5 = C0259a.m1046d(parcel, readInt);
                    break;
                case 22:
                    z6 = C0259a.m1046d(parcel, readInt);
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
            return new GameEntity(i, str, str2, str3, str4, str5, str6, uri, uri2, uri3, z, z2, str7, i2, i3, i4, z3, z4, str8, str9, str10, z5, z6);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo735a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new GameEntity[i];
    }
}
