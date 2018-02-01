package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.ArrayList;
import java.util.List;

@aqv
public final class afx extends AdChoicesInfo {
    private final aft f5081a;
    private final List<Image> f5082b = new ArrayList();
    private String f5083c;

    public afx(aft com_google_android_gms_internal_aft) {
        this.f5081a = com_google_android_gms_internal_aft;
        try {
            this.f5083c = this.f5081a.mo1748a();
        } catch (RemoteException e) {
            id.m5372a(6);
            this.f5083c = "";
        }
        try {
            for (Object next : com_google_android_gms_internal_aft.mo1749b()) {
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
                            this.f5082b.add(new agb(com_google_android_gms_internal_afy));
                        }
                    }
                }
                com_google_android_gms_internal_afy = null;
                if (com_google_android_gms_internal_afy != null) {
                    this.f5082b.add(new agb(com_google_android_gms_internal_afy));
                }
            }
        } catch (RemoteException e2) {
            id.m5372a(6);
        }
    }

    public final List<Image> getImages() {
        return this.f5082b;
    }

    public final CharSequence getText() {
        return this.f5083c;
    }
}
