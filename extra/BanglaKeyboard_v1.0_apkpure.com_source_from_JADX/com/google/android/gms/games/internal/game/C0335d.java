package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public class C0335d implements Creator {
    static void m1334a(GameBadgeEntity gameBadgeEntity, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, gameBadgeEntity.mo749b());
        C0261c.m1082b(parcel, 1000, gameBadgeEntity.m1324f());
        C0261c.m1073a(parcel, 2, gameBadgeEntity.mo750c(), false);
        C0261c.m1073a(parcel, 3, gameBadgeEntity.mo751d(), false);
        C0261c.m1072a(parcel, 4, gameBadgeEntity.mo752e(), i, false);
        C0261c.m1081b(parcel, a);
    }

    public GameBadgeEntity mo755a(Parcel parcel) {
        int i = 0;
        Uri uri = null;
        int a = C0259a.m1038a(parcel);
        String str = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    uri = (Uri) C0259a.m1040a(parcel, readInt, Uri.CREATOR);
                    break;
                case 1000:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GameBadgeEntity(i2, i, str2, str, uri);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo755a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new GameBadgeEntity[i];
    }
}
