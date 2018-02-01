package com.google.android.gms.ads.internal;

import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.all;
import com.google.android.gms.internal.alm;
import com.google.android.gms.internal.amf;
import com.google.android.gms.internal.bv;
import com.google.android.gms.internal.dc;
import com.google.android.gms.internal.id;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class C1470q implements Runnable {
    private /* synthetic */ C1445o f4268a;

    C1470q(C1445o c1445o) {
        this.f4268a = c1445o;
    }

    public final void run() {
        Object a = this.f4268a.f4111b.f4355a;
        Runnable runnable = this.f4268a.f4110a;
        C1516t.m3867b("Adapters must be initialized on the main thread.");
        Map map = zzbv.zzee().m5358p().f6002b;
        if (map != null && !map.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    id.m5371a("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            bv b = bv.m5158b();
            if (b != null) {
                String str;
                Collection<alm> values = map.values();
                map = new HashMap();
                C1398a a2 = C1401c.m3584a(a);
                for (alm com_google_android_gms_internal_alm : values) {
                    for (all com_google_android_gms_internal_all : com_google_android_gms_internal_alm.f5298a) {
                        String str2 = com_google_android_gms_internal_all.f5289j;
                        for (String str3 : com_google_android_gms_internal_all.f5282c) {
                            if (!map.containsKey(str3)) {
                                map.put(str3, new ArrayList());
                            }
                            if (str2 != null) {
                                ((Collection) map.get(str3)).add(str2);
                            }
                        }
                    }
                }
                for (Entry entry : map.entrySet()) {
                    String str4 = (String) entry.getKey();
                    try {
                        dc a3 = b.mo2024a(str4);
                        if (a3 != null) {
                            amf com_google_android_gms_internal_amf = a3.f5906a;
                            if (!com_google_android_gms_internal_amf.mo1912g() && com_google_android_gms_internal_amf.mo1918m()) {
                                com_google_android_gms_internal_amf.mo1897a(a2, a3.f5907b, (List) entry.getValue());
                                str3 = "Initialized rewarded video mediation adapter ";
                                String valueOf = String.valueOf(str4);
                                if (valueOf.length() != 0) {
                                    str3.concat(valueOf);
                                } else {
                                    valueOf = new String(str3);
                                }
                                id.m5372a(3);
                            }
                        }
                    } catch (Throwable th2) {
                        id.m5371a(new StringBuilder(String.valueOf(str4).length() + 56).append("Failed to initialize rewarded video mediation adapter \"").append(str4).append("\"").toString(), th2);
                    }
                }
            }
        }
    }
}
