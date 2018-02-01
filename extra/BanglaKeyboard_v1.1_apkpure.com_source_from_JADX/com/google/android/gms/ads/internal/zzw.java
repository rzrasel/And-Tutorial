package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.dq;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.zzaaq;

@aqv
public final class zzw {
    private final Context f4452a;
    private boolean f4453b;
    private dq f4454c;
    private zzaaq f4455d;

    public zzw(Context context, dq dqVar, zzaaq com_google_android_gms_internal_zzaaq) {
        this.f4452a = context;
        this.f4454c = dqVar;
        this.f4455d = com_google_android_gms_internal_zzaaq;
        if (this.f4455d == null) {
            this.f4455d = new zzaaq();
        }
    }

    private final boolean m3781a() {
        return (this.f4454c != null && this.f4454c.mo2076a().f7703f) || this.f4455d.f7681a;
    }

    public final void recordClick() {
        this.f4453b = true;
    }

    public final boolean zzcq() {
        return !m3781a() || this.f4453b;
    }

    public final void zzs(String str) {
        if (m3781a()) {
            if (str == null) {
                str = "";
            }
            if (this.f4454c != null) {
                this.f4454c.mo2079a(str, null, 3);
            } else if (this.f4455d.f7681a && this.f4455d.f7682b != null) {
                for (String str2 : this.f4455d.f7682b) {
                    String str22;
                    if (!TextUtils.isEmpty(str22)) {
                        str22 = str22.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzbv.zzea();
                        gb.m5472b(this.f4452a, "", str22);
                    }
                }
            }
        }
    }
}
