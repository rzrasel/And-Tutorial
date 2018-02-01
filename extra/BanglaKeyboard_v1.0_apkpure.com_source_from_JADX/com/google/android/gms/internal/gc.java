package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class gc implements Creator {
    static void m2072a(dx dxVar, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, dxVar.f1221a);
        C0261c.m1073a(parcel, 2, dxVar.f1222b, false);
        C0261c.m1082b(parcel, 3, dxVar.f1223c);
        C0261c.m1082b(parcel, 4, dxVar.f1224d);
        C0261c.m1075a(parcel, 5, dxVar.f1225e);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = C0259a.m1038a(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 4:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 5:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new dx(i3, str, i2, i, z);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new dx[i];
    }
}
