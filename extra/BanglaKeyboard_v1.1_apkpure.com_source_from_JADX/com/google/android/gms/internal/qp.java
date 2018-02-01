package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.Mac;

public final class qp implements qk<Mac> {
    public final /* synthetic */ Object mo2230a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
