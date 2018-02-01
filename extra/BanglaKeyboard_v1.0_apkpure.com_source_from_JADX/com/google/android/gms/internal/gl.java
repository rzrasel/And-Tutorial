package com.google.android.gms.internal;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
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

public class gl extends WebChromeClient {
    private final ge f1489a;

    public gl(ge geVar) {
        this.f1489a = geVar;
    }

    private static boolean m2129a(Context context, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        Builder builder = new Builder(context);
        builder.setTitle(str);
        if (z) {
            View linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            View textView = new TextView(context);
            textView.setText(str2);
            View editText = new EditText(context);
            editText.setText(str3);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builder.setView(linearLayout).setPositiveButton(17039370, new gr(jsPromptResult, editText)).setNegativeButton(17039360, new gq(jsPromptResult)).setOnCancelListener(new gp(jsPromptResult)).create().show();
        } else {
            builder.setMessage(str2).setPositiveButton(17039370, new go(jsResult)).setNegativeButton(17039360, new gn(jsResult)).setOnCancelListener(new gm(jsResult)).create().show();
        }
        return true;
    }

    protected final void m2130a(View view, int i, CustomViewCallback customViewCallback) {
        cl d = this.f1489a.m2095d();
        if (d == null) {
            gb.m2069a("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        d.m1808a(view, customViewCallback);
        d.m1805a(i);
    }

    public final void onCloseWindow(WebView webView) {
        if (webView instanceof ge) {
            cl d = ((ge) webView).m2095d();
            if (d == null) {
                gb.m2069a("Tried to close an AdWebView not associated with an overlay.");
                return;
            } else {
                d.m1804a();
                return;
            }
        }
        gb.m2069a("Tried to close a WebView that wasn't an AdWebView.");
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        switch (gs.f1497a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                gb.m2071a(6);
                break;
            case 2:
                gb.m2069a(str);
                break;
            case 3:
            case 4:
                gb.m2071a(4);
                break;
            case 5:
                gb.m2071a(3);
                break;
            default:
                gb.m2071a(4);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.f1489a.m2097f());
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

    public final void onHideCustomView() {
        cl d = this.f1489a.m2095d();
        if (d == null) {
            gb.m2069a("Could not get ad overlay when hiding custom view.");
        } else {
            d.m1813c();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m2129a(webView.getContext(), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m2129a(webView.getContext(), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m2129a(webView.getContext(), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m2129a(webView.getContext(), str, str2, str3, null, jsPromptResult, true);
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
        m2130a(view, -1, customViewCallback);
    }
}
