package com.google.android.gms.internal;

import android.support.v4.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

final class ajm implements Runnable {
    private /* synthetic */ String f5198a;
    private /* synthetic */ String f5199b;
    private /* synthetic */ int f5200c;
    private /* synthetic */ ajk f5201d;

    ajm(ajk com_google_android_gms_internal_ajk, String str, String str2, int i) {
        this.f5201d = com_google_android_gms_internal_ajk;
        this.f5198a = str;
        this.f5199b = str2;
        this.f5200c = i;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.f5198a);
        hashMap.put("cachedSrc", this.f5199b);
        hashMap.put("totalBytes", Integer.toString(this.f5200c));
        ajk.m4595a(this.f5201d, "onPrecacheEvent", hashMap);
    }
}
