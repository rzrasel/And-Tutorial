package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.aax;
import com.google.android.gms.internal.abc;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abq;
import com.google.android.gms.internal.afq;
import com.google.android.gms.internal.agc;
import com.google.android.gms.internal.amc;
import com.google.android.gms.internal.aoi;
import com.google.android.gms.internal.aor;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.bu;
import com.google.android.gms.internal.cc;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;

@Keep
@DynamiteApi
@aqv
public class ClientApi extends abl {
    public aax createAdLoaderBuilder(C1398a c1398a, String str, amc com_google_android_gms_internal_amc, int i) {
        Context context = (Context) C1401c.m3585a(c1398a);
        zzbv.zzea();
        return new zzal(context, str, com_google_android_gms_internal_amc, new zzajk(i, gb.m5497j(context)), zzv.zzf(context));
    }

    public aoi createAdOverlay(C1398a c1398a) {
        return new zzm((Activity) C1401c.m3585a(c1398a));
    }

    public abc createBannerAdManager(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, int i) {
        Context context = (Context) C1401c.m3585a(c1398a);
        zzbv.zzea();
        return new zzx(context, com_google_android_gms_internal_zzjb, str, com_google_android_gms_internal_amc, new zzajk(i, gb.m5497j(context)), zzv.zzf(context));
    }

    public aor createInAppPurchaseManager(C1398a c1398a) {
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.abc createInterstitialAdManager(com.google.android.gms.p056a.C1398a r14, com.google.android.gms.internal.zzjb r15, java.lang.String r16, com.google.android.gms.internal.amc r17, int r18) {
        /*
        r13 = this;
        r2 = com.google.android.gms.p056a.C1401c.m3585a(r14);
        r2 = (android.content.Context) r2;
        com.google.android.gms.internal.ado.m4219a(r2);
        r5 = new com.google.android.gms.internal.zzajk;
        com.google.android.gms.ads.internal.zzbv.zzea();
        r1 = com.google.android.gms.internal.gb.m5497j(r2);
        r0 = r18;
        r5.<init>(r0, r1);
        r1 = "reward_mb";
        r3 = r15.f7758a;
        r3 = r1.equals(r3);
        if (r3 != 0) goto L_0x0033;
    L_0x0021:
        r1 = com.google.android.gms.internal.ado.aE;
        r4 = com.google.android.gms.ads.internal.zzbv.zzen();
        r1 = r4.m4217a(r1);
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 != 0) goto L_0x0047;
    L_0x0033:
        if (r3 == 0) goto L_0x0058;
    L_0x0035:
        r1 = com.google.android.gms.internal.ado.aF;
        r3 = com.google.android.gms.ads.internal.zzbv.zzen();
        r1 = r3.m4217a(r1);
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x0058;
    L_0x0047:
        r1 = 1;
    L_0x0048:
        if (r1 == 0) goto L_0x005a;
    L_0x004a:
        r1 = new com.google.android.gms.internal.alb;
        r6 = com.google.android.gms.ads.internal.zzv.zzf(r2);
        r3 = r16;
        r4 = r17;
        r1.<init>(r2, r3, r4, r5, r6);
    L_0x0057:
        return r1;
    L_0x0058:
        r1 = 0;
        goto L_0x0048;
    L_0x005a:
        r6 = new com.google.android.gms.ads.internal.zzam;
        r12 = com.google.android.gms.ads.internal.zzv.zzf(r2);
        r7 = r2;
        r8 = r15;
        r9 = r16;
        r10 = r17;
        r11 = r5;
        r6.<init>(r7, r8, r9, r10, r11, r12);
        r1 = r6;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(com.google.android.gms.a.a, com.google.android.gms.internal.zzjb, java.lang.String, com.google.android.gms.internal.amc, int):com.google.android.gms.internal.abc");
    }

    public agc createNativeAdViewDelegate(C1398a c1398a, C1398a c1398a2) {
        return new afq((FrameLayout) C1401c.m3585a(c1398a), (FrameLayout) C1401c.m3585a(c1398a2));
    }

    public cc createRewardedVideoAd(C1398a c1398a, amc com_google_android_gms_internal_amc, int i) {
        Context context = (Context) C1401c.m3585a(c1398a);
        zzbv.zzea();
        return new bu(context, zzv.zzf(context), com_google_android_gms_internal_amc, new zzajk(i, gb.m5497j(context)));
    }

    public abc createSearchAdManager(C1398a c1398a, zzjb com_google_android_gms_internal_zzjb, String str, int i) {
        Context context = (Context) C1401c.m3585a(c1398a);
        zzbv.zzea();
        return new zzbp(context, com_google_android_gms_internal_zzjb, str, new zzajk(i, gb.m5497j(context)));
    }

    public abq getMobileAdsSettingsManager(C1398a c1398a) {
        return null;
    }

    public abq getMobileAdsSettingsManagerWithClientJarVersion(C1398a c1398a, int i) {
        Context context = (Context) C1401c.m3585a(c1398a);
        zzbv.zzea();
        return zzay.zza(context, new zzajk(i, gb.m5497j(context)));
    }
}
