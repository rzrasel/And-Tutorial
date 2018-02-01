package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ga.C0366a;
import com.google.android.gms.plus.p010a.p012b.C0373b;
import com.google.android.gms.plus.p010a.p012b.C0375d;
import com.google.android.gms.plus.p010a.p012b.C0377e;
import com.google.android.gms.plus.p010a.p012b.C0379c;
import com.google.android.gms.plus.p010a.p012b.C0381f;
import com.google.android.gms.plus.p010a.p012b.C0383g;
import com.google.android.gms.plus.p010a.p012b.C0385h;
import com.google.android.gms.plus.p010a.p012b.C0387i;
import com.google.android.gms.plus.p010a.p012b.C0389j;
import com.google.android.gms.plus.p010a.p012b.C0391a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ih extends ga implements SafeParcelable, C0391a {
    public static final ll CREATOR = new ll();
    private static final HashMap f1783a;
    private boolean f1784A;
    private final Set f1785b;
    private final int f1786c;
    private String f1787d;
    private C0374a f1788e;
    private String f1789f;
    private String f1790g;
    private int f1791h;
    private C0380b f1792i;
    private String f1793j;
    private String f1794k;
    private int f1795l;
    private String f1796m;
    private C0382c f1797n;
    private boolean f1798o;
    private String f1799p;
    private C0384d f1800q;
    private String f1801r;
    private int f1802s;
    private List f1803t;
    private List f1804u;
    private int f1805v;
    private int f1806w;
    private String f1807x;
    private String f1808y;
    private List f1809z;

    public final class C0374a extends ga implements SafeParcelable, C0373b {
        public static final lm CREATOR = new lm();
        private static final HashMap f1724a;
        private final Set f1725b;
        private final int f1726c;
        private int f1727d;
        private int f1728e;

        static {
            HashMap hashMap = new HashMap();
            f1724a = hashMap;
            hashMap.put("max", C0366a.m2039a("max", 2));
            f1724a.put("min", C0366a.m2039a("min", 3));
        }

        public C0374a() {
            this.f1726c = 1;
            this.f1725b = new HashSet();
        }

        C0374a(Set set, int i, int i2, int i3) {
            this.f1725b = set;
            this.f1726c = i;
            this.f1727d = i2;
            this.f1728e = i3;
        }

        public final /* synthetic */ Object mo701a() {
            return this;
        }

        protected final boolean mo899a(C0366a c0366a) {
            return this.f1725b.contains(Integer.valueOf(c0366a.m2055g()));
        }

        protected final Object mo900b(C0366a c0366a) {
            switch (c0366a.m2055g()) {
                case 2:
                    return Integer.valueOf(this.f1727d);
                case 3:
                    return Integer.valueOf(this.f1728e);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0366a.m2055g());
            }
        }

        public final HashMap mo890b() {
            return f1724a;
        }

        protected final Object mo891c() {
            return null;
        }

        protected final boolean mo892d() {
            return false;
        }

        public final int describeContents() {
            lm lmVar = CREATOR;
            return 0;
        }

        final Set m2265e() {
            return this.f1725b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0374a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0374a c0374a = (C0374a) obj;
            for (C0366a c0366a : f1724a.values()) {
                if (mo899a(c0366a)) {
                    if (!c0374a.mo899a(c0366a)) {
                        return false;
                    }
                    if (!mo900b(c0366a).equals(c0374a.mo900b(c0366a))) {
                        return false;
                    }
                } else if (c0374a.mo899a(c0366a)) {
                    return false;
                }
            }
            return true;
        }

        final int m2266f() {
            return this.f1726c;
        }

        public final int m2267g() {
            return this.f1727d;
        }

        public final int m2268h() {
            return this.f1728e;
        }

        public final int hashCode() {
            int i = 0;
            for (C0366a c0366a : f1724a.values()) {
                int hashCode;
                if (mo899a(c0366a)) {
                    hashCode = mo900b(c0366a).hashCode() + (i + c0366a.m2055g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            lm lmVar = CREATOR;
            lm.m2551a(this, parcel);
        }
    }

    public final class C0380b extends ga implements SafeParcelable, C0379c {
        public static final ln CREATOR = new ln();
        private static final HashMap f1740a;
        private final Set f1741b;
        private final int f1742c;
        private C0376a f1743d;
        private C0378b f1744e;
        private int f1745f;

        public final class C0376a extends ga implements SafeParcelable, C0375d {
            public static final lo CREATOR = new lo();
            private static final HashMap f1729a;
            private final Set f1730b;
            private final int f1731c;
            private int f1732d;
            private int f1733e;

            static {
                HashMap hashMap = new HashMap();
                f1729a = hashMap;
                hashMap.put("leftImageOffset", C0366a.m2039a("leftImageOffset", 2));
                f1729a.put("topImageOffset", C0366a.m2039a("topImageOffset", 3));
            }

            public C0376a() {
                this.f1731c = 1;
                this.f1730b = new HashSet();
            }

            C0376a(Set set, int i, int i2, int i3) {
                this.f1730b = set;
                this.f1731c = i;
                this.f1732d = i2;
                this.f1733e = i3;
            }

            public final /* synthetic */ Object mo701a() {
                return this;
            }

            protected final boolean mo899a(C0366a c0366a) {
                return this.f1730b.contains(Integer.valueOf(c0366a.m2055g()));
            }

            protected final Object mo900b(C0366a c0366a) {
                switch (c0366a.m2055g()) {
                    case 2:
                        return Integer.valueOf(this.f1732d);
                    case 3:
                        return Integer.valueOf(this.f1733e);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + c0366a.m2055g());
                }
            }

            public final HashMap mo890b() {
                return f1729a;
            }

            protected final Object mo891c() {
                return null;
            }

            protected final boolean mo892d() {
                return false;
            }

            public final int describeContents() {
                lo loVar = CREATOR;
                return 0;
            }

            final Set m2275e() {
                return this.f1730b;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C0376a)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C0376a c0376a = (C0376a) obj;
                for (C0366a c0366a : f1729a.values()) {
                    if (mo899a(c0366a)) {
                        if (!c0376a.mo899a(c0366a)) {
                            return false;
                        }
                        if (!mo900b(c0366a).equals(c0376a.mo900b(c0366a))) {
                            return false;
                        }
                    } else if (c0376a.mo899a(c0366a)) {
                        return false;
                    }
                }
                return true;
            }

            final int m2276f() {
                return this.f1731c;
            }

            public final int m2277g() {
                return this.f1732d;
            }

            public final int m2278h() {
                return this.f1733e;
            }

            public final int hashCode() {
                int i = 0;
                for (C0366a c0366a : f1729a.values()) {
                    int hashCode;
                    if (mo899a(c0366a)) {
                        hashCode = mo900b(c0366a).hashCode() + (i + c0366a.m2055g());
                    } else {
                        hashCode = i;
                    }
                    i = hashCode;
                }
                return i;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                lo loVar = CREATOR;
                lo.m2553a(this, parcel);
            }
        }

        public final class C0378b extends ga implements SafeParcelable, C0377e {
            public static final lp CREATOR = new lp();
            private static final HashMap f1734a;
            private final Set f1735b;
            private final int f1736c;
            private int f1737d;
            private String f1738e;
            private int f1739f;

            static {
                HashMap hashMap = new HashMap();
                f1734a = hashMap;
                hashMap.put("height", C0366a.m2039a("height", 2));
                f1734a.put("url", C0366a.m2046d("url", 3));
                f1734a.put("width", C0366a.m2039a("width", 4));
            }

            public C0378b() {
                this.f1736c = 1;
                this.f1735b = new HashSet();
            }

            C0378b(Set set, int i, int i2, String str, int i3) {
                this.f1735b = set;
                this.f1736c = i;
                this.f1737d = i2;
                this.f1738e = str;
                this.f1739f = i3;
            }

            public final /* synthetic */ Object mo701a() {
                return this;
            }

            protected final boolean mo899a(C0366a c0366a) {
                return this.f1735b.contains(Integer.valueOf(c0366a.m2055g()));
            }

            protected final Object mo900b(C0366a c0366a) {
                switch (c0366a.m2055g()) {
                    case 2:
                        return Integer.valueOf(this.f1737d);
                    case 3:
                        return this.f1738e;
                    case 4:
                        return Integer.valueOf(this.f1739f);
                    default:
                        throw new IllegalStateException("Unknown safe parcelable id=" + c0366a.m2055g());
                }
            }

            public final HashMap mo890b() {
                return f1734a;
            }

            protected final Object mo891c() {
                return null;
            }

            protected final boolean mo892d() {
                return false;
            }

            public final int describeContents() {
                lp lpVar = CREATOR;
                return 0;
            }

            final Set m2285e() {
                return this.f1735b;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C0378b)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                C0378b c0378b = (C0378b) obj;
                for (C0366a c0366a : f1734a.values()) {
                    if (mo899a(c0366a)) {
                        if (!c0378b.mo899a(c0366a)) {
                            return false;
                        }
                        if (!mo900b(c0366a).equals(c0378b.mo900b(c0366a))) {
                            return false;
                        }
                    } else if (c0378b.mo899a(c0366a)) {
                        return false;
                    }
                }
                return true;
            }

            final int m2286f() {
                return this.f1736c;
            }

            public final int m2287g() {
                return this.f1737d;
            }

            public final String m2288h() {
                return this.f1738e;
            }

            public final int hashCode() {
                int i = 0;
                for (C0366a c0366a : f1734a.values()) {
                    int hashCode;
                    if (mo899a(c0366a)) {
                        hashCode = mo900b(c0366a).hashCode() + (i + c0366a.m2055g());
                    } else {
                        hashCode = i;
                    }
                    i = hashCode;
                }
                return i;
            }

            public final int m2289i() {
                return this.f1739f;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                lp lpVar = CREATOR;
                lp.m2554a(this, parcel);
            }
        }

        static {
            HashMap hashMap = new HashMap();
            f1740a = hashMap;
            hashMap.put("coverInfo", C0366a.m2041a("coverInfo", 2, C0376a.class));
            f1740a.put("coverPhoto", C0366a.m2041a("coverPhoto", 3, C0378b.class));
            f1740a.put("layout", C0366a.m2040a("layout", 4, new fx().m2024a("banner", 0)));
        }

        public C0380b() {
            this.f1742c = 1;
            this.f1741b = new HashSet();
        }

        C0380b(Set set, int i, C0376a c0376a, C0378b c0378b, int i2) {
            this.f1741b = set;
            this.f1742c = i;
            this.f1743d = c0376a;
            this.f1744e = c0378b;
            this.f1745f = i2;
        }

        public final /* synthetic */ Object mo701a() {
            return this;
        }

        protected final boolean mo899a(C0366a c0366a) {
            return this.f1741b.contains(Integer.valueOf(c0366a.m2055g()));
        }

        protected final Object mo900b(C0366a c0366a) {
            switch (c0366a.m2055g()) {
                case 2:
                    return this.f1743d;
                case 3:
                    return this.f1744e;
                case 4:
                    return Integer.valueOf(this.f1745f);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0366a.m2055g());
            }
        }

        public final HashMap mo890b() {
            return f1740a;
        }

        protected final Object mo891c() {
            return null;
        }

        protected final boolean mo892d() {
            return false;
        }

        public final int describeContents() {
            ln lnVar = CREATOR;
            return 0;
        }

        final Set m2296e() {
            return this.f1741b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0380b)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0380b c0380b = (C0380b) obj;
            for (C0366a c0366a : f1740a.values()) {
                if (mo899a(c0366a)) {
                    if (!c0380b.mo899a(c0366a)) {
                        return false;
                    }
                    if (!mo900b(c0366a).equals(c0380b.mo900b(c0366a))) {
                        return false;
                    }
                } else if (c0380b.mo899a(c0366a)) {
                    return false;
                }
            }
            return true;
        }

        final int m2297f() {
            return this.f1742c;
        }

        final C0376a m2298g() {
            return this.f1743d;
        }

        final C0378b m2299h() {
            return this.f1744e;
        }

        public final int hashCode() {
            int i = 0;
            for (C0366a c0366a : f1740a.values()) {
                int hashCode;
                if (mo899a(c0366a)) {
                    hashCode = mo900b(c0366a).hashCode() + (i + c0366a.m2055g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public final int m2300i() {
            return this.f1745f;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            ln lnVar = CREATOR;
            ln.m2552a(this, parcel, i);
        }
    }

    public final class C0382c extends ga implements SafeParcelable, C0381f {
        public static final lq CREATOR = new lq();
        private static final HashMap f1746a;
        private final Set f1747b;
        private final int f1748c;
        private String f1749d;

        static {
            HashMap hashMap = new HashMap();
            f1746a = hashMap;
            hashMap.put("url", C0366a.m2046d("url", 2));
        }

        public C0382c() {
            this.f1748c = 1;
            this.f1747b = new HashSet();
        }

        C0382c(Set set, int i, String str) {
            this.f1747b = set;
            this.f1748c = i;
            this.f1749d = str;
        }

        public final /* synthetic */ Object mo701a() {
            return this;
        }

        protected final boolean mo899a(C0366a c0366a) {
            return this.f1747b.contains(Integer.valueOf(c0366a.m2055g()));
        }

        protected final Object mo900b(C0366a c0366a) {
            switch (c0366a.m2055g()) {
                case 2:
                    return this.f1749d;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0366a.m2055g());
            }
        }

        public final HashMap mo890b() {
            return f1746a;
        }

        protected final Object mo891c() {
            return null;
        }

        protected final boolean mo892d() {
            return false;
        }

        public final int describeContents() {
            lq lqVar = CREATOR;
            return 0;
        }

        final Set m2307e() {
            return this.f1747b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0382c)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0382c c0382c = (C0382c) obj;
            for (C0366a c0366a : f1746a.values()) {
                if (mo899a(c0366a)) {
                    if (!c0382c.mo899a(c0366a)) {
                        return false;
                    }
                    if (!mo900b(c0366a).equals(c0382c.mo900b(c0366a))) {
                        return false;
                    }
                } else if (c0382c.mo899a(c0366a)) {
                    return false;
                }
            }
            return true;
        }

        final int m2308f() {
            return this.f1748c;
        }

        public final String m2309g() {
            return this.f1749d;
        }

        public final int hashCode() {
            int i = 0;
            for (C0366a c0366a : f1746a.values()) {
                int hashCode;
                if (mo899a(c0366a)) {
                    hashCode = mo900b(c0366a).hashCode() + (i + c0366a.m2055g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            lq lqVar = CREATOR;
            lq.m2555a(this, parcel);
        }
    }

    public final class C0384d extends ga implements SafeParcelable, C0383g {
        public static final lr CREATOR = new lr();
        private static final HashMap f1750a;
        private final Set f1751b;
        private final int f1752c;
        private String f1753d;
        private String f1754e;
        private String f1755f;
        private String f1756g;
        private String f1757h;
        private String f1758i;

        static {
            HashMap hashMap = new HashMap();
            f1750a = hashMap;
            hashMap.put("familyName", C0366a.m2046d("familyName", 2));
            f1750a.put("formatted", C0366a.m2046d("formatted", 3));
            f1750a.put("givenName", C0366a.m2046d("givenName", 4));
            f1750a.put("honorificPrefix", C0366a.m2046d("honorificPrefix", 5));
            f1750a.put("honorificSuffix", C0366a.m2046d("honorificSuffix", 6));
            f1750a.put("middleName", C0366a.m2046d("middleName", 7));
        }

        public C0384d() {
            this.f1752c = 1;
            this.f1751b = new HashSet();
        }

        C0384d(Set set, int i, String str, String str2, String str3, String str4, String str5, String str6) {
            this.f1751b = set;
            this.f1752c = i;
            this.f1753d = str;
            this.f1754e = str2;
            this.f1755f = str3;
            this.f1756g = str4;
            this.f1757h = str5;
            this.f1758i = str6;
        }

        public final /* synthetic */ Object mo701a() {
            return this;
        }

        protected final boolean mo899a(C0366a c0366a) {
            return this.f1751b.contains(Integer.valueOf(c0366a.m2055g()));
        }

        protected final Object mo900b(C0366a c0366a) {
            switch (c0366a.m2055g()) {
                case 2:
                    return this.f1753d;
                case 3:
                    return this.f1754e;
                case 4:
                    return this.f1755f;
                case 5:
                    return this.f1756g;
                case 6:
                    return this.f1757h;
                case 7:
                    return this.f1758i;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0366a.m2055g());
            }
        }

        public final HashMap mo890b() {
            return f1750a;
        }

        protected final Object mo891c() {
            return null;
        }

        protected final boolean mo892d() {
            return false;
        }

        public final int describeContents() {
            lr lrVar = CREATOR;
            return 0;
        }

        final Set m2316e() {
            return this.f1751b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0384d)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0384d c0384d = (C0384d) obj;
            for (C0366a c0366a : f1750a.values()) {
                if (mo899a(c0366a)) {
                    if (!c0384d.mo899a(c0366a)) {
                        return false;
                    }
                    if (!mo900b(c0366a).equals(c0384d.mo900b(c0366a))) {
                        return false;
                    }
                } else if (c0384d.mo899a(c0366a)) {
                    return false;
                }
            }
            return true;
        }

        final int m2317f() {
            return this.f1752c;
        }

        public final String m2318g() {
            return this.f1753d;
        }

        public final String m2319h() {
            return this.f1754e;
        }

        public final int hashCode() {
            int i = 0;
            for (C0366a c0366a : f1750a.values()) {
                int hashCode;
                if (mo899a(c0366a)) {
                    hashCode = mo900b(c0366a).hashCode() + (i + c0366a.m2055g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public final String m2320i() {
            return this.f1755f;
        }

        public final String m2321j() {
            return this.f1756g;
        }

        public final String m2322k() {
            return this.f1757h;
        }

        public final String m2323l() {
            return this.f1758i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            lr lrVar = CREATOR;
            lr.m2556a(this, parcel);
        }
    }

    public final class C0386f extends ga implements SafeParcelable, C0385h {
        public static final ls CREATOR = new ls();
        private static final HashMap f1759a;
        private final Set f1760b;
        private final int f1761c;
        private String f1762d;
        private String f1763e;
        private String f1764f;
        private String f1765g;
        private String f1766h;
        private boolean f1767i;
        private String f1768j;
        private String f1769k;
        private int f1770l;

        static {
            HashMap hashMap = new HashMap();
            f1759a = hashMap;
            hashMap.put("department", C0366a.m2046d("department", 2));
            f1759a.put("description", C0366a.m2046d("description", 3));
            f1759a.put("endDate", C0366a.m2046d("endDate", 4));
            f1759a.put("location", C0366a.m2046d("location", 5));
            f1759a.put("name", C0366a.m2046d("name", 6));
            f1759a.put("primary", C0366a.m2045c("primary", 7));
            f1759a.put("startDate", C0366a.m2046d("startDate", 8));
            f1759a.put("title", C0366a.m2046d("title", 9));
            f1759a.put("type", C0366a.m2040a("type", 10, new fx().m2024a("work", 0).m2024a("school", 1)));
        }

        public C0386f() {
            this.f1761c = 1;
            this.f1760b = new HashSet();
        }

        C0386f(Set set, int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i2) {
            this.f1760b = set;
            this.f1761c = i;
            this.f1762d = str;
            this.f1763e = str2;
            this.f1764f = str3;
            this.f1765g = str4;
            this.f1766h = str5;
            this.f1767i = z;
            this.f1768j = str6;
            this.f1769k = str7;
            this.f1770l = i2;
        }

        public final /* synthetic */ Object mo701a() {
            return this;
        }

        protected final boolean mo899a(C0366a c0366a) {
            return this.f1760b.contains(Integer.valueOf(c0366a.m2055g()));
        }

        protected final Object mo900b(C0366a c0366a) {
            switch (c0366a.m2055g()) {
                case 2:
                    return this.f1762d;
                case 3:
                    return this.f1763e;
                case 4:
                    return this.f1764f;
                case 5:
                    return this.f1765g;
                case 6:
                    return this.f1766h;
                case 7:
                    return Boolean.valueOf(this.f1767i);
                case 8:
                    return this.f1768j;
                case 9:
                    return this.f1769k;
                case 10:
                    return Integer.valueOf(this.f1770l);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0366a.m2055g());
            }
        }

        public final HashMap mo890b() {
            return f1759a;
        }

        protected final Object mo891c() {
            return null;
        }

        protected final boolean mo892d() {
            return false;
        }

        public final int describeContents() {
            ls lsVar = CREATOR;
            return 0;
        }

        final Set m2330e() {
            return this.f1760b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0386f)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0386f c0386f = (C0386f) obj;
            for (C0366a c0366a : f1759a.values()) {
                if (mo899a(c0366a)) {
                    if (!c0386f.mo899a(c0366a)) {
                        return false;
                    }
                    if (!mo900b(c0366a).equals(c0386f.mo900b(c0366a))) {
                        return false;
                    }
                } else if (c0386f.mo899a(c0366a)) {
                    return false;
                }
            }
            return true;
        }

        final int m2331f() {
            return this.f1761c;
        }

        public final String m2332g() {
            return this.f1762d;
        }

        public final String m2333h() {
            return this.f1763e;
        }

        public final int hashCode() {
            int i = 0;
            for (C0366a c0366a : f1759a.values()) {
                int hashCode;
                if (mo899a(c0366a)) {
                    hashCode = mo900b(c0366a).hashCode() + (i + c0366a.m2055g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public final String m2334i() {
            return this.f1764f;
        }

        public final String m2335j() {
            return this.f1765g;
        }

        public final String m2336k() {
            return this.f1766h;
        }

        public final boolean m2337l() {
            return this.f1767i;
        }

        public final String m2338m() {
            return this.f1768j;
        }

        public final String m2339n() {
            return this.f1769k;
        }

        public final int m2340o() {
            return this.f1770l;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            ls lsVar = CREATOR;
            ls.m2557a(this, parcel);
        }
    }

    public final class C0388g extends ga implements SafeParcelable, C0387i {
        public static final lt CREATOR = new lt();
        private static final HashMap f1771a;
        private final Set f1772b;
        private final int f1773c;
        private boolean f1774d;
        private String f1775e;

        static {
            HashMap hashMap = new HashMap();
            f1771a = hashMap;
            hashMap.put("primary", C0366a.m2045c("primary", 2));
            f1771a.put("value", C0366a.m2046d("value", 3));
        }

        public C0388g() {
            this.f1773c = 1;
            this.f1772b = new HashSet();
        }

        C0388g(Set set, int i, boolean z, String str) {
            this.f1772b = set;
            this.f1773c = i;
            this.f1774d = z;
            this.f1775e = str;
        }

        public final /* synthetic */ Object mo701a() {
            return this;
        }

        protected final boolean mo899a(C0366a c0366a) {
            return this.f1772b.contains(Integer.valueOf(c0366a.m2055g()));
        }

        protected final Object mo900b(C0366a c0366a) {
            switch (c0366a.m2055g()) {
                case 2:
                    return Boolean.valueOf(this.f1774d);
                case 3:
                    return this.f1775e;
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0366a.m2055g());
            }
        }

        public final HashMap mo890b() {
            return f1771a;
        }

        protected final Object mo891c() {
            return null;
        }

        protected final boolean mo892d() {
            return false;
        }

        public final int describeContents() {
            lt ltVar = CREATOR;
            return 0;
        }

        final Set m2347e() {
            return this.f1772b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0388g)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0388g c0388g = (C0388g) obj;
            for (C0366a c0366a : f1771a.values()) {
                if (mo899a(c0366a)) {
                    if (!c0388g.mo899a(c0366a)) {
                        return false;
                    }
                    if (!mo900b(c0366a).equals(c0388g.mo900b(c0366a))) {
                        return false;
                    }
                } else if (c0388g.mo899a(c0366a)) {
                    return false;
                }
            }
            return true;
        }

        final int m2348f() {
            return this.f1773c;
        }

        public final boolean m2349g() {
            return this.f1774d;
        }

        public final String m2350h() {
            return this.f1775e;
        }

        public final int hashCode() {
            int i = 0;
            for (C0366a c0366a : f1771a.values()) {
                int hashCode;
                if (mo899a(c0366a)) {
                    hashCode = mo900b(c0366a).hashCode() + (i + c0366a.m2055g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            lt ltVar = CREATOR;
            lt.m2558a(this, parcel);
        }
    }

    public final class C0390h extends ga implements SafeParcelable, C0389j {
        public static final lu CREATOR = new lu();
        private static final HashMap f1776a;
        private final Set f1777b;
        private final int f1778c;
        private String f1779d;
        private final int f1780e;
        private int f1781f;
        private String f1782g;

        static {
            HashMap hashMap = new HashMap();
            f1776a = hashMap;
            hashMap.put("label", C0366a.m2046d("label", 5));
            f1776a.put("type", C0366a.m2040a("type", 6, new fx().m2024a("home", 0).m2024a("work", 1).m2024a("blog", 2).m2024a("profile", 3).m2024a("other", 4).m2024a("otherProfile", 5).m2024a("contributor", 6).m2024a("website", 7)));
            f1776a.put("value", C0366a.m2046d("value", 4));
        }

        public C0390h() {
            this.f1780e = 4;
            this.f1778c = 2;
            this.f1777b = new HashSet();
        }

        C0390h(Set set, int i, String str, int i2, String str2) {
            this.f1780e = 4;
            this.f1777b = set;
            this.f1778c = i;
            this.f1779d = str;
            this.f1781f = i2;
            this.f1782g = str2;
        }

        @Deprecated
        public static int m2351h() {
            return 4;
        }

        public final /* synthetic */ Object mo701a() {
            return this;
        }

        protected final boolean mo899a(C0366a c0366a) {
            return this.f1777b.contains(Integer.valueOf(c0366a.m2055g()));
        }

        protected final Object mo900b(C0366a c0366a) {
            switch (c0366a.m2055g()) {
                case 4:
                    return this.f1782g;
                case 5:
                    return this.f1779d;
                case 6:
                    return Integer.valueOf(this.f1781f);
                default:
                    throw new IllegalStateException("Unknown safe parcelable id=" + c0366a.m2055g());
            }
        }

        public final HashMap mo890b() {
            return f1776a;
        }

        protected final Object mo891c() {
            return null;
        }

        protected final boolean mo892d() {
            return false;
        }

        public final int describeContents() {
            lu luVar = CREATOR;
            return 0;
        }

        final Set m2358e() {
            return this.f1777b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0390h)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            C0390h c0390h = (C0390h) obj;
            for (C0366a c0366a : f1776a.values()) {
                if (mo899a(c0366a)) {
                    if (!c0390h.mo899a(c0366a)) {
                        return false;
                    }
                    if (!mo900b(c0366a).equals(c0390h.mo900b(c0366a))) {
                        return false;
                    }
                } else if (c0390h.mo899a(c0366a)) {
                    return false;
                }
            }
            return true;
        }

        final int m2359f() {
            return this.f1778c;
        }

        public final String m2360g() {
            return this.f1779d;
        }

        public final int hashCode() {
            int i = 0;
            for (C0366a c0366a : f1776a.values()) {
                int hashCode;
                if (mo899a(c0366a)) {
                    hashCode = mo900b(c0366a).hashCode() + (i + c0366a.m2055g());
                } else {
                    hashCode = i;
                }
                i = hashCode;
            }
            return i;
        }

        public final int m2361i() {
            return this.f1781f;
        }

        public final String m2362j() {
            return this.f1782g;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            lu luVar = CREATOR;
            lu.m2559a(this, parcel);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f1783a = hashMap;
        hashMap.put("aboutMe", C0366a.m2046d("aboutMe", 2));
        f1783a.put("ageRange", C0366a.m2041a("ageRange", 3, C0374a.class));
        f1783a.put("birthday", C0366a.m2046d("birthday", 4));
        f1783a.put("braggingRights", C0366a.m2046d("braggingRights", 5));
        f1783a.put("circledByCount", C0366a.m2039a("circledByCount", 6));
        f1783a.put("cover", C0366a.m2041a("cover", 7, C0380b.class));
        f1783a.put("currentLocation", C0366a.m2046d("currentLocation", 8));
        f1783a.put("displayName", C0366a.m2046d("displayName", 9));
        f1783a.put("gender", C0366a.m2040a("gender", 12, new fx().m2024a("male", 0).m2024a("female", 1).m2024a("other", 2)));
        f1783a.put("id", C0366a.m2046d("id", 14));
        f1783a.put("image", C0366a.m2041a("image", 15, C0382c.class));
        f1783a.put("isPlusUser", C0366a.m2045c("isPlusUser", 16));
        f1783a.put("language", C0366a.m2046d("language", 18));
        f1783a.put("name", C0366a.m2041a("name", 19, C0384d.class));
        f1783a.put("nickname", C0366a.m2046d("nickname", 20));
        f1783a.put("objectType", C0366a.m2040a("objectType", 21, new fx().m2024a("person", 0).m2024a("page", 1)));
        f1783a.put("organizations", C0366a.m2044b("organizations", 22, C0386f.class));
        f1783a.put("placesLived", C0366a.m2044b("placesLived", 23, C0388g.class));
        f1783a.put("plusOneCount", C0366a.m2039a("plusOneCount", 24));
        f1783a.put("relationshipStatus", C0366a.m2040a("relationshipStatus", 25, new fx().m2024a("single", 0).m2024a("in_a_relationship", 1).m2024a("engaged", 2).m2024a("married", 3).m2024a("its_complicated", 4).m2024a("open_relationship", 5).m2024a("widowed", 6).m2024a("in_domestic_partnership", 7).m2024a("in_civil_union", 8)));
        f1783a.put("tagline", C0366a.m2046d("tagline", 26));
        f1783a.put("url", C0366a.m2046d("url", 27));
        f1783a.put("urls", C0366a.m2044b("urls", 28, C0390h.class));
        f1783a.put("verified", C0366a.m2045c("verified", 29));
    }

    public ih() {
        this.f1786c = 2;
        this.f1785b = new HashSet();
    }

    ih(Set set, int i, String str, C0374a c0374a, String str2, String str3, int i2, C0380b c0380b, String str4, String str5, int i3, String str6, C0382c c0382c, boolean z, String str7, C0384d c0384d, String str8, int i4, List list, List list2, int i5, int i6, String str9, String str10, List list3, boolean z2) {
        this.f1785b = set;
        this.f1786c = i;
        this.f1787d = str;
        this.f1788e = c0374a;
        this.f1789f = str2;
        this.f1790g = str3;
        this.f1791h = i2;
        this.f1792i = c0380b;
        this.f1793j = str4;
        this.f1794k = str5;
        this.f1795l = i3;
        this.f1796m = str6;
        this.f1797n = c0382c;
        this.f1798o = z;
        this.f1799p = str7;
        this.f1800q = c0384d;
        this.f1801r = str8;
        this.f1802s = i4;
        this.f1803t = list;
        this.f1804u = list2;
        this.f1805v = i5;
        this.f1806w = i6;
        this.f1807x = str9;
        this.f1808y = str10;
        this.f1809z = list3;
        this.f1784A = z2;
    }

    public final String m2363A() {
        return this.f1807x;
    }

    public final String m2364B() {
        return this.f1808y;
    }

    final List m2365C() {
        return this.f1809z;
    }

    public final boolean m2366D() {
        return this.f1784A;
    }

    public final /* synthetic */ Object mo701a() {
        return this;
    }

    protected final boolean mo899a(C0366a c0366a) {
        return this.f1785b.contains(Integer.valueOf(c0366a.m2055g()));
    }

    protected final Object mo900b(C0366a c0366a) {
        switch (c0366a.m2055g()) {
            case 2:
                return this.f1787d;
            case 3:
                return this.f1788e;
            case 4:
                return this.f1789f;
            case 5:
                return this.f1790g;
            case 6:
                return Integer.valueOf(this.f1791h);
            case 7:
                return this.f1792i;
            case 8:
                return this.f1793j;
            case 9:
                return this.f1794k;
            case 12:
                return Integer.valueOf(this.f1795l);
            case 14:
                return this.f1796m;
            case 15:
                return this.f1797n;
            case 16:
                return Boolean.valueOf(this.f1798o);
            case 18:
                return this.f1799p;
            case 19:
                return this.f1800q;
            case 20:
                return this.f1801r;
            case 21:
                return Integer.valueOf(this.f1802s);
            case 22:
                return this.f1803t;
            case 23:
                return this.f1804u;
            case 24:
                return Integer.valueOf(this.f1805v);
            case 25:
                return Integer.valueOf(this.f1806w);
            case 26:
                return this.f1807x;
            case 27:
                return this.f1808y;
            case 28:
                return this.f1809z;
            case 29:
                return Boolean.valueOf(this.f1784A);
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + c0366a.m2055g());
        }
    }

    public final HashMap mo890b() {
        return f1783a;
    }

    protected final Object mo891c() {
        return null;
    }

    protected final boolean mo892d() {
        return false;
    }

    public final int describeContents() {
        ll llVar = CREATOR;
        return 0;
    }

    final Set m2373e() {
        return this.f1785b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ih)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ih ihVar = (ih) obj;
        for (C0366a c0366a : f1783a.values()) {
            if (mo899a(c0366a)) {
                if (!ihVar.mo899a(c0366a)) {
                    return false;
                }
                if (!mo900b(c0366a).equals(ihVar.mo900b(c0366a))) {
                    return false;
                }
            } else if (ihVar.mo899a(c0366a)) {
                return false;
            }
        }
        return true;
    }

    final int m2374f() {
        return this.f1786c;
    }

    public final String m2375g() {
        return this.f1787d;
    }

    final C0374a m2376h() {
        return this.f1788e;
    }

    public final int hashCode() {
        int i = 0;
        for (C0366a c0366a : f1783a.values()) {
            int hashCode;
            if (mo899a(c0366a)) {
                hashCode = mo900b(c0366a).hashCode() + (i + c0366a.m2055g());
            } else {
                hashCode = i;
            }
            i = hashCode;
        }
        return i;
    }

    public final String m2377i() {
        return this.f1789f;
    }

    public final String m2378j() {
        return this.f1790g;
    }

    public final int m2379k() {
        return this.f1791h;
    }

    final C0380b m2380l() {
        return this.f1792i;
    }

    public final String m2381m() {
        return this.f1793j;
    }

    public final String m2382n() {
        return this.f1794k;
    }

    public final int m2383o() {
        return this.f1795l;
    }

    public final String m2384p() {
        return this.f1796m;
    }

    final C0382c m2385q() {
        return this.f1797n;
    }

    public final boolean m2386r() {
        return this.f1798o;
    }

    public final String m2387s() {
        return this.f1799p;
    }

    final C0384d m2388t() {
        return this.f1800q;
    }

    public final String m2389u() {
        return this.f1801r;
    }

    public final int m2390v() {
        return this.f1802s;
    }

    final List m2391w() {
        return this.f1803t;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ll llVar = CREATOR;
        ll.m2550a(this, parcel, i);
    }

    final List m2392x() {
        return this.f1804u;
    }

    public final int m2393y() {
        return this.f1805v;
    }

    public final int m2394z() {
        return this.f1806w;
    }
}
