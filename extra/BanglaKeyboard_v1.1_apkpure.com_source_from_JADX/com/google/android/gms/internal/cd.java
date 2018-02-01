package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a.C1399a;

public abstract class cd extends tc implements cc {
    public cd() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static cc m4165a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return queryLocalInterface instanceof cc ? (cc) queryLocalInterface : new ce(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo1722a((zzadp) uc.m6693a(parcel, zzadp.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo1719a();
                parcel2.writeNoException();
                break;
            case 3:
                ch chVar;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    chVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    chVar = queryLocalInterface instanceof ch ? (ch) queryLocalInterface : new cj(readStrongBinder);
                }
                mo1721a(chVar);
                parcel2.writeNoException();
                break;
            case 4:
                mo1723a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 5:
                boolean b = mo1726b();
                parcel2.writeNoException();
                uc.m6696a(parcel2, b);
                break;
            case 6:
                mo1727c();
                parcel2.writeNoException();
                break;
            case 7:
                mo1729d();
                parcel2.writeNoException();
                break;
            case 8:
                mo1730e();
                parcel2.writeNoException();
                break;
            case 9:
                mo1720a(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 10:
                mo1725b(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 11:
                mo1728c(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 12:
                String f = mo1731f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                break;
            case 34:
                mo1724a(uc.m6697a(parcel));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
