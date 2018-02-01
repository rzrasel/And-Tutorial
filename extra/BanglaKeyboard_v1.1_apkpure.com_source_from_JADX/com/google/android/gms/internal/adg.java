package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class adg extends ade<Integer> {
    adg(int i, String str, Integer num) {
        super(i, str, num);
    }

    public final /* synthetic */ Object mo1733a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.f4851b, ((Integer) this.f4852c).intValue()));
    }

    public final /* synthetic */ Object mo1734a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.f4851b, ((Integer) this.f4852c).intValue()));
    }

    public final /* synthetic */ void mo1735a(Editor editor, Object obj) {
        editor.putInt(this.f4851b, ((Integer) obj).intValue());
    }
}
