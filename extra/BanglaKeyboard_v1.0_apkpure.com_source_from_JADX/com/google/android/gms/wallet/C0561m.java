package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0561m implements Creator {
    static void m3821a(NotifyTransactionStatusRequest notifyTransactionStatusRequest, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, notifyTransactionStatusRequest.f2471a);
        C0261c.m1073a(parcel, 2, notifyTransactionStatusRequest.f2472b, false);
        C0261c.m1082b(parcel, 3, notifyTransactionStatusRequest.f2473c);
        C0261c.m1073a(parcel, 4, notifyTransactionStatusRequest.f2474d, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int a = C0259a.m1038a(parcel);
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 4:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new NotifyTransactionStatusRequest(i2, str2, i, str);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NotifyTransactionStatusRequest[i];
    }
}
