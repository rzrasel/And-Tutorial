package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p007a.C0201k;
import com.google.android.gms.p007a.C0202l;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public abstract class mg extends Binder implements mf {
    public static mf m2613a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof mf)) ? new mh(iBinder) : (mf) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        switch (i) {
            case 1:
                mc mcVar;
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                C0204n a = C0205o.m862a(parcel.readStrongBinder());
                C0201k a2 = C0202l.m835a(parcel.readStrongBinder());
                WalletFragmentOptions walletFragmentOptions = parcel.readInt() != 0 ? (WalletFragmentOptions) WalletFragmentOptions.CREATOR.createFromParcel(parcel) : null;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    mcVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
                    mcVar = (queryLocalInterface == null || !(queryLocalInterface instanceof mc)) ? new me(readStrongBinder) : (mc) queryLocalInterface;
                }
                lx a3 = mo963a(a, a2, walletFragmentOptions, mcVar);
                parcel2.writeNoException();
                if (a3 != null) {
                    iBinder = a3.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
