package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.drive.DriveId;

public final class C0277j implements Creator {
    static void m1098a(OpenFileIntentSenderRequest openFileIntentSenderRequest, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, openFileIntentSenderRequest.f635a);
        C0261c.m1073a(parcel, 2, openFileIntentSenderRequest.f636b, false);
        C0261c.m1078a(parcel, 3, openFileIntentSenderRequest.f637c);
        C0261c.m1072a(parcel, 4, openFileIntentSenderRequest.f638d, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        DriveId driveId = null;
        int a = C0259a.m1038a(parcel);
        String str = null;
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    strArr = C0259a.m1060r(parcel, readInt);
                    break;
                case 4:
                    driveId = (DriveId) C0259a.m1040a(parcel, readInt, DriveId.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new OpenFileIntentSenderRequest(i, str, strArr, driveId);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OpenFileIntentSenderRequest[i];
    }
}
