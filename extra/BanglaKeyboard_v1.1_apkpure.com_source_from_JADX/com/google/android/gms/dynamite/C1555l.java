package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.sd;
import com.google.android.gms.internal.uc;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;

public final class C1555l extends sd implements C1554k {
    C1555l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int mo1675a(C1398a c1398a, String str, boolean z) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeString(str);
        uc.m6696a(b_, z);
        b_ = m3582a(3, b_);
        int readInt = b_.readInt();
        b_.recycle();
        return readInt;
    }

    public final C1398a mo1676a(C1398a c1398a, String str, int i) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeString(str);
        b_.writeInt(i);
        b_ = m3582a(2, b_);
        C1398a a = C1399a.m3581a(b_.readStrongBinder());
        b_.recycle();
        return a;
    }
}
