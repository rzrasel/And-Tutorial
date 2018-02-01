package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C0250h;
import com.google.android.gms.p007a.C0207q;
import com.google.android.gms.p007a.C0208s;

public final class C0397n extends C0208s {
    private static final C0397n f1960a = new C0397n();

    private C0397n() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public static C0398v m2658a(Context context, ak akVar, String str, br brVar) {
        if (C0250h.m1002a(context) == 0) {
            C0398v b = f1960a.m2659b(context, akVar, str, brVar);
            if (b != null) {
                return b;
            }
        }
        gb.m2071a(3);
        return new np(context, akVar, str, brVar, new dx());
    }

    private C0398v m2659b(Context context, ak akVar, String str, br brVar) {
        try {
            return C0399w.m2704a(((C0355y) m865a(context)).mo822a(C0207q.m863a((Object) context), akVar, str, brVar, 4452000));
        } catch (Throwable e) {
            gb.m2070a("Could not create remote AdManager.", e);
            return null;
        } catch (Throwable e2) {
            gb.m2070a("Could not create remote AdManager.", e2);
            return null;
        }
    }

    protected final /* synthetic */ Object mo868a(IBinder iBinder) {
        return C0406z.m2774a(iBinder);
    }
}
