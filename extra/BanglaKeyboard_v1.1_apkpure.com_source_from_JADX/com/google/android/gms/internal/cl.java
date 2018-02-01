package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p056a.C1401c;
import com.google.android.gms.p056a.C1402d;
import com.google.android.gms.p056a.C1403e;

@aqv
public final class cl extends C1402d<cf> {
    public cl() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public final cc m5198a(Context context, amc com_google_android_gms_internal_amc) {
        Throwable e;
        try {
            IBinder a = ((cf) m3586a(context)).mo2033a(C1401c.m3584a((Object) context), com_google_android_gms_internal_amc);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return queryLocalInterface instanceof cc ? (cc) queryLocalInterface : new ce(a);
        } catch (RemoteException e2) {
            e = e2;
            id.m5371a("Could not get remote RewardedVideoAd.", e);
            return null;
        } catch (C1403e e3) {
            e = e3;
            id.m5371a("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    protected final /* synthetic */ Object mo1713a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof cf ? (cf) queryLocalInterface : new cg(iBinder);
    }
}
