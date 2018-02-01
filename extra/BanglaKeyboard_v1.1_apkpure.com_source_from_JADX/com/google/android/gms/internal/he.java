package com.google.android.gms.internal;

import android.content.Context;
import java.util.Map;

@aqv
public final class he {
    static aiy f6197a;
    private static final Object f6198b = new Object();
    private static hi<Void> f6199c = new hf();

    public he(Context context) {
        m5581a(context);
    }

    private static aiy m5581a(Context context) {
        aiy com_google_android_gms_internal_aiy;
        synchronized (f6198b) {
            if (f6197a == null) {
                f6197a = ku.m5893a(context.getApplicationContext());
            }
            com_google_android_gms_internal_aiy = f6197a;
        }
        return com_google_android_gms_internal_aiy;
    }

    public static il<String> m5582a(int i, String str, Map<String, String> map, byte[] bArr) {
        Object hnVar = new hn();
        f6197a.m4575a(new hh(i, str, hnVar, new hg(str, hnVar), bArr, map));
        return hnVar;
    }
}
