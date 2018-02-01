package com.google.android.gms.internal;

import java.security.KeyFactory;
import java.security.Provider;

public final class qn implements qk<KeyFactory> {
    public final /* synthetic */ Object mo2230a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
