package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.p056a.C1398a.C1399a;

public abstract class ahh extends tc implements ahg {
    public ahh() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo1864a(abd.zzf(parcel.readStrongBinder()), C1399a.m3581a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
