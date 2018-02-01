package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p007a.C0201k;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

final class mh implements mf {
    private IBinder f1948a;

    mh(IBinder iBinder) {
        this.f1948a = iBinder;
    }

    public final lx mo963a(C0204n c0204n, C0201k c0201k, WalletFragmentOptions walletFragmentOptions, mc mcVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            obtain.writeStrongBinder(c0204n != null ? c0204n.asBinder() : null);
            obtain.writeStrongBinder(c0201k != null ? c0201k.asBinder() : null);
            if (walletFragmentOptions != null) {
                obtain.writeInt(1);
                walletFragmentOptions.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (mcVar != null) {
                iBinder = mcVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f1948a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            lx a = ly.m2575a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1948a;
    }
}
