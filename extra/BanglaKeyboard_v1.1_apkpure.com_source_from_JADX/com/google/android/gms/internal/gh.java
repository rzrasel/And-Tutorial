package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.util.Set;

@TargetApi(11)
public class gh extends gg {
    public jg mo2098a(jf jfVar, boolean z) {
        return new kk(jfVar, z);
    }

    public final Set<String> mo2099a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    public final boolean mo2096a(Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    public boolean mo2100a(Context context, WebSettings webSettings) {
        super.mo2100a(context, webSettings);
        return ((Boolean) ht.m5600a(new gi(context, webSettings))).booleanValue();
    }

    public final boolean mo2101a(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    public final boolean mo2102b(View view) {
        view.setLayerType(0, null);
        return true;
    }

    public WebChromeClient mo2103c(jf jfVar) {
        return new kc(jfVar);
    }

    public final boolean mo2104c(View view) {
        view.setLayerType(1, null);
        return true;
    }
}
