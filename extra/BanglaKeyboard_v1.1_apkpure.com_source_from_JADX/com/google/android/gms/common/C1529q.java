package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.google.android.gms.common.internal.C1516t;

public class C1529q {
    private static C1529q f4633a;
    private final Context f4634b;

    private C1529q(Context context) {
        this.f4634b = context.getApplicationContext();
    }

    static C1497i m3917a(PackageInfo packageInfo, C1497i... c1497iArr) {
        int i = 0;
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C1522j c1522j = new C1522j(packageInfo.signatures[0].toByteArray());
        while (i < c1497iArr.length) {
            if (c1497iArr[i].equals(c1522j)) {
                return c1497iArr[i];
            }
            i++;
        }
        return null;
    }

    public static C1529q m3918a(Context context) {
        C1516t.m3860a((Object) context);
        synchronized (C1529q.class) {
            if (f4633a == null) {
                C1494h.m3807a(context);
                f4633a = new C1529q(context);
            }
        }
        return f4633a;
    }
}
