package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;

@aqv
public final class zzay extends abr {
    private static final Object f4353b = new Object();
    private static zzay f4354c;
    private final Context f4355a;
    private final Object f4356d = new Object();
    private boolean f4357e;
    private boolean f4358f;
    private float f4359g = -1.0f;
    private zzajk f4360h;

    private zzay(Context context, zzajk com_google_android_gms_internal_zzajk) {
        this.f4355a = context;
        this.f4360h = com_google_android_gms_internal_zzajk;
        this.f4357e = false;
    }

    public static zzay zza(Context context, zzajk com_google_android_gms_internal_zzajk) {
        zzay com_google_android_gms_ads_internal_zzay;
        synchronized (f4353b) {
            if (f4354c == null) {
                f4354c = new zzay(context.getApplicationContext(), com_google_android_gms_internal_zzajk);
            }
            com_google_android_gms_ads_internal_zzay = f4354c;
        }
        return com_google_android_gms_ads_internal_zzay;
    }

    public static zzay zzdd() {
        zzay com_google_android_gms_ads_internal_zzay;
        synchronized (f4353b) {
            com_google_android_gms_ads_internal_zzay = f4354c;
        }
        return com_google_android_gms_ads_internal_zzay;
    }

    public final void initialize() {
        synchronized (f4353b) {
            if (this.f4357e) {
                id.m5370a("Mobile ads is initialized already.");
                return;
            }
            this.f4357e = true;
            ado.m4219a(this.f4355a);
            zzbv.zzee().m5333a(this.f4355a, this.f4360h);
            zzbv.zzef().m7051a(this.f4355a);
        }
    }

    public final void setAppMuted(boolean z) {
        synchronized (this.f4356d) {
            this.f4358f = z;
        }
    }

    public final void setAppVolume(float f) {
        synchronized (this.f4356d) {
            this.f4359g = f;
        }
    }

    public final void zzc(C1398a c1398a, String str) {
        if (c1398a == null) {
            id.m5372a(6);
            return;
        }
        Context context = (Context) C1401c.m3585a(c1398a);
        if (context == null) {
            id.m5372a(6);
            return;
        }
        gq gqVar = new gq(context);
        gqVar.f6150c = str;
        gqVar.f6151d = this.f4360h.f7706a;
        gqVar.m5563a();
    }

    public final void zzc(String str, C1398a c1398a) {
        if (!TextUtils.isEmpty(str)) {
            Runnable c1445o;
            int i;
            ado.m4219a(this.f4355a);
            int booleanValue = ((Boolean) zzbv.zzen().m4217a(ado.cb)).booleanValue() | ((Boolean) zzbv.zzen().m4217a(ado.as)).booleanValue();
            if (((Boolean) zzbv.zzen().m4217a(ado.as)).booleanValue()) {
                c1445o = new C1445o(this, (Runnable) C1401c.m3585a(c1398a));
                i = 1;
            } else {
                c1445o = null;
                i = booleanValue;
            }
            if (i != 0) {
                zzbv.zzeh().zza(this.f4355a, this.f4360h, str, c1445o);
            }
        }
    }

    public final float zzde() {
        float f;
        synchronized (this.f4356d) {
            f = this.f4359g;
        }
        return f;
    }

    public final boolean zzdf() {
        boolean z;
        synchronized (this.f4356d) {
            z = this.f4359g >= 0.0f;
        }
        return z;
    }

    public final boolean zzdg() {
        boolean z;
        synchronized (this.f4356d) {
            z = this.f4358f;
        }
        return z;
    }

    public final void zzt(String str) {
        ado.m4219a(this.f4355a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzbv.zzen().m4217a(ado.cb)).booleanValue()) {
                zzbv.zzeh().zza(this.f4355a, this.f4360h, str, null);
            }
        }
    }
}
