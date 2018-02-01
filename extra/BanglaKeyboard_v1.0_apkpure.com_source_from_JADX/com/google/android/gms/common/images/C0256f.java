package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.jb;
import java.util.Arrays;

final class C0256f {
    public final Uri f557a;

    public C0256f(Uri uri) {
        this.f557a = uri;
    }

    public final boolean equals(Object obj) {
        return !(obj instanceof C0256f) ? false : this == obj ? true : jb.m2470a(((C0256f) obj).f557a, this.f557a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f557a});
    }
}
