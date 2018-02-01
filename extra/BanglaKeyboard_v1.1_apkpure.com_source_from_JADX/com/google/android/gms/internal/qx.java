package com.google.android.gms.internal;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

public final class qx extends rs {
    public qx(np npVar, String str, String str2, kz kzVar, int i) {
        super(npVar, str, str2, kzVar, i, 49);
    }

    protected final void mo2232a() {
        this.b.f6435F = Integer.valueOf(2);
        try {
            this.b.f6435F = Integer.valueOf(((Boolean) this.c.invoke(null, new Object[]{this.a.f6728b})).booleanValue() ? 1 : 0);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
