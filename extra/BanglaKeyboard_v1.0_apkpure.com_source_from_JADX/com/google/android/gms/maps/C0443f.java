package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C0247f;
import com.google.android.gms.internal.je;
import com.google.android.gms.maps.model.C0478b;
import com.google.android.gms.maps.model.C0488l;
import com.google.android.gms.maps.model.p014a.C0455d;
import com.google.android.gms.maps.p013a.C0412a;
import com.google.android.gms.maps.p013a.ai;
import com.google.android.gms.maps.p013a.ci;

public final class C0443f {
    public static int m3172a(Context context) {
        je.m2473a((Object) context);
        try {
            ai a = ci.m2947a(context);
            try {
                Object a2 = a.mo1033a();
                if (C0438a.f2101a == null) {
                    C0438a.f2101a = (C0412a) je.m2473a(a2);
                }
                a2 = a.mo1039b();
                if (C0478b.f2227a == null) {
                    C0478b.f2227a = (C0455d) je.m2473a(a2);
                }
                return 0;
            } catch (RemoteException e) {
                throw new C0488l(e);
            }
        } catch (C0247f e2) {
            return e2.f508a;
        }
    }
}
