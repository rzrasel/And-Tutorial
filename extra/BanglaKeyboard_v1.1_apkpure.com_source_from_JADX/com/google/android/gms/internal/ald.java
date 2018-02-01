package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;

@aqv
final class ald {
    private static final akz f5270a = akz.m4669a();
    private static final float f5271b = ((Float) zzbv.zzen().m4217a(ado.aQ)).floatValue();
    private static final long f5272c = ((Long) zzbv.zzen().m4217a(ado.aO)).longValue();
    private static final float f5273d = ((Float) zzbv.zzen().m4217a(ado.aR)).floatValue();
    private static final long f5274e = ((Long) zzbv.zzen().m4217a(ado.aP)).longValue();

    private static int m4675a(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }

    static boolean m4676a() {
        int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i2 = f5270a.f5260d;
        int i3 = f5270a.f5261e;
        int i4 = f5270a.f5258b + f5270a.f5259c;
        int a = (i2 >= 16 || f5274e == 0) ? f5273d != 0.0f ? ((int) (f5273d * ((float) i2))) + 1 : ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : m4675a(f5274e, i2);
        if (i3 <= a) {
            if (i2 < 16 && f5272c != 0) {
                i = m4675a(f5272c, i2);
            } else if (f5271b != 0.0f) {
                i = (int) (f5271b * ((float) i2));
            }
            if (i4 <= i) {
                return true;
            }
        }
        return false;
    }
}
