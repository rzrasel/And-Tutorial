package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

final class C0253c implements Runnable {
    final /* synthetic */ ImageManager f546a;
    private final Uri f547b;
    private final ParcelFileDescriptor f548c;

    public C0253c(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f546a = imageManager;
        this.f547b = uri;
        this.f548c = parcelFileDescriptor;
    }

    public final void run() {
        String str = "LoadBitmapFromDiskRunnable can't be executed in the main thread";
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            "checkNotMainThread: current thread " + Thread.currentThread() + " IS the main thread " + Looper.getMainLooper().getThread() + "!";
            throw new IllegalStateException(str);
        }
        boolean z = false;
        Bitmap bitmap = null;
        if (this.f548c != null) {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(this.f548c.getFileDescriptor());
            } catch (OutOfMemoryError e) {
                "OOM while loading bitmap for uri: " + this.f547b;
                z = true;
            }
            try {
                this.f548c.close();
            } catch (IOException e2) {
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f546a.f529d.post(new C0254d(this.f546a, this.f547b, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e3) {
            Log.w("ImageManager", "Latch interrupted while posting " + this.f547b);
        }
    }
}
