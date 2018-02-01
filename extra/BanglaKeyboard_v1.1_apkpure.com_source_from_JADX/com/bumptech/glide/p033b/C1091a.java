package com.bumptech.glide.p033b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class C1091a {
    private static final String f3198i = C1091a.class.getSimpleName();
    private static final Config f3199j = Config.ARGB_8888;
    public ByteBuffer f3200a;
    public byte[] f3201b;
    public int[] f3202c;
    public int f3203d;
    public byte[] f3204e;
    public C1093c f3205f;
    public C1090a f3206g;
    public Bitmap f3207h;
    private int[] f3208k;
    private final int[] f3209l = new int[256];
    private final byte[] f3210m = new byte[256];
    private short[] f3211n;
    private byte[] f3212o;
    private byte[] f3213p;
    private boolean f3214q;
    private int f3215r;

    public interface C1090a {
        Bitmap mo1386a(int i, int i2, Config config);

        void mo1387a(Bitmap bitmap);
    }

    public C1091a(C1090a c1090a) {
        this.f3206g = c1090a;
        this.f3205f = new C1093c();
    }

    private Bitmap m2932a(C1092b c1092b, C1092b c1092b2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.f3205f.f3232f;
        int i7 = this.f3205f.f3233g;
        int[] iArr = this.f3202c;
        if (c1092b2 == null) {
            Arrays.fill(iArr, 0);
        }
        if (c1092b2 != null && c1092b2.f3222g > 0) {
            if (c1092b2.f3222g == 2) {
                i = 0;
                if (!c1092b.f3221f) {
                    i = this.f3205f.f3238l;
                    if (c1092b.f3226k != null && this.f3205f.f3236j == c1092b.f3223h) {
                        i = 0;
                    }
                }
                i2 = c1092b2.f3216a + (c1092b2.f3217b * i6);
                i3 = i2 + (c1092b2.f3219d * i6);
                while (i2 < i3) {
                    i4 = i2 + c1092b2.f3218c;
                    for (i5 = i2; i5 < i4; i5++) {
                        iArr[i5] = i;
                    }
                    i2 += i6;
                }
            } else if (c1092b2.f3222g == 3 && this.f3207h != null) {
                this.f3207h.getPixels(iArr, 0, i6, 0, 0, i6, i7);
            }
        }
        if (c1092b != null) {
            this.f3200a.position(c1092b.f3225j);
        }
        i = c1092b == null ? this.f3205f.f3232f * this.f3205f.f3233g : c1092b.f3218c * c1092b.f3219d;
        if (this.f3201b == null || this.f3201b.length < i) {
            this.f3201b = new byte[i];
        }
        if (this.f3211n == null) {
            this.f3211n = new short[4096];
        }
        if (this.f3212o == null) {
            this.f3212o = new byte[4096];
        }
        if (this.f3213p == null) {
            this.f3213p = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        int c = m2933c();
        int i8 = 1 << c;
        int i9 = i8 + 1;
        i3 = i8 + 2;
        int i10 = -1;
        i5 = c + 1;
        i2 = (1 << i5) - 1;
        for (i4 = 0; i4 < i8; i4++) {
            this.f3211n[i4] = (short) 0;
            this.f3212o[i4] = (byte) i4;
        }
        i4 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = i5;
        int i16 = i2;
        int i17 = i3;
        i5 = 0;
        i2 = 0;
        i3 = 0;
        while (i11 < i) {
            if (i2 == 0) {
                i2 = m2934d();
                if (i2 <= 0) {
                    this.f3215r = 3;
                    break;
                }
                i5 = 0;
            }
            i4 += (this.f3210m[i5] & 255) << i14;
            int i18 = i5 + 1;
            int i19 = i2 - 1;
            i5 = i15;
            i2 = i16;
            i15 = i13;
            int i20 = i14 + 8;
            i14 = i4;
            i4 = i3;
            i3 = i17;
            i17 = i20;
            while (i17 >= i5) {
                i13 = i14 & i2;
                i16 = i14 >> i5;
                i17 -= i5;
                if (i13 != i8) {
                    if (i13 <= i3) {
                        if (i13 == i9) {
                            i13 = i15;
                            i14 = i17;
                            i15 = i5;
                            i17 = i3;
                            i5 = i18;
                            i3 = i4;
                            i4 = i16;
                            i16 = i2;
                            i2 = i19;
                            break;
                        } else if (i10 == -1) {
                            i14 = i12 + 1;
                            this.f3213p[i12] = this.f3212o[i13];
                            i12 = i14;
                            i15 = i13;
                            i10 = i13;
                            i14 = i16;
                        } else {
                            if (i13 >= i3) {
                                i14 = i12 + 1;
                                this.f3213p[i12] = (byte) i15;
                                i12 = i14;
                                i15 = i10;
                            } else {
                                i15 = i13;
                            }
                            while (i15 >= i8) {
                                i14 = i12 + 1;
                                this.f3213p[i12] = this.f3212o[i15];
                                short s = this.f3211n[i15];
                                i12 = i14;
                            }
                            i15 = this.f3212o[i15] & 255;
                            i14 = i12 + 1;
                            this.f3213p[i12] = (byte) i15;
                            if (i3 < 4096) {
                                this.f3211n[i3] = (short) i10;
                                this.f3212o[i3] = (byte) i15;
                                i3++;
                                if ((i3 & i2) == 0 && i3 < 4096) {
                                    i5++;
                                    i2 += i3;
                                }
                            }
                            i12 = i11;
                            while (i14 > 0) {
                                i11 = i14 - 1;
                                i14 = i4 + 1;
                                this.f3201b[i4] = this.f3213p[i11];
                                i12++;
                                i4 = i14;
                                i14 = i11;
                            }
                            i11 = i12;
                            i10 = i13;
                            i12 = i14;
                            i14 = i16;
                        }
                    } else {
                        this.f3215r = 3;
                        i13 = i15;
                        i14 = i17;
                        i15 = i5;
                        i17 = i3;
                        i5 = i18;
                        i3 = i4;
                        i4 = i16;
                        i16 = i2;
                        i2 = i19;
                        break;
                    }
                }
                i5 = c + 1;
                i2 = (1 << i5) - 1;
                i3 = i8 + 2;
                i14 = i16;
                i10 = -1;
            }
            i13 = i15;
            i16 = i2;
            i2 = i19;
            i15 = i5;
            i5 = i18;
            i20 = i17;
            i17 = i3;
            i3 = i4;
            i4 = i14;
            i14 = i20;
        }
        for (i5 = i3; i5 < i; i5++) {
            this.f3201b[i5] = (byte) 0;
        }
        i3 = 1;
        i2 = 8;
        i5 = 0;
        for (i = 0; i < c1092b.f3219d; i++) {
            if (c1092b.f3220e) {
                if (i5 >= c1092b.f3219d) {
                    i3++;
                    switch (i3) {
                        case 2:
                            i5 = 4;
                            break;
                        case 3:
                            i5 = 2;
                            i2 = 4;
                            break;
                        case 4:
                            i5 = 1;
                            i2 = 2;
                            break;
                    }
                }
                i20 = i5;
                i5 += i2;
                i4 = i20;
            } else {
                i4 = i;
            }
            i4 += c1092b.f3217b;
            if (i4 < this.f3205f.f3233g) {
                i14 = this.f3205f.f3232f * i4;
                i11 = i14 + c1092b.f3216a;
                i4 = c1092b.f3218c + i11;
                if (this.f3205f.f3232f + i14 < i4) {
                    i4 = this.f3205f.f3232f + i14;
                }
                i14 = c1092b.f3218c * i;
                i12 = i11;
                while (i12 < i4) {
                    i11 = i14 + 1;
                    i14 = this.f3208k[this.f3201b[i14] & 255];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    }
                    i12++;
                    i14 = i11;
                }
            }
        }
        if (this.f3214q && (c1092b.f3222g == 0 || c1092b.f3222g == 1)) {
            if (this.f3207h == null) {
                this.f3207h = m2935e();
            }
            this.f3207h.setPixels(iArr, 0, i6, 0, 0, i6, i7);
        }
        Bitmap e = m2935e();
        e.setPixels(iArr, 0, i6, 0, 0, i6, i7);
        return e;
    }

    private int m2933c() {
        int i = 0;
        try {
            return this.f3200a.get() & 255;
        } catch (Exception e) {
            this.f3215r = 1;
            return i;
        }
    }

    private int m2934d() {
        int c = m2933c();
        int i = 0;
        if (c > 0) {
            while (i < c) {
                int i2 = c - i;
                try {
                    this.f3200a.get(this.f3210m, i, i2);
                    i += i2;
                } catch (Throwable e) {
                    Log.w(f3198i, "Error Reading Block", e);
                    this.f3215r = 1;
                }
            }
        }
        return i;
    }

    private Bitmap m2935e() {
        Bitmap a = this.f3206g.mo1386a(this.f3205f.f3232f, this.f3205f.f3233g, f3199j);
        if (a == null) {
            a = Bitmap.createBitmap(this.f3205f.f3232f, this.f3205f.f3233g, f3199j);
        }
        if (VERSION.SDK_INT >= 12) {
            a.setHasAlpha(true);
        }
        return a;
    }

    public final int m2936a(int i) {
        return (i < 0 || i >= this.f3205f.f3229c) ? -1 : ((C1092b) this.f3205f.f3231e.get(i)).f3224i;
    }

    public final void m2937a() {
        this.f3203d = (this.f3203d + 1) % this.f3205f.f3229c;
    }

    public final void m2938a(C1093c c1093c, byte[] bArr) {
        this.f3205f = c1093c;
        this.f3204e = bArr;
        this.f3215r = 0;
        this.f3203d = -1;
        this.f3200a = ByteBuffer.wrap(bArr);
        this.f3200a.rewind();
        this.f3200a.order(ByteOrder.LITTLE_ENDIAN);
        this.f3214q = false;
        for (C1092b c1092b : c1093c.f3231e) {
            if (c1092b.f3222g == 3) {
                this.f3214q = true;
                break;
            }
        }
        this.f3201b = new byte[(c1093c.f3232f * c1093c.f3233g)];
        this.f3202c = new int[(c1093c.f3232f * c1093c.f3233g)];
    }

    public final synchronized Bitmap m2939b() {
        Bitmap bitmap;
        if (this.f3205f.f3229c <= 0 || this.f3203d < 0) {
            if (Log.isLoggable(f3198i, 3)) {
                new StringBuilder("unable to decode frame, frameCount=").append(this.f3205f.f3229c).append(" framePointer=").append(this.f3203d);
            }
            this.f3215r = 1;
        }
        if (this.f3215r == 1 || this.f3215r == 2) {
            if (Log.isLoggable(f3198i, 3)) {
                new StringBuilder("Unable to decode frame, status=").append(this.f3215r);
            }
            bitmap = null;
        } else {
            this.f3215r = 0;
            C1092b c1092b = (C1092b) this.f3205f.f3231e.get(this.f3203d);
            int i = this.f3203d - 1;
            C1092b c1092b2 = i >= 0 ? (C1092b) this.f3205f.f3231e.get(i) : null;
            this.f3208k = c1092b.f3226k != null ? c1092b.f3226k : this.f3205f.f3227a;
            if (this.f3208k == null) {
                Log.isLoggable(f3198i, 3);
                this.f3215r = 1;
                bitmap = null;
            } else {
                if (c1092b.f3221f) {
                    System.arraycopy(this.f3208k, 0, this.f3209l, 0, this.f3208k.length);
                    this.f3208k = this.f3209l;
                    this.f3208k[c1092b.f3223h] = 0;
                }
                bitmap = m2932a(c1092b, c1092b2);
            }
        }
        return bitmap;
    }
}
