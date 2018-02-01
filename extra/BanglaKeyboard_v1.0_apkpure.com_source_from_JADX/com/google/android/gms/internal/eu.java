package com.google.android.gms.internal;

public final class eu {
    final Object f1297a = new Object();
    ge f1298b;
    String f1299c;
    int f1300d = -2;
    String f1301e;
    public final ba f1302f = new ev(this);
    public final ba f1303g = new ew(this);

    public eu(String str) {
        this.f1299c = str;
    }

    public final int m1952a() {
        int i;
        synchronized (this.f1297a) {
            i = this.f1300d;
        }
        return i;
    }

    public final String m1953b() {
        String str;
        synchronized (this.f1297a) {
            while (this.f1301e == null && this.f1300d == -2) {
                try {
                    this.f1297a.wait();
                } catch (InterruptedException e) {
                    gb.m2069a("Ad request service was interrupted.");
                    str = null;
                }
            }
            str = this.f1301e;
        }
        return str;
    }
}
