package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C1495j;
import com.google.android.gms.common.internal.C1496k;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class C1497i extends C1496k {
    private int f4535a;

    protected C1497i(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 25) {
            String str;
            String str2 = "GoogleCertificates";
            int length = bArr.length;
            int length2 = bArr.length;
            if (bArr == null || bArr.length == 0 || length2 <= 0 || length2 > bArr.length) {
                str = null;
            } else {
                StringBuilder stringBuilder = new StringBuilder((((length2 + 16) - 1) / 16) * 57);
                int i = 0;
                int i2 = length2;
                int i3 = 0;
                while (i2 > 0) {
                    if (i3 == 0) {
                        if (length2 < 65536) {
                            stringBuilder.append(String.format("%04X:", new Object[]{Integer.valueOf(i)}));
                        } else {
                            stringBuilder.append(String.format("%08X:", new Object[]{Integer.valueOf(i)}));
                        }
                    } else if (i3 == 8) {
                        stringBuilder.append(" -");
                    }
                    stringBuilder.append(String.format(" %02X", new Object[]{Integer.valueOf(bArr[i] & 255)}));
                    int i4 = i2 - 1;
                    i2 = i3 + 1;
                    if (i2 == 16 || i4 == 0) {
                        stringBuilder.append('\n');
                        i2 = 0;
                    }
                    i++;
                    i3 = i2;
                    i2 = i4;
                }
                str = stringBuilder.toString();
            }
            Log.wtf(str2, new StringBuilder(String.valueOf(str).length() + 51).append("Cert hash data has incorrect length (").append(length).append("):\n").append(str).toString(), new Exception());
            bArr = Arrays.copyOfRange(bArr, 0, 25);
            if (bArr.length == 25) {
                z = true;
            }
            C1516t.m3868b(z, "cert hash data has incorrect length. length=" + bArr.length);
        }
        this.f4535a = Arrays.hashCode(bArr);
    }

    protected static byte[] m3811a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final C1398a mo1651a() {
        return C1401c.m3584a(mo1663c());
    }

    public final int mo1652b() {
        return hashCode();
    }

    abstract byte[] mo1663c();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1495j)) {
            return false;
        }
        try {
            C1495j c1495j = (C1495j) obj;
            if (c1495j.mo1652b() != hashCode()) {
                return false;
            }
            C1398a a = c1495j.mo1651a();
            if (a == null) {
                return false;
            }
            return Arrays.equals(mo1663c(), (byte[]) C1401c.m3585a(a));
        } catch (RemoteException e) {
            return false;
        }
    }

    public int hashCode() {
        return this.f4535a;
    }
}
