package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class abw extends tc implements abv {
    public abw() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static abv m4063a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof abv ? (abv) queryLocalInterface : new aby(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        boolean c;
        float f;
        switch (i) {
            case 1:
                mo1698a();
                parcel2.writeNoException();
                break;
            case 2:
                mo1701b();
                parcel2.writeNoException();
                break;
            case 3:
                mo1700a(uc.m6697a(parcel));
                parcel2.writeNoException();
                break;
            case 4:
                c = mo1702c();
                parcel2.writeNoException();
                uc.m6696a(parcel2, c);
                break;
            case 5:
                int d = mo1703d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                break;
            case 6:
                f = mo1705f();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                break;
            case 7:
                f = mo1706g();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                break;
            case 8:
                abz com_google_android_gms_internal_abz;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    com_google_android_gms_internal_abz = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    com_google_android_gms_internal_abz = queryLocalInterface instanceof abz ? (abz) queryLocalInterface : new acb(readStrongBinder);
                }
                mo1699a(com_google_android_gms_internal_abz);
                parcel2.writeNoException();
                break;
            case 9:
                f = mo1704e();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                break;
            case 10:
                c = mo1707h();
                parcel2.writeNoException();
                uc.m6696a(parcel2, c);
                break;
            default:
                return false;
        }
        return true;
    }
}
