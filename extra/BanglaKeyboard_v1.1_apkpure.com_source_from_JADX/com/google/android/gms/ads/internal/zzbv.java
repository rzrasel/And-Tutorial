package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.zza;
import com.google.android.gms.ads.internal.overlay.zzah;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.common.util.C1533b;
import com.google.android.gms.common.util.C1535d;
import com.google.android.gms.internal.adk;
import com.google.android.gms.internal.adl;
import com.google.android.gms.internal.adm;
import com.google.android.gms.internal.adt;
import com.google.android.gms.internal.ajj;
import com.google.android.gms.internal.akv;
import com.google.android.gms.internal.ale;
import com.google.android.gms.internal.alu;
import com.google.android.gms.internal.apd;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.aqw;
import com.google.android.gms.internal.bg;
import com.google.android.gms.internal.du;
import com.google.android.gms.internal.ej;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gf;
import com.google.android.gms.internal.gj;
import com.google.android.gms.internal.gk;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.go;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.ho;
import com.google.android.gms.internal.hp;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.ja;
import com.google.android.gms.internal.jp;
import com.google.android.gms.internal.xy;
import com.google.android.gms.internal.yv;
import com.google.android.gms.internal.yw;
import com.google.android.gms.internal.zj;

@aqv
public final class zzbv {
    private static final Object f4384a = new Object();
    private static zzbv f4385b;
    private final zzai f4386A;
    private final alu f4387B;
    private final hp f4388C;
    private final zzbb f4389D;
    private final zj f4390E;
    private final du f4391F;
    private final ajj f4392G;
    private final ja f4393H;
    private final zza f4394c = new zza();
    private final aqw f4395d = new aqw();
    private final zzu f4396e = new zzu();
    private final apd f4397f = new apd();
    private final gb f4398g = new gb();
    private final jp f4399h = new jp();
    private final gf f4400i;
    private final xy f4401j;
    private final ej f4402k;
    private final yv f4403l;
    private final yw f4404m;
    private final C1533b f4405n;
    private final zzac f4406o;
    private final adt f4407p;
    private final gx f4408q;
    private final bg f4409r;
    private final adk f4410s;
    private final adl f4411t;
    private final adm f4412u;
    private final is f4413v;
    private final akv f4414w;
    private final ale f4415x;
    private final ho f4416y;
    private final zzah f4417z;

    static {
        zzbv com_google_android_gms_ads_internal_zzbv = new zzbv();
        synchronized (f4384a) {
            f4385b = com_google_android_gms_ads_internal_zzbv;
        }
    }

    protected zzbv() {
        int i = VERSION.SDK_INT;
        gf goVar = i >= 21 ? new go() : i >= 19 ? new gn() : i >= 18 ? new gl() : i >= 17 ? new gk() : i >= 16 ? new gm() : new gj();
        this.f4400i = goVar;
        this.f4401j = new xy();
        this.f4402k = new ej();
        this.f4403l = new yv();
        this.f4404m = new yw();
        this.f4405n = C1535d.m3934d();
        this.f4406o = new zzac();
        this.f4407p = new adt();
        this.f4408q = new gx();
        this.f4409r = new bg();
        this.f4410s = new adk();
        this.f4411t = new adl();
        this.f4412u = new adm();
        this.f4413v = new is();
        this.f4414w = new akv();
        this.f4415x = new ale();
        this.f4416y = new ho();
        this.f4417z = new zzah();
        this.f4386A = new zzai();
        this.f4387B = new alu();
        this.f4388C = new hp();
        this.f4389D = new zzbb();
        this.f4390E = new zj();
        this.f4391F = new du();
        this.f4392G = new ajj();
        this.f4393H = new ja();
    }

    private static zzbv m3773a() {
        zzbv com_google_android_gms_ads_internal_zzbv;
        synchronized (f4384a) {
            com_google_android_gms_ads_internal_zzbv = f4385b;
        }
        return com_google_android_gms_ads_internal_zzbv;
    }

    public static aqw zzdw() {
        return m3773a().f4395d;
    }

    public static zza zzdx() {
        return m3773a().f4394c;
    }

    public static zzu zzdy() {
        return m3773a().f4396e;
    }

    public static apd zzdz() {
        return m3773a().f4397f;
    }

    public static gb zzea() {
        return m3773a().f4398g;
    }

    public static jp zzeb() {
        return m3773a().f4399h;
    }

    public static gf zzec() {
        return m3773a().f4400i;
    }

    public static xy zzed() {
        return m3773a().f4401j;
    }

    public static ej zzee() {
        return m3773a().f4402k;
    }

    public static yw zzef() {
        return m3773a().f4404m;
    }

    public static C1533b zzeg() {
        return m3773a().f4405n;
    }

    public static zzac zzeh() {
        return m3773a().f4406o;
    }

    public static adt zzei() {
        return m3773a().f4407p;
    }

    public static gx zzej() {
        return m3773a().f4408q;
    }

    public static bg zzek() {
        return m3773a().f4409r;
    }

    public static adl zzel() {
        return m3773a().f4411t;
    }

    public static adk zzem() {
        return m3773a().f4410s;
    }

    public static adm zzen() {
        return m3773a().f4412u;
    }

    public static is zzeo() {
        return m3773a().f4413v;
    }

    public static akv zzep() {
        return m3773a().f4414w;
    }

    public static ale zzeq() {
        return m3773a().f4415x;
    }

    public static ho zzer() {
        return m3773a().f4416y;
    }

    public static zzah zzes() {
        return m3773a().f4417z;
    }

    public static zzai zzet() {
        return m3773a().f4386A;
    }

    public static alu zzeu() {
        return m3773a().f4387B;
    }

    public static zzbb zzev() {
        return m3773a().f4389D;
    }

    public static hp zzew() {
        return m3773a().f4388C;
    }

    public static ajj zzex() {
        return m3773a().f4392G;
    }

    public static ja zzey() {
        return m3773a().f4393H;
    }

    public static du zzez() {
        return m3773a().f4391F;
    }
}
