package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.C1516t;
import java.util.Map;
import org.json.JSONObject;

@aqv
final class js extends FrameLayout implements jf {
    private static final int f6330a = Color.argb(0, 0, 0, 0);
    private final jf f6331b;
    private final je f6332c;

    public js(jf jfVar) {
        super(jfVar.getContext());
        this.f6331b = jfVar;
        this.f6332c = new je(jfVar.mo2158f(), this, this);
        jg k = this.f6331b.mo2163k();
        if (k != null) {
            k.f6287a = this;
        }
        jf jfVar2 = this.f6331b;
        if (jfVar2 == null) {
            throw null;
        }
        addView((View) jfVar2);
    }

    public final void mo2131A() {
        this.f6331b.mo2131A();
    }

    public final void mo2132B() {
        this.f6331b.mo2132B();
    }

    public final OnClickListener mo2133C() {
        return this.f6331b.mo2133C();
    }

    public final aey mo2134D() {
        return this.f6331b.mo2134D();
    }

    public final void mo2135E() {
        setBackgroundColor(f6330a);
        this.f6331b.setBackgroundColor(f6330a);
    }

    public final WebView mo2136a() {
        return this.f6331b.mo2136a();
    }

    public final void mo2137a(int i) {
        this.f6331b.mo2137a(i);
    }

    public final void mo2138a(Context context) {
        this.f6331b.mo2138a(context);
    }

    public final void mo2139a(Context context, zzjb com_google_android_gms_internal_zzjb, aec com_google_android_gms_internal_aec) {
        this.f6332c.m5667b();
        this.f6331b.mo2139a(context, com_google_android_gms_internal_zzjb, com_google_android_gms_internal_aec);
    }

    public final void mo2140a(zzm com_google_android_gms_ads_internal_overlay_zzm) {
        this.f6331b.mo2140a(com_google_android_gms_ads_internal_overlay_zzm);
    }

    public final void mo2141a(aey com_google_android_gms_internal_aey) {
        this.f6331b.mo2141a(com_google_android_gms_internal_aey);
    }

    public final void mo2142a(jy jyVar) {
        this.f6331b.mo2142a(jyVar);
    }

    public final void mo2085a(xk xkVar) {
        this.f6331b.mo2085a(xkVar);
    }

    public final void mo2143a(zzjb com_google_android_gms_internal_zzjb) {
        this.f6331b.mo2143a(com_google_android_gms_internal_zzjb);
    }

    public final void mo2144a(String str) {
        this.f6331b.mo2144a(str);
    }

    public final void mo2145a(String str, Map<String, ?> map) {
        this.f6331b.mo2145a(str, map);
    }

    public final void mo2146a(boolean z) {
        this.f6331b.mo2146a(z);
    }

    public final void mo2147b() {
        this.f6331b.mo2147b();
    }

    public final void mo2148b(int i) {
        this.f6331b.mo2148b(i);
    }

    public final void mo2149b(zzm com_google_android_gms_ads_internal_overlay_zzm) {
        this.f6331b.mo2149b(com_google_android_gms_ads_internal_overlay_zzm);
    }

    public final void mo2150b(String str) {
        this.f6331b.mo2150b(str);
    }

    public final void mo2151b(boolean z) {
        this.f6331b.mo2151b(z);
    }

    public final void mo2152c() {
        this.f6331b.mo2152c();
    }

    public final void mo2153c(boolean z) {
        this.f6331b.mo2153c(z);
    }

    public final void mo2154d() {
        this.f6331b.mo2154d();
    }

    public final void mo2155d(boolean z) {
        this.f6331b.mo2155d(z);
    }

    public final void destroy() {
        this.f6331b.destroy();
    }

    public final Activity mo2157e() {
        return this.f6331b.mo2157e();
    }

    public final Context mo2158f() {
        return this.f6331b.mo2158f();
    }

    public final zzv mo2159g() {
        return this.f6331b.mo2159g();
    }

    public final zzm mo2160h() {
        return this.f6331b.mo2160h();
    }

    public final zzm mo2161i() {
        return this.f6331b.mo2161i();
    }

    public final zzjb mo2162j() {
        return this.f6331b.mo2162j();
    }

    public final jg mo2163k() {
        return this.f6331b.mo2163k();
    }

    public final boolean mo2164l() {
        return this.f6331b.mo2164l();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f6331b.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f6331b.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f6331b.loadUrl(str);
    }

    public final nh mo2168m() {
        return this.f6331b.mo2168m();
    }

    public final zzajk mo2169n() {
        return this.f6331b.mo2169n();
    }

    public final boolean mo2170o() {
        return this.f6331b.mo2170o();
    }

    public final void onPause() {
        je jeVar = this.f6332c;
        C1516t.m3867b("onPause must be called from the UI thread.");
        if (jeVar.f6280d != null) {
            jeVar.f6280d.pause();
        }
        this.f6331b.onPause();
    }

    public final void onResume() {
        this.f6331b.onResume();
    }

    public final int mo2173p() {
        return this.f6331b.mo2173p();
    }

    public final boolean mo2174q() {
        return this.f6331b.mo2174q();
    }

    public final void mo2175r() {
        this.f6332c.m5667b();
        this.f6331b.mo2175r();
    }

    public final boolean mo2176s() {
        return this.f6331b.mo2176s();
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f6331b.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f6331b.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f6331b.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f6331b.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.f6331b.stopLoading();
    }

    public final boolean mo2182t() {
        return this.f6331b.mo2182t();
    }

    public final String mo2183u() {
        return this.f6331b.mo2183u();
    }

    public final je mo2184v() {
        return this.f6332c;
    }

    public final aea mo2185w() {
        return this.f6331b.mo2185w();
    }

    public final aeb mo2186x() {
        return this.f6331b.mo2186x();
    }

    public final jy mo2187y() {
        return this.f6331b.mo2187y();
    }

    public final boolean mo2188z() {
        return this.f6331b.mo2188z();
    }

    public final void zza(String str, ail com_google_android_gms_internal_ail) {
        this.f6331b.zza(str, com_google_android_gms_internal_ail);
    }

    public final void zza(String str, JSONObject jSONObject) {
        this.f6331b.zza(str, jSONObject);
    }

    public final void zzb(String str, ail com_google_android_gms_internal_ail) {
        this.f6331b.zzb(str, com_google_android_gms_internal_ail);
    }

    public final void zzb(String str, JSONObject jSONObject) {
        this.f6331b.zzb(str, jSONObject);
    }

    public final void zzci() {
        this.f6331b.zzci();
    }

    public final void zzcj() {
        this.f6331b.zzcj();
    }

    public final void zzi(String str, String str2) {
        this.f6331b.zzi(str, str2);
    }
}
