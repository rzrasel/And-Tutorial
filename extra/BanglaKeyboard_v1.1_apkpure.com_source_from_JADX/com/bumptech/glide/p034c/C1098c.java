package com.bumptech.glide.p034c;

import android.support.v7.widget.RecyclerView.ItemAnimator;

final class C1098c {
    protected int f3291a;
    protected byte[] f3292b;
    protected int f3293c;
    protected int f3294d;
    protected int[][] f3295e;
    protected int[] f3296f = new int[256];
    protected int[] f3297g = new int[256];
    protected int[] f3298h = new int[256];
    protected int[] f3299i = new int[32];

    public C1098c(byte[] bArr, int i, int i2) {
        this.f3292b = bArr;
        this.f3293c = i;
        this.f3294d = i2;
        this.f3295e = new int[256][];
        for (int i3 = 0; i3 < 256; i3++) {
            this.f3295e[i3] = new int[4];
            int[] iArr = this.f3295e[i3];
            int i4 = (i3 << 12) / 256;
            iArr[2] = i4;
            iArr[1] = i4;
            iArr[0] = i4;
            this.f3298h[i3] = 256;
            this.f3297g[i3] = 0;
        }
    }

    public final int m2964a(int i, int i2, int i3) {
        int i4 = this.f3296f[i2];
        int i5 = -1;
        int i6 = 1000;
        int i7 = i4 - 1;
        int i8 = i4;
        while (true) {
            if (i8 >= 256 && i7 < 0) {
                return i5;
            }
            int[] iArr;
            int i9;
            if (i8 < 256) {
                iArr = this.f3295e[i8];
                i9 = iArr[1] - i2;
                if (i9 >= i6) {
                    i8 = i6;
                    i4 = 256;
                    i6 = i5;
                } else {
                    i4 = i8 + 1;
                    if (i9 < 0) {
                        i9 = -i9;
                    }
                    i8 = iArr[0] - i;
                    if (i8 < 0) {
                        i8 = -i8;
                    }
                    i8 += i9;
                    if (i8 < i6) {
                        i9 = iArr[2] - i3;
                        if (i9 < 0) {
                            i9 = -i9;
                        }
                        i8 += i9;
                        if (i8 < i6) {
                            i6 = iArr[3];
                        }
                    }
                    i8 = i6;
                    i6 = i5;
                }
            } else {
                i4 = i8;
                i8 = i6;
                i6 = i5;
            }
            if (i7 >= 0) {
                iArr = this.f3295e[i7];
                i9 = i2 - iArr[1];
                if (i9 >= i8) {
                    i5 = i6;
                    i7 = -1;
                    i6 = i8;
                    i8 = i4;
                } else {
                    i7--;
                    if (i9 < 0) {
                        i9 = -i9;
                    }
                    i5 = iArr[0] - i;
                    if (i5 < 0) {
                        i5 = -i5;
                    }
                    i5 += i9;
                    if (i5 < i8) {
                        i9 = iArr[2] - i3;
                        if (i9 < 0) {
                            i9 = -i9;
                        }
                        i9 += i5;
                        if (i9 < i8) {
                            i5 = iArr[3];
                            i8 = i4;
                            i6 = i9;
                        }
                    }
                }
            }
            i5 = i6;
            i6 = i8;
            i8 = i4;
        }
    }

    public final byte[] m2965a() {
        int i;
        byte[] bArr = new byte[768];
        int[] iArr = new int[256];
        for (i = 0; i < 256; i++) {
            iArr[this.f3295e[i][3]] = i;
        }
        int i2 = 0;
        for (i = 0; i < 256; i++) {
            int i3 = iArr[i];
            int i4 = i2 + 1;
            bArr[i2] = (byte) this.f3295e[i3][0];
            int i5 = i4 + 1;
            bArr[i4] = (byte) this.f3295e[i3][1];
            i2 = i5 + 1;
            bArr[i5] = (byte) this.f3295e[i3][2];
        }
        return bArr;
    }

    public final void m2966b() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < 256) {
            int[] iArr = this.f3295e[i3];
            int i4 = iArr[1];
            int i5 = i3;
            for (int i6 = i3 + 1; i6 < 256; i6++) {
                int[] iArr2 = this.f3295e[i6];
                if (iArr2[1] < i4) {
                    i4 = iArr2[1];
                    i5 = i6;
                }
            }
            int[] iArr3 = this.f3295e[i5];
            if (i3 != i5) {
                i5 = iArr3[0];
                iArr3[0] = iArr[0];
                iArr[0] = i5;
                i5 = iArr3[1];
                iArr3[1] = iArr[1];
                iArr[1] = i5;
                i5 = iArr3[2];
                iArr3[2] = iArr[2];
                iArr[2] = i5;
                i5 = iArr3[3];
                iArr3[3] = iArr[3];
                iArr[3] = i5;
            }
            if (i4 != i2) {
                this.f3296f[i2] = (i + i3) >> 1;
                for (i5 = i2 + 1; i5 < i4; i5++) {
                    this.f3296f[i5] = i3;
                }
                i5 = i4;
                i4 = i3;
            } else {
                i4 = i;
                i5 = i2;
            }
            i3++;
            i = i4;
            i2 = i5;
        }
        this.f3296f[i2] = (i + 255) >> 1;
        for (i4 = i2 + 1; i4 < 256; i4++) {
            this.f3296f[i4] = 255;
        }
    }

    public final void m2967c() {
        int i;
        if (this.f3293c < 1509) {
            this.f3294d = 1;
        }
        this.f3291a = ((this.f3294d - 1) / 3) + 30;
        byte[] bArr = this.f3292b;
        int i2 = this.f3293c;
        int i3 = this.f3293c / (this.f3294d * 3);
        int i4 = i3 / 100;
        for (i = 0; i < 32; i++) {
            this.f3299i[i] = (((1024 - (i * i)) * 256) / 1024) * 1024;
        }
        i = this.f3293c < 1509 ? 3 : this.f3293c % 499 != 0 ? 1497 : this.f3293c % 491 != 0 ? 1473 : this.f3293c % 487 != 0 ? 1461 : 1509;
        int i5 = 0;
        int i6 = i4;
        int i7 = 1024;
        int i8 = 32;
        int i9 = ItemAnimator.FLAG_MOVED;
        int i10 = 0;
        while (i10 < i3) {
            int i11 = (bArr[i5 + 0] & 255) << 4;
            int i12 = (bArr[i5 + 1] & 255) << 4;
            int i13 = (bArr[i5 + 2] & 255) << 4;
            int i14 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i15 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i16 = -1;
            int i17 = -1;
            int i18 = 0;
            while (i18 < 256) {
                int[] iArr = this.f3295e[i18];
                i4 = iArr[0] - i11;
                if (i4 < 0) {
                    i4 = -i4;
                }
                int i19 = iArr[1] - i12;
                if (i19 < 0) {
                    i19 = -i19;
                }
                i19 += i4;
                i4 = iArr[2] - i13;
                if (i4 < 0) {
                    i4 = -i4;
                }
                i19 += i4;
                if (i19 < i14) {
                    i4 = i19;
                    i14 = i18;
                } else {
                    i4 = i14;
                    i14 = i16;
                }
                i19 -= this.f3297g[i18] >> 12;
                if (i19 < i15) {
                    i16 = i18;
                } else {
                    i19 = i15;
                    i16 = i17;
                }
                i15 = this.f3298h[i18] >> 10;
                int[] iArr2 = this.f3298h;
                iArr2[i18] = iArr2[i18] - i15;
                iArr2 = this.f3297g;
                iArr2[i18] = (i15 << 10) + iArr2[i18];
                i18++;
                i15 = i19;
                i17 = i16;
                i16 = i14;
                i14 = i4;
            }
            int[] iArr3 = this.f3298h;
            iArr3[i16] = iArr3[i16] + 64;
            iArr3 = this.f3297g;
            iArr3[i16] = iArr3[i16] - 65536;
            iArr3 = this.f3295e[i17];
            iArr3[0] = iArr3[0] - (((iArr3[0] - i11) * i7) / 1024);
            iArr3[1] = iArr3[1] - (((iArr3[1] - i12) * i7) / 1024);
            iArr3[2] = iArr3[2] - (((iArr3[2] - i13) * i7) / 1024);
            if (i8 != 0) {
                i4 = i17 - i8;
                i15 = i4 < -1 ? -1 : i4;
                i4 = i17 + i8;
                if (i4 > 256) {
                    i4 = 256;
                }
                i19 = 1;
                i16 = i17 + 1;
                i18 = i17 - 1;
                while (true) {
                    if (i16 >= i4 && i18 <= i15) {
                        break;
                    }
                    i14 = i19 + 1;
                    i17 = this.f3299i[i19];
                    if (i16 < i4) {
                        i19 = i16 + 1;
                        int[] iArr4 = this.f3295e[i16];
                        try {
                            iArr4[0] = iArr4[0] - (((iArr4[0] - i11) * i17) / 262144);
                            iArr4[1] = iArr4[1] - (((iArr4[1] - i12) * i17) / 262144);
                            iArr4[2] = iArr4[2] - (((iArr4[2] - i13) * i17) / 262144);
                            i16 = i19;
                        } catch (Exception e) {
                            i16 = i19;
                        }
                    }
                    if (i18 > i15) {
                        i19 = i18 - 1;
                        int[] iArr5 = this.f3295e[i18];
                        try {
                            iArr5[0] = iArr5[0] - (((iArr5[0] - i11) * i17) / 262144);
                            iArr5[1] = iArr5[1] - (((iArr5[1] - i12) * i17) / 262144);
                            iArr5[2] = iArr5[2] - ((i17 * (iArr5[2] - i13)) / 262144);
                            i18 = i19;
                            i19 = i14;
                        } catch (Exception e2) {
                            i18 = i19;
                            i19 = i14;
                        }
                    } else {
                        i19 = i14;
                    }
                }
            }
            i4 = i5 + i;
            i18 = i4 >= i2 ? i4 - this.f3293c : i4;
            i17 = i10 + 1;
            i4 = i6 == 0 ? 1 : i6;
            if (i17 % i4 == 0) {
                i16 = i7 - (i7 / this.f3291a);
                i15 = i9 - (i9 / 30);
                i19 = i15 >> 6;
                if (i19 <= 1) {
                    i19 = 0;
                }
                for (i14 = 0; i14 < i19; i14++) {
                    this.f3299i[i14] = ((((i19 * i19) - (i14 * i14)) * 256) / (i19 * i19)) * i16;
                }
                i5 = i18;
                i6 = i4;
                i7 = i16;
                i8 = i19;
                i9 = i15;
                i10 = i17;
            } else {
                i5 = i18;
                i6 = i4;
                i10 = i17;
            }
        }
    }

    public final void m2968d() {
        for (int i = 0; i < 256; i++) {
            int[] iArr = this.f3295e[i];
            iArr[0] = iArr[0] >> 4;
            iArr = this.f3295e[i];
            iArr[1] = iArr[1] >> 4;
            iArr = this.f3295e[i];
            iArr[2] = iArr[2] >> 4;
            this.f3295e[i][3] = i;
        }
    }
}
