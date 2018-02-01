package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.C1483a;
import com.google.android.gms.common.C1489b;
import java.io.IOException;

final class ec implements Runnable {
    private /* synthetic */ Context f5940a;
    private /* synthetic */ ir f5941b;

    ec(Context context, ir irVar) {
        this.f5940a = context;
        this.f5941b = irVar;
    }

    public final void run() {
        Throwable e;
        try {
            this.f5941b.m3633b(AdvertisingIdClient.getAdvertisingIdInfo(this.f5940a));
            return;
        } catch (IOException e2) {
            e = e2;
        } catch (IllegalStateException e3) {
            e = e3;
        } catch (C1483a e4) {
            e = e4;
        } catch (C1489b e5) {
            e = e5;
        }
        this.f5941b.m3632a(e);
        id.m5372a(6);
    }
}
