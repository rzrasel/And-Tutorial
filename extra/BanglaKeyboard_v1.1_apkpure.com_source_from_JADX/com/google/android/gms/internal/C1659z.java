package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C1537f;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class C1659z implements Runnable {
    private /* synthetic */ OutputStream f7540a;
    private /* synthetic */ byte[] f7541b;

    C1659z(OutputStream outputStream, byte[] bArr) {
        this.f7540a = outputStream;
        this.f7541b = bArr;
    }

    public final void run() {
        Closeable dataOutputStream;
        Throwable e;
        try {
            dataOutputStream = new DataOutputStream(this.f7540a);
            try {
                dataOutputStream.writeInt(this.f7541b.length);
                dataOutputStream.write(this.f7541b);
                C1537f.m3940a(dataOutputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    id.m5372a(6);
                    zzbv.zzee().m5336a(e, "LargeParcelTeleporter.pipeData.1");
                    if (dataOutputStream != null) {
                        C1537f.m3940a(this.f7540a);
                    } else {
                        C1537f.m3940a(dataOutputStream);
                    }
                } catch (Throwable th) {
                    e = th;
                    if (dataOutputStream != null) {
                        C1537f.m3940a(dataOutputStream);
                    } else {
                        C1537f.m3940a(this.f7540a);
                    }
                    throw e;
                }
            }
        } catch (IOException e3) {
            e = e3;
            dataOutputStream = null;
            id.m5372a(6);
            zzbv.zzee().m5336a(e, "LargeParcelTeleporter.pipeData.1");
            if (dataOutputStream != null) {
                C1537f.m3940a(dataOutputStream);
            } else {
                C1537f.m3940a(this.f7540a);
            }
        } catch (Throwable th2) {
            e = th2;
            dataOutputStream = null;
            if (dataOutputStream != null) {
                C1537f.m3940a(this.f7540a);
            } else {
                C1537f.m3940a(dataOutputStream);
            }
            throw e;
        }
    }
}
