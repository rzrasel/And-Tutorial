package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.ail;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.es;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

@aqv
public final class zzak implements zzaj {
    private final zzai f4087a;
    private final HashSet<SimpleEntry<String, ail>> f4088b = new HashSet();

    public zzak(zzai com_google_android_gms_ads_internal_js_zzai) {
        this.f4087a = com_google_android_gms_ads_internal_js_zzai;
    }

    public final void zza(String str, ail com_google_android_gms_internal_ail) {
        this.f4087a.zza(str, com_google_android_gms_internal_ail);
        this.f4088b.add(new SimpleEntry(str, com_google_android_gms_internal_ail));
    }

    public final void zza(String str, JSONObject jSONObject) {
        this.f4087a.zza(str, jSONObject);
    }

    public final void zzb(String str, ail com_google_android_gms_internal_ail) {
        this.f4087a.zzb(str, com_google_android_gms_internal_ail);
        this.f4088b.remove(new SimpleEntry(str, com_google_android_gms_internal_ail));
    }

    public final void zzb(String str, JSONObject jSONObject) {
        this.f4087a.zzb(str, jSONObject);
    }

    public final void zzi(String str, String str2) {
        this.f4087a.zzi(str, str2);
    }

    public final void zzlg() {
        Iterator it = this.f4088b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((ail) simpleEntry.getValue()).toString());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            es.m5373a();
            this.f4087a.zzb((String) simpleEntry.getKey(), (ail) simpleEntry.getValue());
        }
        this.f4088b.clear();
    }
}
