package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.adv;
import com.google.android.gms.internal.aea;
import com.google.android.gms.internal.aec;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.hb;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.hd;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.zzajk;
import java.util.concurrent.TimeUnit;

@aqv
public final class zzar {
    private final Context f4201a;
    private final String f4202b;
    private final zzajk f4203c;
    private final aea f4204d;
    private final aec f4205e;
    private final hb f4206f = new hb(new hd().m5580a("min_1", Double.MIN_VALUE, 1.0d).m5580a("1_5", 1.0d, 5.0d).m5580a("5_10", 5.0d, 10.0d).m5580a("10_20", 10.0d, 20.0d).m5580a("20_30", 20.0d, 30.0d).m5580a("30_max", 30.0d, Double.MAX_VALUE));
    private final long[] f4207g;
    private final String[] f4208h;
    private boolean f4209i = false;
    private boolean f4210j = false;
    private boolean f4211k = false;
    private boolean f4212l = false;
    private boolean f4213m;
    private zzy f4214n;
    private boolean f4215o;
    private boolean f4216p;
    private long f4217q = -1;

    public zzar(Context context, zzajk com_google_android_gms_internal_zzajk, String str, aec com_google_android_gms_internal_aec, aea com_google_android_gms_internal_aea) {
        this.f4201a = context;
        this.f4203c = com_google_android_gms_internal_zzajk;
        this.f4202b = str;
        this.f4205e = com_google_android_gms_internal_aec;
        this.f4204d = com_google_android_gms_internal_aea;
        String str2 = (String) zzbv.zzen().m4217a(ado.f4904p);
        if (str2 == null) {
            this.f4208h = new String[0];
            this.f4207g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f4208h = new String[split.length];
        this.f4207g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f4207g[i] = Long.parseLong(split[i]);
            } catch (Throwable e) {
                id.m5371a("Unable to parse frame hash target time number.", e);
                this.f4207g[i] = -1;
            }
        }
    }

    public final void onStop() {
        if (((Boolean) zzbv.zzen().m4217a(ado.f4903o)).booleanValue() && !this.f4215o) {
            String valueOf;
            String valueOf2;
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f4202b);
            bundle.putString("player", this.f4214n.zzmg());
            for (hc hcVar : this.f4206f.m5579a()) {
                valueOf = String.valueOf("fps_c_");
                valueOf2 = String.valueOf(hcVar.f6189a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(hcVar.f6191c));
                valueOf = String.valueOf("fps_p_");
                valueOf2 = String.valueOf(hcVar.f6189a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Double.toString(hcVar.f6190b));
            }
            for (int i = 0; i < this.f4207g.length; i++) {
                valueOf2 = this.f4208h[i];
                if (valueOf2 != null) {
                    String str = "fh_";
                    valueOf = String.valueOf(Long.valueOf(this.f4207g[i]));
                    bundle.putString(new StringBuilder(String.valueOf(str).length() + String.valueOf(valueOf).length()).append(str).append(valueOf).toString(), valueOf2);
                }
            }
            zzbv.zzea();
            gb.m5448a(this.f4201a, this.f4203c.f7706a, "gmob-apps", bundle, true);
            this.f4215o = true;
        }
    }

    public final void zza(zzy com_google_android_gms_ads_internal_overlay_zzy) {
        adv.m4226a(this.f4205e, this.f4204d, "vpc2");
        this.f4209i = true;
        if (this.f4205e != null) {
            this.f4205e.m4235a("vpn", com_google_android_gms_ads_internal_overlay_zzy.zzmg());
        }
        this.f4214n = com_google_android_gms_ads_internal_overlay_zzy;
    }

    public final void zzb(zzy com_google_android_gms_ads_internal_overlay_zzy) {
        int i;
        if (this.f4211k && !this.f4212l) {
            adv.m4226a(this.f4205e, this.f4204d, "vff2");
            this.f4212l = true;
        }
        long c = zzbv.zzeg().mo1671c();
        if (this.f4213m && this.f4216p && this.f4217q != -1) {
            double toNanos = ((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c - this.f4217q));
            hb hbVar = this.f4206f;
            hbVar.f6187d++;
            i = 0;
            while (i < hbVar.f6185b.length) {
                if (hbVar.f6185b[i] <= toNanos && toNanos < hbVar.f6184a[i]) {
                    int[] iArr = hbVar.f6186c;
                    iArr[i] = iArr[i] + 1;
                }
                if (toNanos < hbVar.f6185b[i]) {
                    break;
                }
                i++;
            }
        }
        this.f4216p = this.f4213m;
        this.f4217q = c;
        c = ((Long) zzbv.zzen().m4217a(ado.f4905q)).longValue();
        long currentPosition = (long) com_google_android_gms_ads_internal_overlay_zzy.getCurrentPosition();
        i = 0;
        while (i < this.f4208h.length) {
            if (this.f4208h[i] != null || c <= Math.abs(currentPosition - this.f4207g[i])) {
                i++;
            } else {
                String[] strArr = this.f4208h;
                Bitmap bitmap = com_google_android_gms_ads_internal_overlay_zzy.getBitmap(8, 8);
                currentPosition = 0;
                c = 63;
                int i2 = 0;
                while (i2 < 8) {
                    int i3 = 0;
                    long j = currentPosition;
                    currentPosition = c;
                    while (i3 < 8) {
                        int pixel = bitmap.getPixel(i3, i2);
                        j |= (Color.green(pixel) + (Color.blue(pixel) + Color.red(pixel)) > 128 ? 1 : 0) << ((int) currentPosition);
                        i3++;
                        currentPosition--;
                    }
                    i2++;
                    c = currentPosition;
                    currentPosition = j;
                }
                strArr[i] = String.format("%016X", new Object[]{Long.valueOf(currentPosition)});
                return;
            }
        }
    }

    public final void zzmw() {
        if (this.f4209i && !this.f4210j) {
            adv.m4226a(this.f4205e, this.f4204d, "vfr2");
            this.f4210j = true;
        }
    }

    public final void zznm() {
        this.f4213m = true;
        if (this.f4210j && !this.f4211k) {
            adv.m4226a(this.f4205e, this.f4204d, "vfp2");
            this.f4211k = true;
        }
    }

    public final void zznn() {
        this.f4213m = false;
    }
}
