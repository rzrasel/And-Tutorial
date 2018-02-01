package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class hj<T> extends afv<InputStream> {
    private final hi<T> f6205k;
    private final amb<T> f6206l;

    public hj(String str, hi<T> hiVar, amb<T> com_google_android_gms_internal_amb_T) {
        super(0, str, new hk(com_google_android_gms_internal_amb_T, hiVar));
        this.f6205k = hiVar;
        this.f6206l = com_google_android_gms_internal_amb_T;
    }

    protected final ajz<InputStream> mo2118a(adu com_google_android_gms_internal_adu) {
        return ajz.m4618a(new ByteArrayInputStream(com_google_android_gms_internal_adu.f4931a), ko.m5886a(com_google_android_gms_internal_adu));
    }

    protected final /* synthetic */ void mo2119a(Object obj) {
        il a = fv.m5426a(fv.f6119a, new hl(this, (InputStream) obj));
        a.mo1478a(new hm(this, a), io.f6262a);
    }
}
