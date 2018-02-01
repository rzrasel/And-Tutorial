package com.google.android.gms.internal;

import java.util.HashMap;

public final class no extends lo<Integer, Long> {
    public Long f6722a;
    public Long f6723b;

    public no(String str) {
        mo2200a(str);
    }

    protected final HashMap<Integer, Long> mo2199a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f6722a);
        hashMap.put(Integer.valueOf(1), this.f6723b);
        return hashMap;
    }

    protected final void mo2200a(String str) {
        HashMap b = lo.m5981b(str);
        if (b != null) {
            this.f6722a = (Long) b.get(Integer.valueOf(0));
            this.f6723b = (Long) b.get(Integer.valueOf(1));
        }
    }
}
