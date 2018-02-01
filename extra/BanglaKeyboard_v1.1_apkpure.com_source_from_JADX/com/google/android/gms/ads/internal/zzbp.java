package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.internal.C1516t;
import com.google.android.gms.internal.aak;
import com.google.android.gms.internal.aan;
import com.google.android.gms.internal.aaq;
import com.google.android.gms.internal.abd;
import com.google.android.gms.internal.abh;
import com.google.android.gms.internal.abn;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.aei;
import com.google.android.gms.internal.aop;
import com.google.android.gms.internal.aou;
import com.google.android.gms.internal.aqv;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.fv;
import com.google.android.gms.internal.hz;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.vs;
import com.google.android.gms.internal.vt;
import com.google.android.gms.internal.zzajk;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzjb;
import com.google.android.gms.internal.zzle;
import com.google.android.gms.internal.zzmd;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;
import java.util.Map;
import java.util.concurrent.Future;

@aqv
public final class zzbp extends abd {
    private final zzajk f4375a;
    private final zzjb f4376b;
    private final Future<vs> f4377c = fv.m5426a(fv.f6119a, new ac(this));
    private final Context f4378d;
    private final ae f4379e;
    private WebView f4380f = new WebView(this.f4378d);
    private aaq f4381g;
    private vs f4382h;
    private AsyncTask<Void, Void, String> f4383i;

    public zzbp(Context context, zzjb com_google_android_gms_internal_zzjb, String str, zzajk com_google_android_gms_internal_zzajk) {
        this.f4378d = context;
        this.f4375a = com_google_android_gms_internal_zzajk;
        this.f4376b = com_google_android_gms_internal_zzjb;
        this.f4379e = new ae(str);
        m3771a(0);
        this.f4380f.setVerticalScrollBarEnabled(false);
        this.f4380f.getSettings().setJavaScriptEnabled(true);
        this.f4380f.setWebViewClient(new aa(this));
        this.f4380f.setOnTouchListener(new ab(this));
    }

    private final String m3763b(String str) {
        if (this.f4382h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        Uri uri;
        try {
            vs vsVar = this.f4382h;
            Object obj = this.f4378d;
            C1398a b = vsVar.f7318a.mo2303b(C1401c.m3584a((Object) parse), C1401c.m3584a(obj));
            if (b == null) {
                throw new vt();
            }
            uri = (Uri) C1401c.m3585a(b);
            return uri.toString();
        } catch (Throwable e) {
            id.m5371a("Unable to process ad data", e);
            uri = parse;
        } catch (Throwable e2) {
            id.m5371a("Unable to parse ad click url", e2);
            uri = parse;
        }
    }

    static /* synthetic */ void m3764b(zzbp com_google_android_gms_ads_internal_zzbp, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        com_google_android_gms_ads_internal_zzbp.f4378d.startActivity(intent);
    }

    final int m3769a(String str) {
        int i = 0;
        Object queryParameter = Uri.parse(str).getQueryParameter("height");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                aak.m4022a();
                i = hz.m5612a(this.f4378d, Integer.parseInt(queryParameter));
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    final String m3770a() {
        String encodedQuery;
        Uri uri;
        String b;
        Throwable e;
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbv.zzen().m4217a(ado.cg));
        builder.appendQueryParameter("query", this.f4379e.f3969c);
        builder.appendQueryParameter("pubId", this.f4379e.f3967a);
        Map map = this.f4379e.f3968b;
        for (String encodedQuery2 : map.keySet()) {
            builder.appendQueryParameter(encodedQuery2, (String) map.get(encodedQuery2));
        }
        Uri build = builder.build();
        if (this.f4382h != null) {
            try {
                vs vsVar = this.f4382h;
                Object obj = this.f4378d;
                C1398a a = vsVar.f7318a.mo2295a(C1401c.m3584a((Object) build), C1401c.m3584a(obj));
                if (a == null) {
                    throw new vt();
                }
                uri = (Uri) C1401c.m3585a(a);
                b = m3772b();
                encodedQuery2 = uri.getEncodedQuery();
                return new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(encodedQuery2).length()).append(b).append("#").append(encodedQuery2).toString();
            } catch (vt e2) {
                e = e2;
                id.m5371a("Unable to process ad data", e);
                uri = build;
                b = m3772b();
                encodedQuery2 = uri.getEncodedQuery();
                return new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(encodedQuery2).length()).append(b).append("#").append(encodedQuery2).toString();
            } catch (RemoteException e3) {
                e = e3;
                id.m5371a("Unable to process ad data", e);
                uri = build;
                b = m3772b();
                encodedQuery2 = uri.getEncodedQuery();
                return new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(encodedQuery2).length()).append(b).append("#").append(encodedQuery2).toString();
            }
        }
        uri = build;
        b = m3772b();
        encodedQuery2 = uri.getEncodedQuery();
        return new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(encodedQuery2).length()).append(b).append("#").append(encodedQuery2).toString();
    }

    final void m3771a(int i) {
        if (this.f4380f != null) {
            this.f4380f.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    final String m3772b() {
        String str;
        CharSequence charSequence = this.f4379e.f3970d;
        if (TextUtils.isEmpty(charSequence)) {
            str = "www.google.com";
        } else {
            CharSequence charSequence2 = charSequence;
        }
        String str2 = "https://";
        String str3 = (String) zzbv.zzen().m4217a(ado.cg);
        return new StringBuilder((String.valueOf(str2).length() + String.valueOf(str).length()) + String.valueOf(str3).length()).append(str2).append(str).append(str3).toString();
    }

    public final void destroy() {
        C1516t.m3867b("destroy must be called on the main UI thread.");
        this.f4383i.cancel(true);
        this.f4377c.cancel(true);
        this.f4380f.destroy();
        this.f4380f = null;
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final String getMediationAdapterClassName() {
        return null;
    }

    public final abv getVideoController() {
        return null;
    }

    public final boolean isLoading() {
        return false;
    }

    public final boolean isReady() {
        return false;
    }

    public final void pause() {
        C1516t.m3867b("pause must be called on the main UI thread.");
    }

    public final void resume() {
        C1516t.m3867b("resume must be called on the main UI thread.");
    }

    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    public final void setManualImpressionsEnabled(boolean z) {
    }

    public final void setUserId(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Unused method");
    }

    public final void stopLoading() {
    }

    public final void zza(aan com_google_android_gms_internal_aan) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(aaq com_google_android_gms_internal_aaq) {
        this.f4381g = com_google_android_gms_internal_aaq;
    }

    public final void zza(abh com_google_android_gms_internal_abh) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(abn com_google_android_gms_internal_abn) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(aei com_google_android_gms_internal_aei) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(aop com_google_android_gms_internal_aop) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(aou com_google_android_gms_internal_aou, String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(ch chVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzjb com_google_android_gms_internal_zzjb) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zza(zzle com_google_android_gms_internal_zzle) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzmd com_google_android_gms_internal_zzmd) {
        throw new IllegalStateException("Unused method");
    }

    public final boolean zzb(zzix com_google_android_gms_internal_zzix) {
        C1516t.m3861a(this.f4380f, (Object) "This Search Ad has already been torn down");
        ae aeVar = this.f4379e;
        zzajk com_google_android_gms_internal_zzajk = this.f4375a;
        aeVar.f3969c = com_google_android_gms_internal_zzix.f7749j.f7771a;
        Bundle bundle = com_google_android_gms_internal_zzix.f7752m != null ? com_google_android_gms_internal_zzix.f7752m.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = (String) zzbv.zzen().m4217a(ado.ch);
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    aeVar.f3970d = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    aeVar.f3968b.put(str2.substring(4), bundle.getString(str2));
                }
            }
            aeVar.f3968b.put("SDKVersion", com_google_android_gms_internal_zzajk.f7706a);
        }
        this.f4383i = new ad().execute(new Void[0]);
        return true;
    }

    public final C1398a zzbk() {
        C1516t.m3867b("getAdFrame must be called on the main UI thread.");
        return C1401c.m3584a(this.f4380f);
    }

    public final zzjb zzbl() {
        return this.f4376b;
    }

    public final void zzbn() {
        throw new IllegalStateException("Unused method");
    }

    public final abh zzbw() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final aaq zzbx() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final String zzch() {
        return null;
    }
}
