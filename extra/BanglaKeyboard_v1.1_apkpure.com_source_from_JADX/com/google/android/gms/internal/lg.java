package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class lg {
    public static int m5937a(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = m5938a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new lh(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        readInt = dataPosition + a;
        if (readInt >= dataPosition && readInt <= parcel.dataSize()) {
            return readInt;
        }
        throw new lh("Size read is invalid start=" + dataPosition + " end=" + readInt, parcel);
    }

    public static int m5938a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static <T extends Parcelable> T m5939a(Parcel parcel, int i, Creator<T> creator) {
        int a = m5938a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    private static void m5940a(Parcel parcel, int i, int i2) {
        int a = m5938a(parcel, i);
        if (a != i2) {
            String toHexString = Integer.toHexString(a);
            throw new lh(new StringBuilder(String.valueOf(toHexString).length() + 46).append("Expected size ").append(i2).append(" got ").append(a).append(" (0x").append(toHexString).append(")").toString(), parcel);
        }
    }

    public static void m5941b(Parcel parcel, int i) {
        parcel.setDataPosition(m5938a(parcel, i) + parcel.dataPosition());
    }

    public static <T> T[] m5942b(Parcel parcel, int i, Creator<T> creator) {
        int a = m5938a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static boolean m5943c(Parcel parcel, int i) {
        m5940a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int m5944d(Parcel parcel, int i) {
        m5940a(parcel, i, 4);
        return parcel.readInt();
    }

    public static long m5945e(Parcel parcel, int i) {
        m5940a(parcel, i, 8);
        return parcel.readLong();
    }

    public static float m5946f(Parcel parcel, int i) {
        m5940a(parcel, i, 4);
        return parcel.readFloat();
    }

    public static String m5947g(Parcel parcel, int i) {
        int a = m5938a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static IBinder m5948h(Parcel parcel, int i) {
        int a = m5938a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static Bundle m5949i(Parcel parcel, int i) {
        int a = m5938a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    public static byte[] m5950j(Parcel parcel, int i) {
        int a = m5938a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    public static byte[][] m5951k(Parcel parcel, int i) {
        int a = m5938a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + a);
        return bArr;
    }

    public static ArrayList<String> m5952l(Parcel parcel, int i) {
        int a = m5938a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    public static void m5953m(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new lh("Overread allowed size end=" + i, parcel);
        }
    }
}
