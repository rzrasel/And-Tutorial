package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.sd;
import com.google.android.gms.internal.uc;

public final class C1509i extends sd implements C1498g {
    C1509i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account mo1653a() {
        Parcel a = m3582a(2, b_());
        Account account = (Account) uc.m6693a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
