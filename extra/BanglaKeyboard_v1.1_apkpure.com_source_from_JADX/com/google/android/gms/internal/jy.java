package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C1534c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@aqv
public final class jy extends abw {
    final Object f6377a = new Object();
    int f6378b;
    boolean f6379c = true;
    float f6380d;
    float f6381e;
    private final jf f6382f;
    private final boolean f6383g;
    private final float f6384h;
    private abz f6385i;
    private boolean f6386j;
    private boolean f6387k = true;
    private boolean f6388l;

    public jy(jf jfVar, float f, boolean z) {
        this.f6382f = jfVar;
        this.f6384h = f;
        this.f6383g = z;
    }

    private final void m5861a(String str, Map<String, String> map) {
        Map hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzbv.zzea();
        gb.m5451a(new jz(this, hashMap));
    }

    public final void mo1698a() {
        m5861a("play", null);
    }

    public final void mo1699a(abz com_google_android_gms_internal_abz) {
        synchronized (this.f6377a) {
            this.f6385i = com_google_android_gms_internal_abz;
        }
    }

    public final void m5868a(zzmd com_google_android_gms_internal_zzmd) {
        synchronized (this.f6377a) {
            this.f6387k = com_google_android_gms_internal_zzmd.f7785a;
            this.f6388l = com_google_android_gms_internal_zzmd.f7786b;
        }
        String str = "initialState";
        String str2 = "muteStart";
        Object obj = com_google_android_gms_internal_zzmd.f7785a ? "1" : "0";
        String str3 = "customControlsRequested";
        Object obj2 = com_google_android_gms_internal_zzmd.f7786b ? "1" : "0";
        Map a = C1534c.m3933a(2);
        a.put(str2, obj);
        a.put(str3, obj2);
        m5861a(str, Collections.unmodifiableMap(a));
    }

    public final void mo1700a(boolean z) {
        m5861a(z ? "mute" : "unmute", null);
    }

    public final void mo1701b() {
        m5861a("pause", null);
    }

    public final boolean mo1702c() {
        boolean z;
        synchronized (this.f6377a) {
            z = this.f6379c;
        }
        return z;
    }

    public final int mo1703d() {
        int i;
        synchronized (this.f6377a) {
            i = this.f6378b;
        }
        return i;
    }

    public final float mo1704e() {
        float f;
        synchronized (this.f6377a) {
            f = this.f6381e;
        }
        return f;
    }

    public final float mo1705f() {
        return this.f6384h;
    }

    public final float mo1706g() {
        float f;
        synchronized (this.f6377a) {
            f = this.f6380d;
        }
        return f;
    }

    public final boolean mo1707h() {
        boolean z;
        synchronized (this.f6377a) {
            z = this.f6383g && this.f6388l;
        }
        return z;
    }
}
