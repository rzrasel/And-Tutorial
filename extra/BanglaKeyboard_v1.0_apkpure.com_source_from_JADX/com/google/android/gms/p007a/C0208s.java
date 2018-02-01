package com.google.android.gms.p007a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C0250h;
import com.google.android.gms.internal.je;

public abstract class C0208s {
    private final String f410a;
    private Object f411b;

    public C0208s(String str) {
        this.f410a = str;
    }

    protected final Object m865a(Context context) {
        if (this.f411b == null) {
            je.m2473a((Object) context);
            Context c = C0250h.m1011c(context);
            if (c == null) {
                throw new C0209t("Could not get remote context.");
            }
            try {
                this.f411b = mo868a((IBinder) c.getClassLoader().loadClass(this.f410a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new C0209t("Could not load creator class.");
            } catch (InstantiationException e2) {
                throw new C0209t("Could not instantiate creator.");
            } catch (IllegalAccessException e3) {
                throw new C0209t("Could not access creator.");
            }
        }
        return this.f411b;
    }

    protected abstract Object mo868a(IBinder iBinder);
}
