package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a.C1399a;

public abstract class vy extends tc implements vw {
    public vy() {
        attachInterface(this, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        String a;
        boolean a2;
        IInterface a3;
        switch (i) {
            case 1:
                a = mo2296a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 2:
                mo2300a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                a2 = mo2301a(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                uc.m6696a(parcel2, a2);
                return true;
            case 4:
                a2 = mo2304b(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                uc.m6696a(parcel2, a2);
                return true;
            case 5:
                mo2299a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                a3 = mo2295a(C1399a.m3581a(parcel.readStrongBinder()), C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                uc.m6694a(parcel2, a3);
                return true;
            case 7:
                a = mo2305c(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 8:
                a = mo2297a(C1399a.m3581a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 9:
                mo2306d(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                a3 = mo2303b(C1399a.m3581a(parcel.readStrongBinder()), C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                uc.m6694a(parcel2, a3);
                return true;
            case 11:
                a2 = mo2302a(parcel.readString(), uc.m6697a(parcel));
                parcel2.writeNoException();
                uc.m6696a(parcel2, a2);
                return true;
            case 12:
                a = mo2298a(C1399a.m3581a(parcel.readStrongBinder()), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            default:
                return false;
        }
    }
}
