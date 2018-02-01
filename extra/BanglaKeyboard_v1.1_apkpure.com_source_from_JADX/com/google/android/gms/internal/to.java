package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

final class to {
    private static final String m6664a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase(charAt));
        }
        return stringBuilder.toString();
    }

    static void m6665a(tl tlVar, StringBuilder stringBuilder, int i) {
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Set<String> treeSet = new TreeSet();
        for (Method method : tlVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String replaceFirst : treeSet) {
            String replaceFirst2;
            String valueOf;
            Method method2;
            String replaceFirst3 = replaceFirst2.replaceFirst("get", "");
            if (replaceFirst3.endsWith("List") && !replaceFirst3.endsWith("OrBuilderList")) {
                valueOf = String.valueOf(replaceFirst3.substring(0, 1).toLowerCase());
                replaceFirst2 = String.valueOf(replaceFirst3.substring(1, replaceFirst3.length() - 4));
                valueOf = replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf);
                String str = "get";
                replaceFirst2 = String.valueOf(replaceFirst3);
                method2 = (Method) hashMap.get(replaceFirst2.length() != 0 ? str.concat(replaceFirst2) : new String(str));
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m6666a(stringBuilder, i, m6664a(valueOf), sq.m6122a(method2, (Object) tlVar, new Object[0]));
                }
            }
            valueOf = "set";
            replaceFirst2 = String.valueOf(replaceFirst3);
            if (((Method) hashMap2.get(replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf))) != null) {
                if (replaceFirst3.endsWith("Bytes")) {
                    valueOf = "get";
                    replaceFirst2 = String.valueOf(replaceFirst3.substring(0, replaceFirst3.length() - 5));
                    if (hashMap.containsKey(replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf))) {
                    }
                }
                valueOf = String.valueOf(replaceFirst3.substring(0, 1).toLowerCase());
                replaceFirst2 = String.valueOf(replaceFirst3.substring(1));
                str = replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf);
                valueOf = "get";
                replaceFirst2 = String.valueOf(replaceFirst3);
                method2 = (Method) hashMap.get(replaceFirst2.length() != 0 ? valueOf.concat(replaceFirst2) : new String(valueOf));
                String str2 = "has";
                valueOf = String.valueOf(replaceFirst3);
                Method method3 = (Method) hashMap.get(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                if (method2 != null) {
                    boolean equals;
                    tl a = sq.m6122a(method2, (Object) tlVar, new Object[0]);
                    if (method3 == null) {
                        equals = a instanceof Boolean ? !((Boolean) a).booleanValue() : a instanceof Integer ? ((Integer) a).intValue() == 0 : a instanceof Float ? ((Float) a).floatValue() == 0.0f : a instanceof Double ? ((Double) a).doubleValue() == 0.0d : a instanceof String ? a.equals("") : a instanceof ry ? a.equals(ry.f7068a) : a instanceof tl ? a == ((tl) a).mo2215j() : a instanceof Enum ? ((Enum) a).ordinal() == 0 : false;
                        equals = !equals;
                    } else {
                        equals = ((Boolean) sq.m6122a(method3, (Object) tlVar, new Object[0])).booleanValue();
                    }
                    if (equals) {
                        m6666a(stringBuilder, i, m6664a(str), a);
                    }
                }
            }
        }
        if (tlVar instanceof sv) {
            sn snVar = ((sv) tlVar).f7110a;
            Iterator tjVar = snVar.f7103b ? new tj(snVar.f7102a.entrySet().iterator()) : snVar.f7102a.entrySet().iterator();
            if (tjVar.hasNext()) {
                ((Entry) tjVar.next()).getKey();
                throw new NoSuchMethodError();
            }
        }
        if (((sq) tlVar).f6753e != null) {
            ((sq) tlVar).f6753e.m6703a(stringBuilder, i);
        }
    }

    static final void m6666a(StringBuilder stringBuilder, int i, String str, Object obj) {
        int i2 = 0;
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                m6666a(stringBuilder, i, str, a);
            }
            return;
        }
        stringBuilder.append('\n');
        for (int i3 = 0; i3 < i; i3++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(str);
        if (obj instanceof String) {
            stringBuilder.append(": \"").append(tz.m6688a(ry.m6516a((String) obj))).append('\"');
        } else if (obj instanceof ry) {
            stringBuilder.append(": \"").append(tz.m6688a((ry) obj)).append('\"');
        } else if (obj instanceof sq) {
            stringBuilder.append(" {");
            m6665a((sq) obj, stringBuilder, i + 2);
            stringBuilder.append("\n");
            while (i2 < i) {
                stringBuilder.append(' ');
                i2++;
            }
            stringBuilder.append("}");
        } else {
            stringBuilder.append(": ").append(obj.toString());
        }
    }
}
