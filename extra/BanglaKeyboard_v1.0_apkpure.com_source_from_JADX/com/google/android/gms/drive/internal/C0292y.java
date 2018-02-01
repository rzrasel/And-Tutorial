package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.mw;
import com.google.android.gms.internal.my;

public final class C0292y extends my {
    public int f651a;
    public String f652b;
    public long f653c;
    public long f654d;

    public C0292y() {
        this.f651a = 1;
        this.f652b = "";
        this.f653c = -1;
        this.f654d = -1;
        this.m = null;
        this.n = -1;
    }

    public final int mo699a() {
        int a = (((super.mo699a() + mw.m2631a(this.f651a)) + mw.m2637b(2, this.f652b)) + mw.m2641c(3, this.f653c)) + mw.m2641c(4, this.f654d);
        this.n = a;
        return a;
    }

    public final void mo697a(mw mwVar) {
        mwVar.m2646a(1, this.f651a);
        mwVar.m2649a(2, this.f652b);
        mwVar.m2652b(3, this.f653c);
        mwVar.m2652b(4, this.f654d);
        super.mo697a(mwVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0292y)) {
            return false;
        }
        C0292y c0292y = (C0292y) obj;
        if (this.f651a != c0292y.f651a) {
            return false;
        }
        if (this.f652b == null) {
            if (c0292y.f652b != null) {
                return false;
            }
        } else if (!this.f652b.equals(c0292y.f652b)) {
            return false;
        }
        return this.f653c != c0292y.f653c ? false : this.f654d != c0292y.f654d ? false : (this.m == null || this.m.isEmpty()) ? c0292y.m == null || c0292y.m.isEmpty() : this.m.equals(c0292y.m);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((this.f652b == null ? 0 : this.f652b.hashCode()) + ((this.f651a + 527) * 31)) * 31) + ((int) (this.f653c ^ (this.f653c >>> 32)))) * 31) + ((int) (this.f654d ^ (this.f654d >>> 32)))) * 31;
        if (!(this.m == null || this.m.isEmpty())) {
            i = this.m.hashCode();
        }
        return hashCode + i;
    }
}
