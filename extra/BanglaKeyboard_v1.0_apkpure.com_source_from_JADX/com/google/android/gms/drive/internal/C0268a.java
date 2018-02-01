package com.google.android.gms.drive.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.drive.DriveId;

public final class C0268a implements Creator {
    static void m1089a(AddEventListenerRequest addEventListenerRequest, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, addEventListenerRequest.f580a);
        C0261c.m1072a(parcel, 2, addEventListenerRequest.f581b, i, false);
        C0261c.m1082b(parcel, 3, addEventListenerRequest.f582c);
        C0261c.m1072a(parcel, 4, addEventListenerRequest.f583d, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        DriveId driveId = null;
        int i2 = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    driveId = (DriveId) C0259a.m1040a(parcel, readInt, DriveId.CREATOR);
                    break;
                case 3:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C0259a.m1040a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new AddEventListenerRequest(i2, driveId, i, pendingIntent);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AddEventListenerRequest[i];
    }
}
