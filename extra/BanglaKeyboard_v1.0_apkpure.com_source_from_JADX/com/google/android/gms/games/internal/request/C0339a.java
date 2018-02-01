package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;

public final class C0339a implements Creator {
    static void m1382a(GameRequestCluster gameRequestCluster, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1083b(parcel, 1, gameRequestCluster.m1372c(), false);
        C0261c.m1082b(parcel, 1000, gameRequestCluster.m1371b());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    arrayList = C0259a.m1044c(parcel, readInt, GameRequestEntity.CREATOR);
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
            return new GameRequestCluster(i, arrayList);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GameRequestCluster[i];
    }
}
