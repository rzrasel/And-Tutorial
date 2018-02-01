package com.google.android.gms.internal;

import android.os.Bundle;

public final class fh {
    final Object f1395a;
    int f1396b;
    int f1397c;
    final fd f1398d;
    final String f1399e;

    private fh(fd fdVar, String str) {
        this.f1395a = new Object();
        this.f1398d = fdVar;
        this.f1399e = str;
    }

    public fh(String str) {
        this(fd.m1970a(), str);
    }

    public final Bundle m1982a() {
        Bundle bundle;
        synchronized (this.f1395a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f1396b);
            bundle.putInt("pmnll", this.f1397c);
        }
        return bundle;
    }
}
