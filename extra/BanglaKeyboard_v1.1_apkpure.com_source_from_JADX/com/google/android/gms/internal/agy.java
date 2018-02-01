package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class agy extends tc implements agx {
    public agy() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        agl com_google_android_gms_internal_agl;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_agl = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            com_google_android_gms_internal_agl = queryLocalInterface instanceof agl ? (agl) queryLocalInterface : new agn(readStrongBinder);
        }
        mo1861a(com_google_android_gms_internal_agl);
        parcel2.writeNoException();
        return true;
    }
}
