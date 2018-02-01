package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ConflictEvent;

public final class C0271d implements Creator {
    static void m1092a(OnEventResponse onEventResponse, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, onEventResponse.f619a);
        C0261c.m1082b(parcel, 2, onEventResponse.f620b);
        C0261c.m1072a(parcel, 3, onEventResponse.f621c, i, false);
        C0261c.m1072a(parcel, 4, onEventResponse.f622d, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        ChangeEvent changeEvent = null;
        int i = 0;
        int i2 = 0;
        ConflictEvent conflictEvent = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 3:
                    changeEvent = (ChangeEvent) C0259a.m1040a(parcel, readInt, ChangeEvent.CREATOR);
                    break;
                case 4:
                    conflictEvent = (ConflictEvent) C0259a.m1040a(parcel, readInt, ConflictEvent.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new OnEventResponse(i2, i, changeEvent, conflictEvent);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OnEventResponse[i];
    }
}
