package com.google.android.gms.internal;

import java.util.Map;
import org.json.JSONObject;

final class ain implements Runnable {
    final /* synthetic */ jf f5143a;
    private /* synthetic */ Map f5144b;
    private /* synthetic */ aim f5145c;

    ain(aim com_google_android_gms_internal_aim, Map map, jf jfVar) {
        this.f5145c = com_google_android_gms_internal_aim;
        this.f5144b = map;
        this.f5143a = jfVar;
    }

    public final void run() {
        id.m5372a(3);
        JSONObject a = this.f5145c.m4568a((String) this.f5144b.get("http_request"));
        if (a == null) {
            id.m5372a(6);
        } else {
            gb.f6131a.post(new aio(this, a));
        }
    }
}
