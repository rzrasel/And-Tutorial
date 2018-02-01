package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ade;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aqv;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class zzaq {
    private String f4197a;
    private boolean f4198b;
    private int f4199c;
    private int f4200d;

    public zzaq(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
            }
        } else {
            jSONObject = null;
        }
        jSONObject2 = jSONObject;
        this.f4198b = m3685a(jSONObject2, "aggressive_media_codec_release", ado.f4911w);
        this.f4197a = m3687c(jSONObject2, "exo_player_version", ado.f4895g);
        this.f4200d = m3686b(jSONObject2, "exo_cache_buffer_size", ado.f4899k);
        this.f4199c = m3686b(jSONObject2, "exo_allocator_segment_size", ado.f4898j);
    }

    private static boolean m3685a(JSONObject jSONObject, String str, ade<Boolean> com_google_android_gms_internal_ade_java_lang_Boolean) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException e) {
            }
        }
        return ((Boolean) zzbv.zzen().m4217a(com_google_android_gms_internal_ade_java_lang_Boolean)).booleanValue();
    }

    private static int m3686b(JSONObject jSONObject, String str, ade<Integer> com_google_android_gms_internal_ade_java_lang_Integer) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException e) {
            }
        }
        return ((Integer) zzbv.zzen().m4217a(com_google_android_gms_internal_ade_java_lang_Integer)).intValue();
    }

    private static String m3687c(JSONObject jSONObject, String str, ade<String> com_google_android_gms_internal_ade_java_lang_String) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException e) {
            }
        }
        return (String) zzbv.zzen().m4217a(com_google_android_gms_internal_ade_java_lang_String);
    }
}
