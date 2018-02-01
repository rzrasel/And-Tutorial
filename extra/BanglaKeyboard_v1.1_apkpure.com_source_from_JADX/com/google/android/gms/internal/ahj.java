package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.p056a.C1401c;
import com.google.android.gms.p056a.C1402d;
import com.google.android.gms.p056a.C1403e;

@aqv
public final class ahj extends C1402d<agf> {
    public ahj() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final agc m4538a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        Throwable e;
        try {
            IBinder a = ((agf) m3586a(context)).mo1824a(C1401c.m3584a((Object) context), C1401c.m3584a((Object) frameLayout), C1401c.m3584a((Object) frameLayout2));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof agc ? (agc) queryLocalInterface : new age(a);
        } catch (RemoteException e2) {
            e = e2;
            id.m5371a("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (C1403e e3) {
            e = e3;
            id.m5371a("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    protected final /* synthetic */ Object mo1713a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof agf ? (agf) queryLocalInterface : new agg(iBinder);
    }
}
