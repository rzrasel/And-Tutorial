package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p056a.C1398a;

public final class lu extends sd implements ls {
    lu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    public final boolean getBooleanFlagValue(String str, boolean z, int i) {
        Parcel b_ = b_();
        b_.writeString(str);
        uc.m6696a(b_, z);
        b_.writeInt(i);
        b_ = m3582a(2, b_);
        boolean a = uc.m6697a(b_);
        b_.recycle();
        return a;
    }

    public final int getIntFlagValue(String str, int i, int i2) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeInt(i);
        b_.writeInt(i2);
        b_ = m3582a(3, b_);
        int readInt = b_.readInt();
        b_.recycle();
        return readInt;
    }

    public final long getLongFlagValue(String str, long j, int i) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeLong(j);
        b_.writeInt(i);
        b_ = m3582a(4, b_);
        long readLong = b_.readLong();
        b_.recycle();
        return readLong;
    }

    public final String getStringFlagValue(String str, String str2, int i) {
        Parcel b_ = b_();
        b_.writeString(str);
        b_.writeString(str2);
        b_.writeInt(i);
        b_ = m3582a(5, b_);
        String readString = b_.readString();
        b_.recycle();
        return readString;
    }

    public final void init(C1398a c1398a) {
        Parcel b_ = b_();
        uc.m6694a(b_, (IInterface) c1398a);
        m3583b(1, b_);
    }
}
