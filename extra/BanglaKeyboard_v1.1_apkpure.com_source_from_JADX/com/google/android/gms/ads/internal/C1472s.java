package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.C1585l;
import com.google.android.gms.internal.aec;
import com.google.android.gms.internal.afc;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.ih;
import com.google.android.gms.internal.zzaak;
import com.google.android.gms.internal.zzix;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

final class C1472s implements Callable<afc> {
    private /* synthetic */ int f4271a;
    private /* synthetic */ JSONArray f4272b;
    private /* synthetic */ int f4273c;
    private /* synthetic */ ef f4274d;
    private /* synthetic */ zzbc f4275e;

    C1472s(zzbc com_google_android_gms_ads_internal_zzbc, int i, JSONArray jSONArray, int i2, ef efVar) {
        this.f4275e = com_google_android_gms_ads_internal_zzbc;
        this.f4271a = i;
        this.f4272b = jSONArray;
        this.f4273c = i2;
        this.f4274d = efVar;
    }

    public final /* synthetic */ Object call() {
        if (this.f4271a >= this.f4272b.length()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f4272b.get(this.f4271a));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        zza com_google_android_gms_ads_internal_zzbc = new zzbc(this.f4275e.zzams.zzaie, this.f4275e.g, this.f4275e.zzams.zzatn, this.f4275e.zzams.zzath, this.f4275e.zzana, this.f4275e.zzams.zzatj, true);
        zzbc.m3749a(this.f4275e.zzams, com_google_android_gms_ads_internal_zzbc.zzams);
        com_google_android_gms_ads_internal_zzbc.m3756b();
        com_google_android_gms_ads_internal_zzbc.zza(this.f4275e.b);
        aec com_google_android_gms_internal_aec = com_google_android_gms_ads_internal_zzbc.f4292a;
        int i = this.f4271a;
        com_google_android_gms_internal_aec.m4235a("num_ads_requested", String.valueOf(this.f4273c));
        com_google_android_gms_internal_aec.m4235a("ad_index", String.valueOf(i));
        zzaak com_google_android_gms_internal_zzaak = this.f4274d.f5978a;
        String jSONObject2 = jSONObject.toString();
        Bundle bundle = com_google_android_gms_internal_zzaak.f7613c.f7742c != null ? new Bundle(com_google_android_gms_internal_zzaak.f7613c.f7742c) : new Bundle();
        bundle.putString("_ad", jSONObject2);
        com_google_android_gms_ads_internal_zzbc.zza(new C1585l(com_google_android_gms_internal_zzaak.f7612b, new zzix(com_google_android_gms_internal_zzaak.f7613c.f7740a, com_google_android_gms_internal_zzaak.f7613c.f7741b, bundle, com_google_android_gms_internal_zzaak.f7613c.f7743d, com_google_android_gms_internal_zzaak.f7613c.f7744e, com_google_android_gms_internal_zzaak.f7613c.f7745f, com_google_android_gms_internal_zzaak.f7613c.f7746g, com_google_android_gms_internal_zzaak.f7613c.f7747h, com_google_android_gms_internal_zzaak.f7613c.f7748i, com_google_android_gms_internal_zzaak.f7613c.f7749j, com_google_android_gms_internal_zzaak.f7613c.f7750k, com_google_android_gms_internal_zzaak.f7613c.f7751l, com_google_android_gms_internal_zzaak.f7613c.f7752m, com_google_android_gms_internal_zzaak.f7613c.f7753n, com_google_android_gms_internal_zzaak.f7613c.f7754o, com_google_android_gms_internal_zzaak.f7613c.f7755p, com_google_android_gms_internal_zzaak.f7613c.f7756q, com_google_android_gms_internal_zzaak.f7613c.f7757r), com_google_android_gms_internal_zzaak.f7614d, com_google_android_gms_internal_zzaak.f7615e, com_google_android_gms_internal_zzaak.f7616f, com_google_android_gms_internal_zzaak.f7617g, com_google_android_gms_internal_zzaak.f7619i, com_google_android_gms_internal_zzaak.f7620j, com_google_android_gms_internal_zzaak.f7621k, com_google_android_gms_internal_zzaak.f7622l, com_google_android_gms_internal_zzaak.f7624n, com_google_android_gms_internal_zzaak.f7636z, com_google_android_gms_internal_zzaak.f7625o, com_google_android_gms_internal_zzaak.f7626p, com_google_android_gms_internal_zzaak.f7627q, com_google_android_gms_internal_zzaak.f7628r, com_google_android_gms_internal_zzaak.f7629s, com_google_android_gms_internal_zzaak.f7630t, com_google_android_gms_internal_zzaak.f7631u, com_google_android_gms_internal_zzaak.f7632v, com_google_android_gms_internal_zzaak.f7633w, com_google_android_gms_internal_zzaak.f7634x, com_google_android_gms_internal_zzaak.f7635y, com_google_android_gms_internal_zzaak.f7586B, com_google_android_gms_internal_zzaak.f7587C, com_google_android_gms_internal_zzaak.f7593I, com_google_android_gms_internal_zzaak.f7588D, com_google_android_gms_internal_zzaak.f7589E, com_google_android_gms_internal_zzaak.f7590F, com_google_android_gms_internal_zzaak.f7591G, ih.m5638a(com_google_android_gms_internal_zzaak.f7592H), com_google_android_gms_internal_zzaak.f7594J, com_google_android_gms_internal_zzaak.f7595K, com_google_android_gms_internal_zzaak.f7596L, com_google_android_gms_internal_zzaak.f7597M, com_google_android_gms_internal_zzaak.f7598N, com_google_android_gms_internal_zzaak.f7599O, com_google_android_gms_internal_zzaak.f7600P, com_google_android_gms_internal_zzaak.f7601Q, com_google_android_gms_internal_zzaak.f7605U, ih.m5638a(com_google_android_gms_internal_zzaak.f7618h), com_google_android_gms_internal_zzaak.f7606V, com_google_android_gms_internal_zzaak.f7607W, com_google_android_gms_internal_zzaak.f7608X, 1, com_google_android_gms_internal_zzaak.f7610Z, com_google_android_gms_internal_zzaak.aa), com_google_android_gms_ads_internal_zzbc.f4292a);
        return (afc) com_google_android_gms_ads_internal_zzbc.f4361h.get();
    }
}
