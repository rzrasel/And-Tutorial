package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.sd;
import com.google.android.gms.internal.uc;
import com.google.android.gms.p056a.C1398a;
import com.google.android.gms.p056a.C1398a.C1399a;

public final class C1557n extends sd implements C1556m {
    C1557n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final C1398a mo1677a(C1398a c1398a, String str, int i, C1398a c1398a2) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        b_.writeString(str);
        b_.writeInt(i);
        uc.m6694a(b_, (IInterface) c1398a2);
        b_ = m3582a(2, b_);
        C1398a a = C1399a.m3581a(b_.readStrongBinder());
        b_.recycle();
        return a;
    }
}
