package com.google.android.gms.internal;

import android.support.v4.app.NotificationCompat;

public final class mv {
    final byte[] f1953a = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
    int f1954b;
    int f1955c;

    public mv(byte[] bArr) {
        int i;
        for (i = 0; i < NotificationCompat.FLAG_LOCAL_ONLY; i++) {
            this.f1953a[i] = (byte) i;
        }
        i = 0;
        for (int i2 = 0; i2 < NotificationCompat.FLAG_LOCAL_ONLY; i2++) {
            i = ((i + this.f1953a[i2]) + bArr[i2 % bArr.length]) & 255;
            byte b = this.f1953a[i2];
            this.f1953a[i2] = this.f1953a[i];
            this.f1953a[i] = b;
        }
        this.f1954b = 0;
        this.f1955c = 0;
    }

    public final void m2630a(byte[] bArr) {
        int i = this.f1954b;
        int i2 = this.f1955c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f1953a[i]) & 255;
            byte b = this.f1953a[i];
            this.f1953a[i] = this.f1953a[i2];
            this.f1953a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f1953a[(this.f1953a[i] + this.f1953a[i2]) & 255]);
        }
        this.f1954b = i;
        this.f1955c = i2;
    }
}
