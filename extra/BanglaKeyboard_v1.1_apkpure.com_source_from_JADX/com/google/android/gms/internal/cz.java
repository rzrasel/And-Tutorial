package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@aqv
public final class cz extends eq implements cy {
    final bv f5892a;
    private final ef f5893b;
    private final Context f5894c;
    private final ArrayList<Future> f5895d;
    private final ArrayList<String> f5896f;
    private final HashMap<String, cp> f5897g;
    private final List<cs> f5898h;
    private final HashSet<String> f5899i;
    private final Object f5900j;
    private final long f5901k;

    public cz(Context context, ef efVar, bv bvVar) {
        this(context, efVar, bvVar, ((Long) zzbv.zzen().m4217a(ado.at)).longValue());
    }

    private cz(Context context, ef efVar, bv bvVar, long j) {
        this.f5895d = new ArrayList();
        this.f5896f = new ArrayList();
        this.f5897g = new HashMap();
        this.f5898h = new ArrayList();
        this.f5899i = new HashSet();
        this.f5900j = new Object();
        this.f5894c = context;
        this.f5893b = efVar;
        this.f5892a = bvVar;
        this.f5901k = j;
    }

    private final ee m5246a(int i, String str, all com_google_android_gms_internal_all) {
        return new ee(this.f5893b.f5978a.f7613c, null, this.f5893b.f5979b.f7657c, i, this.f5893b.f5979b.f7659e, this.f5893b.f5979b.f7663i, this.f5893b.f5979b.f7665k, this.f5893b.f5979b.f7664j, this.f5893b.f5978a.f7619i, this.f5893b.f5979b.f7661g, com_google_android_gms_internal_all, null, str, this.f5893b.f5980c, null, this.f5893b.f5979b.f7662h, this.f5893b.f5981d, this.f5893b.f5979b.f7660f, this.f5893b.f5983f, this.f5893b.f5979b.f7667m, this.f5893b.f5979b.f7668n, this.f5893b.f5985h, null, this.f5893b.f5979b.f7637A, this.f5893b.f5979b.f7638B, this.f5893b.f5979b.f7639C, this.f5893b.f5979b.f7640D, this.f5893b.f5979b.f7641E, m5247c(), this.f5893b.f5979b.f7644H, this.f5893b.f5979b.f7648L, this.f5893b.f5986i);
    }

    private final String m5247c() {
        StringBuilder stringBuilder = new StringBuilder("");
        if (this.f5898h == null) {
            return stringBuilder.toString();
        }
        for (cs csVar : this.f5898h) {
            if (!(csVar == null || TextUtils.isEmpty(csVar.f5876a))) {
                int i;
                String str = csVar.f5876a;
                switch (csVar.f5877b) {
                    case 3:
                        i = 1;
                        break;
                    case 4:
                        i = 2;
                        break;
                    case 5:
                        i = 4;
                        break;
                    case 6:
                        i = 0;
                        break;
                    case 7:
                        i = 3;
                        break;
                    default:
                        i = 6;
                        break;
                }
                stringBuilder.append(String.valueOf(new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(i).append(".").append(csVar.f5878c).toString()).concat("_"));
            }
        }
        return stringBuilder.substring(0, Math.max(0, stringBuilder.length() - 1));
    }

    public final void mo1475a() {
        String str;
        for (all com_google_android_gms_internal_all : this.f5893b.f5980c.f5298a) {
            String str2 = com_google_android_gms_internal_all.f5289j;
            for (String str3 : com_google_android_gms_internal_all.f5282c) {
                String string;
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str3) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str3)) {
                    try {
                        string = new JSONObject(str2).getString("class_name");
                    } catch (JSONException e) {
                        id.m5372a(6);
                    }
                } else {
                    string = str3;
                }
                synchronized (this.f5900j) {
                    dc a = this.f5892a.mo2024a(string);
                    if (a == null || a.f5907b == null || a.f5906a == null) {
                        List list = this.f5898h;
                        ct ctVar = new ct();
                        ctVar.f5881b = com_google_android_gms_internal_all.f5283d;
                        ctVar.f5880a = string;
                        ctVar.f5883d = 0;
                        ctVar.f5882c = 7;
                        list.add(ctVar.m5221a());
                    } else {
                        eq cpVar = new cp(this.f5894c, string, str2, com_google_android_gms_internal_all, this.f5893b, a, this, this.f5901k);
                        this.f5895d.add((Future) cpVar.mo1474g());
                        this.f5896f.add(string);
                        this.f5897g.put(string, cpVar);
                    }
                }
            }
        }
        int i = 0;
        while (i < this.f5895d.size()) {
            cp cpVar2;
            try {
                ((Future) this.f5895d.get(i)).get();
                synchronized (this.f5900j) {
                    str3 = (String) this.f5896f.get(i);
                    if (!TextUtils.isEmpty(str3)) {
                        cpVar2 = (cp) this.f5897g.get(str3);
                        if (cpVar2 != null) {
                            this.f5898h.add(cpVar2.m5218c());
                        }
                    }
                }
                synchronized (this.f5900j) {
                    if (this.f5899i.contains(this.f5896f.get(i))) {
                        str3 = (String) this.f5896f.get(i);
                        hz.f6240a.post(new da(this, m5246a(-2, str3, this.f5897g.get(str3) != null ? ((cp) this.f5897g.get(str3)).f5860d : null)));
                        return;
                    }
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                synchronized (this.f5900j) {
                    str3 = (String) this.f5896f.get(i);
                    if (!TextUtils.isEmpty(str3)) {
                        cpVar2 = (cp) this.f5897g.get(str3);
                        if (cpVar2 != null) {
                            this.f5898h.add(cpVar2.m5218c());
                        }
                    }
                }
            } catch (Throwable e3) {
                id.m5371a("Unable to resolve rewarded adapter.", e3);
                synchronized (this.f5900j) {
                    str3 = (String) this.f5896f.get(i);
                    if (!TextUtils.isEmpty(str3)) {
                        cpVar2 = (cp) this.f5897g.get(str3);
                        if (cpVar2 != null) {
                            this.f5898h.add(cpVar2.m5218c());
                        }
                    }
                }
            } catch (Throwable e32) {
                Throwable th = e32;
                synchronized (this.f5900j) {
                    str3 = (String) this.f5896f.get(i);
                    if (!TextUtils.isEmpty(str3)) {
                        cpVar2 = (cp) this.f5897g.get(str3);
                        if (cpVar2 != null) {
                            this.f5898h.add(cpVar2.m5218c());
                        }
                    }
                }
            }
        }
        hz.f6240a.post(new db(this, m5246a(3, null, null)));
        return;
        i++;
    }

    public final void mo2052a(int i) {
    }

    public final void mo2053a(String str) {
        synchronized (this.f5900j) {
            this.f5899i.add(str);
        }
    }

    public final void mo1476b() {
    }
}
