package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class C0409c implements Creator {
    static void m2781a(DetectedActivity detectedActivity, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, detectedActivity.f2028a);
        C0261c.m1082b(parcel, 1000, detectedActivity.m2776a());
        C0261c.m1082b(parcel, 2, detectedActivity.f2029b);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = C0259a.m1038a(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i2 = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 1000:
                    i3 = C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new DetectedActivity(i3, i2, i);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DetectedActivity[i];
    }
}
