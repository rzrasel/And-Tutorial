package com.bumptech.glide.p034c;

import android.support.v4.app.FrameMetricsAggregator;
import java.io.OutputStream;

final class C1097b {
    int f3268a;
    int f3269b;
    int f3270c;
    int f3271d;
    int f3272e;
    int f3273f;
    int f3274g = 12;
    int f3275h;
    int f3276i = 4096;
    int[] f3277j = new int[5003];
    int[] f3278k = new int[5003];
    int f3279l = 5003;
    int f3280m = 0;
    boolean f3281n = false;
    int f3282o;
    int f3283p;
    int f3284q;
    int f3285r = 0;
    int f3286s = 0;
    int[] f3287t = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, FrameMetricsAggregator.EVERY_DURATION, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    int f3288u;
    byte[] f3289v = new byte[256];
    private byte[] f3290w;

    C1097b(int i, int i2, byte[] bArr, int i3) {
        this.f3268a = i;
        this.f3269b = i2;
        this.f3290w = bArr;
        this.f3270c = Math.max(2, i3);
    }

    private int m2958a() {
        if (this.f3271d == 0) {
            return -1;
        }
        this.f3271d--;
        byte[] bArr = this.f3290w;
        int i = this.f3272e;
        this.f3272e = i + 1;
        return bArr[i] & 255;
    }

    private void m2959a(byte b, OutputStream outputStream) {
        byte[] bArr = this.f3289v;
        int i = this.f3288u;
        this.f3288u = i + 1;
        bArr[i] = b;
        if (this.f3288u >= 254) {
            m2961a(outputStream);
        }
    }

    private void m2960a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f3277j[i2] = -1;
        }
    }

    private void m2961a(OutputStream outputStream) {
        if (this.f3288u > 0) {
            outputStream.write(this.f3288u);
            outputStream.write(this.f3289v, 0, this.f3288u);
            this.f3288u = 0;
        }
    }

    private void m2962b(int i, OutputStream outputStream) {
        this.f3285r &= this.f3287t[this.f3286s];
        if (this.f3286s > 0) {
            this.f3285r |= i << this.f3286s;
        } else {
            this.f3285r = i;
        }
        this.f3286s += this.f3273f;
        while (this.f3286s >= 8) {
            m2959a((byte) (this.f3285r & 255), outputStream);
            this.f3285r >>= 8;
            this.f3286s -= 8;
        }
        if (this.f3280m > this.f3275h || this.f3281n) {
            if (this.f3281n) {
                int i2 = this.f3282o;
                this.f3273f = i2;
                this.f3275h = (1 << i2) - 1;
                this.f3281n = false;
            } else {
                this.f3273f++;
                if (this.f3273f == this.f3274g) {
                    this.f3275h = this.f3276i;
                } else {
                    this.f3275h = (1 << this.f3273f) - 1;
                }
            }
        }
        if (i == this.f3284q) {
            while (this.f3286s > 0) {
                m2959a((byte) (this.f3285r & 255), outputStream);
                this.f3285r >>= 8;
                this.f3286s -= 8;
            }
            m2961a(outputStream);
        }
    }

    final void m2963a(int i, OutputStream outputStream) {
        int i2;
        int i3 = 0;
        this.f3282o = i;
        this.f3281n = false;
        this.f3273f = this.f3282o;
        this.f3275h = (1 << this.f3273f) - 1;
        this.f3283p = 1 << (i - 1);
        this.f3284q = this.f3283p + 1;
        this.f3280m = this.f3283p + 2;
        this.f3288u = 0;
        int a = m2958a();
        for (i2 = this.f3279l; i2 < 65536; i2 *= 2) {
            i3++;
        }
        int i4 = 8 - i3;
        int i5 = this.f3279l;
        m2960a(i5);
        m2962b(this.f3283p, outputStream);
        while (true) {
            i3 = m2958a();
            if (i3 != -1) {
                int i6 = (i3 << this.f3274g) + a;
                i2 = (i3 << i4) ^ a;
                if (this.f3277j[i2] == i6) {
                    a = this.f3278k[i2];
                } else if (this.f3277j[i2] >= 0) {
                    r3 = i5 - i2;
                    if (i2 == 0) {
                        r3 = 1;
                    }
                    do {
                        i2 -= r3;
                        if (i2 < 0) {
                            i2 += i5;
                        }
                        if (this.f3277j[i2] == i6) {
                            a = this.f3278k[i2];
                            break;
                        }
                    } while (this.f3277j[i2] >= 0);
                    m2962b(a, outputStream);
                    if (this.f3280m >= this.f3276i) {
                        r0 = this.f3278k;
                        r3 = this.f3280m;
                        this.f3280m = r3 + 1;
                        r0[i2] = r3;
                        this.f3277j[i2] = i6;
                        a = i3;
                    } else {
                        m2960a(this.f3279l);
                        this.f3280m = this.f3283p + 2;
                        this.f3281n = true;
                        m2962b(this.f3283p, outputStream);
                        a = i3;
                    }
                } else {
                    m2962b(a, outputStream);
                    if (this.f3280m >= this.f3276i) {
                        m2960a(this.f3279l);
                        this.f3280m = this.f3283p + 2;
                        this.f3281n = true;
                        m2962b(this.f3283p, outputStream);
                        a = i3;
                    } else {
                        r0 = this.f3278k;
                        r3 = this.f3280m;
                        this.f3280m = r3 + 1;
                        r0[i2] = r3;
                        this.f3277j[i2] = i6;
                        a = i3;
                    }
                }
            } else {
                m2962b(a, outputStream);
                m2962b(this.f3284q, outputStream);
                return;
            }
        }
    }
}
