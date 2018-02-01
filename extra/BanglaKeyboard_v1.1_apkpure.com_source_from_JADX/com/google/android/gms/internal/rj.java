package com.google.android.gms.internal;

public final class rj extends rs {
    private final StackTraceElement[] f7048d;

    public rj(np npVar, String str, String str2, kz kzVar, int i, StackTraceElement[] stackTraceElementArr) {
        super(npVar, str, str2, kzVar, i, 45);
        this.f7048d = stackTraceElementArr;
    }

    protected final void mo2232a() {
        if (this.f7048d != null) {
            nn nnVar = new nn((String) this.c.invoke(null, new Object[]{this.f7048d}));
            synchronized (this.b) {
                this.b.f6431B = nnVar.f6719a;
                if (nnVar.f6720b.booleanValue()) {
                    this.b.f6438I = Integer.valueOf(nnVar.f6721c.booleanValue() ? 0 : 1);
                }
            }
        }
    }
}
