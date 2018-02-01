package com.google.android.gms.internal;

import java.security.Key;
import javax.crypto.Mac;

public final class qt implements ou {
    private Mac f7017a;
    private final int f7018b;
    private final String f7019c;
    private final Key f7020d;

    public qt(String str, Key key, int i) {
        this.f7019c = str;
        this.f7018b = i;
        this.f7020d = key;
        this.f7017a = (Mac) qj.f7006b.m6465a(str);
        this.f7017a.init(key);
    }

    public final byte[] mo2231a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.f7017a.clone();
        } catch (CloneNotSupportedException e) {
            mac = (Mac) qj.f7006b.m6465a(this.f7019c);
            mac.init(this.f7020d);
        }
        mac.update(bArr);
        Object obj = new byte[this.f7018b];
        System.arraycopy(mac.doFinal(), 0, obj, 0, this.f7018b);
        return obj;
    }
}
