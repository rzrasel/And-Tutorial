package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(11)
@aqv
public final class kk extends km {
    public kk(jf jfVar, boolean z) {
        super(jfVar, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m5884a(webView, str, null);
    }
}
