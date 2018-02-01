package com.bumptech.glide.load.p049c;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1249b;
import java.io.InputStream;
import java.io.OutputStream;

public final class C1290h implements C1249b<C1289g> {
    private final C1249b<InputStream> f3667a;
    private final C1249b<ParcelFileDescriptor> f3668b;
    private String f3669c;

    public C1290h(C1249b<InputStream> c1249b, C1249b<ParcelFileDescriptor> c1249b2) {
        this.f3667a = c1249b;
        this.f3668b = c1249b2;
    }

    public final String mo1376a() {
        if (this.f3669c == null) {
            this.f3669c = this.f3667a.mo1376a() + this.f3668b.mo1376a();
        }
        return this.f3669c;
    }

    public final /* bridge */ /* synthetic */ boolean mo1377a(Object obj, OutputStream outputStream) {
        C1289g c1289g = (C1289g) obj;
        return c1289g.f3665a != null ? this.f3667a.mo1377a(c1289g.f3665a, outputStream) : this.f3668b.mo1377a(c1289g.f3666b, outputStream);
    }
}
