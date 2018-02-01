package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.Provider;

public final class qq implements qk<MessageDigest> {
    public final /* synthetic */ Object mo2230a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
