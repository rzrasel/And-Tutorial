package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class adi extends ade<Float> {
    adi(int i, String str, Float f) {
        super(i, str, f);
    }

    public final /* synthetic */ Object mo1733a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.f4851b, ((Float) this.f4852c).floatValue()));
    }

    public final /* synthetic */ Object mo1734a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.f4851b, (double) ((Float) this.f4852c).floatValue()));
    }

    public final /* synthetic */ void mo1735a(Editor editor, Object obj) {
        editor.putFloat(this.f4851b, ((Float) obj).floatValue());
    }
}
