package android.support.v7.p028h;

public final class C0884a implements C0883c {
    final C0883c f2686a;
    int f2687b = 0;
    int f2688c = -1;
    int f2689d = -1;
    Object f2690e = null;

    public C0884a(C0883c c0883c) {
        this.f2686a = c0883c;
    }

    public final void m2564a() {
        if (this.f2687b != 0) {
            switch (this.f2687b) {
                case 1:
                    this.f2686a.onInserted(this.f2688c, this.f2689d);
                    break;
                case 2:
                    this.f2686a.onRemoved(this.f2688c, this.f2689d);
                    break;
                case 3:
                    this.f2686a.onChanged(this.f2688c, this.f2689d, this.f2690e);
                    break;
            }
            this.f2690e = null;
            this.f2687b = 0;
        }
    }

    public final void onChanged(int i, int i2, Object obj) {
        if (this.f2687b != 3 || i > this.f2688c + this.f2689d || i + i2 < this.f2688c || this.f2690e != obj) {
            m2564a();
            this.f2688c = i;
            this.f2689d = i2;
            this.f2690e = obj;
            this.f2687b = 3;
            return;
        }
        int i3 = this.f2688c + this.f2689d;
        this.f2688c = Math.min(i, this.f2688c);
        this.f2689d = Math.max(i3, i + i2) - this.f2688c;
    }

    public final void onInserted(int i, int i2) {
        if (this.f2687b != 1 || i < this.f2688c || i > this.f2688c + this.f2689d) {
            m2564a();
            this.f2688c = i;
            this.f2689d = i2;
            this.f2687b = 1;
            return;
        }
        this.f2689d += i2;
        this.f2688c = Math.min(i, this.f2688c);
    }

    public final void onMoved(int i, int i2) {
        m2564a();
        this.f2686a.onMoved(i, i2);
    }

    public final void onRemoved(int i, int i2) {
        if (this.f2687b != 2 || this.f2688c < i || this.f2688c > i + i2) {
            m2564a();
            this.f2688c = i;
            this.f2689d = i2;
            this.f2687b = 2;
            return;
        }
        this.f2689d += i2;
        this.f2688c = i;
    }
}
