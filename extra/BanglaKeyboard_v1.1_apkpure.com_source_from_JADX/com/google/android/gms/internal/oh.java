package com.google.android.gms.internal;

public enum oh implements tb {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA224(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    private static final td<oh> f6838g = null;
    private final int f6840h;

    static {
        f6838g = new oi();
    }

    private oh(int i) {
        this.f6840h = i;
    }

    public static oh m6222a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_HASH;
            case 1:
                return SHA1;
            case 2:
                return SHA224;
            case 3:
                return SHA256;
            case 4:
                return SHA512;
            default:
                return null;
        }
    }

    public final int m6223a() {
        if (this != UNRECOGNIZED) {
            return this.f6840h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
