package com.google.android.gms.internal;

import org.json.JSONObject;

final class ae implements Runnable {
    final /* synthetic */ JSONObject f4939a;
    final /* synthetic */ String f4940b;
    private /* synthetic */ ac f4941c;

    ae(ac acVar, JSONObject jSONObject, String str) {
        this.f4941c = acVar;
        this.f4939a = jSONObject;
        this.f4940b = str;
    }

    public final void run() {
        this.f4941c.f4767m = ac.f4759d.zzb(null);
        this.f4941c.f4767m.zza(new af(this), new ag(this));
    }
}
