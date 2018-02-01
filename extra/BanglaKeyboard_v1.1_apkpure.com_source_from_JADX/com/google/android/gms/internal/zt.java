package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p056a.C1401c;
import com.google.android.gms.p056a.C1402d;

@aqv
public final class zt extends C1402d<aba> {
    public zt() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final aax m7082a(Context context, String str, amc com_google_android_gms_internal_amc) {
        try {
            IBinder a = ((aba) m3586a(context)).mo1695a(C1401c.m3584a((Object) context), str, com_google_android_gms_internal_amc);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof aax ? (aax) queryLocalInterface : new aaz(a);
        } catch (Throwable e) {
            id.m5371a("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (Throwable e2) {
            id.m5371a("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }

    protected final /* synthetic */ Object mo1713a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof aba ? (aba) queryLocalInterface : new abb(iBinder);
    }
}
