package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class C0283p implements Creator {
    static void m1104a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, closeContentsAndUpdateMetadataRequest.f587a);
        C0261c.m1072a(parcel, 2, closeContentsAndUpdateMetadataRequest.f588b, i, false);
        C0261c.m1072a(parcel, 3, closeContentsAndUpdateMetadataRequest.f589c, i, false);
        C0261c.m1072a(parcel, 4, closeContentsAndUpdateMetadataRequest.f590d, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        MetadataBundle metadataBundle = null;
        DriveId driveId = null;
        int i = 0;
        Contents contents = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    driveId = (DriveId) C0259a.m1040a(parcel, readInt, DriveId.CREATOR);
                    break;
                case 3:
                    metadataBundle = (MetadataBundle) C0259a.m1040a(parcel, readInt, MetadataBundle.CREATOR);
                    break;
                case 4:
                    contents = (Contents) C0259a.m1040a(parcel, readInt, Contents.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new CloseContentsAndUpdateMetadataRequest(i, driveId, metadataBundle, contents);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CloseContentsAndUpdateMetadataRequest[i];
    }
}
