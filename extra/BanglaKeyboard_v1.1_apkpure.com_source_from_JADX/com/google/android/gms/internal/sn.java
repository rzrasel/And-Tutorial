package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

final class sn<FieldDescriptorType extends sp<FieldDescriptorType>> {
    private static final sn f7101d = new sn((byte) 0);
    final tr<FieldDescriptorType, Object> f7102a = tr.m6670a(16);
    boolean f7103b = false;
    private boolean f7104c;

    private sn() {
    }

    private sn(byte b) {
        if (!this.f7104c) {
            this.f7102a.mo2288a();
            this.f7104c = true;
        }
    }

    public static <T extends sp<T>> sn<T> m6625a() {
        return new sn();
    }

    private void m6626a(FieldDescriptorType fieldDescriptorType, Object obj) {
        Object obj2;
        if (!fieldDescriptorType.m6629b()) {
            m6627a(fieldDescriptorType.m6628a(), obj);
            obj2 = obj;
        } else if (obj instanceof List) {
            obj2 = new ArrayList();
            obj2.addAll((List) obj);
            ArrayList arrayList = (ArrayList) obj2;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                m6627a(fieldDescriptorType.m6628a(), obj3);
            }
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj2 instanceof th) {
            this.f7103b = true;
        }
        this.f7102a.m6678a((Comparable) fieldDescriptorType, obj2);
    }

    private static void m6627a(um umVar, Object obj) {
        boolean z = false;
        ta.m6656a(obj);
        switch (so.f7105a[umVar.f7210s.ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if ((obj instanceof ry) || (obj instanceof byte[])) {
                    z = true;
                    break;
                }
            case 8:
                if ((obj instanceof Integer) || (obj instanceof tb)) {
                    z = true;
                    break;
                }
            case 9:
                if ((obj instanceof tl) || (obj instanceof th)) {
                    z = true;
                    break;
                }
        }
        if (!z) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final /* synthetic */ Object clone() {
        sn snVar = new sn();
        for (int i = 0; i < this.f7102a.m6680b(); i++) {
            Entry b = this.f7102a.m6681b(i);
            snVar.m6626a((sp) b.getKey(), b.getValue());
        }
        for (Entry entry : this.f7102a.m6682c()) {
            snVar.m6626a((sp) entry.getKey(), entry.getValue());
        }
        snVar.f7103b = this.f7103b;
        return snVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn)) {
            return false;
        }
        return this.f7102a.equals(((sn) obj).f7102a);
    }

    public final int hashCode() {
        return this.f7102a.hashCode();
    }
}
