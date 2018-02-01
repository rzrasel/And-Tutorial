package com.google.android.gms.internal;

import java.security.Provider;
import java.security.Signature;

public final class qr implements qk<Signature> {
    public final /* synthetic */ Object mo2230a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
