package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class cw {
    private static Comparator<byte[]> f5884e = new dv();
    private List<byte[]> f5885a = new LinkedList();
    private List<byte[]> f5886b = new ArrayList(64);
    private int f5887c = 0;
    private final int f5888d;

    public cw(int i) {
        this.f5888d = i;
    }

    private final synchronized void m5222a() {
        while (this.f5887c > this.f5888d) {
            byte[] bArr = (byte[]) this.f5885a.remove(0);
            this.f5886b.remove(bArr);
            this.f5887c -= bArr.length;
        }
    }

    public final synchronized void m5223a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f5888d) {
                this.f5885a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f5886b, bArr, f5884e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f5886b.add(binarySearch, bArr);
                this.f5887c += bArr.length;
                m5222a();
            }
        }
    }

    public final synchronized byte[] m5224a(int i) {
        byte[] bArr;
        for (int i2 = 0; i2 < this.f5886b.size(); i2++) {
            bArr = (byte[]) this.f5886b.get(i2);
            if (bArr.length >= i) {
                this.f5887c -= bArr.length;
                this.f5886b.remove(i2);
                this.f5885a.remove(bArr);
                break;
            }
        }
        bArr = new byte[i];
        return bArr;
    }
}
