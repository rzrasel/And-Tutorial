package com.google.android.gms.internal;

import java.io.IOException;

public final class va extends IOException {
    public va(String str) {
        super(str);
    }

    static va m6806a() {
        return new va("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static va m6807b() {
        return new va("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static va m6808c() {
        return new va("CodedInputStream encountered a malformed varint.");
    }

    static va m6809d() {
        return new va("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
