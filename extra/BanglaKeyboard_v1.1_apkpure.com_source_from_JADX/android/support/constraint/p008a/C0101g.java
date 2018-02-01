package android.support.constraint.p008a;

public final class C0101g {
    private static int f413i = 1;
    public int f414a = -1;
    int f415b = -1;
    public int f416c = 0;
    public float f417d;
    float[] f418e = new float[6];
    int f419f;
    C0093b[] f420g = new C0093b[8];
    int f421h = 0;
    private String f422j;

    public enum C0100a {
        ;

        static {
            f407a = 1;
            f408b = 2;
            f409c = 3;
            f410d = 4;
            f411e = 5;
            f412f = new int[]{f407a, f408b, f409c, f410d, f411e};
        }
    }

    public C0101g(int i) {
        this.f419f = i;
    }

    final String m220a() {
        String str = this + "[";
        int i = 0;
        while (i < this.f418e.length) {
            str = str + this.f418e[i];
            str = i < this.f418e.length + -1 ? str + ", " : str + "] ";
            i++;
        }
        return str;
    }

    final void m221a(C0093b c0093b) {
        int i = 0;
        for (int i2 = 0; i2 < this.f421h; i2++) {
            if (this.f420g[i2] == c0093b) {
                while (i < (this.f421h - i2) - 1) {
                    this.f420g[i2 + i] = this.f420g[(i2 + i) + 1];
                    i++;
                }
                this.f421h--;
                return;
            }
        }
    }

    public final void m222b() {
        this.f422j = null;
        this.f419f = C0100a.f411e;
        this.f416c = 0;
        this.f414a = -1;
        this.f415b = -1;
        this.f417d = 0.0f;
        this.f421h = 0;
    }

    public final String toString() {
        return "" + this.f422j;
    }
}
