package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class adf extends ade<Boolean> {
    adf(int i, String str, Boolean bool) {
        super(i, str, bool);
    }

    public final /* synthetic */ Object mo1733a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.f4851b, ((Boolean) this.f4852c).booleanValue()));
    }

    public final /* synthetic */ Object mo1734a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.f4851b, ((Boolean) this.f4852c).booleanValue()));
    }

    public final /* synthetic */ void mo1735a(Editor editor, Object obj) {
        editor.putBoolean(this.f4851b, ((Boolean) obj).booleanValue());
    }
}
