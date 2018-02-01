package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class C0286s implements Creator {
    static void m1107a(CreateFileIntentSenderRequest createFileIntentSenderRequest, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, createFileIntentSenderRequest.f595a);
        C0261c.m1072a(parcel, 2, createFileIntentSenderRequest.f596b, i, false);
        C0261c.m1082b(parcel, 3, createFileIntentSenderRequest.f597c);
        C0261c.m1073a(parcel, 4, createFileIntentSenderRequest.f598d, false);
        C0261c.m1072a(parcel, 5, createFileIntentSenderRequest.f599e, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        DriveId driveId = null;
        int a = C0259a.m1038a(parcel);
        String str = null;
        MetadataBundle metadataBundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    metadataBundle = (MetadataBundle) C0259a.m1040a(parcel, readInt, MetadataBundle.CREATOR);
                    break;
                case 3:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 4:
                    str = C0259a.m1054l(parcel, readInt);
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
            return new CreateFileIntentSenderRequest(i2, metadataBundle, i, str, driveId);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateFileIntentSenderRequest[i];
    }
}
