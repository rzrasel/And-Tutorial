package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.ads.internal.js.zzl;
import com.google.android.gms.ads.internal.js.zzy;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.C1483a;
import com.google.android.gms.common.C1489b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class ac extends eq {
    private static long f4756a = TimeUnit.SECONDS.toMillis(10);
    private static final Object f4757b = new Object();
    private static boolean f4758c = false;
    private static zzl f4759d = null;
    private static aim f4760f = null;
    private static aiv f4761g = null;
    private static ail f4762h = null;
    private final aqx f4763i;
    private final C1585l f4764j;
    private final Object f4765k = new Object();
    private final Context f4766l;
    private zzy f4767m;
    private zn f4768n;

    public ac(Context context, C1585l c1585l, aqx com_google_android_gms_internal_aqx, zn znVar) {
        super((byte) 0);
        this.f4763i = com_google_android_gms_internal_aqx;
        this.f4766l = context;
        this.f4764j = c1585l;
        this.f4768n = znVar;
        synchronized (f4757b) {
            if (!f4758c) {
                f4761g = new aiv();
                f4760f = new aim(context.getApplicationContext(), c1585l.f6511j);
                f4762h = new ak();
                f4759d = new zzl(this.f4766l.getApplicationContext(), this.f4764j.f6511j, (String) zzbv.zzen().m4217a(ado.f4888a), new aj(), new ai());
                f4758c = true;
            }
        }
    }

    private final zzaao m4081a(zzaak com_google_android_gms_internal_zzaak) {
        zzbv.zzea();
        String a = gb.m5435a();
        JSONObject a2 = m4082a(com_google_android_gms_internal_zzaak, a);
        if (a2 == null) {
            return new zzaao(0);
        }
        long b = zzbv.zzeg().mo1670b();
        aiv com_google_android_gms_internal_aiv = f4761g;
        Future irVar = new ir();
        com_google_android_gms_internal_aiv.f5162a.put(a, irVar);
        hz.f6240a.post(new ae(this, a2, a));
        try {
            JSONObject jSONObject = (JSONObject) irVar.get(f4756a - (zzbv.zzeg().mo1670b() - b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new zzaao(-1);
            }
            zzaao a3 = av.m5101a(this.f4766l, com_google_android_gms_internal_zzaak, jSONObject.toString());
            return (a3.f7658d == -3 || !TextUtils.isEmpty(a3.f7656b)) ? a3 : new zzaao(3);
        } catch (CancellationException e) {
            return new zzaao(-1);
        } catch (InterruptedException e2) {
            return new zzaao(-1);
        } catch (TimeoutException e3) {
            return new zzaao(2);
        } catch (ExecutionException e4) {
            return new zzaao(0);
        }
    }

    private final JSONObject m4082a(zzaak com_google_android_gms_internal_zzaak, String str) {
        Throwable e;
        Object obj;
        Info advertisingIdInfo;
        Map hashMap;
        JSONObject jSONObject = null;
        Bundle bundle = com_google_android_gms_internal_zzaak.f7613c.f7742c.getBundle("sdk_less_server_data");
        if (bundle != null) {
            be beVar;
            try {
                beVar = (be) zzbv.zzek().m5125a(this.f4766l).get();
            } catch (Throwable e2) {
                id.m5371a("Error grabbing device info: ", e2);
                obj = jSONObject;
            }
            Context context = this.f4766l;
            am amVar = new am();
            amVar.f5389i = com_google_android_gms_internal_zzaak;
            amVar.f5390j = beVar;
            JSONObject a = av.m5105a(context, amVar);
            if (a != null) {
                try {
                    advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f4766l);
                } catch (IOException e3) {
                    e2 = e3;
                    id.m5371a("Cannot get advertising id info", e2);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put("adid", advertisingIdInfo.getId());
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = zzbv.zzea().m5504a(hashMap);
                    return jSONObject;
                } catch (IllegalStateException e4) {
                    e2 = e4;
                    id.m5371a("Cannot get advertising id info", e2);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put("adid", advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        }
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = zzbv.zzea().m5504a(hashMap);
                    return jSONObject;
                } catch (C1483a e5) {
                    e2 = e5;
                    id.m5371a("Cannot get advertising id info", e2);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put("adid", advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        }
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = zzbv.zzea().m5504a(hashMap);
                    return jSONObject;
                } catch (C1489b e6) {
                    e2 = e6;
                    id.m5371a("Cannot get advertising id info", e2);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put("adid", advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        }
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = zzbv.zzea().m5504a(hashMap);
                    return jSONObject;
                }
                hashMap = new HashMap();
                hashMap.put("request_id", str);
                hashMap.put("request_param", a);
                hashMap.put("data", bundle);
                if (advertisingIdInfo != null) {
                    hashMap.put("adid", advertisingIdInfo.getId());
                    if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                    }
                    hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                }
                try {
                    jSONObject = zzbv.zzea().m5504a(hashMap);
                } catch (JSONException e7) {
                }
            }
        }
        return jSONObject;
    }

    protected static void m4083a(zza com_google_android_gms_ads_internal_js_zza) {
        com_google_android_gms_ads_internal_js_zza.zza("/loadAd", f4761g);
        com_google_android_gms_ads_internal_js_zza.zza("/fetchHttpRequest", f4760f);
        com_google_android_gms_ads_internal_js_zza.zza("/invalidRequest", f4762h);
    }

    protected static void m4085b(zza com_google_android_gms_ads_internal_js_zza) {
        com_google_android_gms_ads_internal_js_zza.zzb("/loadAd", f4761g);
        com_google_android_gms_ads_internal_js_zza.zzb("/fetchHttpRequest", f4760f);
        com_google_android_gms_ads_internal_js_zza.zzb("/invalidRequest", f4762h);
    }

    public final void mo1475a() {
        id.m5372a(3);
        String i = zzbv.zzez().m5308i(this.f4766l);
        zzaak com_google_android_gms_internal_zzaak = new zzaak(this.f4764j, -1, zzbv.zzez().m5306g(this.f4766l), zzbv.zzez().m5307h(this.f4766l), i);
        zzbv.zzez().m5300c(this.f4766l, i);
        zzaao a = m4081a(com_google_android_gms_internal_zzaak);
        zzaak com_google_android_gms_internal_zzaak2 = com_google_android_gms_internal_zzaak;
        alm com_google_android_gms_internal_alm = null;
        zzjb com_google_android_gms_internal_zzjb = null;
        hz.f6240a.post(new ad(this, new ef(com_google_android_gms_internal_zzaak2, a, com_google_android_gms_internal_alm, com_google_android_gms_internal_zzjb, a.f7658d, zzbv.zzeg().mo1670b(), a.f7667m, null, this.f4768n)));
    }

    public final void mo1476b() {
        synchronized (this.f4765k) {
            hz.f6240a.post(new ah(this));
        }
    }
}
