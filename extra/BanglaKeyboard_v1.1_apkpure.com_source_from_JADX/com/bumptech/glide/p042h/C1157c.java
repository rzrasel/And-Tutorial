package com.bumptech.glide.p042h;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class C1157c extends InputStream {
    private static final Queue<C1157c> f3438b = C1163h.m3153a(0);
    public IOException f3439a;
    private InputStream f3440c;

    C1157c() {
    }

    public static C1157c m3136a(InputStream inputStream) {
        C1157c c1157c;
        synchronized (f3438b) {
            c1157c = (C1157c) f3438b.poll();
        }
        if (c1157c == null) {
            c1157c = new C1157c();
        }
        c1157c.f3440c = inputStream;
        return c1157c;
    }

    public final void m3137a() {
        this.f3439a = null;
        this.f3440c = null;
        synchronized (f3438b) {
            f3438b.offer(this);
        }
    }

    public final int available() {
        return this.f3440c.available();
    }

    public final void close() {
        this.f3440c.close();
    }

    public final void mark(int i) {
        this.f3440c.mark(i);
    }

    public final boolean markSupported() {
        return this.f3440c.markSupported();
    }

    public final int read() {
        try {
            return this.f3440c.read();
        } catch (IOException e) {
            this.f3439a = e;
            return -1;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f3440c.read(bArr);
        } catch (IOException e) {
            this.f3439a = e;
            return -1;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.f3440c.read(bArr, i, i2);
        } catch (IOException e) {
            this.f3439a = e;
            return -1;
        }
    }

    public final synchronized void reset() {
        this.f3440c.reset();
    }

    public final long skip(long j) {
        try {
            return this.f3440c.skip(j);
        } catch (IOException e) {
            this.f3439a = e;
            return 0;
        }
    }
}
