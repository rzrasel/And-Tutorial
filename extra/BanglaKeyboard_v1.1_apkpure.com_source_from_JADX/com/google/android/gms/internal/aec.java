package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@aqv
public final class aec {
    public boolean f4947a;
    public final Object f4948b = new Object();
    public String f4949c;
    aea f4950d;
    aec f4951e;
    private final List<aea> f4952f = new LinkedList();
    private final Map<String, String> f4953g = new LinkedHashMap();

    public aec(boolean z, String str, String str2) {
        this.f4947a = z;
        this.f4953g.put("action", str);
        this.f4953g.put("ad_format", str2);
    }

    public final aea m4233a() {
        return m4234a(zzbv.zzeg().mo1670b());
    }

    public final aea m4234a(long j) {
        return !this.f4947a ? null : new aea(j, null, null);
    }

    public final void m4235a(String str, String str2) {
        if (this.f4947a && !TextUtils.isEmpty(str2)) {
            adr e = zzbv.zzee().m5347e();
            if (e != null) {
                synchronized (this.f4948b) {
                    adw a = e.m4222a(str);
                    Map map = this.f4953g;
                    map.put(str, a.mo1736a((String) map.get(str), str2));
                }
            }
        }
    }

    public final boolean m4236a(aea com_google_android_gms_internal_aea, long j, String... strArr) {
        synchronized (this.f4948b) {
            for (String com_google_android_gms_internal_aea2 : strArr) {
                this.f4952f.add(new aea(j, com_google_android_gms_internal_aea2, com_google_android_gms_internal_aea));
            }
        }
        return true;
    }

    public final boolean m4237a(aea com_google_android_gms_internal_aea, String... strArr) {
        return (!this.f4947a || com_google_android_gms_internal_aea == null) ? false : m4236a(com_google_android_gms_internal_aea, zzbv.zzeg().mo1670b(), strArr);
    }

    public final String m4238b() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        synchronized (this.f4948b) {
            for (aea com_google_android_gms_internal_aea : this.f4952f) {
                long j = com_google_android_gms_internal_aea.f4942a;
                String str = com_google_android_gms_internal_aea.f4943b;
                aea com_google_android_gms_internal_aea2 = com_google_android_gms_internal_aea2.f4944c;
                if (com_google_android_gms_internal_aea2 != null && j > 0) {
                    stringBuilder2.append(str).append('.').append(j - com_google_android_gms_internal_aea2.f4942a).append(',');
                }
            }
            this.f4952f.clear();
            if (!TextUtils.isEmpty(this.f4949c)) {
                stringBuilder2.append(this.f4949c);
            } else if (stringBuilder2.length() > 0) {
                stringBuilder2.setLength(stringBuilder2.length() - 1);
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    final Map<String, String> m4239c() {
        Map<String, String> map;
        synchronized (this.f4948b) {
            adr e = zzbv.zzee().m5347e();
            if (e == null || this.f4951e == null) {
                map = this.f4953g;
            } else {
                map = e.m4223a(this.f4953g, this.f4951e.m4239c());
            }
        }
        return map;
    }

    public final aea m4240d() {
        aea com_google_android_gms_internal_aea;
        synchronized (this.f4948b) {
            com_google_android_gms_internal_aea = this.f4950d;
        }
        return com_google_android_gms_internal_aea;
    }
}
