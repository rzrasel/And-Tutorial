package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class fx implements SafeParcelable, jq {
    public static final jj CREATOR = new jj();
    private final int f1427a;
    private final HashMap f1428b;
    private final HashMap f1429c;
    private final ArrayList f1430d;

    public final class C0364a implements SafeParcelable {
        public static final jl CREATOR = new jl();
        final int f1424a;
        final String f1425b;
        final int f1426c;

        C0364a(int i, String str, int i2) {
            this.f1424a = i;
            this.f1425b = str;
            this.f1426c = i2;
        }

        C0364a(String str, int i) {
            this.f1424a = 1;
            this.f1425b = str;
            this.f1426c = i;
        }

        public final int describeContents() {
            jl jlVar = CREATOR;
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            jl jlVar = CREATOR;
            jl.m2487a(this, parcel);
        }
    }

    public fx() {
        this.f1427a = 1;
        this.f1428b = new HashMap();
        this.f1429c = new HashMap();
        this.f1430d = null;
    }

    fx(int i, ArrayList arrayList) {
        this.f1427a = i;
        this.f1428b = new HashMap();
        this.f1429c = new HashMap();
        this.f1430d = null;
        m2022a(arrayList);
    }

    private void m2022a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0364a c0364a = (C0364a) it.next();
            m2024a(c0364a.f1425b, c0364a.f1426c);
        }
    }

    final int m2023a() {
        return this.f1427a;
    }

    public final fx m2024a(String str, int i) {
        this.f1428b.put(str, Integer.valueOf(i));
        this.f1429c.put(Integer.valueOf(i), str);
        return this;
    }

    public final /* synthetic */ Object mo889a(Object obj) {
        String str = (String) this.f1429c.get((Integer) obj);
        return (str == null && this.f1428b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    final ArrayList m2026b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f1428b.keySet()) {
            arrayList.add(new C0364a(str, ((Integer) this.f1428b.get(str)).intValue()));
        }
        return arrayList;
    }

    public final int describeContents() {
        jj jjVar = CREATOR;
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        jj jjVar = CREATOR;
        jj.m2485a(this, parcel);
    }
}
