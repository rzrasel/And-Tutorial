package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ga.C0366a;
import com.google.android.gms.plus.p010a.p011a.C0370a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ic extends ga implements SafeParcelable, C0370a {
    public static final lj CREATOR = new lj();
    private static final HashMap f1661a;
    private String f1662A;
    private String f1663B;
    private String f1664C;
    private String f1665D;
    private ic f1666E;
    private String f1667F;
    private String f1668G;
    private String f1669H;
    private String f1670I;
    private ic f1671J;
    private double f1672K;
    private ic f1673L;
    private double f1674M;
    private String f1675N;
    private ic f1676O;
    private List f1677P;
    private String f1678Q;
    private String f1679R;
    private String f1680S;
    private String f1681T;
    private ic f1682U;
    private String f1683V;
    private String f1684W;
    private String f1685X;
    private ic f1686Y;
    private String f1687Z;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ae;
    private final Set f1688b;
    private final int f1689c;
    private ic f1690d;
    private List f1691e;
    private ic f1692f;
    private String f1693g;
    private String f1694h;
    private String f1695i;
    private List f1696j;
    private int f1697k;
    private List f1698l;
    private ic f1699m;
    private List f1700n;
    private String f1701o;
    private String f1702p;
    private ic f1703q;
    private String f1704r;
    private String f1705s;
    private String f1706t;
    private List f1707u;
    private String f1708v;
    private String f1709w;
    private String f1710x;
    private String f1711y;
    private String f1712z;

    static {
        HashMap hashMap = new HashMap();
        f1661a = hashMap;
        hashMap.put("about", C0366a.m2041a("about", 2, ic.class));
        f1661a.put("additionalName", C0366a.m2038a("additionalName"));
        f1661a.put("address", C0366a.m2041a("address", 4, ic.class));
        f1661a.put("addressCountry", C0366a.m2046d("addressCountry", 5));
        f1661a.put("addressLocality", C0366a.m2046d("addressLocality", 6));
        f1661a.put("addressRegion", C0366a.m2046d("addressRegion", 7));
        f1661a.put("associated_media", C0366a.m2044b("associated_media", 8, ic.class));
        f1661a.put("attendeeCount", C0366a.m2039a("attendeeCount", 9));
        f1661a.put("attendees", C0366a.m2044b("attendees", 10, ic.class));
        f1661a.put("audio", C0366a.m2041a("audio", 11, ic.class));
        f1661a.put("author", C0366a.m2044b("author", 12, ic.class));
        f1661a.put("bestRating", C0366a.m2046d("bestRating", 13));
        f1661a.put("birthDate", C0366a.m2046d("birthDate", 14));
        f1661a.put("byArtist", C0366a.m2041a("byArtist", 15, ic.class));
        f1661a.put("caption", C0366a.m2046d("caption", 16));
        f1661a.put("contentSize", C0366a.m2046d("contentSize", 17));
        f1661a.put("contentUrl", C0366a.m2046d("contentUrl", 18));
        f1661a.put("contributor", C0366a.m2044b("contributor", 19, ic.class));
        f1661a.put("dateCreated", C0366a.m2046d("dateCreated", 20));
        f1661a.put("dateModified", C0366a.m2046d("dateModified", 21));
        f1661a.put("datePublished", C0366a.m2046d("datePublished", 22));
        f1661a.put("description", C0366a.m2046d("description", 23));
        f1661a.put("duration", C0366a.m2046d("duration", 24));
        f1661a.put("embedUrl", C0366a.m2046d("embedUrl", 25));
        f1661a.put("endDate", C0366a.m2046d("endDate", 26));
        f1661a.put("familyName", C0366a.m2046d("familyName", 27));
        f1661a.put("gender", C0366a.m2046d("gender", 28));
        f1661a.put("geo", C0366a.m2041a("geo", 29, ic.class));
        f1661a.put("givenName", C0366a.m2046d("givenName", 30));
        f1661a.put("height", C0366a.m2046d("height", 31));
        f1661a.put("id", C0366a.m2046d("id", 32));
        f1661a.put("image", C0366a.m2046d("image", 33));
        f1661a.put("inAlbum", C0366a.m2041a("inAlbum", 34, ic.class));
        f1661a.put("latitude", C0366a.m2043b("latitude", 36));
        f1661a.put("location", C0366a.m2041a("location", 37, ic.class));
        f1661a.put("longitude", C0366a.m2043b("longitude", 38));
        f1661a.put("name", C0366a.m2046d("name", 39));
        f1661a.put("partOfTVSeries", C0366a.m2041a("partOfTVSeries", 40, ic.class));
        f1661a.put("performers", C0366a.m2044b("performers", 41, ic.class));
        f1661a.put("playerType", C0366a.m2046d("playerType", 42));
        f1661a.put("postOfficeBoxNumber", C0366a.m2046d("postOfficeBoxNumber", 43));
        f1661a.put("postalCode", C0366a.m2046d("postalCode", 44));
        f1661a.put("ratingValue", C0366a.m2046d("ratingValue", 45));
        f1661a.put("reviewRating", C0366a.m2041a("reviewRating", 46, ic.class));
        f1661a.put("startDate", C0366a.m2046d("startDate", 47));
        f1661a.put("streetAddress", C0366a.m2046d("streetAddress", 48));
        f1661a.put("text", C0366a.m2046d("text", 49));
        f1661a.put("thumbnail", C0366a.m2041a("thumbnail", 50, ic.class));
        f1661a.put("thumbnailUrl", C0366a.m2046d("thumbnailUrl", 51));
        f1661a.put("tickerSymbol", C0366a.m2046d("tickerSymbol", 52));
        f1661a.put("type", C0366a.m2046d("type", 53));
        f1661a.put("url", C0366a.m2046d("url", 54));
        f1661a.put("width", C0366a.m2046d("width", 55));
        f1661a.put("worstRating", C0366a.m2046d("worstRating", 56));
    }

    public ic() {
        this.f1689c = 1;
        this.f1688b = new HashSet();
    }

    ic(Set set, int i, ic icVar, List list, ic icVar2, String str, String str2, String str3, List list2, int i2, List list3, ic icVar3, List list4, String str4, String str5, ic icVar4, String str6, String str7, String str8, List list5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ic icVar5, String str18, String str19, String str20, String str21, ic icVar6, double d, ic icVar7, double d2, String str22, ic icVar8, List list6, String str23, String str24, String str25, String str26, ic icVar9, String str27, String str28, String str29, ic icVar10, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.f1688b = set;
        this.f1689c = i;
        this.f1690d = icVar;
        this.f1691e = list;
        this.f1692f = icVar2;
        this.f1693g = str;
        this.f1694h = str2;
        this.f1695i = str3;
        this.f1696j = list2;
        this.f1697k = i2;
        this.f1698l = list3;
        this.f1699m = icVar3;
        this.f1700n = list4;
        this.f1701o = str4;
        this.f1702p = str5;
        this.f1703q = icVar4;
        this.f1704r = str6;
        this.f1705s = str7;
        this.f1706t = str8;
        this.f1707u = list5;
        this.f1708v = str9;
        this.f1709w = str10;
        this.f1710x = str11;
        this.f1711y = str12;
        this.f1712z = str13;
        this.f1662A = str14;
        this.f1663B = str15;
        this.f1664C = str16;
        this.f1665D = str17;
        this.f1666E = icVar5;
        this.f1667F = str18;
        this.f1668G = str19;
        this.f1669H = str20;
        this.f1670I = str21;
        this.f1671J = icVar6;
        this.f1672K = d;
        this.f1673L = icVar7;
        this.f1674M = d2;
        this.f1675N = str22;
        this.f1676O = icVar8;
        this.f1677P = list6;
        this.f1678Q = str23;
        this.f1679R = str24;
        this.f1680S = str25;
        this.f1681T = str26;
        this.f1682U = icVar9;
        this.f1683V = str27;
        this.f1684W = str28;
        this.f1685X = str29;
        this.f1686Y = icVar10;
        this.f1687Z = str30;
        this.aa = str31;
        this.ab = str32;
        this.ac = str33;
        this.ad = str34;
        this.ae = str35;
    }

    public final String m2188A() {
        return this.f1710x;
    }

    public final String m2189B() {
        return this.f1711y;
    }

    public final String m2190C() {
        return this.f1712z;
    }

    public final String m2191D() {
        return this.f1662A;
    }

    public final String m2192E() {
        return this.f1663B;
    }

    public final String m2193F() {
        return this.f1664C;
    }

    public final String m2194G() {
        return this.f1665D;
    }

    final ic m2195H() {
        return this.f1666E;
    }

    public final String m2196I() {
        return this.f1667F;
    }

    public final String m2197J() {
        return this.f1668G;
    }

    public final String m2198K() {
        return this.f1669H;
    }

    public final String m2199L() {
        return this.f1670I;
    }

    final ic m2200M() {
        return this.f1671J;
    }

    public final double m2201N() {
        return this.f1672K;
    }

    final ic m2202O() {
        return this.f1673L;
    }

    public final double m2203P() {
        return this.f1674M;
    }

    public final String m2204Q() {
        return this.f1675N;
    }

    final ic m2205R() {
        return this.f1676O;
    }

    final List m2206S() {
        return this.f1677P;
    }

    public final String m2207T() {
        return this.f1678Q;
    }

    public final String m2208U() {
        return this.f1679R;
    }

    public final String m2209V() {
        return this.f1680S;
    }

    public final String m2210W() {
        return this.f1681T;
    }

    final ic m2211X() {
        return this.f1682U;
    }

    public final String m2212Y() {
        return this.f1683V;
    }

    public final String m2213Z() {
        return this.f1684W;
    }

    public final /* synthetic */ Object mo701a() {
        return this;
    }

    protected final boolean mo899a(C0366a c0366a) {
        return this.f1688b.contains(Integer.valueOf(c0366a.m2055g()));
    }

    public final String aa() {
        return this.f1685X;
    }

    final ic ab() {
        return this.f1686Y;
    }

    public final String ac() {
        return this.f1687Z;
    }

    public final String ad() {
        return this.aa;
    }

    public final String ae() {
        return this.ab;
    }

    public final String af() {
        return this.ac;
    }

    public final String ag() {
        return this.ad;
    }

    public final String ah() {
        return this.ae;
    }

    protected final Object mo900b(C0366a c0366a) {
        switch (c0366a.m2055g()) {
            case 2:
                return this.f1690d;
            case 3:
                return this.f1691e;
            case 4:
                return this.f1692f;
            case 5:
                return this.f1693g;
            case 6:
                return this.f1694h;
            case 7:
                return this.f1695i;
            case 8:
                return this.f1696j;
            case 9:
                return Integer.valueOf(this.f1697k);
            case 10:
                return this.f1698l;
            case 11:
                return this.f1699m;
            case 12:
                return this.f1700n;
            case 13:
                return this.f1701o;
            case 14:
                return this.f1702p;
            case 15:
                return this.f1703q;
            case 16:
                return this.f1704r;
            case 17:
                return this.f1705s;
            case 18:
                return this.f1706t;
            case 19:
                return this.f1707u;
            case 20:
                return this.f1708v;
            case 21:
                return this.f1709w;
            case 22:
                return this.f1710x;
            case 23:
                return this.f1711y;
            case 24:
                return this.f1712z;
            case 25:
                return this.f1662A;
            case 26:
                return this.f1663B;
            case 27:
                return this.f1664C;
            case 28:
                return this.f1665D;
            case 29:
                return this.f1666E;
            case 30:
                return this.f1667F;
            case 31:
                return this.f1668G;
            case 32:
                return this.f1669H;
            case 33:
                return this.f1670I;
            case 34:
                return this.f1671J;
            case 36:
                return Double.valueOf(this.f1672K);
            case 37:
                return this.f1673L;
            case 38:
                return Double.valueOf(this.f1674M);
            case 39:
                return this.f1675N;
            case 40:
                return this.f1676O;
            case 41:
                return this.f1677P;
            case 42:
                return this.f1678Q;
            case 43:
                return this.f1679R;
            case 44:
                return this.f1680S;
            case 45:
                return this.f1681T;
            case 46:
                return this.f1682U;
            case 47:
                return this.f1683V;
            case 48:
                return this.f1684W;
            case 49:
                return this.f1685X;
            case 50:
                return this.f1686Y;
            case 51:
                return this.f1687Z;
            case 52:
                return this.aa;
            case 53:
                return this.ab;
            case 54:
                return this.ac;
            case 55:
                return this.ad;
            case 56:
                return this.ae;
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + c0366a.m2055g());
        }
    }

    public final HashMap mo890b() {
        return f1661a;
    }

    protected final Object mo891c() {
        return null;
    }

    protected final boolean mo892d() {
        return false;
    }

    public final int describeContents() {
        lj ljVar = CREATOR;
        return 0;
    }

    final Set m2220e() {
        return this.f1688b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ic)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ic icVar = (ic) obj;
        for (C0366a c0366a : f1661a.values()) {
            if (mo899a(c0366a)) {
                if (!icVar.mo899a(c0366a)) {
                    return false;
                }
                if (!mo900b(c0366a).equals(icVar.mo900b(c0366a))) {
                    return false;
                }
            } else if (icVar.mo899a(c0366a)) {
                return false;
            }
        }
        return true;
    }

    final int m2221f() {
        return this.f1689c;
    }

    final ic m2222g() {
        return this.f1690d;
    }

    public final List m2223h() {
        return this.f1691e;
    }

    public final int hashCode() {
        int i = 0;
        for (C0366a c0366a : f1661a.values()) {
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

    final ic m2224i() {
        return this.f1692f;
    }

    public final String m2225j() {
        return this.f1693g;
    }

    public final String m2226k() {
        return this.f1694h;
    }

    public final String m2227l() {
        return this.f1695i;
    }

    final List m2228m() {
        return this.f1696j;
    }

    public final int m2229n() {
        return this.f1697k;
    }

    final List m2230o() {
        return this.f1698l;
    }

    final ic m2231p() {
        return this.f1699m;
    }

    final List m2232q() {
        return this.f1700n;
    }

    public final String m2233r() {
        return this.f1701o;
    }

    public final String m2234s() {
        return this.f1702p;
    }

    final ic m2235t() {
        return this.f1703q;
    }

    public final String m2236u() {
        return this.f1704r;
    }

    public final String m2237v() {
        return this.f1705s;
    }

    public final String m2238w() {
        return this.f1706t;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        lj ljVar = CREATOR;
        lj.m2548a(this, parcel, i);
    }

    final List m2239x() {
        return this.f1707u;
    }

    public final String m2240y() {
        return this.f1708v;
    }

    public final String m2241z() {
        return this.f1709w;
    }
}
