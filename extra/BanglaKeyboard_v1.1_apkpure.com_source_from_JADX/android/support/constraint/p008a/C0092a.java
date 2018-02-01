package android.support.constraint.p008a;

import java.util.Arrays;

public final class C0092a {
    int f370a = 0;
    final C0094c f371b;
    int[] f372c = new int[this.f379j];
    int[] f373d = new int[this.f379j];
    float[] f374e = new float[this.f379j];
    int f375f = -1;
    int f376g = -1;
    boolean f377h = false;
    private final C0093b f378i;
    private int f379j = 8;
    private C0101g f380k = null;

    C0092a(C0093b c0093b, C0094c c0094c) {
        this.f378i = c0093b;
        this.f371b = c0094c;
    }

    public final float m172a(C0101g c0101g) {
        if (this.f380k == c0101g) {
            this.f380k = null;
        }
        if (this.f375f == -1) {
            return 0.0f;
        }
        int i = this.f375f;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f370a) {
            int i4 = this.f372c[i];
            if (i4 == c0101g.f414a) {
                if (i == this.f375f) {
                    this.f375f = this.f373d[i];
                } else {
                    this.f373d[i3] = this.f373d[i];
                }
                this.f371b.f388c[i4].m221a(this.f378i);
                this.f370a--;
                this.f372c[i] = -1;
                if (this.f377h) {
                    this.f376g = i;
                }
                return this.f374e[i];
            }
            i2++;
            int i5 = i;
            i = this.f373d[i];
            i3 = i5;
        }
        return 0.0f;
    }

    final C0101g m173a(int i) {
        int i2 = this.f375f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f370a) {
            if (i3 == i) {
                return this.f371b.f388c[this.f372c[i2]];
            }
            i2 = this.f373d[i2];
            i3++;
        }
        return null;
    }

    final void m174a(C0093b c0093b, C0093b c0093b2) {
        int i = this.f375f;
        int i2 = 0;
        while (i != -1 && i2 < this.f370a) {
            if (this.f372c[i] == c0093b2.f381a.f414a) {
                float f = this.f374e[i];
                m172a(c0093b2.f381a);
                C0092a c0092a = c0093b2.f384d;
                i = c0092a.f375f;
                i2 = 0;
                while (i != -1 && i2 < c0092a.f370a) {
                    m178b(this.f371b.f388c[c0092a.f372c[i]], c0092a.f374e[i] * f);
                    i = c0092a.f373d[i];
                    i2++;
                }
                c0093b.f382b += c0093b2.f382b * f;
                c0093b2.f381a.m221a(c0093b);
                i = this.f375f;
                i2 = 0;
            } else {
                i = this.f373d[i];
                i2++;
            }
        }
    }

    public final void m175a(C0101g c0101g, float f) {
        if (f == 0.0f) {
            m172a(c0101g);
        } else if (this.f375f == -1) {
            this.f375f = 0;
            this.f374e[this.f375f] = f;
            this.f372c[this.f375f] = c0101g.f414a;
            this.f373d[this.f375f] = -1;
            this.f370a++;
            if (!this.f377h) {
                this.f376g++;
            }
        } else {
            int i = this.f375f;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f370a) {
                if (this.f372c[i] == c0101g.f414a) {
                    this.f374e[i] = f;
                    return;
                }
                if (this.f372c[i] < c0101g.f414a) {
                    i3 = i;
                }
                i2++;
                i = this.f373d[i];
            }
            i = this.f376g + 1;
            if (this.f377h) {
                i = this.f372c[this.f376g] == -1 ? this.f376g : this.f372c.length;
            }
            if (i >= this.f372c.length && this.f370a < this.f372c.length) {
                for (i2 = 0; i2 < this.f372c.length; i2++) {
                    if (this.f372c[i2] == -1) {
                        i = i2;
                        break;
                    }
                }
            }
            if (i >= this.f372c.length) {
                i = this.f372c.length;
                this.f379j *= 2;
                this.f377h = false;
                this.f376g = i - 1;
                this.f374e = Arrays.copyOf(this.f374e, this.f379j);
                this.f372c = Arrays.copyOf(this.f372c, this.f379j);
                this.f373d = Arrays.copyOf(this.f373d, this.f379j);
            }
            this.f372c[i] = c0101g.f414a;
            this.f374e[i] = f;
            if (i3 != -1) {
                this.f373d[i] = this.f373d[i3];
                this.f373d[i3] = i;
            } else {
                this.f373d[i] = this.f375f;
                this.f375f = i;
            }
            this.f370a++;
            if (!this.f377h) {
                this.f376g++;
            }
            if (this.f370a >= this.f372c.length) {
                this.f377h = true;
            }
        }
    }

    final float m176b(int i) {
        int i2 = this.f375f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f370a) {
            if (i3 == i) {
                return this.f374e[i2];
            }
            i2 = this.f373d[i2];
            i3++;
        }
        return 0.0f;
    }

    public final float m177b(C0101g c0101g) {
        int i = this.f375f;
        int i2 = 0;
        while (i != -1 && i2 < this.f370a) {
            if (this.f372c[i] == c0101g.f414a) {
                return this.f374e[i];
            }
            i = this.f373d[i];
            i2++;
        }
        return 0.0f;
    }

    public final void m178b(C0101g c0101g, float f) {
        if (f != 0.0f) {
            if (this.f375f == -1) {
                this.f375f = 0;
                this.f374e[this.f375f] = f;
                this.f372c[this.f375f] = c0101g.f414a;
                this.f373d[this.f375f] = -1;
                this.f370a++;
                if (!this.f377h) {
                    this.f376g++;
                    return;
                }
                return;
            }
            int i = this.f375f;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f370a) {
                int i4 = this.f372c[i];
                if (i4 == c0101g.f414a) {
                    float[] fArr = this.f374e;
                    fArr[i] = fArr[i] + f;
                    if (this.f374e[i] == 0.0f) {
                        if (i == this.f375f) {
                            this.f375f = this.f373d[i];
                        } else {
                            this.f373d[i3] = this.f373d[i];
                        }
                        this.f371b.f388c[i4].m221a(this.f378i);
                        if (this.f377h) {
                            this.f376g = i;
                        }
                        this.f370a--;
                        return;
                    }
                    return;
                }
                if (this.f372c[i] < c0101g.f414a) {
                    i3 = i;
                }
                i2++;
                i = this.f373d[i];
            }
            i = this.f376g + 1;
            if (this.f377h) {
                i = this.f372c[this.f376g] == -1 ? this.f376g : this.f372c.length;
            }
            if (i >= this.f372c.length && this.f370a < this.f372c.length) {
                for (i2 = 0; i2 < this.f372c.length; i2++) {
                    if (this.f372c[i2] == -1) {
                        i = i2;
                        break;
                    }
                }
            }
            if (i >= this.f372c.length) {
                i = this.f372c.length;
                this.f379j *= 2;
                this.f377h = false;
                this.f376g = i - 1;
                this.f374e = Arrays.copyOf(this.f374e, this.f379j);
                this.f372c = Arrays.copyOf(this.f372c, this.f379j);
                this.f373d = Arrays.copyOf(this.f373d, this.f379j);
            }
            this.f372c[i] = c0101g.f414a;
            this.f374e[i] = f;
            if (i3 != -1) {
                this.f373d[i] = this.f373d[i3];
                this.f373d[i3] = i;
            } else {
                this.f373d[i] = this.f375f;
                this.f375f = i;
            }
            this.f370a++;
            if (!this.f377h) {
                this.f376g++;
            }
            if (this.f376g >= this.f372c.length) {
                this.f377h = true;
                this.f376g = this.f372c.length - 1;
            }
        }
    }

    public final String toString() {
        String str = "";
        int i = this.f375f;
        int i2 = 0;
        while (i != -1 && i2 < this.f370a) {
            str = ((str + " -> ") + this.f374e[i] + " : ") + this.f371b.f388c[this.f372c[i]];
            i = this.f373d[i];
            i2++;
        }
        return str;
    }
}
