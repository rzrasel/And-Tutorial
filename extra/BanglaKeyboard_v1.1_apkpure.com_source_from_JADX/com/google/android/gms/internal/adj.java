package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class adj extends ade<String> {
    adj(int i, String str, String str2) {
        super(i, str, str2);
    }

    public final /* synthetic */ Object mo1733a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f4851b, (String) this.f4852c);
    }

    public final /* synthetic */ Object mo1734a(JSONObject jSONObject) {
        return jSONObject.optString(this.f4851b, (String) this.f4852c);
    }

    public final /* synthetic */ void mo1735a(Editor editor, Object obj) {
        editor.putString(this.f4851b, (String) obj);
    }
}
