package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.p008a.C0212a;
import com.google.android.gms.ads.p008a.C0213b;
import com.google.android.gms.common.C0247f;
import java.io.IOException;

public final class mr extends ma {
    private mr(Context context, ng ngVar, nh nhVar) {
        super(context, ngVar, nhVar);
    }

    public static mr m2625a(String str, Context context) {
        ng ghVar = new gh();
        ma.m2603a(str, context, ghVar);
        return new mr(context, ghVar, new nk());
    }

    private ms m2626d(Context context) {
        int i = 0;
        try {
            String str = "Calling this from your main thread can lead to deadlock";
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException(str);
            }
            String str2;
            C0213b a = C0212a.m899a(context, C0212a.m900a(context));
            String str3 = a.f415a;
            if (str3 == null || !str3.matches("^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$")) {
                str2 = str3;
            } else {
                byte[] bArr = new byte[16];
                int i2 = 0;
                while (i < str3.length()) {
                    if (i == 8 || i == 13 || i == 18 || i == 23) {
                        i++;
                    }
                    bArr[i2] = (byte) ((Character.digit(str3.charAt(i), 16) << 4) + Character.digit(str3.charAt(i + 1), 16));
                    i2++;
                    i += 2;
                }
                str2 = this.c.mo894a(bArr);
            }
            return new ms(this, str2, a.f416b);
        } catch (Throwable e) {
            throw new IOException(e);
        }
    }

    protected final void mo960b(Context context) {
        long j = 1;
        super.mo960b(context);
        try {
            ms d = m2626d(context);
            try {
                if (!d.f1951b) {
                    j = 0;
                }
                m2543a(28, j);
                String str = d.f1950a;
                if (str != null) {
                    m2544a(30, str);
                }
            } catch (IOException e) {
            }
        } catch (C0247f e2) {
        } catch (IOException e3) {
            m2543a(28, 1);
        }
    }
}
