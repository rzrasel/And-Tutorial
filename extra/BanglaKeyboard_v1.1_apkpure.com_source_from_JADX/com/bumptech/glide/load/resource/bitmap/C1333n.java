package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class C1333n extends FilterInputStream {
    private volatile byte[] f3737a;
    private int f3738b;
    private int f3739c;
    private int f3740d = -1;
    private int f3741e;

    public static class C1332a extends RuntimeException {
        public C1332a(String str) {
            super(str);
        }
    }

    public C1333n(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.f3737a = bArr;
    }

    private int m3478a(InputStream inputStream, byte[] bArr) {
        int read;
        if (this.f3740d == -1 || this.f3741e - this.f3740d >= this.f3739c) {
            read = inputStream.read(bArr);
            if (read <= 0) {
                return read;
            }
            this.f3740d = -1;
            this.f3741e = 0;
            this.f3738b = read;
            return read;
        }
        if (this.f3740d == 0 && this.f3739c > bArr.length && this.f3738b == bArr.length) {
            read = bArr.length * 2;
            if (read > this.f3739c) {
                read = this.f3739c;
            }
            Log.isLoggable("BufferedIs", 3);
            Object obj = new byte[read];
            System.arraycopy(bArr, 0, obj, 0, bArr.length);
            this.f3737a = obj;
            bArr = obj;
        } else if (this.f3740d > 0) {
            System.arraycopy(bArr, this.f3740d, bArr, 0, bArr.length - this.f3740d);
        }
        this.f3741e -= this.f3740d;
        this.f3740d = 0;
        this.f3738b = 0;
        int read2 = inputStream.read(bArr, this.f3741e, bArr.length - this.f3741e);
        this.f3738b = read2 <= 0 ? this.f3741e : this.f3741e + read2;
        return read2;
    }

    private static IOException m3479b() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized void m3480a() {
        this.f3739c = this.f3737a.length;
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f3737a == null || inputStream == null) {
            throw C1333n.m3479b();
        }
        return inputStream.available() + (this.f3738b - this.f3741e);
    }

    public final void close() {
        this.f3737a = null;
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void mark(int i) {
        this.f3739c = Math.max(this.f3739c, i);
        this.f3740d = this.f3741e;
    }

    public final boolean markSupported() {
        return true;
    }

    public final synchronized int read() {
        int i = -1;
        synchronized (this) {
            byte[] bArr = this.f3737a;
            InputStream inputStream = this.in;
            if (bArr == null || inputStream == null) {
                throw C1333n.m3479b();
            }
            if (this.f3741e < this.f3738b || m3478a(inputStream, bArr) != -1) {
                if (bArr != this.f3737a) {
                    bArr = this.f3737a;
                    if (bArr == null) {
                        throw C1333n.m3479b();
                    }
                }
                if (this.f3738b - this.f3741e > 0) {
                    i = this.f3741e;
                    this.f3741e = i + 1;
                    i = bArr[i] & 255;
                }
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r7, int r8, int r9) {
        /*
        r6 = this;
        r1 = -1;
        monitor-enter(r6);
        r2 = r6.f3737a;	 Catch:{ all -> 0x000b }
        if (r2 != 0) goto L_0x000e;
    L_0x0006:
        r0 = com.bumptech.glide.load.resource.bitmap.C1333n.m3479b();	 Catch:{ all -> 0x000b }
        throw r0;	 Catch:{ all -> 0x000b }
    L_0x000b:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x000e:
        if (r9 != 0) goto L_0x0013;
    L_0x0010:
        r9 = 0;
    L_0x0011:
        monitor-exit(r6);
        return r9;
    L_0x0013:
        r4 = r6.in;	 Catch:{ all -> 0x000b }
        if (r4 != 0) goto L_0x001c;
    L_0x0017:
        r0 = com.bumptech.glide.load.resource.bitmap.C1333n.m3479b();	 Catch:{ all -> 0x000b }
        throw r0;	 Catch:{ all -> 0x000b }
    L_0x001c:
        r0 = r6.f3741e;	 Catch:{ all -> 0x000b }
        r3 = r6.f3738b;	 Catch:{ all -> 0x000b }
        if (r0 >= r3) goto L_0x0058;
    L_0x0022:
        r0 = r6.f3738b;	 Catch:{ all -> 0x000b }
        r3 = r6.f3741e;	 Catch:{ all -> 0x000b }
        r0 = r0 - r3;
        if (r0 < r9) goto L_0x003e;
    L_0x0029:
        r0 = r9;
    L_0x002a:
        r3 = r6.f3741e;	 Catch:{ all -> 0x000b }
        java.lang.System.arraycopy(r2, r3, r7, r8, r0);	 Catch:{ all -> 0x000b }
        r3 = r6.f3741e;	 Catch:{ all -> 0x000b }
        r3 = r3 + r0;
        r6.f3741e = r3;	 Catch:{ all -> 0x000b }
        if (r0 == r9) goto L_0x003c;
    L_0x0036:
        r3 = r4.available();	 Catch:{ all -> 0x000b }
        if (r3 != 0) goto L_0x0044;
    L_0x003c:
        r9 = r0;
        goto L_0x0011;
    L_0x003e:
        r0 = r6.f3738b;	 Catch:{ all -> 0x000b }
        r3 = r6.f3741e;	 Catch:{ all -> 0x000b }
        r0 = r0 - r3;
        goto L_0x002a;
    L_0x0044:
        r8 = r8 + r0;
        r3 = r9 - r0;
    L_0x0047:
        r0 = r6.f3740d;	 Catch:{ all -> 0x000b }
        if (r0 != r1) goto L_0x005c;
    L_0x004b:
        r0 = r2.length;	 Catch:{ all -> 0x000b }
        if (r3 < r0) goto L_0x005c;
    L_0x004e:
        r0 = r4.read(r7, r8, r3);	 Catch:{ all -> 0x000b }
        if (r0 != r1) goto L_0x0087;
    L_0x0054:
        if (r3 != r9) goto L_0x005a;
    L_0x0056:
        r9 = r1;
        goto L_0x0011;
    L_0x0058:
        r3 = r9;
        goto L_0x0047;
    L_0x005a:
        r9 = r9 - r3;
        goto L_0x0011;
    L_0x005c:
        r0 = r6.m3478a(r4, r2);	 Catch:{ all -> 0x000b }
        if (r0 != r1) goto L_0x0068;
    L_0x0062:
        if (r3 != r9) goto L_0x0066;
    L_0x0064:
        r9 = r1;
        goto L_0x0011;
    L_0x0066:
        r9 = r9 - r3;
        goto L_0x0011;
    L_0x0068:
        r0 = r6.f3737a;	 Catch:{ all -> 0x000b }
        if (r2 == r0) goto L_0x0075;
    L_0x006c:
        r2 = r6.f3737a;	 Catch:{ all -> 0x000b }
        if (r2 != 0) goto L_0x0075;
    L_0x0070:
        r0 = com.bumptech.glide.load.resource.bitmap.C1333n.m3479b();	 Catch:{ all -> 0x000b }
        throw r0;	 Catch:{ all -> 0x000b }
    L_0x0075:
        r0 = r6.f3738b;	 Catch:{ all -> 0x000b }
        r5 = r6.f3741e;	 Catch:{ all -> 0x000b }
        r0 = r0 - r5;
        if (r0 < r3) goto L_0x0092;
    L_0x007c:
        r0 = r3;
    L_0x007d:
        r5 = r6.f3741e;	 Catch:{ all -> 0x000b }
        java.lang.System.arraycopy(r2, r5, r7, r8, r0);	 Catch:{ all -> 0x000b }
        r5 = r6.f3741e;	 Catch:{ all -> 0x000b }
        r5 = r5 + r0;
        r6.f3741e = r5;	 Catch:{ all -> 0x000b }
    L_0x0087:
        r3 = r3 - r0;
        if (r3 == 0) goto L_0x0011;
    L_0x008a:
        r5 = r4.available();	 Catch:{ all -> 0x000b }
        if (r5 != 0) goto L_0x0098;
    L_0x0090:
        r9 = r9 - r3;
        goto L_0x0011;
    L_0x0092:
        r0 = r6.f3738b;	 Catch:{ all -> 0x000b }
        r5 = r6.f3741e;	 Catch:{ all -> 0x000b }
        r0 = r0 - r5;
        goto L_0x007d;
    L_0x0098:
        r8 = r8 + r0;
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.n.read(byte[], int, int):int");
    }

    public final synchronized void reset() {
        if (this.f3737a == null) {
            throw new IOException("Stream is closed");
        } else if (-1 == this.f3740d) {
            throw new C1332a("Mark has been invalidated");
        } else {
            this.f3741e = this.f3740d;
        }
    }

    public final synchronized long skip(long j) {
        byte[] bArr = this.f3737a;
        InputStream inputStream = this.in;
        if (bArr == null) {
            throw C1333n.m3479b();
        } else if (j < 1) {
            j = 0;
        } else if (inputStream == null) {
            throw C1333n.m3479b();
        } else if (((long) (this.f3738b - this.f3741e)) >= j) {
            this.f3741e = (int) (((long) this.f3741e) + j);
        } else {
            long j2 = (long) (this.f3738b - this.f3741e);
            this.f3741e = this.f3738b;
            if (this.f3740d == -1 || j > ((long) this.f3739c)) {
                j = j2 + inputStream.skip(j - j2);
            } else if (m3478a(inputStream, bArr) == -1) {
                j = j2;
            } else if (((long) (this.f3738b - this.f3741e)) >= j - j2) {
                this.f3741e = (int) ((j - j2) + ((long) this.f3741e));
            } else {
                j = (j2 + ((long) this.f3738b)) - ((long) this.f3741e);
                this.f3741e = this.f3738b;
            }
        }
        return j;
    }
}
