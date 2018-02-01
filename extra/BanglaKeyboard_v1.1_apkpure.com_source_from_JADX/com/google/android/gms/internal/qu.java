package com.google.android.gms.internal;

import java.security.SecureRandom;

public final class qu {
    private static final SecureRandom f7021a = new SecureRandom();

    public static byte[] m6475a(int i) {
        byte[] bArr = new byte[i];
        f7021a.nextBytes(bArr);
        return bArr;
    }
}
