package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.drive.query.internal.LogicalFilter;

public final class C0313b implements Creator {
    static void m1128a(Query query, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1000, query.f664d);
        C0261c.m1072a(parcel, 1, query.f661a, i, false);
        C0261c.m1073a(parcel, 3, query.f662b, false);
        C0261c.m1072a(parcel, 4, query.f663c, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        String str = null;
        LogicalFilter logicalFilter = null;
        int i = 0;
        SortOrder sortOrder = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    logicalFilter = (LogicalFilter) C0259a.m1040a(parcel, readInt, LogicalFilter.CREATOR);
                    break;
                case 3:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    sortOrder = (SortOrder) C0259a.m1040a(parcel, readInt, SortOrder.CREATOR);
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
            return new Query(i, logicalFilter, str, sortOrder);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Query[i];
    }
}
