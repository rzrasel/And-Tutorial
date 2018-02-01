package android.support.v4.p001b;

import java.util.Iterator;

final class C0035g implements Iterator {
    final int f22a;
    int f23b;
    int f24c;
    boolean f25d = false;
    final /* synthetic */ C0030f f26e;

    C0035g(C0030f c0030f, int i) {
        this.f26e = c0030f;
        this.f22a = i;
        this.f23b = c0030f.mo134a();
    }

    public final boolean hasNext() {
        return this.f24c < this.f23b;
    }

    public final Object next() {
        Object a = this.f26e.mo136a(this.f24c, this.f22a);
        this.f24c++;
        this.f25d = true;
        return a;
    }

    public final void remove() {
        if (this.f25d) {
            this.f24c--;
            this.f23b--;
            this.f25d = false;
            this.f26e.mo138a(this.f24c);
            return;
        }
        throw new IllegalStateException();
    }
}
