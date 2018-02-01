package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class fc {

    public final class C0363a implements SafeParcelable {
        public static final jd CREATOR = new jd();
        private final int f1375a;
        private final String f1376b;
        private final List f1377c = new ArrayList();
        private final int f1378d;
        private final String f1379e;

        C0363a(int i, String str, List list, int i2, String str2) {
            this.f1375a = i;
            this.f1376b = str;
            this.f1377c.addAll(list);
            this.f1378d = i2;
            this.f1379e = str2;
        }

        public final String m1964a() {
            return this.f1376b;
        }

        public final int m1965b() {
            return this.f1378d;
        }

        public final String m1966c() {
            return this.f1379e;
        }

        public final List m1967d() {
            return new ArrayList(this.f1377c);
        }

        public final int describeContents() {
            return 0;
        }

        public final int m1968e() {
            return this.f1375a;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            jd.m2472a(this, parcel);
        }
    }
}
