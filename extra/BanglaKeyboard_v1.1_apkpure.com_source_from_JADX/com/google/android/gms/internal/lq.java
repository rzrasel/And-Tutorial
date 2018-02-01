package com.google.android.gms.internal;

import java.util.HashMap;

public final class lq extends lo<Integer, Object> {
    public String f6579a;
    public long f6580b;
    public String f6581c;
    public String f6582d;
    public String f6583e;

    public lq() {
        this.f6579a = "E";
        this.f6580b = -1;
        this.f6581c = "E";
        this.f6582d = "E";
        this.f6583e = "E";
    }

    public lq(String str) {
        this();
        mo2200a(str);
    }

    protected final HashMap<Integer, Object> mo2199a() {
        HashMap<Integer, Object> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f6579a);
        hashMap.put(Integer.valueOf(4), this.f6583e);
        hashMap.put(Integer.valueOf(3), this.f6582d);
        hashMap.put(Integer.valueOf(2), this.f6581c);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f6580b));
        return hashMap;
    }

    protected final void mo2200a(String str) {
        HashMap b = lo.m5981b(str);
        if (b != null) {
            this.f6579a = b.get(Integer.valueOf(0)) == null ? "E" : (String) b.get(Integer.valueOf(0));
            this.f6580b = b.get(Integer.valueOf(1)) == null ? -1 : ((Long) b.get(Integer.valueOf(1))).longValue();
            this.f6581c = b.get(Integer.valueOf(2)) == null ? "E" : (String) b.get(Integer.valueOf(2));
            this.f6582d = b.get(Integer.valueOf(3)) == null ? "E" : (String) b.get(Integer.valueOf(3));
            this.f6583e = b.get(Integer.valueOf(4)) == null ? "E" : (String) b.get(Integer.valueOf(4));
        }
    }
}
