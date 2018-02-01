package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.p056a.C1401c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class alp implements alt {
    final String f5319a;
    final Object f5320b = new Object();
    amf f5321c;
    int f5322d = -2;
    private final amc f5323e;
    private final long f5324f;
    private final alm f5325g;
    private final all f5326h;
    private zzix f5327i;
    private final zzjb f5328j;
    private final Context f5329k;
    private final zzajk f5330l;
    private final boolean f5331m;
    private final zzot f5332n;
    private final List<String> f5333o;
    private final List<String> f5334p;
    private final List<String> f5335q;
    private final boolean f5336r;
    private aml f5337s;

    public alp(Context context, String str, amc com_google_android_gms_internal_amc, alm com_google_android_gms_internal_alm, all com_google_android_gms_internal_all, zzix com_google_android_gms_internal_zzix, zzjb com_google_android_gms_internal_zzjb, zzajk com_google_android_gms_internal_zzajk, boolean z, boolean z2, zzot com_google_android_gms_internal_zzot, List<String> list, List<String> list2, List<String> list3) {
        this.f5329k = context;
        this.f5323e = com_google_android_gms_internal_amc;
        this.f5326h = com_google_android_gms_internal_all;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.f5319a = m4713d();
        } else {
            this.f5319a = str;
        }
        this.f5325g = com_google_android_gms_internal_alm;
        this.f5324f = com_google_android_gms_internal_alm.f5299b != -1 ? com_google_android_gms_internal_alm.f5299b : 10000;
        this.f5327i = com_google_android_gms_internal_zzix;
        this.f5328j = com_google_android_gms_internal_zzjb;
        this.f5330l = com_google_android_gms_internal_zzajk;
        this.f5331m = z;
        this.f5336r = z2;
        this.f5332n = com_google_android_gms_internal_zzot;
        this.f5333o = list;
        this.f5334p = list2;
        this.f5335q = list3;
    }

    private static amf m4709a(MediationAdapter mediationAdapter) {
        return new amv(mediationAdapter);
    }

    private final String m4710a(String str) {
        if (!(str == null || !m4722c() || m4721b(2))) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.remove("cpm_floor_cents");
                str = jSONObject.toString();
            } catch (JSONException e) {
                id.m5370a("Could not remove field. Returning the original value");
            }
        }
        return str;
    }

    static /* synthetic */ void m4711a(alp com_google_android_gms_internal_alp, alo com_google_android_gms_internal_alo) {
        String a = com_google_android_gms_internal_alp.m4710a(com_google_android_gms_internal_alp.f5326h.f5289j);
        try {
            if (com_google_android_gms_internal_alp.f5330l.f7708c < 4100000) {
                if (com_google_android_gms_internal_alp.f5328j.f7761d) {
                    com_google_android_gms_internal_alp.f5321c.mo1898a(C1401c.m3584a(com_google_android_gms_internal_alp.f5329k), com_google_android_gms_internal_alp.f5327i, a, com_google_android_gms_internal_alo);
                } else {
                    com_google_android_gms_internal_alp.f5321c.mo1902a(C1401c.m3584a(com_google_android_gms_internal_alp.f5329k), com_google_android_gms_internal_alp.f5328j, com_google_android_gms_internal_alp.f5327i, a, (ami) com_google_android_gms_internal_alo);
                }
            } else if (com_google_android_gms_internal_alp.f5331m || com_google_android_gms_internal_alp.f5326h.m4684b()) {
                List arrayList = new ArrayList(com_google_android_gms_internal_alp.f5333o);
                if (com_google_android_gms_internal_alp.f5334p != null) {
                    for (String str : com_google_android_gms_internal_alp.f5334p) {
                        String str2 = ":false";
                        if (com_google_android_gms_internal_alp.f5335q != null && com_google_android_gms_internal_alp.f5335q.contains(str)) {
                            str2 = ":true";
                        }
                        arrayList.add(new StringBuilder((String.valueOf(str).length() + 7) + String.valueOf(str2).length()).append("custom:").append(str).append(str2).toString());
                    }
                }
                com_google_android_gms_internal_alp.f5321c.mo1901a(C1401c.m3584a(com_google_android_gms_internal_alp.f5329k), com_google_android_gms_internal_alp.f5327i, a, com_google_android_gms_internal_alp.f5326h.f5280a, com_google_android_gms_internal_alo, com_google_android_gms_internal_alp.f5332n, arrayList);
            } else if (com_google_android_gms_internal_alp.f5328j.f7761d) {
                com_google_android_gms_internal_alp.f5321c.mo1900a(C1401c.m3584a(com_google_android_gms_internal_alp.f5329k), com_google_android_gms_internal_alp.f5327i, a, com_google_android_gms_internal_alp.f5326h.f5280a, (ami) com_google_android_gms_internal_alo);
            } else if (!com_google_android_gms_internal_alp.f5336r) {
                com_google_android_gms_internal_alp.f5321c.mo1903a(C1401c.m3584a(com_google_android_gms_internal_alp.f5329k), com_google_android_gms_internal_alp.f5328j, com_google_android_gms_internal_alp.f5327i, a, com_google_android_gms_internal_alp.f5326h.f5280a, com_google_android_gms_internal_alo);
            } else if (com_google_android_gms_internal_alp.f5326h.f5292m != null) {
                com_google_android_gms_internal_alp.f5321c.mo1901a(C1401c.m3584a(com_google_android_gms_internal_alp.f5329k), com_google_android_gms_internal_alp.f5327i, a, com_google_android_gms_internal_alp.f5326h.f5280a, com_google_android_gms_internal_alo, new zzot(m4712b(com_google_android_gms_internal_alp.f5326h.f5296q)), com_google_android_gms_internal_alp.f5326h.f5295p);
            } else {
                com_google_android_gms_internal_alp.f5321c.mo1903a(C1401c.m3584a(com_google_android_gms_internal_alp.f5329k), com_google_android_gms_internal_alp.f5328j, com_google_android_gms_internal_alp.f5327i, a, com_google_android_gms_internal_alp.f5326h.f5280a, com_google_android_gms_internal_alo);
            }
        } catch (Throwable e) {
            id.m5371a("Could not request ad from mediation adapter.", e);
            com_google_android_gms_internal_alp.mo1887a(5);
        }
    }

    private static NativeAdOptions m4712b(String str) {
        int i = 0;
        Builder builder = new Builder();
        if (str == null) {
            return builder.build();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            builder.setRequestMultipleImages(jSONObject.optBoolean("multiple_images", false));
            builder.setReturnUrlsForImageAssets(jSONObject.optBoolean("only_urls", false));
            String optString = jSONObject.optString("native_image_orientation", "any");
            if ("landscape".equals(optString)) {
                i = 2;
            } else if ("portrait".equals(optString)) {
                i = 1;
            } else if (!"any".equals(optString)) {
                i = -1;
            }
            builder.setImageOrientation(i);
        } catch (Throwable e) {
            id.m5371a("Exception occurred when creating native ad options", e);
        }
        return builder.build();
    }

    private final String m4713d() {
        try {
            if (!TextUtils.isEmpty(this.f5326h.f5284e)) {
                return this.f5323e.mo1894b(this.f5326h.f5284e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException e) {
            id.m5370a("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private final aml m4714e() {
        if (this.f5322d != 0 || !m4722c()) {
            return null;
        }
        try {
            if (!(!m4721b(4) || this.f5337s == null || this.f5337s.mo1889a() == 0)) {
                return this.f5337s;
            }
        } catch (RemoteException e) {
            id.m5370a("Could not get cpm value from MediationResponseMetadata");
        }
        return new alr(m4715f());
    }

    private final int m4715f() {
        if (this.f5326h.f5289j == null) {
            return 0;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f5326h.f5289j);
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f5319a)) {
                return jSONObject.optInt("cpm_cents", 0);
            }
            int optInt = m4721b(2) ? jSONObject.optInt("cpm_floor_cents", 0) : 0;
            return optInt == 0 ? jSONObject.optInt("penalized_average_cpm_cents", 0) : optInt;
        } catch (JSONException e) {
            id.m5370a("Could not convert to json. Returning 0");
            return 0;
        }
    }

    public final als m4716a(long j, long j2) {
        als com_google_android_gms_internal_als;
        synchronized (this.f5320b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            alo com_google_android_gms_internal_alo = new alo();
            gb.f6131a.post(new alq(this, com_google_android_gms_internal_alo));
            long j3 = this.f5324f;
            while (this.f5322d == -2) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j4 = j3 - (elapsedRealtime2 - elapsedRealtime);
                elapsedRealtime2 = j2 - (elapsedRealtime2 - j);
                if (j4 <= 0 || elapsedRealtime2 <= 0) {
                    id.m5372a(4);
                    this.f5322d = 3;
                } else {
                    try {
                        this.f5320b.wait(Math.min(j4, elapsedRealtime2));
                    } catch (InterruptedException e) {
                        this.f5322d = 5;
                    }
                }
            }
            com_google_android_gms_internal_als = new als(this.f5326h, this.f5321c, this.f5319a, com_google_android_gms_internal_alo, this.f5322d, m4714e(), zzbv.zzeg().mo1670b() - elapsedRealtime);
        }
        return com_google_android_gms_internal_als;
    }

    public final void m4717a() {
        synchronized (this.f5320b) {
            try {
                if (this.f5321c != null) {
                    this.f5321c.mo1908c();
                }
            } catch (Throwable e) {
                id.m5371a("Could not destroy mediation adapter.", e);
            }
            this.f5322d = -1;
            this.f5320b.notify();
        }
    }

    public final void mo1887a(int i) {
        synchronized (this.f5320b) {
            this.f5322d = i;
            this.f5320b.notify();
        }
    }

    public final void mo1888a(aml com_google_android_gms_internal_aml) {
        synchronized (this.f5320b) {
            this.f5322d = 0;
            this.f5337s = com_google_android_gms_internal_aml;
            this.f5320b.notify();
        }
    }

    final amf m4720b() {
        String str = "Instantiating mediation adapter: ";
        String valueOf = String.valueOf(this.f5319a);
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        id.m5372a(4);
        if (!(this.f5331m || this.f5326h.m4684b())) {
            if (((Boolean) zzbv.zzen().m4217a(ado.bf)).booleanValue() && "com.google.ads.mediation.admob.AdMobAdapter".equals(this.f5319a)) {
                return m4709a(new AdMobAdapter());
            }
            if (((Boolean) zzbv.zzen().m4217a(ado.bg)).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.f5319a)) {
                return m4709a(new AdUrlAdapter());
            }
            if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(this.f5319a)) {
                return new amv(new zzwn());
            }
        }
        try {
            return this.f5323e.mo1893a(this.f5319a);
        } catch (RemoteException e) {
            str = "Could not instantiate mediation adapter: ";
            valueOf = String.valueOf(this.f5319a);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
            id.m5372a(3);
            return null;
        }
    }

    final boolean m4721b(int i) {
        try {
            Bundle l = this.f5331m ? this.f5321c.mo1917l() : this.f5328j.f7761d ? this.f5321c.mo1916k() : this.f5321c.mo1915j();
            return l != null && (l.getInt("capabilities", 0) & i) == i;
        } catch (RemoteException e) {
            id.m5370a("Could not get adapter info. Returning false");
            return false;
        }
    }

    final boolean m4722c() {
        return this.f5325g.f5309l != -1;
    }
}
