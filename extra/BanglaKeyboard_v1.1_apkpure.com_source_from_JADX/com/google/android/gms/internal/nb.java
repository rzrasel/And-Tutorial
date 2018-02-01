package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;

final class nb implements Runnable {
    private /* synthetic */ na f6672a;

    nb(na naVar) {
        this.f6672a = naVar;
    }

    public final void run() {
        if (this.f6672a.f6670b == null) {
            synchronized (na.f6668d) {
                if (this.f6672a.f6670b != null) {
                    return;
                }
                boolean booleanValue = ((Boolean) zzbv.zzen().m4217a(ado.bl)).booleanValue();
                if (booleanValue) {
                    try {
                        na.f6667a = new zn(this.f6672a.f6671c.f6727a, "ADSHIELD");
                    } catch (Throwable th) {
                        booleanValue = false;
                    }
                }
                this.f6672a.f6670b = Boolean.valueOf(booleanValue);
                na.f6668d.open();
            }
        }
    }
}
