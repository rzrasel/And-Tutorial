package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class C0274g implements Creator {
    static void m1095a(OnMetadataResponse onMetadataResponse, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, onMetadataResponse.f628a);
        C0261c.m1072a(parcel, 2, onMetadataResponse.f629b, i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        int i = 0;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    metadataBundle = (MetadataBundle) C0259a.m1040a(parcel, readInt, MetadataBundle.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new OnMetadataResponse(i, metadataBundle);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OnMetadataResponse[i];
    }
}
