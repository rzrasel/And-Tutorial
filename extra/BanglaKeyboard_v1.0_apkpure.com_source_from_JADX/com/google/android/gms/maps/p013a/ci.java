package com.google.android.gms.maps.p013a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.C0247f;
import com.google.android.gms.common.C0250h;
import com.google.android.gms.internal.je;
import com.google.android.gms.maps.model.C0488l;
import com.google.android.gms.p007a.C0207q;

public class ci {
    private static Context f2091a;
    private static ai f2092b;

    public static ai m2947a(Context context) {
        je.m2473a((Object) context);
        if (f2092b != null) {
            return f2092b;
        }
        int a = C0250h.m1002a(context);
        switch (a) {
            case 0:
                ci.class.getSimpleName();
                f2092b = aj.m2883a((IBinder) ci.m2949a(ci.m2950b(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
                try {
                    f2092b.mo1037a(C0207q.m863a(ci.m2950b(context).getResources()), 4452000);
                    return f2092b;
                } catch (RemoteException e) {
                    throw new C0488l(e);
                }
            default:
                throw new C0247f(a);
        }
    }

    private static Object m2948a(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + cls.getName());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of " + cls.getName());
        }
    }

    private static Object m2949a(ClassLoader classLoader, String str) {
        try {
            return ci.m2948a(((ClassLoader) je.m2473a((Object) classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class " + str);
        }
    }

    private static Context m2950b(Context context) {
        if (f2091a == null) {
            f2091a = C0250h.m1011c(context);
        }
        return f2091a;
    }
}
