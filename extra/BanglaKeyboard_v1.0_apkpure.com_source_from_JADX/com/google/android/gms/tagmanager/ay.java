package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.el;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class ay {
    private static final Object f2325a = null;
    private static Long f2326b = new Long(0);
    private static Double f2327c = new Double(0.0d);
    private static ax f2328d = ax.m3653a();
    private static String f2329e = new String("");
    private static Boolean f2330f = new Boolean(false);
    private static List f2331g = new ArrayList(0);
    private static Map f2332h = new HashMap();
    private static el f2333i = m3657a(f2329e);

    public static el m3656a() {
        return f2333i;
    }

    public static el m3657a(Object obj) {
        int i = 1;
        boolean z = false;
        el elVar = new el();
        if (obj instanceof el) {
            return (el) obj;
        }
        if (obj instanceof String) {
            elVar.f1272a = 1;
            elVar.f1273b = (String) obj;
        } else if (obj instanceof List) {
            elVar.f1272a = 2;
            List<Object> list = (List) obj;
            r5 = new ArrayList(list.size());
            r1 = false;
            for (Object a : list) {
                el a2 = m3657a(a);
                if (a2 == f2333i) {
                    return f2333i;
                }
                r0 = r1 || a2.f1283l;
                r5.add(a2);
                r1 = r0;
            }
            elVar.f1274c = (el[]) r5.toArray(new el[0]);
            z = r1;
        } else if (obj instanceof Map) {
            elVar.f1272a = 3;
            Set<Entry> entrySet = ((Map) obj).entrySet();
            r5 = new ArrayList(entrySet.size());
            List arrayList = new ArrayList(entrySet.size());
            r1 = false;
            for (Entry entry : entrySet) {
                el a3 = m3657a(entry.getKey());
                el a4 = m3657a(entry.getValue());
                if (a3 == f2333i || a4 == f2333i) {
                    return f2333i;
                }
                r0 = r1 || a3.f1283l || a4.f1283l;
                r5.add(a3);
                arrayList.add(a4);
                r1 = r0;
            }
            elVar.f1275d = (el[]) r5.toArray(new el[0]);
            elVar.f1276e = (el[]) arrayList.toArray(new el[0]);
            z = r1;
        } else {
            r0 = (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof ax) && ((ax) obj).m3654b());
            if (r0) {
                elVar.f1272a = 1;
                elVar.f1273b = obj.toString();
            } else {
                if (!((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof ax) && ((ax) obj).m3655c()))) {
                    i = 0;
                }
                if (i != 0) {
                    long longValue;
                    elVar.f1272a = 6;
                    if (obj instanceof Number) {
                        longValue = ((Number) obj).longValue();
                    } else {
                        C0535t.m3730a();
                        longValue = 0;
                    }
                    elVar.f1279h = longValue;
                } else if (obj instanceof Boolean) {
                    elVar.f1272a = 8;
                    elVar.f1280i = ((Boolean) obj).booleanValue();
                } else {
                    "Converting to Value from unknown object type: " + (obj == null ? "null" : obj.getClass().toString());
                    C0535t.m3730a();
                    return f2333i;
                }
            }
        }
        elVar.f1283l = z;
        return elVar;
    }

    public static String m3658a(el elVar) {
        return m3660b(m3661c(elVar));
    }

    public static Boolean m3659b(el elVar) {
        Object c = m3661c(elVar);
        if (c instanceof Boolean) {
            return (Boolean) c;
        }
        String b = m3660b(c);
        return "true".equalsIgnoreCase(b) ? Boolean.TRUE : "false".equalsIgnoreCase(b) ? Boolean.FALSE : f2330f;
    }

    private static String m3660b(Object obj) {
        return obj == null ? f2329e : obj.toString();
    }

    public static Object m3661c(el elVar) {
        int i = 0;
        if (elVar == null) {
            return f2325a;
        }
        el[] elVarArr;
        int length;
        switch (elVar.f1272a) {
            case 1:
                return elVar.f1273b;
            case 2:
                ArrayList arrayList = new ArrayList(elVar.f1274c.length);
                elVarArr = elVar.f1274c;
                length = elVarArr.length;
                while (i < length) {
                    Object c = m3661c(elVarArr[i]);
                    if (c == f2325a) {
                        return f2325a;
                    }
                    arrayList.add(c);
                    i++;
                }
                return arrayList;
            case 3:
                if (elVar.f1275d.length != elVar.f1276e.length) {
                    "Converting an invalid value to object: " + elVar.toString();
                    C0535t.m3730a();
                    return f2325a;
                }
                Map hashMap = new HashMap(elVar.f1276e.length);
                while (i < elVar.f1275d.length) {
                    Object c2 = m3661c(elVar.f1275d[i]);
                    Object c3 = m3661c(elVar.f1276e[i]);
                    if (c2 == f2325a || c3 == f2325a) {
                        return f2325a;
                    }
                    hashMap.put(c2, c3);
                    i++;
                }
                return hashMap;
            case 4:
                C0535t.m3730a();
                return f2325a;
            case 5:
                C0535t.m3730a();
                return f2325a;
            case 6:
                return Long.valueOf(elVar.f1279h);
            case 7:
                StringBuffer stringBuffer = new StringBuffer();
                elVarArr = elVar.f1281j;
                length = elVarArr.length;
                while (i < length) {
                    String a = m3658a(elVarArr[i]);
                    if (a == f2329e) {
                        return f2325a;
                    }
                    stringBuffer.append(a);
                    i++;
                }
                return stringBuffer.toString();
            case 8:
                return Boolean.valueOf(elVar.f1280i);
            default:
                "Failed to convert a value of type: " + elVar.f1272a;
                C0535t.m3730a();
                return f2325a;
        }
    }
}
