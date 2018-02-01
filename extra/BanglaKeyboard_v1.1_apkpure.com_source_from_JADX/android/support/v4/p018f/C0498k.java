package android.support.v4.p018f;

public final class C0498k {

    public interface C0495a<T> {
        T mo485a();

        boolean mo486a(T t);
    }

    public static class C0496b<T> implements C0495a<T> {
        private final Object[] f1560a;
        private int f1561b;

        public C0496b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f1560a = new Object[i];
        }

        public T mo485a() {
            if (this.f1561b <= 0) {
                return null;
            }
            int i = this.f1561b - 1;
            T t = this.f1560a[i];
            this.f1560a[i] = null;
            this.f1561b--;
            return t;
        }

        public boolean mo486a(T t) {
            boolean z;
            for (int i = 0; i < this.f1561b; i++) {
                if (this.f1560a[i] == t) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                throw new IllegalStateException("Already in the pool!");
            } else if (this.f1561b >= this.f1560a.length) {
                return false;
            } else {
                this.f1560a[this.f1561b] = t;
                this.f1561b++;
                return true;
            }
        }
    }

    public static class C0497c<T> extends C0496b<T> {
        private final Object f1562a = new Object();

        public C0497c(int i) {
            super(i);
        }

        public final T mo485a() {
            T a;
            synchronized (this.f1562a) {
                a = super.mo485a();
            }
            return a;
        }

        public final boolean mo486a(T t) {
            boolean a;
            synchronized (this.f1562a) {
                a = super.mo486a(t);
            }
            return a;
        }
    }
}
