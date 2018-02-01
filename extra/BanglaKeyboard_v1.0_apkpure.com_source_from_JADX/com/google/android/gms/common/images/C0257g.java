package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.jb;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class C0257g extends C0255e {
    private WeakReference f558d;

    protected final void mo696a() {
        if (((C0251a) this.f558d.get()) != null) {
            Uri uri = this.a.f557a;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0257g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0257g c0257g = (C0257g) obj;
        C0251a c0251a = (C0251a) this.f558d.get();
        C0251a c0251a2 = (C0251a) c0257g.f558d.get();
        return c0251a2 != null && c0251a != null && jb.m2470a(c0251a2, c0251a) && jb.m2470a(c0257g.a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
