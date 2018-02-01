package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C1496k;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.zzbcc;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1401c;

public final class zzm extends zzbcc {
    public static final Creator<zzm> CREATOR = new C1527o();
    private final String f4663a;
    private final C1497i f4664b;
    private final boolean f4665c;

    zzm(String str, IBinder iBinder, boolean z) {
        this.f4663a = str;
        this.f4664b = m3949a(iBinder);
        this.f4665c = z;
    }

    private static C1497i m3949a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            C1398a a = C1496k.m3810a(iBinder).mo1651a();
            byte[] bArr = a == null ? null : (byte[]) C1401c.m3585a(a);
            return bArr != null ? new C1522j(bArr) : null;
        } catch (RemoteException e) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = li.m5954a(parcel, 20293);
        li.m5961a(parcel, 1, this.f4663a);
        if (this.f4664b == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = this.f4664b.asBinder();
        }
        li.m5959a(parcel, 2, iBinder);
        li.m5963a(parcel, 3, this.f4665c);
        li.m5967b(parcel, a);
    }
}
