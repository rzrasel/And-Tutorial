package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0264a implements Creator {
    static void m1085a(Contents contents, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, contents.f562a);
        C0261c.m1072a(parcel, 2, contents.f563b, i, false);
        C0261c.m1082b(parcel, 3, contents.f564c);
        C0261c.m1082b(parcel, 4, contents.f565d);
        C0261c.m1072a(parcel, 5, contents.f566e, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        DriveId driveId = null;
        int i = 0;
        int a = C0259a.m1038a(parcel);
        int i2 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) C0259a.m1040a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 4:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 5:
                    driveId = (DriveId) C0259a.m1040a(parcel, readInt, DriveId.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new Contents(i3, parcelFileDescriptor, i2, i, driveId);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Contents[i];
    }
}
