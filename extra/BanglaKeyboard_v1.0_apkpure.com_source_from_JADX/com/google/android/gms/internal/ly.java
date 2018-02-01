package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p007a.C0204n;
import com.google.android.gms.p007a.C0205o;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public abstract class ly extends Binder implements lx {
    public static lx m2575a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof lx)) ? new lz(iBinder) : (lx) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                mo946a(C0205o.m862a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (WalletFragmentOptions) WalletFragmentOptions.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                mo945a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                C0204n a = mo942a(C0205o.m862a(parcel.readStrongBinder()), C0205o.m862a(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a != null) {
                    iBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case 4:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                mo943a();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                mo950b();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                mo952c();
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                mo953d();
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                mo951b(bundle);
                parcel2.writeNoException();
                if (bundle != null) {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 9:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                mo944a(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                mo948a(parcel.readInt() != 0 ? (WalletFragmentInitParams) WalletFragmentInitParams.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 11:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                mo947a(parcel.readInt() != 0 ? (MaskedWalletRequest) MaskedWalletRequest.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                mo949a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 13:
                parcel.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                int e = mo954e();
                parcel2.writeNoException();
                parcel2.writeInt(e);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
