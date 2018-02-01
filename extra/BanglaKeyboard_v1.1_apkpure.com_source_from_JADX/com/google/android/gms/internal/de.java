package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a.C1399a;

public abstract class de extends tc implements dd {
    public de() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static dd m5235a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof dd ? (dd) queryLocalInterface : new df(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo2056a(C1399a.m3581a(parcel.readStrongBinder()));
                break;
            case 2:
                mo2057a(C1399a.m3581a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                mo2059b(C1399a.m3581a(parcel.readStrongBinder()));
                break;
            case 4:
                mo2061c(C1399a.m3581a(parcel.readStrongBinder()));
                break;
            case 5:
                mo2062d(C1399a.m3581a(parcel.readStrongBinder()));
                break;
            case 6:
                mo2063e(C1399a.m3581a(parcel.readStrongBinder()));
                break;
            case 7:
                mo2058a(C1399a.m3581a(parcel.readStrongBinder()), (zzaek) uc.m6693a(parcel, zzaek.CREATOR));
                break;
            case 8:
                mo2064f(C1399a.m3581a(parcel.readStrongBinder()));
                break;
            case 9:
                mo2060b(C1399a.m3581a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                mo2065g(C1399a.m3581a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
