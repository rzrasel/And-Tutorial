package com.google.android.gms.ads.p008a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import com.google.android.gms.common.C0247f;
import com.google.android.gms.common.C0250h;
import com.google.android.gms.common.C0262j;
import com.google.android.gms.internal.nl;
import com.google.android.gms.internal.nm;
import java.io.IOException;

public final class C0212a {
    public static C0213b m899a(Context context, C0262j c0262j) {
        try {
            nl a = nm.m2684a(c0262j.m1084a());
            C0213b c0213b = new C0213b(a.mo968a(), a.mo971a(true));
            try {
                context.unbindService(c0262j);
            } catch (IllegalArgumentException e) {
            }
            return c0213b;
        } catch (RemoteException e2) {
            throw new IOException("Remote exception");
        } catch (InterruptedException e3) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            try {
                context.unbindService(c0262j);
            } catch (IllegalArgumentException e4) {
            }
        }
    }

    public static C0262j m900a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            try {
                C0250h.m1009b(context);
                Object c0262j = new C0262j();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, c0262j, 1)) {
                    return c0262j;
                }
                throw new IOException("Connection failure");
            } catch (Throwable e) {
                throw new IOException(e);
            }
        } catch (NameNotFoundException e2) {
            throw new C0247f(9);
        }
    }
}
