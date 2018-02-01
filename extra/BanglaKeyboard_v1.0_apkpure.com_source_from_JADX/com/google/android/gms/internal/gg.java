package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.safeparcel.C0259a;
import com.google.android.gms.common.internal.safeparcel.C0260b;
import com.google.android.gms.common.internal.safeparcel.C0261c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ga.C0366a;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class gg extends ga implements SafeParcelable {
    public static final jz CREATOR = new jz();
    private final int f1469a;
    private final Parcel f1470b;
    private final int f1471c = 2;
    private final gd f1472d;
    private final String f1473e;
    private int f1474f;
    private int f1475g;

    gg(int i, Parcel parcel, gd gdVar) {
        this.f1469a = i;
        this.f1470b = (Parcel) je.m2473a((Object) parcel);
        this.f1472d = gdVar;
        if (this.f1472d == null) {
            this.f1473e = null;
        } else {
            this.f1473e = this.f1472d.m2080c();
        }
        this.f1474f = 2;
    }

    private static HashMap m2101a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    private static void m2102a(StringBuilder stringBuilder, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                stringBuilder.append(obj);
                return;
            case 7:
                stringBuilder.append("\"").append(ke.m2516a(obj.toString())).append("\"");
                return;
            case 8:
                stringBuilder.append("\"").append(kb.m2511a((byte[]) obj)).append("\"");
                return;
            case 9:
                stringBuilder.append("\"").append(kb.m2512b((byte[]) obj));
                stringBuilder.append("\"");
                return;
            case 10:
                kf.m2517a(stringBuilder, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    private void m2103a(StringBuilder stringBuilder, C0366a c0366a, Parcel parcel, int i) {
        boolean[] zArr = null;
        int i2 = 0;
        int length;
        if (c0366a.m2053e()) {
            stringBuilder.append("[");
            int dataPosition;
            switch (c0366a.m2052d()) {
                case 0:
                    int[] p = C0259a.m1058p(parcel, i);
                    length = p.length;
                    while (i2 < length) {
                        if (i2 != 0) {
                            stringBuilder.append(",");
                        }
                        stringBuilder.append(Integer.toString(p[i2]));
                        i2++;
                    }
                    break;
                case 1:
                    Object[] objArr;
                    length = C0259a.m1039a(parcel, i);
                    dataPosition = parcel.dataPosition();
                    if (length != 0) {
                        int readInt = parcel.readInt();
                        objArr = new BigInteger[readInt];
                        while (i2 < readInt) {
                            objArr[i2] = new BigInteger(parcel.createByteArray());
                            i2++;
                        }
                        parcel.setDataPosition(length + dataPosition);
                    }
                    ka.m2508a(stringBuilder, objArr);
                    break;
                case 2:
                    long[] createLongArray;
                    length = C0259a.m1039a(parcel, i);
                    i2 = parcel.dataPosition();
                    if (length != 0) {
                        createLongArray = parcel.createLongArray();
                        parcel.setDataPosition(length + i2);
                    }
                    ka.m2507a(stringBuilder, createLongArray);
                    break;
                case 3:
                    float[] createFloatArray;
                    length = C0259a.m1039a(parcel, i);
                    i2 = parcel.dataPosition();
                    if (length != 0) {
                        createFloatArray = parcel.createFloatArray();
                        parcel.setDataPosition(length + i2);
                    }
                    ka.m2506a(stringBuilder, createFloatArray);
                    break;
                case 4:
                    double[] createDoubleArray;
                    length = C0259a.m1039a(parcel, i);
                    i2 = parcel.dataPosition();
                    if (length != 0) {
                        createDoubleArray = parcel.createDoubleArray();
                        parcel.setDataPosition(length + i2);
                    }
                    ka.m2505a(stringBuilder, createDoubleArray);
                    break;
                case 5:
                    ka.m2508a(stringBuilder, C0259a.m1059q(parcel, i));
                    break;
                case 6:
                    length = C0259a.m1039a(parcel, i);
                    i2 = parcel.dataPosition();
                    if (length != 0) {
                        zArr = parcel.createBooleanArray();
                        parcel.setDataPosition(length + i2);
                    }
                    ka.m2510a(stringBuilder, zArr);
                    break;
                case 7:
                    ka.m2509a(stringBuilder, C0259a.m1060r(parcel, i));
                    break;
                case 8:
                case 9:
                case 10:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case 11:
                    Parcel[] u = C0259a.m1063u(parcel, i);
                    dataPosition = u.length;
                    for (int i3 = 0; i3 < dataPosition; i3++) {
                        if (i3 > 0) {
                            stringBuilder.append(",");
                        }
                        u[i3].setDataPosition(0);
                        m2105a(stringBuilder, c0366a.m2060l(), u[i3]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            stringBuilder.append("]");
            return;
        }
        switch (c0366a.m2052d()) {
            case 0:
                stringBuilder.append(C0259a.m1048f(parcel, i));
                return;
            case 1:
                stringBuilder.append(C0259a.m1050h(parcel, i));
                return;
            case 2:
                stringBuilder.append(C0259a.m1049g(parcel, i));
                return;
            case 3:
                stringBuilder.append(C0259a.m1051i(parcel, i));
                return;
            case 4:
                stringBuilder.append(C0259a.m1052j(parcel, i));
                return;
            case 5:
                stringBuilder.append(C0259a.m1053k(parcel, i));
                return;
            case 6:
                stringBuilder.append(C0259a.m1046d(parcel, i));
                return;
            case 7:
                stringBuilder.append("\"").append(ke.m2516a(C0259a.m1054l(parcel, i))).append("\"");
                return;
            case 8:
                stringBuilder.append("\"").append(kb.m2511a(C0259a.m1057o(parcel, i))).append("\"");
                return;
            case 9:
                stringBuilder.append("\"").append(kb.m2512b(C0259a.m1057o(parcel, i)));
                stringBuilder.append("\"");
                return;
            case 10:
                Bundle n = C0259a.m1056n(parcel, i);
                Set<String> keySet = n.keySet();
                keySet.size();
                stringBuilder.append("{");
                length = 1;
                for (String str : keySet) {
                    if (length == 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("\"").append(str).append("\"");
                    stringBuilder.append(":");
                    stringBuilder.append("\"").append(ke.m2516a(n.getString(str))).append("\"");
                    length = 0;
                }
                stringBuilder.append("}");
                return;
            case 11:
                Parcel t = C0259a.m1062t(parcel, i);
                t.setDataPosition(0);
                m2105a(stringBuilder, c0366a.m2060l(), t);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    private static void m2104a(StringBuilder stringBuilder, C0366a c0366a, Object obj) {
        if (c0366a.m2051c()) {
            ArrayList arrayList = (ArrayList) obj;
            stringBuilder.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    stringBuilder.append(",");
                }
                m2102a(stringBuilder, c0366a.m2050b(), arrayList.get(i));
            }
            stringBuilder.append("]");
            return;
        }
        m2102a(stringBuilder, c0366a.m2050b(), obj);
    }

    private void m2105a(StringBuilder stringBuilder, HashMap hashMap, Parcel parcel) {
        HashMap hashMap2 = new HashMap();
        for (Entry entry : hashMap.entrySet()) {
            Entry entry2;
            hashMap2.put(Integer.valueOf(((C0366a) entry2.getValue()).m2055g()), entry2);
        }
        stringBuilder.append('{');
        int a = C0259a.m1038a(parcel);
        Object obj = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            entry2 = (Entry) hashMap2.get(Integer.valueOf(Menu.USER_MASK & readInt));
            if (entry2 != null) {
                if (obj != null) {
                    stringBuilder.append(",");
                }
                String str = (String) entry2.getKey();
                C0366a c0366a = (C0366a) entry2.getValue();
                stringBuilder.append("\"").append(str).append("\":");
                if (c0366a.m2058j()) {
                    switch (c0366a.m2052d()) {
                        case 0:
                            m2104a(stringBuilder, c0366a, ga.m2061a(c0366a, Integer.valueOf(C0259a.m1048f(parcel, readInt))));
                            break;
                        case 1:
                            m2104a(stringBuilder, c0366a, ga.m2061a(c0366a, C0259a.m1050h(parcel, readInt)));
                            break;
                        case 2:
                            m2104a(stringBuilder, c0366a, ga.m2061a(c0366a, Long.valueOf(C0259a.m1049g(parcel, readInt))));
                            break;
                        case 3:
                            m2104a(stringBuilder, c0366a, ga.m2061a(c0366a, Float.valueOf(C0259a.m1051i(parcel, readInt))));
                            break;
                        case 4:
                            m2104a(stringBuilder, c0366a, ga.m2061a(c0366a, Double.valueOf(C0259a.m1052j(parcel, readInt))));
                            break;
                        case 5:
                            m2104a(stringBuilder, c0366a, ga.m2061a(c0366a, C0259a.m1053k(parcel, readInt)));
                            break;
                        case 6:
                            m2104a(stringBuilder, c0366a, ga.m2061a(c0366a, Boolean.valueOf(C0259a.m1046d(parcel, readInt))));
                            break;
                        case 7:
                            m2104a(stringBuilder, c0366a, ga.m2061a(c0366a, C0259a.m1054l(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            m2104a(stringBuilder, c0366a, ga.m2061a(c0366a, C0259a.m1057o(parcel, readInt)));
                            break;
                        case 10:
                            m2104a(stringBuilder, c0366a, ga.m2061a(c0366a, m2101a(C0259a.m1056n(parcel, readInt))));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + c0366a.m2052d());
                    }
                }
                m2103a(stringBuilder, c0366a, parcel, readInt);
                obj = 1;
            }
        }
        if (parcel.dataPosition() != a) {
            throw new C0260b("Overread allowed size end=" + a, parcel);
        }
        stringBuilder.append('}');
    }

    public final int m2106a() {
        return this.f1469a;
    }

    public final HashMap mo890b() {
        return this.f1472d == null ? null : this.f1472d.m2078a(this.f1473e);
    }

    protected final Object mo891c() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected final boolean mo892d() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int describeContents() {
        jz jzVar = CREATOR;
        return 0;
    }

    public final Parcel m2110e() {
        switch (this.f1474f) {
            case 0:
                this.f1475g = C0261c.m1064a(this.f1470b, 20293);
                break;
            case 1:
                break;
        }
        C0261c.m1081b(this.f1470b, this.f1475g);
        this.f1474f = 2;
        return this.f1470b;
    }

    final gd m2111f() {
        switch (this.f1471c) {
            case 0:
                return null;
            case 1:
                return this.f1472d;
            case 2:
                return this.f1472d;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.f1471c);
        }
    }

    public String toString() {
        je.m2474a(this.f1472d, (Object) "Cannot convert to JSON on client side.");
        Parcel e = m2110e();
        e.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        m2105a(stringBuilder, this.f1472d.m2078a(this.f1473e), e);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        jz jzVar = CREATOR;
        jz.m2499a(this, parcel, i);
    }
}
