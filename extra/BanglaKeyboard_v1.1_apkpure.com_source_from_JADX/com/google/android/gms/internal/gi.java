package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final class gi implements Callable<Boolean> {
    private /* synthetic */ Context f6146a;
    private /* synthetic */ WebSettings f6147b;

    gi(Context context, WebSettings webSettings) {
        this.f6146a = context;
        this.f6147b = webSettings;
    }

    public final /* synthetic */ Object call() {
        if (this.f6146a.getCacheDir() != null) {
            this.f6147b.setAppCachePath(this.f6146a.getCacheDir().getAbsolutePath());
            this.f6147b.setAppCacheMaxSize(0);
            this.f6147b.setAppCacheEnabled(true);
        }
        this.f6147b.setDatabasePath(this.f6146a.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        this.f6147b.setDatabaseEnabled(true);
        this.f6147b.setDomStorageEnabled(true);
        this.f6147b.setDisplayZoomControls(false);
        this.f6147b.setBuiltInZoomControls(true);
        this.f6147b.setSupportZoom(true);
        this.f6147b.setAllowContentAccess(false);
        return Boolean.valueOf(true);
    }
}
