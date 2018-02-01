package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

final class yg implements ValueCallback<String> {
    private /* synthetic */ yf f7500a;

    yg(yf yfVar) {
        this.f7500a = yfVar;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        String str = (String) obj;
        yd ydVar = this.f7500a.f7498d;
        xw xwVar = this.f7500a.f7495a;
        WebView webView = this.f7500a.f7496b;
        boolean z = this.f7500a.f7497c;
        synchronized (xwVar.f7438a) {
            xwVar.f7441d--;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (ydVar.f7488l || TextUtils.isEmpty(webView.getTitle())) {
                    xwVar.m7000a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    xwVar.m7000a(new StringBuilder((String.valueOf(title).length() + 1) + String.valueOf(optString).length()).append(title).append("\n").append(optString).toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (xwVar.m7001a()) {
                ydVar.f7479c.m7007b(xwVar);
            }
        } catch (JSONException e) {
            id.m5372a(3);
        } catch (Throwable th) {
            id.m5372a(3);
            ydVar.f7480d.mo2018a(th, "ContentFetchTask.processWebViewContent");
        }
    }
}
