package com.google.android.gms.internal;

public enum pc implements tb {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    private static final td<pc> f6945f = null;
    private final int f6947g;

    static {
        f6945f = new pe();
    }

    private pc(int i) {
        this.f6947g = i;
    }

    public static pc m6369a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return ENABLED;
            case 2:
                return DISABLED;
            case 3:
                return DESTROYED;
            default:
                return null;
        }
    }

    public final int m6370a() {
        if (this != UNRECOGNIZED) {
            return this.f6947g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
