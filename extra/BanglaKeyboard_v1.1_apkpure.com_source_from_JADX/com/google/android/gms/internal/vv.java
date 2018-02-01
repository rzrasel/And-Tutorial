package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.C1493g;
import com.google.android.gms.p056a.C1401c;
import com.google.android.gms.p056a.C1402d;
import com.google.android.gms.p056a.C1403e;

@aqv
public final class vv extends C1402d<wa> {
    private static final vv f7323a = new vv();

    private vv() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    public static vw m6875a(String str, Context context) {
        C1493g.m3805a();
        if (C1493g.m3804a(context) == 0) {
            vw b = f7323a.m6876b(str, context);
            if (b != null) {
                return b;
            }
        }
        return new vu(str, context);
    }

    private final vw m6876b(String str, Context context) {
        try {
            IBinder a = ((wa) m3586a(context)).mo2307a(str, C1401c.m3584a((Object) context));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            return queryLocalInterface instanceof vw ? (vw) queryLocalInterface : new vz(a);
        } catch (RemoteException e) {
            return null;
        } catch (C1403e e2) {
            return null;
        }
    }

    protected final /* synthetic */ Object mo1713a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return queryLocalInterface instanceof wa ? (wa) queryLocalInterface : new wb(iBinder);
    }
}
