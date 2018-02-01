package com.google.android.gms.internal;

import android.os.Parcel;

public abstract class aar extends tc implements aaq {
    public aar() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo1688a();
                break;
            case 2:
                mo1689a(parcel.readInt());
                break;
            case 3:
                mo1690b();
                break;
            case 4:
                mo1691c();
                break;
            case 5:
                mo1692d();
                break;
            case 6:
                mo1693e();
                break;
            case 7:
                mo1694f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
