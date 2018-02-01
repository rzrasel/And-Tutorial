package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;

@aqv
public final class agb extends Image {
    private final afy f5085a;
    private final Drawable f5086b;
    private final Uri f5087c;
    private final double f5088d;

    public agb(afy com_google_android_gms_internal_afy) {
        Drawable drawable;
        double d;
        Uri uri = null;
        this.f5085a = com_google_android_gms_internal_afy;
        try {
            C1398a a = this.f5085a.mo1750a();
            if (a != null) {
                drawable = (Drawable) C1401c.m3585a(a);
                this.f5086b = drawable;
                uri = this.f5085a.mo1751b();
                this.f5087c = uri;
                d = 1.0d;
                d = this.f5085a.mo1752c();
                this.f5088d = d;
            }
        } catch (RemoteException e) {
            id.m5372a(6);
        }
        Object obj = uri;
        this.f5086b = drawable;
        try {
            uri = this.f5085a.mo1751b();
        } catch (RemoteException e2) {
            id.m5372a(6);
        }
        this.f5087c = uri;
        d = 1.0d;
        try {
            d = this.f5085a.mo1752c();
        } catch (RemoteException e3) {
            id.m5372a(6);
        }
        this.f5088d = d;
    }

    public final Drawable getDrawable() {
        return this.f5086b;
    }

    public final double getScale() {
        return this.f5088d;
    }

    public final Uri getUri() {
        return this.f5087c;
    }
}
