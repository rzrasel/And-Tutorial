package com.google.android.gms.internal;

import android.support.v4.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

final class ajl implements Runnable {
    private /* synthetic */ String f5192a;
    private /* synthetic */ String f5193b;
    private /* synthetic */ int f5194c;
    private /* synthetic */ int f5195d;
    private /* synthetic */ boolean f5196e = false;
    private /* synthetic */ ajk f5197f;

    ajl(ajk com_google_android_gms_internal_ajk, String str, String str2, int i, int i2) {
        this.f5197f = com_google_android_gms_internal_ajk;
        this.f5192a = str;
        this.f5193b = str2;
        this.f5194c = i;
        this.f5195d = i2;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.f5192a);
        hashMap.put("cachedSrc", this.f5193b);
        hashMap.put("bytesLoaded", Integer.toString(this.f5194c));
        hashMap.put("totalBytes", Integer.toString(this.f5195d));
        hashMap.put("cacheReady", this.f5196e ? "1" : "0");
        ajk.m4595a(this.f5197f, "onPrecacheEvent", hashMap);
    }
}
