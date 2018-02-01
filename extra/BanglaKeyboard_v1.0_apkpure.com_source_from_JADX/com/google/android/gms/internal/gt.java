package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public final class gt extends gi {
    public gt(ge geVar, boolean z) {
        super(geVar, z);
    }

    private static WebResourceResponse m2131a(Context context, String str, String str2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        try {
            fo.m1995a(context, str, true, httpURLConnection);
            httpURLConnection.connect();
            WebResourceResponse webResourceResponse = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(fo.m1987a(new InputStreamReader(httpURLConnection.getInputStream())).getBytes("UTF-8")));
            return webResourceResponse;
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                return super.shouldInterceptRequest(webView, str);
            }
            if (webView instanceof ge) {
                ge geVar = (ge) webView;
                geVar.m2097f().m2128d();
                if (geVar.m2096e().f938e) {
                    gb.m2071a(2);
                    return m2131a(geVar.getContext(), this.a.m2099h().f1222b, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
                } else if (geVar.m2100i()) {
                    gb.m2071a(2);
                    return m2131a(geVar.getContext(), this.a.m2099h().f1222b, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
                } else {
                    gb.m2071a(2);
                    return m2131a(geVar.getContext(), this.a.m2099h().f1222b, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
                }
            }
            gb.m2069a("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return super.shouldInterceptRequest(webView, str);
        } catch (IOException e) {
            gb.m2069a("Could not fetching MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, str);
        }
    }
}
