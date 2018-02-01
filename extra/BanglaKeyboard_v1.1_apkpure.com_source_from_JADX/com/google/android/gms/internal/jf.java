package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.js.zzai;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import org.json.JSONObject;

@aqv
public interface jf extends zzai, zzbo, xl {
    void mo2131A();

    void mo2132B();

    OnClickListener mo2133C();

    aey mo2134D();

    void mo2135E();

    WebView mo2136a();

    void mo2137a(int i);

    void mo2138a(Context context);

    void mo2139a(Context context, zzjb com_google_android_gms_internal_zzjb, aec com_google_android_gms_internal_aec);

    void mo2140a(zzm com_google_android_gms_ads_internal_overlay_zzm);

    void mo2141a(aey com_google_android_gms_internal_aey);

    void mo2142a(jy jyVar);

    void mo2143a(zzjb com_google_android_gms_internal_zzjb);

    void mo2144a(String str);

    void mo2145a(String str, Map<String, ?> map);

    void mo2146a(boolean z);

    void mo2147b();

    void mo2148b(int i);

    void mo2149b(zzm com_google_android_gms_ads_internal_overlay_zzm);

    void mo2150b(String str);

    void mo2151b(boolean z);

    void mo2152c();

    void mo2153c(boolean z);

    void mo2154d();

    void mo2155d(boolean z);

    void destroy();

    Activity mo2157e();

    Context mo2158f();

    zzv mo2159g();

    Context getContext();

    int getHeight();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    zzm mo2160h();

    zzm mo2161i();

    zzjb mo2162j();

    jg mo2163k();

    boolean mo2164l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    nh mo2168m();

    void measure(int i, int i2);

    zzajk mo2169n();

    boolean mo2170o();

    void onPause();

    void onResume();

    int mo2173p();

    boolean mo2174q();

    void mo2175r();

    boolean mo2176s();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    boolean mo2182t();

    String mo2183u();

    je mo2184v();

    aea mo2185w();

    aeb mo2186x();

    jy mo2187y();

    boolean mo2188z();

    void zza(String str, JSONObject jSONObject);

    void zzi(String str, String str2);
}
