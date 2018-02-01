package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C1538g;

public final class ll {
    Context f6571a;

    public ll(Context context) {
        this.f6571a = context;
    }

    public final ApplicationInfo m5973a(String str, int i) {
        return this.f6571a.getPackageManager().getApplicationInfo(str, i);
    }

    public final boolean m5974a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return lk.m5972a(this.f6571a);
        }
        if (C1538g.m3947g()) {
            String nameForUid = this.f6571a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.f6571a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }

    public final PackageInfo m5975b(String str, int i) {
        return this.f6571a.getPackageManager().getPackageInfo(str, i);
    }
}
