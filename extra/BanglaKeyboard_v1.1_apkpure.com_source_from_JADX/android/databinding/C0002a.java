package android.databinding;

import android.databinding.C0001f.C0022a;

public class C0002a implements C0001f {
    private transient C0028j f0a;

    public final void m2a(int i) {
        if (this.f0a != null) {
            this.f0a.m15a((Object) this, i);
        }
    }

    public final synchronized void mo1a(C0022a c0022a) {
        if (this.f0a == null) {
            this.f0a = new C0028j();
        }
        this.f0a.m14a((Object) c0022a);
    }

    public final synchronized void mo2b(C0022a c0022a) {
        if (this.f0a != null) {
            this.f0a.m16b(c0022a);
        }
    }

    public final synchronized void c_() {
        if (this.f0a != null) {
            this.f0a.m15a((Object) this, 0);
        }
    }
}
