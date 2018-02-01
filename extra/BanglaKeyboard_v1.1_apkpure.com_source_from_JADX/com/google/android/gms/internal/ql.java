package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.Cipher;

public final class ql implements qk<Cipher> {
    public final /* synthetic */ Object mo2230a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
