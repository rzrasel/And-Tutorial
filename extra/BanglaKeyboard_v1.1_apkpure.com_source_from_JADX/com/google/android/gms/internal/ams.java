package com.google.android.gms.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p056a.C1398a.C1399a;
import java.util.List;

public abstract class ams extends tc implements amr {
    public ams() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        String a;
        IInterface d;
        boolean h;
        switch (i) {
            case 2:
                a = mo1940a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 3:
                List b = mo1942b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            case 4:
                a = mo1944c();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 5:
                d = mo1946d();
                parcel2.writeNoException();
                uc.m6694a(parcel2, d);
                return true;
            case 6:
                a = mo1947e();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 7:
                a = mo1948f();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 8:
                mo1949g();
                parcel2.writeNoException();
                return true;
            case 9:
                mo1941a(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                mo1943b(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                h = mo1950h();
                parcel2.writeNoException();
                uc.m6696a(parcel2, h);
                return true;
            case 12:
                h = mo1951i();
                parcel2.writeNoException();
                uc.m6696a(parcel2, h);
                return true;
            case 13:
                Parcelable j = mo1952j();
                parcel2.writeNoException();
                uc.m6699b(parcel2, j);
                return true;
            case 14:
                mo1945c(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                d = mo1953k();
                parcel2.writeNoException();
                uc.m6694a(parcel2, d);
                return true;
            case 16:
                d = mo1954l();
                parcel2.writeNoException();
                uc.m6694a(parcel2, d);
                return true;
            case 19:
                d = mo1955m();
                parcel2.writeNoException();
                uc.m6694a(parcel2, d);
                return true;
            case 20:
                d = mo1956n();
                parcel2.writeNoException();
                uc.m6694a(parcel2, d);
                return true;
            default:
                return false;
        }
    }
}
