package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class ej implements Creator {
    public static cx m1933a(Parcel parcel) {
        Bundle bundle = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        dx dxVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        PackageInfo packageInfo = null;
        ApplicationInfo applicationInfo = null;
        String str4 = null;
        ak akVar = null;
        ah ahVar = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    bundle2 = C0259a.m1056n(parcel, readInt);
                    break;
                case 3:
                    ahVar = (ah) C0259a.m1040a(parcel, readInt, ah.CREATOR);
                    break;
                case 4:
                    akVar = (ak) C0259a.m1040a(parcel, readInt, ak.CREATOR);
                    break;
                case 5:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C0259a.m1040a(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C0259a.m1040a(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 8:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 9:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 10:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 11:
                    dxVar = (dx) C0259a.m1040a(parcel, readInt, dx.CREATOR);
                    break;
                case 12:
                    bundle = C0259a.m1056n(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new cx(i, bundle2, ahVar, akVar, str4, applicationInfo, packageInfo, str3, str2, str, dxVar, bundle);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m1934a(cx cxVar, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, cxVar.f1157a);
        C0261c.m1070a(parcel, 2, cxVar.f1158b);
        C0261c.m1072a(parcel, 3, cxVar.f1159c, i, false);
        C0261c.m1072a(parcel, 4, cxVar.f1160d, i, false);
        C0261c.m1073a(parcel, 5, cxVar.f1161e, false);
        C0261c.m1072a(parcel, 6, cxVar.f1162f, i, false);
        C0261c.m1072a(parcel, 7, cxVar.f1163g, i, false);
        C0261c.m1073a(parcel, 8, cxVar.f1164h, false);
        C0261c.m1073a(parcel, 9, cxVar.f1165i, false);
        C0261c.m1073a(parcel, 10, cxVar.f1166j, false);
        C0261c.m1072a(parcel, 11, cxVar.f1167k, i, false);
        C0261c.m1070a(parcel, 12, cxVar.f1168l);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m1933a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new cx[i];
    }
}
