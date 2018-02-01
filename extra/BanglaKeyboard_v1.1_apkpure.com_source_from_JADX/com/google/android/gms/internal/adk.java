package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@aqv
public final class adk {
    final Collection<ade> f4853a = new ArrayList();
    final Collection<ade<String>> f4854b = new ArrayList();
    final Collection<ade<String>> f4855c = new ArrayList();

    public final List<String> m4215a() {
        List<String> arrayList = new ArrayList();
        for (ade a : this.f4854b) {
            String str = (String) zzbv.zzen().m4217a(a);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void m4216a(Editor editor, JSONObject jSONObject) {
        for (ade com_google_android_gms_internal_ade : this.f4853a) {
            if (com_google_android_gms_internal_ade.f4850a == 1) {
                com_google_android_gms_internal_ade.mo1735a(editor, com_google_android_gms_internal_ade.mo1734a(jSONObject));
            }
        }
    }
}
