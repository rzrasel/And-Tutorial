package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class C1523k extends C1497i {
    private static final WeakReference<byte[]> f4623b = new WeakReference(null);
    private WeakReference<byte[]> f4624a = f4623b;

    C1523k(byte[] bArr) {
        super(bArr);
    }

    final byte[] mo1663c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f4624a.get();
            if (bArr == null) {
                bArr = mo1664d();
                this.f4624a = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] mo1664d();
}
