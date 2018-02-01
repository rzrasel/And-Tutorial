package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0317c implements Creator {
    static void m1132a(FieldWithSortOrder fieldWithSortOrder, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1000, fieldWithSortOrder.f676c);
        C0261c.m1073a(parcel, 1, fieldWithSortOrder.f674a, false);
        C0261c.m1075a(parcel, 2, fieldWithSortOrder.f675b);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = C0259a.m1038a(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 2:
                    z = C0259a.m1046d(parcel, readInt);
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
            return new FieldWithSortOrder(i, str, z);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FieldWithSortOrder[i];
    }
}
