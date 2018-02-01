package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class ym {
    private ByteArrayOutputStream f7514a = new ByteArrayOutputStream(4096);
    private Base64OutputStream f7515b = new Base64OutputStream(this.f7514a, 10);

    public final void m7035a(byte[] bArr) {
        this.f7515b.write(bArr);
    }

    public final String toString() {
        String byteArrayOutputStream;
        try {
            this.f7515b.close();
        } catch (IOException e) {
            id.m5372a(6);
        }
        try {
            this.f7514a.close();
            byteArrayOutputStream = this.f7514a.toString();
        } catch (IOException e2) {
            id.m5372a(6);
            byteArrayOutputStream = "";
        } finally {
            this.f7514a = null;
            this.f7515b = null;
        }
        return byteArrayOutputStream;
    }
}
