package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class cq implements Creator {
    static void m1824a(ce ceVar, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, ceVar.f1107a);
        C0261c.m1072a(parcel, 2, ceVar.f1108b, i, false);
        C0261c.m1071a(parcel, 3, ceVar.m1758a());
        C0261c.m1071a(parcel, 4, ceVar.m1759b());
        C0261c.m1071a(parcel, 5, ceVar.m1760c());
        C0261c.m1071a(parcel, 6, ceVar.m1761d());
        C0261c.m1073a(parcel, 7, ceVar.f1113g, false);
        C0261c.m1075a(parcel, 8, ceVar.f1114h);
        C0261c.m1073a(parcel, 9, ceVar.f1115i, false);
        C0261c.m1071a(parcel, 10, ceVar.m1763f());
        C0261c.m1082b(parcel, 11, ceVar.f1117k);
        C0261c.m1082b(parcel, 12, ceVar.f1118l);
        C0261c.m1073a(parcel, 13, ceVar.f1119m, false);
        C0261c.m1072a(parcel, 14, ceVar.f1120n, i, false);
        C0261c.m1071a(parcel, 15, ceVar.m1762e());
        C0261c.m1073a(parcel, 16, ceVar.f1122p, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        cb cbVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        dx dxVar = null;
        IBinder iBinder6 = null;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    cbVar = (cb) C0259a.m1040a(parcel, readInt, cb.CREATOR);
                    break;
                case 3:
                    iBinder = C0259a.m1055m(parcel, readInt);
                    break;
                case 4:
                    iBinder2 = C0259a.m1055m(parcel, readInt);
                    break;
                case 5:
                    iBinder3 = C0259a.m1055m(parcel, readInt);
                    break;
                case 6:
                    iBinder4 = C0259a.m1055m(parcel, readInt);
                    break;
                case 7:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 8:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 9:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 10:
                    iBinder5 = C0259a.m1055m(parcel, readInt);
                    break;
                case 11:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 12:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 13:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 14:
                    dxVar = (dx) C0259a.m1040a(parcel, readInt, dx.CREATOR);
                    break;
                case 15:
                    iBinder6 = C0259a.m1055m(parcel, readInt);
                    break;
                case 16:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ce(i, cbVar, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, dxVar, iBinder6, str4);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ce[i];
    }
}
