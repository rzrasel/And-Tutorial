package com.google.android.gms.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzb;

@aqv
public class zzjb extends zzbcc {
    public static final Creator<zzjb> CREATOR = new zz();
    public final String f7758a;
    public final int f7759b;
    public final int f7760c;
    public final boolean f7761d;
    public final int f7762e;
    public final int f7763f;
    public final zzjb[] f7764g;
    public final boolean f7765h;
    public final boolean f7766i;
    public boolean f7767j;

    public zzjb() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public zzjb(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    public zzjb(Context context, AdSize[] adSizeArr) {
        int i;
        int i2;
        AdSize adSize = adSizeArr[0];
        this.f7761d = false;
        this.f7766i = adSize.isFluid();
        if (this.f7766i) {
            this.f7762e = AdSize.BANNER.getWidth();
            this.f7759b = AdSize.BANNER.getHeight();
        } else {
            this.f7762e = adSize.getWidth();
            this.f7759b = adSize.getHeight();
        }
        boolean z = this.f7762e == -1;
        boolean z2 = this.f7759b == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            double d;
            aak.m4022a();
            if (hz.m5631g(context)) {
                aak.m4022a();
                if (hz.m5632h(context)) {
                    i = displayMetrics.widthPixels;
                    aak.m4022a();
                    this.f7763f = i - hz.m5633i(context);
                    d = (double) (((float) this.f7763f) / displayMetrics.density);
                    i = (int) d;
                    if (d - ((double) ((int) d)) >= 0.01d) {
                        i++;
                    }
                    i2 = i;
                }
            }
            this.f7763f = displayMetrics.widthPixels;
            d = (double) (((float) this.f7763f) / displayMetrics.density);
            i = (int) d;
            if (d - ((double) ((int) d)) >= 0.01d) {
                i++;
            }
            i2 = i;
        } else {
            i = this.f7762e;
            aak.m4022a();
            this.f7763f = hz.m5613a(displayMetrics, this.f7762e);
            i2 = i;
        }
        i = z2 ? m7109c(displayMetrics) : this.f7759b;
        aak.m4022a();
        this.f7760c = hz.m5613a(displayMetrics, i);
        if (z || z2) {
            this.f7758a = i2 + "x" + i + "_as";
        } else if (this.f7766i) {
            this.f7758a = "320x50_mb";
        } else {
            this.f7758a = adSize.toString();
        }
        if (adSizeArr.length > 1) {
            this.f7764g = new zzjb[adSizeArr.length];
            for (int i3 = 0; i3 < adSizeArr.length; i3++) {
                this.f7764g[i3] = new zzjb(context, adSizeArr[i3]);
            }
        } else {
            this.f7764g = null;
        }
        this.f7765h = false;
        this.f7767j = false;
    }

    public zzjb(zzjb com_google_android_gms_internal_zzjb, zzjb[] com_google_android_gms_internal_zzjbArr) {
        this(com_google_android_gms_internal_zzjb.f7758a, com_google_android_gms_internal_zzjb.f7759b, com_google_android_gms_internal_zzjb.f7760c, com_google_android_gms_internal_zzjb.f7761d, com_google_android_gms_internal_zzjb.f7762e, com_google_android_gms_internal_zzjb.f7763f, com_google_android_gms_internal_zzjbArr, com_google_android_gms_internal_zzjb.f7765h, com_google_android_gms_internal_zzjb.f7766i, com_google_android_gms_internal_zzjb.f7767j);
    }

    zzjb(String str, int i, int i2, boolean z, int i3, int i4, zzjb[] com_google_android_gms_internal_zzjbArr, boolean z2, boolean z3, boolean z4) {
        this.f7758a = str;
        this.f7759b = i;
        this.f7760c = i2;
        this.f7761d = z;
        this.f7762e = i3;
        this.f7763f = i4;
        this.f7764g = com_google_android_gms_internal_zzjbArr;
        this.f7765h = z2;
        this.f7766i = z3;
        this.f7767j = z4;
    }

    public static int m7105a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static zzjb m7106a() {
        return new zzjb("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    public static int m7107b(DisplayMetrics displayMetrics) {
        return (int) (((float) m7109c(displayMetrics)) * displayMetrics.density);
    }

    public static zzjb m7108b() {
        return new zzjb("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    private static int m7109c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i <= 400 ? 32 : i <= 720 ? 50 : 90;
    }

    public final AdSize m7110c() {
        return zzb.zza(this.f7762e, this.f7759b, this.f7758a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5961a(parcel, 2, this.f7758a);
        li.m5956a(parcel, 3, this.f7759b);
        li.m5956a(parcel, 4, this.f7760c);
        li.m5963a(parcel, 5, this.f7761d);
        li.m5956a(parcel, 6, this.f7762e);
        li.m5956a(parcel, 7, this.f7763f);
        li.m5965a(parcel, 8, this.f7764g, i);
        li.m5963a(parcel, 9, this.f7765h);
        li.m5963a(parcel, 10, this.f7766i);
        li.m5963a(parcel, 11, this.f7767j);
        li.m5967b(parcel, a);
    }
}
