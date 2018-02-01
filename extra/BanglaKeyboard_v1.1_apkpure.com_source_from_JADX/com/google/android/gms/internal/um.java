package com.google.android.gms.internal;

public enum um {
    DOUBLE(ur.DOUBLE, 1),
    FLOAT(ur.FLOAT, 5),
    INT64(ur.LONG, 0),
    UINT64(ur.LONG, 0),
    INT32(ur.INT, 0),
    FIXED64(ur.LONG, 1),
    FIXED32(ur.INT, 5),
    BOOL(ur.BOOLEAN, 0),
    STRING,
    GROUP,
    MESSAGE,
    BYTES,
    UINT32(ur.INT, 0),
    ENUM(ur.ENUM, 0),
    SFIXED32(ur.INT, 5),
    SFIXED64(ur.LONG, 1),
    SINT32(ur.INT, 0),
    SINT64(ur.LONG, 0);
    
    final ur f7210s;
    private final int f7211t;

    private um(ur urVar, int i) {
        this.f7210s = urVar;
        this.f7211t = i;
    }
}
