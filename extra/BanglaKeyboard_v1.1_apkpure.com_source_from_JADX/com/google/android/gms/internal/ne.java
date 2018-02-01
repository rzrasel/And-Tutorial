package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ne extends nf {
    private static final String f6701s = ne.class.getSimpleName();
    Info f6702q;

    private ne(Context context) {
        super(context, "");
    }

    public static ne m6052a(Context context) {
        nf.m6043a(context, true);
        return new ne(context);
    }

    public static String m6053a(String str, String str2) {
        return lr.m5989a(str, str2);
    }

    protected final kz mo2205a(Context context, View view) {
        return null;
    }

    protected final void mo2208a(np npVar, kz kzVar, kw kwVar) {
        if (!npVar.f6736j) {
            nf.m6044a(mo2209b(npVar, kzVar, kwVar));
        } else if (this.f6702q != null) {
            String id = this.f6702q.getId();
            if (!TextUtils.isEmpty(id)) {
                kzVar.f6442M = pd.m6373a(id);
                kzVar.f6443N = Integer.valueOf(5);
                kzVar.f6444O = Boolean.valueOf(this.f6702q.isLimitAdTrackingEnabled());
            }
            this.f6702q = null;
        }
    }

    protected final List<Callable<Void>> mo2209b(np npVar, kz kzVar, kw kwVar) {
        List<Callable<Void>> arrayList = new ArrayList();
        if (npVar.f6729c == null) {
            return arrayList;
        }
        np npVar2 = npVar;
        arrayList.add(new rd(npVar2, "o7w7nD7659+FI5Gilkma9hcgrpF/prpHxl2mnzxedqbbyjgIpTwyk4wm6GfrdKne", "jmFYtmBsx6R0EkdxirPelCZXWeKwTC3D/yN9KFqdR9U=", kzVar, npVar.m6090d()));
        return arrayList;
    }
}
