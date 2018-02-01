package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import java.util.ArrayList;
import java.util.List;

public final class C0486j implements Creator {
    static void m3552a(PolygonOptions polygonOptions, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, polygonOptions.m3251a());
        C0261c.m1083b(parcel, 2, polygonOptions.m3253c(), false);
        C0261c.m1080a(parcel, polygonOptions.m3252b());
        C0261c.m1067a(parcel, 4, polygonOptions.m3254d());
        C0261c.m1082b(parcel, 5, polygonOptions.m3255e());
        C0261c.m1082b(parcel, 6, polygonOptions.m3256f());
        C0261c.m1067a(parcel, 7, polygonOptions.m3257g());
        C0261c.m1075a(parcel, 8, polygonOptions.m3258h());
        C0261c.m1075a(parcel, 9, polygonOptions.m3259i());
        C0261c.m1081b(parcel, a);
    }

    public final PolygonOptions m3553a(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int a = C0259a.m1038a(parcel);
        List list = null;
        List arrayList = new ArrayList();
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    list = C0259a.m1044c(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    ClassLoader classLoader = getClass().getClassLoader();
                    readInt = C0259a.m1039a(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (readInt == 0) {
                        break;
                    }
                    parcel.readList(arrayList, classLoader);
                    parcel.setDataPosition(readInt + dataPosition);
                    break;
                case 4:
                    f2 = C0259a.m1051i(parcel, readInt);
                    break;
                case 5:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 6:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 7:
                    f = C0259a.m1051i(parcel, readInt);
                    break;
                case 8:
                    z2 = C0259a.m1046d(parcel, readInt);
                    break;
                case 9:
                    z = C0259a.m1046d(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new PolygonOptions(i3, list, arrayList, f2, i2, i, f, z2, z);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3553a(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
