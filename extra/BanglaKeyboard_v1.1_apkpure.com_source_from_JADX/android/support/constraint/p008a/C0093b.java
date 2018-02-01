package android.support.constraint.p008a;

import java.util.Arrays;

public final class C0093b {
    public C0101g f381a = null;
    public float f382b = 0.0f;
    boolean f383c = false;
    final C0092a f384d;
    boolean f385e = false;

    public C0093b(C0094c c0094c) {
        this.f384d = new C0092a(this, c0094c);
    }

    public final C0093b m179a(float f, float f2, float f3, C0101g c0101g, int i, C0101g c0101g2, int i2, C0101g c0101g3, int i3, C0101g c0101g4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f382b = (float) ((((-i) - i2) + i3) + i4);
            this.f384d.m175a(c0101g, 1.0f);
            this.f384d.m175a(c0101g2, -1.0f);
            this.f384d.m175a(c0101g4, 1.0f);
            this.f384d.m175a(c0101g3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f382b = (((float) ((-i) - i2)) + (((float) i3) * f4)) + (((float) i4) * f4);
            this.f384d.m175a(c0101g, 1.0f);
            this.f384d.m175a(c0101g2, -1.0f);
            this.f384d.m175a(c0101g4, f4);
            this.f384d.m175a(c0101g3, -f4);
        }
        return this;
    }

    public final C0093b m180a(C0101g c0101g, int i) {
        if (i < 0) {
            this.f382b = (float) (i * -1);
            this.f384d.m175a(c0101g, 1.0f);
        } else {
            this.f382b = (float) i;
            this.f384d.m175a(c0101g, -1.0f);
        }
        return this;
    }

    public final C0093b m181a(C0101g c0101g, C0101g c0101g2) {
        this.f384d.m175a(c0101g, 1.0f);
        this.f384d.m175a(c0101g2, -1.0f);
        return this;
    }

    public final C0093b m182a(C0101g c0101g, C0101g c0101g2, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f382b = (float) i;
        }
        if (obj == null) {
            this.f384d.m175a(c0101g, -1.0f);
            this.f384d.m175a(c0101g2, 1.0f);
        } else {
            this.f384d.m175a(c0101g, 1.0f);
            this.f384d.m175a(c0101g2, -1.0f);
        }
        return this;
    }

    final C0093b m183a(C0101g c0101g, C0101g c0101g2, int i, float f, C0101g c0101g3, C0101g c0101g4, int i2) {
        if (c0101g2 == c0101g3) {
            this.f384d.m175a(c0101g, 1.0f);
            this.f384d.m175a(c0101g4, 1.0f);
            this.f384d.m175a(c0101g2, -2.0f);
        } else if (f == 0.5f) {
            this.f384d.m175a(c0101g, 1.0f);
            this.f384d.m175a(c0101g2, -1.0f);
            this.f384d.m175a(c0101g3, -1.0f);
            this.f384d.m175a(c0101g4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f382b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f384d.m175a(c0101g, -1.0f);
            this.f384d.m175a(c0101g2, 1.0f);
            this.f382b = (float) i;
        } else if (f >= 1.0f) {
            this.f384d.m175a(c0101g3, -1.0f);
            this.f384d.m175a(c0101g4, 1.0f);
            this.f382b = (float) i2;
        } else {
            this.f384d.m175a(c0101g, (1.0f - f) * 1.0f);
            this.f384d.m175a(c0101g2, (1.0f - f) * -1.0f);
            this.f384d.m175a(c0101g3, -1.0f * f);
            this.f384d.m175a(c0101g4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f382b = (((float) (-i)) * (1.0f - f)) + (((float) i2) * f);
            }
        }
        return this;
    }

    public final C0093b m184a(C0101g c0101g, C0101g c0101g2, C0101g c0101g3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f382b = (float) i;
        }
        if (obj == null) {
            this.f384d.m175a(c0101g, -1.0f);
            this.f384d.m175a(c0101g2, 1.0f);
            this.f384d.m175a(c0101g3, 1.0f);
        } else {
            this.f384d.m175a(c0101g, 1.0f);
            this.f384d.m175a(c0101g2, -1.0f);
            this.f384d.m175a(c0101g3, -1.0f);
        }
        return this;
    }

    public final C0093b m185a(C0101g c0101g, C0101g c0101g2, C0101g c0101g3, C0101g c0101g4, float f) {
        this.f384d.m175a(c0101g, -1.0f);
        this.f384d.m175a(c0101g2, 1.0f);
        this.f384d.m175a(c0101g3, f);
        this.f384d.m175a(c0101g4, -f);
        return this;
    }

    final void m186a() {
        C0092a c0092a = this.f384d;
        int i = 0;
        int i2 = c0092a.f375f;
        while (i2 != -1 && i < c0092a.f370a) {
            C0101g c0101g = c0092a.f371b.f388c[c0092a.f372c[i2]];
            for (int i3 = 0; i3 < c0101g.f421h; i3++) {
                if (c0101g.f420g[i3] == this) {
                    break;
                }
            }
            if (c0101g.f421h >= c0101g.f420g.length) {
                c0101g.f420g = (C0093b[]) Arrays.copyOf(c0101g.f420g, c0101g.f420g.length * 2);
            }
            c0101g.f420g[c0101g.f421h] = this;
            c0101g.f421h++;
            i2 = c0092a.f373d[i2];
            i++;
        }
    }

    final void m187a(C0101g c0101g) {
        if (this.f381a != null) {
            this.f384d.m175a(this.f381a, -1.0f);
            this.f381a = null;
        }
        float a = -1.0f * this.f384d.m172a(c0101g);
        this.f381a = c0101g;
        if (a != 1.0f) {
            this.f382b /= a;
            C0092a c0092a = this.f384d;
            int i = c0092a.f375f;
            int i2 = 0;
            while (i != -1 && i2 < c0092a.f370a) {
                float[] fArr = c0092a.f374e;
                fArr[i] = fArr[i] / a;
                i = c0092a.f373d[i];
                i2++;
            }
        }
    }

    final boolean m188a(C0093b c0093b) {
        this.f384d.m174a(this, c0093b);
        return true;
    }

    public final C0093b m189b(C0101g c0101g, C0101g c0101g2, C0101g c0101g3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f382b = (float) i;
        }
        if (obj == null) {
            this.f384d.m175a(c0101g, -1.0f);
            this.f384d.m175a(c0101g2, 1.0f);
            this.f384d.m175a(c0101g3, -1.0f);
        } else {
            this.f384d.m175a(c0101g, 1.0f);
            this.f384d.m175a(c0101g2, -1.0f);
            this.f384d.m175a(c0101g3, 1.0f);
        }
        return this;
    }

    public final String toString() {
        String str;
        Object obj;
        String str2 = "";
        str2 = (this.f381a == null ? str2 + "0" : str2 + this.f381a) + " = ";
        if (this.f382b != 0.0f) {
            str = str2 + this.f382b;
            obj = 1;
        } else {
            str = str2;
            obj = null;
        }
        int i = this.f384d.f370a;
        String str3 = str;
        for (int i2 = 0; i2 < i; i2++) {
            C0101g a = this.f384d.m173a(i2);
            if (a != null) {
                float f;
                float b = this.f384d.m176b(i2);
                String c0101g = a.toString();
                if (obj == null) {
                    if (b < 0.0f) {
                        str3 = str3 + "- ";
                        f = b * -1.0f;
                    } else {
                        f = b;
                    }
                } else if (b > 0.0f) {
                    str3 = str3 + " + ";
                    f = b;
                } else {
                    str3 = str3 + " - ";
                    f = b * -1.0f;
                }
                str3 = f == 1.0f ? str3 + c0101g : str3 + f + " " + c0101g;
                obj = 1;
            }
        }
        return obj == null ? str3 + "0.0" : str3;
    }
}
