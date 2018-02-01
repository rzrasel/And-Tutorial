package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import java.util.List;

public final class C0321g implements Creator {
    static void m1136a(LogicalFilter logicalFilter, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1000, logicalFilter.f690c);
        C0261c.m1072a(parcel, 1, logicalFilter.f688a, i, false);
        C0261c.m1083b(parcel, 2, logicalFilter.f689b, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        Operator operator = null;
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    operator = (Operator) C0259a.m1040a(parcel, readInt, Operator.CREATOR);
                    break;
                case 2:
                    list = C0259a.m1044c(parcel, readInt, FilterHolder.CREATOR);
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
            return new LogicalFilter(i, operator, list);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LogicalFilter[i];
    }
}
