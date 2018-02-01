package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.lt;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;

@DynamiteApi
public class FlagProviderImpl extends lt {
    private boolean f4685a = false;
    private SharedPreferences f4686b;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        return !this.f4685a ? z : C1559b.m3983a(this.f4686b, str, Boolean.valueOf(z)).booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        return !this.f4685a ? i : C1561d.m3984a(this.f4686b, str, Integer.valueOf(i)).intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        return !this.f4685a ? j : C1563f.m3985a(this.f4686b, str, Long.valueOf(j)).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        return !this.f4685a ? str2 : C1565h.m3986a(this.f4686b, str, str2);
    }

    public void init(C1398a c1398a) {
        Context context = (Context) C1401c.m3585a(c1398a);
        if (!this.f4685a) {
            try {
                this.f4686b = C1567j.m3987a(context.createPackageContext("com.google.android.gms", 0));
                this.f4685a = true;
            } catch (NameNotFoundException e) {
            } catch (Exception e2) {
                String str = "FlagProviderImpl";
                String str2 = "Could not retrieve sdk flags, continuing with defaults: ";
                String valueOf = String.valueOf(e2.getMessage());
                Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
    }
}
