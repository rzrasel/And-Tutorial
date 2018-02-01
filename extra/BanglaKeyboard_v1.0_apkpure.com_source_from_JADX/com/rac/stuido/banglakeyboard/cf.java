package com.rac.stuido.banglakeyboard;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.CookieSyncManager;
import android.webkit.URLUtil;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.actionbarsherlock.C0126R;

final class cf extends WebViewClient {
    String f2797a;
    final /* synthetic */ Website239800 f2798b;

    private cf(Website239800 website239800) {
        this.f2798b = website239800;
        this.f2797a = "";
    }

    public final void onLoadResource(WebView webView, String str) {
    }

    public final void onPageFinished(WebView webView, String str) {
        this.f2798b.f2564f = false;
        this.f2798b.m3856b();
        CookieSyncManager.getInstance().sync();
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f2798b.f2564f = true;
        this.f2798b.m3855a();
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        if (!(str == null || str.equals(""))) {
            Uri parse = Uri.parse(str);
            str2 = null;
            if (parse != null) {
                str2 = parse.getScheme();
            }
            Website239800 website239800 = this.f2798b;
            if (be.m3946a(str) && be.m3947b(this.f2798b, str)) {
                return true;
            }
            if (str2 != null) {
                if (str2.equals("tel")) {
                    try {
                        this.f2798b.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
                        this.f2797a = str;
                        return true;
                    } catch (Exception e) {
                        Toast.makeText(this.f2798b.getApplicationContext(), C0126R.string.dialer_not_available, 0).show();
                        return true;
                    }
                } else if (str2.equals("mailto") || str2.equals("geo") || str2.equals("market")) {
                    try {
                        this.f2798b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        this.f2797a = str;
                        return true;
                    } catch (Exception e2) {
                        webView.loadUrl(str);
                        this.f2797a = str;
                        return true;
                    }
                } else if (str2.equals("vnd.youtube")) {
                    try {
                        this.f2798b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        this.f2797a = str;
                        return true;
                    } catch (Exception e3) {
                        webView.loadUrl(str);
                        this.f2797a = str;
                        return true;
                    }
                }
            }
        }
        if (this.f2798b.f2562d) {
            try {
                if (URLUtil.isAssetUrl(str)) {
                    webView.loadUrl(str);
                    this.f2797a = str;
                    return true;
                }
                try {
                    be.m3944a(webView.getContext(), str);
                    this.f2797a = str;
                    return true;
                } catch (ActivityNotFoundException e4) {
                    webView.loadUrl(str);
                    this.f2797a = str;
                    return true;
                }
            } catch (Exception e5) {
                webView.loadUrl(str);
                this.f2797a = str;
                return true;
            }
        } else if (str.equals("file:///android_asset/webkit/")) {
            return false;
        } else {
            if (str.equals("about:blank")) {
                webView.loadUrl(this.f2797a);
                str2 = this.f2797a;
            } else {
                webView.loadUrl(str);
                this.f2797a = str;
            }
            return true;
        }
    }
}
