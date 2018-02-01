package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;

@TargetApi(11)
@aqv
public class kc extends WebChromeClient {
    private final jf f6398a;

    public kc(jf jfVar) {
        this.f6398a = jfVar;
    }

    private static Context m5881a(WebView webView) {
        if (!(webView instanceof jf)) {
            return webView.getContext();
        }
        jf jfVar = (jf) webView;
        Context e = jfVar.mo2157e();
        return e == null ? jfVar.getContext() : e;
    }

    private final boolean m5882a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            if (!(this.f6398a == null || this.f6398a.mo2163k() == null || this.f6398a.mo2163k().f6294h == null)) {
                zzw com_google_android_gms_ads_internal_zzw = this.f6398a.mo2163k().f6294h;
                if (!(com_google_android_gms_ads_internal_zzw == null || com_google_android_gms_ads_internal_zzw.zzcq())) {
                    com_google_android_gms_ads_internal_zzw.zzs(new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(str3).length()).append("window.").append(str).append("('").append(str3).append("')").toString());
                    return false;
                }
            }
            Builder builder = new Builder(context);
            builder.setTitle(str2);
            if (z) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                View textView = new TextView(context);
                textView.setText(str3);
                View editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builder.setView(linearLayout).setPositiveButton(17039370, new ki(jsPromptResult, editText)).setNegativeButton(17039360, new kh(jsPromptResult)).setOnCancelListener(new kg(jsPromptResult)).create().show();
                return true;
            }
            builder.setMessage(str3).setPositiveButton(17039370, new kf(jsResult)).setNegativeButton(17039360, new ke(jsResult)).setOnCancelListener(new kd(jsResult)).create().show();
            return true;
        } catch (Throwable e) {
            id.m5371a("Fail to display Dialog.", e);
            return true;
        }
    }

    protected final void m5883a(View view, int i, CustomViewCallback customViewCallback) {
        zzm h = this.f6398a.mo2160h();
        if (h == null) {
            id.m5370a("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        h.zza(view, customViewCallback);
        h.setRequestedOrientation(i);
    }

    public final void onCloseWindow(WebView webView) {
        if (webView instanceof jf) {
            zzm h = ((jf) webView).mo2160h();
            if (h == null) {
                id.m5370a("Tried to close an AdWebView not associated with an overlay.");
                return;
            } else {
                h.close();
                return;
            }
        }
        id.m5370a("Tried to close a WebView that wasn't an AdWebView.");
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        message = new StringBuilder((String.valueOf(message).length() + 19) + String.valueOf(sourceId).length()).append("JS: ").append(message).append(" (").append(sourceId).append(":").append(consoleMessage.lineNumber()).append(")").toString();
        if (message.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (kj.f6406a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                id.m5372a(6);
                break;
            case 2:
                id.m5370a(message);
                break;
            case 3:
            case 4:
                id.m5372a(4);
                break;
            case 5:
                id.m5372a(3);
                break;
            default:
                id.m5372a(4);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.f6398a.mo2163k());
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(Math.min(131072, j4) + j, 1048576);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        if (callback != null) {
            boolean z;
            zzbv.zzea();
            if (!gb.m5458a(this.f6398a.getContext(), this.f6398a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzbv.zzea();
                if (!gb.m5458a(this.f6398a.getContext(), this.f6398a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        zzm h = this.f6398a.mo2160h();
        if (h == null) {
            id.m5370a("Could not get ad overlay when hiding custom view.");
        } else {
            h.zzml();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m5882a(m5881a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m5882a(m5881a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m5882a(m5881a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m5882a(m5881a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        long j3 = 131072 + j;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        m5883a(view, -1, customViewCallback);
    }
}
