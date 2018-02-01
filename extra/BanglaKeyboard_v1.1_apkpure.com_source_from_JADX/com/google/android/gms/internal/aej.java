package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class aej extends tc implements aei {
    public aej() {
        attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        aef com_google_android_gms_internal_aef;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_aef = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
            com_google_android_gms_internal_aef = queryLocalInterface instanceof aef ? (aef) queryLocalInterface : new aeh(readStrongBinder);
        }
        mo1747a(com_google_android_gms_internal_aef);
        parcel2.writeNoException();
        return true;
    }
}
