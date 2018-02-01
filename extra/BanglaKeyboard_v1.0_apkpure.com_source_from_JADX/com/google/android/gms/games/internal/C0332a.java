package com.google.android.gms.games.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0332a implements Creator {
    static void m1267a(ConnectionInfo connectionInfo, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1073a(parcel, 1, connectionInfo.m1265b(), false);
        C0261c.m1082b(parcel, 1000, connectionInfo.m1264a());
        C0261c.m1082b(parcel, 2, connectionInfo.m1266c());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = C0259a.m1038a(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 2:
                    i = C0259a.m1048f(parcel, readInt);
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
            return new ConnectionInfo(i2, str, i);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionInfo[i];
    }
}
