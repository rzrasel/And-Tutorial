package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.drive.Contents;

public final class C0284q implements Creator {
    static void m1105a(CloseContentsRequest closeContentsRequest, Parcel parcel, int i) {
        int i2 = 1;
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, closeContentsRequest.f591a);
        C0261c.m1072a(parcel, 2, closeContentsRequest.f592b, i, false);
        Boolean bool = closeContentsRequest.f593c;
        if (bool != null) {
            C0261c.m1068a(parcel, 3, 4);
            if (!bool.booleanValue()) {
                i2 = 0;
            }
            parcel.writeInt(i2);
        }
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        Boolean bool = null;
        Contents contents = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    contents = (Contents) C0259a.m1040a(parcel, readInt, Contents.CREATOR);
                    break;
                case 3:
                    Boolean bool2;
                    readInt = C0259a.m1039a(parcel, readInt);
                    if (readInt == 0) {
                        bool2 = null;
                    } else {
                        C0259a.m1045c(parcel, readInt);
                        bool2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    bool = bool2;
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new CloseContentsRequest(i, contents, bool);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CloseContentsRequest[i];
    }
}
