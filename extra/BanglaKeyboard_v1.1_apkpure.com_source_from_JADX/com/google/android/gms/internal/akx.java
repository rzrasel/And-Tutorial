package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1516t;
import java.util.LinkedList;

@aqv
final class akx {
    final LinkedList<aky> f5244a = new LinkedList();
    zzix f5245b;
    final String f5246c;
    final int f5247d;
    boolean f5248e;

    akx(zzix com_google_android_gms_internal_zzix, String str, int i) {
        C1516t.m3860a((Object) com_google_android_gms_internal_zzix);
        C1516t.m3860a((Object) str);
        this.f5245b = com_google_android_gms_internal_zzix;
        this.f5246c = str;
        this.f5247d = i;
    }

    final aky m4667a(zzix com_google_android_gms_internal_zzix) {
        if (com_google_android_gms_internal_zzix != null) {
            this.f5245b = com_google_android_gms_internal_zzix;
        }
        return (aky) this.f5244a.remove();
    }
}
