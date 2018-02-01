package android.support.v4.p001b;

import java.util.Map;

final class C0031b extends C0030f {
    final /* synthetic */ C0029a f16a;

    C0031b(C0029a c0029a) {
        this.f16a = c0029a;
    }

    protected final int mo134a() {
        return this.f16a.h;
    }

    protected final int mo135a(Object obj) {
        return obj == null ? this.f16a.m4a() : this.f16a.m6a(obj, obj.hashCode());
    }

    protected final Object mo136a(int i, int i2) {
        return this.f16a.g[(i << 1) + i2];
    }

    protected final Object mo137a(int i, Object obj) {
        C0028l c0028l = this.f16a;
        int i2 = (i << 1) + 1;
        Object obj2 = c0028l.f10g[i2];
        c0028l.f10g[i2] = obj;
        return obj2;
    }

    protected final void mo138a(int i) {
        this.f16a.m9c(i);
    }

    protected final void mo139a(Object obj, Object obj2) {
        this.f16a.put(obj, obj2);
    }

    protected final int mo140b(Object obj) {
        return this.f16a.m5a(obj);
    }

    protected final Map mo141b() {
        return this.f16a;
    }

    protected final void mo142c() {
        this.f16a.clear();
    }
}
