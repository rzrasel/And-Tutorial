package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.webkit.WebChromeClient;

@TargetApi(14)
public class gj extends gh {
    public final String mo2105a(SslError sslError) {
        return sslError.getUrl();
    }

    public final WebChromeClient mo2103c(jf jfVar) {
        return new kl(jfVar);
    }

    public int mo2106e() {
        return 1;
    }
}
