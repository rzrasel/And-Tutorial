package com.google.android.gms.internal;

import com.google.android.gms.internal.oz.C1635a.C1634b;
import com.google.android.gms.internal.oz.C1641c;
import com.google.android.gms.internal.oz.C1641c.C1640b;
import java.security.GeneralSecurityException;

public final class ov {
    public static final or m6306a(byte[] bArr) {
        try {
            C1641c a = C1641c.m6342a(bArr);
            for (C1640b c1640b : a.f6926b) {
                if (c1640b.m6335a().m6324a() == C1634b.UNKNOWN_KEYMATERIAL || c1640b.m6335a().m6324a() == C1634b.SYMMETRIC) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                } else if (c1640b.m6335a().m6324a() == C1634b.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return new or(a);
        } catch (tf e) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
