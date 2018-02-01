package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ga.C0366a;
import java.util.ArrayList;
import java.util.HashMap;

public class gd implements SafeParcelable {
    public static final jv CREATOR = new jv();
    private final int f1453a;
    private final HashMap f1454b;
    private final ArrayList f1455c = null;
    private final String f1456d;

    public class C0367a implements SafeParcelable {
        public static final jx CREATOR = new jx();
        final int f1447a;
        final String f1448b;
        final ArrayList f1449c;

        C0367a(int i, String str, ArrayList arrayList) {
            this.f1447a = i;
            this.f1448b = str;
            this.f1449c = arrayList;
        }

        C0367a(String str, HashMap hashMap) {
            this.f1447a = 1;
            this.f1448b = str;
            this.f1449c = C0367a.m2073a(hashMap);
        }

        private static ArrayList m2073a(HashMap hashMap) {
            if (hashMap == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : hashMap.keySet()) {
                arrayList.add(new C0368b(str, (C0366a) hashMap.get(str)));
            }
            return arrayList;
        }

        final HashMap m2074a() {
            HashMap hashMap = new HashMap();
            int size = this.f1449c.size();
            for (int i = 0; i < size; i++) {
                C0368b c0368b = (C0368b) this.f1449c.get(i);
                hashMap.put(c0368b.f1451b, c0368b.f1452c);
            }
            return hashMap;
        }

        public int describeContents() {
            jx jxVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            jx jxVar = CREATOR;
            jx.m2497a(this, parcel);
        }
    }

    public class C0368b implements SafeParcelable {
        public static final jt CREATOR = new jt();
        final int f1450a;
        final String f1451b;
        final C0366a f1452c;

        C0368b(int i, String str, C0366a c0366a) {
            this.f1450a = i;
            this.f1451b = str;
            this.f1452c = c0366a;
        }

        C0368b(String str, C0366a c0366a) {
            this.f1450a = 1;
            this.f1451b = str;
            this.f1452c = c0366a;
        }

        public int describeContents() {
            jt jtVar = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            jt jtVar = CREATOR;
            jt.m2493a(this, parcel, i);
        }
    }

    gd(int i, ArrayList arrayList, String str) {
        this.f1453a = i;
        this.f1454b = m2075a(arrayList);
        this.f1456d = (String) je.m2473a((Object) str);
        m2076d();
    }

    private static HashMap m2075a(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0367a c0367a = (C0367a) arrayList.get(i);
            hashMap.put(c0367a.f1448b, c0367a.m2074a());
        }
        return hashMap;
    }

    private void m2076d() {
        for (String str : this.f1454b.keySet()) {
            HashMap hashMap = (HashMap) this.f1454b.get(str);
            for (String str2 : hashMap.keySet()) {
                ((C0366a) hashMap.get(str2)).m2049a(this);
            }
        }
    }

    final int m2077a() {
        return this.f1453a;
    }

    public final HashMap m2078a(String str) {
        return (HashMap) this.f1454b.get(str);
    }

    final ArrayList m2079b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f1454b.keySet()) {
            arrayList.add(new C0367a(str, (HashMap) this.f1454b.get(str)));
        }
        return arrayList;
    }

    public final String m2080c() {
        return this.f1456d;
    }

    public int describeContents() {
        jv jvVar = CREATOR;
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : this.f1454b.keySet()) {
            stringBuilder.append(str).append(":\n");
            HashMap hashMap = (HashMap) this.f1454b.get(str);
            for (String str2 : hashMap.keySet()) {
                stringBuilder.append("  ").append(str2).append(": ");
                stringBuilder.append(hashMap.get(str2));
            }
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        jv jvVar = CREATOR;
        jv.m2495a(this, parcel);
    }
}
