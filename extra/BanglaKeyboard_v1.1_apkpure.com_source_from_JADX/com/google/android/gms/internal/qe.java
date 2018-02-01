package com.google.android.gms.internal;

import java.util.HashMap;

public final class qe extends lo<Integer, Long> {
    public Long f6993a;
    public Long f6994b;
    public Long f6995c;

    public qe(String str) {
        mo2200a(str);
    }

    protected final HashMap<Integer, Long> mo2199a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f6993a);
        hashMap.put(Integer.valueOf(1), this.f6994b);
        hashMap.put(Integer.valueOf(2), this.f6995c);
        return hashMap;
    }

    protected final void mo2200a(String str) {
        HashMap b = lo.m5981b(str);
        if (b != null) {
            this.f6993a = (Long) b.get(Integer.valueOf(0));
            this.f6994b = (Long) b.get(Integer.valueOf(1));
            this.f6995c = (Long) b.get(Integer.valueOf(2));
        }
    }
}
