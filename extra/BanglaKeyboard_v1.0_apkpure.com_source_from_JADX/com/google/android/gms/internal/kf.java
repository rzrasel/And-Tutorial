package com.google.android.gms.internal;

import java.util.HashMap;

public final class kf {
    public static void m2517a(StringBuilder stringBuilder, HashMap hashMap) {
        stringBuilder.append("{");
        Object obj = 1;
        for (String str : hashMap.keySet()) {
            Object obj2;
            if (obj == null) {
                stringBuilder.append(",");
                obj2 = obj;
            } else {
                obj2 = null;
            }
            String str2 = (String) hashMap.get(str);
            stringBuilder.append("\"").append(str).append("\":");
            if (str2 == null) {
                stringBuilder.append("null");
                obj = obj2;
            } else {
                stringBuilder.append("\"").append(str2).append("\"");
                obj = obj2;
            }
        }
        stringBuilder.append("}");
    }
}
