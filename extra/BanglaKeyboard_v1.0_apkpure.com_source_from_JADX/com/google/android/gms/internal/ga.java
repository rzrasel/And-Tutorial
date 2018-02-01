package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class ga {

    public class C0366a implements SafeParcelable {
        public static final jr CREATOR = new jr();
        protected final int f1436a;
        protected final boolean f1437b;
        protected final int f1438c;
        protected final boolean f1439d;
        protected final String f1440e;
        protected final int f1441f;
        protected final Class f1442g;
        protected final String f1443h;
        private final int f1444i;
        private gd f1445j;
        private jq f1446k;

        C0366a(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, fv fvVar) {
            this.f1444i = i;
            this.f1436a = i2;
            this.f1437b = z;
            this.f1438c = i3;
            this.f1439d = z2;
            this.f1440e = str;
            this.f1441f = i4;
            if (str2 == null) {
                this.f1442g = null;
                this.f1443h = null;
            } else {
                this.f1442g = gg.class;
                this.f1443h = str2;
            }
            if (fvVar == null) {
                this.f1446k = null;
            } else {
                this.f1446k = fvVar.m2019c();
            }
        }

        private C0366a(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls, jq jqVar) {
            this.f1444i = 1;
            this.f1436a = i;
            this.f1437b = z;
            this.f1438c = i2;
            this.f1439d = z2;
            this.f1440e = str;
            this.f1441f = i3;
            this.f1442g = cls;
            if (cls == null) {
                this.f1443h = null;
            } else {
                this.f1443h = cls.getCanonicalName();
            }
            this.f1446k = jqVar;
        }

        public static C0366a m2038a(String str) {
            return new C0366a(7, true, 7, true, str, 3, null, null);
        }

        public static C0366a m2039a(String str, int i) {
            return new C0366a(0, false, 0, false, str, i, null, null);
        }

        public static C0366a m2040a(String str, int i, jq jqVar) {
            return new C0366a(7, false, 0, false, str, i, null, jqVar);
        }

        public static C0366a m2041a(String str, int i, Class cls) {
            return new C0366a(11, false, 11, false, str, i, cls, null);
        }

        public static C0366a m2043b(String str, int i) {
            return new C0366a(4, false, 4, false, str, i, null, null);
        }

        public static C0366a m2044b(String str, int i, Class cls) {
            return new C0366a(11, true, 11, true, str, i, cls, null);
        }

        public static C0366a m2045c(String str, int i) {
            return new C0366a(6, false, 6, false, str, i, null, null);
        }

        public static C0366a m2046d(String str, int i) {
            return new C0366a(7, false, 7, false, str, i, null, null);
        }

        public final int m2047a() {
            return this.f1444i;
        }

        public final Object m2048a(Object obj) {
            return this.f1446k.mo889a(obj);
        }

        public final void m2049a(gd gdVar) {
            this.f1445j = gdVar;
        }

        public final int m2050b() {
            return this.f1436a;
        }

        public final boolean m2051c() {
            return this.f1437b;
        }

        public final int m2052d() {
            return this.f1438c;
        }

        public int describeContents() {
            jr jrVar = CREATOR;
            return 0;
        }

        public final boolean m2053e() {
            return this.f1439d;
        }

        public final String m2054f() {
            return this.f1440e;
        }

        public final int m2055g() {
            return this.f1441f;
        }

        public final Class m2056h() {
            return this.f1442g;
        }

        final String m2057i() {
            return this.f1443h == null ? null : this.f1443h;
        }

        public final boolean m2058j() {
            return this.f1446k != null;
        }

        final fv m2059k() {
            return this.f1446k == null ? null : fv.m2016a(this.f1446k);
        }

        public final HashMap m2060l() {
            je.m2473a(this.f1443h);
            je.m2473a(this.f1445j);
            return this.f1445j.m2078a(this.f1443h);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field\n");
            stringBuilder.append("            versionCode=").append(this.f1444i).append('\n');
            stringBuilder.append("                 typeIn=").append(this.f1436a).append('\n');
            stringBuilder.append("            typeInArray=").append(this.f1437b).append('\n');
            stringBuilder.append("                typeOut=").append(this.f1438c).append('\n');
            stringBuilder.append("           typeOutArray=").append(this.f1439d).append('\n');
            stringBuilder.append("        outputFieldName=").append(this.f1440e).append('\n');
            stringBuilder.append("      safeParcelFieldId=").append(this.f1441f).append('\n');
            stringBuilder.append("       concreteTypeName=").append(m2057i()).append('\n');
            if (this.f1442g != null) {
                stringBuilder.append("     concreteType.class=").append(this.f1442g.getCanonicalName()).append('\n');
            }
            stringBuilder.append("          converterName=").append(this.f1446k == null ? "null" : this.f1446k.getClass().getCanonicalName()).append('\n');
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            jr jrVar = CREATOR;
            jr.m2491a(this, parcel, i);
        }
    }

    protected static Object m2061a(C0366a c0366a, Object obj) {
        return c0366a.f1446k != null ? c0366a.m2048a(obj) : obj;
    }

    private static void m2062a(StringBuilder stringBuilder, C0366a c0366a, Object obj) {
        if (c0366a.m2050b() == 11) {
            stringBuilder.append(((ga) c0366a.m2056h().cast(obj)).toString());
        } else if (c0366a.m2050b() == 7) {
            stringBuilder.append("\"");
            stringBuilder.append(ke.m2516a((String) obj));
            stringBuilder.append("\"");
        } else {
            stringBuilder.append(obj);
        }
    }

    private static void m2063a(StringBuilder stringBuilder, C0366a c0366a, ArrayList arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                m2062a(stringBuilder, c0366a, obj);
            }
        }
        stringBuilder.append("]");
    }

    protected boolean mo899a(C0366a c0366a) {
        if (c0366a.m2052d() != 11) {
            c0366a.m2054f();
            return mo892d();
        } else if (c0366a.m2053e()) {
            c0366a.m2054f();
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        } else {
            c0366a.m2054f();
            throw new UnsupportedOperationException("Concrete types not supported");
        }
    }

    protected Object mo900b(C0366a c0366a) {
        String f = c0366a.m2054f();
        if (c0366a.m2056h() != null) {
            c0366a.m2054f();
            mo891c();
            je.m2477a(true, "Concrete field shouldn't be value object: " + c0366a.m2054f());
            c0366a.m2053e();
            try {
                return getClass().getMethod("get" + Character.toUpperCase(f.charAt(0)) + f.substring(1), new Class[0]).invoke(this, new Object[0]);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        c0366a.m2054f();
        return mo891c();
    }

    public abstract HashMap mo890b();

    protected abstract Object mo891c();

    protected abstract boolean mo892d();

    public String toString() {
        HashMap b = mo890b();
        StringBuilder stringBuilder = new StringBuilder(100);
        for (String str : b.keySet()) {
            C0366a c0366a = (C0366a) b.get(str);
            if (mo899a(c0366a)) {
                Object a = m2061a(c0366a, mo900b(c0366a));
                if (stringBuilder.length() == 0) {
                    stringBuilder.append("{");
                } else {
                    stringBuilder.append(",");
                }
                stringBuilder.append("\"").append(str).append("\":");
                if (a != null) {
                    switch (c0366a.m2052d()) {
                        case 8:
                            stringBuilder.append("\"").append(kb.m2511a((byte[]) a)).append("\"");
                            break;
                        case 9:
                            stringBuilder.append("\"").append(kb.m2512b((byte[]) a)).append("\"");
                            break;
                        case 10:
                            kf.m2517a(stringBuilder, (HashMap) a);
                            break;
                        default:
                            if (!c0366a.m2051c()) {
                                m2062a(stringBuilder, c0366a, a);
                                break;
                            }
                            m2063a(stringBuilder, c0366a, (ArrayList) a);
                            break;
                    }
                }
                stringBuilder.append("null");
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("}");
        } else {
            stringBuilder.append("{}");
        }
        return stringBuilder.toString();
    }
}
