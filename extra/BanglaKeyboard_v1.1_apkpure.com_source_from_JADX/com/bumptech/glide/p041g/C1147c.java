package com.bumptech.glide.p041g;

import com.bumptech.glide.load.C1145c;
import java.security.MessageDigest;

public final class C1147c implements C1145c {
    private final String f3416a;

    public C1147c(String str) {
        if (str == null) {
            throw new NullPointerException("Signature cannot be null!");
        }
        this.f3416a = str;
    }

    public final void mo1320a(MessageDigest messageDigest) {
        messageDigest.update(this.f3416a.getBytes("UTF-8"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f3416a.equals(((C1147c) obj).f3416a);
    }

    public final int hashCode() {
        return this.f3416a.hashCode();
    }

    public final String toString() {
        return "StringSignature{signature='" + this.f3416a + '\'' + '}';
    }
}
