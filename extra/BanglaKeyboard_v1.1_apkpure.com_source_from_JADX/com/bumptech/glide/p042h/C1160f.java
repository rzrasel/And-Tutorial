package com.bumptech.glide.p042h;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class C1160f extends FilterInputStream {
    private int f3446a = Integer.MIN_VALUE;

    public C1160f(InputStream inputStream) {
        super(inputStream);
    }

    private long m3146a(long j) {
        return this.f3446a == 0 ? -1 : (this.f3446a == Integer.MIN_VALUE || j <= ((long) this.f3446a)) ? j : (long) this.f3446a;
    }

    private void m3147b(long j) {
        if (this.f3446a != Integer.MIN_VALUE && j != -1) {
            this.f3446a = (int) (((long) this.f3446a) - j);
        }
    }

    public final int available() {
        return this.f3446a == Integer.MIN_VALUE ? super.available() : Math.min(this.f3446a, super.available());
    }

    public final void mark(int i) {
        super.mark(i);
        this.f3446a = i;
    }

    public final int read() {
        if (m3146a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m3147b(1);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int a = (int) m3146a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m3147b((long) read);
        return read;
    }

    public final void reset() {
        super.reset();
        this.f3446a = Integer.MIN_VALUE;
    }

    public final long skip(long j) {
        long a = m3146a(j);
        if (a == -1) {
            return -1;
        }
        long skip = super.skip(a);
        m3147b(skip);
        return skip;
    }
}
