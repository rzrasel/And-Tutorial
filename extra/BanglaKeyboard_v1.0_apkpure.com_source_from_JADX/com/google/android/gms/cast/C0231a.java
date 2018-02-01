package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import java.util.List;

public final class C0231a implements Creator {
    static void m960a(ApplicationMetadata applicationMetadata, Parcel parcel, int i) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, applicationMetadata.m947a());
        C0261c.m1073a(parcel, 2, applicationMetadata.m948b(), false);
        C0261c.m1073a(parcel, 3, applicationMetadata.m949c(), false);
        C0261c.m1083b(parcel, 4, applicationMetadata.m952f(), false);
        C0261c.m1074a(parcel, 5, applicationMetadata.f454d, false);
        C0261c.m1073a(parcel, 6, applicationMetadata.m950d(), false);
        C0261c.m1072a(parcel, 7, applicationMetadata.m951e(), i, false);
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Uri uri = null;
        int a = C0259a.m1038a(parcel);
        int i = 0;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    str3 = C0259a.m1054l(parcel, readInt);
                    break;
                case 3:
                    str2 = C0259a.m1054l(parcel, readInt);
                    break;
                case 4:
                    list2 = C0259a.m1044c(parcel, readInt, WebImage.CREATOR);
                    break;
                case 5:
                    list = C0259a.m1061s(parcel, readInt);
                    break;
                case 6:
                    str = C0259a.m1054l(parcel, readInt);
                    break;
                case 7:
                    uri = (Uri) C0259a.m1040a(parcel, readInt, Uri.CREATOR);
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ApplicationMetadata(i, str3, str2, list2, list, str, uri);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ApplicationMetadata[i];
    }
}
