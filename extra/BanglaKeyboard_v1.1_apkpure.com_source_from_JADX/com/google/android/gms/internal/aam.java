package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

@aqv
public class aam extends AdListener {
    final Object f4749a = new Object();
    AdListener f4750b;

    public void onAdClosed() {
        synchronized (this.f4749a) {
            if (this.f4750b != null) {
                this.f4750b.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.f4749a) {
            if (this.f4750b != null) {
                this.f4750b.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.f4749a) {
            if (this.f4750b != null) {
                this.f4750b.onAdLeftApplication();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f4749a) {
            if (this.f4750b != null) {
                this.f4750b.onAdLoaded();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.f4749a) {
            if (this.f4750b != null) {
                this.f4750b.onAdOpened();
            }
        }
    }
}
