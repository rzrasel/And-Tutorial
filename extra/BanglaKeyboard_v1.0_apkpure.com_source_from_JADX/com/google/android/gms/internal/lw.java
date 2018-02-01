package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;

public final class lw implements Creator {
    static void m2561a(ix ixVar, Parcel parcel) {
        int a = C0261c.m1064a(parcel, 20293);
        C0261c.m1082b(parcel, 1, ixVar.m2465a());
        C0261c.m1078a(parcel, 2, ixVar.f1841a);
        byte[][] bArr = ixVar.f1842b;
        if (bArr != null) {
            int a2 = C0261c.m1064a(parcel, 3);
            parcel.writeInt(r4);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            C0261c.m1081b(parcel, a2);
        }
        C0261c.m1081b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0259a.m1038a(parcel);
        byte[][] bArr = null;
        String[] strArr = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case 1:
                    i = C0259a.m1048f(parcel, readInt);
                    break;
                case 2:
                    strArr = C0259a.m1060r(parcel, readInt);
                    break;
                case 3:
                    int a2 = C0259a.m1039a(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (a2 != 0) {
                        int readInt2 = parcel.readInt();
                        bArr = new byte[readInt2][];
                        for (readInt = 0; readInt < readInt2; readInt++) {
                            bArr[readInt] = parcel.createByteArray();
                        }
                        parcel.setDataPosition(dataPosition + a2);
                        break;
                    }
                    bArr = null;
                    break;
                default:
                    C0259a.m1042b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ix(i, strArr, bArr);
        }
        throw new C0260b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ix[i];
    }
}
