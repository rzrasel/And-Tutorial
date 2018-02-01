package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C1537f;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;

@aqv
public final class zzaba extends zzbcc {
    public static final Creator<zzaba> CREATOR = new aa();
    private ParcelFileDescriptor f7683a;
    private Parcelable f7684b;
    private boolean f7685c;

    zzaba(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7683a = parcelFileDescriptor;
        this.f7684b = null;
        this.f7685c = true;
    }

    public zzaba(zzbcg com_google_android_gms_internal_zzbcg) {
        this.f7683a = null;
        this.f7684b = com_google_android_gms_internal_zzbcg;
        this.f7685c = false;
    }

    private static <T> ParcelFileDescriptor m7088a(byte[] bArr) {
        Closeable autoCloseOutputStream;
        Throwable e;
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new C1659z(autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = parcelFileDescriptor;
            id.m5372a(6);
            zzbv.zzee().m5336a(e, "LargeParcelTeleporter.pipeData.2");
            C1537f.m3940a(autoCloseOutputStream);
            return parcelFileDescriptor;
        }
    }

    public final <T extends zzbcg> T m7089a(Creator<T> creator) {
        if (this.f7685c) {
            if (this.f7683a == null) {
                id.m5372a(6);
                return null;
            }
            Closeable dataInputStream = new DataInputStream(new AutoCloseInputStream(this.f7683a));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                C1537f.m3940a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.f7684b = (zzbcg) creator.createFromParcel(obtain);
                    this.f7685c = false;
                } finally {
                    obtain.recycle();
                }
            } catch (Throwable e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                C1537f.m3940a(dataInputStream);
            }
        }
        return (zzbcg) this.f7684b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f7683a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f7684b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                this.f7683a = m7088a(marshall);
            } finally {
                obtain.recycle();
            }
        }
        int a = li.m5954a(parcel, 20293);
        li.m5960a(parcel, 2, this.f7683a, i);
        li.m5967b(parcel, a);
    }
}
