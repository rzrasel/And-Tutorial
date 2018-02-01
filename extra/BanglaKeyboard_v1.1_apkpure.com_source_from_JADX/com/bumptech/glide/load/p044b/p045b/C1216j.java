package com.bumptech.glide.load.p044b.p045b;

import com.bumptech.glide.load.C1145c;
import com.bumptech.glide.p042h.C1159e;
import com.bumptech.glide.p042h.C1163h;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class C1216j {
    private final C1159e<C1145c, String> f3550a = new C1159e(1000);

    C1216j() {
    }

    public final String m3301a(C1145c c1145c) {
        String str;
        synchronized (this.f3550a) {
            str = (String) this.f3550a.m3143b((Object) c1145c);
        }
        if (str == null) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                c1145c.mo1320a(instance);
                str = C1163h.m3151a(instance.digest());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
            synchronized (this.f3550a) {
                this.f3550a.m3144b(c1145c, str);
            }
        }
        return str;
    }
}
