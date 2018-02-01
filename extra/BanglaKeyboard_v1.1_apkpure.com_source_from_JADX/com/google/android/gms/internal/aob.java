package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class aob {
    private final boolean f5496a;
    private final boolean f5497b;
    private final boolean f5498c;
    private final boolean f5499d;
    private final boolean f5500e;

    private aob(aod com_google_android_gms_internal_aod) {
        this.f5496a = com_google_android_gms_internal_aod.f5501a;
        this.f5497b = com_google_android_gms_internal_aod.f5502b;
        this.f5498c = com_google_android_gms_internal_aod.f5503c;
        this.f5499d = com_google_android_gms_internal_aod.f5504d;
        this.f5500e = com_google_android_gms_internal_aod.f5505e;
    }

    public final JSONObject m5000a() {
        try {
            return new JSONObject().put("sms", this.f5496a).put("tel", this.f5497b).put("calendar", this.f5498c).put("storePicture", this.f5499d).put("inlineVideo", this.f5500e);
        } catch (JSONException e) {
            id.m5372a(6);
            return null;
        }
    }
}
