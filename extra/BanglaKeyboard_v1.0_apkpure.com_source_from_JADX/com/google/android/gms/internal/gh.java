package com.google.android.gms.internal;

import android.util.Base64;

final class gh implements ng {
    gh() {
    }

    public final String mo894a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final byte[] mo895a(String str) {
        return Base64.decode(str, 2);
    }
}
