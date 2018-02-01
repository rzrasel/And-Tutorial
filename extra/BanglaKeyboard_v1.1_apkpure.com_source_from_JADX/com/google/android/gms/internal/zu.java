package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p056a.C1401c;
import com.google.android.gms.p056a.C1402d;
import com.google.android.gms.p056a.C1403e;

@aqv
public final class zu extends C1402d<abf> {
    public zu() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final abc m7084a(Context context, zzjb com_google_android_gms_internal_zzjb, String str, amc com_google_android_gms_internal_amc, int i) {
        try {
            IBinder a = ((abf) m3586a(context)).mo1696a(C1401c.m3584a((Object) context), com_google_android_gms_internal_zzjb, str, com_google_android_gms_internal_amc, i);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof abc ? (abc) queryLocalInterface : new abe(a);
        } catch (RemoteException e) {
            id.m5372a(3);
            return null;
        } catch (C1403e e2) {
            id.m5372a(3);
            return null;
        }
    }

    protected final /* synthetic */ Object mo1713a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof abf ? (abf) queryLocalInterface : new abg(iBinder);
    }
}
