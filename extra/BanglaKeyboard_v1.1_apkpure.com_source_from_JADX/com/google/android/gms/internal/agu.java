package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class agu extends tc implements agt {
    public agu() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        agh com_google_android_gms_internal_agh;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_agh = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
            com_google_android_gms_internal_agh = queryLocalInterface instanceof agh ? (agh) queryLocalInterface : new agj(readStrongBinder);
        }
        mo1860a(com_google_android_gms_internal_agh);
        parcel2.writeNoException();
        return true;
    }
}
