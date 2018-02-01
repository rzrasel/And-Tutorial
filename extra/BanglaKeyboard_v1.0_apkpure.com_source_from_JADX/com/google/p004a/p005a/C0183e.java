package com.google.p004a.p005a;

import com.google.android.gms.internal.gb;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
public abstract class C0183e {
    public final void m765a(Map map) {
        Map hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            C0185g c0185g = (C0185g) field.getAnnotation(C0185g.class);
            if (c0185g != null) {
                hashMap.put(c0185g.m766a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            gb.m2069a("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Entry entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    gb.m2069a("Server option \"" + ((String) entry.getKey()) + "\" could not be set: Illegal Access");
                } catch (IllegalArgumentException e2) {
                    gb.m2069a("Server option \"" + ((String) entry.getKey()) + "\" could not be set: Bad Type");
                }
            } else {
                "Unexpected server option: " + ((String) entry.getKey()) + " = \"" + ((String) entry.getValue()) + "\"";
                gb.m2071a(3);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((C0185g) field3.getAnnotation(C0185g.class)).m767b()) {
                gb.m2069a("Required server option missing: " + ((C0185g) field3.getAnnotation(C0185g.class)).m766a());
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(((C0185g) field3.getAnnotation(C0185g.class)).m766a());
            }
        }
        if (stringBuilder.length() > 0) {
            throw new C0184f("Required server option(s) missing: " + stringBuilder.toString());
        }
    }
}
