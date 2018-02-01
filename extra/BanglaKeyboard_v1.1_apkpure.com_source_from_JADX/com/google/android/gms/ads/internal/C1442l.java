package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.jf;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class C1442l implements ail {
    private /* synthetic */ CountDownLatch f4105a;

    C1442l(CountDownLatch countDownLatch) {
        this.f4105a = countDownLatch;
    }

    public final void mo1470a(jf jfVar, Map<String, String> map) {
        this.f4105a.countDown();
        if (jfVar == null) {
            throw null;
        }
        ((View) jfVar).setVisibility(0);
    }
}
