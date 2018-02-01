package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;
import java.net.URISyntaxException;

public final class gv extends WebViewClient {
    private final String f1498a;
    private boolean f1499b = false;
    private final ge f1500c;
    private final dz f1501d;

    public gv(dz dzVar, ge geVar, String str) {
        this.f1498a = m2133b(str);
        this.f1500c = geVar;
        this.f1501d = dzVar;
    }

    private boolean m2132a(String str) {
        Object b = m2133b(str);
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        try {
            URI uri = new URI(b);
            if ("passback".equals(uri.getScheme())) {
                gb.m2071a(3);
                this.f1501d.m1891b();
                return true;
            } else if (TextUtils.isEmpty(this.f1498a)) {
                return false;
            } else {
                URI uri2 = new URI(this.f1498a);
                String host = uri2.getHost();
                String host2 = uri.getHost();
                String path = uri2.getPath();
                String path2 = uri.getPath();
                if (!jb.m2470a(host, host2) || !jb.m2470a(path, path2)) {
                    return false;
                }
                gb.m2071a(3);
                this.f1501d.m1891b();
                return true;
            }
        } catch (URISyntaxException e) {
            e.getMessage();
            gb.m2071a(6);
            return false;
        }
    }

    private static String m2133b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (str.endsWith("/")) {
                    str = str.substring(0, str.length() - 1);
                }
            } catch (IndexOutOfBoundsException e) {
                e.getMessage();
                gb.m2071a(6);
            }
        }
        return str;
    }

    public final void onLoadResource(WebView webView, String str) {
        "JavascriptAdWebViewClient::onLoadResource: " + str;
        gb.m2071a(3);
        if (!m2132a(str)) {
            this.f1500c.m2097f().onLoadResource(this.f1500c, str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        "JavascriptAdWebViewClient::onPageFinished: " + str;
        gb.m2071a(3);
        if (!this.f1499b) {
            this.f1501d.m1889a();
            this.f1499b = true;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        "JavascriptAdWebViewClient::shouldOverrideUrlLoading: " + str;
        gb.m2071a(3);
        if (!m2132a(str)) {
            return this.f1500c.m2097f().shouldOverrideUrlLoading(this.f1500c, str);
        }
        gb.m2071a(3);
        return true;
    }
}
