package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.C0250h;
import com.google.android.gms.internal.je;
import com.google.android.gms.p007a.C0207q;
import com.google.android.gms.plus.C0502c;

public final class C0511e {
    private static Context f2256a;
    private static C0507a f2257b;

    public static View m3594a(Context context, int i, int i2, String str, int i3) {
        if (str != null) {
            return (View) C0207q.m864a(C0511e.m3595a(context).mo1313a(C0207q.m863a((Object) context), i, i2, str, i3));
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            return new C0502c(context, i);
        }
    }

    private static C0507a m3595a(Context context) {
        je.m2473a((Object) context);
        if (f2257b == null) {
            if (f2256a == null) {
                Context c = C0250h.m1011c(context);
                f2256a = c;
                if (c == null) {
                    throw new C0512f("Could not get remote context.");
                }
            }
            try {
                f2257b = C0508b.m3590a((IBinder) f2256a.getClassLoader().loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
            } catch (ClassNotFoundException e) {
                throw new C0512f("Could not load creator class.");
            } catch (InstantiationException e2) {
                throw new C0512f("Could not instantiate creator.");
            } catch (IllegalAccessException e3) {
                throw new C0512f("Could not access creator.");
            }
        }
        return f2257b;
    }
}
