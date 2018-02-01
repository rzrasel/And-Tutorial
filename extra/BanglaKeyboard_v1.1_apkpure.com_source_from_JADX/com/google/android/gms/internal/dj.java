package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

final class dj implements Runnable {
    private /* synthetic */ Bitmap f5920a;
    private /* synthetic */ di f5921b;

    dj(di diVar, Bitmap bitmap) {
        this.f5921b = diVar;
        this.f5920a = bitmap;
    }

    public final void run() {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f5920a.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f5921b.f5911c) {
            this.f5921b.f5909a.f7269g = new vm();
            this.f5921b.f5909a.f7269g.f7302c = byteArrayOutputStream.toByteArray();
            this.f5921b.f5909a.f7269g.f7301b = "image/png";
            this.f5921b.f5909a.f7269g.f7300a = Integer.valueOf(1);
        }
    }
}
