package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.je;
import java.util.Arrays;

public abstract class C0246e {
    protected final DataHolder f505a;
    protected final int f506b;
    private final int f507c;

    public C0246e(DataHolder dataHolder, int i) {
        this.f505a = (DataHolder) je.m2473a((Object) dataHolder);
        boolean z = i >= 0 && i < dataHolder.m991g();
        je.m2476a(z);
        this.f506b = i;
        this.f507c = dataHolder.m977a(this.f506b);
    }

    public final boolean a_(String str) {
        return this.f505a.m980a(str);
    }

    protected final long m995b(String str) {
        return this.f505a.m978a(str, this.f506b, this.f507c);
    }

    protected final int m996c(String str) {
        return this.f505a.m982b(str, this.f506b, this.f507c);
    }

    protected final boolean m997d(String str) {
        return this.f505a.m985d(str, this.f506b, this.f507c);
    }

    protected final String m998e(String str) {
        return this.f505a.m983c(str, this.f506b, this.f507c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0246e)) {
            return false;
        }
        C0246e c0246e = (C0246e) obj;
        return jb.m2470a(Integer.valueOf(c0246e.f506b), Integer.valueOf(this.f506b)) && jb.m2470a(Integer.valueOf(c0246e.f507c), Integer.valueOf(this.f507c)) && c0246e.f505a == this.f505a;
    }

    protected final byte[] m999f(String str) {
        return this.f505a.m988e(str, this.f506b, this.f507c);
    }

    protected final Uri m1000g(String str) {
        return this.f505a.m989f(str, this.f506b, this.f507c);
    }

    protected final boolean m1001h(String str) {
        return this.f505a.m992g(str, this.f506b, this.f507c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f506b), Integer.valueOf(this.f507c), this.f505a});
    }
}
