package com.google.android.gms.internal;

final class yb implements Runnable {
    private /* synthetic */ ya f7476a;

    yb(ya yaVar) {
        this.f7476a = yaVar;
    }

    public final void run() {
        synchronized (this.f7476a.f7468c) {
            if (this.f7476a.f7472g && this.f7476a.f7473h) {
                this.f7476a.f7472g = false;
                id.m5372a(3);
                for (yc d : this.f7476a.f7469d) {
                    try {
                        d.mo2090d(false);
                    } catch (Exception e) {
                        id.m5372a(6);
                    }
                }
            } else {
                id.m5372a(3);
            }
        }
    }
}
