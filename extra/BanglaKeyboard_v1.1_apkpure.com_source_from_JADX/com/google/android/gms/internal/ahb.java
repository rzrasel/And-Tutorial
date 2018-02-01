package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ahb extends tc implements aha {
    public ahb() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        agp com_google_android_gms_internal_agp;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_agp = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            com_google_android_gms_internal_agp = queryLocalInterface instanceof agp ? (agp) queryLocalInterface : new agr(readStrongBinder);
        }
        mo1862a(com_google_android_gms_internal_agp, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
