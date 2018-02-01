package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0494r implements Creator {
    public static Tile m3563a(Parcel parcel) {
        int i = 0;
        int a = C0259a.m1038a(parcel);
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 3:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 4:
                    bArr = C0259a.m1057o(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new Tile(i3, i2, i, bArr);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m3564a(Tile tile, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, tile.m3271a());
        C0261c.m1082b(parcel, 2, tile.f2201a);
        C0261c.m1082b(parcel, 3, tile.f2202b);
        C0261c.m1076a(parcel, 4, tile.f2203c);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0494r.m3563a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Tile[i];
    }
}
