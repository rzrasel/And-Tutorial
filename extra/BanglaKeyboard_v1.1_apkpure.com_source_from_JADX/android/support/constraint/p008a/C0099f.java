package android.support.constraint.p008a;

final class C0099f {

    interface C0097a<T> {
        T mo39a();

        void mo40a(T[] tArr, int i);

        boolean mo41a(T t);
    }

    static class C0098b<T> implements C0097a<T> {
        private final Object[] f405a = new Object[256];
        private int f406b;

        C0098b() {
        }

        public final T mo39a() {
            if (this.f406b <= 0) {
                return null;
            }
            int i = this.f406b - 1;
            T t = this.f405a[i];
            this.f405a[i] = null;
            this.f406b--;
            return t;
        }

        public final void mo40a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.f406b < this.f405a.length) {
                    this.f405a[this.f406b] = t;
                    this.f406b++;
                }
            }
        }

        public final boolean mo41a(T t) {
            if (this.f406b >= this.f405a.length) {
                return false;
            }
            this.f405a[this.f406b] = t;
            this.f406b++;
            return true;
        }
    }
}
