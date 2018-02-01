package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0238d implements Creator {
    static void m971a(Status status, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, status.m967d());
        C0261c.m1082b(parcel, 1000, status.m966c());
        C0261c.m1073a(parcel, 2, status.m965b(), false);
        C0261c.m1072a(parcel, 3, status.m964a(), i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) C0259a.m1040a(parcel, readInt, PendingIntent.CREATOR);
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
            return new Status(i2, i, str, pendingIntent);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
