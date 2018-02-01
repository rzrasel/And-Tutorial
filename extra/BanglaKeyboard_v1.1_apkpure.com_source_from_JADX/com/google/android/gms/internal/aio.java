package com.google.android.gms.internal;

import org.json.JSONObject;

final class aio implements Runnable {
    private /* synthetic */ JSONObject f5146a;
    private /* synthetic */ ain f5147b;

    aio(ain com_google_android_gms_internal_ain, JSONObject jSONObject) {
        this.f5147b = com_google_android_gms_internal_ain;
        this.f5146a = jSONObject;
    }

    public final void run() {
        this.f5147b.f5143a.zzb("fetchHttpRequestCompleted", this.f5146a);
        id.m5372a(3);
    }
}
