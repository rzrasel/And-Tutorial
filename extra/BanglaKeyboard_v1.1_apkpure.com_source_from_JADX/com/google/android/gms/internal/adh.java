package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class adh extends ade<Long> {
    adh(int i, String str, Long l) {
        super(i, str, l);
    }

    public final /* synthetic */ Object mo1733a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.f4851b, ((Long) this.f4852c).longValue()));
    }

    public final /* synthetic */ Object mo1734a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.f4851b, ((Long) this.f4852c).longValue()));
    }

    public final /* synthetic */ void mo1735a(Editor editor, Object obj) {
        editor.putLong(this.f4851b, ((Long) obj).longValue());
    }
}
