package com.google.android.gms.internal;

import android.os.Bundle;

public final class ff {
    final Object f1388a = new Object();
    int f1389b = 0;
    long f1390c = -1;
    long f1391d = -1;
    int f1392e = 0;
    int f1393f = -1;
    private final String f1394g;

    public ff(String str) {
        this.f1394g = str;
    }

    public final Bundle m1980a(String str) {
        Bundle bundle;
        synchronized (this.f1388a) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f1394g);
            bundle.putLong("basets", this.f1391d);
            bundle.putLong("currts", this.f1390c);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f1393f);
            bundle.putInt("pclick", this.f1389b);
            bundle.putInt("pimp", this.f1392e);
        }
        return bundle;
    }
}
