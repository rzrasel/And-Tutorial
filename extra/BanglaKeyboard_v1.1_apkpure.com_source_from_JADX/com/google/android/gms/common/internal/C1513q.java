package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.lm;

public final class C1513q {
    private static Object f4579a = new Object();
    private static boolean f4580b;
    private static String f4581c;
    private static int f4582d;

    public static int m3856a(Context context) {
        synchronized (f4579a) {
            if (f4580b) {
            } else {
                f4580b = true;
                try {
                    Bundle bundle = lm.m5976a(context).m5973a(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                    } else {
                        f4581c = bundle.getString("com.google.app.id");
                        f4582d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (Throwable e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
        return f4582d;
    }
}
