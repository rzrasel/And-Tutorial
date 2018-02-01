package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

public class kt extends afv<String> {
    private final amb<String> f6202k;

    public kt(int i, String str, amb<String> com_google_android_gms_internal_amb_java_lang_String, ala com_google_android_gms_internal_ala) {
        super(i, str, com_google_android_gms_internal_ala);
        this.f6202k = com_google_android_gms_internal_amb_java_lang_String;
    }

    protected final ajz<String> mo2118a(adu com_google_android_gms_internal_adu) {
        Object str;
        try {
            str = new String(com_google_android_gms_internal_adu.f4931a, ko.m5887a(com_google_android_gms_internal_adu.f4932b));
        } catch (UnsupportedEncodingException e) {
            str = new String(com_google_android_gms_internal_adu.f4931a);
        }
        return ajz.m4618a(str, ko.m5886a(com_google_android_gms_internal_adu));
    }

    protected final /* synthetic */ void mo2119a(Object obj) {
        this.f6202k.mo2122a((String) obj);
    }
}
