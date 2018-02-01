package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public abstract class agi extends tc implements agh {
    public agi() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        IInterface j;
        String a;
        switch (i) {
            case 2:
                j = mo1766j();
                parcel2.writeNoException();
                uc.m6694a(parcel2, j);
                break;
            case 3:
                a = mo1753a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 4:
                List b = mo1756b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                break;
            case 5:
                a = mo1758c();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 6:
                j = mo1760d();
                parcel2.writeNoException();
                uc.m6694a(parcel2, j);
                break;
            case 7:
                a = mo1761e();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 8:
                double f = mo1762f();
                parcel2.writeNoException();
                parcel2.writeDouble(f);
                break;
            case 9:
                a = mo1763g();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 10:
                a = mo1764h();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 11:
                Parcelable n = mo1770n();
                parcel2.writeNoException();
                uc.m6699b(parcel2, n);
                break;
            case 12:
                mo1773q();
                parcel2.writeNoException();
                break;
            case 13:
                j = mo1765i();
                parcel2.writeNoException();
                uc.m6694a(parcel2, j);
                break;
            case 14:
                mo1754a((Bundle) uc.m6693a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                boolean b2 = mo1757b((Bundle) uc.m6693a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                uc.m6696a(parcel2, b2);
                break;
            case 16:
                mo1759c((Bundle) uc.m6693a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 17:
                j = mo1772p();
                parcel2.writeNoException();
                uc.m6694a(parcel2, j);
                break;
            default:
                return false;
        }
        return true;
    }
}
