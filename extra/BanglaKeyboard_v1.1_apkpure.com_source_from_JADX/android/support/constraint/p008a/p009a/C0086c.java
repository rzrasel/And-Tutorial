package android.support.constraint.p008a.p009a;

import android.support.constraint.p008a.C0093b;
import android.support.constraint.p008a.C0095d;
import android.support.constraint.p008a.C0096e;
import android.support.constraint.p008a.C0101g;
import android.support.constraint.p008a.p009a.C0081a.C0079b;
import android.support.constraint.p008a.p009a.C0081a.C0080c;
import android.support.constraint.p008a.p009a.C0084b.C0083a;
import android.support.constraint.p008a.p009a.C0091f.C0090a;
import java.util.ArrayList;
import java.util.Arrays;

public final class C0086c extends C0085g {
    static boolean ah = true;
    protected C0096e af = new C0096e();
    protected C0096e ag = null;
    int ai;
    int aj;
    int ak;
    int al;
    int am;
    int an;
    public int ao = 2;
    public boolean ap = false;
    public boolean aq = false;
    private C0091f as;
    private int at = 0;
    private int au = 0;
    private C0084b[] av = new C0084b[4];
    private C0084b[] aw = new C0084b[4];
    private C0084b[] ax = new C0084b[4];
    private boolean[] ay = new boolean[3];
    private C0084b[] az = new C0084b[4];

    private int m152a(C0096e c0096e, C0084b[] c0084bArr, C0084b c0084b, int i, boolean[] zArr) {
        int i2;
        zArr[0] = true;
        zArr[1] = false;
        c0084bArr[0] = null;
        c0084bArr[2] = null;
        c0084bArr[1] = null;
        c0084bArr[3] = null;
        boolean z;
        C0084b c0084b2;
        C0084b c0084b3;
        C0084b c0084b4;
        C0084b c0084b5;
        C0084b c0084b6;
        int i3;
        if (i == 0) {
            z = c0084b.f341i.f293c == null || c0084b.f341i.f293c.f291a == this;
            c0084b.ad = null;
            c0084b2 = null;
            if (c0084b.f318L != 8) {
                c0084b2 = c0084b;
            }
            c0084b3 = null;
            i2 = 0;
            c0084b4 = c0084b;
            c0084b5 = c0084b2;
            while (c0084b4.f343k.f293c != null) {
                c0084b4.ad = null;
                if (c0084b4.f318L != 8) {
                    c0084b6 = c0084b5 == null ? c0084b4 : c0084b5;
                    if (!(c0084b2 == null || c0084b2 == c0084b4)) {
                        c0084b2.ad = c0084b4;
                    }
                    c0084b5 = c0084b4;
                } else {
                    c0096e.m211c(c0084b4.f341i.f299i, c0084b4.f341i.f293c.f299i, 0, 5);
                    c0096e.m211c(c0084b4.f343k.f299i, c0084b4.f341i.f299i, 0, 5);
                    c0084b6 = c0084b5;
                    c0084b5 = c0084b2;
                }
                if (c0084b4.f318L != 8 && c0084b4.f315I == C0083a.f304c) {
                    if (c0084b4.f316J == C0083a.f304c) {
                        zArr[0] = false;
                    }
                    if (c0084b4.f353u <= 0.0f) {
                        zArr[0] = false;
                        if (i2 + 1 >= this.av.length) {
                            this.av = (C0084b[]) Arrays.copyOf(this.av, this.av.length * 2);
                        }
                        i3 = i2 + 1;
                        this.av[i2] = c0084b4;
                        i2 = i3;
                    }
                }
                if (c0084b4.f343k.f293c.f291a.f341i.f293c == null || c0084b4.f343k.f293c.f291a.f341i.f293c.f291a != c0084b4 || c0084b4.f343k.f293c.f291a == c0084b4) {
                    break;
                }
                c0084b2 = c0084b4.f343k.f293c.f291a;
                c0084b3 = c0084b2;
                c0084b4 = c0084b2;
                c0084b2 = c0084b5;
                c0084b5 = c0084b6;
            }
            c0084b6 = c0084b5;
            c0084b5 = c0084b2;
            if (!(c0084b4.f343k.f293c == null || c0084b4.f343k.f293c.f291a == this)) {
                z = false;
            }
            if (c0084b.f341i.f293c == null || c0084b3.f343k.f293c == null) {
                zArr[1] = true;
            }
            c0084b.f332Z = z;
            c0084b3.ad = null;
            c0084bArr[0] = c0084b;
            c0084bArr[2] = c0084b6;
            c0084bArr[1] = c0084b3;
            c0084bArr[3] = c0084b5;
        } else {
            z = c0084b.f342j.f293c == null || c0084b.f342j.f293c.f291a == this;
            c0084b.ae = null;
            c0084b2 = null;
            if (c0084b.f318L != 8) {
                c0084b2 = c0084b;
            }
            c0084b3 = null;
            i2 = 0;
            c0084b4 = c0084b;
            c0084b5 = c0084b2;
            while (c0084b4.f344l.f293c != null) {
                c0084b4.ae = null;
                if (c0084b4.f318L != 8) {
                    c0084b6 = c0084b5 == null ? c0084b4 : c0084b5;
                    if (!(c0084b2 == null || c0084b2 == c0084b4)) {
                        c0084b2.ae = c0084b4;
                    }
                    c0084b5 = c0084b4;
                } else {
                    c0096e.m211c(c0084b4.f342j.f299i, c0084b4.f342j.f293c.f299i, 0, 5);
                    c0096e.m211c(c0084b4.f344l.f299i, c0084b4.f342j.f299i, 0, 5);
                    c0084b6 = c0084b5;
                    c0084b5 = c0084b2;
                }
                if (c0084b4.f318L != 8 && c0084b4.f316J == C0083a.f304c) {
                    if (c0084b4.f315I == C0083a.f304c) {
                        zArr[0] = false;
                    }
                    if (c0084b4.f353u <= 0.0f) {
                        zArr[0] = false;
                        if (i2 + 1 >= this.av.length) {
                            this.av = (C0084b[]) Arrays.copyOf(this.av, this.av.length * 2);
                        }
                        i3 = i2 + 1;
                        this.av[i2] = c0084b4;
                        i2 = i3;
                    }
                }
                if (c0084b4.f344l.f293c.f291a.f342j.f293c == null || c0084b4.f344l.f293c.f291a.f342j.f293c.f291a != c0084b4 || c0084b4.f344l.f293c.f291a == c0084b4) {
                    break;
                }
                c0084b2 = c0084b4.f344l.f293c.f291a;
                c0084b3 = c0084b2;
                c0084b4 = c0084b2;
                c0084b2 = c0084b5;
                c0084b5 = c0084b6;
            }
            c0084b6 = c0084b5;
            c0084b5 = c0084b2;
            if (!(c0084b4.f344l.f293c == null || c0084b4.f344l.f293c.f291a == this)) {
                z = false;
            }
            if (c0084b.f342j.f293c == null || c0084b3.f344l.f293c == null) {
                zArr[1] = true;
            }
            c0084b.aa = z;
            c0084b3.ae = null;
            c0084bArr[0] = c0084b;
            c0084bArr[2] = c0084b6;
            c0084bArr[1] = c0084b3;
            c0084bArr[3] = c0084b5;
        }
        return i2;
    }

    private void m153a(C0084b c0084b, boolean[] zArr) {
        C0084b c0084b2 = null;
        boolean z = false;
        if (c0084b.f315I == C0083a.f304c && c0084b.f316J == C0083a.f304c && c0084b.f353u > 0.0f) {
            zArr[0] = false;
            return;
        }
        boolean g = c0084b.m126g();
        if (c0084b.f315I != C0083a.f304c || c0084b.f316J == C0083a.f304c || c0084b.f353u <= 0.0f) {
            int y;
            int i;
            c0084b.f328V = true;
            boolean z2;
            if (c0084b instanceof C0088d) {
                boolean z3;
                C0088d c0088d = (C0088d) c0084b;
                if (c0088d.ai != 1) {
                    z3 = g;
                    z = g;
                } else if (c0088d.m170y() != -1) {
                    y = c0088d.m170y();
                    i = 0;
                } else if (c0088d.m171z() != -1) {
                    g = c0088d.m171z();
                    z3 = false;
                    z = g;
                } else {
                    z3 = false;
                }
                g = z3;
                z2 = z;
            } else if (!c0084b.f343k.m103d() && !c0084b.f341i.m103d()) {
                z2 = g;
                y = c0084b.m119d() + g;
            } else if (c0084b.f343k.f293c == null || c0084b.f341i.f293c == null || (c0084b.f343k.f293c != c0084b.f341i.f293c && (c0084b.f343k.f293c.f291a != c0084b.f341i.f293c.f291a || c0084b.f343k.f293c.f291a == c0084b.f350r))) {
                C0084b c0084b3;
                if (c0084b.f343k.f293c != null) {
                    c0084b3 = c0084b.f343k.f293c.f291a;
                    i = c0084b.f343k.m101b() + g;
                    if (!(c0084b3.m115b() || c0084b3.f328V)) {
                        m153a(c0084b3, zArr);
                    }
                } else {
                    c0084b3 = null;
                    i = g;
                }
                if (c0084b.f341i.f293c != null) {
                    c0084b2 = c0084b.f341i.f293c.f291a;
                    y = g + c0084b.f341i.m101b();
                    if (!(c0084b2.m115b() || c0084b2.f328V)) {
                        m153a(c0084b2, zArr);
                    }
                }
                if (!(c0084b.f343k.f293c == null || c0084b3.m115b())) {
                    if (c0084b.f343k.f293c.f292b == C0080c.RIGHT) {
                        i += c0084b3.f322P - c0084b3.m126g();
                    } else if (c0084b.f343k.f293c.f292b == C0080c.LEFT) {
                        i += c0084b3.f322P;
                    }
                    boolean z4 = c0084b3.f325S || !(c0084b3.f341i.f293c == null || c0084b3.f343k.f293c == null || c0084b3.f315I == C0083a.f304c);
                    c0084b.f325S = z4;
                    if (c0084b.f325S && (c0084b3.f341i.f293c == null || c0084b3.f341i.f293c.f291a != c0084b)) {
                        i += i - c0084b3.f322P;
                    }
                }
                if (!(c0084b.f341i.f293c == null || c0084b2.m115b())) {
                    if (c0084b.f341i.f293c.f292b == C0080c.LEFT) {
                        y += c0084b2.f321O - c0084b2.m126g();
                    } else if (c0084b.f341i.f293c.f292b == C0080c.RIGHT) {
                        y += c0084b2.f321O;
                    }
                    if (c0084b2.f324R || !(c0084b2.f341i.f293c == null || c0084b2.f343k.f293c == null || c0084b2.f315I == C0083a.f304c)) {
                        z = true;
                    }
                    c0084b.f324R = z;
                    if (c0084b.f324R && (c0084b2.f343k.f293c == null || c0084b2.f343k.f293c.f291a != c0084b)) {
                        y += y - c0084b2.f321O;
                    }
                }
            } else {
                zArr[0] = false;
                return;
            }
            if (c0084b.f318L == 8) {
                y -= c0084b.f351s;
                i -= c0084b.f351s;
            }
            c0084b.f321O = y;
            c0084b.f322P = i;
            return;
        }
        zArr[0] = false;
    }

    private void m154b(C0084b c0084b, boolean[] zArr) {
        C0084b c0084b2 = null;
        boolean z = false;
        if (c0084b.f316J != C0083a.f304c || c0084b.f315I == C0083a.f304c || c0084b.f353u <= 0.0f) {
            int y;
            int i;
            boolean h = c0084b.m128h();
            c0084b.f329W = true;
            int i2;
            if (c0084b instanceof C0088d) {
                C0088d c0088d = (C0088d) c0084b;
                if (c0088d.ai != 0) {
                    i2 = h;
                    z = h;
                } else if (c0088d.m170y() != -1) {
                    y = c0088d.m170y();
                    i = 0;
                } else {
                    i2 = c0088d.m171z() != -1 ? c0088d.m171z() : 0;
                }
                i = i2;
                boolean z2 = z;
            } else if (c0084b.f345m.f293c == null && c0084b.f342j.f293c == null && c0084b.f344l.f293c == null) {
                y = h + c0084b.m122e();
            } else if (c0084b.f344l.f293c != null && c0084b.f342j.f293c != null && (c0084b.f344l.f293c == c0084b.f342j.f293c || (c0084b.f344l.f293c.f291a == c0084b.f342j.f293c.f291a && c0084b.f344l.f293c.f291a != c0084b.f350r))) {
                zArr[0] = false;
                return;
            } else if (c0084b.f345m.m103d()) {
                r0 = c0084b.f345m.f293c.f291a;
                if (!r0.f329W) {
                    m154b(r0, zArr);
                }
                int max = Math.max((r0.f320N - r0.f352t) + h, h);
                i2 = Math.max((r0.f323Q - r0.f352t) + h, h);
                if (c0084b.f318L == 8) {
                    max -= c0084b.f352t;
                    i2 -= c0084b.f352t;
                }
                c0084b.f320N = max;
                c0084b.f323Q = i2;
                return;
            } else {
                if (c0084b.f342j.m103d()) {
                    r0 = c0084b.f342j.f293c.f291a;
                    y = c0084b.f342j.m101b() + h;
                    if (!(r0.m115b() || r0.f329W)) {
                        m154b(r0, zArr);
                    }
                } else {
                    r0 = null;
                    y = h;
                }
                if (c0084b.f344l.m103d()) {
                    c0084b2 = c0084b.f344l.f293c.f291a;
                    i = h + c0084b.f344l.m101b();
                    if (!(c0084b2.m115b() || c0084b2.f329W)) {
                        m154b(c0084b2, zArr);
                    }
                }
                if (!(c0084b.f342j.f293c == null || r0.m115b())) {
                    if (c0084b.f342j.f293c.f292b == C0080c.TOP) {
                        y += r0.f320N - r0.m128h();
                    } else if (c0084b.f342j.f293c.f292b == C0080c.BOTTOM) {
                        y += r0.f320N;
                    }
                    boolean z3 = r0.f326T || !(r0.f342j.f293c == null || r0.f342j.f293c.f291a == c0084b || r0.f344l.f293c == null || r0.f344l.f293c.f291a == c0084b || r0.f316J == C0083a.f304c);
                    c0084b.f326T = z3;
                    if (c0084b.f326T && (r0.f344l.f293c == null || r0.f344l.f293c.f291a != c0084b)) {
                        y += y - r0.f320N;
                    }
                }
                if (!(c0084b.f344l.f293c == null || c0084b2.m115b())) {
                    if (c0084b.f344l.f293c.f292b == C0080c.BOTTOM) {
                        i += c0084b2.f323Q - c0084b2.m128h();
                    } else if (c0084b.f344l.f293c.f292b == C0080c.TOP) {
                        i += c0084b2.f323Q;
                    }
                    if (c0084b2.f327U || !(c0084b2.f342j.f293c == null || c0084b2.f342j.f293c.f291a == c0084b || c0084b2.f344l.f293c == null || c0084b2.f344l.f293c.f291a == c0084b || c0084b2.f316J == C0083a.f304c)) {
                        z = true;
                    }
                    c0084b.f327U = z;
                    if (c0084b.f327U && (c0084b2.f342j.f293c == null || c0084b2.f342j.f293c.f291a != c0084b)) {
                        i += i - c0084b2.f323Q;
                    }
                }
            }
            if (c0084b.f318L == 8) {
                y -= c0084b.f352t;
                i -= c0084b.f352t;
            }
            c0084b.f320N = y;
            c0084b.f323Q = i;
            return;
        }
        zArr[0] = false;
    }

    private boolean m155b(C0096e c0096e) {
        int size;
        int i;
        C0084b c0084b;
        int i2;
        int i3;
        int f;
        Object obj;
        float y;
        Object obj2;
        mo36a(c0096e);
        int size2 = this.ar.size();
        if (this.ao == 2 || this.ao == 4) {
            size = this.ar.size();
            Object obj3 = null;
            for (i = 0; i < size; i++) {
                c0084b = (C0084b) this.ar.get(i);
                c0084b.f333a = -1;
                c0084b.f334b = -1;
                if (c0084b.f315I == C0083a.f304c || c0084b.f316J == C0083a.f304c) {
                    c0084b.f333a = 1;
                    c0084b.f334b = 1;
                }
            }
            int i4 = 0;
            int i5 = 0;
            while (obj3 == null) {
                i2 = 0;
                i3 = 0;
                int i6 = 0;
                while (i6 < size) {
                    C0101g c0101g;
                    Object obj4;
                    C0088d c0088d;
                    c0084b = (C0084b) this.ar.get(i6);
                    if (c0084b.f333a == -1) {
                        if (this.I == C0083a.f303b) {
                            c0084b.f333a = 1;
                        } else if (c0084b.f315I == C0083a.f304c) {
                            c0084b.f333a = 1;
                        } else if (this.I != C0083a.f303b && c0084b.f315I == C0083a.f305d) {
                            c0084b.f341i.f299i = c0096e.m202a(c0084b.f341i);
                            c0084b.f343k.f299i = c0096e.m202a(c0084b.f343k);
                            i = c0084b.f341i.f294d;
                            f = m124f() - c0084b.f343k.f294d;
                            c0096e.m205a(c0084b.f341i.f299i, i);
                            c0096e.m205a(c0084b.f343k.f299i, f);
                            c0084b.m118c(i, f);
                            c0084b.f333a = 2;
                        } else if (c0084b.f341i.f293c == null || c0084b.f343k.f293c == null) {
                            if (c0084b.f341i.f293c != null && c0084b.f341i.f293c.f291a == this) {
                                i = c0084b.f341i.m101b();
                                f = c0084b.m124f() + i;
                                c0084b.f341i.f299i = c0096e.m202a(c0084b.f341i);
                                c0084b.f343k.f299i = c0096e.m202a(c0084b.f343k);
                                c0096e.m205a(c0084b.f341i.f299i, i);
                                c0096e.m205a(c0084b.f343k.f299i, f);
                                c0084b.f333a = 2;
                                c0084b.m118c(i, f);
                            } else if (c0084b.f343k.f293c != null && c0084b.f343k.f293c.f291a == this) {
                                c0084b.f341i.f299i = c0096e.m202a(c0084b.f341i);
                                c0084b.f343k.f299i = c0096e.m202a(c0084b.f343k);
                                i = m124f() - c0084b.f343k.m101b();
                                f = i - c0084b.m124f();
                                c0096e.m205a(c0084b.f341i.f299i, f);
                                c0096e.m205a(c0084b.f343k.f299i, i);
                                c0084b.f333a = 2;
                                c0084b.m118c(f, i);
                            } else if (c0084b.f341i.f293c != null && c0084b.f341i.f293c.f291a.f333a == 2) {
                                c0101g = c0084b.f341i.f293c.f299i;
                                c0084b.f341i.f299i = c0096e.m202a(c0084b.f341i);
                                c0084b.f343k.f299i = c0096e.m202a(c0084b.f343k);
                                i = (int) ((c0101g.f417d + ((float) c0084b.f341i.m101b())) + 0.5f);
                                f = c0084b.m124f() + i;
                                c0096e.m205a(c0084b.f341i.f299i, i);
                                c0096e.m205a(c0084b.f343k.f299i, f);
                                c0084b.f333a = 2;
                                c0084b.m118c(i, f);
                            } else if (c0084b.f343k.f293c == null || c0084b.f343k.f293c.f291a.f333a != 2) {
                                obj = c0084b.f341i.f293c != null ? 1 : null;
                                obj4 = c0084b.f343k.f293c != null ? 1 : null;
                                if (obj == null && obj4 == null) {
                                    if (c0084b instanceof C0088d) {
                                        c0088d = (C0088d) c0084b;
                                        if (c0088d.m168w() == 1) {
                                            c0084b.f341i.f299i = c0096e.m202a(c0084b.f341i);
                                            c0084b.f343k.f299i = c0096e.m202a(c0084b.f343k);
                                            y = c0088d.m170y() != -1 ? (float) c0088d.m170y() : c0088d.m171z() != -1 ? (float) (m124f() - c0088d.m171z()) : c0088d.m169x() * ((float) m124f());
                                            i = (int) (y + 0.5f);
                                            c0096e.m205a(c0084b.f341i.f299i, i);
                                            c0096e.m205a(c0084b.f343k.f299i, i);
                                            c0084b.f333a = 2;
                                            c0084b.f334b = 2;
                                            c0084b.m118c(i, i);
                                            c0084b.m121d(0, m130i());
                                        }
                                    } else {
                                        c0084b.f341i.f299i = c0096e.m202a(c0084b.f341i);
                                        c0084b.f343k.f299i = c0096e.m202a(c0084b.f343k);
                                        i = c0084b.m119d();
                                        f = c0084b.m124f() + i;
                                        c0096e.m205a(c0084b.f341i.f299i, i);
                                        c0096e.m205a(c0084b.f343k.f299i, f);
                                        c0084b.f333a = 2;
                                    }
                                }
                            } else {
                                c0101g = c0084b.f343k.f293c.f299i;
                                c0084b.f341i.f299i = c0096e.m202a(c0084b.f341i);
                                c0084b.f343k.f299i = c0096e.m202a(c0084b.f343k);
                                i = (int) ((c0101g.f417d - ((float) c0084b.f343k.m101b())) + 0.5f);
                                f = i - c0084b.m124f();
                                c0096e.m205a(c0084b.f341i.f299i, f);
                                c0096e.m205a(c0084b.f343k.f299i, i);
                                c0084b.f333a = 2;
                                c0084b.m118c(f, i);
                            }
                        } else if (c0084b.f341i.f293c.f291a == this && c0084b.f343k.f293c.f291a == this) {
                            f = c0084b.f341i.m101b();
                            i = c0084b.f343k.m101b();
                            if (this.I == C0083a.f304c) {
                                i = m124f() - i;
                            } else {
                                f += (int) ((((float) (((m124f() - f) - i) - c0084b.m124f())) * c0084b.f313G) + 0.5f);
                                i = c0084b.m124f() + f;
                            }
                            c0084b.f341i.f299i = c0096e.m202a(c0084b.f341i);
                            c0084b.f343k.f299i = c0096e.m202a(c0084b.f343k);
                            c0096e.m205a(c0084b.f341i.f299i, f);
                            c0096e.m205a(c0084b.f343k.f299i, i);
                            c0084b.f333a = 2;
                            c0084b.m118c(f, i);
                        } else {
                            c0084b.f333a = 1;
                        }
                    }
                    if (c0084b.f334b == -1) {
                        if (this.J == C0083a.f303b) {
                            c0084b.f334b = 1;
                        } else if (c0084b.f316J == C0083a.f304c) {
                            c0084b.f334b = 1;
                        } else {
                            if (this.J != C0083a.f303b && c0084b.f316J == C0083a.f305d) {
                                c0084b.f342j.f299i = c0096e.m202a(c0084b.f342j);
                                c0084b.f344l.f299i = c0096e.m202a(c0084b.f344l);
                                i = c0084b.f342j.f294d;
                                f = m130i() - c0084b.f344l.f294d;
                                c0096e.m205a(c0084b.f342j.f299i, i);
                                c0096e.m205a(c0084b.f344l.f299i, f);
                                if (c0084b.f308A > 0 || c0084b.m116c() == 8) {
                                    c0084b.f345m.f299i = c0096e.m202a(c0084b.f345m);
                                    c0096e.m205a(c0084b.f345m.f299i, c0084b.f308A + i);
                                }
                                c0084b.m121d(i, f);
                            } else if (c0084b.f342j.f293c == null || c0084b.f344l.f293c == null) {
                                if (c0084b.f342j.f293c != null && c0084b.f342j.f293c.f291a == this) {
                                    i = c0084b.f342j.m101b();
                                    f = c0084b.m130i() + i;
                                    c0084b.f342j.f299i = c0096e.m202a(c0084b.f342j);
                                    c0084b.f344l.f299i = c0096e.m202a(c0084b.f344l);
                                    c0096e.m205a(c0084b.f342j.f299i, i);
                                    c0096e.m205a(c0084b.f344l.f299i, f);
                                    if (c0084b.f308A > 0 || c0084b.m116c() == 8) {
                                        c0084b.f345m.f299i = c0096e.m202a(c0084b.f345m);
                                        c0096e.m205a(c0084b.f345m.f299i, c0084b.f308A + i);
                                    }
                                    c0084b.f334b = 2;
                                    c0084b.m121d(i, f);
                                } else if (c0084b.f344l.f293c != null && c0084b.f344l.f293c.f291a == this) {
                                    c0084b.f342j.f299i = c0096e.m202a(c0084b.f342j);
                                    c0084b.f344l.f299i = c0096e.m202a(c0084b.f344l);
                                    i = m130i() - c0084b.f344l.m101b();
                                    f = i - c0084b.m130i();
                                    c0096e.m205a(c0084b.f342j.f299i, f);
                                    c0096e.m205a(c0084b.f344l.f299i, i);
                                    if (c0084b.f308A > 0 || c0084b.m116c() == 8) {
                                        c0084b.f345m.f299i = c0096e.m202a(c0084b.f345m);
                                        c0096e.m205a(c0084b.f345m.f299i, c0084b.f308A + f);
                                    }
                                    c0084b.f334b = 2;
                                    c0084b.m121d(f, i);
                                } else if (c0084b.f342j.f293c != null && c0084b.f342j.f293c.f291a.f334b == 2) {
                                    c0101g = c0084b.f342j.f293c.f299i;
                                    c0084b.f342j.f299i = c0096e.m202a(c0084b.f342j);
                                    c0084b.f344l.f299i = c0096e.m202a(c0084b.f344l);
                                    i = (int) ((c0101g.f417d + ((float) c0084b.f342j.m101b())) + 0.5f);
                                    f = c0084b.m130i() + i;
                                    c0096e.m205a(c0084b.f342j.f299i, i);
                                    c0096e.m205a(c0084b.f344l.f299i, f);
                                    if (c0084b.f308A > 0 || c0084b.m116c() == 8) {
                                        c0084b.f345m.f299i = c0096e.m202a(c0084b.f345m);
                                        c0096e.m205a(c0084b.f345m.f299i, c0084b.f308A + i);
                                    }
                                    c0084b.f334b = 2;
                                    c0084b.m121d(i, f);
                                } else if (c0084b.f344l.f293c != null && c0084b.f344l.f293c.f291a.f334b == 2) {
                                    c0101g = c0084b.f344l.f293c.f299i;
                                    c0084b.f342j.f299i = c0096e.m202a(c0084b.f342j);
                                    c0084b.f344l.f299i = c0096e.m202a(c0084b.f344l);
                                    i = (int) ((c0101g.f417d - ((float) c0084b.f344l.m101b())) + 0.5f);
                                    f = i - c0084b.m130i();
                                    c0096e.m205a(c0084b.f342j.f299i, f);
                                    c0096e.m205a(c0084b.f344l.f299i, i);
                                    if (c0084b.f308A > 0 || c0084b.m116c() == 8) {
                                        c0084b.f345m.f299i = c0096e.m202a(c0084b.f345m);
                                        c0096e.m205a(c0084b.f345m.f299i, c0084b.f308A + f);
                                    }
                                    c0084b.f334b = 2;
                                    c0084b.m121d(f, i);
                                } else if (c0084b.f345m.f293c == null || c0084b.f345m.f293c.f291a.f334b != 2) {
                                    obj = c0084b.f345m.f293c != null ? 1 : null;
                                    obj4 = c0084b.f342j.f293c != null ? 1 : null;
                                    Object obj5 = c0084b.f344l.f293c != null ? 1 : null;
                                    if (obj == null && obj4 == null && obj5 == null) {
                                        if (c0084b instanceof C0088d) {
                                            c0088d = (C0088d) c0084b;
                                            if (c0088d.m168w() == 0) {
                                                c0084b.f342j.f299i = c0096e.m202a(c0084b.f342j);
                                                c0084b.f344l.f299i = c0096e.m202a(c0084b.f344l);
                                                y = c0088d.m170y() != -1 ? (float) c0088d.m170y() : c0088d.m171z() != -1 ? (float) (m130i() - c0088d.m171z()) : c0088d.m169x() * ((float) m130i());
                                                i = (int) (y + 0.5f);
                                                c0096e.m205a(c0084b.f342j.f299i, i);
                                                c0096e.m205a(c0084b.f344l.f299i, i);
                                                c0084b.f334b = 2;
                                                c0084b.f333a = 2;
                                                c0084b.m121d(i, i);
                                                c0084b.m118c(0, m124f());
                                            }
                                        } else {
                                            c0084b.f342j.f299i = c0096e.m202a(c0084b.f342j);
                                            c0084b.f344l.f299i = c0096e.m202a(c0084b.f344l);
                                            i = c0084b.m122e();
                                            f = c0084b.m130i() + i;
                                            c0096e.m205a(c0084b.f342j.f299i, i);
                                            c0096e.m205a(c0084b.f344l.f299i, f);
                                            if (c0084b.f308A > 0 || c0084b.m116c() == 8) {
                                                c0084b.f345m.f299i = c0096e.m202a(c0084b.f345m);
                                                c0096e.m205a(c0084b.f345m.f299i, i + c0084b.f308A);
                                            }
                                        }
                                    }
                                } else {
                                    c0101g = c0084b.f345m.f293c.f299i;
                                    c0084b.f342j.f299i = c0096e.m202a(c0084b.f342j);
                                    c0084b.f344l.f299i = c0096e.m202a(c0084b.f344l);
                                    i = (int) ((c0101g.f417d - ((float) c0084b.f308A)) + 0.5f);
                                    f = c0084b.m130i() + i;
                                    c0096e.m205a(c0084b.f342j.f299i, i);
                                    c0096e.m205a(c0084b.f344l.f299i, f);
                                    c0084b.f345m.f299i = c0096e.m202a(c0084b.f345m);
                                    c0096e.m205a(c0084b.f345m.f299i, c0084b.f308A + i);
                                    c0084b.f334b = 2;
                                    c0084b.m121d(i, f);
                                }
                            } else if (c0084b.f342j.f293c.f291a == this && c0084b.f344l.f293c.f291a == this) {
                                f = c0084b.f342j.m101b();
                                i = c0084b.f344l.m101b();
                                if (this.J == C0083a.f304c) {
                                    i = c0084b.m130i() + f;
                                } else {
                                    f = (int) (((((float) (((m130i() - f) - i) - c0084b.m130i())) * c0084b.f314H) + ((float) f)) + 0.5f);
                                    i = c0084b.m130i() + f;
                                }
                                c0084b.f342j.f299i = c0096e.m202a(c0084b.f342j);
                                c0084b.f344l.f299i = c0096e.m202a(c0084b.f344l);
                                c0096e.m205a(c0084b.f342j.f299i, f);
                                c0096e.m205a(c0084b.f344l.f299i, i);
                                if (c0084b.f308A > 0 || c0084b.m116c() == 8) {
                                    c0084b.f345m.f299i = c0096e.m202a(c0084b.f345m);
                                    c0096e.m205a(c0084b.f345m.f299i, c0084b.f308A + f);
                                }
                                c0084b.f334b = 2;
                                c0084b.m121d(f, i);
                            } else {
                                c0084b.f334b = 1;
                            }
                            c0084b.f334b = 2;
                        }
                    }
                    i6++;
                    i3 = c0084b.f333a == -1 ? i3 + 1 : i3;
                    i2 = c0084b.f334b == -1 ? i2 + 1 : i2;
                }
                if (i2 == 0 && i3 == 0) {
                    obj3 = 1;
                    i4 = i3;
                    i5 = i2;
                } else {
                    obj2 = (i5 == i2 && i4 == i3) ? 1 : obj3;
                    i4 = i3;
                    i5 = i2;
                    obj3 = obj2;
                }
            }
            i = 0;
            f = 0;
            i2 = 0;
            while (i2 < size) {
                c0084b = (C0084b) this.ar.get(i2);
                if (c0084b.f333a == 1 || c0084b.f333a == -1) {
                    i++;
                }
                int i7 = (c0084b.f334b == 1 || c0084b.f334b == -1) ? f + 1 : f;
                i2++;
                f = i7;
            }
            obj2 = (i == 0 && f == 0) ? 1 : null;
            if (obj2 != null) {
                return false;
            }
            obj = null;
        } else {
            obj = 1;
        }
        for (f = 0; f < size2; f++) {
            c0084b = (C0084b) this.ar.get(f);
            if (c0084b instanceof C0086c) {
                i2 = c0084b.f315I;
                i3 = c0084b.f316J;
                if (i2 == C0083a.f303b) {
                    c0084b.m127g(C0083a.f302a);
                }
                if (i3 == C0083a.f303b) {
                    c0084b.m129h(C0083a.f302a);
                }
                c0084b.mo36a(c0096e);
                if (i2 == C0083a.f303b) {
                    c0084b.m127g(i2);
                }
                if (i3 == C0083a.f303b) {
                    c0084b.m129h(i3);
                }
            } else {
                if (obj != null) {
                    if (this.I != C0083a.f303b && c0084b.f315I == C0083a.f305d) {
                        c0084b.f341i.f299i = c0096e.m202a(c0084b.f341i);
                        c0084b.f343k.f299i = c0096e.m202a(c0084b.f343k);
                        i2 = c0084b.f341i.f294d;
                        i3 = m124f() - c0084b.f343k.f294d;
                        c0096e.m205a(c0084b.f341i.f299i, i2);
                        c0096e.m205a(c0084b.f343k.f299i, i3);
                        c0084b.m118c(i2, i3);
                        c0084b.f333a = 2;
                    }
                    if (this.J != C0083a.f303b && c0084b.f316J == C0083a.f305d) {
                        c0084b.f342j.f299i = c0096e.m202a(c0084b.f342j);
                        c0084b.f344l.f299i = c0096e.m202a(c0084b.f344l);
                        i2 = c0084b.f342j.f294d;
                        i3 = m130i() - c0084b.f344l.f294d;
                        c0096e.m205a(c0084b.f342j.f299i, i2);
                        c0096e.m205a(c0084b.f344l.f299i, i3);
                        if (c0084b.f308A > 0 || c0084b.m116c() == 8) {
                            c0084b.f345m.f299i = c0096e.m202a(c0084b.f345m);
                            c0096e.m205a(c0084b.f345m.f299i, c0084b.f308A + i2);
                        }
                        c0084b.m121d(i2, i3);
                        c0084b.f334b = 2;
                    }
                }
                c0084b.mo36a(c0096e);
            }
        }
        if (this.at > 0) {
            for (size = 0; size < this.at; size++) {
                C0084b c0084b2 = this.ax[size];
                int a = m152a(c0096e, this.az, this.ax[size], 0, this.ay);
                C0084b c0084b3 = this.az[2];
                if (c0084b3 != null) {
                    if (this.ay[1]) {
                        i7 = c0084b2.m131j();
                        while (c0084b3 != null) {
                            c0096e.m205a(c0084b3.f341i.f299i, i7);
                            i7 += (c0084b3.f341i.m101b() + c0084b3.m124f()) + c0084b3.f343k.m101b();
                            c0084b3 = c0084b3.ad;
                        }
                    } else {
                        Object obj6 = c0084b2.f330X == 0 ? 1 : null;
                        Object obj7 = c0084b2.f330X == 2 ? 1 : null;
                        obj2 = this.I == C0083a.f303b ? 1 : null;
                        C0084b c0084b4;
                        C0084b c0084b5;
                        if ((this.ao == 2 || this.ao == 8) && this.ay[0] && c0084b2.f332Z && obj7 == null && obj2 == null && c0084b2.f330X == 0) {
                            float f2;
                            i2 = 0;
                            i7 = 0;
                            y = 0.0f;
                            c0084b4 = null;
                            c0084b5 = c0084b2;
                            while (c0084b5 != null) {
                                if ((c0084b5.m116c() == 8 ? 1 : null) == null) {
                                    f = i7 + 1;
                                    if (c0084b5.f315I != C0083a.f304c) {
                                        i2 = (c0084b5.f343k.f293c != null ? c0084b5.f343k.m101b() : 0) + ((i2 + c0084b5.m124f()) + (c0084b5.f341i.f293c != null ? c0084b5.f341i.m101b() : 0));
                                    } else {
                                        y = c0084b5.ab + y;
                                    }
                                } else {
                                    f = i7;
                                }
                                c0084b = c0084b5.f343k.f293c != null ? c0084b5.f343k.f293c.f291a : null;
                                if (c0084b != null && (c0084b.f341i.f293c == null || !(c0084b.f341i.f293c == null || c0084b.f341i.f293c.f291a == c0084b5))) {
                                    c0084b = null;
                                }
                                c0084b4 = c0084b5;
                                c0084b5 = c0084b;
                                i7 = f;
                            }
                            f = 0;
                            if (c0084b4 != null) {
                                f = c0084b4.f343k.f293c != null ? c0084b4.f343k.f293c.f291a.m119d() : 0;
                                if (c0084b4.f343k.f293c != null && c0084b4.f343k.f293c.f291a == this) {
                                    f = m137p();
                                }
                            }
                            float f3 = ((float) (f + 0)) - ((float) i2);
                            float f4 = f3 / ((float) (i7 + 1));
                            if (a == 0) {
                                f2 = f4;
                                c0084b5 = c0084b2;
                            } else {
                                f2 = f3 / ((float) a);
                                c0084b5 = c0084b2;
                                f4 = 0.0f;
                            }
                            while (c0084b5 != null) {
                                float f5;
                                i7 = c0084b5.f341i.f293c != null ? c0084b5.f341i.m101b() : 0;
                                f = c0084b5.f343k.f293c != null ? c0084b5.f343k.m101b() : 0;
                                if (c0084b5.m116c() != 8) {
                                    f4 += (float) i7;
                                    c0096e.m205a(c0084b5.f341i.f299i, (int) (0.5f + f4));
                                    f5 = c0084b5.f315I == C0083a.f304c ? y == 0.0f ? ((f2 - ((float) i7)) - ((float) f)) + f4 : ((((c0084b5.ab * f3) / y) - ((float) i7)) - ((float) f)) + f4 : ((float) c0084b5.m124f()) + f4;
                                    c0096e.m205a(c0084b5.f343k.f299i, (int) (0.5f + f5));
                                    if (a == 0) {
                                        f5 += f2;
                                    }
                                    f5 += (float) f;
                                } else {
                                    f5 = f4 - (f2 / 2.0f);
                                    c0096e.m205a(c0084b5.f341i.f299i, (int) (0.5f + f5));
                                    c0096e.m205a(c0084b5.f343k.f299i, (int) (f5 + 0.5f));
                                    f5 = f4;
                                }
                                C0084b c0084b6 = c0084b5.f343k.f293c != null ? c0084b5.f343k.f293c.f291a : null;
                                if (!(c0084b6 == null || c0084b6.f341i.f293c == null || c0084b6.f341i.f293c.f291a == c0084b5)) {
                                    c0084b6 = null;
                                }
                                if (c0084b6 == this) {
                                    c0084b6 = null;
                                }
                                f4 = f5;
                                c0084b5 = c0084b6;
                            }
                        } else if (a == 0 || obj7 != null) {
                            C0081a c0081a;
                            int b;
                            C0101g c0101g2;
                            c0084b4 = null;
                            obj2 = null;
                            c0084b5 = null;
                            C0084b c0084b7 = c0084b3;
                            while (c0084b7 != null) {
                                Object obj8;
                                C0084b c0084b8;
                                r3 = c0084b7.ad;
                                if (r3 == null) {
                                    obj8 = 1;
                                    c0084b8 = this.az[1];
                                } else {
                                    obj8 = obj2;
                                    c0084b8 = c0084b4;
                                }
                                if (obj7 != null) {
                                    C0081a c0081a2 = c0084b7.f341i;
                                    i7 = c0081a2.m101b();
                                    f = c0084b5 != null ? i7 + c0084b5.f343k.m101b() : i7;
                                    i7 = 1;
                                    if (c0084b3 != c0084b7) {
                                        i7 = 3;
                                    }
                                    c0096e.m207a(c0081a2.f299i, c0081a2.f293c.f299i, f, i7);
                                    if (c0084b7.f315I == C0083a.f304c) {
                                        r2 = c0084b7.f343k;
                                        if (c0084b7.f335c == 1) {
                                            c0096e.m211c(r2.f299i, c0081a2.f299i, Math.max(c0084b7.f337e, c0084b7.m124f()), 3);
                                            c0084b = r3;
                                        } else {
                                            c0096e.m207a(c0081a2.f299i, c0081a2.f293c.f299i, c0081a2.f294d, 3);
                                            c0096e.m210b(r2.f299i, c0081a2.f299i, c0084b7.f337e, 3);
                                        }
                                    }
                                    c0084b = r3;
                                } else if (obj6 != null || obj8 == null || c0084b5 == null) {
                                    if (obj6 != null || obj8 != null || c0084b5 != null) {
                                        C0081a c0081a3 = c0084b7.f341i;
                                        c0081a = c0084b7.f343k;
                                        i2 = c0081a3.m101b();
                                        b = c0081a.m101b();
                                        c0096e.m207a(c0081a3.f299i, c0081a3.f293c.f299i, i2, 1);
                                        c0096e.m210b(c0081a.f299i, c0081a.f293c.f299i, -b, 1);
                                        r4 = c0081a3.f293c != null ? c0081a3.f293c.f299i : null;
                                        if (c0084b5 == null) {
                                            r4 = c0084b2.f341i.f293c != null ? c0084b2.f341i.f293c.f299i : null;
                                        }
                                        if (r3 == null) {
                                            r13 = c0084b8.f343k.f293c != null ? c0084b8.f343k.f293c.f291a : null;
                                        } else {
                                            r13 = r3;
                                        }
                                        if (r13 != null) {
                                            c0101g2 = r13.f341i.f299i;
                                            if (obj8 != null) {
                                                c0101g2 = c0084b8.f343k.f293c != null ? c0084b8.f343k.f293c.f299i : null;
                                            }
                                            if (!(r4 == null || c0101g2 == null)) {
                                                c0096e.m206a(c0081a3.f299i, r4, i2, 0.5f, c0101g2, c0081a.f299i, b);
                                            }
                                        }
                                        c0084b = r13;
                                    } else if (c0084b7.f341i.f293c == null) {
                                        c0096e.m205a(c0084b7.f341i.f299i, c0084b7.m131j());
                                        c0084b = r3;
                                    } else {
                                        c0096e.m211c(c0084b7.f341i.f299i, c0084b2.f341i.f293c.f299i, c0084b7.f341i.m101b(), 5);
                                        c0084b = r3;
                                    }
                                } else if (c0084b7.f343k.f293c == null) {
                                    c0096e.m205a(c0084b7.f343k.f299i, c0084b7.m134m());
                                    c0084b = r3;
                                } else {
                                    c0096e.m211c(c0084b7.f343k.f299i, c0084b8.f343k.f293c.f299i, -c0084b7.f343k.m101b(), 5);
                                    c0084b = r3;
                                }
                                if (obj8 != null) {
                                    c0084b = null;
                                }
                                c0084b4 = c0084b8;
                                c0084b5 = c0084b7;
                                c0084b7 = c0084b;
                                obj2 = obj8;
                            }
                            if (obj7 != null) {
                                r2 = c0084b3.f341i;
                                c0081a = c0084b4.f343k;
                                i2 = r2.m101b();
                                b = c0081a.m101b();
                                r4 = c0084b2.f341i.f293c != null ? c0084b2.f341i.f293c.f299i : null;
                                c0101g2 = c0084b4.f343k.f293c != null ? c0084b4.f343k.f293c.f299i : null;
                                if (!(r4 == null || c0101g2 == null)) {
                                    c0096e.m210b(c0081a.f299i, c0101g2, -b, 1);
                                    c0096e.m206a(r2.f299i, r4, i2, c0084b2.f313G, c0101g2, c0081a.f299i, b);
                                }
                            }
                        } else {
                            float f6 = 0.0f;
                            r3 = null;
                            C0084b c0084b9 = c0084b3;
                            while (c0084b9 != null) {
                                if (c0084b9.f315I != C0083a.f304c) {
                                    i7 = c0084b9.f341i.m101b();
                                    if (r3 != null) {
                                        i7 += r3.f343k.m101b();
                                    }
                                    i = 3;
                                    if (c0084b9.f341i.f293c.f291a.f315I == C0083a.f304c) {
                                        i = 2;
                                    }
                                    c0096e.m207a(c0084b9.f341i.f299i, c0084b9.f341i.f293c.f299i, i7, i);
                                    i7 = c0084b9.f343k.m101b();
                                    if (c0084b9.f343k.f293c.f291a.f341i.f293c != null && c0084b9.f343k.f293c.f291a.f341i.f293c.f291a == c0084b9) {
                                        i7 += c0084b9.f343k.f293c.f291a.f341i.m101b();
                                    }
                                    i = 3;
                                    if (c0084b9.f343k.f293c.f291a.f315I == C0083a.f304c) {
                                        i = 2;
                                    }
                                    c0096e.m210b(c0084b9.f343k.f299i, c0084b9.f343k.f293c.f299i, -i7, i);
                                } else {
                                    f6 += c0084b9.ab;
                                    i7 = 0;
                                    if (c0084b9.f343k.f293c != null) {
                                        i7 = c0084b9.f343k.m101b();
                                        if (c0084b9 != this.az[3]) {
                                            i7 += c0084b9.f343k.f293c.f291a.f341i.m101b();
                                        }
                                    }
                                    c0096e.m207a(c0084b9.f343k.f299i, c0084b9.f341i.f299i, 0, 1);
                                    c0096e.m210b(c0084b9.f343k.f299i, c0084b9.f343k.f293c.f299i, -i7, 1);
                                }
                                r3 = c0084b9;
                                c0084b9 = c0084b9.ad;
                            }
                            if (a == 1) {
                                c0084b9 = this.av[0];
                                i7 = c0084b9.f341i.m101b();
                                if (c0084b9.f341i.f293c != null) {
                                    i7 += c0084b9.f341i.f293c.m101b();
                                }
                                i = c0084b9.f343k.m101b();
                                if (c0084b9.f343k.f293c != null) {
                                    i += c0084b9.f343k.f293c.m101b();
                                }
                                r4 = c0084b2.f343k.f293c.f299i;
                                if (c0084b9 == this.az[3]) {
                                    r4 = this.az[1].f343k.f293c.f299i;
                                }
                                if (c0084b9.f335c == 1) {
                                    c0096e.m207a(c0084b2.f341i.f299i, c0084b2.f341i.f293c.f299i, i7, 1);
                                    c0096e.m210b(c0084b2.f343k.f299i, r4, -i, 1);
                                    c0096e.m211c(c0084b2.f343k.f299i, c0084b2.f341i.f299i, c0084b2.m124f(), 2);
                                } else {
                                    c0096e.m211c(c0084b9.f341i.f299i, c0084b9.f341i.f293c.f299i, i7, 1);
                                    c0096e.m211c(c0084b9.f343k.f299i, r4, -i, 1);
                                }
                            } else {
                                for (int i8 = 0; i8 < a - 1; i8++) {
                                    C0084b c0084b10 = this.av[i8];
                                    r13 = this.av[i8 + 1];
                                    C0101g c0101g3 = c0084b10.f341i.f299i;
                                    C0101g c0101g4 = c0084b10.f343k.f299i;
                                    C0101g c0101g5 = r13.f341i.f299i;
                                    C0101g c0101g6 = r13.f343k.f299i;
                                    if (r13 == this.az[3]) {
                                        c0101g6 = this.az[1].f343k.f299i;
                                    }
                                    i7 = c0084b10.f341i.m101b();
                                    if (!(c0084b10.f341i.f293c == null || c0084b10.f341i.f293c.f291a.f343k.f293c == null || c0084b10.f341i.f293c.f291a.f343k.f293c.f291a != c0084b10)) {
                                        i7 += c0084b10.f341i.f293c.f291a.f343k.m101b();
                                    }
                                    c0096e.m207a(c0101g3, c0084b10.f341i.f293c.f299i, i7, 2);
                                    i = c0084b10.f343k.m101b();
                                    if (c0084b10.f343k.f293c == null || c0084b10.ad == null) {
                                        i7 = i;
                                    } else {
                                        i7 = (c0084b10.ad.f341i.f293c != null ? c0084b10.ad.f341i.m101b() : 0) + i;
                                    }
                                    c0096e.m210b(c0101g4, c0084b10.f343k.f293c.f299i, -i7, 2);
                                    if (i8 + 1 == a - 1) {
                                        i7 = r13.f341i.m101b();
                                        if (!(r13.f341i.f293c == null || r13.f341i.f293c.f291a.f343k.f293c == null || r13.f341i.f293c.f291a.f343k.f293c.f291a != r13)) {
                                            i7 += r13.f341i.f293c.f291a.f343k.m101b();
                                        }
                                        c0096e.m207a(c0101g5, r13.f341i.f293c.f299i, i7, 2);
                                        r2 = r13.f343k;
                                        if (r13 == this.az[3]) {
                                            r2 = this.az[1].f343k;
                                        }
                                        i = r2.m101b();
                                        if (!(r2.f293c == null || r2.f293c.f291a.f341i.f293c == null || r2.f293c.f291a.f341i.f293c.f291a != r13)) {
                                            i += r2.f293c.f291a.f341i.m101b();
                                        }
                                        c0096e.m210b(c0101g6, r2.f293c.f299i, -i, 2);
                                    }
                                    if (c0084b2.f338f > 0) {
                                        c0096e.m210b(c0101g4, c0101g3, c0084b2.f338f, 2);
                                    }
                                    C0093b b2 = c0096e.m209b();
                                    b2.m179a(c0084b10.ab, f6, r13.ab, c0101g3, c0084b10.f341i.m101b(), c0101g4, c0084b10.f343k.m101b(), c0101g5, r13.f341i.m101b(), c0101g6, r13.f343k.m101b());
                                    c0096e.m204a(b2);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.au > 0) {
            m156c(c0096e);
        }
        return true;
    }

    private void m156c(C0096e c0096e) {
        for (int i = 0; i < this.au; i++) {
            C0084b c0084b = this.aw[i];
            int a = m152a(c0096e, this.az, this.aw[i], 1, this.ay);
            C0084b c0084b2 = this.az[2];
            if (c0084b2 != null) {
                int k;
                if (this.ay[1]) {
                    k = c0084b.m132k();
                    while (c0084b2 != null) {
                        c0096e.m205a(c0084b2.f342j.f299i, k);
                        k += (c0084b2.f342j.m101b() + c0084b2.m130i()) + c0084b2.f344l.m101b();
                        c0084b2 = c0084b2.ae;
                    }
                } else {
                    Object obj = c0084b.f331Y == 0 ? 1 : null;
                    Object obj2 = c0084b.f331Y == 2 ? 1 : null;
                    Object obj3 = this.J == C0083a.f303b ? 1 : null;
                    int i2;
                    C0084b c0084b3;
                    C0084b c0084b4;
                    C0084b c0084b5;
                    if ((this.ao == 2 || this.ao == 8) && this.ay[0] && c0084b.aa && obj2 == null && obj3 == null && c0084b.f331Y == 0) {
                        int i3;
                        float f;
                        i2 = 0;
                        k = 0;
                        float f2 = 0.0f;
                        c0084b3 = null;
                        c0084b4 = c0084b;
                        while (c0084b4 != null) {
                            if ((c0084b4.f318L == 8 ? 1 : null) == null) {
                                i3 = k + 1;
                                if (c0084b4.f316J != C0083a.f304c) {
                                    i2 = (c0084b4.f344l.f293c != null ? c0084b4.f344l.m101b() : 0) + ((i2 + c0084b4.m130i()) + (c0084b4.f342j.f293c != null ? c0084b4.f342j.m101b() : 0));
                                } else {
                                    f2 = c0084b4.ac + f2;
                                }
                            } else {
                                i3 = k;
                            }
                            c0084b5 = c0084b4.f344l.f293c != null ? c0084b4.f344l.f293c.f291a : null;
                            if (c0084b5 != null && (c0084b5.f342j.f293c == null || !(c0084b5.f342j.f293c == null || c0084b5.f342j.f293c.f291a == c0084b4))) {
                                c0084b5 = null;
                            }
                            c0084b3 = c0084b4;
                            c0084b4 = c0084b5;
                            k = i3;
                        }
                        i3 = 0;
                        if (c0084b3 != null) {
                            i3 = c0084b3.f344l.f293c != null ? c0084b3.f344l.f293c.f291a.m119d() : 0;
                            if (c0084b3.f344l.f293c != null && c0084b3.f344l.f293c.f291a == this) {
                                i3 = m138q();
                            }
                        }
                        float f3 = ((float) (i3 + 0)) - ((float) i2);
                        float f4 = f3 / ((float) (k + 1));
                        if (a == 0) {
                            f = f4;
                            c0084b4 = c0084b;
                        } else {
                            f = f3 / ((float) a);
                            c0084b4 = c0084b;
                            f4 = 0.0f;
                        }
                        while (c0084b4 != null) {
                            float i4;
                            k = c0084b4.f342j.f293c != null ? c0084b4.f342j.m101b() : 0;
                            i3 = c0084b4.f344l.f293c != null ? c0084b4.f344l.m101b() : 0;
                            if (c0084b4.f318L != 8) {
                                f4 += (float) k;
                                c0096e.m205a(c0084b4.f342j.f299i, (int) (0.5f + f4));
                                i4 = c0084b4.f316J == C0083a.f304c ? f2 == 0.0f ? ((f - ((float) k)) - ((float) i3)) + f4 : ((((c0084b4.ac * f3) / f2) - ((float) k)) - ((float) i3)) + f4 : ((float) c0084b4.m130i()) + f4;
                                c0096e.m205a(c0084b4.f344l.f299i, (int) (0.5f + i4));
                                if (a == 0) {
                                    i4 += f;
                                }
                                i4 += (float) i3;
                            } else {
                                i4 = f4 - (f / 2.0f);
                                c0096e.m205a(c0084b4.f342j.f299i, (int) (0.5f + i4));
                                c0096e.m205a(c0084b4.f344l.f299i, (int) (i4 + 0.5f));
                                i4 = f4;
                            }
                            C0084b c0084b6 = c0084b4.f344l.f293c != null ? c0084b4.f344l.f293c.f291a : null;
                            if (!(c0084b6 == null || c0084b6.f342j.f293c == null || c0084b6.f342j.f293c.f291a == c0084b4)) {
                                c0084b6 = null;
                            }
                            if (c0084b6 == this) {
                                c0084b6 = null;
                            }
                            f4 = i4;
                            c0084b4 = c0084b6;
                        }
                    } else if (a == 0 || obj2 != null) {
                        C0081a c0081a;
                        int b;
                        C0101g c0101g;
                        c0084b3 = null;
                        obj3 = null;
                        c0084b4 = null;
                        C0084b c0084b7 = c0084b2;
                        while (c0084b7 != null) {
                            Object obj4;
                            C0084b c0084b8;
                            r3 = c0084b7.ae;
                            if (r3 == null) {
                                obj4 = 1;
                                c0084b8 = this.az[1];
                            } else {
                                obj4 = obj3;
                                c0084b8 = c0084b3;
                            }
                            if (obj2 != null) {
                                c0081a = c0084b7.f342j;
                                int b2 = c0081a.m101b();
                                if (c0084b4 != null) {
                                    b2 += c0084b4.f344l.m101b();
                                }
                                k = 1;
                                if (c0084b2 != c0084b7) {
                                    k = 3;
                                }
                                C0101g c0101g2 = null;
                                r4 = null;
                                if (c0081a.f293c != null) {
                                    c0101g2 = c0081a.f299i;
                                    r4 = c0081a.f293c.f299i;
                                } else if (c0084b7.f345m.f293c != null) {
                                    c0101g2 = c0084b7.f345m.f299i;
                                    r4 = c0084b7.f345m.f293c.f299i;
                                    b2 -= c0081a.m101b();
                                }
                                if (!(c0101g2 == null || r4 == null)) {
                                    c0096e.m207a(c0101g2, r4, b2, k);
                                }
                                if (c0084b7.f316J == C0083a.f304c) {
                                    r2 = c0084b7.f344l;
                                    if (c0084b7.f336d == 1) {
                                        c0096e.m211c(r2.f299i, c0081a.f299i, Math.max(c0084b7.f339g, c0084b7.m130i()), 3);
                                        c0084b5 = r3;
                                    } else {
                                        c0096e.m207a(c0081a.f299i, c0081a.f293c.f299i, c0081a.f294d, 3);
                                        c0096e.m210b(r2.f299i, c0081a.f299i, c0084b7.f339g, 3);
                                    }
                                }
                                c0084b5 = r3;
                            } else if (obj != null || obj4 == null || c0084b4 == null) {
                                if (obj != null || obj4 != null || c0084b4 != null) {
                                    C0081a c0081a2 = c0084b7.f342j;
                                    c0081a = c0084b7.f344l;
                                    i2 = c0081a2.m101b();
                                    b = c0081a.m101b();
                                    c0096e.m207a(c0081a2.f299i, c0081a2.f293c.f299i, i2, 1);
                                    c0096e.m210b(c0081a.f299i, c0081a.f293c.f299i, -b, 1);
                                    r4 = c0081a2.f293c != null ? c0081a2.f293c.f299i : null;
                                    if (c0084b4 == null) {
                                        r4 = c0084b.f342j.f293c != null ? c0084b.f342j.f293c.f299i : null;
                                    }
                                    if (r3 == null) {
                                        r13 = c0084b8.f344l.f293c != null ? c0084b8.f344l.f293c.f291a : null;
                                    } else {
                                        r13 = r3;
                                    }
                                    if (r13 != null) {
                                        c0101g = r13.f342j.f299i;
                                        if (obj4 != null) {
                                            c0101g = c0084b8.f344l.f293c != null ? c0084b8.f344l.f293c.f299i : null;
                                        }
                                        if (!(r4 == null || c0101g == null)) {
                                            c0096e.m206a(c0081a2.f299i, r4, i2, 0.5f, c0101g, c0081a.f299i, b);
                                        }
                                    }
                                    c0084b5 = r13;
                                } else if (c0084b7.f342j.f293c == null) {
                                    c0096e.m205a(c0084b7.f342j.f299i, c0084b7.m132k());
                                    c0084b5 = r3;
                                } else {
                                    c0096e.m211c(c0084b7.f342j.f299i, c0084b.f342j.f293c.f299i, c0084b7.f342j.m101b(), 5);
                                    c0084b5 = r3;
                                }
                            } else if (c0084b7.f344l.f293c == null) {
                                c0096e.m205a(c0084b7.f344l.f299i, c0084b7.m133l());
                                c0084b5 = r3;
                            } else {
                                c0096e.m211c(c0084b7.f344l.f299i, c0084b8.f344l.f293c.f299i, -c0084b7.f344l.m101b(), 5);
                                c0084b5 = r3;
                            }
                            if (obj4 != null) {
                                c0084b5 = null;
                            }
                            c0084b3 = c0084b8;
                            c0084b4 = c0084b7;
                            c0084b7 = c0084b5;
                            obj3 = obj4;
                        }
                        if (obj2 != null) {
                            r2 = c0084b2.f342j;
                            c0081a = c0084b3.f344l;
                            i2 = r2.m101b();
                            b = c0081a.m101b();
                            r4 = c0084b.f342j.f293c != null ? c0084b.f342j.f293c.f299i : null;
                            c0101g = c0084b3.f344l.f293c != null ? c0084b3.f344l.f293c.f299i : null;
                            if (!(r4 == null || c0101g == null)) {
                                c0096e.m210b(c0081a.f299i, c0101g, -b, 1);
                                c0096e.m206a(r2.f299i, r4, i2, c0084b.f314H, c0101g, c0081a.f299i, b);
                            }
                        }
                    } else {
                        int i5;
                        float f5 = 0.0f;
                        r3 = null;
                        C0084b c0084b9 = c0084b2;
                        while (c0084b9 != null) {
                            if (c0084b9.f316J != C0083a.f304c) {
                                k = c0084b9.f342j.m101b();
                                if (r3 != null) {
                                    k += r3.f344l.m101b();
                                }
                                i5 = 3;
                                if (c0084b9.f342j.f293c.f291a.f316J == C0083a.f304c) {
                                    i5 = 2;
                                }
                                c0096e.m207a(c0084b9.f342j.f299i, c0084b9.f342j.f293c.f299i, k, i5);
                                k = c0084b9.f344l.m101b();
                                if (c0084b9.f344l.f293c.f291a.f342j.f293c != null && c0084b9.f344l.f293c.f291a.f342j.f293c.f291a == c0084b9) {
                                    k += c0084b9.f344l.f293c.f291a.f342j.m101b();
                                }
                                i5 = 3;
                                if (c0084b9.f344l.f293c.f291a.f316J == C0083a.f304c) {
                                    i5 = 2;
                                }
                                c0096e.m210b(c0084b9.f344l.f299i, c0084b9.f344l.f293c.f299i, -k, i5);
                            } else {
                                f5 += c0084b9.ac;
                                k = 0;
                                if (c0084b9.f344l.f293c != null) {
                                    k = c0084b9.f344l.m101b();
                                    if (c0084b9 != this.az[3]) {
                                        k += c0084b9.f344l.f293c.f291a.f342j.m101b();
                                    }
                                }
                                c0096e.m207a(c0084b9.f344l.f299i, c0084b9.f342j.f299i, 0, 1);
                                c0096e.m210b(c0084b9.f344l.f299i, c0084b9.f344l.f293c.f299i, -k, 1);
                            }
                            r3 = c0084b9;
                            c0084b9 = c0084b9.ae;
                        }
                        if (a == 1) {
                            c0084b9 = this.av[0];
                            k = c0084b9.f342j.m101b();
                            if (c0084b9.f342j.f293c != null) {
                                k += c0084b9.f342j.f293c.m101b();
                            }
                            i5 = c0084b9.f344l.m101b();
                            if (c0084b9.f344l.f293c != null) {
                                i5 += c0084b9.f344l.f293c.m101b();
                            }
                            r4 = c0084b.f344l.f293c.f299i;
                            if (c0084b9 == this.az[3]) {
                                r4 = this.az[1].f344l.f293c.f299i;
                            }
                            if (c0084b9.f336d == 1) {
                                c0096e.m207a(c0084b.f342j.f299i, c0084b.f342j.f293c.f299i, k, 1);
                                c0096e.m210b(c0084b.f344l.f299i, r4, -i5, 1);
                                c0096e.m211c(c0084b.f344l.f299i, c0084b.f342j.f299i, c0084b.m130i(), 2);
                            } else {
                                c0096e.m211c(c0084b9.f342j.f299i, c0084b9.f342j.f293c.f299i, k, 1);
                                c0096e.m211c(c0084b9.f344l.f299i, r4, -i5, 1);
                            }
                        } else {
                            for (int i6 = 0; i6 < a - 1; i6++) {
                                C0084b c0084b10 = this.av[i6];
                                r13 = this.av[i6 + 1];
                                C0101g c0101g3 = c0084b10.f342j.f299i;
                                C0101g c0101g4 = c0084b10.f344l.f299i;
                                C0101g c0101g5 = r13.f342j.f299i;
                                C0101g c0101g6 = r13.f344l.f299i;
                                if (r13 == this.az[3]) {
                                    c0101g6 = this.az[1].f344l.f299i;
                                }
                                k = c0084b10.f342j.m101b();
                                if (!(c0084b10.f342j.f293c == null || c0084b10.f342j.f293c.f291a.f344l.f293c == null || c0084b10.f342j.f293c.f291a.f344l.f293c.f291a != c0084b10)) {
                                    k += c0084b10.f342j.f293c.f291a.f344l.m101b();
                                }
                                c0096e.m207a(c0101g3, c0084b10.f342j.f293c.f299i, k, 2);
                                i5 = c0084b10.f344l.m101b();
                                if (c0084b10.f344l.f293c == null || c0084b10.ae == null) {
                                    k = i5;
                                } else {
                                    k = (c0084b10.ae.f342j.f293c != null ? c0084b10.ae.f342j.m101b() : 0) + i5;
                                }
                                c0096e.m210b(c0101g4, c0084b10.f344l.f293c.f299i, -k, 2);
                                if (i6 + 1 == a - 1) {
                                    k = r13.f342j.m101b();
                                    if (!(r13.f342j.f293c == null || r13.f342j.f293c.f291a.f344l.f293c == null || r13.f342j.f293c.f291a.f344l.f293c.f291a != r13)) {
                                        k += r13.f342j.f293c.f291a.f344l.m101b();
                                    }
                                    c0096e.m207a(c0101g5, r13.f342j.f293c.f299i, k, 2);
                                    r2 = r13.f344l;
                                    if (r13 == this.az[3]) {
                                        r2 = this.az[1].f344l;
                                    }
                                    i5 = r2.m101b();
                                    if (!(r2.f293c == null || r2.f293c.f291a.f342j.f293c == null || r2.f293c.f291a.f342j.f293c.f291a != r13)) {
                                        i5 += r2.f293c.f291a.f342j.m101b();
                                    }
                                    c0096e.m210b(c0101g6, r2.f293c.f299i, -i5, 2);
                                }
                                if (c0084b.f340h > 0) {
                                    c0096e.m210b(c0101g4, c0101g3, c0084b.f340h, 2);
                                }
                                C0093b b3 = c0096e.m209b();
                                b3.m179a(c0084b10.ac, f5, r13.ac, c0101g3, c0084b10.f342j.m101b(), c0101g4, c0084b10.f344l.m101b(), c0101g5, r13.f342j.m101b(), c0101g6, r13.f344l.m101b());
                                c0096e.m204a(b3);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void mo30a() {
        this.af.m203a();
        this.ak = 0;
        this.am = 0;
        this.al = 0;
        this.an = 0;
        super.mo30a();
    }

    final void m158a(C0084b c0084b, int i) {
        int i2 = 0;
        if (i == 0) {
            while (c0084b.f341i.f293c != null && c0084b.f341i.f293c.f291a.f343k.f293c != null && c0084b.f341i.f293c.f291a.f343k.f293c == c0084b.f341i && c0084b.f341i.f293c.f291a != c0084b) {
                c0084b = c0084b.f341i.f293c.f291a;
            }
            while (i2 < this.at) {
                if (this.ax[i2] != c0084b) {
                    i2++;
                } else {
                    return;
                }
            }
            if (this.at + 1 >= this.ax.length) {
                this.ax = (C0084b[]) Arrays.copyOf(this.ax, this.ax.length * 2);
            }
            this.ax[this.at] = c0084b;
            this.at++;
        } else if (i == 1) {
            while (c0084b.f342j.f293c != null && c0084b.f342j.f293c.f291a.f344l.f293c != null && c0084b.f342j.f293c.f291a.f344l.f293c == c0084b.f342j && c0084b.f342j.f293c.f291a != c0084b) {
                c0084b = c0084b.f342j.f293c.f291a;
            }
            while (i2 < this.au) {
                if (this.aw[i2] != c0084b) {
                    i2++;
                } else {
                    return;
                }
            }
            if (this.au + 1 >= this.aw.length) {
                this.aw = (C0084b[]) Arrays.copyOf(this.aw, this.aw.length * 2);
            }
            this.aw[this.au] = c0084b;
            this.au++;
        }
    }

    public final void mo34w() {
        int size;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C0084b c0084b;
        int i6;
        int max;
        boolean z;
        boolean z2;
        boolean[] zArr;
        C0091f c0091f;
        C0084b c0084b2;
        C0086c c0086c;
        C0084b c0084b3;
        int i7 = this.w;
        int i8 = this.x;
        int max2 = Math.max(0, m124f());
        int max3 = Math.max(0, m130i());
        this.ap = false;
        this.aq = false;
        if (this.r != null) {
            if (this.as == null) {
                this.as = new C0091f(this);
            }
            C0091f c0091f2 = this.as;
            c0091f2.f365a = m119d();
            c0091f2.f366b = m122e();
            c0091f2.f367c = m124f();
            c0091f2.f368d = m130i();
            size = c0091f2.f369e.size();
            for (i = 0; i < size; i++) {
                C0090a c0090a = (C0090a) c0091f2.f369e.get(i);
                c0090a.f360a = mo35a(c0090a.f360a.f292b);
                if (c0090a.f360a != null) {
                    c0090a.f361b = c0090a.f360a.f293c;
                    c0090a.f362c = c0090a.f360a.m101b();
                    c0090a.f363d = c0090a.f360a.f296f;
                    c0090a.f364e = c0090a.f360a.f298h;
                } else {
                    c0090a.f361b = null;
                    c0090a.f362c = 0;
                    c0090a.f363d = C0079b.f278b;
                    c0090a.f364e = 0;
                }
            }
            m107a(this.ak);
            m113b(this.al);
            m142u();
            mo31a(this.af.f396f);
        } else {
            this.w = 0;
            this.x = 0;
        }
        boolean z3 = false;
        int i9 = this.J;
        int i10 = this.I;
        if (this.ao == 2 && (this.J == C0083a.f303b || this.I == C0083a.f303b)) {
            ArrayList arrayList = this.ar;
            boolean[] zArr2 = this.ay;
            i2 = 0;
            int i11 = 0;
            i3 = 0;
            i4 = 0;
            int i12 = 0;
            size = 0;
            int size2 = arrayList.size();
            zArr2[0] = true;
            i5 = 0;
            while (i5 < size2) {
                c0084b = (C0084b) arrayList.get(i5);
                if (!c0084b.m115b()) {
                    if (!c0084b.f328V) {
                        m153a(c0084b, zArr2);
                    }
                    if (!c0084b.f329W) {
                        m154b(c0084b, zArr2);
                    }
                    if (!zArr2[0]) {
                        break;
                    }
                    i = (c0084b.f321O + c0084b.f322P) - c0084b.m124f();
                    i6 = (c0084b.f320N + c0084b.f323Q) - c0084b.m130i();
                    if (c0084b.f315I == C0083a.f305d) {
                        i = (c0084b.m124f() + c0084b.f341i.f294d) + c0084b.f343k.f294d;
                    }
                    if (c0084b.f316J == C0083a.f305d) {
                        i6 = (c0084b.m130i() + c0084b.f342j.f294d) + c0084b.f344l.f294d;
                    }
                    if (c0084b.f318L == 8) {
                        i = 0;
                        i6 = 0;
                    }
                    i11 = Math.max(i11, c0084b.f321O);
                    i3 = Math.max(i3, c0084b.f322P);
                    i4 = Math.max(i4, c0084b.f323Q);
                    i2 = Math.max(i2, c0084b.f320N);
                    i = Math.max(i12, i);
                    max = Math.max(size, i6);
                    i6 = i4;
                    size = i3;
                    i12 = i11;
                    i4 = i2;
                } else {
                    max = size;
                    i = i12;
                    i6 = i4;
                    size = i3;
                    i12 = i11;
                    i4 = i2;
                }
                i5++;
                i11 = i12;
                i2 = i4;
                i4 = i6;
                i3 = size;
                i12 = i;
                size = max;
            }
            this.ai = Math.max(this.B, Math.max(Math.max(i11, i3), i12));
            this.aj = Math.max(this.C, Math.max(Math.max(i2, i4), size));
            for (i = 0; i < size2; i++) {
                c0084b = (C0084b) arrayList.get(i);
                c0084b.f328V = false;
                c0084b.f329W = false;
                c0084b.f324R = false;
                c0084b.f325S = false;
                c0084b.f326T = false;
                c0084b.f327U = false;
            }
            z3 = this.ay[0];
            if (max2 > 0 && max3 > 0 && (this.ai > max2 || this.aj > max3)) {
                z3 = false;
            }
            if (z3) {
                if (this.I == C0083a.f303b) {
                    this.I = C0083a.f302a;
                    if (max2 <= 0 || max2 >= this.ai) {
                        m117c(Math.max(this.B, this.ai));
                    } else {
                        this.ap = true;
                        m117c(max2);
                    }
                }
                if (this.J == C0083a.f303b) {
                    this.J = C0083a.f302a;
                    if (max3 <= 0 || max3 >= this.aj) {
                        m120d(Math.max(this.C, this.aj));
                    } else {
                        this.aq = true;
                        m120d(max3);
                        z = z3;
                        this.at = 0;
                        this.au = 0;
                        i3 = this.ar.size();
                        for (i6 = 0; i6 < i3; i6++) {
                            c0084b = (C0084b) this.ar.get(i6);
                            if (c0084b instanceof C0085g) {
                                ((C0085g) c0084b).mo34w();
                            }
                        }
                        max = 0;
                        z2 = z;
                        z = true;
                        while (z) {
                            i4 = max + 1;
                            try {
                                this.af.m203a();
                                z = m155b(this.af);
                                if (z) {
                                    C0096e c0096e;
                                    c0096e = this.af;
                                    C0095d c0095d = c0096e.f392b;
                                    c0095d.m190a(c0096e);
                                    c0096e.m208b(c0095d);
                                    c0096e.m201a(c0095d);
                                    for (max = 0; max < c0096e.f395e; max++) {
                                        C0093b c0093b = c0096e.f393c[max];
                                        c0093b.f381a.f417d = c0093b.f382b;
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            if (z) {
                                mo38v();
                                while (i < i3) {
                                    c0084b = (C0084b) this.ar.get(i);
                                    if (c0084b.f315I == C0083a.f304c || c0084b.m124f() >= c0084b.f311D) {
                                        if (c0084b.f316J != C0083a.f304c && c0084b.m130i() < c0084b.f312E) {
                                            this.ay[2] = true;
                                            break;
                                        }
                                    } else {
                                        this.ay[2] = true;
                                        break;
                                    }
                                }
                            }
                            zArr = this.ay;
                            zArr[2] = false;
                            mo38v();
                            size = this.ar.size();
                            for (i = 0; i < size; i++) {
                                c0084b = (C0084b) this.ar.get(i);
                                c0084b.mo38v();
                                if (c0084b.f315I == C0083a.f304c && c0084b.m124f() < c0084b.f311D) {
                                    zArr[2] = true;
                                }
                                if (c0084b.f316J == C0083a.f304c && c0084b.m130i() < c0084b.f312E) {
                                    zArr[2] = true;
                                }
                            }
                            if (i4 < 8 || !this.ay[2]) {
                                z3 = false;
                                z = z2;
                            } else {
                                i12 = 0;
                                size = 0;
                                for (i6 = 0; i6 < i3; i6++) {
                                    c0084b = (C0084b) this.ar.get(i6);
                                    i12 = Math.max(i12, c0084b.f355w + c0084b.m124f());
                                    size = Math.max(size, c0084b.m130i() + c0084b.f356x);
                                }
                                max = Math.max(this.B, i12);
                                i6 = Math.max(this.C, size);
                                if (i10 != C0083a.f303b || m124f() >= max) {
                                    z3 = false;
                                    z = z2;
                                } else {
                                    m117c(max);
                                    this.I = C0083a.f303b;
                                    z = true;
                                    z3 = true;
                                }
                                if (i9 == C0083a.f303b && m130i() < i6) {
                                    m120d(i6);
                                    this.J = C0083a.f303b;
                                    z = true;
                                    z3 = true;
                                }
                            }
                            i6 = Math.max(this.B, m124f());
                            if (i6 > m124f()) {
                                m117c(i6);
                                this.I = C0083a.f302a;
                                z = true;
                                z3 = true;
                            }
                            i6 = Math.max(this.C, m130i());
                            if (i6 > m130i()) {
                                m120d(i6);
                                this.J = C0083a.f302a;
                                z = true;
                                z3 = true;
                            }
                            if (z) {
                                if (this.I == C0083a.f303b && max2 > 0 && m124f() > max2) {
                                    this.ap = true;
                                    z = true;
                                    this.I = C0083a.f302a;
                                    m117c(max2);
                                    z3 = true;
                                }
                                if (this.J == C0083a.f303b && max3 > 0 && m130i() > max3) {
                                    this.aq = true;
                                    z = true;
                                    this.J = C0083a.f302a;
                                    m120d(max3);
                                    z3 = true;
                                }
                            }
                            z2 = z;
                            z = z3;
                            max = i4;
                        }
                        if (this.r == null) {
                            i5 = Math.max(this.B, m124f());
                            i7 = Math.max(this.C, m130i());
                            c0091f = this.as;
                            m107a(c0091f.f365a);
                            m113b(c0091f.f366b);
                            m117c(c0091f.f367c);
                            m120d(c0091f.f368d);
                            max2 = c0091f.f369e.size();
                            for (i2 = 0; i2 < max2; i2++) {
                                C0090a c0090a2 = (C0090a) c0091f.f369e.get(i2);
                                mo35a(c0090a2.f360a.f292b).m100a(c0090a2.f361b, c0090a2.f362c, -1, c0090a2.f363d, c0090a2.f364e, false);
                            }
                            m117c((this.ak + i5) + this.am);
                            m120d((this.al + i7) + this.an);
                        } else {
                            this.w = i7;
                            this.x = i8;
                        }
                        if (z2) {
                            this.I = i10;
                            this.J = i9;
                        }
                        mo31a(this.af.f396f);
                        c0084b2 = this.f350r;
                        if (this instanceof C0086c) {
                            c0084b = c0084b2;
                            c0086c = null;
                        } else {
                            c0084b = c0084b2;
                            c0086c = this;
                        }
                        while (c0084b != null) {
                            c0084b3 = c0084b.f350r;
                            if (c0084b instanceof C0086c) {
                                c0084b = c0084b3;
                            } else {
                                c0086c = (C0086c) c0084b;
                                c0084b = c0084b3;
                            }
                        }
                        if (this == c0086c) {
                            mo33t();
                        }
                    }
                }
            }
        }
        z = z3;
        this.at = 0;
        this.au = 0;
        i3 = this.ar.size();
        for (i6 = 0; i6 < i3; i6++) {
            c0084b = (C0084b) this.ar.get(i6);
            if (c0084b instanceof C0085g) {
                ((C0085g) c0084b).mo34w();
            }
        }
        max = 0;
        z2 = z;
        z = true;
        while (z) {
            i4 = max + 1;
            this.af.m203a();
            z = m155b(this.af);
            if (z) {
                c0096e = this.af;
                C0095d c0095d2 = c0096e.f392b;
                c0095d2.m190a(c0096e);
                c0096e.m208b(c0095d2);
                c0096e.m201a(c0095d2);
                for (max = 0; max < c0096e.f395e; max++) {
                    C0093b c0093b2 = c0096e.f393c[max];
                    c0093b2.f381a.f417d = c0093b2.f382b;
                }
            }
            if (z) {
                mo38v();
                for (i = 0; i < i3; i++) {
                    c0084b = (C0084b) this.ar.get(i);
                    if (c0084b.f315I == C0083a.f304c) {
                    }
                    if (c0084b.f316J != C0083a.f304c) {
                    }
                }
            } else {
                zArr = this.ay;
                zArr[2] = false;
                mo38v();
                size = this.ar.size();
                for (i = 0; i < size; i++) {
                    c0084b = (C0084b) this.ar.get(i);
                    c0084b.mo38v();
                    zArr[2] = true;
                    zArr[2] = true;
                }
            }
            if (i4 < 8) {
            }
            z3 = false;
            z = z2;
            i6 = Math.max(this.B, m124f());
            if (i6 > m124f()) {
                m117c(i6);
                this.I = C0083a.f302a;
                z = true;
                z3 = true;
            }
            i6 = Math.max(this.C, m130i());
            if (i6 > m130i()) {
                m120d(i6);
                this.J = C0083a.f302a;
                z = true;
                z3 = true;
            }
            if (z) {
                this.ap = true;
                z = true;
                this.I = C0083a.f302a;
                m117c(max2);
                z3 = true;
                this.aq = true;
                z = true;
                this.J = C0083a.f302a;
                m120d(max3);
                z3 = true;
            }
            z2 = z;
            z = z3;
            max = i4;
        }
        if (this.r == null) {
            this.w = i7;
            this.x = i8;
        } else {
            i5 = Math.max(this.B, m124f());
            i7 = Math.max(this.C, m130i());
            c0091f = this.as;
            m107a(c0091f.f365a);
            m113b(c0091f.f366b);
            m117c(c0091f.f367c);
            m120d(c0091f.f368d);
            max2 = c0091f.f369e.size();
            for (i2 = 0; i2 < max2; i2++) {
                C0090a c0090a22 = (C0090a) c0091f.f369e.get(i2);
                mo35a(c0090a22.f360a.f292b).m100a(c0090a22.f361b, c0090a22.f362c, -1, c0090a22.f363d, c0090a22.f364e, false);
            }
            m117c((this.ak + i5) + this.am);
            m120d((this.al + i7) + this.an);
        }
        if (z2) {
            this.I = i10;
            this.J = i9;
        }
        mo31a(this.af.f396f);
        c0084b2 = this.f350r;
        if (this instanceof C0086c) {
            c0084b = c0084b2;
            c0086c = null;
        } else {
            c0084b = c0084b2;
            c0086c = this;
        }
        while (c0084b != null) {
            c0084b3 = c0084b.f350r;
            if (c0084b instanceof C0086c) {
                c0084b = c0084b3;
            } else {
                c0086c = (C0086c) c0084b;
                c0084b = c0084b3;
            }
        }
        if (this == c0086c) {
            mo33t();
        }
    }
}
