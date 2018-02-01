package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p056a.C1401c;
import com.google.android.gms.p056a.C1402d;

@aqv
public final class acl extends C1402d<abt> {
    public acl() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    protected final /* synthetic */ Object mo1713a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof abt ? (abt) queryLocalInterface : new abu(iBinder);
    }

    public final abq m4138b(Context context) {
        try {
            IBinder a = ((abt) m3586a(context)).mo1697a(C1401c.m3584a((Object) context));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof abq ? (abq) queryLocalInterface : new abs(a);
        } catch (Throwable e) {
            id.m5371a("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (Throwable e2) {
            id.m5371a("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }
}
