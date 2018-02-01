package android.support.constraint.p008a;

import android.support.constraint.p008a.C0101g.C0100a;
import android.support.constraint.p008a.p009a.C0081a;
import java.util.Arrays;
import java.util.HashMap;

public final class C0096e {
    private static int f390g = 1000;
    int f391a;
    public C0095d f392b;
    public C0093b[] f393c;
    int f394d;
    public int f395e;
    public final C0094c f396f;
    private HashMap<String, C0101g> f397h;
    private int f398i;
    private int f399j;
    private boolean[] f400k;
    private int f401l;
    private C0101g[] f402m;
    private int f403n;
    private C0093b[] f404o;

    public C0096e() {
        this.f391a = 0;
        this.f397h = null;
        this.f392b = new C0095d();
        this.f398i = 32;
        this.f399j = this.f398i;
        this.f393c = null;
        this.f400k = new boolean[this.f398i];
        this.f394d = 1;
        this.f395e = 0;
        this.f401l = this.f398i;
        this.f402m = new C0101g[f390g];
        this.f403n = 0;
        this.f404o = new C0093b[this.f398i];
        this.f393c = new C0093b[this.f398i];
        m200f();
        this.f396f = new C0094c();
    }

    public static C0093b m191a(C0096e c0096e, C0101g c0101g, C0101g c0101g2, int i, float f, C0101g c0101g3, C0101g c0101g4, int i2, boolean z) {
        C0093b b = c0096e.m209b();
        b.m183a(c0101g, c0101g2, i, f, c0101g3, c0101g4, i2);
        if (z) {
            C0101g d = c0096e.m213d();
            C0101g d2 = c0096e.m213d();
            d.f416c = 4;
            d2.f416c = 4;
            b.m181a(d, d2);
        }
        return b;
    }

    public static C0093b m192a(C0096e c0096e, C0101g c0101g, C0101g c0101g2, int i, boolean z) {
        C0093b b = c0096e.m209b();
        b.m182a(c0101g, c0101g2, i);
        if (z) {
            c0096e.m195a(b, 1);
        }
        return b;
    }

    public static C0093b m193a(C0096e c0096e, C0101g c0101g, C0101g c0101g2, C0101g c0101g3, float f, boolean z) {
        C0093b b = c0096e.m209b();
        if (z) {
            b.m181a(c0096e.m213d(), c0096e.m213d());
        }
        b.f384d.m175a(c0101g, -1.0f);
        b.f384d.m175a(c0101g2, 1.0f - f);
        b.f384d.m175a(c0101g3, f);
        return b;
    }

    private C0101g m194a(int i) {
        C0101g c0101g;
        C0101g c0101g2 = (C0101g) this.f396f.f387b.mo39a();
        if (c0101g2 == null) {
            c0101g = new C0101g(i);
        } else {
            c0101g2.m222b();
            c0101g2.f419f = i;
            c0101g = c0101g2;
        }
        if (this.f403n >= f390g) {
            f390g *= 2;
            this.f402m = (C0101g[]) Arrays.copyOf(this.f402m, f390g);
        }
        C0101g[] c0101gArr = this.f402m;
        int i2 = this.f403n;
        this.f403n = i2 + 1;
        c0101gArr[i2] = c0101g;
        return c0101g;
    }

    private void m195a(C0093b c0093b, int i) {
        c0093b.f384d.m175a(m213d(), (float) i);
    }

    public static int m196b(Object obj) {
        C0101g c0101g = ((C0081a) obj).f299i;
        return c0101g != null ? (int) (c0101g.f417d + 0.5f) : 0;
    }

    public static C0093b m197b(C0096e c0096e, C0101g c0101g, C0101g c0101g2, int i, boolean z) {
        C0101g c = c0096e.m212c();
        C0093b b = c0096e.m209b();
        b.m184a(c0101g, c0101g2, c, i);
        if (z) {
            c0096e.m195a(b, (int) (b.f384d.m177b(c) * -1.0f));
        }
        return b;
    }

    public static C0093b m198c(C0096e c0096e, C0101g c0101g, C0101g c0101g2, int i, boolean z) {
        C0101g c = c0096e.m212c();
        C0093b b = c0096e.m209b();
        b.m189b(c0101g, c0101g2, c, i);
        if (z) {
            c0096e.m195a(b, (int) (b.f384d.m177b(c) * -1.0f));
        }
        return b;
    }

    private void m199e() {
        this.f398i *= 2;
        this.f393c = (C0093b[]) Arrays.copyOf(this.f393c, this.f398i);
        this.f396f.f388c = (C0101g[]) Arrays.copyOf(this.f396f.f388c, this.f398i);
        this.f400k = new boolean[this.f398i];
        this.f399j = this.f398i;
        this.f401l = this.f398i;
        this.f392b.f389a.clear();
    }

    private void m200f() {
        for (int i = 0; i < this.f393c.length; i++) {
            Object obj = this.f393c[i];
            if (obj != null) {
                this.f396f.f386a.mo41a(obj);
            }
            this.f393c[i] = null;
        }
    }

    public final int m201a(C0095d c0095d) {
        int i;
        for (i = 0; i < this.f394d; i++) {
            this.f400k[i] = false;
        }
        int i2 = 0;
        i = 0;
        Object obj = null;
        while (obj == null) {
            Object obj2;
            C0101g c0101g;
            int i3 = i + 1;
            int size = c0095d.f389a.size();
            int i4 = 0;
            C0101g c0101g2 = null;
            int i5 = 0;
            while (i4 < size) {
                C0101g c0101g3 = (C0101g) c0095d.f389a.get(i4);
                C0101g c0101g4 = c0101g2;
                int i6 = i5;
                i5 = 5;
                while (i5 >= 0) {
                    float f = c0101g3.f418e[i5];
                    if (c0101g4 == null && f < 0.0f && i5 >= i6) {
                        i6 = i5;
                        c0101g4 = c0101g3;
                    }
                    if (f > 0.0f && i5 > r1) {
                        c0101g4 = null;
                        i6 = i5;
                    }
                    i5--;
                }
                i4++;
                i5 = i6;
                c0101g2 = c0101g4;
            }
            if (c0101g2 == null) {
                i4 = i2;
                obj2 = obj;
                c0101g = c0101g2;
            } else if (this.f400k[c0101g2.f414a]) {
                i4 = i2;
                obj2 = obj;
                c0101g = null;
            } else {
                this.f400k[c0101g2.f414a] = true;
                i = i2 + 1;
                if (i >= this.f394d) {
                    c0101g = c0101g2;
                    i4 = i;
                    size = 1;
                } else {
                    i4 = i;
                    obj2 = obj;
                    c0101g = c0101g2;
                }
            }
            if (c0101g != null) {
                float f2 = Float.MAX_VALUE;
                i = -1;
                i6 = 0;
                while (i6 < this.f395e) {
                    float b;
                    C0093b c0093b = this.f393c[i6];
                    if (c0093b.f381a.f419f != C0100a.f407a) {
                        Object obj3;
                        C0092a c0092a = c0093b.f384d;
                        if (c0092a.f375f != -1) {
                            i2 = c0092a.f375f;
                            i5 = 0;
                            while (i2 != -1 && i5 < c0092a.f370a) {
                                if (c0092a.f372c[i2] == c0101g.f414a) {
                                    obj3 = 1;
                                    break;
                                }
                                i2 = c0092a.f373d[i2];
                                i5++;
                            }
                        }
                        obj3 = null;
                        if (obj3 != null) {
                            b = c0093b.f384d.m177b(c0101g);
                            if (b < 0.0f) {
                                b = (-c0093b.f382b) / b;
                                if (b < f2) {
                                    i = i6;
                                    i6++;
                                    f2 = b;
                                }
                            }
                        }
                    }
                    b = f2;
                    i6++;
                    f2 = b;
                }
                if (i >= 0) {
                    C0093b c0093b2 = this.f393c[i];
                    c0093b2.f381a.f415b = -1;
                    c0093b2.m187a(c0101g);
                    c0093b2.f381a.f415b = i;
                    for (i = 0; i < this.f395e; i++) {
                        this.f393c[i].m188a(c0093b2);
                    }
                    c0095d.m190a(this);
                    try {
                        m208b(c0095d);
                        i2 = i4;
                        i = i3;
                        obj = obj2;
                    } catch (Exception e) {
                        e.printStackTrace();
                        i2 = i4;
                        i = i3;
                        obj = obj2;
                    }
                } else {
                    i2 = i4;
                    i = i3;
                    obj = 1;
                }
            } else {
                i2 = i4;
                i = i3;
                obj = 1;
            }
        }
        return i;
    }

    public final C0101g m202a(Object obj) {
        C0101g c0101g = null;
        if (obj != null) {
            if (this.f394d + 1 >= this.f399j) {
                m199e();
            }
            if (obj instanceof C0081a) {
                c0101g = ((C0081a) obj).f299i;
                if (c0101g == null) {
                    ((C0081a) obj).m99a();
                    c0101g = ((C0081a) obj).f299i;
                }
                if (c0101g.f414a == -1 || c0101g.f414a > this.f391a || this.f396f.f388c[c0101g.f414a] == null) {
                    if (c0101g.f414a != -1) {
                        c0101g.m222b();
                    }
                    this.f391a++;
                    this.f394d++;
                    c0101g.f414a = this.f391a;
                    c0101g.f419f = C0100a.f407a;
                    this.f396f.f388c[this.f391a] = c0101g;
                }
            }
        }
        return c0101g;
    }

    public final void m203a() {
        int i;
        for (C0101g c0101g : this.f396f.f388c) {
            if (c0101g != null) {
                c0101g.m222b();
            }
        }
        this.f396f.f387b.mo40a(this.f402m, this.f403n);
        this.f403n = 0;
        Arrays.fill(this.f396f.f388c, null);
        if (this.f397h != null) {
            this.f397h.clear();
        }
        this.f391a = 0;
        this.f392b.f389a.clear();
        this.f394d = 1;
        for (i = 0; i < this.f395e; i++) {
            this.f393c[i].f383c = false;
        }
        m200f();
        this.f395e = 0;
    }

    public final void m204a(C0093b c0093b) {
        if (c0093b != null) {
            int i;
            int i2;
            if (this.f395e + 1 >= this.f401l || this.f394d + 1 >= this.f399j) {
                m199e();
            }
            if (!c0093b.f385e) {
                C0092a c0092a;
                C0092a c0092a2;
                C0101g c0101g;
                if (this.f395e > 0) {
                    c0092a = c0093b.f384d;
                    C0093b[] c0093bArr = this.f393c;
                    i = c0092a.f375f;
                    i2 = 0;
                    while (i != -1 && i2 < c0092a.f370a) {
                        C0101g c0101g2 = c0092a.f371b.f388c[c0092a.f372c[i]];
                        if (c0101g2.f415b != -1) {
                            float f = c0092a.f374e[i];
                            c0092a.m172a(c0101g2);
                            C0093b c0093b2 = c0093bArr[c0101g2.f415b];
                            if (!c0093b2.f385e) {
                                c0092a2 = c0093b2.f384d;
                                i = c0092a2.f375f;
                                i2 = 0;
                                while (i != -1 && i2 < c0092a2.f370a) {
                                    c0092a.m178b(c0092a.f371b.f388c[c0092a2.f372c[i]], c0092a2.f374e[i] * f);
                                    i = c0092a2.f373d[i];
                                    i2++;
                                }
                            }
                            c0093b.f382b += c0093b2.f382b * f;
                            c0093b2.f381a.m221a(c0093b);
                            i = c0092a.f375f;
                            i2 = 0;
                        } else {
                            i = c0092a.f373d[i];
                            i2++;
                        }
                    }
                    if (c0093b.f384d.f370a == 0) {
                        c0093b.f385e = true;
                    }
                }
                if (c0093b.f382b < 0.0f) {
                    c0093b.f382b *= -1.0f;
                    c0092a = c0093b.f384d;
                    i = c0092a.f375f;
                    i2 = 0;
                    while (i != -1 && i2 < c0092a.f370a) {
                        float[] fArr = c0092a.f374e;
                        fArr[i] = fArr[i] * -1.0f;
                        i = c0092a.f373d[i];
                        i2++;
                    }
                }
                c0092a2 = c0093b.f384d;
                int i3 = 0;
                int i4 = c0092a2.f375f;
                C0101g c0101g3 = null;
                C0101g c0101g4 = null;
                while (i4 != -1 && i3 < c0092a2.f370a) {
                    float f2;
                    float f3 = c0092a2.f374e[i4];
                    if (f3 < 0.0f) {
                        if (f3 > -0.001f) {
                            c0092a2.f374e[i4] = 0.0f;
                            f2 = 0.0f;
                        }
                        f2 = f3;
                    } else {
                        if (f3 < 0.001f) {
                            c0092a2.f374e[i4] = 0.0f;
                            f2 = 0.0f;
                        }
                        f2 = f3;
                    }
                    if (f2 != 0.0f) {
                        c0101g = c0092a2.f371b.f388c[c0092a2.f372c[i4]];
                        if (c0101g.f419f == C0100a.f407a) {
                            if (f2 < 0.0f) {
                                break;
                            } else if (c0101g3 == null) {
                                c0101g3 = c0101g4;
                                i3++;
                                i4 = c0092a2.f373d[i4];
                                c0101g4 = c0101g3;
                                c0101g3 = c0101g;
                            }
                        } else if (f2 < 0.0f && (c0101g4 == null || c0101g.f416c < c0101g4.f416c)) {
                            C0101g c0101g5 = c0101g3;
                            c0101g3 = c0101g;
                            c0101g = c0101g5;
                            i3++;
                            i4 = c0092a2.f373d[i4];
                            c0101g4 = c0101g3;
                            c0101g3 = c0101g;
                        }
                    }
                    c0101g = c0101g3;
                    c0101g3 = c0101g4;
                    i3++;
                    i4 = c0092a2.f373d[i4];
                    c0101g4 = c0101g3;
                    c0101g3 = c0101g;
                }
                c0101g = c0101g3 != null ? c0101g3 : c0101g4;
                if (c0101g != null) {
                    c0093b.m187a(c0101g);
                }
                if (c0093b.f384d.f370a == 0) {
                    c0093b.f385e = true;
                }
                Object obj = (c0093b.f381a == null || (c0093b.f381a.f419f != C0100a.f407a && c0093b.f382b < 0.0f)) ? null : 1;
                if (obj == null) {
                    return;
                }
            }
            if (this.f393c[this.f395e] != null) {
                this.f396f.f386a.mo41a(this.f393c[this.f395e]);
            }
            if (!c0093b.f385e) {
                c0093b.m186a();
            }
            this.f393c[this.f395e] = c0093b;
            c0093b.f381a.f415b = this.f395e;
            this.f395e++;
            i = c0093b.f381a.f421h;
            if (i > 0) {
                while (this.f404o.length < i) {
                    this.f404o = new C0093b[(this.f404o.length * 2)];
                }
                C0093b[] c0093bArr2 = this.f404o;
                for (i2 = 0; i2 < i; i2++) {
                    c0093bArr2[i2] = c0093b.f381a.f420g[i2];
                }
                for (i2 = 0; i2 < i; i2++) {
                    C0093b c0093b3 = c0093bArr2[i2];
                    if (c0093b3 != c0093b) {
                        c0093b3.f384d.m174a(c0093b3, c0093b);
                        c0093b3.m186a();
                    }
                }
            }
        }
    }

    public final void m205a(C0101g c0101g, int i) {
        int i2 = c0101g.f415b;
        C0093b c0093b;
        if (c0101g.f415b != -1) {
            c0093b = this.f393c[i2];
            if (c0093b.f385e) {
                c0093b.f382b = (float) i;
                return;
            }
            c0093b = m209b();
            c0093b.m180a(c0101g, i);
            m204a(c0093b);
            return;
        }
        c0093b = m209b();
        c0093b.f381a = c0101g;
        c0101g.f417d = (float) i;
        c0093b.f382b = (float) i;
        c0093b.f385e = true;
        m204a(c0093b);
    }

    public final void m206a(C0101g c0101g, C0101g c0101g2, int i, float f, C0101g c0101g3, C0101g c0101g4, int i2) {
        C0093b b = m209b();
        b.m183a(c0101g, c0101g2, i, f, c0101g3, c0101g4, i2);
        C0101g d = m213d();
        C0101g d2 = m213d();
        d.f416c = 4;
        d2.f416c = 4;
        b.m181a(d, d2);
        m204a(b);
    }

    public final void m207a(C0101g c0101g, C0101g c0101g2, int i, int i2) {
        C0093b b = m209b();
        C0101g c = m212c();
        c.f416c = i2;
        b.m184a(c0101g, c0101g2, c, i);
        m204a(b);
    }

    public final int m208b(C0095d c0095d) {
        Object obj;
        int i;
        int i2 = 0;
        while (i2 < this.f395e) {
            if (this.f393c[i2].f381a.f419f != C0100a.f407a && this.f393c[i2].f382b < 0.0f) {
                obj = 1;
                break;
            }
            i2++;
        }
        obj = null;
        if (obj != null) {
            Object obj2 = null;
            i2 = 0;
            while (obj2 == null) {
                int i3 = i2 + 1;
                float f = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                i = -1;
                for (i2 = 0; i2 < this.f395e; i2++) {
                    C0093b c0093b = this.f393c[i2];
                    if (c0093b.f381a.f419f != C0100a.f407a && c0093b.f382b < 0.0f) {
                        float f2 = f;
                        int i6 = i4;
                        i4 = i5;
                        i5 = i;
                        for (i = 1; i < this.f394d; i++) {
                            C0101g c0101g = this.f396f.f388c[i];
                            float b = c0093b.f384d.m177b(c0101g);
                            if (b > 0.0f) {
                                float f3 = f2;
                                int i7 = 0;
                                while (i7 < 6) {
                                    float f4 = c0101g.f418e[i7] / b;
                                    if ((f4 >= f3 || i7 != r6) && i7 <= r6) {
                                        f4 = f3;
                                    } else {
                                        i5 = i;
                                        i4 = i2;
                                        i6 = i7;
                                    }
                                    i7++;
                                    f3 = f4;
                                }
                                f2 = f3;
                            }
                        }
                        i = i5;
                        i5 = i4;
                        i4 = i6;
                        f = f2;
                    }
                }
                if (i5 != -1) {
                    C0093b c0093b2 = this.f393c[i5];
                    c0093b2.f381a.f415b = -1;
                    c0093b2.m187a(this.f396f.f388c[i]);
                    c0093b2.f381a.f415b = i5;
                    for (i2 = 0; i2 < this.f395e; i2++) {
                        this.f393c[i2].m188a(c0093b2);
                    }
                    c0095d.m190a(this);
                    i2 = i3;
                } else {
                    obj2 = 1;
                    i2 = i3;
                }
            }
        } else {
            i2 = 0;
        }
        i = 0;
        while (i < this.f395e && (this.f393c[i].f381a.f419f == C0100a.f407a || this.f393c[i].f382b >= 0.0f)) {
            i++;
        }
        return i2;
    }

    public final C0093b m209b() {
        C0093b c0093b = (C0093b) this.f396f.f386a.mo39a();
        if (c0093b == null) {
            return new C0093b(this.f396f);
        }
        c0093b.f381a = null;
        C0092a c0092a = c0093b.f384d;
        c0092a.f375f = -1;
        c0092a.f376g = -1;
        c0092a.f377h = false;
        c0092a.f370a = 0;
        c0093b.f382b = 0.0f;
        c0093b.f385e = false;
        return c0093b;
    }

    public final void m210b(C0101g c0101g, C0101g c0101g2, int i, int i2) {
        C0093b b = m209b();
        C0101g c = m212c();
        c.f416c = i2;
        b.m189b(c0101g, c0101g2, c, i);
        m204a(b);
    }

    public final C0093b m211c(C0101g c0101g, C0101g c0101g2, int i, int i2) {
        C0093b b = m209b();
        b.m182a(c0101g, c0101g2, i);
        C0101g d = m213d();
        C0101g d2 = m213d();
        d.f416c = i2;
        d2.f416c = i2;
        b.m181a(d, d2);
        m204a(b);
        return b;
    }

    public final C0101g m212c() {
        if (this.f394d + 1 >= this.f399j) {
            m199e();
        }
        C0101g a = m194a(C0100a.f409c);
        this.f391a++;
        this.f394d++;
        a.f414a = this.f391a;
        this.f396f.f388c[this.f391a] = a;
        return a;
    }

    public final C0101g m213d() {
        if (this.f394d + 1 >= this.f399j) {
            m199e();
        }
        C0101g a = m194a(C0100a.f410d);
        this.f391a++;
        this.f394d++;
        a.f414a = this.f391a;
        this.f396f.f388c[this.f391a] = a;
        return a;
    }
}
