package com.google.android.gms.internal;

public enum od implements tb {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);
    
    private static final td<od> f6820e = null;
    private final int f6822f;

    static {
        f6820e = new oe();
    }

    private od(int i) {
        this.f6822f = i;
    }

    public static od m6218a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return UNCOMPRESSED;
            case 2:
                return COMPRESSED;
            default:
                return null;
        }
    }

    public final int m6219a() {
        if (this != UNRECOGNIZED) {
            return this.f6822f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
