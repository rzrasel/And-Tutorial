package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0513g implements Creator {
    static void m3596a(C0514h c0514h, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1073a(parcel, 1, c0514h.m3598b(), false);
        C0261c.m1082b(parcel, 1000, c0514h.m3597a());
        C0261c.m1078a(parcel, 2, c0514h.m3599c());
        C0261c.m1078a(parcel, 3, c0514h.m3600d());
        C0261c.m1078a(parcel, 4, c0514h.m3601e());
        C0261c.m1073a(parcel, 5, c0514h.m3602f(), false);
        C0261c.m1073a(parcel, 6, c0514h.m3603g(), false);
        C0261c.m1073a(parcel, 7, c0514h.m3604h(), false);
        C0261c.m1073a(parcel, 8, c0514h.m3605i(), false);
        C0261c.m1072a(parcel, 9, c0514h.m3606j(), i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        PlusCommonExtras plusCommonExtras = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str5 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    str5 = C0259a.m1054l(parcel, readInt);
                    break;
                case 2:
                    strArr3 = C0259a.m1060r(parcel, readInt);
                    break;
                case 3:
                    strArr2 = C0259a.m1060r(parcel, readInt);
                    break;
                case 4:
                    strArr = C0259a.m1060r(parcel, readInt);
                    break;
                case 5:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 7:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 8:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 9:
                    plusCommonExtras = (PlusCommonExtras) C0259a.m1040a(parcel, readInt, PlusCommonExtras.CREATOR);
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
            return new C0514h(i, str5, strArr3, strArr2, strArr, str4, str3, str2, str, plusCommonExtras);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0514h[i];
    }
}
