package com.google.android.gms.internal;

public enum of implements tb {
    UNKNOWN_CURVE(0),
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    
    private static final td<of> f6829g = null;
    private final int f6831h;

    static {
        f6829g = new og();
    }

    private of(int i) {
        this.f6831h = i;
    }

    public static of m6220a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CURVE;
            case 1:
                return NIST_P224;
            case 2:
                return NIST_P256;
            case 3:
                return NIST_P384;
            case 4:
                return NIST_P521;
            default:
                return null;
        }
    }

    public final int m6221a() {
        if (this != UNRECOGNIZED) {
            return this.f6831h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
