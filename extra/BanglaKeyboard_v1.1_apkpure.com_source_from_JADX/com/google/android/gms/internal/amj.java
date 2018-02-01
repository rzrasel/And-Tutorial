package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class amj extends tc implements ami {
    public amj() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo1877a();
                break;
            case 2:
                mo1882b();
                break;
            case 3:
                mo1878a(parcel.readInt());
                break;
            case 4:
                mo1883c();
                break;
            case 5:
                mo1884d();
                break;
            case 6:
                mo1885e();
                break;
            case 7:
                aml com_google_android_gms_internal_aml;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    com_google_android_gms_internal_aml = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    com_google_android_gms_internal_aml = queryLocalInterface instanceof aml ? (aml) queryLocalInterface : new amn(readStrongBinder);
                }
                mo1880a(com_google_android_gms_internal_aml);
                break;
            case 8:
                mo1886f();
                break;
            case 9:
                mo1881a(parcel.readString(), parcel.readString());
                break;
            case 10:
                mo1879a(agq.m4363a(parcel.readStrongBinder()), parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
