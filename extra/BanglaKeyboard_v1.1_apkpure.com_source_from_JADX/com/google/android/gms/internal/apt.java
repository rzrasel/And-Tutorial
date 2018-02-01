package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbc;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class apt implements Callable<ee> {
    private static long f5586a = TimeUnit.SECONDS.toMillis(60);
    private final Context f5587b;
    private final he f5588c;
    private final zzbc f5589d;
    private final nh f5590e;
    private apn f5591f;
    private final Object f5592g = new Object();
    private final ef f5593h;
    private final aec f5594i;
    private boolean f5595j;
    private int f5596k;
    private List<String> f5597l;
    private JSONObject f5598m;
    private String f5599n;
    private boolean f5600o;

    public apt(Context context, zzbc com_google_android_gms_ads_internal_zzbc, he heVar, nh nhVar, ef efVar, aec com_google_android_gms_internal_aec) {
        this.f5587b = context;
        this.f5589d = com_google_android_gms_ads_internal_zzbc;
        this.f5588c = heVar;
        this.f5593h = efVar;
        this.f5590e = nhVar;
        this.f5594i = com_google_android_gms_internal_aec;
        if (((Boolean) zzbv.zzen().m4217a(ado.bM)).booleanValue()) {
            this.f5591f = com_google_android_gms_ads_internal_zzbc.zzdi();
        }
        if (this.f5591f == null) {
            this.f5591f = new apn(context, efVar, com_google_android_gms_ads_internal_zzbc, nhVar);
            this.f5591f.m5039a();
            this.f5600o = true;
        }
        this.f5595j = false;
        this.f5596k = -2;
        this.f5597l = null;
        this.f5599n = null;
    }

    private final ee m5045a(afc com_google_android_gms_internal_afc) {
        int i;
        synchronized (this.f5592g) {
            i = this.f5596k;
            if (com_google_android_gms_internal_afc == null && this.f5596k == -2) {
                i = 0;
            }
        }
        return new ee(this.f5593h.f5978a.f7613c, null, this.f5593h.f5979b.f7657c, i, this.f5593h.f5979b.f7659e, this.f5597l, this.f5593h.f5979b.f7665k, this.f5593h.f5979b.f7664j, this.f5593h.f5978a.f7619i, false, null, null, null, null, null, 0, this.f5593h.f5981d, this.f5593h.f5979b.f7660f, this.f5593h.f5983f, this.f5593h.f5984g, this.f5593h.f5979b.f7668n, this.f5598m, i != -2 ? null : com_google_android_gms_internal_afc, null, null, null, this.f5593h.f5979b.f7640D, this.f5593h.f5979b.f7641E, null, this.f5593h.f5979b.f7644H, this.f5599n, this.f5593h.f5986i);
    }

    static jf m5047a(il<jf> ilVar) {
        Throwable e;
        try {
            return (jf) ilVar.get((long) ((Integer) zzbv.zzen().m4217a(ado.bQ)).intValue(), TimeUnit.SECONDS);
        } catch (Throwable e2) {
            id.m5371a("InterruptedException occurred while waiting for video to load", e2);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e3) {
            e2 = e3;
            id.m5371a("Exception occurred while waiting for video to load", e2);
        } catch (TimeoutException e4) {
            e2 = e4;
            id.m5371a("Exception occurred while waiting for video to load", e2);
        } catch (CancellationException e5) {
            e2 = e5;
            id.m5371a("Exception occurred while waiting for video to load", e2);
        }
        return null;
    }

    static /* synthetic */ List m5048a(List list) {
        List arrayList = new ArrayList();
        for (il ilVar : list) {
            Object obj = ilVar.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    static /* synthetic */ void m5049a(apt com_google_android_gms_internal_apt, agp com_google_android_gms_internal_agp, String str) {
        try {
            aha zzr = com_google_android_gms_internal_apt.f5589d.zzr(com_google_android_gms_internal_agp.mo1768l());
            if (zzr != null) {
                zzr.mo1862a(com_google_android_gms_internal_agp, str);
            }
        } catch (Throwable e) {
            id.m5371a(new StringBuilder(String.valueOf(str).length() + 40).append("Failed to call onCustomClick for asset ").append(str).append(".").toString(), e);
        }
    }

    private final ee m5051b() {
        try {
            JSONObject jSONObject;
            aqd com_google_android_gms_internal_aqd;
            afc com_google_android_gms_internal_afc;
            if (this.f5600o) {
                this.f5591f.m5041b();
            }
            String uuid = UUID.randomUUID().toString();
            if (m5061a()) {
                jSONObject = null;
            } else {
                ir irVar = new ir();
                this.f5591f.m5040a(new apu(this, uuid, new aqe(), irVar));
                jSONObject = (JSONObject) irVar.get(f5586a, TimeUnit.MILLISECONDS);
            }
            if (m5061a() || jSONObject == null) {
                com_google_android_gms_internal_aqd = null;
            } else {
                String string = jSONObject.getString("template_id");
                boolean z = this.f5593h.f5978a.f7635y != null ? this.f5593h.f5978a.f7635y.f7788b : false;
                boolean z2 = this.f5593h.f5978a.f7635y != null ? this.f5593h.f5978a.f7635y.f7790d : false;
                Object com_google_android_gms_internal_aqn;
                if ("2".equals(string)) {
                    com_google_android_gms_internal_aqn = new aqn(z, z2);
                } else if ("1".equals(string)) {
                    com_google_android_gms_internal_aqn = new aqo(z, z2);
                } else {
                    if ("3".equals(string)) {
                        String string2 = jSONObject.getString("custom_template_id");
                        ir irVar2 = new ir();
                        gb.f6131a.post(new apw(this, irVar2, string2));
                        if (irVar2.get(f5586a, TimeUnit.MILLISECONDS) != null) {
                            com_google_android_gms_internal_aqn = new aqp(z);
                        } else {
                            string2 = "No handler for custom template: ";
                            String valueOf = String.valueOf(jSONObject.getString("custom_template_id"));
                            if (valueOf.length() != 0) {
                                string2.concat(valueOf);
                            } else {
                                valueOf = new String(string2);
                            }
                            id.m5372a(6);
                        }
                    } else {
                        m5059a(0);
                    }
                    com_google_android_gms_internal_aqd = null;
                }
            }
            if (m5061a() || com_google_android_gms_internal_aqd == null || jSONObject == null) {
                com_google_android_gms_internal_afc = null;
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("tracking_urls_and_actions");
                String[] c = m5054c(jSONObject2, "impression_tracking_urls");
                this.f5597l = c == null ? null : Arrays.asList(c);
                this.f5598m = jSONObject2.optJSONObject("active_view");
                this.f5599n = jSONObject.optString("debug_signals");
                afc a = com_google_android_gms_internal_aqd.mo2017a(this, jSONObject);
                a.mo1755a(new afe(this.f5587b, this.f5589d, this.f5591f, this.f5590e, jSONObject, a, this.f5593h.f5978a.f7621k, uuid));
                com_google_android_gms_internal_afc = a;
            }
            if (com_google_android_gms_internal_afc instanceof aew) {
                aew com_google_android_gms_internal_aew = (aew) com_google_android_gms_internal_afc;
                aqe com_google_android_gms_internal_aqe = new aqe();
                ail com_google_android_gms_internal_apx = new apx(this, com_google_android_gms_internal_aew);
                com_google_android_gms_internal_aqe.f5632a = com_google_android_gms_internal_apx;
                this.f5591f.m5040a(new apy(com_google_android_gms_internal_apx));
            }
            return m5045a(com_google_android_gms_internal_afc);
        } catch (CancellationException e) {
            if (!this.f5595j) {
                m5059a(0);
            }
            return m5045a(null);
        } catch (ExecutionException e2) {
            if (this.f5595j) {
                m5059a(0);
            }
            return m5045a(null);
        } catch (InterruptedException e3) {
            if (this.f5595j) {
                m5059a(0);
            }
            return m5045a(null);
        } catch (Throwable e4) {
            id.m5371a("Malformed native JSON response.", e4);
            if (this.f5595j) {
                m5059a(0);
            }
            return m5045a(null);
        } catch (Throwable e42) {
            id.m5371a("Timeout when loading native ad.", e42);
            if (this.f5595j) {
                m5059a(0);
            }
            return m5045a(null);
        } catch (Throwable e422) {
            id.m5371a("Error occured while doing native ads initialization.", e422);
            if (this.f5595j) {
                m5059a(0);
            }
            return m5045a(null);
        }
    }

    private static <V> il<List<V>> m5052b(List<il<V>> list) {
        il irVar = new ir();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (il a : list) {
            a.mo1478a(new aqc(atomicInteger, size, irVar, list), fv.f6119a);
        }
        return irVar;
    }

    private static Integer m5053b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException e) {
            return null;
        }
    }

    private static String[] m5054c(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    public final il<aeo> m5055a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return ih.m5638a(null);
        }
        List b;
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b2 = m5053b(optJSONObject, "text_color");
        Integer b3 = m5053b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i = (this.f5593h.f5978a.f7635y == null || this.f5593h.f5978a.f7635y.f7787a < 2) ? 1 : this.f5593h.f5978a.f7635y.f7791e;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List arrayList = new ArrayList();
        if (optJSONObject.optJSONArray("images") != null) {
            b = m5062b(optJSONObject, "images", false, true);
        } else {
            arrayList.add(m5057a(optJSONObject, "image", false, false));
            b = arrayList;
        }
        Future b4 = m5052b(b);
        ig com_google_android_gms_internal_apz = new apz(optString, b3, b2, optInt, optInt3, optInt2, i, optBoolean);
        Executor executor = fv.f6119a;
        il<aeo> irVar = new ir();
        b4.mo1478a(new ii(irVar, com_google_android_gms_internal_apz, b4), executor);
        irVar.mo1478a(new ij(irVar, b4), io.f6263b);
        return irVar;
    }

    public final il<jf> m5056a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return ih.m5638a(null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            id.m5370a("Required field 'vast_xml' is missing");
            return ih.m5638a(null);
        }
        aqf com_google_android_gms_internal_aqf = new aqf(this.f5587b, this.f5590e, this.f5593h, this.f5594i, this.f5589d);
        ir irVar = new ir();
        zzbv.zzea();
        gb.m5451a(new aqg(com_google_android_gms_internal_aqf, optJSONObject, irVar));
        return irVar;
    }

    public final il<aeq> m5057a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m5058a(jSONObject2, z, z2);
    }

    final il<aeq> m5058a(JSONObject jSONObject, boolean z, boolean z2) {
        String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (TextUtils.isEmpty(string)) {
            m5060a(0, z);
            return ih.m5638a(null);
        } else if (z2) {
            return ih.m5638a(new aeq(null, Uri.parse(string), optDouble));
        } else {
            hi com_google_android_gms_internal_aqa = new aqa(this, z, optDouble, optBoolean, string);
            Object hnVar = new hn();
            he.f6197a.m4575a(new hj(string, com_google_android_gms_internal_aqa, hnVar));
            return hnVar;
        }
    }

    public final void m5059a(int i) {
        synchronized (this.f5592g) {
            this.f5595j = true;
            this.f5596k = i;
        }
    }

    public final void m5060a(int i, boolean z) {
        if (z) {
            m5059a(i);
        }
    }

    public final boolean m5061a() {
        boolean z;
        synchronized (this.f5592g) {
            z = this.f5595j;
        }
        return z;
    }

    public final List<il<aeq>> m5062b(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        List<il<aeq>> arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            m5060a(0, false);
            return arrayList;
        }
        int length = z2 ? optJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(m5058a(jSONObject2, false, z));
        }
        return arrayList;
    }

    public final /* synthetic */ Object call() {
        return m5051b();
    }
}
