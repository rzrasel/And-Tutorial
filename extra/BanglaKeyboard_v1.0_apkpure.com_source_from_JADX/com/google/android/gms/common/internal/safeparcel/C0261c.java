package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.actionbarsherlock.view.Menu;
import java.util.List;

public final class C0261c {
    public static int m1064a(Parcel parcel, int i) {
        parcel.writeInt(Menu.CATEGORY_MASK | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void m1065a(Parcel parcel, int i, byte b) {
        C0261c.m1068a(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void m1066a(Parcel parcel, int i, double d) {
        C0261c.m1068a(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void m1067a(Parcel parcel, int i, float f) {
        C0261c.m1068a(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void m1068a(Parcel parcel, int i, int i2) {
        if (i2 >= Menu.USER_MASK) {
            parcel.writeInt(Menu.CATEGORY_MASK | i);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt((i2 << 16) | i);
    }

    public static void m1069a(Parcel parcel, int i, long j) {
        C0261c.m1068a(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void m1070a(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int a = C0261c.m1064a(parcel, i);
            parcel.writeBundle(bundle);
            C0261c.m1081b(parcel, a);
        }
    }

    public static void m1071a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int a = C0261c.m1064a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            C0261c.m1081b(parcel, a);
        }
    }

    public static void m1072a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int a = C0261c.m1064a(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            C0261c.m1081b(parcel, a);
        } else if (z) {
            C0261c.m1068a(parcel, i, 0);
        }
    }

    public static void m1073a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int a = C0261c.m1064a(parcel, i);
            parcel.writeString(str);
            C0261c.m1081b(parcel, a);
        } else if (z) {
            C0261c.m1068a(parcel, i, 0);
        }
    }

    public static void m1074a(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int a = C0261c.m1064a(parcel, i);
            parcel.writeStringList(list);
            C0261c.m1081b(parcel, a);
        } else if (z) {
            C0261c.m1068a(parcel, i, 0);
        }
    }

    public static void m1075a(Parcel parcel, int i, boolean z) {
        C0261c.m1068a(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void m1076a(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int a = C0261c.m1064a(parcel, i);
            parcel.writeByteArray(bArr);
            C0261c.m1081b(parcel, a);
        }
    }

    public static void m1077a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int a = C0261c.m1064a(parcel, i);
            parcel.writeInt(r3);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C0261c.m1079a(parcel, parcelable, i2);
                }
            }
            C0261c.m1081b(parcel, a);
        }
    }

    public static void m1078a(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            int a = C0261c.m1064a(parcel, i);
            parcel.writeStringArray(strArr);
            C0261c.m1081b(parcel, a);
        }
    }

    private static void m1079a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void m1080a(Parcel parcel, List list) {
        if (list != null) {
            int a = C0261c.m1064a(parcel, 3);
            parcel.writeList(list);
            C0261c.m1081b(parcel, a);
        }
    }

    public static void m1081b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    public static void m1082b(Parcel parcel, int i, int i2) {
        C0261c.m1068a(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void m1083b(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int a = C0261c.m1064a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C0261c.m1079a(parcel, parcelable, 0);
                }
            }
            C0261c.m1081b(parcel, a);
        } else if (z) {
            C0261c.m1068a(parcel, i, 0);
        }
    }
}
