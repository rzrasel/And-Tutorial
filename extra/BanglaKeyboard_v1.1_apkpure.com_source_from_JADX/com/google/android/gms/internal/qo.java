package com.google.android.gms.internal;

import java.security.KeyPairGenerator;
import java.security.Provider;

public final class qo implements qk<KeyPairGenerator> {
    public final /* synthetic */ Object mo2230a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
