package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@aqv
public final class gx {
    String f6173a = "";
    private final Object f6174b = new Object();
    private String f6175c = "";
    private String f6176d = "";
    private boolean f6177e = false;

    private final String m5568a(Context context) {
        String str;
        synchronized (this.f6174b) {
            if (TextUtils.isEmpty(this.f6175c)) {
                zzbv.zzea();
                this.f6175c = gb.m5468b(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.f6175c)) {
                    zzbv.zzea();
                    this.f6175c = gb.m5435a();
                    zzbv.zzea();
                    gb.m5479c(context, "debug_signals_id.txt", this.f6175c);
                }
            }
            str = this.f6175c;
        }
        return str;
    }

    static void m5569a(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            gb.f6131a.post(new gy(context, str, z, z2));
        } else {
            id.m5372a(4);
        }
    }

    private static String m5570d(Context context, String str, String str2) {
        String str3;
        String valueOf;
        Map hashMap = new HashMap();
        hashMap.put("User-Agent", zzbv.zzea().m5502a(context, str2));
        he heVar = new he(context);
        il a = he.m5582a(0, str, hashMap, null);
        try {
            return (String) a.get((long) ((Integer) zzbv.zzen().m4217a(ado.cz)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            str3 = "Timeout while retriving a response from: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            id.m5372a(6);
            a.cancel(true);
        } catch (InterruptedException e2) {
            str3 = "Interrupted while retriving a response from: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            id.m5372a(6);
            a.cancel(true);
        } catch (Exception e3) {
            str3 = "Error retriving a response from: ";
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str3.concat(valueOf2);
            } else {
                valueOf2 = new String(str3);
            }
            id.m5372a(6);
        }
        return null;
    }

    public final Uri m5571a(Context context, String str, String str2, String str3) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", m5568a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final String m5572a() {
        String str;
        synchronized (this.f6174b) {
            str = this.f6176d;
        }
        return str;
    }

    final boolean m5573a(Context context, String str, String str2) {
        Object d = m5570d(context, m5571a(context, (String) zzbv.zzen().m4217a(ado.cw), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            id.m5372a(3);
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d.trim());
            String optString = jSONObject.optString("gct");
            this.f6173a = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
            synchronized (this.f6174b) {
                this.f6176d = optString;
            }
            return true;
        } catch (Throwable e) {
            id.m5371a("Fail to get in app preview response json.", e);
            return false;
        }
    }

    public final boolean m5574b() {
        boolean z;
        synchronized (this.f6174b) {
            z = this.f6177e;
        }
        return z;
    }

    final boolean m5575b(Context context, String str, String str2) {
        Object d = m5570d(context, m5571a(context, (String) zzbv.zzen().m4217a(ado.cx), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            id.m5372a(3);
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d.trim()).optString("debug_mode"));
            synchronized (this.f6174b) {
                this.f6177e = equals;
            }
            return equals;
        } catch (Throwable e) {
            id.m5371a("Fail to get debug mode response json.", e);
            return false;
        }
    }

    final void m5576c(Context context, String str, String str2) {
        zzbv.zzea();
        gb.m5447a(context, m5571a(context, (String) zzbv.zzen().m4217a(ado.cv), str, str2));
    }
}
