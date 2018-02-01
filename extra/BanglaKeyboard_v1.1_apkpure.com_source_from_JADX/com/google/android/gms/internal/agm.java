package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public abstract class agm extends tc implements agl {
    public agm() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        IInterface h;
        String a;
        switch (i) {
            case 2:
                h = mo1783h();
                parcel2.writeNoException();
                uc.m6694a(parcel2, h);
                break;
            case 3:
                a = mo1774a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 4:
                List b = mo1756b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                break;
            case 5:
                a = mo1777c();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 6:
                h = mo1779d();
                parcel2.writeNoException();
                uc.m6694a(parcel2, h);
                break;
            case 7:
                a = mo1780e();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 8:
                a = mo1781f();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 9:
                Parcelable i3 = mo1784i();
                parcel2.writeNoException();
                uc.m6699b(parcel2, i3);
                break;
            case 10:
                mo1786n();
                parcel2.writeNoException();
                break;
            case 11:
                h = mo1782g();
                parcel2.writeNoException();
                uc.m6694a(parcel2, h);
                break;
            case 12:
                mo1775a((Bundle) uc.m6693a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                boolean b2 = mo1776b((Bundle) uc.m6693a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                uc.m6696a(parcel2, b2);
                break;
            case 14:
                mo1778c((Bundle) uc.m6693a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                h = mo1785j();
                parcel2.writeNoException();
                uc.m6694a(parcel2, h);
                break;
            default:
                return false;
        }
        return true;
    }
}
