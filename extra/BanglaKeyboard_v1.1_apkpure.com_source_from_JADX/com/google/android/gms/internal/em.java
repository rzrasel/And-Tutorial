package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;

@aqv
public final class em {
    public long f6049a = -1;
    public long f6050b = -1;
    public int f6051c = -1;
    public int f6052d = -1;
    public long f6053e = 0;
    public final Object f6054f = new Object();
    public int f6055g = 0;
    public int f6056h = 0;
    private String f6057i;

    public em(String str) {
        this.f6057i = str;
    }

    private static boolean m5365a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            id.m5372a(4);
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            id.m5372a(4);
            return false;
        } catch (NameNotFoundException e) {
            id.m5370a("Fail to fetch AdActivity theme");
            id.m5372a(4);
            return false;
        }
    }

    public final Bundle m5366a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f6054f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f6057i);
            bundle.putLong("basets", this.f6050b);
            bundle.putLong("currts", this.f6049a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f6051c);
            bundle.putInt("preqs_in_session", this.f6052d);
            bundle.putLong("time_in_session", this.f6053e);
            bundle.putInt("pclick", this.f6055g);
            bundle.putInt("pimp", this.f6056h);
            bundle.putBoolean("support_transparent_background", m5365a(context));
        }
        return bundle;
    }
}
