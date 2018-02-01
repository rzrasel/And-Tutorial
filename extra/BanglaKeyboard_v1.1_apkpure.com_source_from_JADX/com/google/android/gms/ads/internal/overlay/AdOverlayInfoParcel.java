package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ahr;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.jf;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.zq;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzbcc;
import com.google.android.gms.p056a.C1398a.C1399a;
import com.google.android.gms.p056a.C1401c;

@aqv
public final class AdOverlayInfoParcel extends zzbcc implements ReflectedParcelable {
    public static final Creator<AdOverlayInfoParcel> CREATOR = new zzv();
    public final int orientation;
    public final String url;
    public final zzajk zzatj;
    public final zzc zzcgw;
    public final zq zzcgx;
    public final zzw zzcgy;
    public final jf zzcgz;
    public final ahr zzcha;
    public final String zzchb;
    public final boolean zzchc;
    public final String zzchd;
    public final zzag zzche;
    public final int zzchf;
    public final String zzchg;
    public final zzaq zzchh;

    AdOverlayInfoParcel(zzc com_google_android_gms_ads_internal_overlay_zzc, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzajk com_google_android_gms_internal_zzajk, String str4, zzaq com_google_android_gms_ads_internal_zzaq) {
        this.zzcgw = com_google_android_gms_ads_internal_overlay_zzc;
        this.zzcgx = (zq) C1401c.m3585a(C1399a.m3581a(iBinder));
        this.zzcgy = (zzw) C1401c.m3585a(C1399a.m3581a(iBinder2));
        this.zzcgz = (jf) C1401c.m3585a(C1399a.m3581a(iBinder3));
        this.zzcha = (ahr) C1401c.m3585a(C1399a.m3581a(iBinder4));
        this.zzchb = str;
        this.zzchc = z;
        this.zzchd = str2;
        this.zzche = (zzag) C1401c.m3585a(C1399a.m3581a(iBinder5));
        this.orientation = i;
        this.zzchf = i2;
        this.url = str3;
        this.zzatj = com_google_android_gms_internal_zzajk;
        this.zzchg = str4;
        this.zzchh = com_google_android_gms_ads_internal_zzaq;
    }

    public AdOverlayInfoParcel(zzc com_google_android_gms_ads_internal_overlay_zzc, zq zqVar, zzw com_google_android_gms_ads_internal_overlay_zzw, zzag com_google_android_gms_ads_internal_overlay_zzag, zzajk com_google_android_gms_internal_zzajk) {
        this.zzcgw = com_google_android_gms_ads_internal_overlay_zzc;
        this.zzcgx = zqVar;
        this.zzcgy = com_google_android_gms_ads_internal_overlay_zzw;
        this.zzcgz = null;
        this.zzcha = null;
        this.zzchb = null;
        this.zzchc = false;
        this.zzchd = null;
        this.zzche = com_google_android_gms_ads_internal_overlay_zzag;
        this.orientation = -1;
        this.zzchf = 4;
        this.url = null;
        this.zzatj = com_google_android_gms_internal_zzajk;
        this.zzchg = null;
        this.zzchh = null;
    }

    public AdOverlayInfoParcel(zq zqVar, zzw com_google_android_gms_ads_internal_overlay_zzw, zzag com_google_android_gms_ads_internal_overlay_zzag, jf jfVar, int i, zzajk com_google_android_gms_internal_zzajk, String str, zzaq com_google_android_gms_ads_internal_zzaq) {
        this.zzcgw = null;
        this.zzcgx = zqVar;
        this.zzcgy = com_google_android_gms_ads_internal_overlay_zzw;
        this.zzcgz = jfVar;
        this.zzcha = null;
        this.zzchb = null;
        this.zzchc = false;
        this.zzchd = null;
        this.zzche = com_google_android_gms_ads_internal_overlay_zzag;
        this.orientation = i;
        this.zzchf = 1;
        this.url = null;
        this.zzatj = com_google_android_gms_internal_zzajk;
        this.zzchg = str;
        this.zzchh = com_google_android_gms_ads_internal_zzaq;
    }

    public AdOverlayInfoParcel(zq zqVar, zzw com_google_android_gms_ads_internal_overlay_zzw, zzag com_google_android_gms_ads_internal_overlay_zzag, jf jfVar, boolean z, int i, zzajk com_google_android_gms_internal_zzajk) {
        this.zzcgw = null;
        this.zzcgx = zqVar;
        this.zzcgy = com_google_android_gms_ads_internal_overlay_zzw;
        this.zzcgz = jfVar;
        this.zzcha = null;
        this.zzchb = null;
        this.zzchc = z;
        this.zzchd = null;
        this.zzche = com_google_android_gms_ads_internal_overlay_zzag;
        this.orientation = i;
        this.zzchf = 2;
        this.url = null;
        this.zzatj = com_google_android_gms_internal_zzajk;
        this.zzchg = null;
        this.zzchh = null;
    }

    public AdOverlayInfoParcel(zq zqVar, zzw com_google_android_gms_ads_internal_overlay_zzw, ahr com_google_android_gms_internal_ahr, zzag com_google_android_gms_ads_internal_overlay_zzag, jf jfVar, boolean z, int i, String str, zzajk com_google_android_gms_internal_zzajk) {
        this.zzcgw = null;
        this.zzcgx = zqVar;
        this.zzcgy = com_google_android_gms_ads_internal_overlay_zzw;
        this.zzcgz = jfVar;
        this.zzcha = com_google_android_gms_internal_ahr;
        this.zzchb = null;
        this.zzchc = z;
        this.zzchd = null;
        this.zzche = com_google_android_gms_ads_internal_overlay_zzag;
        this.orientation = i;
        this.zzchf = 3;
        this.url = str;
        this.zzatj = com_google_android_gms_internal_zzajk;
        this.zzchg = null;
        this.zzchh = null;
    }

    public AdOverlayInfoParcel(zq zqVar, zzw com_google_android_gms_ads_internal_overlay_zzw, ahr com_google_android_gms_internal_ahr, zzag com_google_android_gms_ads_internal_overlay_zzag, jf jfVar, boolean z, int i, String str, String str2, zzajk com_google_android_gms_internal_zzajk) {
        this.zzcgw = null;
        this.zzcgx = zqVar;
        this.zzcgy = com_google_android_gms_ads_internal_overlay_zzw;
        this.zzcgz = jfVar;
        this.zzcha = com_google_android_gms_internal_ahr;
        this.zzchb = str2;
        this.zzchc = z;
        this.zzchd = str;
        this.zzche = com_google_android_gms_ads_internal_overlay_zzag;
        this.orientation = i;
        this.zzchf = 3;
        this.url = null;
        this.zzatj = com_google_android_gms_internal_zzajk;
        this.zzchg = null;
        this.zzchh = null;
    }

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzb(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5960a(parcel, 2, this.zzcgw, i);
        li.m5959a(parcel, 3, C1401c.m3584a(this.zzcgx).asBinder());
        li.m5959a(parcel, 4, C1401c.m3584a(this.zzcgy).asBinder());
        li.m5959a(parcel, 5, C1401c.m3584a(this.zzcgz).asBinder());
        li.m5959a(parcel, 6, C1401c.m3584a(this.zzcha).asBinder());
        li.m5961a(parcel, 7, this.zzchb);
        li.m5963a(parcel, 8, this.zzchc);
        li.m5961a(parcel, 9, this.zzchd);
        li.m5959a(parcel, 10, C1401c.m3584a(this.zzche).asBinder());
        li.m5956a(parcel, 11, this.orientation);
        li.m5956a(parcel, 12, this.zzchf);
        li.m5961a(parcel, 13, this.url);
        li.m5960a(parcel, 14, this.zzatj, i);
        li.m5961a(parcel, 16, this.zzchg);
        li.m5960a(parcel, 17, this.zzchh, i);
        li.m5967b(parcel, a);
    }
}
