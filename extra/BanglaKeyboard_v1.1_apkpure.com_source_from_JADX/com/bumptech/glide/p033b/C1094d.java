package com.bumptech.glide.p033b;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public final class C1094d {
    public ByteBuffer f3240a;
    public C1093c f3241b;
    private final byte[] f3242c = new byte[256];
    private int f3243d = 0;

    private int[] m2940a(int i) {
        int i2 = 0;
        int[] iArr = null;
        byte[] bArr = new byte[(i * 3)];
        try {
            this.f3240a.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            while (i3 < i) {
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                int i6 = i4 + 1;
                int i7 = bArr[i4] & 255;
                i2 = i6 + 1;
                i4 = i3 + 1;
                iArr[i3] = (((i5 << 16) | -16777216) | (i7 << 8)) | (bArr[i6] & 255);
                i3 = i4;
            }
        } catch (BufferUnderflowException e) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f3241b.f3228b = 1;
        }
        return iArr;
    }

    private void m2941b() {
        int i = 0;
        while (i == 0 && !m2947h()) {
            int g;
            switch (m2946g()) {
                case 33:
                    switch (m2946g()) {
                        case 1:
                            m2944e();
                            break;
                        case 249:
                            this.f3241b.f3230d = new C1092b();
                            m2946g();
                            g = m2946g();
                            this.f3241b.f3230d.f3222g = (g & 28) >> 2;
                            if (this.f3241b.f3230d.f3222g == 0) {
                                this.f3241b.f3230d.f3222g = 1;
                            }
                            this.f3241b.f3230d.f3221f = (g & 1) != 0;
                            g = this.f3240a.getShort();
                            if (g < 3) {
                                g = 10;
                            }
                            this.f3241b.f3230d.f3224i = g * 10;
                            this.f3241b.f3230d.f3223h = m2946g();
                            m2946g();
                            break;
                        case 254:
                            m2944e();
                            break;
                        case 255:
                            m2945f();
                            String str = "";
                            for (g = 0; g < 11; g++) {
                                str = str + ((char) this.f3242c[g]);
                            }
                            if (!str.equals("NETSCAPE2.0")) {
                                m2944e();
                                break;
                            } else {
                                m2942c();
                                break;
                            }
                        default:
                            m2944e();
                            break;
                    }
                case 44:
                    if (this.f3241b.f3230d == null) {
                        this.f3241b.f3230d = new C1092b();
                    }
                    this.f3241b.f3230d.f3216a = this.f3240a.getShort();
                    this.f3241b.f3230d.f3217b = this.f3240a.getShort();
                    this.f3241b.f3230d.f3218c = this.f3240a.getShort();
                    this.f3241b.f3230d.f3219d = this.f3240a.getShort();
                    int g2 = m2946g();
                    g = (g2 & 128) != 0 ? 1 : 0;
                    int pow = (int) Math.pow(2.0d, (double) ((g2 & 7) + 1));
                    this.f3241b.f3230d.f3220e = (g2 & 64) != 0;
                    if (g != 0) {
                        this.f3241b.f3230d.f3226k = m2940a(pow);
                    } else {
                        this.f3241b.f3230d.f3226k = null;
                    }
                    this.f3241b.f3230d.f3225j = this.f3240a.position();
                    m2946g();
                    m2944e();
                    if (!m2947h()) {
                        C1093c c1093c = this.f3241b;
                        c1093c.f3229c++;
                        this.f3241b.f3231e.add(this.f3241b.f3230d);
                        break;
                    }
                    break;
                case 59:
                    i = 1;
                    break;
                default:
                    this.f3241b.f3228b = 1;
                    break;
            }
        }
    }

    private void m2942c() {
        do {
            m2945f();
            if (this.f3242c[0] == (byte) 1) {
                this.f3241b.f3239m = (this.f3242c[1] & 255) | ((this.f3242c[2] & 255) << 8);
            }
            if (this.f3243d <= 0) {
                return;
            }
        } while (!m2947h());
    }

    private void m2943d() {
        int i;
        boolean z = true;
        String str = "";
        for (i = 0; i < 6; i++) {
            str = str + ((char) m2946g());
        }
        if (str.startsWith("GIF")) {
            this.f3241b.f3232f = this.f3240a.getShort();
            this.f3241b.f3233g = this.f3240a.getShort();
            i = m2946g();
            C1093c c1093c = this.f3241b;
            if ((i & 128) == 0) {
                z = false;
            }
            c1093c.f3234h = z;
            this.f3241b.f3235i = 2 << (i & 7);
            this.f3241b.f3236j = m2946g();
            this.f3241b.f3237k = m2946g();
            if (this.f3241b.f3234h && !m2947h()) {
                this.f3241b.f3227a = m2940a(this.f3241b.f3235i);
                this.f3241b.f3238l = this.f3241b.f3227a[this.f3241b.f3236j];
                return;
            }
            return;
        }
        this.f3241b.f3228b = 1;
    }

    private void m2944e() {
        int g;
        do {
            g = m2946g();
            this.f3240a.position(this.f3240a.position() + g);
        } while (g > 0);
    }

    private int m2945f() {
        int i = 0;
        this.f3243d = m2946g();
        if (this.f3243d > 0) {
            int i2 = 0;
            while (i < this.f3243d) {
                try {
                    i2 = this.f3243d - i;
                    this.f3240a.get(this.f3242c, i, i2);
                    i += i2;
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        new StringBuilder("Error Reading Block n: ").append(i).append(" count: ").append(i2).append(" blockSize: ").append(this.f3243d);
                    }
                    this.f3241b.f3228b = 1;
                }
            }
        }
        return i;
    }

    private int m2946g() {
        int i = 0;
        try {
            return this.f3240a.get() & 255;
        } catch (Exception e) {
            this.f3241b.f3228b = 1;
            return i;
        }
    }

    private boolean m2947h() {
        return this.f3241b.f3228b != 0;
    }

    public final C1093c m2948a() {
        if (this.f3240a == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m2947h()) {
            return this.f3241b;
        } else {
            m2943d();
            if (!m2947h()) {
                m2941b();
                if (this.f3241b.f3229c < 0) {
                    this.f3241b.f3228b = 1;
                }
            }
            return this.f3241b;
        }
    }

    public final C1094d m2949a(byte[] bArr) {
        this.f3240a = null;
        Arrays.fill(this.f3242c, (byte) 0);
        this.f3241b = new C1093c();
        this.f3243d = 0;
        if (bArr != null) {
            this.f3240a = ByteBuffer.wrap(bArr);
            this.f3240a.rewind();
            this.f3240a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f3240a = null;
            this.f3241b.f3228b = 2;
        }
        return this;
    }
}
