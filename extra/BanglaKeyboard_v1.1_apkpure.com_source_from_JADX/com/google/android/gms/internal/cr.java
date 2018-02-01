package com.google.android.gms.internal;

import com.google.android.gms.p056a.C1401c;

final class cr implements Runnable {
    private /* synthetic */ amf f5872a;
    private /* synthetic */ zzix f5873b;
    private /* synthetic */ cx f5874c;
    private /* synthetic */ cp f5875d;

    cr(cp cpVar, amf com_google_android_gms_internal_amf, zzix com_google_android_gms_internal_zzix, cx cxVar) {
        this.f5875d = cpVar;
        this.f5872a = com_google_android_gms_internal_amf;
        this.f5873b = com_google_android_gms_internal_zzix;
        this.f5874c = cxVar;
    }

    public final void run() {
        try {
            this.f5872a.mo1899a(C1401c.m3584a(this.f5875d.f5857a), this.f5873b, null, this.f5874c, this.f5875d.f5859c);
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Fail to initialize adapter ";
            String valueOf = String.valueOf(this.f5875d.f5858b);
            id.m5371a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
            this.f5875d.mo2052a(0);
        }
    }
}
