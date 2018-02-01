package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@aqv
public final class yo extends yj {
    private MessageDigest f7516b;

    public final byte[] mo2331a(String str) {
        byte[] array;
        int i = 0;
        String[] split = str.split(" ");
        int a;
        if (split.length == 1) {
            a = yn.m7036a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a);
            array = allocate.array();
        } else if (split.length < 5) {
            byte[] bArr = new byte[(split.length << 1)];
            for (a = 0; a < split.length; a++) {
                int a2 = yn.m7036a(split[a]);
                a2 = (a2 >> 16) ^ (65535 & a2);
                byte[] bArr2 = new byte[]{(byte) a2, (byte) (a2 >> 8)};
                bArr[a << 1] = bArr2[0];
                bArr[(a << 1) + 1] = bArr2[1];
            }
            array = bArr;
        } else {
            array = new byte[split.length];
            while (i < split.length) {
                int a3 = yn.m7036a(split[i]);
                array[i] = (byte) ((a3 >> 24) ^ (((a3 & 255) ^ ((a3 >> 8) & 255)) ^ ((a3 >> 16) & 255)));
                i++;
            }
        }
        this.f7516b = m7031a();
        synchronized (this.a) {
            if (this.f7516b == null) {
                array = new byte[0];
            } else {
                this.f7516b.reset();
                this.f7516b.update(array);
                Object digest = this.f7516b.digest();
                array = new byte[(digest.length > 4 ? 4 : digest.length)];
                System.arraycopy(digest, 0, array, 0, array.length);
            }
        }
        return array;
    }
}
