package com.bumptech.glide.load.p043a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class C1167b implements C1165c<InputStream> {
    private final byte[] f3462a;
    private final String f3463b;

    public C1167b(byte[] bArr, String str) {
        this.f3462a = bArr;
        this.f3463b = str;
    }

    public final /* synthetic */ Object mo1324a(int i) {
        return new ByteArrayInputStream(this.f3462a);
    }

    public final void mo1325a() {
    }

    public final String mo1326b() {
        return this.f3463b;
    }

    public final void mo1327c() {
    }
}
