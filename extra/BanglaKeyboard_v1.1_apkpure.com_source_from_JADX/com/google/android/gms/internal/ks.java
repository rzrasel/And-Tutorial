package com.google.android.gms.internal;

import java.io.ByteArrayOutputStream;

public final class ks extends ByteArrayOutputStream {
    private final cw f6409a;

    public ks(cw cwVar, int i) {
        this.f6409a = cwVar;
        this.buf = this.f6409a.m5224a(Math.max(i, 256));
    }

    private final void m5892a(int i) {
        if (this.count + i > this.buf.length) {
            Object a = this.f6409a.m5224a((this.count + i) << 1);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f6409a.m5223a(this.buf);
            this.buf = a;
        }
    }

    public final void close() {
        this.f6409a.m5223a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f6409a.m5223a(this.buf);
    }

    public final synchronized void write(int i) {
        m5892a(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m5892a(i2);
        super.write(bArr, i, i2);
    }
}
