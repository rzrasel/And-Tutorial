package com.google.android.gms.internal;

final class uh {
    private static final ui f7190a;

    static {
        Object obj = (uf.m6720a() && uf.m6724b()) ? 1 : null;
        f7190a = obj != null ? new ul() : new uj();
    }

    static int m6736a(CharSequence charSequence) {
        int i = 0;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < '') {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt < 'ࠀ') {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 'ࠀ') {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if ('?' <= charAt2 && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new uk(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i2 = i3 + i;
                if (i2 < length) {
                    return i2;
                }
                throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
            }
        }
        i2 = i3;
        if (i2 < length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
    }

    static int m6737a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f7190a.mo2293a(charSequence, bArr, i, i2);
    }

    public static boolean m6738a(byte[] bArr, int i, int i2) {
        return f7190a.mo2294a(bArr, i, i2) == 0;
    }

    private static int m6739b(int i) {
        return i > -12 ? -1 : i;
    }

    private static int m6740b(int i, int i2) {
        return (i > -12 || i2 > -65) ? -1 : (i2 << 8) ^ i;
    }

    private static int m6741b(int i, int i2, int i3) {
        return (i > -12 || i2 > -65 || i3 > -65) ? -1 : ((i2 << 8) ^ i) ^ (i3 << 16);
    }

    static /* synthetic */ int m6742b(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m6739b(i3);
            case 1:
                return m6740b(i3, bArr[i]);
            case 2:
                return m6741b(i3, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }
}
