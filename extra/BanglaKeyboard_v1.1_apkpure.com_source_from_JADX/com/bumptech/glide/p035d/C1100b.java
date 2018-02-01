package com.bumptech.glide.p035d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.ArrayList;
import java.util.List;

public final class C1100b {
    private final Context f3300a;

    public C1100b(Context context) {
        this.f3300a = context;
    }

    private static C1099a m2970a(String str) {
        Object newInstance;
        try {
            try {
                newInstance = Class.forName(str).newInstance();
                if (newInstance instanceof C1099a) {
                    return (C1099a) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (Throwable e) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for " + newInstance, e);
            } catch (Throwable e2) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for " + newInstance, e2);
            }
        } catch (Throwable e3) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e3);
        }
    }

    public final List<C1099a> m2971a() {
        List<C1099a> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f3300a.getPackageManager().getApplicationInfo(this.f3300a.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(C1100b.m2970a(str));
                    }
                }
            }
            return arrayList;
        } catch (Throwable e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
