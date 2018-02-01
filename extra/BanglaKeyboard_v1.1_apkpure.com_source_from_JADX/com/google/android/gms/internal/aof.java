package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@aqv
public class aof {
    private final String f5450a;
    final jf f5451s;

    public aof(jf jfVar) {
        this(jfVar, "");
    }

    public aof(jf jfVar, String str) {
        this.f5451s = jfVar;
        this.f5450a = str;
    }

    public final void m4981a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f5451s.zzb("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            id.m5372a(6);
        }
    }

    public final void m4982a(String str) {
        try {
            this.f5451s.zzb("onError", new JSONObject().put("message", str).put("action", this.f5450a));
        } catch (JSONException e) {
            id.m5372a(6);
        }
    }

    public final void m4983b(String str) {
        try {
            this.f5451s.zzb("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            id.m5372a(6);
        }
    }
}
