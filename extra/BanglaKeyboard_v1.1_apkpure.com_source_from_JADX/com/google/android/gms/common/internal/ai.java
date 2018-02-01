package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.lg;

public final class ai implements Creator<zzy> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        zzc[] com_google_android_gms_common_zzcArr = null;
        int a = lg.m5937a(parcel);
        Account account = null;
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = lg.m5944d(parcel, readInt);
                    break;
                case 2:
                    i2 = lg.m5944d(parcel, readInt);
                    break;
                case 3:
                    i = lg.m5944d(parcel, readInt);
                    break;
                case 4:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 5:
                    iBinder = lg.m5948h(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) lg.m5942b(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = lg.m5949i(parcel, readInt);
                    break;
                case 8:
                    account = (Account) lg.m5939a(parcel, readInt, Account.CREATOR);
                    break;
                case 10:
                    com_google_android_gms_common_zzcArr = (zzc[]) lg.m5942b(parcel, readInt, zzc.CREATOR);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzy(i3, i2, i, str, iBinder, scopeArr, bundle, account, com_google_android_gms_common_zzcArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzy[i];
    }
}
