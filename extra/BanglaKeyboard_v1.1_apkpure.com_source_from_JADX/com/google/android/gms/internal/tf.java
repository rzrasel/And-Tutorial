package com.google.android.gms.internal;

import java.io.IOException;

public class tf extends IOException {
    tl f7130a = null;

    public tf(String str) {
        super(str);
    }

    static tf m6657a() {
        return new tf("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static tf m6658b() {
        return new tf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static tf m6659c() {
        return new tf("CodedInputStream encountered a malformed varint.");
    }

    static tf m6660d() {
        return new tf("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
