package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import java.io.InputStream;

@aqv
public final class zzib extends zzbcc {
    public static final Creator<zzib> CREATOR = new zc();
    private ParcelFileDescriptor f7731a;

    public zzib() {
        this(null);
    }

    public zzib(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7731a = parcelFileDescriptor;
    }

    private synchronized ParcelFileDescriptor m7099c() {
        return this.f7731a;
    }

    public final synchronized boolean m7100a() {
        return this.f7731a != null;
    }

    public final synchronized InputStream m7101b() {
        InputStream inputStream = null;
        synchronized (this) {
            if (this.f7731a != null) {
                inputStream = new AutoCloseInputStream(this.f7731a);
                this.f7731a = null;
            }
        }
        return inputStream;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = li.m5954a(parcel, 20293);
        li.m5960a(parcel, 2, m7099c(), i);
        li.m5967b(parcel, a);
    }
}
