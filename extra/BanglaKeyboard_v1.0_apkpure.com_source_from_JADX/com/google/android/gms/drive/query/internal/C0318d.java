package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0318d implements Creator {
    static void m1133a(FilterHolder filterHolder, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1072a(parcel, 1, filterHolder.f678b, i, false);
        C0261c.m1082b(parcel, 1000, filterHolder.f677a);
        C0261c.m1072a(parcel, 2, filterHolder.f679c, i, false);
        C0261c.m1072a(parcel, 3, filterHolder.f680d, i, false);
        C0261c.m1072a(parcel, 4, filterHolder.f681e, i, false);
        C0261c.m1072a(parcel, 5, filterHolder.f682f, i, false);
        C0261c.m1072a(parcel, 6, filterHolder.f683g, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        MatchAllFilter matchAllFilter = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        InFilter inFilter = null;
        NotFilter notFilter = null;
        LogicalFilter logicalFilter = null;
        FieldOnlyFilter fieldOnlyFilter = null;
        ComparisonFilter comparisonFilter = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    comparisonFilter = (ComparisonFilter) C0259a.m1040a(parcel, readInt, ComparisonFilter.CREATOR);
                    break;
                case 2:
                    fieldOnlyFilter = (FieldOnlyFilter) C0259a.m1040a(parcel, readInt, FieldOnlyFilter.CREATOR);
                    break;
                case 3:
                    logicalFilter = (LogicalFilter) C0259a.m1040a(parcel, readInt, LogicalFilter.CREATOR);
                    break;
                case 4:
                    notFilter = (NotFilter) C0259a.m1040a(parcel, readInt, NotFilter.CREATOR);
                    break;
                case 5:
                    inFilter = (InFilter) C0259a.m1040a(parcel, readInt, InFilter.CREATOR);
                    break;
                case 6:
                    matchAllFilter = (MatchAllFilter) C0259a.m1040a(parcel, readInt, MatchAllFilter.CREATOR);
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
            return new FilterHolder(i, comparisonFilter, fieldOnlyFilter, logicalFilter, notFilter, inFilter, matchAllFilter);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FilterHolder[i];
    }
}
