package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class ng extends nf {
    private ng(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static ng m6057a(String str, Context context, boolean z) {
        nf.m6043a(context, z);
        return new ng(context, str, z);
    }

    protected final List<Callable<Void>> mo2209b(np npVar, kz kzVar, kw kwVar) {
        if (npVar.f6729c == null || !this.r) {
            return super.mo2209b(npVar, kzVar, kwVar);
        }
        int d = npVar.m6090d();
        List<Callable<Void>> arrayList = new ArrayList();
        arrayList.addAll(super.mo2209b(npVar, kzVar, kwVar));
        arrayList.add(new rd(npVar, "o7w7nD7659+FI5Gilkma9hcgrpF/prpHxl2mnzxedqbbyjgIpTwyk4wm6GfrdKne", "jmFYtmBsx6R0EkdxirPelCZXWeKwTC3D/yN9KFqdR9U=", kzVar, d));
        return arrayList;
    }
}
