package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class li {
    public static int m5954a(Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void m5955a(Parcel parcel, int i, float f) {
        m5968b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void m5956a(Parcel parcel, int i, int i2) {
        m5968b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void m5957a(Parcel parcel, int i, long j) {
        m5968b(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void m5958a(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int a = m5954a(parcel, i);
            parcel.writeBundle(bundle);
            m5967b(parcel, a);
        }
    }

    public static void m5959a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int a = m5954a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m5967b(parcel, a);
        }
    }

    public static void m5960a(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int a = m5954a(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m5967b(parcel, a);
        }
    }

    public static void m5961a(Parcel parcel, int i, String str) {
        if (str != null) {
            int a = m5954a(parcel, i);
            parcel.writeString(str);
            m5967b(parcel, a);
        }
    }

    public static void m5962a(Parcel parcel, int i, List<String> list) {
        if (list != null) {
            int a = m5954a(parcel, i);
            parcel.writeStringList(list);
            m5967b(parcel, a);
        }
    }

    public static void m5963a(Parcel parcel, int i, boolean z) {
        m5968b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void m5964a(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int a = m5954a(parcel, i);
            parcel.writeByteArray(bArr);
            m5967b(parcel, a);
        }
    }

    public static <T extends Parcelable> void m5965a(Parcel parcel, int i, T[] tArr, int i2) {
        if (tArr != null) {
            int a = m5954a(parcel, i);
            parcel.writeInt(r3);
            for (Parcelable parcelable : tArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, i2);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            m5967b(parcel, a);
        }
    }

    public static void m5966a(Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            int a = m5954a(parcel, i);
            parcel.writeInt(r2);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            m5967b(parcel, a);
        }
    }

    public static void m5967b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    private static void m5968b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(-65536 | i);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt((i2 << 16) | i);
    }
}
