package com.google.android.gms.internal;

import java.io.FilterInputStream;
import java.io.InputStream;

final class hu extends FilterInputStream {
    private int f6225a;

    private hu(InputStream inputStream) {
        super(inputStream);
        this.f6225a = 0;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f6225a++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f6225a += read;
        }
        return read;
    }
}
