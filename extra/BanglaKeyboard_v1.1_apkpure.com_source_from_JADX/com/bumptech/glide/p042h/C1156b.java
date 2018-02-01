package com.bumptech.glide.p042h;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class C1156b extends FilterInputStream {
    private final long f3436a;
    private int f3437b;

    private C1156b(InputStream inputStream, long j) {
        super(inputStream);
        this.f3436a = j;
    }

    private int m3134a(int i) {
        if (i >= 0) {
            this.f3437b += i;
        } else if (this.f3436a - ((long) this.f3437b) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f3436a + ", but read: " + this.f3437b);
        }
        return i;
    }

    public static InputStream m3135a(InputStream inputStream, long j) {
        return new C1156b(inputStream, j);
    }

    public final synchronized int available() {
        return (int) Math.max(this.f3436a - ((long) this.f3437b), (long) this.in.available());
    }

    public final synchronized int read() {
        return m3134a(super.read());
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        return m3134a(super.read(bArr, i, i2));
    }
}
