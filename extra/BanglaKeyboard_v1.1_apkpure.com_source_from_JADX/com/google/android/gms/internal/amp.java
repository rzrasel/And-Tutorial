package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p056a.C1398a.C1399a;
import java.util.List;

public abstract class amp extends tc implements amo {
    public amp() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        String a;
        IInterface d;
        boolean j;
        switch (i) {
            case 2:
                a = mo1921a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 3:
                List b = mo1923b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            case 4:
                a = mo1925c();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 5:
                d = mo1927d();
                parcel2.writeNoException();
                uc.m6694a(parcel2, d);
                return true;
            case 6:
                a = mo1928e();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 7:
                double f = mo1929f();
                parcel2.writeNoException();
                parcel2.writeDouble(f);
                return true;
            case 8:
                a = mo1930g();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 9:
                a = mo1931h();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 10:
                mo1932i();
                parcel2.writeNoException();
                return true;
            case 11:
                mo1922a(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                mo1924b(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 13:
                j = mo1933j();
                parcel2.writeNoException();
                uc.m6696a(parcel2, j);
                return true;
            case 14:
                j = mo1934k();
                parcel2.writeNoException();
                uc.m6696a(parcel2, j);
                return true;
            case 15:
                Parcelable l = mo1935l();
                parcel2.writeNoException();
                uc.m6699b(parcel2, l);
                return true;
            case 16:
                mo1926c(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 17:
                d = mo1936m();
                parcel2.writeNoException();
                uc.m6694a(parcel2, d);
                return true;
            case 18:
                d = mo1937n();
                parcel2.writeNoException();
                uc.m6694a(parcel2, d);
                return true;
            case 19:
                d = mo1938o();
                parcel2.writeNoException();
                uc.m6694a(parcel2, d);
                return true;
            case 20:
                d = mo1939p();
                parcel2.writeNoException();
                uc.m6694a(parcel2, d);
                return true;
            default:
                return false;
        }
    }
}
