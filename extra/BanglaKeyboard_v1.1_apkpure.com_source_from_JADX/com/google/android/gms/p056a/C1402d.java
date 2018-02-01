package com.google.android.gms.p056a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C1528p;
import com.google.android.gms.common.internal.C1516t;

public abstract class C1402d<T> {
    private final String f3916a;
    private T f3917b;

    public C1402d(String str) {
        this.f3916a = str;
    }

    public final T m3586a(Context context) {
        if (this.f3917b == null) {
            C1516t.m3860a((Object) context);
            Context b = C1528p.m3915b(context);
            if (b == null) {
                throw new C1403e("Could not get remote context.");
            }
            try {
                this.f3917b = mo1713a((IBinder) b.getClassLoader().loadClass(this.f3916a).newInstance());
            } catch (Throwable e) {
                throw new C1403e("Could not load creator class.", e);
            } catch (Throwable e2) {
                throw new C1403e("Could not instantiate creator.", e2);
            } catch (Throwable e22) {
                throw new C1403e("Could not access creator.", e22);
            }
        }
        return this.f3917b;
    }

    public abstract T mo1713a(IBinder iBinder);
}
