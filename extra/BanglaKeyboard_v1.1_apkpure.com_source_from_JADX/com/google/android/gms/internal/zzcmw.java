package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzcmw extends zzbcc {
    public static final Creator<zzcmw> CREATOR = new my();
    private static byte[][] f7717a = new byte[0][];
    private static zzcmw f7718b = new zzcmw("", null, f7717a, f7717a, f7717a, f7717a, null, null);
    private static final mx f7719k = new ms();
    private static final mx f7720l = new mt();
    private static final mx f7721m = new mu();
    private static final mx f7722n = new mw();
    private String f7723c;
    private byte[] f7724d;
    private byte[][] f7725e;
    private byte[][] f7726f;
    private byte[][] f7727g;
    private byte[][] f7728h;
    private int[] f7729i;
    private byte[][] f7730j;

    public zzcmw(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f7723c = str;
        this.f7724d = bArr;
        this.f7725e = bArr2;
        this.f7726f = bArr3;
        this.f7727g = bArr4;
        this.f7728h = bArr5;
        this.f7729i = iArr;
        this.f7730j = bArr6;
    }

    private static List<Integer> m7095a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        List<Integer> arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<String> m7096a(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        List<String> arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void m7097a(StringBuilder stringBuilder, String str, int[] iArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (iArr == null) {
            stringBuilder.append("null");
            return;
        }
        stringBuilder.append("(");
        int length = iArr.length;
        Object obj = 1;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            if (obj == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(i2);
            i++;
            obj = null;
        }
        stringBuilder.append(")");
    }

    private static void m7098a(StringBuilder stringBuilder, String str, byte[][] bArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (bArr == null) {
            stringBuilder.append("null");
            return;
        }
        stringBuilder.append("(");
        int length = bArr.length;
        Object obj = 1;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (obj == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("'");
            stringBuilder.append(Base64.encodeToString(bArr2, 3));
            stringBuilder.append("'");
            i++;
            obj = null;
        }
        stringBuilder.append(")");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcmw)) {
            return false;
        }
        zzcmw com_google_android_gms_internal_zzcmw = (zzcmw) obj;
        return mz.m6028a(this.f7723c, com_google_android_gms_internal_zzcmw.f7723c) && Arrays.equals(this.f7724d, com_google_android_gms_internal_zzcmw.f7724d) && mz.m6028a(m7096a(this.f7725e), m7096a(com_google_android_gms_internal_zzcmw.f7725e)) && mz.m6028a(m7096a(this.f7726f), m7096a(com_google_android_gms_internal_zzcmw.f7726f)) && mz.m6028a(m7096a(this.f7727g), m7096a(com_google_android_gms_internal_zzcmw.f7727g)) && mz.m6028a(m7096a(this.f7728h), m7096a(com_google_android_gms_internal_zzcmw.f7728h)) && mz.m6028a(m7095a(this.f7729i), m7095a(com_google_android_gms_internal_zzcmw.f7729i)) && mz.m6028a(m7096a(this.f7730j), m7096a(com_google_android_gms_internal_zzcmw.f7730j));
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("ExperimentTokens");
        stringBuilder.append("(");
        if (this.f7723c == null) {
            str = "null";
        } else {
            str = "'";
            String str2 = this.f7723c;
            String str3 = "'";
            str = new StringBuilder((String.valueOf(str).length() + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(str2).append(str3).toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        byte[] bArr = this.f7724d;
        stringBuilder.append("direct");
        stringBuilder.append("=");
        if (bArr == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append("'");
            stringBuilder.append(Base64.encodeToString(bArr, 3));
            stringBuilder.append("'");
        }
        stringBuilder.append(", ");
        m7098a(stringBuilder, "GAIA", this.f7725e);
        stringBuilder.append(", ");
        m7098a(stringBuilder, "PSEUDO", this.f7726f);
        stringBuilder.append(", ");
        m7098a(stringBuilder, "ALWAYS", this.f7727g);
        stringBuilder.append(", ");
        m7098a(stringBuilder, "OTHER", this.f7728h);
        stringBuilder.append(", ");
        m7097a(stringBuilder, "weak", this.f7729i);
        stringBuilder.append(", ");
        m7098a(stringBuilder, "directs", this.f7730j);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5961a(parcel, 2, this.f7723c);
        li.m5964a(parcel, 3, this.f7724d);
        li.m5966a(parcel, 4, this.f7725e);
        li.m5966a(parcel, 5, this.f7726f);
        li.m5966a(parcel, 6, this.f7727g);
        li.m5966a(parcel, 7, this.f7728h);
        int[] iArr = this.f7729i;
        if (iArr != null) {
            int a2 = li.m5954a(parcel, 8);
            parcel.writeIntArray(iArr);
            li.m5967b(parcel, a2);
        }
        li.m5966a(parcel, 9, this.f7730j);
        li.m5967b(parcel, a);
    }
}
