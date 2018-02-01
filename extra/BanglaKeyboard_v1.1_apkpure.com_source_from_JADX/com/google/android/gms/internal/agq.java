package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a.C1399a;
import java.util.List;

public abstract class agq extends tc implements agp {
    public agq() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static agp m4363a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof agp ? (agp) queryLocalInterface : new agr(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        String a;
        IInterface b;
        switch (i) {
            case 1:
                a = mo1787a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 2:
                b = mo1791b(parcel.readString());
                parcel2.writeNoException();
                uc.m6694a(parcel2, b);
                return true;
            case 3:
                List a2 = mo1788a();
                parcel2.writeNoException();
                parcel2.writeStringList(a2);
                return true;
            case 4:
                a = mo1768l();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 5:
                mo1793c(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo1794d();
                parcel2.writeNoException();
                return true;
            case 7:
                b = mo1792c();
                parcel2.writeNoException();
                uc.m6694a(parcel2, b);
                return true;
            case 8:
                mo1796f();
                parcel2.writeNoException();
                return true;
            case 9:
                b = mo1795e();
                parcel2.writeNoException();
                uc.m6694a(parcel2, b);
                return true;
            case 10:
                boolean a3 = mo1789a(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                uc.m6696a(parcel2, a3);
                return true;
            case 11:
                b = mo1790b();
                parcel2.writeNoException();
                uc.m6694a(parcel2, b);
                return true;
            default:
                return false;
        }
    }
}
