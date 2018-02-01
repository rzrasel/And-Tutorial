package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class C1573r extends tc implements C1572q {
    public C1573r() {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C1655w c1655w = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                Parcelable a = mo2002a((zzaak) uc.m6693a(parcel, zzaak.CREATOR));
                parcel2.writeNoException();
                uc.m6699b(parcel2, a);
                break;
            case 2:
                C1587t c1654v;
                zzaak com_google_android_gms_internal_zzaak = (zzaak) uc.m6693a(parcel, zzaak.CREATOR);
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    c1654v = queryLocalInterface instanceof C1587t ? (C1587t) queryLocalInterface : new C1654v(readStrongBinder);
                }
                mo2003a(com_google_android_gms_internal_zzaak, c1654v);
                parcel2.writeNoException();
                break;
            case 3:
                zzabd com_google_android_gms_internal_zzabd = (zzabd) uc.m6693a(parcel, zzabd.CREATOR);
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonResponseListener");
                    c1655w = queryLocalInterface instanceof C1655w ? (C1655w) queryLocalInterface : new C1656x(readStrongBinder);
                }
                mo2004a(com_google_android_gms_internal_zzabd, c1655w);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
