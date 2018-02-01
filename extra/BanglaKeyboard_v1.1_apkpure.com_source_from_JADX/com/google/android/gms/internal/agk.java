package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.p056a.C1398a;
import java.util.ArrayList;
import java.util.List;

@aqv
public final class agk extends NativeAppInstallAd {
    private final agh f5089a;
    private final List<Image> f5090b = new ArrayList();
    private final agb f5091c;
    private final VideoController f5092d = new VideoController();
    private final AdChoicesInfo f5093e;

    public agk(agh com_google_android_gms_internal_agh) {
        agb com_google_android_gms_internal_agb;
        AdChoicesInfo adChoicesInfo = null;
        this.f5089a = com_google_android_gms_internal_agh;
        try {
            List b = this.f5089a.mo1756b();
            if (b != null) {
                for (Object next : b) {
                    afy com_google_android_gms_internal_afy;
                    Object next2;
                    if (next2 instanceof IBinder) {
                        IBinder iBinder = (IBinder) next2;
                        if (iBinder != null) {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                            if (queryLocalInterface instanceof afy) {
                                com_google_android_gms_internal_afy = (afy) queryLocalInterface;
                            } else {
                                next2 = new aga(iBinder);
                            }
                            if (com_google_android_gms_internal_afy != null) {
                                this.f5090b.add(new agb(com_google_android_gms_internal_afy));
                            }
                        }
                    }
                    com_google_android_gms_internal_afy = null;
                    if (com_google_android_gms_internal_afy != null) {
                        this.f5090b.add(new agb(com_google_android_gms_internal_afy));
                    }
                }
            }
        } catch (RemoteException e) {
            id.m5372a(6);
        }
        try {
            afy d = this.f5089a.mo1760d();
            com_google_android_gms_internal_agb = d != null ? new agb(d) : null;
        } catch (RemoteException e2) {
            id.m5372a(6);
            com_google_android_gms_internal_agb = null;
        }
        this.f5091c = com_google_android_gms_internal_agb;
        try {
            if (this.f5089a.mo1772p() != null) {
                adChoicesInfo = new afx(this.f5089a.mo1772p());
            }
        } catch (RemoteException e3) {
            id.m5372a(6);
        }
        this.f5093e = adChoicesInfo;
    }

    private final C1398a m4501a() {
        try {
            return this.f5089a.mo1766j();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.f5089a.mo1773q();
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    public final AdChoicesInfo getAdChoicesInfo() {
        return this.f5093e;
    }

    public final CharSequence getBody() {
        try {
            return this.f5089a.mo1758c();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final CharSequence getCallToAction() {
        try {
            return this.f5089a.mo1761e();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            return this.f5089a.mo1770n();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.f5089a.mo1753a();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final Image getIcon() {
        return this.f5091c;
    }

    public final List<Image> getImages() {
        return this.f5090b;
    }

    public final CharSequence getPrice() {
        try {
            return this.f5089a.mo1764h();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final Double getStarRating() {
        Double d = null;
        try {
            double f = this.f5089a.mo1762f();
            if (f != -1.0d) {
                d = Double.valueOf(f);
            }
        } catch (RemoteException e) {
            id.m5372a(6);
        }
        return d;
    }

    public final CharSequence getStore() {
        try {
            return this.f5089a.mo1763g();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.f5089a.mo1765i() != null) {
                this.f5092d.zza(this.f5089a.mo1765i());
            }
        } catch (RemoteException e) {
            id.m5372a(6);
        }
        return this.f5092d;
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f5089a.mo1754a(bundle);
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f5089a.mo1757b(bundle);
        } catch (RemoteException e) {
            id.m5372a(6);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f5089a.mo1759c(bundle);
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    protected final /* synthetic */ Object zzbf() {
        return m4501a();
    }
}
