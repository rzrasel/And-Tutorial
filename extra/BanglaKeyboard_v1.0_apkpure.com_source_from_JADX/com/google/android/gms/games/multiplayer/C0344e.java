package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0344e implements Creator {
    static void m1465a(ParticipantResult participantResult, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1073a(parcel, 1, participantResult.m1456b(), false);
        C0261c.m1082b(parcel, 1000, participantResult.m1455a());
        C0261c.m1082b(parcel, 2, participantResult.m1457c());
        C0261c.m1082b(parcel, 3, participantResult.m1458d());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = C0259a.m1038a(parcel);
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 2:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 3:
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
            return new ParticipantResult(i2, str, i3, i);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParticipantResult[i];
    }
}
