package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class ame extends sd implements amc {
    ame(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public final amf mo1893a(String str) {
        amf com_google_android_gms_internal_amf;
        Parcel b_ = b_();
        b_.writeString(str);
        Parcel a = m3582a(1, b_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            com_google_android_gms_internal_amf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            com_google_android_gms_internal_amf = queryLocalInterface instanceof amf ? (amf) queryLocalInterface : new amh(readStrongBinder);
        }
        a.recycle();
        return com_google_android_gms_internal_amf;
    }

    public final boolean mo1894b(String str) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_ = m3582a(2, b_);
        boolean a = uc.m6697a(b_);
        b_.recycle();
        return a;
    }
}
