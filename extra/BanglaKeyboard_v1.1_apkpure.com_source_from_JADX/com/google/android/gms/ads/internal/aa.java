package com.google.android.gms.ads.internal;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.id;

final class aa extends WebViewClient {
    private /* synthetic */ zzbp f3963a;

    aa(zzbp com_google_android_gms_ads_internal_zzbp) {
        this.f3963a = com_google_android_gms_ads_internal_zzbp;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f3963a.f4381g != null) {
            try {
                this.f3963a.f4381g.mo1689a(0);
            } catch (Throwable e) {
                id.m5371a("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f3963a.m3772b())) {
            return false;
        }
        if (str.startsWith((String) zzbv.zzen().m4217a(ado.cd))) {
            if (this.f3963a.f4381g != null) {
                try {
                    this.f3963a.f4381g.mo1689a(3);
                } catch (Throwable e) {
                    id.m5371a("Could not call AdListener.onAdFailedToLoad().", e);
                }
            }
            this.f3963a.m3771a(0);
            return true;
        }
        if (str.startsWith((String) zzbv.zzen().m4217a(ado.ce))) {
            if (this.f3963a.f4381g != null) {
                try {
                    this.f3963a.f4381g.mo1689a(0);
                } catch (Throwable e2) {
                    id.m5371a("Could not call AdListener.onAdFailedToLoad().", e2);
                }
            }
            this.f3963a.m3771a(0);
            return true;
        }
        if (str.startsWith((String) zzbv.zzen().m4217a(ado.cf))) {
            if (this.f3963a.f4381g != null) {
                try {
                    this.f3963a.f4381g.mo1691c();
                } catch (Throwable e22) {
                    id.m5371a("Could not call AdListener.onAdLoaded().", e22);
                }
            }
            this.f3963a.m3771a(this.f3963a.m3769a(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f3963a.f4381g != null) {
                try {
                    this.f3963a.f4381g.mo1690b();
                } catch (Throwable e222) {
                    id.m5371a("Could not call AdListener.onAdLeftApplication().", e222);
                }
            }
            zzbp.m3764b(this.f3963a, this.f3963a.m3763b(str));
            return true;
        }
    }
}
