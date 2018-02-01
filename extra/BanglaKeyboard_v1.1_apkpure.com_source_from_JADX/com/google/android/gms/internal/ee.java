package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@aqv
public final class ee {
    public final String f5942A;
    public final afc f5943B;
    public boolean f5944C;
    public boolean f5945D;
    public boolean f5946E;
    public final List<String> f5947F;
    private zzaaq f5948G;
    private long f5949H;
    private long f5950I;
    private zk f5951J;
    public final zzix f5952a;
    public final jf f5953b;
    public final List<String> f5954c;
    public final int f5955d;
    public final List<String> f5956e;
    public final List<String> f5957f;
    public final int f5958g;
    public final long f5959h;
    public final String f5960i;
    public final JSONObject f5961j;
    public final boolean f5962k;
    public boolean f5963l;
    public final boolean f5964m;
    public final all f5965n;
    public final amf f5966o;
    public final String f5967p;
    public final alm f5968q;
    public final alo f5969r;
    public final String f5970s;
    public final zzjb f5971t;
    public final zzaek f5972u;
    public final List<String> f5973v;
    public final List<String> f5974w;
    public final long f5975x;
    public final long f5976y;
    public final String f5977z;

    public ee(ef efVar) {
        this(efVar.f5978a.f7613c, null, efVar.f5979b.f7657c, efVar.f5982e, efVar.f5979b.f7659e, efVar.f5979b.f7663i, efVar.f5979b.f7665k, efVar.f5979b.f7664j, efVar.f5978a.f7619i, efVar.f5979b.f7661g, null, null, null, efVar.f5980c, null, efVar.f5979b.f7662h, efVar.f5981d, efVar.f5979b.f7660f, efVar.f5983f, efVar.f5984g, efVar.f5979b.f7668n, efVar.f5985h, null, efVar.f5979b.f7637A, efVar.f5979b.f7638B, efVar.f5979b.f7638B, efVar.f5979b.f7640D, efVar.f5979b.f7641E, null, efVar.f5979b.f7644H, efVar.f5979b.f7648L, efVar.f5986i);
    }

    public ee(zzix com_google_android_gms_internal_zzix, jf jfVar, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, all com_google_android_gms_internal_all, amf com_google_android_gms_internal_amf, String str2, alm com_google_android_gms_internal_alm, alo com_google_android_gms_internal_alo, long j2, zzjb com_google_android_gms_internal_zzjb, long j3, long j4, long j5, String str3, JSONObject jSONObject, afc com_google_android_gms_internal_afc, zzaek com_google_android_gms_internal_zzaek, List<String> list4, List<String> list5, boolean z2, zzaaq com_google_android_gms_internal_zzaaq, String str4, List<String> list6, String str5, zk zkVar) {
        this.f5944C = false;
        this.f5945D = false;
        this.f5946E = false;
        this.f5952a = com_google_android_gms_internal_zzix;
        this.f5953b = jfVar;
        this.f5954c = m5316a(list);
        this.f5955d = i;
        this.f5956e = m5316a(list2);
        this.f5957f = m5316a(list3);
        this.f5958g = i2;
        this.f5959h = j;
        this.f5960i = str;
        this.f5964m = z;
        this.f5965n = com_google_android_gms_internal_all;
        this.f5966o = com_google_android_gms_internal_amf;
        this.f5967p = str2;
        this.f5968q = com_google_android_gms_internal_alm;
        this.f5969r = com_google_android_gms_internal_alo;
        this.f5949H = j2;
        this.f5971t = com_google_android_gms_internal_zzjb;
        this.f5950I = j3;
        this.f5975x = j4;
        this.f5976y = j5;
        this.f5977z = str3;
        this.f5961j = jSONObject;
        this.f5943B = com_google_android_gms_internal_afc;
        this.f5972u = com_google_android_gms_internal_zzaek;
        this.f5973v = m5316a(list4);
        this.f5974w = m5316a(list5);
        this.f5962k = z2;
        this.f5948G = com_google_android_gms_internal_zzaaq;
        this.f5970s = str4;
        this.f5947F = m5316a(list6);
        this.f5942A = str5;
        this.f5951J = zkVar;
    }

    private static <T> List<T> m5316a(List<T> list) {
        return list == null ? null : Collections.unmodifiableList(list);
    }

    public final boolean m5317a() {
        return (this.f5953b == null || this.f5953b.mo2163k() == null) ? false : this.f5953b.mo2163k().m5732a();
    }
}
