package android.support.constraint.p008a.p009a;

import android.support.constraint.p008a.C0094c;
import java.util.ArrayList;

public class C0085g extends C0084b {
    protected ArrayList<C0084b> ar = new ArrayList();

    public void mo30a() {
        this.ar.clear();
        super.mo30a();
    }

    public final void m145a(C0084b c0084b) {
        this.ar.add(c0084b);
        if (c0084b.f350r != null) {
            ((C0085g) c0084b.f350r).m148b(c0084b);
        }
        c0084b.f350r = this;
    }

    public final void mo31a(C0094c c0094c) {
        super.mo31a(c0094c);
        int size = this.ar.size();
        for (int i = 0; i < size; i++) {
            ((C0084b) this.ar.get(i)).mo31a(c0094c);
        }
    }

    public final void mo32b(int i, int i2) {
        super.mo32b(i, i2);
        int size = this.ar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0084b) this.ar.get(i3)).mo32b(m135n(), m136o());
        }
    }

    public final void m148b(C0084b c0084b) {
        this.ar.remove(c0084b);
        c0084b.f350r = null;
    }

    public final void mo33t() {
        super.mo33t();
        if (this.ar != null) {
            int size = this.ar.size();
            for (int i = 0; i < size; i++) {
                C0084b c0084b = (C0084b) this.ar.get(i);
                c0084b.mo32b(m131j(), m132k());
                if (!(c0084b instanceof C0086c)) {
                    c0084b.mo33t();
                }
            }
        }
    }

    public void mo34w() {
        mo33t();
        if (this.ar != null) {
            int size = this.ar.size();
            for (int i = 0; i < size; i++) {
                C0084b c0084b = (C0084b) this.ar.get(i);
                if (c0084b instanceof C0085g) {
                    ((C0085g) c0084b).mo34w();
                }
            }
        }
    }

    public final void m151x() {
        this.ar.clear();
    }
}
