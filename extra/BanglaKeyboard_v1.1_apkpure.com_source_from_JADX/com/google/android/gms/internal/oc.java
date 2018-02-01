package com.google.android.gms.internal;

import java.util.HashMap;

public final class oc extends lo<Integer, Long> {
    public Long f6803a;
    public Long f6804b;
    public Long f6805c;
    public Long f6806d;
    public Long f6807e;
    public Long f6808f;
    public Long f6809g;
    public Long f6810h;
    public Long f6811i;
    public Long f6812j;
    public Long f6813k;
    public Long f6814l;
    public Long f6815m;

    public oc(String str) {
        mo2200a(str);
    }

    protected final HashMap<Integer, Long> mo2199a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f6803a);
        hashMap.put(Integer.valueOf(1), this.f6804b);
        hashMap.put(Integer.valueOf(2), this.f6805c);
        hashMap.put(Integer.valueOf(3), this.f6806d);
        hashMap.put(Integer.valueOf(4), this.f6807e);
        hashMap.put(Integer.valueOf(5), this.f6808f);
        hashMap.put(Integer.valueOf(6), this.f6809g);
        hashMap.put(Integer.valueOf(7), this.f6810h);
        hashMap.put(Integer.valueOf(8), this.f6811i);
        hashMap.put(Integer.valueOf(9), this.f6812j);
        hashMap.put(Integer.valueOf(10), this.f6813k);
        hashMap.put(Integer.valueOf(11), this.f6814l);
        hashMap.put(Integer.valueOf(12), this.f6815m);
        return hashMap;
    }

    protected final void mo2200a(String str) {
        HashMap b = lo.m5981b(str);
        if (b != null) {
            this.f6803a = (Long) b.get(Integer.valueOf(0));
            this.f6804b = (Long) b.get(Integer.valueOf(1));
            this.f6805c = (Long) b.get(Integer.valueOf(2));
            this.f6806d = (Long) b.get(Integer.valueOf(3));
            this.f6807e = (Long) b.get(Integer.valueOf(4));
            this.f6808f = (Long) b.get(Integer.valueOf(5));
            this.f6809g = (Long) b.get(Integer.valueOf(6));
            this.f6810h = (Long) b.get(Integer.valueOf(7));
            this.f6811i = (Long) b.get(Integer.valueOf(8));
            this.f6812j = (Long) b.get(Integer.valueOf(9));
            this.f6813k = (Long) b.get(Integer.valueOf(10));
            this.f6814l = (Long) b.get(Integer.valueOf(11));
            this.f6815m = (Long) b.get(Integer.valueOf(12));
        }
    }
}
