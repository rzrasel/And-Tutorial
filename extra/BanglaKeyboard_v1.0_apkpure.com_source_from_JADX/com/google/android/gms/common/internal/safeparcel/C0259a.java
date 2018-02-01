package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public final class C0259a {
    public static int m1038a(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = C0259a.m1039a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((Menu.USER_MASK & readInt) != 20293) {
            throw new C0260b("Expected object header. Got 0x" + Integer.toHexString(readInt), parcel);
        }
        readInt = dataPosition + a;
        if (readInt >= dataPosition && readInt <= parcel.dataSize()) {
            return readInt;
        }
        throw new C0260b("Size read is invalid start=" + dataPosition + " end=" + readInt, parcel);
    }

    public static int m1039a(Parcel parcel, int i) {
        return (i & Menu.CATEGORY_MASK) != Menu.CATEGORY_MASK ? (i >> 16) & Menu.USER_MASK : parcel.readInt();
    }

    public static Parcelable m1040a(Parcel parcel, int i, Creator creator) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    public static void m1041a(Parcel parcel, int i, int i2) {
        int a = C0259a.m1039a(parcel, i);
        if (a != i2) {
            throw new C0260b("Expected size " + i2 + " got " + a + " (0x" + Integer.toHexString(a) + ")", parcel);
        }
    }

    public static void m1042b(Parcel parcel, int i) {
        parcel.setDataPosition(C0259a.m1039a(parcel, i) + parcel.dataPosition());
    }

    public static Object[] m1043b(Parcel parcel, int i, Creator creator) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static ArrayList m1044c(Parcel parcel, int i, Creator creator) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    public static void m1045c(Parcel parcel, int i) {
        if (i != 4) {
            throw new C0260b("Expected size 4 got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
        }
    }

    public static boolean m1046d(Parcel parcel, int i) {
        C0259a.m1041a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte m1047e(Parcel parcel, int i) {
        C0259a.m1041a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static int m1048f(Parcel parcel, int i) {
        C0259a.m1041a(parcel, i, 4);
        return parcel.readInt();
    }

    public static long m1049g(Parcel parcel, int i) {
        C0259a.m1041a(parcel, i, 8);
        return parcel.readLong();
    }

    public static BigInteger m1050h(Parcel parcel, int i) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return new BigInteger(createByteArray);
    }

    public static float m1051i(Parcel parcel, int i) {
        C0259a.m1041a(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double m1052j(Parcel parcel, int i) {
        C0259a.m1041a(parcel, i, 8);
        return parcel.readDouble();
    }

    public static BigDecimal m1053k(Parcel parcel, int i) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(a + dataPosition);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static String m1054l(Parcel parcel, int i) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static IBinder m1055m(Parcel parcel, int i) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static Bundle m1056n(Parcel parcel, int i) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    public static byte[] m1057o(Parcel parcel, int i) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    public static int[] m1058p(Parcel parcel, int i) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(a + dataPosition);
        return createIntArray;
    }

    public static BigDecimal[] m1059q(Parcel parcel, int i) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigDecimalArr;
    }

    public static String[] m1060r(Parcel parcel, int i) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    public static ArrayList m1061s(Parcel parcel, int i) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    public static Parcel m1062t(Parcel parcel, int i) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, a);
        parcel.setDataPosition(a + dataPosition);
        return obtain;
    }

    public static Parcel[] m1063u(Parcel parcel, int i) {
        int a = C0259a.m1039a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(readInt2 + dataPosition2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + a);
        return parcelArr;
    }
}
