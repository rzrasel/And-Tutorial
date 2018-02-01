package com.bumptech.glide.p042h;

import android.util.Log;
import java.util.Queue;

public final class C1155a {
    private static final C1155a f3434b = new C1155a();
    private final Queue<byte[]> f3435a = C1163h.m3153a(0);

    private C1155a() {
    }

    public static C1155a m3131a() {
        return f3434b;
    }

    public final boolean m3132a(byte[] bArr) {
        boolean z = false;
        if (bArr.length == 65536) {
            synchronized (this.f3435a) {
                if (this.f3435a.size() < 32) {
                    z = true;
                    this.f3435a.offer(bArr);
                }
            }
        }
        return z;
    }

    public final byte[] m3133b() {
        synchronized (this.f3435a) {
            byte[] bArr = (byte[]) this.f3435a.poll();
        }
        if (bArr != null) {
            return bArr;
        }
        bArr = new byte[65536];
        Log.isLoggable("ByteArrayPool", 3);
        return bArr;
    }
}
