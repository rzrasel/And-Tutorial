package com.google.android.gms.internal;

import java.util.HashMap;

public final class nn extends lo<Integer, Object> {
    public Long f6719a;
    public Boolean f6720b;
    public Boolean f6721c;

    public nn(String str) {
        mo2200a(str);
    }

    protected final HashMap<Integer, Object> mo2199a() {
        HashMap<Integer, Object> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f6719a);
        hashMap.put(Integer.valueOf(1), this.f6720b);
        hashMap.put(Integer.valueOf(2), this.f6721c);
        return hashMap;
    }

    protected final void mo2200a(String str) {
        HashMap b = lo.m5981b(str);
        if (b != null) {
            this.f6719a = (Long) b.get(Integer.valueOf(0));
            this.f6720b = (Boolean) b.get(Integer.valueOf(1));
            this.f6721c = (Boolean) b.get(Integer.valueOf(2));
        }
    }
}
