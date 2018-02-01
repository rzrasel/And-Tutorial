package com.google.android.gms.internal;

public enum pf implements tb {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    UNRECOGNIZED(-1);
    
    private static final td<pf> f6954f = null;
    private final int f6956g;

    static {
        f6954f = new pg();
    }

    private pf(int i) {
        this.f6956g = i;
    }

    public static pf m6378a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PREFIX;
            case 1:
                return TINK;
            case 2:
                return LEGACY;
            case 3:
                return RAW;
            default:
                return null;
        }
    }

    public final int m6379a() {
        if (this != UNRECOGNIZED) {
            return this.f6956g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
