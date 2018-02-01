package android.support.constraint.p008a.p009a;

import android.support.constraint.p008a.C0093b;
import android.support.constraint.p008a.C0094c;
import android.support.constraint.p008a.C0096e;
import android.support.constraint.p008a.C0101g;
import android.support.constraint.p008a.p009a.C0081a.C0078a;
import android.support.constraint.p008a.p009a.C0081a.C0079b;
import android.support.constraint.p008a.p009a.C0081a.C0080c;
import java.util.ArrayList;

public class C0084b {
    public static float f307F = 0.5f;
    public int f308A = 0;
    protected int f309B;
    protected int f310C;
    public int f311D;
    public int f312E;
    public float f313G = f307F;
    public float f314H = f307F;
    public int f315I = C0083a.f302a;
    public int f316J = C0083a.f302a;
    public Object f317K;
    public int f318L = 0;
    String f319M = null;
    int f320N;
    int f321O;
    int f322P;
    int f323Q;
    boolean f324R;
    boolean f325S;
    boolean f326T;
    boolean f327U;
    boolean f328V;
    boolean f329W;
    public int f330X = 0;
    public int f331Y = 0;
    boolean f332Z;
    public int f333a = -1;
    boolean aa;
    public float ab = 0.0f;
    public float ac = 0.0f;
    C0084b ad = null;
    C0084b ae = null;
    private int af = 0;
    private int ag = 0;
    private int ah = 0;
    private int ai = 0;
    private int aj = 0;
    private int ak = 0;
    private int al = 0;
    private int am = 0;
    private int an = 0;
    private String ao = null;
    public int f334b = -1;
    public int f335c = 0;
    public int f336d = 0;
    public int f337e = 0;
    public int f338f = 0;
    public int f339g = 0;
    public int f340h = 0;
    C0081a f341i = new C0081a(this, C0080c.LEFT);
    C0081a f342j = new C0081a(this, C0080c.TOP);
    C0081a f343k = new C0081a(this, C0080c.RIGHT);
    C0081a f344l = new C0081a(this, C0080c.BOTTOM);
    C0081a f345m = new C0081a(this, C0080c.BASELINE);
    C0081a f346n = new C0081a(this, C0080c.CENTER_X);
    C0081a f347o = new C0081a(this, C0080c.CENTER_Y);
    C0081a f348p = new C0081a(this, C0080c.CENTER);
    protected ArrayList<C0081a> f349q = new ArrayList();
    C0084b f350r = null;
    int f351s = 0;
    int f352t = 0;
    protected float f353u = 0.0f;
    protected int f354v = -1;
    protected int f355w = 0;
    protected int f356x = 0;
    protected int f357y = 0;
    protected int f358z = 0;

    public enum C0083a {
        ;

        static {
            f302a = 1;
            f303b = 2;
            f304c = 3;
            f305d = 4;
            f306e = new int[]{f302a, f303b, f304c, f305d};
        }
    }

    public C0084b() {
        this.f349q.add(this.f341i);
        this.f349q.add(this.f342j);
        this.f349q.add(this.f343k);
        this.f349q.add(this.f344l);
        this.f349q.add(this.f346n);
        this.f349q.add(this.f347o);
        this.f349q.add(this.f345m);
    }

    private void m104a(C0096e c0096e, boolean z, boolean z2, C0081a c0081a, C0081a c0081a2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        int i8;
        C0101g a = c0096e.m202a((Object) c0081a);
        C0101g a2 = c0096e.m202a((Object) c0081a2);
        C0101g a3 = c0096e.m202a(c0081a.f293c);
        C0101g a4 = c0096e.m202a(c0081a2.f293c);
        int b = c0081a.m101b();
        int b2 = c0081a2.m101b();
        if (this.f318L == 8) {
            i8 = 0;
            z2 = true;
        } else {
            i8 = i3;
        }
        if (a3 == null && a4 == null) {
            c0096e.m204a(c0096e.m209b().m180a(a, i));
            if (!z3) {
                if (z) {
                    c0096e.m204a(C0096e.m192a(c0096e, a2, a, i4, true));
                } else if (z2) {
                    c0096e.m204a(C0096e.m192a(c0096e, a2, a, i8, false));
                } else {
                    c0096e.m204a(c0096e.m209b().m180a(a2, i2));
                }
            }
        } else if (a3 != null && a4 == null) {
            c0096e.m204a(c0096e.m209b().m182a(a, a3, b));
            if (z) {
                c0096e.m204a(C0096e.m192a(c0096e, a2, a, i4, true));
            } else if (!z3) {
                if (z2) {
                    c0096e.m204a(c0096e.m209b().m182a(a2, a, i8));
                } else {
                    c0096e.m204a(c0096e.m209b().m180a(a2, i2));
                }
            }
        } else if (a3 == null && a4 != null) {
            c0096e.m204a(c0096e.m209b().m182a(a2, a4, b2 * -1));
            if (z) {
                c0096e.m204a(C0096e.m192a(c0096e, a2, a, i4, true));
            } else if (!z3) {
                if (z2) {
                    c0096e.m204a(c0096e.m209b().m182a(a2, a, i8));
                } else {
                    c0096e.m204a(c0096e.m209b().m180a(a, i));
                }
            }
        } else if (z2) {
            if (z) {
                c0096e.m204a(C0096e.m192a(c0096e, a2, a, i4, true));
            } else {
                c0096e.m204a(c0096e.m209b().m182a(a2, a, i8));
            }
            if (c0081a.f296f != c0081a2.f296f) {
                C0101g c;
                if (c0081a.f296f == C0079b.f278b) {
                    c0096e.m204a(c0096e.m209b().m182a(a, a3, b));
                    c = c0096e.m212c();
                    C0093b b3 = c0096e.m209b();
                    b3.m189b(a2, a4, c, b2 * -1);
                    c0096e.m204a(b3);
                    return;
                }
                c = c0096e.m212c();
                C0093b b4 = c0096e.m209b();
                b4.m184a(a, a3, c, b);
                c0096e.m204a(b4);
                c0096e.m204a(c0096e.m209b().m182a(a2, a4, b2 * -1));
            } else if (a3 == a4) {
                c0096e.m204a(C0096e.m191a(c0096e, a, a3, 0, 0.5f, a4, a2, 0, true));
            } else if (!z4) {
                c0096e.m204a(C0096e.m197b(c0096e, a, a3, b, c0081a.f297g != C0078a.f275b));
                c0096e.m204a(C0096e.m198c(c0096e, a2, a4, b2 * -1, c0081a2.f297g != C0078a.f275b));
                c0096e.m204a(C0096e.m191a(c0096e, a, a3, b, f, a4, a2, b2, false));
            }
        } else if (z3) {
            c0096e.m207a(a, a3, b, 3);
            c0096e.m210b(a2, a4, b2 * -1, 3);
            c0096e.m204a(C0096e.m191a(c0096e, a, a3, b, f, a4, a2, b2, true));
        } else if (!z4) {
            if (i5 == 1) {
                if (i6 > i8) {
                    i8 = i6;
                }
                if (i7 > 0) {
                    if (i7 >= i8) {
                        c0096e.m210b(a2, a, i7, 3);
                    }
                    c0096e.m211c(a2, a, i7, 3);
                }
                i7 = i8;
                c0096e.m211c(a2, a, i7, 3);
            } else if (i6 == 0 && i7 == 0) {
                c0096e.m204a(c0096e.m209b().m182a(a, a3, b));
                c0096e.m204a(c0096e.m209b().m182a(a2, a4, b2 * -1));
                return;
            } else if (i7 > 0) {
                c0096e.m210b(a2, a, i7, 3);
            }
            c0096e.m207a(a, a3, b, 2);
            c0096e.m210b(a2, a4, -b2, 2);
            c0096e.m206a(a, a3, b, f, a4, a2, b2);
        }
    }

    public C0081a mo35a(C0080c c0080c) {
        switch (c0080c) {
            case LEFT:
                return this.f341i;
            case TOP:
                return this.f342j;
            case RIGHT:
                return this.f343k;
            case BOTTOM:
                return this.f344l;
            case BASELINE:
                return this.f345m;
            case CENTER_X:
                return this.f346n;
            case CENTER_Y:
                return this.f347o;
            case CENTER:
                return this.f348p;
            default:
                return null;
        }
    }

    public void mo30a() {
        this.f341i.m102c();
        this.f342j.m102c();
        this.f343k.m102c();
        this.f344l.m102c();
        this.f345m.m102c();
        this.f346n.m102c();
        this.f347o.m102c();
        this.f348p.m102c();
        this.f350r = null;
        this.f351s = 0;
        this.f352t = 0;
        this.f353u = 0.0f;
        this.f354v = -1;
        this.f355w = 0;
        this.f356x = 0;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.f357y = 0;
        this.f358z = 0;
        this.f308A = 0;
        this.f309B = 0;
        this.f310C = 0;
        this.f311D = 0;
        this.f312E = 0;
        this.f313G = f307F;
        this.f314H = f307F;
        this.f315I = C0083a.f302a;
        this.f316J = C0083a.f302a;
        this.f317K = null;
        this.an = 0;
        this.f318L = 0;
        this.f319M = null;
        this.ao = null;
        this.f328V = false;
        this.f329W = false;
        this.f330X = 0;
        this.f331Y = 0;
        this.f332Z = false;
        this.aa = false;
        this.ab = 0.0f;
        this.ac = 0.0f;
        this.f333a = -1;
        this.f334b = -1;
    }

    public final void m107a(int i) {
        this.f355w = i;
    }

    public final void m108a(int i, int i2) {
        this.f355w = i;
        this.f356x = i2;
    }

    public final void m109a(C0080c c0080c, C0084b c0084b, C0080c c0080c2, int i, int i2) {
        mo35a(c0080c).m100a(c0084b.mo35a(c0080c2), i, i2, C0079b.f278b, 0, true);
    }

    public void mo31a(C0094c c0094c) {
        this.f341i.m99a();
        this.f342j.m99a();
        this.f343k.m99a();
        this.f344l.m99a();
        this.f345m.m99a();
        this.f348p.m99a();
        this.f346n.m99a();
        this.f347o.m99a();
    }

    public void mo36a(C0096e c0096e) {
        C0101g a;
        boolean z;
        boolean z2;
        float f;
        int i;
        Object obj;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        C0081a c0081a;
        C0093b b;
        C0101g d;
        C0101g a2 = c0096e.m202a(this.f341i);
        C0101g a3 = c0096e.m202a(this.f343k);
        C0101g a4 = c0096e.m202a(this.f342j);
        C0101g a5 = c0096e.m202a(this.f344l);
        C0101g a6 = c0096e.m202a(this.f345m);
        if (this.f350r != null) {
            boolean z5;
            boolean z6;
            C0093b b2;
            if ((this.f341i.f293c == null || this.f341i.f293c.f293c != this.f341i) && (this.f343k.f293c == null || this.f343k.f293c.f293c != this.f343k)) {
                z5 = false;
            } else {
                ((C0086c) this.f350r).m158a(this, 0);
                z5 = true;
            }
            if ((this.f342j.f293c == null || this.f342j.f293c.f293c != this.f342j) && (this.f344l.f293c == null || this.f344l.f293c.f293c != this.f344l)) {
                z6 = false;
            } else {
                ((C0086c) this.f350r).m158a(this, 1);
                z6 = true;
            }
            if (this.f350r.f315I == C0083a.f303b && !z5) {
                if (this.f341i.f293c == null || this.f341i.f293c.f291a != this.f350r) {
                    a = c0096e.m202a(this.f350r.f341i);
                    b2 = c0096e.m209b();
                    b2.m184a(a2, a, c0096e.m212c(), 0);
                    c0096e.m204a(b2);
                } else if (this.f341i.f293c != null && this.f341i.f293c.f291a == this.f350r) {
                    this.f341i.f297g = C0078a.f275b;
                }
                if (this.f343k.f293c == null || this.f343k.f293c.f291a != this.f350r) {
                    a = c0096e.m202a(this.f350r.f343k);
                    b2 = c0096e.m209b();
                    b2.m184a(a, a3, c0096e.m212c(), 0);
                    c0096e.m204a(b2);
                } else if (this.f343k.f293c != null && this.f343k.f293c.f291a == this.f350r) {
                    this.f343k.f297g = C0078a.f275b;
                }
            }
            if (this.f350r.f316J == C0083a.f303b && !z6) {
                if (this.f342j.f293c == null || this.f342j.f293c.f291a != this.f350r) {
                    a = c0096e.m202a(this.f350r.f342j);
                    b2 = c0096e.m209b();
                    b2.m184a(a4, a, c0096e.m212c(), 0);
                    c0096e.m204a(b2);
                } else if (this.f342j.f293c != null && this.f342j.f293c.f291a == this.f350r) {
                    this.f342j.f297g = C0078a.f275b;
                }
                if (this.f344l.f293c == null || this.f344l.f293c.f291a != this.f350r) {
                    a = c0096e.m202a(this.f350r.f344l);
                    b2 = c0096e.m209b();
                    b2.m184a(a, a5, c0096e.m212c(), 0);
                    c0096e.m204a(b2);
                    z = z6;
                    z2 = z5;
                } else if (this.f344l.f293c != null && this.f344l.f293c.f291a == this.f350r) {
                    this.f344l.f297g = C0078a.f275b;
                }
            }
            z = z6;
            z2 = z5;
        } else {
            z = false;
            z2 = false;
        }
        int i4 = this.f351s;
        if (i4 < this.f309B) {
            i4 = this.f309B;
        }
        int i5 = this.f352t;
        if (i5 < this.f310C) {
            i5 = this.f310C;
        }
        boolean z7 = this.f315I != C0083a.f304c;
        boolean z8 = this.f316J != C0083a.f304c;
        boolean z9 = (z7 || this.f341i == null || this.f343k == null || !(this.f341i.f293c == null || this.f343k.f293c == null)) ? z7 : true;
        z7 = (z8 || this.f342j == null || this.f344l == null || (!(this.f342j.f293c == null || this.f344l.f293c == null) || (this.f308A != 0 && (this.f345m == null || !(this.f342j.f293c == null || this.f345m.f293c == null))))) ? z8 : true;
        Object obj2 = null;
        int i6 = this.f354v;
        float f2 = this.f353u;
        if (this.f353u > 0.0f && this.f318L != 8) {
            if (this.f315I == C0083a.f304c && this.f316J == C0083a.f304c) {
                obj2 = 1;
                if (z9 && !z7) {
                    f = f2;
                    i = 0;
                    obj = 1;
                    z3 = z7;
                    i2 = i5;
                    i3 = i4;
                    z8 = z9;
                    if (obj == null) {
                    }
                    if (this.f315I != C0083a.f303b) {
                    }
                    if (this.f333a != 2) {
                        if (z4) {
                        }
                        m104a(c0096e, z7, z8, this.f341i, this.f343k, this.f355w, this.f355w + i3, i3, this.f309B, this.f313G, z4, z2, this.f335c, this.f337e, this.f338f);
                    }
                    if (this.f334b != 2) {
                        if (this.f316J != C0083a.f303b) {
                        }
                        if (obj == null) {
                        }
                        if (this.f308A <= 0) {
                            c0081a = this.f344l;
                            c0096e.m211c(a6, a4, this.f308A, 5);
                            if (this.f345m.f293c == null) {
                                i3 = this.f308A;
                                c0081a = this.f345m;
                            } else {
                                i3 = i2;
                            }
                            if (z4) {
                            }
                            m104a(c0096e, z7, z3, this.f342j, c0081a, this.f356x, this.f356x + i3, i3, this.f310C, this.f314H, z4, z, this.f336d, this.f339g, this.f340h);
                            c0096e.m211c(a5, a4, i2, 5);
                        } else {
                            if (z4) {
                            }
                            m104a(c0096e, z7, z3, this.f342j, this.f344l, this.f356x, this.f356x + i2, i2, this.f310C, this.f314H, z4, z, this.f336d, this.f339g, this.f340h);
                        }
                        if (obj == null) {
                            b = c0096e.m209b();
                            if (i != 0) {
                                c0096e.m204a(b.m185a(a3, a2, a5, a4, f));
                            } else if (i != 1) {
                                c0096e.m204a(b.m185a(a5, a4, a3, a2, f));
                            } else {
                                if (this.f337e > 0) {
                                    c0096e.m207a(a3, a2, this.f337e, 3);
                                }
                                if (this.f339g > 0) {
                                    c0096e.m207a(a5, a4, this.f339g, 3);
                                }
                                b.m185a(a3, a2, a5, a4, f);
                                d = c0096e.m213d();
                                a = c0096e.m213d();
                                d.f416c = 4;
                                a.f416c = 4;
                                b.m181a(d, a);
                                c0096e.m204a(b);
                            }
                        }
                    }
                } else if (!z9 && z7) {
                    i6 = 1;
                    if (this.f354v == -1) {
                        f = 1.0f / f2;
                        i = 1;
                        int i7 = 1;
                        z3 = z7;
                        i2 = i5;
                        i3 = i4;
                        z8 = z9;
                        if (obj == null) {
                        }
                        if (this.f315I != C0083a.f303b) {
                        }
                        if (this.f333a != 2) {
                            if (z4) {
                            }
                            m104a(c0096e, z7, z8, this.f341i, this.f343k, this.f355w, this.f355w + i3, i3, this.f309B, this.f313G, z4, z2, this.f335c, this.f337e, this.f338f);
                        }
                        if (this.f334b != 2) {
                            if (this.f316J != C0083a.f303b) {
                            }
                            if (obj == null) {
                            }
                            if (this.f308A <= 0) {
                                if (z4) {
                                }
                                m104a(c0096e, z7, z3, this.f342j, this.f344l, this.f356x, this.f356x + i2, i2, this.f310C, this.f314H, z4, z, this.f336d, this.f339g, this.f340h);
                            } else {
                                c0081a = this.f344l;
                                c0096e.m211c(a6, a4, this.f308A, 5);
                                if (this.f345m.f293c == null) {
                                    i3 = i2;
                                } else {
                                    i3 = this.f308A;
                                    c0081a = this.f345m;
                                }
                                if (z4) {
                                }
                                m104a(c0096e, z7, z3, this.f342j, c0081a, this.f356x, this.f356x + i3, i3, this.f310C, this.f314H, z4, z, this.f336d, this.f339g, this.f340h);
                                c0096e.m211c(a5, a4, i2, 5);
                            }
                            if (obj == null) {
                                b = c0096e.m209b();
                                if (i != 0) {
                                    c0096e.m204a(b.m185a(a3, a2, a5, a4, f));
                                } else if (i != 1) {
                                    if (this.f337e > 0) {
                                        c0096e.m207a(a3, a2, this.f337e, 3);
                                    }
                                    if (this.f339g > 0) {
                                        c0096e.m207a(a5, a4, this.f339g, 3);
                                    }
                                    b.m185a(a3, a2, a5, a4, f);
                                    d = c0096e.m213d();
                                    a = c0096e.m213d();
                                    d.f416c = 4;
                                    a.f416c = 4;
                                    b.m181a(d, a);
                                    c0096e.m204a(b);
                                } else {
                                    c0096e.m204a(b.m185a(a5, a4, a3, a2, f));
                                }
                            }
                        }
                    }
                }
            }
            C0101g a7;
            C0101g a8;
            if (this.f315I == C0083a.f304c) {
                i3 = (int) (((float) this.f352t) * f2);
                f = f2;
                i = 0;
                obj = null;
                z3 = z7;
                i2 = i5;
                z8 = true;
            } else if (this.f316J == C0083a.f304c) {
                float f3 = this.f354v == -1 ? 1.0f / f2 : f2;
                i2 = (int) (((float) this.f351s) * f3);
                f = f3;
                i = 1;
                obj = null;
                z3 = true;
                i3 = i4;
                z8 = z9;
            }
            z4 = obj == null && (i == 0 || i == -1);
            z7 = this.f315I != C0083a.f303b && (this instanceof C0086c);
            if (this.f333a != 2) {
                if (z4 || this.f341i.f293c == null || this.f343k.f293c == null) {
                    m104a(c0096e, z7, z8, this.f341i, this.f343k, this.f355w, this.f355w + i3, i3, this.f309B, this.f313G, z4, z2, this.f335c, this.f337e, this.f338f);
                } else {
                    d = c0096e.m202a(this.f341i);
                    a7 = c0096e.m202a(this.f343k);
                    a = c0096e.m202a(this.f341i.f293c);
                    a8 = c0096e.m202a(this.f343k.f293c);
                    c0096e.m207a(d, a, this.f341i.m101b(), 3);
                    c0096e.m210b(a7, a8, this.f343k.m101b() * -1, 3);
                    if (!z2) {
                        c0096e.m206a(d, a, this.f341i.m101b(), this.f313G, a8, a7, this.f343k.m101b());
                    }
                }
            }
            if (this.f334b != 2) {
                z7 = this.f316J != C0083a.f303b && (this instanceof C0086c);
                z4 = obj == null && (i == 1 || i == -1);
                if (this.f308A <= 0) {
                    c0081a = this.f344l;
                    c0096e.m211c(a6, a4, this.f308A, 5);
                    if (this.f345m.f293c == null) {
                        i3 = this.f308A;
                        c0081a = this.f345m;
                    } else {
                        i3 = i2;
                    }
                    if (z4 || this.f342j.f293c == null || this.f344l.f293c == null) {
                        m104a(c0096e, z7, z3, this.f342j, c0081a, this.f356x, this.f356x + i3, i3, this.f310C, this.f314H, z4, z, this.f336d, this.f339g, this.f340h);
                        c0096e.m211c(a5, a4, i2, 5);
                    } else {
                        d = c0096e.m202a(this.f342j);
                        a7 = c0096e.m202a(this.f344l);
                        a = c0096e.m202a(this.f342j.f293c);
                        a8 = c0096e.m202a(this.f344l.f293c);
                        c0096e.m207a(d, a, this.f342j.m101b(), 3);
                        c0096e.m210b(a7, a8, this.f344l.m101b() * -1, 3);
                        if (!z) {
                            c0096e.m206a(d, a, this.f342j.m101b(), this.f314H, a8, a7, this.f344l.m101b());
                        }
                    }
                } else if (z4 || this.f342j.f293c == null || this.f344l.f293c == null) {
                    m104a(c0096e, z7, z3, this.f342j, this.f344l, this.f356x, this.f356x + i2, i2, this.f310C, this.f314H, z4, z, this.f336d, this.f339g, this.f340h);
                } else {
                    d = c0096e.m202a(this.f342j);
                    a7 = c0096e.m202a(this.f344l);
                    a = c0096e.m202a(this.f342j.f293c);
                    a8 = c0096e.m202a(this.f344l.f293c);
                    c0096e.m207a(d, a, this.f342j.m101b(), 3);
                    c0096e.m210b(a7, a8, this.f344l.m101b() * -1, 3);
                    if (!z) {
                        c0096e.m206a(d, a, this.f342j.m101b(), this.f314H, a8, a7, this.f344l.m101b());
                    }
                }
                if (obj == null) {
                    b = c0096e.m209b();
                    if (i != 0) {
                        c0096e.m204a(b.m185a(a3, a2, a5, a4, f));
                    } else if (i != 1) {
                        c0096e.m204a(b.m185a(a5, a4, a3, a2, f));
                    } else {
                        if (this.f337e > 0) {
                            c0096e.m207a(a3, a2, this.f337e, 3);
                        }
                        if (this.f339g > 0) {
                            c0096e.m207a(a5, a4, this.f339g, 3);
                        }
                        b.m185a(a3, a2, a5, a4, f);
                        d = c0096e.m213d();
                        a = c0096e.m213d();
                        d.f416c = 4;
                        a.f416c = 4;
                        b.m181a(d, a);
                        c0096e.m204a(b);
                    }
                }
            }
        }
        f = f2;
        i = i6;
        obj = obj2;
        z3 = z7;
        i2 = i5;
        i3 = i4;
        z8 = z9;
        if (obj == null) {
        }
        if (this.f315I != C0083a.f303b) {
        }
        if (this.f333a != 2) {
            if (z4) {
            }
            m104a(c0096e, z7, z8, this.f341i, this.f343k, this.f355w, this.f355w + i3, i3, this.f309B, this.f313G, z4, z2, this.f335c, this.f337e, this.f338f);
        }
        if (this.f334b != 2) {
            if (this.f316J != C0083a.f303b) {
            }
            if (obj == null) {
            }
            if (this.f308A <= 0) {
                if (z4) {
                }
                m104a(c0096e, z7, z3, this.f342j, this.f344l, this.f356x, this.f356x + i2, i2, this.f310C, this.f314H, z4, z, this.f336d, this.f339g, this.f340h);
            } else {
                c0081a = this.f344l;
                c0096e.m211c(a6, a4, this.f308A, 5);
                if (this.f345m.f293c == null) {
                    i3 = i2;
                } else {
                    i3 = this.f308A;
                    c0081a = this.f345m;
                }
                if (z4) {
                }
                m104a(c0096e, z7, z3, this.f342j, c0081a, this.f356x, this.f356x + i3, i3, this.f310C, this.f314H, z4, z, this.f336d, this.f339g, this.f340h);
                c0096e.m211c(a5, a4, i2, 5);
            }
            if (obj == null) {
                b = c0096e.m209b();
                if (i != 0) {
                    c0096e.m204a(b.m185a(a3, a2, a5, a4, f));
                } else if (i != 1) {
                    if (this.f337e > 0) {
                        c0096e.m207a(a3, a2, this.f337e, 3);
                    }
                    if (this.f339g > 0) {
                        c0096e.m207a(a5, a4, this.f339g, 3);
                    }
                    b.m185a(a3, a2, a5, a4, f);
                    d = c0096e.m213d();
                    a = c0096e.m213d();
                    d.f416c = 4;
                    a.f416c = 4;
                    b.m181a(d, a);
                    c0096e.m204a(b);
                } else {
                    c0096e.m204a(b.m185a(a5, a4, a3, a2, f));
                }
            }
        }
    }

    public final void m112a(String str) {
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f353u = 0.0f;
            return;
        }
        float parseFloat;
        int i2 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (!substring.equalsIgnoreCase("W")) {
                i = substring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i2 = i;
            i = indexOf + 1;
        }
        indexOf = str.indexOf(58);
        String substring2;
        if (indexOf < 0 || indexOf >= length - 1) {
            substring2 = str.substring(i);
            if (substring2.length() > 0) {
                try {
                    parseFloat = Float.parseFloat(substring2);
                } catch (NumberFormatException e) {
                }
            }
            parseFloat = 0.0f;
        } else {
            substring2 = str.substring(i, indexOf);
            String substring3 = str.substring(indexOf + 1);
            if (substring2.length() > 0 && substring3.length() > 0) {
                try {
                    parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        parseFloat = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                    }
                    parseFloat = 0.0f;
                } catch (NumberFormatException e2) {
                }
            }
            parseFloat = 0.0f;
        }
        if (parseFloat > 0.0f) {
            this.f353u = parseFloat;
            this.f354v = i2;
        }
    }

    public final void m113b(int i) {
        this.f356x = i;
    }

    public void mo32b(int i, int i2) {
        this.f357y = i;
        this.f358z = i2;
    }

    public final boolean m115b() {
        return this.f350r == null;
    }

    public final int m116c() {
        return this.f318L;
    }

    public final void m117c(int i) {
        this.f351s = i;
        if (this.f351s < this.f309B) {
            this.f351s = this.f309B;
        }
    }

    public final void m118c(int i, int i2) {
        this.f355w = i;
        this.f351s = i2 - i;
        if (this.f351s < this.f309B) {
            this.f351s = this.f309B;
        }
    }

    public final int m119d() {
        return this.f355w;
    }

    public final void m120d(int i) {
        this.f352t = i;
        if (this.f352t < this.f310C) {
            this.f352t = this.f310C;
        }
    }

    public final void m121d(int i, int i2) {
        this.f356x = i;
        this.f352t = i2 - i;
        if (this.f352t < this.f310C) {
            this.f352t = this.f310C;
        }
    }

    public final int m122e() {
        return this.f356x;
    }

    public final void m123e(int i) {
        if (i < 0) {
            this.f309B = 0;
        } else {
            this.f309B = i;
        }
    }

    public final int m124f() {
        return this.f318L == 8 ? 0 : this.f351s;
    }

    public final void m125f(int i) {
        if (i < 0) {
            this.f310C = 0;
        } else {
            this.f310C = i;
        }
    }

    public final int m126g() {
        int i = this.f351s;
        if (this.f315I != C0083a.f304c) {
            return i;
        }
        if (this.f335c == 1) {
            i = Math.max(this.f337e, i);
        } else if (this.f337e > 0) {
            i = this.f337e;
            this.f351s = i;
        } else {
            i = 0;
        }
        return (this.f338f <= 0 || this.f338f >= i) ? i : this.f338f;
    }

    public final void m127g(int i) {
        this.f315I = i;
        if (this.f315I == C0083a.f303b) {
            m117c(this.f311D);
        }
    }

    public final int m128h() {
        int i = this.f352t;
        if (this.f316J != C0083a.f304c) {
            return i;
        }
        if (this.f336d == 1) {
            i = Math.max(this.f339g, i);
        } else if (this.f339g > 0) {
            i = this.f339g;
            this.f352t = i;
        } else {
            i = 0;
        }
        return (this.f340h <= 0 || this.f340h >= i) ? i : this.f340h;
    }

    public final void m129h(int i) {
        this.f316J = i;
        if (this.f316J == C0083a.f303b) {
            m120d(this.f312E);
        }
    }

    public final int m130i() {
        return this.f318L == 8 ? 0 : this.f352t;
    }

    public final int m131j() {
        return this.aj + this.f357y;
    }

    public final int m132k() {
        return this.ak + this.f358z;
    }

    public final int m133l() {
        return m132k() + this.am;
    }

    public final int m134m() {
        return m131j() + this.al;
    }

    protected final int m135n() {
        return this.f355w + this.f357y;
    }

    protected final int m136o() {
        return this.f356x + this.f358z;
    }

    public final int m137p() {
        return this.f355w + this.f351s;
    }

    public final int m138q() {
        return this.f356x + this.f352t;
    }

    public final boolean m139r() {
        return this.f308A > 0;
    }

    public ArrayList<C0081a> mo37s() {
        return this.f349q;
    }

    public void mo33t() {
        int i = this.f355w;
        int i2 = this.f356x;
        int i3 = this.f355w + this.f351s;
        int i4 = this.f356x + this.f352t;
        this.aj = i;
        this.ak = i2;
        this.al = i3 - i;
        this.am = i4 - i2;
    }

    public String toString() {
        return (this.ao != null ? "type: " + this.ao + " " : "") + (this.f319M != null ? "id: " + this.f319M + " " : "") + "(" + this.f355w + ", " + this.f356x + ") - (" + this.f351s + " x " + this.f352t + ") wrap: (" + this.f311D + " x " + this.f312E + ")";
    }

    public final void m142u() {
        int size = this.f349q.size();
        for (int i = 0; i < size; i++) {
            ((C0081a) this.f349q.get(i)).m102c();
        }
    }

    public void mo38v() {
        int b = C0096e.m196b(this.f341i);
        int b2 = C0096e.m196b(this.f342j);
        int b3 = C0096e.m196b(this.f343k) - b;
        int b4 = C0096e.m196b(this.f344l) - b2;
        this.f355w = b;
        this.f356x = b2;
        if (this.f318L == 8) {
            this.f351s = 0;
            this.f352t = 0;
            return;
        }
        if (this.f315I == C0083a.f302a && b3 < this.f351s) {
            b3 = this.f351s;
        }
        if (this.f316J == C0083a.f302a && b4 < this.f352t) {
            b4 = this.f352t;
        }
        this.f351s = b3;
        this.f352t = b4;
        if (this.f352t < this.f310C) {
            this.f352t = this.f310C;
        }
        if (this.f351s < this.f309B) {
            this.f351s = this.f309B;
        }
    }
}
