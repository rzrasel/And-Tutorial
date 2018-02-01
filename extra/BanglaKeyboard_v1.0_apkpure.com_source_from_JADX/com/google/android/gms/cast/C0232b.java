package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import java.util.List;

public final class C0232b implements Creator {
    static void m961a(CastDevice castDevice, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, castDevice.m953a());
        C0261c.m1073a(parcel, 2, castDevice.m954b(), false);
        C0261c.m1073a(parcel, 3, castDevice.f458a, false);
        C0261c.m1073a(parcel, 4, castDevice.m955c(), false);
        C0261c.m1073a(parcel, 5, castDevice.m956d(), false);
        C0261c.m1073a(parcel, 6, castDevice.m957e(), false);
        C0261c.m1082b(parcel, 7, castDevice.m958f());
        C0261c.m1083b(parcel, 8, castDevice.m959g(), false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        List list = null;
        int a = C0259a.m1038a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str5 = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    str4 = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 5:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 6:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 7:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 8:
                    list = C0259a.m1044c(parcel, readInt, WebImage.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new CastDevice(i2, str5, str4, str3, str2, str, i, list);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CastDevice[i];
    }
}
