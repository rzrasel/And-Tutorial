package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;

@aqv
public class aab {
    private abk f4705a;
    private final Object f4706b = new Object();
    private final zu f4707c;
    private final zt f4708d;
    private final acl f4709e;
    private final ahj f4710f;
    private final cl f4711g;
    private final aoh f4712h;

    abstract class C1571a<T> {
        private /* synthetic */ aab f4704a;

        C1571a(aab com_google_android_gms_internal_aab) {
            this.f4704a = com_google_android_gms_internal_aab;
        }

        protected abstract T mo1684a();

        protected abstract T mo1685a(abk com_google_android_gms_internal_abk);

        protected final T m3993b() {
            T t = null;
            abk a = this.f4704a.m3999b();
            if (a == null) {
                id.m5370a("ClientApi class cannot be loaded.");
            } else {
                try {
                    t = mo1685a(a);
                } catch (Throwable e) {
                    id.m5371a("Cannot invoke local loader using ClientApi class", e);
                }
            }
            return t;
        }

        protected final T m3994c() {
            try {
                return mo1684a();
            } catch (Throwable e) {
                id.m5371a("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public aab(zu zuVar, zt ztVar, acl com_google_android_gms_internal_acl, ahj com_google_android_gms_internal_ahj, cl clVar, aoh com_google_android_gms_internal_aoh) {
        this.f4707c = zuVar;
        this.f4708d = ztVar;
        this.f4709e = com_google_android_gms_internal_acl;
        this.f4710f = com_google_android_gms_internal_ahj;
        this.f4711g = clVar;
        this.f4712h = com_google_android_gms_internal_aoh;
    }

    private static abk m3995a() {
        try {
            Object newInstance = aab.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return abl.asInterface((IBinder) newInstance);
            }
            id.m5370a("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Throwable e) {
            id.m5371a("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    public static <T> T m3997a(Context context, boolean z, C1571a<T> c1571a) {
        boolean z2 = true;
        if (!z) {
            aak.m4022a();
            if (!hz.m5627c(context)) {
                id.m5372a(3);
                z = true;
            }
        }
        aak.m4022a();
        int e = hz.m5629e(context);
        aak.m4022a();
        if (e <= hz.m5628d(context)) {
            z2 = z;
        }
        T b;
        if (z2) {
            b = c1571a.m3993b();
            return b == null ? c1571a.m3994c() : b;
        } else {
            b = c1571a.m3994c();
            return b == null ? c1571a.m3993b() : b;
        }
    }

    static /* synthetic */ void m3998a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        aak.m4022a();
        hz.m5617a(context, "gmob-apps", bundle);
    }

    private final abk m3999b() {
        abk com_google_android_gms_internal_abk;
        synchronized (this.f4706b) {
            if (this.f4705a == null) {
                this.f4705a = m3995a();
            }
            com_google_android_gms_internal_abk = this.f4705a;
        }
        return com_google_android_gms_internal_abk;
    }
}
