package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import java.util.List;

public final class C0407a implements Creator {
    static void m2778a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1083b(parcel, 1, activityRecognitionResult.f2024a, false);
        C0261c.m1082b(parcel, 1000, activityRecognitionResult.m2775a());
        C0261c.m1069a(parcel, 2, activityRecognitionResult.f2025b);
        C0261c.m1069a(parcel, 3, activityRecognitionResult.f2026c);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        int a = C0259a.m1038a(parcel);
        List list = null;
        long j2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    list = C0259a.m1044c(parcel, readInt, DetectedActivity.CREATOR);
                    break;
                case 2:
                    j2 = C0259a.m1049g(parcel, readInt);
                    break;
                case 3:
                    j = C0259a.m1049g(parcel, readInt);
                    break;
                case 1000:
                    C0259a.m1048f(parcel, readInt);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ActivityRecognitionResult(list, j2, j);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
