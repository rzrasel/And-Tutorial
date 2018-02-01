package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;

public abstract class amg extends tc implements amf {
    public amg() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ami com_google_android_gms_internal_ami = null;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        C1398a a;
        zzjb com_google_android_gms_internal_zzjb;
        zzix com_google_android_gms_internal_zzix;
        String readString;
        IBinder readStrongBinder;
        ami com_google_android_gms_internal_ami2;
        IInterface queryLocalInterface;
        String readString2;
        zzix com_google_android_gms_internal_zzix2;
        boolean g;
        Parcelable j;
        switch (i) {
            case 1:
                a = C1399a.m3581a(parcel.readStrongBinder());
                com_google_android_gms_internal_zzjb = (zzjb) uc.m6693a(parcel, zzjb.CREATOR);
                com_google_android_gms_internal_zzix = (zzix) uc.m6693a(parcel, zzix.CREATOR);
                readString = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    com_google_android_gms_internal_ami2 = null;
                } else {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    com_google_android_gms_internal_ami2 = queryLocalInterface instanceof ami ? (ami) queryLocalInterface : new amk(readStrongBinder);
                }
                mo1902a(a, com_google_android_gms_internal_zzjb, com_google_android_gms_internal_zzix, readString, com_google_android_gms_internal_ami2);
                parcel2.writeNoException();
                break;
            case 2:
                queryLocalInterface = mo1895a();
                parcel2.writeNoException();
                uc.m6694a(parcel2, queryLocalInterface);
                break;
            case 3:
                C1398a a2 = C1399a.m3581a(parcel.readStrongBinder());
                zzix com_google_android_gms_internal_zzix3 = (zzix) uc.m6693a(parcel, zzix.CREATOR);
                readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    com_google_android_gms_internal_ami = queryLocalInterface2 instanceof ami ? (ami) queryLocalInterface2 : new amk(readStrongBinder2);
                }
                mo1898a(a2, com_google_android_gms_internal_zzix3, readString2, com_google_android_gms_internal_ami);
                parcel2.writeNoException();
                break;
            case 4:
                mo1907b();
                parcel2.writeNoException();
                break;
            case 5:
                mo1908c();
                parcel2.writeNoException();
                break;
            case 6:
                a = C1399a.m3581a(parcel.readStrongBinder());
                com_google_android_gms_internal_zzjb = (zzjb) uc.m6693a(parcel, zzjb.CREATOR);
                com_google_android_gms_internal_zzix = (zzix) uc.m6693a(parcel, zzix.CREATOR);
                readString = parcel.readString();
                String readString3 = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    com_google_android_gms_internal_ami = queryLocalInterface instanceof ami ? (ami) queryLocalInterface : new amk(readStrongBinder);
                }
                mo1903a(a, com_google_android_gms_internal_zzjb, com_google_android_gms_internal_zzix, readString, readString3, com_google_android_gms_internal_ami);
                parcel2.writeNoException();
                break;
            case 7:
                a = C1399a.m3581a(parcel.readStrongBinder());
                com_google_android_gms_internal_zzix2 = (zzix) uc.m6693a(parcel, zzix.CREATOR);
                readString2 = parcel.readString();
                readString = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    com_google_android_gms_internal_ami2 = null;
                } else {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    com_google_android_gms_internal_ami2 = queryLocalInterface instanceof ami ? (ami) queryLocalInterface : new amk(readStrongBinder);
                }
                mo1900a(a, com_google_android_gms_internal_zzix2, readString2, readString, com_google_android_gms_internal_ami2);
                parcel2.writeNoException();
                break;
            case 8:
                mo1909d();
                parcel2.writeNoException();
                break;
            case 9:
                mo1910e();
                parcel2.writeNoException();
                break;
            case 10:
                mo1899a(C1399a.m3581a(parcel.readStrongBinder()), (zzix) uc.m6693a(parcel, zzix.CREATOR), parcel.readString(), de.m5235a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                mo1904a((zzix) uc.m6693a(parcel, zzix.CREATOR), parcel.readString());
                parcel2.writeNoException();
                break;
            case 12:
                mo1911f();
                parcel2.writeNoException();
                break;
            case 13:
                g = mo1912g();
                parcel2.writeNoException();
                uc.m6696a(parcel2, g);
                break;
            case 14:
                a = C1399a.m3581a(parcel.readStrongBinder());
                com_google_android_gms_internal_zzix2 = (zzix) uc.m6693a(parcel, zzix.CREATOR);
                readString2 = parcel.readString();
                readString = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    com_google_android_gms_internal_ami2 = null;
                } else {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    com_google_android_gms_internal_ami2 = queryLocalInterface instanceof ami ? (ami) queryLocalInterface : new amk(readStrongBinder);
                }
                mo1901a(a, com_google_android_gms_internal_zzix2, readString2, readString, com_google_android_gms_internal_ami2, (zzot) uc.m6693a(parcel, zzot.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 15:
                queryLocalInterface = mo1913h();
                parcel2.writeNoException();
                uc.m6694a(parcel2, queryLocalInterface);
                break;
            case 16:
                queryLocalInterface = mo1914i();
                parcel2.writeNoException();
                uc.m6694a(parcel2, queryLocalInterface);
                break;
            case 17:
                j = mo1915j();
                parcel2.writeNoException();
                uc.m6699b(parcel2, j);
                break;
            case 18:
                j = mo1916k();
                parcel2.writeNoException();
                uc.m6699b(parcel2, j);
                break;
            case 19:
                j = mo1917l();
                parcel2.writeNoException();
                uc.m6699b(parcel2, j);
                break;
            case 20:
                mo1905a((zzix) uc.m6693a(parcel, zzix.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 21:
                mo1896a(C1399a.m3581a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 22:
                g = mo1918m();
                parcel2.writeNoException();
                uc.m6696a(parcel2, g);
                break;
            case 23:
                mo1897a(C1399a.m3581a(parcel.readStrongBinder()), de.m5235a(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 24:
                queryLocalInterface = mo1919n();
                parcel2.writeNoException();
                uc.m6694a(parcel2, queryLocalInterface);
                break;
            case 25:
                mo1906a(uc.m6697a(parcel));
                parcel2.writeNoException();
                break;
            case 26:
                queryLocalInterface = mo1920o();
                parcel2.writeNoException();
                uc.m6694a(parcel2, queryLocalInterface);
                break;
            default:
                return false;
        }
        return true;
    }
}
