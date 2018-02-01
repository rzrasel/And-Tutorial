package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebView;

final class yf implements Runnable {
    final /* synthetic */ xw f7495a;
    final /* synthetic */ WebView f7496b;
    final /* synthetic */ boolean f7497c;
    final /* synthetic */ yd f7498d;
    private ValueCallback<String> f7499e = new yg(this);

    yf(yd ydVar, xw xwVar, WebView webView, boolean z) {
        this.f7498d = ydVar;
        this.f7495a = xwVar;
        this.f7496b = webView;
        this.f7497c = z;
    }

    public final void run() {
        if (this.f7496b.getSettings().getJavaScriptEnabled()) {
            try {
                this.f7496b.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f7499e);
            } catch (Throwable th) {
                this.f7499e.onReceiveValue("");
            }
        }
    }
}
