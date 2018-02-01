package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class C0525j {
    private static C0525j f2366f;
    private final C0527n f2367a;
    private final Context f2368b;
    private final C0517b f2369c;
    private final ConcurrentMap f2370d;
    private final be f2371e;

    private C0525j(Context context, C0527n c0527n, C0517b c0517b) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.f2368b = context.getApplicationContext();
        this.f2367a = c0527n;
        this.f2370d = new ConcurrentHashMap();
        this.f2369c = c0517b;
        this.f2369c.m3671a(new C0526k(this));
        this.f2369c.m3671a(new aw(this.f2368b));
        this.f2371e = new be();
    }

    public static C0525j m3717a(Context context) {
        C0525j c0525j;
        synchronized (C0525j.class) {
            if (f2366f == null) {
                if (context == null) {
                    C0535t.m3730a();
                    throw new NullPointerException();
                }
                f2366f = new C0525j(context, new C0528l(), new C0517b(new bg(context)));
            }
            c0525j = f2366f;
        }
        return c0525j;
    }

    static /* synthetic */ void m3718a(C0525j c0525j, String str) {
        for (bc a : c0525j.f2370d.keySet()) {
            a.m3677a(str);
        }
    }

    final synchronized boolean m3719a(Uri uri) {
        boolean z;
        ae a = ae.m3620a();
        if (a.m3622a(uri)) {
            String d = a.m3625d();
            switch (C0529m.f2373a[a.m3623b().ordinal()]) {
                case 1:
                    for (bc bcVar : this.f2370d.keySet()) {
                        if (bcVar.m3678b().equals(d)) {
                            bcVar.m3679c();
                            bcVar.m3676a();
                        }
                    }
                    break;
                case 2:
                case 3:
                    for (bc bcVar2 : this.f2370d.keySet()) {
                        if (bcVar2.m3678b().equals(d)) {
                            a.m3624c();
                            bcVar2.m3679c();
                            bcVar2.m3676a();
                        } else {
                            String str;
                            if (bcVar2.f2344b) {
                                C0535t.m3730a();
                                str = "";
                            } else {
                                str = bcVar2.f2343a.m3680a();
                            }
                            if (str != null) {
                                bcVar2.m3679c();
                                bcVar2.m3676a();
                            }
                        }
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
