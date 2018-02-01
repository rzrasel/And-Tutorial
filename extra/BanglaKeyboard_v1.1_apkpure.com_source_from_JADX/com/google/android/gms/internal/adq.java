package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.zzbv;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@aqv
public final class adq {
    boolean f4916a;
    String f4917b;
    Map<String, String> f4918c;
    Context f4919d = null;
    String f4920e = null;

    public adq(Context context, String str) {
        this.f4919d = context;
        this.f4920e = str;
        this.f4916a = ((Boolean) zzbv.zzen().m4217a(ado.f4868G)).booleanValue();
        this.f4917b = (String) zzbv.zzen().m4217a(ado.f4869H);
        this.f4918c = new LinkedHashMap();
        this.f4918c.put("s", "gmob_sdk");
        this.f4918c.put("v", "3");
        this.f4918c.put("os", VERSION.RELEASE);
        this.f4918c.put("sdk", VERSION.SDK);
        zzbv.zzea();
        this.f4918c.put("device", gb.m5478c());
        this.f4918c.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map map = this.f4918c;
        String str2 = "is_lite_sdk";
        zzbv.zzea();
        map.put(str2, gb.m5497j(context) ? "1" : "0");
        Future a = zzbv.zzek().m5125a(this.f4919d);
        try {
            a.get();
            this.f4918c.put("network_coarse", Integer.toString(((be) a.get()).f5772n));
            this.f4918c.put("network_fine", Integer.toString(((be) a.get()).f5773o));
        } catch (Throwable e) {
            zzbv.zzee().m5336a(e, "CsiConfiguration.CsiConfiguration");
        }
    }
}
