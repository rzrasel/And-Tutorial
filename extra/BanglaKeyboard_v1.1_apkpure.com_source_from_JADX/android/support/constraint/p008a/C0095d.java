package android.support.constraint.p008a;

import android.support.constraint.p008a.C0101g.C0100a;
import java.util.ArrayList;

public final class C0095d {
    ArrayList<C0101g> f389a = new ArrayList();

    public final void m190a(C0096e c0096e) {
        int i;
        this.f389a.clear();
        for (int i2 = 1; i2 < c0096e.f394d; i2++) {
            C0101g c0101g = c0096e.f396f.f388c[i2];
            for (i = 0; i < 6; i++) {
                c0101g.f418e[i] = 0.0f;
            }
            c0101g.f418e[c0101g.f416c] = 1.0f;
            if (c0101g.f419f == C0100a.f410d) {
                this.f389a.add(c0101g);
            }
        }
        int size = this.f389a.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0101g c0101g2 = (C0101g) this.f389a.get(i3);
            if (c0101g2.f415b != -1) {
                C0092a c0092a = c0096e.f393c[c0101g2.f415b].f384d;
                int i4 = c0092a.f370a;
                for (int i5 = 0; i5 < i4; i5++) {
                    C0101g a = c0092a.m173a(i5);
                    if (a != null) {
                        float b = c0092a.m176b(i5);
                        for (i = 0; i < 6; i++) {
                            float[] fArr = a.f418e;
                            fArr[i] = fArr[i] + (c0101g2.f418e[i] * b);
                        }
                        if (!this.f389a.contains(a)) {
                            this.f389a.add(a);
                        }
                    }
                }
                for (i = 0; i < 6; i++) {
                    c0101g2.f418e[i] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        int size = this.f389a.size();
        String str = "Goal: ";
        for (int i = 0; i < size; i++) {
            str = str + ((C0101g) this.f389a.get(i)).m220a();
        }
        return str;
    }
}
