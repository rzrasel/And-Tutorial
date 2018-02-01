package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p056a.C1401c;
import com.google.android.gms.p056a.C1402d;

@aqv
public final class aoh extends C1402d<aol> {
    public aoh() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final aoi m5006a(Activity activity) {
        try {
            IBinder a = ((aol) m3586a((Context) activity)).mo2005a(C1401c.m3584a((Object) activity));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof aoi ? (aoi) queryLocalInterface : new aok(a);
        } catch (Throwable e) {
            id.m5371a("Could not create remote AdOverlay.", e);
            return null;
        } catch (Throwable e2) {
            id.m5371a("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    protected final /* synthetic */ Object mo1713a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof aol ? (aol) queryLocalInterface : new aom(iBinder);
    }
}
