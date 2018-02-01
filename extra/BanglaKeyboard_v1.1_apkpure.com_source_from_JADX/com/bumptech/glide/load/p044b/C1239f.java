package com.bumptech.glide.load.p044b;

import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.load.C1249b;
import com.bumptech.glide.load.C1299g;
import com.bumptech.glide.load.C1301e;
import com.bumptech.glide.load.C1302f;
import com.bumptech.glide.load.resource.p055e.C1368c;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class C1239f implements C1145c {
    private final String f3608a;
    private final int f3609b;
    private final int f3610c;
    private final C1301e f3611d;
    private final C1301e f3612e;
    private final C1299g f3613f;
    private final C1302f f3614g;
    private final C1368c f3615h;
    private final C1249b f3616i;
    private final C1145c f3617j;
    private String f3618k;
    private int f3619l;
    private C1145c f3620m;

    public C1239f(String str, C1145c c1145c, int i, int i2, C1301e c1301e, C1301e c1301e2, C1299g c1299g, C1302f c1302f, C1368c c1368c, C1249b c1249b) {
        this.f3608a = str;
        this.f3617j = c1145c;
        this.f3609b = i;
        this.f3610c = i2;
        this.f3611d = c1301e;
        this.f3612e = c1301e2;
        this.f3613f = c1299g;
        this.f3614g = c1302f;
        this.f3615h = c1368c;
        this.f3616i = c1249b;
    }

    public final C1145c m3325a() {
        if (this.f3620m == null) {
            this.f3620m = new C1246k(this.f3608a, this.f3617j);
        }
        return this.f3620m;
    }

    public final void mo1320a(MessageDigest messageDigest) {
        byte[] array = ByteBuffer.allocate(8).putInt(this.f3609b).putInt(this.f3610c).array();
        this.f3617j.mo1320a(messageDigest);
        messageDigest.update(this.f3608a.getBytes("UTF-8"));
        messageDigest.update(array);
        messageDigest.update((this.f3611d != null ? this.f3611d.mo1382a() : "").getBytes("UTF-8"));
        messageDigest.update((this.f3612e != null ? this.f3612e.mo1382a() : "").getBytes("UTF-8"));
        messageDigest.update((this.f3613f != null ? this.f3613f.mo1380a() : "").getBytes("UTF-8"));
        messageDigest.update((this.f3614g != null ? this.f3614g.mo1376a() : "").getBytes("UTF-8"));
        messageDigest.update((this.f3616i != null ? this.f3616i.mo1376a() : "").getBytes("UTF-8"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1239f c1239f = (C1239f) obj;
        if (!this.f3608a.equals(c1239f.f3608a) || !this.f3617j.equals(c1239f.f3617j) || this.f3610c != c1239f.f3610c || this.f3609b != c1239f.f3609b) {
            return false;
        }
        if (((this.f3613f == null ? 1 : 0) ^ (c1239f.f3613f == null ? 1 : 0)) != 0) {
            return false;
        }
        if (this.f3613f != null && !this.f3613f.mo1380a().equals(c1239f.f3613f.mo1380a())) {
            return false;
        }
        if (((this.f3612e == null ? 1 : 0) ^ (c1239f.f3612e == null ? 1 : 0)) != 0) {
            return false;
        }
        if (this.f3612e != null && !this.f3612e.mo1382a().equals(c1239f.f3612e.mo1382a())) {
            return false;
        }
        if (((this.f3611d == null ? 1 : 0) ^ (c1239f.f3611d == null ? 1 : 0)) != 0) {
            return false;
        }
        if (this.f3611d != null && !this.f3611d.mo1382a().equals(c1239f.f3611d.mo1382a())) {
            return false;
        }
        if (((this.f3614g == null ? 1 : 0) ^ (c1239f.f3614g == null ? 1 : 0)) != 0) {
            return false;
        }
        if (this.f3614g != null && !this.f3614g.mo1376a().equals(c1239f.f3614g.mo1376a())) {
            return false;
        }
        if (((this.f3615h == null ? 1 : 0) ^ (c1239f.f3615h == null ? 1 : 0)) != 0) {
            return false;
        }
        if (this.f3615h != null && !this.f3615h.mo1390a().equals(c1239f.f3615h.mo1390a())) {
            return false;
        }
        return ((this.f3616i == null ? 1 : 0) ^ (c1239f.f3616i == null ? 1 : 0)) == 0 ? this.f3616i == null || this.f3616i.mo1376a().equals(c1239f.f3616i.mo1376a()) : false;
    }

    public final int hashCode() {
        int i = 0;
        if (this.f3619l == 0) {
            this.f3619l = this.f3608a.hashCode();
            this.f3619l = (this.f3619l * 31) + this.f3617j.hashCode();
            this.f3619l = (this.f3619l * 31) + this.f3609b;
            this.f3619l = (this.f3619l * 31) + this.f3610c;
            this.f3619l = (this.f3611d != null ? this.f3611d.mo1382a().hashCode() : 0) + (this.f3619l * 31);
            this.f3619l = (this.f3612e != null ? this.f3612e.mo1382a().hashCode() : 0) + (this.f3619l * 31);
            this.f3619l = (this.f3613f != null ? this.f3613f.mo1380a().hashCode() : 0) + (this.f3619l * 31);
            this.f3619l = (this.f3614g != null ? this.f3614g.mo1376a().hashCode() : 0) + (this.f3619l * 31);
            this.f3619l = (this.f3615h != null ? this.f3615h.mo1390a().hashCode() : 0) + (this.f3619l * 31);
            int i2 = this.f3619l * 31;
            if (this.f3616i != null) {
                i = this.f3616i.mo1376a().hashCode();
            }
            this.f3619l = i2 + i;
        }
        return this.f3619l;
    }

    public final String toString() {
        if (this.f3618k == null) {
            this.f3618k = "EngineKey{" + this.f3608a + '+' + this.f3617j + "+[" + this.f3609b + 'x' + this.f3610c + "]+'" + (this.f3611d != null ? this.f3611d.mo1382a() : "") + '\'' + '+' + '\'' + (this.f3612e != null ? this.f3612e.mo1382a() : "") + '\'' + '+' + '\'' + (this.f3613f != null ? this.f3613f.mo1380a() : "") + '\'' + '+' + '\'' + (this.f3614g != null ? this.f3614g.mo1376a() : "") + '\'' + '+' + '\'' + (this.f3615h != null ? this.f3615h.mo1390a() : "") + '\'' + '+' + '\'' + (this.f3616i != null ? this.f3616i.mo1376a() : "") + '\'' + '}';
        }
        return this.f3618k;
    }
}
