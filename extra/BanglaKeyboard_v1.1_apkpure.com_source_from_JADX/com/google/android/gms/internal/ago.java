package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.p056a.C1398a;
import java.util.ArrayList;
import java.util.List;

@aqv
public final class ago extends NativeContentAd {
    private final agl f5094a;
    private final List<Image> f5095b = new ArrayList();
    private final agb f5096c;
    private final VideoController f5097d = new VideoController();
    private final AdChoicesInfo f5098e;

    public ago(agl com_google_android_gms_internal_agl) {
        agb com_google_android_gms_internal_agb;
        AdChoicesInfo adChoicesInfo = null;
        this.f5094a = com_google_android_gms_internal_agl;
        try {
            List b = this.f5094a.mo1756b();
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
                                this.f5095b.add(new agb(com_google_android_gms_internal_afy));
                            }
                        }
                    }
                    com_google_android_gms_internal_afy = null;
                    if (com_google_android_gms_internal_afy != null) {
                        this.f5095b.add(new agb(com_google_android_gms_internal_afy));
                    }
                }
            }
        } catch (RemoteException e) {
            id.m5372a(6);
        }
        try {
            afy d = this.f5094a.mo1779d();
            com_google_android_gms_internal_agb = d != null ? new agb(d) : null;
        } catch (RemoteException e2) {
            id.m5372a(6);
            com_google_android_gms_internal_agb = null;
        }
        this.f5096c = com_google_android_gms_internal_agb;
        try {
            if (this.f5094a.mo1785j() != null) {
                adChoicesInfo = new afx(this.f5094a.mo1785j());
            }
        } catch (RemoteException e3) {
            id.m5372a(6);
        }
        this.f5098e = adChoicesInfo;
    }

    private final C1398a m4516a() {
        try {
            return this.f5094a.mo1783h();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final void destroy() {
        try {
            this.f5094a.mo1786n();
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    public final AdChoicesInfo getAdChoicesInfo() {
        return this.f5098e;
    }

    public final CharSequence getAdvertiser() {
        try {
            return this.f5094a.mo1781f();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final CharSequence getBody() {
        try {
            return this.f5094a.mo1777c();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final CharSequence getCallToAction() {
        try {
            return this.f5094a.mo1780e();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            return this.f5094a.mo1784i();
        } catch (Throwable e) {
            id.m5371a("Failed to get extras", e);
            return null;
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.f5094a.mo1774a();
        } catch (RemoteException e) {
            id.m5372a(6);
            return null;
        }
    }

    public final List<Image> getImages() {
        return this.f5095b;
    }

    public final Image getLogo() {
        return this.f5096c;
    }

    public final VideoController getVideoController() {
        try {
            if (this.f5094a.mo1782g() != null) {
                this.f5097d.zza(this.f5094a.mo1782g());
            }
        } catch (RemoteException e) {
            id.m5372a(6);
        }
        return this.f5097d;
    }

    public final void performClick(Bundle bundle) {
        try {
            this.f5094a.mo1775a(bundle);
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f5094a.mo1776b(bundle);
        } catch (RemoteException e) {
            id.m5372a(6);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f5094a.mo1778c(bundle);
        } catch (RemoteException e) {
            id.m5372a(6);
        }
    }

    protected final /* synthetic */ Object zzbf() {
        return m4516a();
    }
}
