package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0402q implements Creator {
    public static ak m2752a(Parcel parcel) {
        ak[] akVarArr = null;
        int i = 0;
        int a = C0259a.m1038a(parcel);
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        int i5 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i5 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    i4 = C0259a.m1048f(parcel, readInt);
                    break;
                case 4:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 5:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 6:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 7:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 8:
                    akVarArr = (ak[]) C0259a.m1043b(parcel, readInt, ak.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ak(i5, str, i4, i3, z, i2, i, akVarArr);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m2753a(ak akVar, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, akVar.f934a);
        C0261c.m1073a(parcel, 2, akVar.f935b, false);
        C0261c.m1082b(parcel, 3, akVar.f936c);
        C0261c.m1082b(parcel, 4, akVar.f937d);
        C0261c.m1075a(parcel, 5, akVar.f938e);
        C0261c.m1082b(parcel, 6, akVar.f939f);
        C0261c.m1082b(parcel, 7, akVar.f940g);
        C0261c.m1077a(parcel, 8, akVar.f941h, i);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0402q.m2752a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ak[i];
    }
}
