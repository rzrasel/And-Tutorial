package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ado;
import com.google.android.gms.internal.id;
import com.google.android.gms.internal.vs;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class ad extends AsyncTask<Void, Void, String> {
    private /* synthetic */ zzbp f3966a;

    private ad(zzbp com_google_android_gms_ads_internal_zzbp) {
        this.f3966a = com_google_android_gms_ads_internal_zzbp;
    }

    private final String m3607a() {
        Throwable e;
        try {
            this.f3966a.f4382h = (vs) this.f3966a.f4377c.get(((Long) zzbv.zzen().m4217a(ado.ci)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            id.m5371a("Failed to load ad data", e);
        } catch (ExecutionException e3) {
            e = e3;
            id.m5371a("Failed to load ad data", e);
        } catch (TimeoutException e4) {
            id.m5370a("Timed out waiting for ad data");
        }
        return this.f3966a.m3770a();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m3607a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f3966a.f4380f != null && str != null) {
            this.f3966a.f4380f.loadUrl(str);
        }
    }
}
