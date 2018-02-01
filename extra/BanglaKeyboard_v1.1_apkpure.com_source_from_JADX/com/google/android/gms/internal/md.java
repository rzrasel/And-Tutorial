package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import java.security.GeneralSecurityException;

final class md {
    static op f6594a;

    static boolean m6013a() {
        if (f6594a != null) {
            return true;
        }
        String str = (String) zzbv.zzen().m4217a(ado.bw);
        if (str.length() == 0) {
            return false;
        }
        try {
            try {
                or a = ov.m6306a(lp.m5985a(str, true));
                pu.m6438a();
                f6594a = pu.m6437a(a);
                return f6594a != null;
            } catch (GeneralSecurityException e) {
                return false;
            }
        } catch (IllegalArgumentException e2) {
            return false;
        }
    }
}
