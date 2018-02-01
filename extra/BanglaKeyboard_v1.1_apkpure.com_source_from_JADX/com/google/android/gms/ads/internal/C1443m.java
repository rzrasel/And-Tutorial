package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.jf;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class C1443m implements ail {
    private /* synthetic */ CountDownLatch f4106a;

    C1443m(CountDownLatch countDownLatch) {
        this.f4106a = countDownLatch;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        id.m5370a("Adapter returned an ad, but assets substitution failed");
        this.f4106a.countDown();
        jfVar.destroy();
    }
}
