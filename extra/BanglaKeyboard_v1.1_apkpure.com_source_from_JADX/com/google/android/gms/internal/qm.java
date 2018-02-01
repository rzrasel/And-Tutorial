package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.KeyAgreement;

public final class qm implements qk<KeyAgreement> {
    public final /* synthetic */ Object mo2230a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
