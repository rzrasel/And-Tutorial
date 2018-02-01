package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class my implements Creator<zzcmw> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = lg.m5937a(parcel);
        byte[][] bArr = null;
        int[] iArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        byte[] bArr6 = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = lg.m5947g(parcel, readInt);
                    break;
                case 3:
                    bArr6 = lg.m5950j(parcel, readInt);
                    break;
                case 4:
                    bArr5 = lg.m5951k(parcel, readInt);
                    break;
                case 5:
                    bArr4 = lg.m5951k(parcel, readInt);
                    break;
                case 6:
                    bArr3 = lg.m5951k(parcel, readInt);
                    break;
                case 7:
                    bArr2 = lg.m5951k(parcel, readInt);
                    break;
                case 8:
                    readInt = lg.m5938a(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (readInt != 0) {
                        iArr = parcel.createIntArray();
                        parcel.setDataPosition(readInt + dataPosition);
                        break;
                    }
                    iArr = null;
                    break;
                case 9:
                    bArr = lg.m5951k(parcel, readInt);
                    break;
                default:
                    lg.m5941b(parcel, readInt);
                    break;
            }
        }
        lg.m5953m(parcel, a);
        return new zzcmw(str, bArr6, bArr5, bArr4, bArr3, bArr2, iArr, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcmw[i];
    }
}
