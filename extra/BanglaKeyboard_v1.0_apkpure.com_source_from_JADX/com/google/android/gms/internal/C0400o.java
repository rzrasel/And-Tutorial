package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import java.util.List;

public final class C0400o implements Creator {
    public static ah m2748a(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        List list = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        av avVar = null;
        Location location = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 3:
                    bundle = C0259a.m1056n(parcel, readInt);
                    break;
                case 4:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 5:
                    list = C0259a.m1061s(parcel, readInt);
                    break;
                case 6:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                case 7:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 8:
                    z2 = C0259a.m1046d(parcel, readInt);
                    break;
                case 9:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 10:
                    avVar = (av) C0259a.m1040a(parcel, readInt, av.CREATOR);
                    break;
                case 11:
                    location = (Location) C0259a.m1040a(parcel, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ah(i, j, bundle, i2, list, z, i3, z2, str, avVar, location, str2);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    static void m2749a(ah ahVar, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, ahVar.f914a);
        C0261c.m1069a(parcel, 2, ahVar.f915b);
        C0261c.m1070a(parcel, 3, ahVar.f916c);
        C0261c.m1082b(parcel, 4, ahVar.f917d);
        C0261c.m1074a(parcel, 5, ahVar.f918e, false);
        C0261c.m1075a(parcel, 6, ahVar.f919f);
        C0261c.m1082b(parcel, 7, ahVar.f920g);
        C0261c.m1075a(parcel, 8, ahVar.f921h);
        C0261c.m1073a(parcel, 9, ahVar.f922i, false);
        C0261c.m1072a(parcel, 10, ahVar.f923j, i, false);
        C0261c.m1072a(parcel, 11, ahVar.f924k, i, false);
        C0261c.m1073a(parcel, 12, ahVar.f925l, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0400o.m2748a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ah[i];
    }
}
