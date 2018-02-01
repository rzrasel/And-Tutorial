package com.google.android.gms.internal;

import java.util.Arrays;

final class sj extends si {
    private final byte[] f7082c;
    private final boolean f7083d;
    private int f7084e;
    private int f7085f;
    private int f7086g;
    private int f7087h;
    private int f7088i;
    private int f7089j;

    private sj(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f7089j = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f7082c = bArr;
        this.f7084e = i + i2;
        this.f7086g = i;
        this.f7087h = this.f7086g;
        this.f7083d = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m6567i() {
        /*
        r5 = this;
        r0 = r5.f7086g;
        r1 = r5.f7084e;
        if (r1 == r0) goto L_0x006c;
    L_0x0006:
        r3 = r5.f7082c;
        r2 = r0 + 1;
        r0 = r3[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.f7086g = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r5.f7084e;
        r1 = r1 - r2;
        r4 = 9;
        if (r1 < r4) goto L_0x006c;
    L_0x0018:
        r1 = r2 + 1;
        r2 = r3[r2];
        r2 = r2 << 7;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x0026;
    L_0x0021:
        r0 = r0 ^ -128;
    L_0x0023:
        r5.f7086g = r1;
        goto L_0x0010;
    L_0x0026:
        r2 = r1 + 1;
        r1 = r3[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x0033;
    L_0x002f:
        r0 = r0 ^ 16256;
        r1 = r2;
        goto L_0x0023;
    L_0x0033:
        r1 = r2 + 1;
        r2 = r3[r2];
        r2 = r2 << 21;
        r0 = r0 ^ r2;
        if (r0 >= 0) goto L_0x0041;
    L_0x003c:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x0023;
    L_0x0041:
        r2 = r1 + 1;
        r1 = r3[r1];
        r4 = r1 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r1 >= 0) goto L_0x0072;
    L_0x004e:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x0023;
    L_0x0054:
        r2 = r1 + 1;
        r1 = r3[r1];
        if (r1 >= 0) goto L_0x0072;
    L_0x005a:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x0023;
    L_0x0060:
        r2 = r1 + 1;
        r1 = r3[r1];
        if (r1 >= 0) goto L_0x0072;
    L_0x0066:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x0023;
    L_0x006c:
        r0 = r5.mo2259f();
        r0 = (int) r0;
        goto L_0x0010;
    L_0x0072:
        r1 = r2;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.sj.i():int");
    }

    private final void m6568j() {
        this.f7084e += this.f7085f;
        int i = this.f7084e - this.f7087h;
        if (i > this.f7089j) {
            this.f7085f = i - this.f7089j;
            this.f7084e -= this.f7085f;
            return;
        }
        this.f7085f = 0;
    }

    private final byte m6569k() {
        if (this.f7086g == this.f7084e) {
            throw tf.m6657a();
        }
        byte[] bArr = this.f7082c;
        int i = this.f7086g;
        this.f7086g = i + 1;
        return bArr[i];
    }

    public final int mo2248a() {
        if (mo2260g()) {
            this.f7088i = 0;
            return 0;
        }
        this.f7088i = m6567i();
        if ((this.f7088i >>> 3) != 0) {
            return this.f7088i;
        }
        throw new tf("Protocol message contained an invalid tag (zero).");
    }

    public final <T extends sq<T, ?>> T mo2249a(T t, sm smVar) {
        int i = m6567i();
        if (this.a >= this.b) {
            throw tf.m6660d();
        }
        i = mo2253c(i);
        this.a++;
        T a = sq.m6119a((sq) t, (si) this, smVar);
        mo2250a(0);
        this.a--;
        mo2256d(i);
        return a;
    }

    public final void mo2250a(int i) {
        if (this.f7088i != i) {
            throw new tf("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int mo2251b() {
        return m6567i();
    }

    public final boolean mo2252b(int i) {
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f7084e - this.f7086g >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f7082c;
                        int i3 = this.f7086g;
                        this.f7086g = i3 + 1;
                        if (bArr[i3] >= (byte) 0) {
                            return true;
                        }
                        i2++;
                    }
                    throw tf.m6659c();
                }
                while (i2 < 10) {
                    if (m6569k() >= (byte) 0) {
                        return true;
                    }
                    i2++;
                }
                throw tf.m6659c();
            case 1:
                mo2258e(8);
                return true;
            case 2:
                mo2258e(m6567i());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                mo2258e(4);
                return true;
            default:
                throw new tg("Protocol message tag had invalid wire type.");
        }
        do {
            i2 = mo2248a();
            if (i2 != 0) {
            }
            mo2250a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo2252b(i2));
        mo2250a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int mo2253c(int i) {
        if (i < 0) {
            throw tf.m6658b();
        }
        int h = mo2261h() + i;
        int i2 = this.f7089j;
        if (h > i2) {
            throw tf.m6657a();
        }
        this.f7089j = h;
        m6568j();
        return i2;
    }

    public final String mo2254c() {
        int i = m6567i();
        if (i <= 0 || i > this.f7084e - this.f7086g) {
            if (i == 0) {
                return "";
            }
            if (i <= 0) {
                throw tf.m6658b();
            }
            throw tf.m6657a();
        } else if (uh.m6738a(this.f7082c, this.f7086g, this.f7086g + i)) {
            int i2 = this.f7086g;
            this.f7086g += i;
            return new String(this.f7082c, i2, i, ta.f7125a);
        } else {
            throw new tf("Protocol message had invalid UTF-8.");
        }
    }

    public final ry mo2255d() {
        int i = m6567i();
        if (i > 0 && i <= this.f7084e - this.f7086g) {
            ry a = ry.m6518a(this.f7082c, this.f7086g, i);
            this.f7086g = i + this.f7086g;
            return a;
        } else if (i == 0) {
            return ry.f7068a;
        } else {
            byte[] copyOfRange;
            if (i > 0 && i <= this.f7084e - this.f7086g) {
                int i2 = this.f7086g;
                this.f7086g = i + this.f7086g;
                copyOfRange = Arrays.copyOfRange(this.f7082c, i2, this.f7086g);
            } else if (i > 0) {
                throw tf.m6657a();
            } else if (i == 0) {
                copyOfRange = ta.f7126b;
            } else {
                throw tf.m6658b();
            }
            return ry.m6519b(copyOfRange);
        }
    }

    public final void mo2256d(int i) {
        this.f7089j = i;
        m6568j();
    }

    public final int mo2257e() {
        return m6567i();
    }

    public final void mo2258e(int i) {
        if (i >= 0 && i <= this.f7084e - this.f7086g) {
            this.f7086g += i;
        } else if (i < 0) {
            throw tf.m6658b();
        } else {
            throw tf.m6657a();
        }
    }

    final long mo2259f() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte k = m6569k();
            j |= ((long) (k & 127)) << i;
            if ((k & 128) == 0) {
                return j;
            }
        }
        throw tf.m6659c();
    }

    public final boolean mo2260g() {
        return this.f7086g == this.f7084e;
    }

    public final int mo2261h() {
        return this.f7086g - this.f7087h;
    }
}
