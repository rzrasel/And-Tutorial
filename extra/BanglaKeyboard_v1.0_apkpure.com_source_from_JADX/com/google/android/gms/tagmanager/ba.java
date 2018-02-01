package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.el;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

final class ba {
    private static ad m3673a(ad adVar) {
        try {
            return new ad(ay.m3657a(URLEncoder.encode(ay.m3658a((el) adVar.f2273a), "UTF-8").replaceAll("\\+", "%20")), adVar.f2274b);
        } catch (UnsupportedEncodingException e) {
            C0535t.m3732b();
            return adVar;
        }
    }

    static ad m3674a(ad adVar, int... iArr) {
        int length = iArr.length;
        int i = 0;
        ad adVar2 = adVar;
        while (i < length) {
            ad a;
            int i2 = iArr[i];
            if (ay.m3661c((el) adVar2.f2273a) instanceof String) {
                switch (i2) {
                    case 12:
                        a = m3673a(adVar2);
                        break;
                    default:
                        "Unsupported Value Escaping: " + i2;
                        C0535t.m3730a();
                        a = adVar2;
                        break;
                }
            }
            C0535t.m3730a();
            a = adVar2;
            i++;
            adVar2 = a;
        }
        return adVar2;
    }
}
