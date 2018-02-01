package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0244c implements Creator {
    static void m993a(DataHolder dataHolder, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1078a(parcel, 1, dataHolder.m984c());
        C0261c.m1082b(parcel, 1000, dataHolder.m981b());
        C0261c.m1077a(parcel, 2, dataHolder.m986d(), i);
        C0261c.m1082b(parcel, 3, dataHolder.m987e());
        C0261c.m1070a(parcel, 4, dataHolder.m990f());
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int a = C0259a.m1038a(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    strArr = C0259a.m1060r(parcel, readInt);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) C0259a.m1043b(parcel, readInt, CursorWindow.CREATOR);
                    break;
                case 3:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 4:
                    bundle = C0259a.m1056n(parcel, readInt);
                    break;
                case 1000:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a) {
            throw new C0260b("Overread allowed size end=" + a, parcel);
        }
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i, bundle);
        dataHolder.m979a();
        return dataHolder;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
