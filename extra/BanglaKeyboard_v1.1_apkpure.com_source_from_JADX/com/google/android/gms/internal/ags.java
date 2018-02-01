package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.p056a.C1401c;
import java.util.List;

@aqv
public final class ags implements NativeCustomTemplateAd {
    final agp f5099a;
    private final MediaView f5100b;
    private final VideoController f5101c = new VideoController();

    public ags(agp com_google_android_gms_internal_agp) {
        Context context;
        MediaView mediaView;
        MediaView mediaView2 = null;
        this.f5099a = com_google_android_gms_internal_agp;
        try {
            context = (Context) C1401c.m3585a(com_google_android_gms_internal_agp.mo1795e());
        } catch (NullPointerException e) {
            id.m5372a(6);
            context = null;
            if (context != null) {
                mediaView = new MediaView(context);
                try {
                    if (!this.f5099a.mo1789a(C1401c.m3584a((Object) mediaView))) {
                        mediaView = null;
                    }
                    mediaView2 = mediaView;
                } catch (RemoteException e2) {
                    id.m5372a(6);
                }
            }
            this.f5100b = mediaView2;
        } catch (RemoteException e3) {
            id.m5372a(6);
            context = null;
            if (context != null) {
                mediaView = new MediaView(context);
                if (this.f5099a.mo1789a(C1401c.m3584a((Object) mediaView))) {
                    mediaView = null;
                }
                mediaView2 = mediaView;
            }
            this.f5100b = mediaView2;
        }
        if (context != null) {
            mediaView = new MediaView(context);
            if (this.f5099a.mo1789a(C1401c.m3584a((Object) mediaView))) {
                mediaView = null;
            }
            mediaView2 = mediaView;
        }
        this.f5100b = mediaView2;
    }

    public final void destroy() {
        try {
            this.f5099a.mo1796f();
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.f5099a.mo1788a();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final String getCustomTemplateId() {
        try {
            return this.f5099a.mo1768l();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final Image getImage(String str) {
        try {
            afy b = this.f5099a.mo1791b(str);
            if (b != null) {
                return new agb(b);
            }
        } catch (RemoteException e) {
            id.m5372a(6);
        }
        return null;
    }

    public final CharSequence getText(String str) {
        try {
            return this.f5099a.mo1787a(str);
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            abv c = this.f5099a.mo1792c();
            if (c != null) {
                this.f5101c.zza(c);
            }
        } catch (RemoteException e) {
            id.m5372a(6);
        }
        return this.f5101c;
    }

    public final MediaView getVideoMediaView() {
        return this.f5100b;
    }

    public final void performClick(String str) {
        try {
            this.f5099a.mo1793c(str);
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    public final void recordImpression() {
        try {
            this.f5099a.mo1794d();
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }
}
