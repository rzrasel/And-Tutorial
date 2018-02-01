package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

@aqv
public final class ej implements fu, yc {
    private boolean f6008A = false;
    private String f6009B = "";
    private long f6010C = 0;
    private long f6011D = 0;
    private long f6012E = 0;
    private int f6013F = -1;
    private JSONObject f6014G = new JSONObject();
    private int f6015H = 0;
    public final Object f6016a = new Object();
    public final String f6017b = gb.m5466b();
    public wj f6018c;
    public final HashSet<eg> f6019d = new HashSet();
    public final HashMap<String, eo> f6020e = new HashMap();
    Boolean f6021f = null;
    final AtomicInteger f6022g = new AtomicInteger(0);
    public final ek f6023h = new ek();
    private final em f6024i = new em(this.f6017b);
    private BigInteger f6025j = BigInteger.ONE;
    private boolean f6026k = false;
    private boolean f6027l = true;
    private int f6028m = 0;
    private boolean f6029n = false;
    private Context f6030o;
    private zzajk f6031p;
    private adr f6032q = null;
    private boolean f6033r = true;
    private boolean f6034s = true;
    private yd f6035t = null;
    private xx f6036u = null;
    private String f6037v;
    private String f6038w;
    private String f6039x;
    private boolean f6040y = false;
    private boolean f6041z = false;

    private final Future m5323b(int i) {
        Future future;
        synchronized (this.f6016a) {
            this.f6013F = i;
            future = (Future) new fk(this.f6030o, i).mo1474g();
        }
        return future;
    }

    private final Future m5324b(long j) {
        Future future;
        synchronized (this.f6016a) {
            this.f6011D = j;
            future = (Future) new fi(this.f6030o, j).mo1474g();
        }
        return future;
    }

    public final Bundle m5325a(Context context, en enVar, String str) {
        Bundle bundle;
        synchronized (this.f6016a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f6024i.m5366a(context, str));
            Bundle bundle2 = new Bundle();
            for (String str2 : this.f6020e.keySet()) {
                bundle2.putBundle(str2, ((eo) this.f6020e.get(str2)).m5367a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f6019d.iterator();
            while (it.hasNext()) {
                arrayList.add(((eg) it.next()).m5318a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            enVar.zza(this.f6019d);
            this.f6019d.clear();
        }
        return bundle;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.yd m5326a(android.content.Context r6) {
        /*
        r5 = this;
        r1 = 0;
        r0 = com.google.android.gms.internal.ado.f4871J;
        r2 = com.google.android.gms.ads.internal.zzbv.zzen();
        r0 = r2.m4217a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0015;
    L_0x0013:
        r0 = r1;
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = com.google.android.gms.internal.ado.f4879R;
        r2 = com.google.android.gms.ads.internal.zzbv.zzen();
        r0 = r2.m4217a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x003b;
    L_0x0027:
        r0 = com.google.android.gms.internal.ado.f4877P;
        r2 = com.google.android.gms.ads.internal.zzbv.zzen();
        r0 = r2.m4217a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x003b;
    L_0x0039:
        r0 = r1;
        goto L_0x0014;
    L_0x003b:
        r0 = r5.m5338a();
        if (r0 == 0) goto L_0x0049;
    L_0x0041:
        r0 = r5.m5342b();
        if (r0 == 0) goto L_0x0049;
    L_0x0047:
        r0 = r1;
        goto L_0x0014;
    L_0x0049:
        r2 = r5.f6016a;
        monitor-enter(r2);
        r0 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x0080 }
        if (r0 == 0) goto L_0x0054;
    L_0x0052:
        if (r6 != 0) goto L_0x0057;
    L_0x0054:
        monitor-exit(r2);	 Catch:{ all -> 0x0080 }
        r0 = r1;
        goto L_0x0014;
    L_0x0057:
        r0 = r5.f6036u;	 Catch:{ all -> 0x0080 }
        if (r0 != 0) goto L_0x0062;
    L_0x005b:
        r0 = new com.google.android.gms.internal.xx;	 Catch:{ all -> 0x0080 }
        r0.<init>();	 Catch:{ all -> 0x0080 }
        r5.f6036u = r0;	 Catch:{ all -> 0x0080 }
    L_0x0062:
        r0 = r5.f6035t;	 Catch:{ all -> 0x0080 }
        if (r0 != 0) goto L_0x0077;
    L_0x0066:
        r0 = new com.google.android.gms.internal.yd;	 Catch:{ all -> 0x0080 }
        r1 = r5.f6036u;	 Catch:{ all -> 0x0080 }
        r3 = r5.f6030o;	 Catch:{ all -> 0x0080 }
        r4 = r5.f6031p;	 Catch:{ all -> 0x0080 }
        r3 = com.google.android.gms.internal.aqq.m5088a(r3, r4);	 Catch:{ all -> 0x0080 }
        r0.<init>(r1, r3);	 Catch:{ all -> 0x0080 }
        r5.f6035t = r0;	 Catch:{ all -> 0x0080 }
    L_0x0077:
        r0 = r5.f6035t;	 Catch:{ all -> 0x0080 }
        r0.m7030a();	 Catch:{ all -> 0x0080 }
        r0 = r5.f6035t;	 Catch:{ all -> 0x0080 }
        monitor-exit(r2);	 Catch:{ all -> 0x0080 }
        goto L_0x0014;
    L_0x0080:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0080 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ej.a(android.content.Context):com.google.android.gms.internal.yd");
    }

    public final Future m5327a(int i) {
        Future future;
        synchronized (this.f6016a) {
            this.f6015H = i;
            future = (Future) new fa(this.f6030o, i).mo1474g();
        }
        return future;
    }

    public final Future m5328a(long j) {
        Future future;
        synchronized (this.f6016a) {
            this.f6012E = j;
            future = (Future) new fm(this.f6030o, j).mo1474g();
        }
        return future;
    }

    public final Future m5329a(Context context, String str) {
        Future future;
        this.f6010C = zzbv.zzeg().mo1669a();
        synchronized (this.f6016a) {
            if (str != null) {
                if (!str.equals(this.f6009B)) {
                    this.f6009B = str;
                    future = (Future) new fc(context, str, this.f6010C).mo1474g();
                }
            }
            future = null;
        }
        return future;
    }

    public final Future m5330a(Context context, boolean z) {
        Future future;
        synchronized (this.f6016a) {
            if (z != this.f6027l) {
                this.f6027l = z;
                future = (Future) new ew(context, z).mo1474g();
            } else {
                future = null;
            }
        }
        return future;
    }

    public final Future m5331a(String str) {
        Future future;
        synchronized (this.f6016a) {
            if (str != null) {
                if (!str.equals(this.f6037v)) {
                    this.f6037v = str;
                    future = (Future) new fr(this.f6030o, str).mo1474g();
                }
            }
            future = null;
        }
        return future;
    }

    public final Future m5332a(String str, String str2, boolean z) {
        Future future;
        int i = 0;
        synchronized (this.f6016a) {
            JSONArray optJSONArray = this.f6014G.optJSONArray(str);
            JSONArray jSONArray = optJSONArray == null ? new JSONArray() : optJSONArray;
            int length = jSONArray.length();
            while (i < jSONArray.length()) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject == null || !str2.equals(optJSONObject.optString("template_id"))) {
                    i++;
                } else {
                    if (z && optJSONObject.optBoolean("uses_media_view", false) == z) {
                        future = null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z);
                    jSONObject.put("timestamp_ms", zzbv.zzeg().mo1669a());
                    jSONArray.put(i, jSONObject);
                    this.f6014G.put(str, jSONArray);
                    future = (Future) new fe(this.f6030o, this.f6014G.toString()).mo1474g();
                }
            }
            i = length;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("template_id", str2);
                jSONObject2.put("uses_media_view", z);
                jSONObject2.put("timestamp_ms", zzbv.zzeg().mo1669a());
                jSONArray.put(i, jSONObject2);
                this.f6014G.put(str, jSONArray);
            } catch (Throwable e) {
                id.m5371a("Could not update native advanced settings", e);
            }
            future = (Future) new fe(this.f6030o, this.f6014G.toString()).mo1474g();
        }
        return future;
    }

    @TargetApi(23)
    public final void m5333a(Context context, zzajk com_google_android_gms_internal_zzajk) {
        synchronized (this.f6016a) {
            if (!this.f6029n) {
                this.f6030o = context.getApplicationContext();
                this.f6031p = com_google_android_gms_internal_zzajk;
                zzbv.zzed().m7009a(this);
                new ff(context, this).mo1474g();
                new fo(context, this).mo1474g();
                new fg(context, this).mo1474g();
                new fb(context, this).mo1474g();
                new fq(context, this).mo1474g();
                new fs(context, this).mo1474g();
                new ez(context, this).mo1474g();
                new fd(context, this).mo1474g();
                new fj(context, this).mo1474g();
                new fl(context, this).mo1474g();
                new fn(context, this).mo1474g();
                aqq.m5088a(this.f6030o, this.f6031p);
                this.f6039x = zzbv.zzea().m5502a(context, com_google_android_gms_internal_zzajk.f7706a);
                if (VERSION.SDK_INT >= 23 && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                    this.f6041z = true;
                }
                this.f6018c = new wj(context.getApplicationContext(), this.f6031p, zzbv.zzea().m5501a(context, com_google_android_gms_internal_zzajk));
                adq com_google_android_gms_internal_adq = new adq(this.f6030o, this.f6031p.f7706a);
                try {
                    adr com_google_android_gms_internal_adr;
                    zzbv.zzei();
                    if (!com_google_android_gms_internal_adq.f4916a) {
                        es.m5373a();
                        com_google_android_gms_internal_adr = null;
                    } else if (com_google_android_gms_internal_adq.f4919d == null) {
                        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
                    } else if (TextUtils.isEmpty(com_google_android_gms_internal_adq.f4920e)) {
                        throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
                    } else {
                        com_google_android_gms_internal_adr = new adr(com_google_android_gms_internal_adq.f4919d, com_google_android_gms_internal_adq.f4920e, com_google_android_gms_internal_adq.f4917b, com_google_android_gms_internal_adq.f4918c);
                    }
                    this.f6032q = com_google_android_gms_internal_adr;
                } catch (Throwable e) {
                    id.m5371a("Cannot initialize CSI reporter.", e);
                }
                this.f6029n = true;
            }
        }
    }

    public final void mo2089a(Bundle bundle) {
        synchronized (this.f6016a) {
            this.f6027l = bundle.getBoolean("use_https", this.f6027l);
            this.f6028m = bundle.getInt("webview_cache_version", this.f6028m);
            if (bundle.containsKey("content_url_opted_out")) {
                m5337a(bundle.getBoolean("content_url_opted_out"));
            }
            if (bundle.containsKey("content_url_hashes")) {
                this.f6037v = bundle.getString("content_url_hashes");
            }
            this.f6008A = bundle.getBoolean("auto_collect_location", this.f6008A);
            if (bundle.containsKey("content_vertical_opted_out")) {
                m5341b(bundle.getBoolean("content_vertical_opted_out"));
            }
            if (bundle.containsKey("content_vertical_hashes")) {
                this.f6038w = bundle.getString("content_vertical_hashes");
            }
            if (bundle.containsKey("native_advanced_settings")) {
                try {
                    this.f6014G = new JSONObject(bundle.getString("native_advanced_settings"));
                } catch (Throwable e) {
                    id.m5371a("Could not convert native advanced settings to json object", e);
                }
            }
            if (bundle.containsKey("version_code")) {
                this.f6015H = bundle.getInt("version_code");
            }
            this.f6009B = bundle.containsKey("app_settings_json") ? bundle.getString("app_settings_json") : this.f6009B;
            this.f6010C = bundle.getLong("app_settings_last_update_ms", this.f6010C);
            this.f6011D = bundle.getLong("app_last_background_time_ms", this.f6011D);
            this.f6013F = bundle.getInt("request_in_session_count", this.f6013F);
            this.f6012E = bundle.getLong("first_ad_req_time_ms", this.f6012E);
        }
    }

    public final void m5335a(eg egVar) {
        synchronized (this.f6016a) {
            this.f6019d.add(egVar);
        }
    }

    public final void m5336a(Throwable th, String str) {
        aqq.m5088a(this.f6030o, this.f6031p).mo2018a(th, str);
    }

    public final void m5337a(boolean z) {
        synchronized (this.f6016a) {
            if (this.f6033r != z) {
                eu.m5374a(this.f6030o, z);
            }
            this.f6033r = z;
            yd a = m5326a(this.f6030o);
            if (!(a == null || a.isAlive())) {
                id.m5372a(4);
                a.m7030a();
            }
        }
    }

    public final boolean m5338a() {
        boolean z;
        synchronized (this.f6016a) {
            z = this.f6033r;
        }
        return z;
    }

    public final Future m5339b(Context context, boolean z) {
        Future future;
        synchronized (this.f6016a) {
            if (z != this.f6008A) {
                this.f6008A = z;
                future = (Future) new ey(context, z).mo1474g();
            } else {
                future = null;
            }
        }
        return future;
    }

    public final Future m5340b(String str) {
        Future future;
        synchronized (this.f6016a) {
            if (str != null) {
                if (!str.equals(this.f6038w)) {
                    this.f6038w = str;
                    future = (Future) new ex(this.f6030o, str).mo1474g();
                }
            }
            future = null;
        }
        return future;
    }

    public final void m5341b(boolean z) {
        synchronized (this.f6016a) {
            if (this.f6034s != z) {
                eu.m5374a(this.f6030o, z);
            }
            eu.m5374a(this.f6030o, z);
            this.f6034s = z;
            yd a = m5326a(this.f6030o);
            if (!(a == null || a.isAlive())) {
                id.m5372a(4);
                a.m7030a();
            }
        }
    }

    public final boolean m5342b() {
        boolean z;
        synchronized (this.f6016a) {
            z = this.f6034s;
        }
        return z;
    }

    public final String m5343c() {
        String bigInteger;
        synchronized (this.f6016a) {
            bigInteger = this.f6025j.toString();
            this.f6025j = this.f6025j.add(BigInteger.ONE);
        }
        return bigInteger;
    }

    public final void m5344c(boolean z) {
        ek ekVar = this.f6023h;
        if (z) {
            ekVar.m5364a(el.f6045a, el.f6046b);
        } else {
            ekVar.m5364a(el.f6046b, el.f6045a);
        }
    }

    public final em m5345d() {
        em emVar;
        synchronized (this.f6016a) {
            emVar = this.f6024i;
        }
        return emVar;
    }

    public final void mo2090d(boolean z) {
        long a = zzbv.zzeg().mo1669a();
        if (z) {
            if (a - this.f6011D > ((Long) zzbv.zzen().m4217a(ado.aw)).longValue()) {
                this.f6024i.f6052d = -1;
                return;
            }
            this.f6024i.f6052d = this.f6013F;
            return;
        }
        m5324b(a);
        m5323b(this.f6024i.f6052d);
    }

    public final adr m5347e() {
        adr com_google_android_gms_internal_adr;
        synchronized (this.f6016a) {
            com_google_android_gms_internal_adr = this.f6032q;
        }
        return com_google_android_gms_internal_adr;
    }

    public final boolean m5348f() {
        boolean z;
        synchronized (this.f6016a) {
            z = this.f6027l || this.f6041z;
        }
        return z;
    }

    public final String m5349g() {
        String str;
        synchronized (this.f6016a) {
            str = this.f6039x;
        }
        return str;
    }

    public final String m5350h() {
        String str;
        synchronized (this.f6016a) {
            str = this.f6037v;
        }
        return str;
    }

    public final String m5351i() {
        String str;
        synchronized (this.f6016a) {
            str = this.f6038w;
        }
        return str;
    }

    public final Boolean m5352j() {
        Boolean bool;
        synchronized (this.f6016a) {
            bool = this.f6021f;
        }
        return bool;
    }

    public final boolean m5353k() {
        boolean z;
        synchronized (this.f6016a) {
            z = this.f6008A;
        }
        return z;
    }

    public final long m5354l() {
        long j;
        synchronized (this.f6016a) {
            j = this.f6011D;
        }
        return j;
    }

    public final long m5355m() {
        long j;
        synchronized (this.f6016a) {
            j = this.f6012E;
        }
        return j;
    }

    public final int m5356n() {
        int i;
        synchronized (this.f6016a) {
            i = this.f6015H;
        }
        return i;
    }

    public final int m5357o() {
        int i;
        synchronized (this.f6016a) {
            i = this.f6013F;
        }
        return i;
    }

    public final ei m5358p() {
        ei eiVar;
        synchronized (this.f6016a) {
            eiVar = new ei(this.f6009B, this.f6010C);
        }
        return eiVar;
    }

    public final JSONObject m5359q() {
        JSONObject jSONObject;
        synchronized (this.f6016a) {
            jSONObject = this.f6014G;
        }
        return jSONObject;
    }

    public final Future m5360r() {
        Future future;
        synchronized (this.f6016a) {
            future = (Future) new fh(this.f6030o).mo1474g();
        }
        return future;
    }

    public final Resources m5361s() {
        if (this.f6031p.f7709d) {
            return this.f6030o.getResources();
        }
        try {
            DynamiteModule a = DynamiteModule.m3958a(this.f6030o, DynamiteModule.f4669a, ModuleDescriptor.MODULE_ID);
            return a != null ? a.f4681f.getResources() : null;
        } catch (Throwable e) {
            id.m5371a("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void m5362t() {
        this.f6022g.incrementAndGet();
    }
}
