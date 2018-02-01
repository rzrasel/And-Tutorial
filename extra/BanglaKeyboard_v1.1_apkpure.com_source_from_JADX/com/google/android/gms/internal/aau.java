package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class aau extends tc implements aat {
    public aau() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        String mediationAdapterClassName;
        switch (i) {
            case 1:
                zzd((zzix) uc.m6693a(parcel, zzix.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                break;
            case 3:
                boolean isLoading = isLoading();
                parcel2.writeNoException();
                uc.m6696a(parcel2, isLoading);
                break;
            case 4:
                mediationAdapterClassName = zzch();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                break;
            case 5:
                zza((zzix) uc.m6693a(parcel, zzix.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
