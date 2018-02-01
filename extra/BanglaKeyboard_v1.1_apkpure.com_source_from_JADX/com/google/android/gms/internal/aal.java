package com.google.android.gms.internal;

import java.util.Random;

@aqv
public final class aal extends abo {
    private final Random f4746a = new Random();
    private long f4747b;
    private Object f4748c = new Object();

    public aal() {
        m4026a();
    }

    public final void m4026a() {
        synchronized (this.f4748c) {
            int i = 3;
            long j = 0;
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                j = ((long) this.f4746a.nextInt()) + 2147483648L;
                if (j != this.f4747b && j != 0) {
                    break;
                }
            }
            this.f4747b = j;
        }
    }

    public final long mo1686b() {
        return this.f4747b;
    }
}
