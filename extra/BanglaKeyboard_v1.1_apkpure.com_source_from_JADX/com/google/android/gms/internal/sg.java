package com.google.android.gms.internal;

class sg extends sf {
    protected final byte[] f7074c;

    sg(byte[] bArr) {
        this.f7074c = bArr;
    }

    public byte mo2238a(int i) {
        return this.f7074c[i];
    }

    public int mo2239a() {
        return this.f7074c.length;
    }

    protected final int mo2240a(int i, int i2) {
        return ta.m6655a(i, this.f7074c, mo2247e(), i2);
    }

    final void mo2241a(rx rxVar) {
        rxVar.mo2271a(this.f7074c, mo2247e(), mo2239a());
    }

    protected void mo2242a(byte[] bArr, int i) {
        System.arraycopy(this.f7074c, 0, bArr, 0, i);
    }

    final boolean mo2243a(ry ryVar, int i) {
        if (i > ryVar.mo2239a()) {
            throw new IllegalArgumentException("Length too large: " + i + mo2239a());
        } else if (i + 0 > ryVar.mo2239a()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i + ", " + ryVar.mo2239a());
        } else if (!(ryVar instanceof sg)) {
            return ryVar.mo2244b(i + 0).equals(mo2244b(i));
        } else {
            sg sgVar = (sg) ryVar;
            byte[] bArr = this.f7074c;
            byte[] bArr2 = sgVar.f7074c;
            int e = mo2247e() + i;
            int e2 = mo2247e();
            int e3 = sgVar.mo2247e();
            while (e2 < e) {
                if (bArr[e2] != bArr2[e3]) {
                    return false;
                }
                e2++;
                e3++;
            }
            return true;
        }
    }

    public final ry mo2244b(int i) {
        int a = ry.m6515a(0, i, mo2239a());
        return a == 0 ? ry.f7068a : new sb(this.f7074c, mo2247e() + 0, a);
    }

    public final si mo2245d() {
        return si.m6552a(this.f7074c, mo2247e(), mo2239a(), true);
    }

    protected int mo2247e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ry)) {
            return false;
        }
        if (mo2239a() != ((ry) obj).mo2239a()) {
            return false;
        }
        if (mo2239a() == 0) {
            return true;
        }
        if (!(obj instanceof sg)) {
            return obj.equals(this);
        }
        sg sgVar = (sg) obj;
        int i = this.f7070b;
        int i2 = sgVar.f7070b;
        return (i == 0 || i2 == 0 || i == i2) ? mo2243a((sg) obj, mo2239a()) : false;
    }
}
