package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzbv;

@TargetApi(21)
public final class go extends gn {
    public final jg mo2098a(jf jfVar, boolean z) {
        return new kn(jfVar, z);
    }

    public final CookieManager mo2116c(Context context) {
        try {
            return CookieManager.getInstance();
        } catch (Throwable e) {
            id.m5372a(6);
            zzbv.zzee().m5336a(e, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final int mo2106e() {
        return 16974374;
    }
}
