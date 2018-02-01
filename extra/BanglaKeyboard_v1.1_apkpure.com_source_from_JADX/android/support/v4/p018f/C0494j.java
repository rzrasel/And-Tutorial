package android.support.v4.p018f;

public final class C0494j<F, S> {
    public final F f1558a;
    public final S f1559b;

    public C0494j(F f, S s) {
        this.f1558a = f;
        this.f1559b = s;
    }

    public static <A, B> C0494j<A, B> m1287a(A a, B b) {
        return new C0494j(a, b);
    }

    private static boolean m1288b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0494j)) {
            return false;
        }
        C0494j c0494j = (C0494j) obj;
        return C0494j.m1288b(c0494j.f1558a, this.f1558a) && C0494j.m1288b(c0494j.f1559b, this.f1559b);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f1558a == null ? 0 : this.f1558a.hashCode();
        if (this.f1559b != null) {
            i = this.f1559b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f1558a) + " " + String.valueOf(this.f1559b) + "}";
    }
}
