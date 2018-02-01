package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.p056a.C1398a.C1399a;

public abstract class abr extends tc implements abq {
    public abr() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                initialize();
                break;
            case 2:
                setAppVolume(parcel.readFloat());
                break;
            case 3:
                zzt(parcel.readString());
                break;
            case 4:
                setAppMuted(uc.m6697a(parcel));
                break;
            case 5:
                zzc(C1399a.m3581a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                zzc(parcel.readString(), C1399a.m3581a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
