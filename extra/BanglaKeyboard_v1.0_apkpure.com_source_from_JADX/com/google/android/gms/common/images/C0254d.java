package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

final class C0254d implements Runnable {
    final /* synthetic */ ImageManager f549a;
    private final Uri f550b;
    private final Bitmap f551c;
    private final CountDownLatch f552d;
    private boolean f553e;

    public C0254d(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f549a = imageManager;
        this.f550b = uri;
        this.f551c = bitmap;
        this.f553e = z;
        this.f552d = countDownLatch;
    }

    private void m1032a(ImageReceiver imageReceiver, boolean z) {
        ArrayList a = imageReceiver.f525c;
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C0255e c0255e = (C0255e) a.get(i);
            if (z) {
                c0255e.m1034a(this.f549a.f528c, this.f551c);
            } else {
                c0255e.m1035a(this.f549a.f528c, this.f549a.f532g);
            }
            if (!(c0255e instanceof C0257g)) {
                this.f549a.f533h.remove(c0255e);
            }
        }
    }

    public final void run() {
        String str = "OnBitmapLoadedRunnable must be executed in the main thread";
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            "checkMainThread: current thread " + Thread.currentThread() + " IS NOT the main thread " + Looper.getMainLooper().getThread() + "!";
            throw new IllegalStateException(str);
        }
        boolean z = this.f551c != null;
        if (this.f549a.f531f != null) {
            if (this.f553e) {
                this.f549a.f531f.m1029a(-1);
                System.gc();
                this.f553e = false;
                this.f549a.f529d.post(this);
                return;
            } else if (z) {
                this.f549a.f531f.m1028a(new C0256f(this.f550b), this.f551c);
            }
        }
        ImageReceiver imageReceiver = (ImageReceiver) this.f549a.f534i.remove(this.f550b);
        if (imageReceiver != null) {
            m1032a(imageReceiver, z);
        }
        this.f552d.countDown();
        synchronized (ImageManager.f526a) {
            ImageManager.f527b.remove(this.f550b);
        }
    }
}
