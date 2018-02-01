package com.google.android.gms.internal;

import java.nio.charset.Charset;
import java.security.MessageDigest;

@aqv
public final class ys extends yj {
    private MessageDigest f7520b;
    private final int f7521c;
    private final int f7522d;

    public ys(int i) {
        int i2 = i / 8;
        if (i % 8 > 0) {
            i2++;
        }
        this.f7521c = i2;
        this.f7522d = i;
    }

    public final byte[] mo2331a(String str) {
        byte[] bArr;
        synchronized (this.a) {
            this.f7520b = m7031a();
            if (this.f7520b == null) {
                bArr = new byte[0];
            } else {
                this.f7520b.reset();
                this.f7520b.update(str.getBytes(Charset.forName("UTF-8")));
                Object digest = this.f7520b.digest();
                bArr = new byte[(digest.length > this.f7521c ? this.f7521c : digest.length)];
                System.arraycopy(digest, 0, bArr, 0, bArr.length);
                if (this.f7522d % 8 > 0) {
                    int i;
                    long j = 0;
                    for (i = 0; i < bArr.length; i++) {
                        if (i > 0) {
                            j <<= 8;
                        }
                        j += (long) (bArr[i] & 255);
                    }
                    j >>>= 8 - (this.f7522d % 8);
                    for (i = this.f7521c - 1; i >= 0; i--) {
                        bArr[i] = (byte) ((int) (255 & j));
                        j >>>= 8;
                    }
                }
            }
        }
        return bArr;
    }
}
