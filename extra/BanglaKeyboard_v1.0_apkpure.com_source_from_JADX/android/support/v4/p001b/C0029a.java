package android.support.v4.p001b;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C0029a extends C0028l implements Map {
    C0030f f12a;

    private C0030f m10b() {
        if (this.f12a == null) {
            this.f12a = new C0031b(this);
        }
        return this.f12a;
    }

    public Set entrySet() {
        C0030f b = m10b();
        if (b.f13b == null) {
            b.f13b = new C0036h(b);
        }
        return b.f13b;
    }

    public Set keySet() {
        C0030f b = m10b();
        if (b.f14c == null) {
            b.f14c = new C0037i(b);
        }
        return b.f14c;
    }

    public void putAll(Map map) {
        int size = this.h + map.size();
        if (this.f9f.length < size) {
            Object obj = this.f9f;
            Object obj2 = this.f10g;
            super.m7a(size);
            if (this.f11h > 0) {
                System.arraycopy(obj, 0, this.f9f, 0, this.f11h);
                System.arraycopy(obj2, 0, this.f10g, 0, this.f11h << 1);
            }
            C0028l.m2a(obj, obj2, this.f11h);
        }
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection values() {
        C0030f b = m10b();
        if (b.f15d == null) {
            b.f15d = new C0039k(b);
        }
        return b.f15d;
    }
}
