package com.google.android.gms.internal;

public final class us {
    final byte[] f7223a;
    int f7224b;
    private int f7225c;
    private int f7226d;
    private int f7227e;
    private int f7228f;
    private int f7229g = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private int f7230h;
    private int f7231i = 64;
    private int f7232j = 67108864;

    us(byte[] bArr, int i) {
        this.f7223a = bArr;
        this.f7224b = 0;
        this.f7225c = i + 0;
        this.f7227e = 0;
    }

    private final void m6751f(int i) {
        if (i < 0) {
            throw va.m6807b();
        } else if (this.f7227e + i > this.f7229g) {
            m6751f(this.f7229g - this.f7227e);
            throw va.m6806a();
        } else if (i <= this.f7225c - this.f7227e) {
            this.f7227e += i;
        } else {
            throw va.m6806a();
        }
    }

    private final void m6752i() {
        this.f7225c += this.f7226d;
        int i = this.f7225c;
        if (i > this.f7229g) {
            this.f7226d = i - this.f7229g;
            this.f7225c -= this.f7226d;
            return;
        }
        this.f7226d = 0;
    }

    private final byte m6753j() {
        if (this.f7227e == this.f7225c) {
            throw va.m6806a();
        }
        byte[] bArr = this.f7223a;
        int i = this.f7227e;
        this.f7227e = i + 1;
        return bArr[i];
    }

    public final int m6754a() {
        if (this.f7227e == this.f7225c) {
            this.f7228f = 0;
            return 0;
        }
        this.f7228f = m6764e();
        if (this.f7228f != 0) {
            return this.f7228f;
        }
        throw new va("Protocol message contained an invalid tag (zero).");
    }

    public final void m6755a(int i) {
        if (this.f7228f != i) {
            throw new va("Protocol message end-group tag did not match expected tag.");
        }
    }

    final void m6756a(int i, int i2) {
        if (i > this.f7227e - this.f7224b) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.f7227e - this.f7224b));
        } else if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        } else {
            this.f7227e = this.f7224b + i;
            this.f7228f = i2;
        }
    }

    public final void m6757a(vb vbVar) {
        int e = m6764e();
        if (this.f7230h >= this.f7231i) {
            throw va.m6809d();
        }
        e = m6760c(e);
        this.f7230h++;
        vbVar.mo2198a(this);
        m6755a(0);
        this.f7230h--;
        m6762d(e);
    }

    public final boolean m6758b() {
        return m6764e() != 0;
    }

    public final boolean m6759b(int i) {
        switch (i & 7) {
            case 0:
                m6764e();
                return true;
            case 1:
                m6753j();
                m6753j();
                m6753j();
                m6753j();
                m6753j();
                m6753j();
                m6753j();
                m6753j();
                return true;
            case 2:
                m6751f(m6764e());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m6753j();
                m6753j();
                m6753j();
                m6753j();
                return true;
            default:
                throw new va("Protocol message tag had invalid wire type.");
        }
        int a;
        do {
            a = m6754a();
            if (a != 0) {
            }
            m6755a(((i >>> 3) << 3) | 4);
            return true;
        } while (m6759b(a));
        m6755a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int m6760c(int i) {
        if (i < 0) {
            throw va.m6807b();
        }
        int i2 = this.f7227e + i;
        int i3 = this.f7229g;
        if (i2 > i3) {
            throw va.m6806a();
        }
        this.f7229g = i2;
        m6752i();
        return i3;
    }

    public final String m6761c() {
        int e = m6764e();
        if (e < 0) {
            throw va.m6807b();
        } else if (e > this.f7225c - this.f7227e) {
            throw va.m6806a();
        } else {
            String str = new String(this.f7223a, this.f7227e, e, uz.f7246a);
            this.f7227e = e + this.f7227e;
            return str;
        }
    }

    public final void m6762d(int i) {
        this.f7229g = i;
        m6752i();
    }

    public final byte[] m6763d() {
        int e = m6764e();
        if (e < 0) {
            throw va.m6807b();
        } else if (e == 0) {
            return ve.f7257g;
        } else {
            if (e > this.f7225c - this.f7227e) {
                throw va.m6806a();
            }
            Object obj = new byte[e];
            System.arraycopy(this.f7223a, this.f7227e, obj, 0, e);
            this.f7227e = e + this.f7227e;
            return obj;
        }
    }

    public final int m6764e() {
        byte j = m6753j();
        if (j >= (byte) 0) {
            return j;
        }
        int i = j & 127;
        byte j2 = m6753j();
        if (j2 >= (byte) 0) {
            return i | (j2 << 7);
        }
        i |= (j2 & 127) << 7;
        j2 = m6753j();
        if (j2 >= (byte) 0) {
            return i | (j2 << 14);
        }
        i |= (j2 & 127) << 14;
        j2 = m6753j();
        if (j2 >= (byte) 0) {
            return i | (j2 << 21);
        }
        i |= (j2 & 127) << 21;
        j2 = m6753j();
        i |= j2 << 28;
        if (j2 >= (byte) 0) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (m6753j() >= (byte) 0) {
                return i;
            }
        }
        throw va.m6808c();
    }

    public final void m6765e(int i) {
        m6756a(i, this.f7228f);
    }

    public final long m6766f() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte j2 = m6753j();
            j |= ((long) (j2 & 127)) << i;
            if ((j2 & 128) == 0) {
                return j;
            }
        }
        throw va.m6808c();
    }

    public final int m6767g() {
        if (this.f7229g == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return -1;
        }
        return this.f7229g - this.f7227e;
    }

    public final int m6768h() {
        return this.f7227e - this.f7224b;
    }
}
