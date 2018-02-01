package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

public final class C1500a extends C1499h {
    public static Account m3816a(C1498g c1498g) {
        Account account = null;
        if (c1498g != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = c1498g.mo1653a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public final Account mo1653a() {
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
