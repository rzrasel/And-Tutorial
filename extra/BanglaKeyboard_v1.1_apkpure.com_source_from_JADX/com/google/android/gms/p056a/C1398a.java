package com.google.android.gms.p056a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.tc;

public interface C1398a extends IInterface {

    public static abstract class C1399a extends tc implements C1398a {
        public C1399a() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static C1398a m3581a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C1398a ? (C1398a) queryLocalInterface : new C1400b(iBinder);
        }
    }
}
