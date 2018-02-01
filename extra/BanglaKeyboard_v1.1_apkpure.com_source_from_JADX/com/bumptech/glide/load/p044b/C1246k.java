package com.bumptech.glide.load.p044b;

import com.bumptech.glide.load.C1145c;
import java.security.MessageDigest;

final class C1246k implements C1145c {
    private final String f3635a;
    private final C1145c f3636b;

    public C1246k(String str, C1145c c1145c) {
        this.f3635a = str;
        this.f3636b = c1145c;
    }

    public final void mo1320a(MessageDigest messageDigest) {
        messageDigest.update(this.f3635a.getBytes("UTF-8"));
        this.f3636b.mo1320a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1246k c1246k = (C1246k) obj;
        return !this.f3635a.equals(c1246k.f3635a) ? false : this.f3636b.equals(c1246k.f3636b);
    }

    public final int hashCode() {
        return (this.f3635a.hashCode() * 31) + this.f3636b.hashCode();
    }
}
