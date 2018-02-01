package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzbwa extends zzbcc {
    public static final Creator<zzbwa> CREATOR = new lz();
    private int f7714a;
    private kz f7715b = null;
    private byte[] f7716c;

    zzbwa(int i, byte[] bArr) {
        this.f7714a = i;
        this.f7716c = bArr;
        m7093b();
    }

    private final void m7093b() {
        if (this.f7715b == null && this.f7716c != null) {
            return;
        }
        if (this.f7715b != null && this.f7716c == null) {
            return;
        }
        if (this.f7715b != null && this.f7716c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f7715b == null && this.f7716c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final kz m7094a() {
        if ((this.f7715b != null ? 1 : null) == null) {
            try {
                byte[] bArr = this.f7716c;
                this.f7715b = (kz) vb.m5894a(new kz(), bArr, bArr.length);
                this.f7716c = null;
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        m7093b();
        return this.f7715b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5956a(parcel, 1, this.f7714a);
        li.m5964a(parcel, 2, this.f7716c != null ? this.f7716c : vb.m5895a(this.f7715b));
        li.m5967b(parcel, a);
    }
}
